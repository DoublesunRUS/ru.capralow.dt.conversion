package ru.capralow.dt.conversion.plugin.core.utils.tests;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import com.google.common.io.CharSource;
import com.google.common.io.CharStreams;
import com.google.common.io.Resources;

import ru.capralow.dt.conversion.plugin.core.analyzer.ConversionModuleAnalyzer;
import ru.capralow.dt.conversion.plugin.core.analyzer.tests.ConversionModuleAnalyzerObjectRuleSendingTextTest;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmParam;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedValue;
import ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmFactory;

public final class ConversionModuleAnalyzerUtils {
	private static final String LS = System.lineSeparator();

	private static final String ON_PROCESSING_EVENT_TEXT = "	Сообщить(\"ПриОбработке\");";
	private static final String DATA_SELECTION_EVENT_TEXT = "	Сообщить(\"ВыборкаДанных\");";

	private static final String ON_SENDING_EVENT_TEXT = "	Сообщить(\"ПриОтправкеДанных\");";
	private static final String BEFORE_RECEIVING_EVENT_TEXT = "	Сообщить(\"ПриКонвертацииДанныхXDTO\");";
	private static final String ON_RECEIVING_EVENT_TEXT = "	Сообщить(\"ПередЗаписьюПолученныхДанных\");";

	private static final String HEAD_ORGANIZATION = "ГоловнаяОрганизация";

	public static CmAlgorithm addAlgorithm(String name, String params, String body, CmMethodType methodType,
			Boolean isExport, EList<CmAlgorithm> algorithms) {
		if (algorithms != null)
			for (CmAlgorithm algorithm : algorithms)
				if (algorithm.getName().equals(name))
					return algorithm;

		CmAlgorithm algorithm = cmFactory.eINSTANCE.createCmAlgorithm();
		algorithm.setName(name);
		String[] methodParams = params.split("[,]");
		for (String methodParam : methodParams) {
			CmParam cmParam = cmFactory.eINSTANCE.createCmParam();
			algorithm.getParams().add(cmParam);

			String[] paramAndValue = methodParam.split("[=]", 2);
			if (paramAndValue[0].startsWith("Знач")) {
				cmParam.setByValue(true);
				paramAndValue[0] = paramAndValue[0].substring(6);
			}
			cmParam.setName(paramAndValue[0].trim());
			if (paramAndValue.length == 2)
				cmParam.setDefaultValue(paramAndValue[1].trim());
		}
		algorithm.setBody(body);
		algorithm.setMethodType(methodType);
		algorithm.setIsExport(isExport);
		if (algorithms != null) {
			algorithm.setExists(true);
			algorithms.add(algorithm);
		}

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

	public static CmDataRule addDataRule(String name, String configurationObject, String formatObject,
			Boolean forSending, Boolean forReceiving, Boolean isDataCleaning, EList<CmDataRule> dataRules) {
		CmDataRule dataRule = cmFactory.eINSTANCE.createCmDataRule();
		dataRule.setName(name);
		dataRule.setConfigurationObjectName(configurationObject);
		dataRule.setFormatObject(formatObject);
		dataRule.setForSending(forSending);
		dataRule.setForReceiving(forReceiving);
		dataRule.setIsDataCleaning(isDataCleaning);
		if (dataRules != null)
			dataRules.add(dataRule);

		return dataRule;
	}

	public static CmDataRule addFilledDataRule(String name, Boolean withConfiguration, Boolean withFormat,
			Boolean forSending, Boolean forReceiving, Boolean isDataCleaning, EList<CmDataRule> dataRules) {
		return addDataRule(name,
				withConfiguration ? "Метаданные.Справочники.Организации" : "",
				withFormat ? "Справочник.Организации" : "",
				forSending,
				forReceiving,
				isDataCleaning,
				dataRules);
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
		CmObjectRule objectRule = null;

		if (objectRules != null)
			for (CmObjectRule cmObjectRule : objectRules)
				if (cmObjectRule.getName().equals(name)) {
					objectRule = cmObjectRule;
					break;
				}

		if (objectRule == null) {
			objectRule = cmFactory.eINSTANCE.createCmObjectRule();
			objectRule.setName(name);

			if (objectRules != null)
				objectRules.add(objectRule);
		}

		objectRule.setConfigurationObjectName(configurationObject);
		objectRule.setFormatObject(formatObject);
		objectRule.setForSending(forSending);
		objectRule.setForReceiving(forReceiving);
		objectRule.setForGroup(forGroup);

		return objectRule;
	}

	public static void addObjectRuleEvents(Boolean onSendingEvent, Boolean beforeReceivingEvent,
			Boolean onReceivingEvent, String afterReceivingAlgorithmName, String afterReceivingAlgorithmParams,
			CmObjectRule objectRule, EList<CmAlgorithm> algorithms) {
		if (onSendingEvent)
			objectRule.setOnSendingEvent(ON_SENDING_EVENT_TEXT);
		if (beforeReceivingEvent)
			objectRule.setBeforeReceivingEvent(BEFORE_RECEIVING_EVENT_TEXT);
		if (onReceivingEvent)
			objectRule.setOnReceivingEvent(ON_RECEIVING_EVENT_TEXT);
		if (!afterReceivingAlgorithmName.isEmpty()) {
			CmAlgorithm algorithm = addAlgorithm(afterReceivingAlgorithmName,
					afterReceivingAlgorithmParams,
					"	Сообщить(\"" + afterReceivingAlgorithmName + "\");",
					CmMethodType.PROCEDURE,
					false,
					algorithms);
			objectRule.setAfterReceivingAlgorithm(algorithm);
		}
	}

	public static void addObjectRulesToDataRule(CmDataRule dataRule, ConversionModule conversionModule,
			String[] objectRulesNames) {
		for (String objectRuleName : objectRulesNames) {
			CmObjectRule objectRule = conversionModule.getObjectRule(objectRuleName);
			if (objectRule == null) {
				objectRule = cmFactory.eINSTANCE.createCmObjectRule();
				objectRule.setName(objectRuleName);
			}
			dataRule.getObjectRules().add(objectRule);
		}
	}

	public static void addODataRuleEvents(Boolean onProcessingEvent, Boolean dataSelectionEvent, CmDataRule dataRule) {
		if (onProcessingEvent)
			dataRule.setOnProcessingEvent(ON_PROCESSING_EVENT_TEXT);
		if (dataSelectionEvent)
			dataRule.setDataSelectionEvent(DATA_SELECTION_EVENT_TEXT);
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
		CmPredefinedValue predefinedMap = cmFactory.eINSTANCE.createCmPredefinedValue();
		predefinedMap.setConfigurationValueName("Перечисления.ЮридическоеФизическоеЛицо.ФизическоеЛицо");
		predefinedMap.setFormatValue("ФизическоеЛицо");
		predefined.getPredefinedValues().add(predefinedMap);
	}

	public static void addPredefinedValue2(CmPredefined predefined) {
		CmPredefinedValue predefinedMap = cmFactory.eINSTANCE.createCmPredefinedValue();
		predefinedMap.setConfigurationValueName("Перечисления.ЮридическоеФизическоеЛицо.ЮридическоеЛицо");
		predefinedMap.setFormatValue("ЮридическоеЛицо");
		predefined.getPredefinedValues().add(predefinedMap);
	}

	public static void addTabularSection1(CmObjectRule objectRule) {
		EList<CmAttributeRule> attributeRules = objectRule.getAttributeRules();
		addAttributeRule("ДополнительныеРеквизиты.Значение",
				"ДополнительныеРеквизиты.ЗначениеСвойства",
				false,
				"",
				attributeRules);
		addAttributeRule("", "ДополнительныеРеквизиты.Свойство", true, "НесуществующееПравило", attributeRules);
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

	public static void sortAttributes(CmObjectRule objectRule) {
		Integer route = 0;
		if (objectRule.getForSending() && objectRule.getForReceiving())
			route = ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_SENDING_RECEIVING;
		else if (objectRule.getForSending())
			route = ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_SENDING;
		else if (objectRule.getForReceiving())
			route = ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_RECEIVING;

		ECollections.sort(objectRule.getAttributeRules(), ConversionModuleAnalyzer.getAttributeRuleComparator(route));
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
