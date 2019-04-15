package ru.capralow.dt.conversion.plugin.core.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import ru.capralow.dt.conversion.plugin.core.ConversionModuleAnalyzer;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined;

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
	private static final String ENDIF = "	КонецЕсли;";

	private static final String SENDING_ROUTE = "Отправка";
	private static final String RECEIVING_ROUTE = "Получение";

	private static final String SENDING_NAME = "ПравилоОтправки";
	private static final String RECEIVING_NAME = "ПравилоПолучения";
	private static final String BOTH_NAME = "ПравилоОтправкиПолучения";

	@Test
	public void testDataRulesAll() {
		String report1 = String.join(LS,
				String.format(ROUTE_IF_ELSEIF, "", SENDING_ROUTE),
				ADD_COLUMN,
				String.format(ADD_DATARULE, SENDING_NAME.concat("1")),
				String.format(ADD_DATARULE, SENDING_NAME.concat("2")),
				String.format(ROUTE_IF_ELSEIF, "Иначе", RECEIVING_ROUTE),
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
	public void testObjectRulesAll() {
		String report1 = String.join(LS,
				String.format(ROUTE_IF_ELSEIF, "", SENDING_ROUTE),
				String.format(ADD_OBJECTRULE2, SENDING_NAME.concat("1")),
				String.format(ADD_OBJECTRULE2, SENDING_NAME.concat("2")),
				String.format(ROUTE_IF_ELSEIF, "Иначе", RECEIVING_ROUTE),
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

}
