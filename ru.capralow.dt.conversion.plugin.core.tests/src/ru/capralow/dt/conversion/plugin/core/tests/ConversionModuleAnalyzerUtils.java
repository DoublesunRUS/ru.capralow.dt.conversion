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
import ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap;
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
		if (algorithms != null)
			algorithms.add(algorithm);

		return algorithm;
	}

	public static void addAttributeRule(String configurationFullAttribute, String formatFullAttribute, Boolean isCustom,
			String attributeObjectRuleName, EList<CmAttributeRule> attributeRules) {
		CmAttributeRule attributeRule = cmFactory.eINSTANCE.createCmAttributeRule();
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

		if (attributeRules != null)
			attributeRules.add(attributeRule);

		if (!attributeObjectRuleName.isEmpty()) {
			CmObjectRule attributeObjectRule = cmFactory.eINSTANCE.createCmObjectRule();
			attributeObjectRule.setName(attributeObjectRuleName);
			attributeRule.setObjectRule(attributeObjectRule);
		}
	}

	public static void addDataRule(String name, String configurationObject, String formatObject,
			EList<CmDataRule> dataRules) {
		CmDataRule dataRule = cmFactory.eINSTANCE.createCmDataRule();
		dataRule.setName(name);
		dataRule.setConfigurationObjectName(configurationObject);
		dataRule.setFormatObject(formatObject);
		if (dataRules != null)
			dataRules.add(dataRule);
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
					"Объект, КомпонентыОбмена, ОбъектМодифицирован",
					"	Сообщить(\"АлгоритмПослеЗагрузкиВсехДанных\");",
					algorithms);
			objectRule.setAfterReceivingAlgorithm(algorithm);

		}
	}

	public static CmObjectRule addFilledObjectRule(String name, Boolean withConfiguration, Boolean withFormat,
			Boolean forSending, Boolean forReceiving, Boolean forGroup, EList<CmObjectRule> objectRules) {
		return addObjectRule(name,
				withConfiguration ? "Метаданные.Справочники.Организации" : "",
				withFormat ? "Справочник.Организации" : "",
				forSending,
				forReceiving,
				forGroup,
				objectRules);
	}

	public static CmPredefined addFilledPredefined(String name, Boolean withConfigurationFormat, Boolean forSending,
			Boolean forReceiving, EList<CmPredefined> predefineds) {
		return addPredefined(name,
				withConfigurationFormat ? "Метаданные.Перечисления.ЮридическоеФизическоеЛицо" : "",
				withConfigurationFormat ? "ЮридическоеФизическоеЛицо" : "",
				forSending,
				forReceiving,
				predefineds);
	}

	public static void addHeader(CmObjectRule objectRule) {
		EList<CmAttributeRule> attributeRules = objectRule.getAttributeRules();
		addAttributeRule("", "КПП", false, "", attributeRules);
		addAttributeRule(HEAD_ORGANIZATION, "", false, "ПКООтправкиОбъектКонфигурации", attributeRules);
		addAttributeRule("ИНН", "", false, "", attributeRules);
		addAttributeRule("Наименование", "Наименование", false, "", attributeRules);
		addAttributeRule("", HEAD_ORGANIZATION, true, "ПКООтправкиОбъектФорматаСПолями", attributeRules);
	}

	public static void addIdentificationFields1(CmObjectRule objectRule) {
		objectRule.getIdentificationFields().add("Ссылка");
	}

	public static void addIdentificationFields2(CmObjectRule objectRule) {
		objectRule.getIdentificationFields().add(HEAD_ORGANIZATION);
		objectRule.getIdentificationFields().add("ИНН,Префикс");
	}

	public static CmObjectRule addObjectRule(String name, String configurationObject, String formatObject,
			Boolean forSending, Boolean forReceiving, Boolean forGroup, EList<CmObjectRule> objectRules) {
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		objectRule.setName(name);
		objectRule.setConfigurationObjectName(configurationObject);
		objectRule.setFormatObject(formatObject);
		objectRule.setForSending(forSending);
		objectRule.setForReceiving(forReceiving);
		objectRule.setForGroup(forGroup);
		if (objectRules != null)
			objectRules.add(objectRule);

		return objectRule;
	}

	public static CmPredefined addPredefined(String name, String configurationObject, String formatObject,
			Boolean forSending, Boolean forReceiving, EList<CmPredefined> predefineds) {
		CmPredefined predefined = cmFactory.eINSTANCE.createCmPredefined();
		predefined.setName(name);
		predefined.setConfigurationObjectName(configurationObject);
		predefined.setFormatObject(formatObject);
		predefined.setForSending(forSending);
		predefined.setForReceiving(forReceiving);
		if (predefineds != null)
			predefineds.add(predefined);

		return predefined;
	}

	public static void addPredefinedValue1(CmPredefined predefined) {
		CmPredefinedMap predefinedMap = cmFactory.eINSTANCE.createCmPredefinedMap();
		predefinedMap.setConfigurationValue("Перечисления.ЮридическоеФизическоеЛицо.ФизическоеЛицо");
		predefinedMap.setFormatValue("ФизическоеЛицо");
		predefined.getPredefinedMaps().add(predefinedMap);
	}

	public static void addPredefinedValue2(CmPredefined predefined) {
		CmPredefinedMap predefinedMap = cmFactory.eINSTANCE.createCmPredefinedMap();
		predefinedMap.setConfigurationValue("Перечисления.ЮридическоеФизическоеЛицо.ЮридическоеЛицо");
		predefinedMap.setFormatValue("ЮридическоеЛицо");
		predefined.getPredefinedMaps().add(predefinedMap);
	}

	public static void addTabularSection1(CmObjectRule objectRule) {
		EList<CmAttributeRule> attributeRules = objectRule.getAttributeRules();
		addAttributeRule("ДополнительныеРеквизиты.Свойство",
				"ДополнительныеРеквизиты.",
				false,
				"НесуществующееПравило",
				attributeRules);
		addAttributeRule("ДополнительныеРеквизиты.Значение",
				"ДополнительныеРеквизиты.ЗначениеСвойства",
				false,
				"",
				attributeRules);
		addAttributeRule("ДополнительныеРеквизиты.",
				"ДополнительныеРеквизиты.ЗначениеСвойства",
				true,
				"НесуществующееПравило",
				attributeRules);
	}

	public static void addTabularSection2(CmObjectRule objectRule) {
		EList<CmAttributeRule> attributeRules = objectRule.getAttributeRules();
		addAttributeRule("КонтактнаяИнформация.Вид",
				"КонтактнаяИнформация.ВидКонтактнойИнформации",
				false,
				"ВидыКонтактнойИнформации",
				attributeRules);
	}

	public static String getModuleText(String projectName, String moduleName) {
		final String NAME = projectName + "/" + moduleName + ".txt";
		return readContents(getFileInputSupplier(NAME)).replace("\r\n", LS);
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
