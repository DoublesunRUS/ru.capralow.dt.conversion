package ru.capralow.dt.conversion.plugin.core.tests;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import ru.capralow.dt.conversion.plugin.core.ConversionModuleAnalyzer;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined;
import ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmFactory;

public class ConversionModuleAnalyzerDeclarationsTest {
	private static final String LS = System.lineSeparator();

	private static final String ROUTE_IF_ELSEIF = "	%1$sЕсли НаправлениеОбмена = \"%2$s\" Тогда";
	private static final String ADD_COLUMN = String.join(LS,
			"		Если ПравилаОбработкиДанных.Колонки.Найти(\"ОчисткаДанных\") = Неопределено Тогда",
			"			ПравилаОбработкиДанных.Колонки.Добавить(\"ОчисткаДанных\");",
			"		КонецЕсли;");
	private static final String ADD_DATARULE = "		ДобавитьПОД_%1$s(ПравилаОбработкиДанных);";
	private static final String ADD_OBJECTRULE1 = "	ДобавитьПКО_%1$s(ПравилаКонвертации);";
	private static final String ADD_OBJECTRULE2 = "		ДобавитьПКО_%1$s(ПравилаКонвертации);";
	private static final String ELSE = "Иначе";
	private static final String ENDIF = "	КонецЕсли;";

	private static final String SENDING_ROUTE = "Отправка";
	private static final String RECEIVING_ROUTE = "Получение";

	private static final String SENDING_NAME = "ПравилоОтправки";
	private static final String RECEIVING_NAME = "ПравилоПолучения";
	private static final String BOTH_NAME = "ПравилоОтправкиПолучения";

	private static final String BEGIN_OF_PREDEFINED = "	// %1$s.";

	private static final String NEW_PREDEFINED = "	ПравилоКонвертации           = ПравилаКонвертации.Добавить();";

	private static final String PREDEFINED_NAME = "	ПравилоКонвертации.ИмяПКПД   = \"%1$s\";";

	private static final String EMPTY_CONFIGURATION_OBJECT = "	ПравилоКонвертации.ТипДанных = Неопределено;";

	private static final String EMPTY_FORMAT_OBJECT = "	ПравилоКонвертации.ТипXDTO   = \"\";";

	private static final String BEGIN_OF_SENDING_VALUES_SECTION = "	ЗначенияДляОтправки = Новый Соответствие;";

	private static final String END_OF_SENDING_VALUES_SECTION = "	ПравилоКонвертации.КонвертацииЗначенийПриОтправке = ЗначенияДляОтправки;";

	private static final String BEGIN_OF_RECEIVING_VALUES_SECTION = "	ЗначенияДляПолучения = Новый Соответствие;";

	private static final String END_OF_RECEIVING_VALUES_SECTION = "	ПравилоКонвертации.КонвертацииЗначенийПриПолучении = ЗначенияДляПолучения;";

	@Test
	public void testDataRulesAll() {
		String report1 = String.join(LS,
				String.format(ROUTE_IF_ELSEIF, "", SENDING_ROUTE),
				ADD_COLUMN,
				String.format(ADD_DATARULE, SENDING_NAME.concat("1")),
				String.format(ADD_DATARULE, SENDING_NAME.concat("2")),
				String.format(ROUTE_IF_ELSEIF, ELSE, RECEIVING_ROUTE),
				String.format(ADD_DATARULE, RECEIVING_NAME.concat("1")),
				String.format(ADD_DATARULE, RECEIVING_NAME.concat("2")),
				ENDIF);

		EList<CmDataRule> dataRules = new BasicEList<>();
		ConversionModuleAnalyzerUtils
				.addFilledDataRule(SENDING_NAME.concat("1"), false, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule(RECEIVING_NAME.concat("1"), false, false, false, true, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule(SENDING_NAME.concat("2"), false, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule(RECEIVING_NAME.concat("2"), false, false, false, true, false, dataRules);

		String report2 = ConversionModuleAnalyzer.createDataRulesDeclarationText(dataRules);

		assertEquals("Формирование модуля обмена: Добавить процедуру описания ПОД событий отправки и получения",
				report1,
				report2);
	}

	@Test
	public void testDataRulesEmpty() {
		String report2 = ConversionModuleAnalyzer.createDataRulesDeclarationText(new BasicEList<CmDataRule>());

		assertEquals("Формирование модуля обмена: Добавить пустую процедуру описания ПОД", "", report2);
	}

	@Test
	public void testDataRulesReceiving() {
		String report1 = String.join(LS,
				String.format(ROUTE_IF_ELSEIF, "", RECEIVING_ROUTE),
				String.format(ADD_DATARULE, RECEIVING_NAME.concat("1")),
				String.format(ADD_DATARULE, RECEIVING_NAME.concat("2")),
				ENDIF);

		EList<CmDataRule> dataRules = new BasicEList<>();
		ConversionModuleAnalyzerUtils
				.addFilledDataRule(RECEIVING_NAME.concat("1"), false, false, false, true, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule(RECEIVING_NAME.concat("2"), false, false, false, true, false, dataRules);

		String report2 = ConversionModuleAnalyzer.createDataRulesDeclarationText(dataRules);

		assertEquals("Формирование модуля обмена: Добавить процедуру описания ПОД событий получения", report1, report2);
	}

	@Test
	public void testDataRulesSending() {
		String report1 = String.join(LS,
				String.format(ROUTE_IF_ELSEIF, "", SENDING_ROUTE),
				ADD_COLUMN,
				String.format(ADD_DATARULE, SENDING_NAME.concat("1")),
				String.format(ADD_DATARULE, SENDING_NAME.concat("2")),
				ENDIF);

		EList<CmDataRule> dataRules = new BasicEList<>();
		ConversionModuleAnalyzerUtils
				.addFilledDataRule(SENDING_NAME.concat("1"), false, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule(SENDING_NAME.concat("2"), false, false, true, false, false, dataRules);

		String report2 = ConversionModuleAnalyzer.createDataRulesDeclarationText(dataRules);

		assertEquals("Формирование модуля обмена: Добавить процедуру описания ПОД событий отправки", report1, report2);
	}

	@Test
	public void testEventsDataRules() {
		final String onProcessingEvent = String.join(LS,
				"	%2$sЕсли ИмяПроцедуры = \"ПОД_%1$s_ПриОбработке\" Тогда ",
				"		ПОД_%1$s_ПриОбработке(",
				"			Параметры.ОбъектОбработки, Параметры.ИспользованиеПКО, Параметры.КомпонентыОбмена);");
		final String dataSelectionEvent = String.join(LS,
				"	%2$sЕсли ИмяФункции = \"ПОД_%1$s_ВыборкаДанных\" Тогда ",
				"		Возврат ПОД_%1$s_ВыборкаДанных(",
				"			Параметры.КомпонентыОбмена);");

		String report1 = String.join(LS,
				String.format(onProcessingEvent, "П2_".concat(SENDING_NAME), ""),
				String.format(onProcessingEvent, "П2".concat("2_4_").concat(SENDING_NAME), ELSE),
				String.format(onProcessingEvent, "П1_".concat(RECEIVING_NAME), ELSE),
				String.format(onProcessingEvent, "П1".concat("2_4_").concat(RECEIVING_NAME), ELSE),
				ENDIF,
				"",
				String.format(dataSelectionEvent, "П2_".concat(SENDING_NAME), ""),
				String.format(dataSelectionEvent, "П2".concat("2_4_").concat(SENDING_NAME), ELSE),
				ENDIF);

		ConversionModule conversionModule = cmFactory.eINSTANCE.createConversionModule();
		conversionModule.setStoreVersion("2");

		EList<CmDataRule> dataRules = conversionModule.getDataRules();
		CmDataRule dataRule;

		dataRule = ConversionModuleAnalyzerUtils.addFilledDataRule("П2".concat("2_4_")
				.concat(SENDING_NAME), false, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils.addODataRuleEvents(true, true, dataRule);

		dataRule = ConversionModuleAnalyzerUtils
				.addFilledDataRule("П2_".concat(SENDING_NAME), false, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils.addODataRuleEvents(true, true, dataRule);

		dataRule = ConversionModuleAnalyzerUtils.addFilledDataRule("П1".concat("2_4_")
				.concat(RECEIVING_NAME), false, false, false, true, false, dataRules);
		ConversionModuleAnalyzerUtils.addODataRuleEvents(true, true, dataRule);

		dataRule = ConversionModuleAnalyzerUtils
				.addFilledDataRule("П1_".concat(RECEIVING_NAME), false, false, false, true, false, dataRules);
		ConversionModuleAnalyzerUtils.addODataRuleEvents(true, true, dataRule);

		Map<CmMethodType, StringBuilder> events = ConversionModuleAnalyzer
				.createEventsDeclarationText(conversionModule);
		String report2 = String.join(LS, events.get(CmMethodType.PROCEDURE), "", events.get(CmMethodType.FUNCTION));

		assertEquals("Формирование модуля обмена: Добавить процедуру описания ПОД", report1, report2);
	}

	@Test
	public void testEventsEmpty() {
		Map<CmMethodType, StringBuilder> events = ConversionModuleAnalyzer
				.createEventsDeclarationText(cmFactory.eINSTANCE.createConversionModule());

		String report2 = String.join(LS, events.get(CmMethodType.PROCEDURE), "", events.get(CmMethodType.FUNCTION));

		assertEquals("Формирование модуля обмена: Добавить пустую процедуру описания процедур", LS + LS, report2);
	}

	@Test
	public void testEventsObjectRules() {
		final String onSendingEvent = String.join(LS,
				"	%2$sЕсли ИмяПроцедуры = \"ПКО_%1$s_ПриОтправкеДанных\" Тогда ",
				"		ПКО_%1$s_ПриОтправкеДанных(",
				"			Параметры.ДанныеИБ, Параметры.ДанныеXDTO, Параметры.КомпонентыОбмена, Параметры.СтекВыгрузки);");
		final String beforeReceivingEvent = String.join(LS,
				"	%2$sЕсли ИмяПроцедуры = \"ПКО_%1$s_ПриКонвертацииДанныхXDTO\" Тогда ",
				"		ПКО_%1$s_ПриКонвертацииДанныхXDTO(",
				"			Параметры.ДанныеXDTO, Параметры.ПолученныеДанные, Параметры.КомпонентыОбмена);");
		final String onReceivingEvent = String.join(LS,
				"	%2$sЕсли ИмяПроцедуры = \"ПКО_%1$s_ПередЗаписьюПолученныхДанных\" Тогда ",
				"		ПКО_%1$s_ПередЗаписьюПолученныхДанных(",
				"			Параметры.ПолученныеДанные, Параметры.ДанныеИБ, Параметры.КонвертацияСвойств, Параметры.КомпонентыОбмена);");
		final String afterReceivingAlgorithm = String.join(LS,
				"	%2$sЕсли ИмяПроцедуры = \"%1$s\" Тогда ",
				"		%1$s(",
				"			Параметры.Параметр1, Параметры.Параметр2, Параметры.Параметр3);");

		final String params = "Параметр1, Параметр2, Параметр3";

		String report1 = String.join(LS,
				String.format(onSendingEvent, "П3_".concat(SENDING_NAME), ""),
				String.format(onSendingEvent, "П3".concat("2_4_").concat(SENDING_NAME), ELSE),

				String.format(beforeReceivingEvent, "П2_".concat(RECEIVING_NAME), ELSE),
				String.format(onReceivingEvent, "П2_".concat(RECEIVING_NAME), ELSE),
				String.format(beforeReceivingEvent, "П2".concat("2_4_").concat(RECEIVING_NAME), ELSE),
				String.format(onReceivingEvent, "П2".concat("2_4_").concat(RECEIVING_NAME), ELSE),

				String.format(onSendingEvent, "П1".concat(BOTH_NAME), ELSE),
				String.format(beforeReceivingEvent, "П1".concat(BOTH_NAME), ELSE),
				String.format(onReceivingEvent, "П1".concat(BOTH_NAME), ELSE),

				String.format(afterReceivingAlgorithm, "Алгоритм1_", ELSE),
				String.format(afterReceivingAlgorithm, "Алгоритм12_4_", ELSE),
				String.format(afterReceivingAlgorithm, "Алгоритм2_", ELSE),
				String.format(afterReceivingAlgorithm, "Алгоритм22_4_", ELSE),
				String.format(afterReceivingAlgorithm, "Алгоритм3", ELSE),
				ENDIF,
				"",
				"");

		ConversionModule conversionModule = cmFactory.eINSTANCE.createConversionModule();
		conversionModule.setStoreVersion("2");

		EList<CmObjectRule> objectRules = conversionModule.getObjectRules();
		EList<CmAlgorithm> algorithms = conversionModule.getAlgorithms();
		CmObjectRule objectRule;

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("П3".concat("2_4_")
				.concat(SENDING_NAME), false, false, true, false, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addObjectRuleEvents(true, true, true, "Алгоритм12_4_", params, objectRule, algorithms);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("П3_".concat(SENDING_NAME), false, false, true, false, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addObjectRuleEvents(true, true, true, "Алгоритм1_", params, objectRule, algorithms);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("П2".concat("2_4_")
				.concat(RECEIVING_NAME), false, false, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addObjectRuleEvents(true, true, true, "Алгоритм22_4_", params, objectRule, algorithms);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("П2_".concat(RECEIVING_NAME), false, false, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addObjectRuleEvents(true, true, true, "Алгоритм2_", params, objectRule, algorithms);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("П1".concat(BOTH_NAME), false, false, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addObjectRuleEvents(true, true, true, "Алгоритм3", params, objectRule, algorithms);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule(BOTH_NAME
				.concat("НесуществующийАлгоритм"), false, false, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addObjectRuleEvents(false, false, false, "НесуществующийАлгоритм", params, objectRule, null);

		Map<CmMethodType, StringBuilder> events = ConversionModuleAnalyzer
				.createEventsDeclarationText(conversionModule);
		String report2 = String.join(LS, events.get(CmMethodType.PROCEDURE), "", events.get(CmMethodType.FUNCTION));

		assertEquals("Формирование модуля обмена: Добавить процедуру описания ПКО", report1, report2);
	}

	@Test
	public void testObjectRulesAll() {
		String report1 = String.join(LS,
				String.format(ROUTE_IF_ELSEIF, "", SENDING_ROUTE),
				String.format(ADD_OBJECTRULE2, SENDING_NAME.concat("1")),
				String.format(ADD_OBJECTRULE2, SENDING_NAME.concat("2")),
				String.format(ROUTE_IF_ELSEIF, ELSE, RECEIVING_ROUTE),
				String.format(ADD_OBJECTRULE2, RECEIVING_NAME.concat("1")),
				String.format(ADD_OBJECTRULE2, RECEIVING_NAME.concat("2")),
				ENDIF,
				String.format(ADD_OBJECTRULE1, BOTH_NAME.concat("1")),
				String.format(ADD_OBJECTRULE1, BOTH_NAME.concat("2")));

		EList<CmObjectRule> objectRules = new BasicEList<>();
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(SENDING_NAME.concat("1"), false, false, true, false, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(RECEIVING_NAME.concat("1"), false, false, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(BOTH_NAME.concat("1"), false, false, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(SENDING_NAME.concat("2"), false, false, true, false, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(RECEIVING_NAME.concat("2"), false, false, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(BOTH_NAME.concat("2"), false, false, true, true, false, objectRules);

		String report2 = ConversionModuleAnalyzer.createObjectRulesDeclarationText(objectRules);

		assertEquals(
				"Формирование модуля обмена: Добавить процедуру описания ПОД событий отправки и получения с отправкой и получением",
				report1,
				report2);
	}

	@Test
	public void testObjectRulesBoth() {
		String report1 = String.join(LS,
				String.format(ADD_OBJECTRULE1, BOTH_NAME.concat("1")),
				String.format(ADD_OBJECTRULE1, BOTH_NAME.concat("2")));

		EList<CmObjectRule> objectRules = new BasicEList<>();
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(BOTH_NAME.concat("1"), false, false, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(BOTH_NAME.concat("2"), false, false, true, true, false, objectRules);

		String report2 = ConversionModuleAnalyzer.createObjectRulesDeclarationText(objectRules);

		assertEquals("Формирование модуля обмена: Добавить процедуру описания ПКО событий отправки и получения",
				report1,
				report2);
	}

	@Test
	public void testObjectRulesDoubleReceiving() {
		String report1 = String.join(LS,
				String.format(ROUTE_IF_ELSEIF, "", RECEIVING_ROUTE),
				String.format(ADD_OBJECTRULE2, RECEIVING_NAME.concat("1")),
				String.format(ADD_OBJECTRULE2, RECEIVING_NAME.concat("2")),
				ENDIF,
				String.format(ADD_OBJECTRULE1, BOTH_NAME.concat("1")),
				String.format(ADD_OBJECTRULE1, BOTH_NAME.concat("2")));

		EList<CmObjectRule> objectRules = new BasicEList<>();
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(RECEIVING_NAME.concat("1"), false, false, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(BOTH_NAME.concat("1"), false, false, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(RECEIVING_NAME.concat("2"), false, false, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(BOTH_NAME.concat("2"), false, false, true, true, false, objectRules);

		String report2 = ConversionModuleAnalyzer.createObjectRulesDeclarationText(objectRules);

		assertEquals("Формирование модуля обмена: Добавить процедуру описания Predefined событий получения с отправкой",
				report1,
				report2);
	}

	@Test
	public void testObjectRulesDoubleSending() {
		String report1 = String.join(LS,
				String.format(ROUTE_IF_ELSEIF, "", SENDING_ROUTE),
				String.format(ADD_OBJECTRULE2, SENDING_NAME.concat("1")),
				String.format(ADD_OBJECTRULE2, SENDING_NAME.concat("2")),
				ENDIF,
				String.format(ADD_OBJECTRULE1, BOTH_NAME.concat("1")),
				String.format(ADD_OBJECTRULE1, BOTH_NAME.concat("2")));

		EList<CmObjectRule> objectRules = new BasicEList<>();
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(SENDING_NAME.concat("1"), false, false, true, false, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(BOTH_NAME.concat("1"), false, false, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(SENDING_NAME.concat("2"), false, false, true, false, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(BOTH_NAME.concat("2"), false, false, true, true, false, objectRules);

		String report2 = ConversionModuleAnalyzer.createObjectRulesDeclarationText(objectRules);

		assertEquals("Формирование модуля обмена: Добавить процедуру описания ПКО событий отправки с получением",
				report1,
				report2);
	}

	@Test
	public void testObjectRulesEmpty() {
		String report2 = ConversionModuleAnalyzer.createObjectRulesDeclarationText(new BasicEList<CmObjectRule>());

		assertEquals("Формирование модуля обмена: Добавить пустую процедуру описания ПКО", "", report2);
	}

	@Test
	public void testObjectRulesReceiving() {
		String report1 = String.join(LS,
				String.format(ROUTE_IF_ELSEIF, "", RECEIVING_ROUTE),
				String.format(ADD_OBJECTRULE2, RECEIVING_NAME.concat("1")),
				String.format(ADD_OBJECTRULE2, RECEIVING_NAME.concat("2")),
				ENDIF);

		EList<CmObjectRule> objectRules = new BasicEList<>();
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(RECEIVING_NAME.concat("1"), false, false, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(RECEIVING_NAME.concat("2"), false, false, false, true, false, objectRules);

		String report2 = ConversionModuleAnalyzer.createObjectRulesDeclarationText(objectRules);

		assertEquals("Формирование модуля обмена: Добавить процедуру описания ПКО событий получения", report1, report2);
	}

	@Test
	public void testObjectRulesSending() {
		String report1 = String.join(LS,
				String.format(ROUTE_IF_ELSEIF, "", SENDING_ROUTE),
				String.format(ADD_OBJECTRULE2, SENDING_NAME.concat("1")),
				String.format(ADD_OBJECTRULE2, SENDING_NAME.concat("2")),
				ENDIF);

		EList<CmObjectRule> objectRules = new BasicEList<>();
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(SENDING_NAME.concat("1"), false, false, true, false, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(SENDING_NAME.concat("2"), false, false, true, false, false, objectRules);

		String report2 = ConversionModuleAnalyzer.createObjectRulesDeclarationText(objectRules);

		assertEquals("Формирование модуля обмена: Добавить процедуру описания ПКО событий отправки", report1, report2);
	}

	@Test
	public void testObjectRulesSendingOrReceiving() {
		String report1 = String.join(LS,
				String.format(ROUTE_IF_ELSEIF, "", SENDING_ROUTE),
				String.format(ADD_OBJECTRULE2, SENDING_NAME.concat("1")),
				String.format(ADD_OBJECTRULE2, SENDING_NAME.concat("2")),
				String.format(ROUTE_IF_ELSEIF, ELSE, RECEIVING_ROUTE),
				String.format(ADD_OBJECTRULE2, RECEIVING_NAME.concat("1")),
				String.format(ADD_OBJECTRULE2, RECEIVING_NAME.concat("2")),
				ENDIF);

		EList<CmObjectRule> objectRules = new BasicEList<>();
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(SENDING_NAME.concat("1"), false, false, true, false, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(RECEIVING_NAME.concat("1"), false, false, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(SENDING_NAME.concat("2"), false, false, true, false, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addFilledObjectRule(RECEIVING_NAME.concat("2"), false, false, false, true, false, objectRules);

		String report2 = ConversionModuleAnalyzer.createObjectRulesDeclarationText(objectRules);

		assertEquals("Формирование модуля обмена: Добавить процедуру описания ПОД событий отправки или получения",
				report1,
				report2);
	}

	@Test
	public void testPredefinedsAll() {
		String report1 = String.join(LS,
				String.format(ROUTE_IF_ELSEIF, "", SENDING_ROUTE),
				"	" + String.format(BEGIN_OF_PREDEFINED, SENDING_NAME.concat("1")),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, SENDING_NAME.concat("1")),
				"	" + EMPTY_CONFIGURATION_OBJECT,
				"	" + EMPTY_FORMAT_OBJECT,
				"	" + "",
				"	" + BEGIN_OF_SENDING_VALUES_SECTION,
				"	" + END_OF_SENDING_VALUES_SECTION,
				"	" + "",
				"	" + String.format(BEGIN_OF_PREDEFINED, SENDING_NAME.concat("2")),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, SENDING_NAME.concat("2")),
				"	" + EMPTY_CONFIGURATION_OBJECT,
				"	" + EMPTY_FORMAT_OBJECT,
				"	" + "",
				"	" + BEGIN_OF_SENDING_VALUES_SECTION,
				"	" + END_OF_SENDING_VALUES_SECTION,
				ENDIF,
				String.format(ROUTE_IF_ELSEIF, "", RECEIVING_ROUTE),
				"	" + String.format(BEGIN_OF_PREDEFINED, RECEIVING_NAME.concat("1")),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, RECEIVING_NAME.concat("1")),
				"	" + EMPTY_CONFIGURATION_OBJECT,
				"	" + EMPTY_FORMAT_OBJECT,
				"	" + "",
				"	" + BEGIN_OF_RECEIVING_VALUES_SECTION,
				"	" + END_OF_RECEIVING_VALUES_SECTION,
				"	" + "",
				"	" + String.format(BEGIN_OF_PREDEFINED, RECEIVING_NAME.concat("2")),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, RECEIVING_NAME.concat("2")),
				"	" + EMPTY_CONFIGURATION_OBJECT,
				"	" + EMPTY_FORMAT_OBJECT,
				"	" + "",
				"	" + BEGIN_OF_RECEIVING_VALUES_SECTION,
				"	" + END_OF_RECEIVING_VALUES_SECTION,
				ENDIF,
				"",
				String.format(BEGIN_OF_PREDEFINED, BOTH_NAME.concat("1")),
				NEW_PREDEFINED,
				String.format(PREDEFINED_NAME, BOTH_NAME.concat("1")),
				EMPTY_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				"",
				BEGIN_OF_SENDING_VALUES_SECTION,
				END_OF_SENDING_VALUES_SECTION,
				BEGIN_OF_RECEIVING_VALUES_SECTION,
				END_OF_RECEIVING_VALUES_SECTION,
				"",
				String.format(BEGIN_OF_PREDEFINED, BOTH_NAME.concat("2")),
				NEW_PREDEFINED,
				String.format(PREDEFINED_NAME, BOTH_NAME.concat("2")),
				EMPTY_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				"",
				BEGIN_OF_SENDING_VALUES_SECTION,
				END_OF_SENDING_VALUES_SECTION,
				BEGIN_OF_RECEIVING_VALUES_SECTION,
				END_OF_RECEIVING_VALUES_SECTION,
				"");

		EList<CmPredefined> predefineds = new BasicEList<>();
		ConversionModuleAnalyzerUtils.addFilledPredefined(SENDING_NAME.concat("1"), false, true, false, predefineds);
		ConversionModuleAnalyzerUtils.addFilledPredefined(RECEIVING_NAME.concat("1"), false, false, true, predefineds);
		ConversionModuleAnalyzerUtils.addFilledPredefined(BOTH_NAME.concat("1"), false, true, true, predefineds);
		ConversionModuleAnalyzerUtils.addFilledPredefined(SENDING_NAME.concat("2"), false, true, false, predefineds);
		ConversionModuleAnalyzerUtils.addFilledPredefined(RECEIVING_NAME.concat("2"), false, false, true, predefineds);
		ConversionModuleAnalyzerUtils.addFilledPredefined(BOTH_NAME.concat("2"), false, true, true, predefineds);

		String report2 = ConversionModuleAnalyzer.createPredefinedsDeclarationText(predefineds);

		assertEquals(
				"Формирование модуля обмена: Добавить процедуру описания ПКПД событий отправки и получения с отправкой и получением",
				report1,
				report2);
	}

	@Test
	public void testPredefinedsBoth() {
		String report1 = String.join(LS,
				String.format(ROUTE_IF_ELSEIF, "", SENDING_ROUTE),
				"	" + String.format(BEGIN_OF_PREDEFINED, SENDING_NAME.concat("1")),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, SENDING_NAME.concat("1")),
				"	" + EMPTY_CONFIGURATION_OBJECT,
				"	" + EMPTY_FORMAT_OBJECT,
				"	" + "",
				"	" + BEGIN_OF_SENDING_VALUES_SECTION,
				"	" + END_OF_SENDING_VALUES_SECTION,
				"	" + "",
				"	" + String.format(BEGIN_OF_PREDEFINED, SENDING_NAME.concat("2")),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, SENDING_NAME.concat("2")),
				"	" + EMPTY_CONFIGURATION_OBJECT,
				"	" + EMPTY_FORMAT_OBJECT,
				"	" + "",
				"	" + BEGIN_OF_SENDING_VALUES_SECTION,
				"	" + END_OF_SENDING_VALUES_SECTION,
				ENDIF,
				String.format(ROUTE_IF_ELSEIF, "", RECEIVING_ROUTE),
				"	" + String.format(BEGIN_OF_PREDEFINED, RECEIVING_NAME.concat("1")),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, RECEIVING_NAME.concat("1")),
				"	" + EMPTY_CONFIGURATION_OBJECT,
				"	" + EMPTY_FORMAT_OBJECT,
				"	" + "",
				"	" + BEGIN_OF_RECEIVING_VALUES_SECTION,
				"	" + END_OF_RECEIVING_VALUES_SECTION,
				"	" + "",
				"	" + String.format(BEGIN_OF_PREDEFINED, RECEIVING_NAME.concat("2")),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, RECEIVING_NAME.concat("2")),
				"	" + EMPTY_CONFIGURATION_OBJECT,
				"	" + EMPTY_FORMAT_OBJECT,
				"	" + "",
				"	" + BEGIN_OF_RECEIVING_VALUES_SECTION,
				"	" + END_OF_RECEIVING_VALUES_SECTION,
				ENDIF);

		EList<CmPredefined> predefineds = new BasicEList<>();
		ConversionModuleAnalyzerUtils.addFilledPredefined(SENDING_NAME.concat("1"), false, true, false, predefineds);
		ConversionModuleAnalyzerUtils.addFilledPredefined(RECEIVING_NAME.concat("1"), false, false, true, predefineds);
		ConversionModuleAnalyzerUtils.addFilledPredefined(SENDING_NAME.concat("2"), false, true, false, predefineds);
		ConversionModuleAnalyzerUtils.addFilledPredefined(RECEIVING_NAME.concat("2"), false, false, true, predefineds);

		String report2 = ConversionModuleAnalyzer.createPredefinedsDeclarationText(predefineds);

		assertEquals("Формирование модуля обмена: Добавить процедуру описания ПКПД событий отправки и получения",
				report1,
				report2);
	}

	@Test
	public void testPredefinedsDoubleReceiving() {
		String report1 = String.join(LS,
				String.format(ROUTE_IF_ELSEIF, "", RECEIVING_ROUTE),
				"	" + String.format(BEGIN_OF_PREDEFINED, RECEIVING_NAME.concat("1")),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, RECEIVING_NAME.concat("1")),
				"	" + EMPTY_CONFIGURATION_OBJECT,
				"	" + EMPTY_FORMAT_OBJECT,
				"	" + "",
				"	" + BEGIN_OF_RECEIVING_VALUES_SECTION,
				"	" + END_OF_RECEIVING_VALUES_SECTION,
				"	" + "",
				"	" + String.format(BEGIN_OF_PREDEFINED, RECEIVING_NAME.concat("2")),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, RECEIVING_NAME.concat("2")),
				"	" + EMPTY_CONFIGURATION_OBJECT,
				"	" + EMPTY_FORMAT_OBJECT,
				"	" + "",
				"	" + BEGIN_OF_RECEIVING_VALUES_SECTION,
				"	" + END_OF_RECEIVING_VALUES_SECTION,
				ENDIF,
				"",
				String.format(BEGIN_OF_PREDEFINED, BOTH_NAME.concat("1")),
				NEW_PREDEFINED,
				String.format(PREDEFINED_NAME, BOTH_NAME.concat("1")),
				EMPTY_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				"",
				BEGIN_OF_SENDING_VALUES_SECTION,
				END_OF_SENDING_VALUES_SECTION,
				BEGIN_OF_RECEIVING_VALUES_SECTION,
				END_OF_RECEIVING_VALUES_SECTION,
				"",
				String.format(BEGIN_OF_PREDEFINED, BOTH_NAME.concat("2")),
				NEW_PREDEFINED,
				String.format(PREDEFINED_NAME, BOTH_NAME.concat("2")),
				EMPTY_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				"",
				BEGIN_OF_SENDING_VALUES_SECTION,
				END_OF_SENDING_VALUES_SECTION,
				BEGIN_OF_RECEIVING_VALUES_SECTION,
				END_OF_RECEIVING_VALUES_SECTION,
				"");

		EList<CmPredefined> predefineds = new BasicEList<>();
		ConversionModuleAnalyzerUtils.addFilledPredefined(RECEIVING_NAME.concat("1"), false, false, true, predefineds);
		ConversionModuleAnalyzerUtils.addFilledPredefined(BOTH_NAME.concat("1"), false, true, true, predefineds);
		ConversionModuleAnalyzerUtils.addFilledPredefined(RECEIVING_NAME.concat("2"), false, false, true, predefineds);
		ConversionModuleAnalyzerUtils.addFilledPredefined(BOTH_NAME.concat("2"), false, true, true, predefineds);

		String report2 = ConversionModuleAnalyzer.createPredefinedsDeclarationText(predefineds);

		assertEquals("Формирование модуля обмена: Добавить процедуру описания ПКПД событий получения с отправкой",
				report1,
				report2);
	}

	@Test
	public void testPredefinedsDoubleSending() {
		String report1 = String.join(LS,
				String.format(ROUTE_IF_ELSEIF, "", SENDING_ROUTE),
				"	" + String.format(BEGIN_OF_PREDEFINED, SENDING_NAME.concat("1")),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, SENDING_NAME.concat("1")),
				"	" + EMPTY_CONFIGURATION_OBJECT,
				"	" + EMPTY_FORMAT_OBJECT,
				"	" + "",
				"	" + BEGIN_OF_SENDING_VALUES_SECTION,
				"	" + END_OF_SENDING_VALUES_SECTION,
				"	" + "",
				"	" + String.format(BEGIN_OF_PREDEFINED, SENDING_NAME.concat("2")),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, SENDING_NAME.concat("2")),
				"	" + EMPTY_CONFIGURATION_OBJECT,
				"	" + EMPTY_FORMAT_OBJECT,
				"	" + "",
				"	" + BEGIN_OF_SENDING_VALUES_SECTION,
				"	" + END_OF_SENDING_VALUES_SECTION,
				ENDIF,
				"",
				String.format(BEGIN_OF_PREDEFINED, BOTH_NAME.concat("1")),
				NEW_PREDEFINED,
				String.format(PREDEFINED_NAME, BOTH_NAME.concat("1")),
				EMPTY_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				"",
				BEGIN_OF_SENDING_VALUES_SECTION,
				END_OF_SENDING_VALUES_SECTION,
				BEGIN_OF_RECEIVING_VALUES_SECTION,
				END_OF_RECEIVING_VALUES_SECTION,
				"",
				String.format(BEGIN_OF_PREDEFINED, BOTH_NAME.concat("2")),
				NEW_PREDEFINED,
				String.format(PREDEFINED_NAME, BOTH_NAME.concat("2")),
				EMPTY_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				"",
				BEGIN_OF_SENDING_VALUES_SECTION,
				END_OF_SENDING_VALUES_SECTION,
				BEGIN_OF_RECEIVING_VALUES_SECTION,
				END_OF_RECEIVING_VALUES_SECTION,
				"");

		EList<CmPredefined> predefineds = new BasicEList<>();
		ConversionModuleAnalyzerUtils.addFilledPredefined(SENDING_NAME.concat("1"), false, true, false, predefineds);
		ConversionModuleAnalyzerUtils.addFilledPredefined(BOTH_NAME.concat("1"), false, true, true, predefineds);
		ConversionModuleAnalyzerUtils.addFilledPredefined(SENDING_NAME.concat("2"), false, true, false, predefineds);
		ConversionModuleAnalyzerUtils.addFilledPredefined(BOTH_NAME.concat("2"), false, true, true, predefineds);

		String report2 = ConversionModuleAnalyzer.createPredefinedsDeclarationText(predefineds);

		assertEquals("Формирование модуля обмена: Добавить процедуру описания ПКПД событий отправки с получением",
				report1,
				report2);
	}

	@Test
	public void testPredefinedsEmpty() {
		String report2 = ConversionModuleAnalyzer.createPredefinedsDeclarationText(new BasicEList<CmPredefined>());

		assertEquals("Формирование модуля обмена: Добавить пустую процедуру описания ПКПД", "", report2);
	}

	@Test
	public void testPredefinedsReceiving() {
		String report1 = String.join(LS,
				String.format(ROUTE_IF_ELSEIF, "", RECEIVING_ROUTE),
				"	" + String.format(BEGIN_OF_PREDEFINED, RECEIVING_NAME.concat("1")),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, RECEIVING_NAME.concat("1")),
				"	" + EMPTY_CONFIGURATION_OBJECT,
				"	" + EMPTY_FORMAT_OBJECT,
				"	" + "",
				"	" + BEGIN_OF_RECEIVING_VALUES_SECTION,
				"	" + END_OF_RECEIVING_VALUES_SECTION,
				"	" + "",
				"	" + String.format(BEGIN_OF_PREDEFINED, RECEIVING_NAME.concat("2")),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, RECEIVING_NAME.concat("2")),
				"	" + EMPTY_CONFIGURATION_OBJECT,
				"	" + EMPTY_FORMAT_OBJECT,
				"	" + "",
				"	" + BEGIN_OF_RECEIVING_VALUES_SECTION,
				"	" + END_OF_RECEIVING_VALUES_SECTION,
				ENDIF);

		EList<CmPredefined> predefineds = new BasicEList<>();
		ConversionModuleAnalyzerUtils.addFilledPredefined(RECEIVING_NAME.concat("1"), false, false, true, predefineds);
		ConversionModuleAnalyzerUtils.addFilledPredefined(RECEIVING_NAME.concat("2"), false, false, true, predefineds);

		String report2 = ConversionModuleAnalyzer.createPredefinedsDeclarationText(predefineds);

		assertEquals("Формирование модуля обмена: Добавить процедуру описания ПКПД событий получения",
				report1,
				report2);
	}

	@Test
	public void testPredefinedsSending() {
		String report1 = String.join(LS,
				String.format(ROUTE_IF_ELSEIF, "", SENDING_ROUTE),
				"	" + String.format(BEGIN_OF_PREDEFINED, SENDING_NAME.concat("1")),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, SENDING_NAME.concat("1")),
				"	" + EMPTY_CONFIGURATION_OBJECT,
				"	" + EMPTY_FORMAT_OBJECT,
				"	" + "",
				"	" + BEGIN_OF_SENDING_VALUES_SECTION,
				"	" + END_OF_SENDING_VALUES_SECTION,
				"	" + "",
				"	" + String.format(BEGIN_OF_PREDEFINED, SENDING_NAME.concat("2")),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, SENDING_NAME.concat("2")),
				"	" + EMPTY_CONFIGURATION_OBJECT,
				"	" + EMPTY_FORMAT_OBJECT,
				"	" + "",
				"	" + BEGIN_OF_SENDING_VALUES_SECTION,
				"	" + END_OF_SENDING_VALUES_SECTION,
				ENDIF);

		EList<CmPredefined> predefineds = new BasicEList<>();
		ConversionModuleAnalyzerUtils.addFilledPredefined(SENDING_NAME.concat("1"), false, true, false, predefineds);
		ConversionModuleAnalyzerUtils.addFilledPredefined(SENDING_NAME.concat("2"), false, true, false, predefineds);

		String report2 = ConversionModuleAnalyzer.createPredefinedsDeclarationText(predefineds);

		assertEquals("Формирование модуля обмена: Добавить процедуру описания ПКПД событий отправки", report1, report2);
	}

	@Test
	public void testPredefinedsSendingOrReceiving() {
		String report1 = String.join(LS,
				String.format(ROUTE_IF_ELSEIF, "", SENDING_ROUTE),
				"	" + String.format(BEGIN_OF_PREDEFINED, SENDING_NAME.concat("1")),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, SENDING_NAME.concat("1")),
				"	" + EMPTY_CONFIGURATION_OBJECT,
				"	" + EMPTY_FORMAT_OBJECT,
				"	" + "",
				"	" + BEGIN_OF_SENDING_VALUES_SECTION,
				"	" + END_OF_SENDING_VALUES_SECTION,
				"	" + "",
				"	" + String.format(BEGIN_OF_PREDEFINED, SENDING_NAME.concat("2")),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, SENDING_NAME.concat("2")),
				"	" + EMPTY_CONFIGURATION_OBJECT,
				"	" + EMPTY_FORMAT_OBJECT,
				"	" + "",
				"	" + BEGIN_OF_SENDING_VALUES_SECTION,
				"	" + END_OF_SENDING_VALUES_SECTION,
				ENDIF,
				String.format(ROUTE_IF_ELSEIF, "", RECEIVING_ROUTE),
				"	" + String.format(BEGIN_OF_PREDEFINED, RECEIVING_NAME.concat("1")),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, RECEIVING_NAME.concat("1")),
				"	" + EMPTY_CONFIGURATION_OBJECT,
				"	" + EMPTY_FORMAT_OBJECT,
				"	" + "",
				"	" + BEGIN_OF_RECEIVING_VALUES_SECTION,
				"	" + END_OF_RECEIVING_VALUES_SECTION,
				"	" + "",
				"	" + String.format(BEGIN_OF_PREDEFINED, RECEIVING_NAME.concat("2")),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, RECEIVING_NAME.concat("2")),
				"	" + EMPTY_CONFIGURATION_OBJECT,
				"	" + EMPTY_FORMAT_OBJECT,
				"	" + "",
				"	" + BEGIN_OF_RECEIVING_VALUES_SECTION,
				"	" + END_OF_RECEIVING_VALUES_SECTION,
				ENDIF);

		EList<CmPredefined> predefineds = new BasicEList<>();
		ConversionModuleAnalyzerUtils.addFilledPredefined(SENDING_NAME.concat("1"), false, true, false, predefineds);
		ConversionModuleAnalyzerUtils.addFilledPredefined(RECEIVING_NAME.concat("1"), false, false, true, predefineds);
		ConversionModuleAnalyzerUtils.addFilledPredefined(SENDING_NAME.concat("2"), false, true, false, predefineds);
		ConversionModuleAnalyzerUtils.addFilledPredefined(RECEIVING_NAME.concat("2"), false, false, true, predefineds);

		String report2 = ConversionModuleAnalyzer.createPredefinedsDeclarationText(predefineds);

		assertEquals("Формирование модуля обмена: Добавить процедуру описания ПКПД событий отправки или получения",
				report1,
				report2);
	}

}
