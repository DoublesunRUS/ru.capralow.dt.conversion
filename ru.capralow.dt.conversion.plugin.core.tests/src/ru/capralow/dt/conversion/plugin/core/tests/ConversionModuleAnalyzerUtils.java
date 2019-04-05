package ru.capralow.dt.conversion.plugin.core.tests;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

import org.eclipse.emf.common.util.EList;

import com.google.common.io.CharSource;
import com.google.common.io.CharStreams;
import com.google.common.io.Resources;

import ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmFactory;

public final class ConversionModuleAnalyzerUtils {
	private static final String LS = System.lineSeparator();

	private static final String ON_SENDING_EVENT_TEXT = "	Сообщить(\"ПриОтправкеДанных\");";
	private static final String BEFORE_RECEIVING_EVENT_TEXT = "	Сообщить(\"ПриКонвертацииДанныхXDTO\");";
	private static final String ON_RECEIVING_EVENT_TEXT = "	Сообщить(\"ПередЗаписьюПолученныхДанных\");";

	private static final String HEAD_ORGANIZATION = "ГоловнаяОрганизация";

	public static CmAlgorithm addAlgorithm(String name, String params, String body, EList<CmAlgorithm> algorithms) {
		if (algorithms != null)
			for (CmAlgorithm algorithm : algorithms)
				if (algorithm.getName().equals(name))
					return algorithm;

		CmAlgorithm algorithm = cmFactory.eINSTANCE.createCmAlgorithm();
		algorithm.setName(name);
		algorithm.setParams(params);
		algorithm.setBody(body);

		return algorithm;
	}

	public static void addEvents(Boolean onSendingEvent, Boolean beforeReceivingEvent, Boolean onReceivingEvent,
			Boolean afterReceivingAlgorithm, CmObjectRule objectRule, EList<CmAlgorithm> algorithms) {
		if (onSendingEvent)
			objectRule.setOnSendingEvent(ON_SENDING_EVENT_TEXT);
		if (beforeReceivingEvent)
			objectRule.setBeforeReceivingEvent(BEFORE_RECEIVING_EVENT_TEXT);
		if (onReceivingEvent)
			objectRule.setOnReceivingEvent(ON_RECEIVING_EVENT_TEXT);
		if (afterReceivingAlgorithm) {
			CmAlgorithm algorithm = addAlgorithm("АлгоритмПослеЗагрузкиВсехДанных",
					"Объект, КомпонентыОбмена, ОбъектМодифицирован", "	Сообщить(\"АлгоритмПослеЗагрузкиВсехДанных\");",
					algorithms);
			objectRule.setAfterReceivingAlgorithm(algorithm);

		}
	}

	public static CmObjectRule addFilledObjectRule(String name, Boolean withConfiguration, Boolean withFormat,
			Boolean forSending, Boolean forReceiving, Boolean forGroup) {
		return addObjectRule(name, withConfiguration ? "Метаданные.Справочники.Организации" : "",
				withFormat ? "Справочник.Организации" : "", forSending, forReceiving, forGroup);
	}

	public static void addHeader(CmObjectRule objectRule) {
		addAttribute("", "КПП", false, "", objectRule);
		addAttribute(HEAD_ORGANIZATION, "", false, "ПКООтправкиОбъектКонфигурации", objectRule);
		addAttribute("ИНН", "", false, "", objectRule);
		addAttribute("Наименование", "Наименование", false, "", objectRule);
		addAttribute("", HEAD_ORGANIZATION, true, "ПКООтправкиОбъектФорматаСПолями", objectRule);
	}

	public static void addIdentificationFields1(CmObjectRule objectRule) {
		objectRule.getIdentificationFields().add("Ссылка");
	}

	public static void addIdentificationFields2(CmObjectRule objectRule) {
		objectRule.getIdentificationFields().add(HEAD_ORGANIZATION);
		objectRule.getIdentificationFields().add("ИНН,Префикс");
	}

	public static void addTabularSection1(CmObjectRule objectRule) {
		addAttribute("ДополнительныеРеквизиты.Свойство", "ДополнительныеРеквизиты.", false, "НесуществующееПравило",
				objectRule);
		addAttribute("ДополнительныеРеквизиты.Значение", "ДополнительныеРеквизиты.ЗначениеСвойства", false, "",
				objectRule);
		addAttribute("ДополнительныеРеквизиты.", "ДополнительныеРеквизиты.ЗначениеСвойства", true,
				"НесуществующееПравило", objectRule);
	}

	public static void addTabularSection2(CmObjectRule objectRule) {
		addAttribute("КонтактнаяИнформация.Вид", "КонтактнаяИнформация.ВидКонтактнойИнформации", false,
				"ВидыКонтактнойИнформации", objectRule);
	}

	public static String getModuleText(String projectName, String moduleName) {
		final String NAME = projectName + "/" + moduleName + ".txt";
		return readContents(getFileInputSupplier(NAME)).replace("\r\n", LS);
	}

	private static void addAttribute(String configurationFullAttribute, String formatFullAttribute, Boolean isCustom,
			String attributeObjectRuleName, CmObjectRule objectRule) {
		CmAttributeRule attributeRule = cmFactory.eINSTANCE.createCmAttributeRule();
		objectRule.getAttributeRules().add(attributeRule);
		attributeRule.setIsCustomRule(isCustom);

		if (!configurationFullAttribute.isEmpty()) {
			String[] arrayConfigurationFullAttribute = configurationFullAttribute.split("[.]", 2);
			if (arrayConfigurationFullAttribute.length == 2) {
				attributeRule.setConfigurationTabularSection(arrayConfigurationFullAttribute[0]);
				attributeRule.setConfigurationAttribute(arrayConfigurationFullAttribute[1]);

			} else {
				attributeRule.setConfigurationAttribute(arrayConfigurationFullAttribute[0]);

			}
		}

		if (!formatFullAttribute.isEmpty()) {
			String[] arrayFormatFullAttribute = formatFullAttribute.split("[.]", 2);
			if (arrayFormatFullAttribute.length == 2) {
				attributeRule.setFormatTabularSection(arrayFormatFullAttribute[0]);
				attributeRule.setFormatAttribute(arrayFormatFullAttribute[1]);

			} else {
				attributeRule.setFormatAttribute(arrayFormatFullAttribute[0]);

			}
		}

		if (!attributeObjectRuleName.isEmpty()) {
			CmObjectRule attributeObjectRule = cmFactory.eINSTANCE.createCmObjectRule();
			attributeObjectRule.setName(attributeObjectRuleName);
			attributeRule.setObjectRule(attributeObjectRule);
		}
	}

	private static CmObjectRule addObjectRule(String name, String configurationObject, String formatObject,
			Boolean forSending, Boolean forReceiving, Boolean forGroup) {
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		objectRule.setName(name);
		objectRule.setConfigurationObjectName(configurationObject);
		objectRule.setFormatObject(formatObject);
		objectRule.setForSending(forSending);
		objectRule.setForReceiving(forReceiving);
		objectRule.setForGroup(forGroup);

		return objectRule;
	}

	private static CharSource getFileInputSupplier(String partName) {
		return Resources.asCharSource(
				ConversionModuleAnalyzerObjectRuleSendingTextTest.class.getResource("/resources/" + partName),
				StandardCharsets.UTF_8);
	}

	private static String readContents(CharSource source) {
		try (Reader reader = source.openBufferedStream()) {
			return CharStreams.toString(reader);

		} catch (IOException | NullPointerException e) {
			return "";

		}
	}

	private ConversionModuleAnalyzerUtils() {
		throw new IllegalStateException("Вспомогательный класс");
	}

}
