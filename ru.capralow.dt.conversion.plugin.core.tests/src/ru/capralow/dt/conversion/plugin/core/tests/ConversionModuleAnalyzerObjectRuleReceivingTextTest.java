package ru.capralow.dt.conversion.plugin.core.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ru.capralow.dt.conversion.plugin.core.ConversionModuleAnalyzer;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmFactory;

public class ConversionModuleAnalyzerObjectRuleReceivingTextTest {
	private static final String LS = System.lineSeparator();

	private static final String NEW_RULE = "	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);";
	private static final String NEW_HEADER = "	СвойстваШапки = ПравилоКонвертации.Свойства;";

	private static final String FILLED_CONFIGURATION_OBJECT = "	ПравилоКонвертации.ОбъектДанных                 = Метаданные.Справочники.Организации;";
	private static final String FILLED_FORMAT_OBJECT = "	ПравилоКонвертации.ОбъектФормата                = \"Справочник.Организации\";";

	private static final String EMPTY_CONFIGURATION_OBJECT = "	ПравилоКонвертации.ОбъектДанных                 = Неопределено;";
	private static final String EMPTY_FORMAT_OBJECT = "	ПравилоКонвертации.ОбъектФормата                = \"\";";

	private static final String FOR_GROUP = "	ПравилоКонвертации.ПравилоДляГруппыСправочника  = Истина;";

	private static final String IDENTIFICATION_UUID = "	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";";
	private static final String IDENTIFICATION_SEARCH_FIELDS = "	ПравилоКонвертации.ВариантИдентификации         = \"ПоПолямПоиска\";";
	private static final String IDENTIFICATION_UUID_THEN_SEARCH_FIELDS = "	ПравилоКонвертации.ВариантИдентификации         = \"СначалаПоУникальномуИдентификаторуПотомПоПолямПоиска\";";

	private static final String IDENTIFICATION_FIELDS1 = "	ПравилоКонвертации.ПоляПоиска.Добавить(\"Ссылка\");";

	private static final String IDENTIFICATION_FIELDS2 = String.join(LS,
			"	ПравилоКонвертации.ПоляПоиска.Добавить(\"ГоловнаяОрганизация\");",
			"	ПравилоКонвертации.ПоляПоиска.Добавить(\"ИНН,Префикс\");");

	private static final String AFTER_RECEIVING_ALGORITHM_DECLARATION = "	ПравилоКонвертации.ПослеЗагрузкиВсехДанных      = \"АлгоритмПослеЗагрузкиВсехДанных\";";
	private static final String AFTER_RECEIVING_ALGORITHM_NAME = "АлгоритмПослеЗагрузкиВсехДанных";

	private static final String HEADER_SECTION = String.join(LS,
			"	ДобавитьПКС(СвойстваШапки, \"\",                    \"КПП\");",
			"	ДобавитьПКС(СвойстваШапки, \"ГоловнаяОрганизация\", \"\", , \"ПКООтправкиОбъектКонфигурации\");",
			"	ДобавитьПКС(СвойстваШапки, \"ИНН\",                 \"\");",
			"	ДобавитьПКС(СвойстваШапки, \"Наименование\",        \"Наименование\");",
			"	ДобавитьПКС(СвойстваШапки, \"\",                    \"ГоловнаяОрганизация\", 1, \"ПКООтправкиОбъектФорматаСПолями\");");
	private static final String FIRST_TABULAR_SECTION = String.join(LS,
			"	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, \"ДополнительныеРеквизиты\", \"ДополнительныеРеквизиты\");",
			"	ДобавитьПКС(СвойстваТЧ, \"Значение\", \"ЗначениеСвойства\");",
			"	ДобавитьПКС(СвойстваТЧ, \"Свойство\", \"\", ,\"НесуществующееПравило\");");
	private static final String SECOND_TABULAR_SECTION = String.join(LS,
			"	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, \"КонтактнаяИнформация\",    \"КонтактнаяИнформация\");",
			"	ДобавитьПКС(СвойстваТЧ, \"Вид\", \"ВидКонтактнойИнформации\", ,\"ВидыКонтактнойИнформации\");");

	private static final String END_OF_PROCEDURE = "КонецПроцедуры";
	private static final String END_OF_REGION = "#КонецОбласти";

	private static final String BEFORE_RECEIVING_EVENT_TEXT = "	Сообщить(\"ПриКонвертацииДанныхXDTO\");";
	private static final String ON_RECEIVING_EVENT_TEXT = "	Сообщить(\"ПередЗаписьюПолученныхДанных\");";
	private static final String AFTER_RECEIVING_ALGORITHM_PARAMS = "Объект, КомпонентыОбмена, ОбъектМодифицирован";

	private static final String BEFORE_RECEIVING_EVENT_SECTION = String.join(LS,
			"_ПриКонвертацииДанныхXDTO(ДанныеXDTO, ПолученныеДанные, КомпонентыОбмена)",
			BEFORE_RECEIVING_EVENT_TEXT,
			END_OF_PROCEDURE);
	private static final String ON_RECEIVING_EVENT_SECTION = String.join(LS,
			"_ПередЗаписьюПолученныхДанных(ПолученныеДанные, ДанныеИБ, КонвертацияСвойств, КомпонентыОбмена)",
			ON_RECEIVING_EVENT_TEXT,
			END_OF_PROCEDURE);

	@Test
	public void testConfigurationFormatObject() {
		String report1 = String.join(LS,
				"#Область ПКОПолученияОбъектКонфигурацииФормата",
				"Процедура ДобавитьПКО_ПКОПолученияОбъектКонфигурацииФормата(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияОбъектКонфигурацииФормата\";",
				FILLED_CONFIGURATION_OBJECT,
				FILLED_FORMAT_OBJECT,
				IDENTIFICATION_UUID,
				"	",
				"",
				END_OF_PROCEDURE,
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияОбъектКонфигурацииФормата", true, true, false, true, false, null);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c объектами конфигурации и формата",
				report1,
				report2.toString());
	}

	@Test
	public void testConfigurationFormatObjectWithFields() {
		String report1 = String.join(LS,
				"#Область ПКОПолученияОбъектКонфигурацииФорматаСПолями",
				"Процедура ДобавитьПКО_ПКОПолученияОбъектКонфигурацииФорматаСПолями(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияОбъектКонфигурацииФорматаСПолями\";",
				FILLED_CONFIGURATION_OBJECT,
				FILLED_FORMAT_OBJECT,
				IDENTIFICATION_UUID,
				"	",
				NEW_HEADER,
				HEADER_SECTION,
				"",
				END_OF_PROCEDURE,
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule(
				"ПКОПолученияОбъектКонфигурацииФорматаСПолями",
				true,
				true,
				false,
				true,
				false,
				null);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals(
				"Формирование модуля обмена: Добавить ПКО для получения c объектами конфигурации и формата и полями",
				report1,
				report2.toString());
	}

	@Test
	public void testConfigurationObject() {
		String report1 = String.join(LS,
				"#Область ПКОПолученияОбъектКонфигурации",
				"Процедура ДобавитьПКО_ПКОПолученияОбъектКонфигурации(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияОбъектКонфигурации\";",
				FILLED_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				IDENTIFICATION_UUID,
				"	",
				"",
				END_OF_PROCEDURE,
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияОбъектКонфигурации", true, false, false, true, false, null);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c объектом конфигурации",
				report1,
				report2.toString());
	}

	@Test
	public void testConfigurationObjectWithFields() {
		String report1 = String.join(LS,
				"#Область ПКОПолученияОбъектКонфигурацииСПолями",
				"Процедура ДобавитьПКО_ПКОПолученияОбъектКонфигурацииСПолями(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияОбъектКонфигурацииСПолями\";",
				FILLED_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				IDENTIFICATION_UUID,
				"	",
				NEW_HEADER,
				HEADER_SECTION,
				"",
				END_OF_PROCEDURE,
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияОбъектКонфигурацииСПолями", true, false, false, true, false, null);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c объектом конфигурации и полями",
				report1,
				report2.toString());
	}

	@Test
	public void testEmpty() {
		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		objectRule.setForReceiving(true);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals("Формирование модуля обмена: Добавить пустое ПКО для получения", "", report2.toString());
	}

	@Test
	public void testEvent1() {
		String report1 = String.join(LS,
				"#Область ПКОПолученияСобытие1",
				"Процедура ДобавитьПКО_ПКОПолученияСобытие1(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияСобытие1\";",
				EMPTY_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				"	ПравилоКонвертации.ПриКонвертацииДанныхXDTO     = \"ПКО_ПКОПолученияСобытие1_ПриКонвертацииДанныхXDTO\";",
				IDENTIFICATION_UUID,
				"	",
				"",
				END_OF_PROCEDURE,
				"",
				"Процедура ПКО_ПКОПолученияСобытие1".concat(BEFORE_RECEIVING_EVENT_SECTION),
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияСобытие1", false, false, false, true, false, null);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(false, true, false, "", "", objectRule, null);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c событием ПриКонвертацииДанныхXDTO",
				report1,
				report2.toString());
	}

	@Test
	public void testEvent13() {
		String report1 = String.join(LS,
				"#Область ПКОПолученияСобытие13",
				"Процедура ДобавитьПКО_ПКОПолученияСобытие13(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияСобытие13\";",
				EMPTY_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				"	ПравилоКонвертации.ПриКонвертацииДанныхXDTO     = \"ПКО_ПКОПолученияСобытие13_ПриКонвертацииДанныхXDTO\";",
				AFTER_RECEIVING_ALGORITHM_DECLARATION,
				IDENTIFICATION_UUID,
				"	",
				"",
				END_OF_PROCEDURE,
				"",
				"Процедура ПКО_ПКОПолученияСобытие13".concat(BEFORE_RECEIVING_EVENT_SECTION),
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияСобытие13", false, false, false, true, false, null);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(false,
				true,
				false,
				AFTER_RECEIVING_ALGORITHM_NAME,
				AFTER_RECEIVING_ALGORITHM_PARAMS,
				objectRule,
				null);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals(
				"Формирование модуля обмена: Добавить ПКО для получения c событиями ПриКонвертацииДанныхXDTO и ПослеЗагрузкиВсехДанных",
				report1,
				report2.toString());
	}

	@Test
	public void testEvent2() {
		String report1 = String.join(LS,
				"#Область ПКОПолученияСобытие2",
				"Процедура ДобавитьПКО_ПКОПолученияСобытие2(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияСобытие2\";",
				EMPTY_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				"	ПравилоКонвертации.ПередЗаписьюПолученныхДанных = \"ПКО_ПКОПолученияСобытие2_ПередЗаписьюПолученныхДанных\";",
				IDENTIFICATION_UUID,
				"	",
				"",
				END_OF_PROCEDURE,
				"",
				"Процедура ПКО_ПКОПолученияСобытие2".concat(ON_RECEIVING_EVENT_SECTION),
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияСобытие2", false, false, false, true, false, null);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(false, false, true, "", "", objectRule, null);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c событием ПередЗаписьюПолученныхДанных",
				report1,
				report2.toString());
	}

	@Test
	public void testEvent23() {
		String report1 = String.join(LS,
				"#Область ПКОПолученияСобытие23",
				"Процедура ДобавитьПКО_ПКОПолученияСобытие23(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияСобытие23\";",
				EMPTY_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				"	ПравилоКонвертации.ПередЗаписьюПолученныхДанных = \"ПКО_ПКОПолученияСобытие23_ПередЗаписьюПолученныхДанных\";",
				AFTER_RECEIVING_ALGORITHM_DECLARATION,
				IDENTIFICATION_UUID,
				"	",
				"",
				END_OF_PROCEDURE,
				"",
				"Процедура ПКО_ПКОПолученияСобытие23".concat(ON_RECEIVING_EVENT_SECTION),
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияСобытие23", false, false, false, true, false, null);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(false,
				false,
				true,
				AFTER_RECEIVING_ALGORITHM_NAME,
				AFTER_RECEIVING_ALGORITHM_PARAMS,
				objectRule,
				null);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals(
				"Формирование модуля обмена: Добавить ПКО для получения c событиями ПередЗаписьюПолученныхДанных и ПослеЗагрузкиВсехДанных",
				report1,
				report2.toString());
	}

	@Test
	public void testEvent3() {
		String report1 = String.join(LS,
				"#Область ПКОПолученияСобытие3",
				"Процедура ДобавитьПКО_ПКОПолученияСобытие3(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияСобытие3\";",
				EMPTY_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				AFTER_RECEIVING_ALGORITHM_DECLARATION,
				IDENTIFICATION_UUID,
				"	",
				"",
				END_OF_PROCEDURE,
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияСобытие3", false, false, false, true, false, null);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(false,
				false,
				false,
				AFTER_RECEIVING_ALGORITHM_NAME,
				AFTER_RECEIVING_ALGORITHM_PARAMS,
				objectRule,
				null);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c событием ПослеЗагрузкиВсехДанных",
				report1,
				report2.toString());
	}

	@Test
	public void testFormatObject() {
		String report1 = String.join(LS,
				"#Область ПКОПолученияОбъектФормата",
				"Процедура ДобавитьПКО_ПКОПолученияОбъектФормата(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияОбъектФормата\";",
				EMPTY_CONFIGURATION_OBJECT,
				FILLED_FORMAT_OBJECT,
				IDENTIFICATION_UUID,
				"	",
				"",
				END_OF_PROCEDURE,
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияОбъектФормата", false, true, false, true, false, null);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c объектом формата",
				report1,
				report2.toString());
	}

	@Test
	public void testFormatObjectWithFields() {
		String report1 = String.join(LS,
				"#Область ПКОПолученияОбъектФорматаСПолями",
				"Процедура ДобавитьПКО_ПКОПолученияОбъектФорматаСПолями(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияОбъектФорматаСПолями\";",
				EMPTY_CONFIGURATION_OBJECT,
				FILLED_FORMAT_OBJECT,
				IDENTIFICATION_UUID,
				"	",
				NEW_HEADER,
				HEADER_SECTION,
				"",
				END_OF_PROCEDURE,
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияОбъектФорматаСПолями", false, true, false, true, false, null);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c объектом формата и полями",
				report1,
				report2.toString());
	}

	@Test
	public void testFull() {
		String report1 = String.join(LS,
				"#Область ПКОПолученияПолное",
				"Процедура ДобавитьПКО_ПКОПолученияПолное(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияПолное\";",
				FILLED_CONFIGURATION_OBJECT,
				FILLED_FORMAT_OBJECT,
				FOR_GROUP,
				"	ПравилоКонвертации.ПриКонвертацииДанныхXDTO     = \"ПКО_ПКОПолученияПолное_ПриКонвертацииДанныхXDTO\";",
				"	ПравилоКонвертации.ПередЗаписьюПолученныхДанных = \"ПКО_ПКОПолученияПолное_ПередЗаписьюПолученныхДанных\";",
				AFTER_RECEIVING_ALGORITHM_DECLARATION,
				IDENTIFICATION_UUID,
				"	",
				NEW_HEADER,
				HEADER_SECTION,
				"	",
				FIRST_TABULAR_SECTION,
				"	",
				SECOND_TABULAR_SECTION,
				"",
				IDENTIFICATION_FIELDS2,
				END_OF_PROCEDURE,
				"",
				"Процедура ПКО_ПКОПолученияПолное".concat(BEFORE_RECEIVING_EVENT_SECTION),
				"",
				"Процедура ПКО_ПКОПолученияПолное".concat(ON_RECEIVING_EVENT_SECTION),
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияПолное", true, true, false, true, true, null);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(false,
				true,
				true,
				AFTER_RECEIVING_ALGORITHM_NAME,
				AFTER_RECEIVING_ALGORITHM_PARAMS,
				objectRule,
				null);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);
		ConversionModuleAnalyzerUtils.addIdentificationFields2(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения полное", report1, report2.toString());
	}

	@Test
	public void testHeader() {
		String report1 = String.join(LS,
				"#Область ПКОПолученияШапка",
				"Процедура ДобавитьПКО_ПКОПолученияШапка(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияШапка\";",
				FILLED_CONFIGURATION_OBJECT,
				FILLED_FORMAT_OBJECT,
				IDENTIFICATION_UUID,
				"	",
				NEW_HEADER,
				HEADER_SECTION,
				"",
				END_OF_PROCEDURE,
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияШапка", true, true, false, true, false, null);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c шапкой", report1, report2.toString());
	}

	@Test
	public void testHeaderAndTabularSection() {
		String report1 = String.join(LS,
				"#Область ПКОПолученияШапкаТЧ",
				"Процедура ДобавитьПКО_ПКОПолученияШапкаТЧ(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияШапкаТЧ\";",
				FILLED_CONFIGURATION_OBJECT,
				FILLED_FORMAT_OBJECT,
				IDENTIFICATION_UUID,
				"	",
				NEW_HEADER,
				HEADER_SECTION,
				"	",
				FIRST_TABULAR_SECTION,
				"",
				END_OF_PROCEDURE,
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияШапкаТЧ", true, true, false, true, false, null);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения шапки и табличной части",
				report1,
				report2.toString());
	}

	@Test
	public void testIdentificationVariant1WithFields() {
		String report1 = String.join(LS,
				"#Область ПКОПолученияИдентификация1СПолями",
				"Процедура ДобавитьПКО_ПКОПолученияИдентификация1СПолями(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияИдентификация1СПолями\";",
				FILLED_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				IDENTIFICATION_UUID,
				"	",
				"",
				IDENTIFICATION_FIELDS2,
				END_OF_PROCEDURE,
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияИдентификация1СПолями", true, false, false, true, false, null);
		ConversionModuleAnalyzerUtils.addIdentificationFields2(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения по УУИД с полями",
				report1,
				report2.toString());
	}

	@Test
	public void testIdentificationVariant2NoFields() {
		String report1 = String.join(LS,
				"#Область ПКОПолученияИдентификация2",
				"Процедура ДобавитьПКО_ПКОПолученияИдентификация2(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияИдентификация2\";",
				EMPTY_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				IDENTIFICATION_SEARCH_FIELDS,
				"	",
				"",
				END_OF_PROCEDURE,
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияИдентификация2", false, false, false, true, false, null);
		objectRule.setIdentificationVariant(CmIdentificationVariant.SEARCH_FIELDS);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения по Полям поиска без полей",
				report1,
				report2.toString());
	}

	@Test
	public void testIdentificationVariant2WithFields() {
		String report1 = String.join(LS,
				"#Область ПКОПолученияИдентификация2СПолями",
				"Процедура ДобавитьПКО_ПКОПолученияИдентификация2СПолями(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияИдентификация2СПолями\";",
				EMPTY_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				IDENTIFICATION_SEARCH_FIELDS,
				"	",
				"",
				IDENTIFICATION_FIELDS1,
				END_OF_PROCEDURE,
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияИдентификация2СПолями", false, false, false, true, false, null);
		objectRule.setIdentificationVariant(CmIdentificationVariant.SEARCH_FIELDS);
		ConversionModuleAnalyzerUtils.addIdentificationFields1(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения по Полям поиска с полями",
				report1,
				report2.toString());
	}

	@Test
	public void testIdentificationVariant3NoFields() {
		String report1 = String.join(LS,
				"#Область ПКОПолученияИдентификация3",
				"Процедура ДобавитьПКО_ПКОПолученияИдентификация3(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияИдентификация3\";",
				EMPTY_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				IDENTIFICATION_UUID_THEN_SEARCH_FIELDS,
				"	",
				"",
				END_OF_PROCEDURE,
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияИдентификация3", false, false, false, true, false, null);
		objectRule.setIdentificationVariant(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения по УУИД и Полям поиска без полей",
				report1,
				report2.toString());
	}

	@Test
	public void testIdentificationVariant3WithFields() {
		String report1 = String.join(LS,
				"#Область ПКОПолученияИдентификация3СПолями",
				"Процедура ДобавитьПКО_ПКОПолученияИдентификация3СПолями(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияИдентификация3СПолями\";",
				FILLED_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				IDENTIFICATION_UUID_THEN_SEARCH_FIELDS,
				"	",
				"",
				IDENTIFICATION_FIELDS2,
				END_OF_PROCEDURE,
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияИдентификация3СПолями", true, false, false, true, false, null);
		objectRule.setIdentificationVariant(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS);
		ConversionModuleAnalyzerUtils.addIdentificationFields2(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения по УУИД и Полям поиска с полями",
				report1,
				report2.toString());
	}

	@Test
	public void testNameOnly() {
		String report1 = String.join(LS,
				"#Область МинимальноеПКОПолучения",
				"Процедура ДобавитьПКО_МинимальноеПКОПолучения(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"МинимальноеПКОПолучения\";",
				EMPTY_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				IDENTIFICATION_UUID,
				"	",
				"",
				END_OF_PROCEDURE,
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("МинимальноеПКОПолучения", false, false, false, true, false, null);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения с минимумом данных",
				report1,
				report2.toString());
	}

	@Test
	public void testNameOnlyForGroup() {
		String report1 = String.join(LS,
				"#Область МинимальноеПКОПолученияДляГруппы",
				"Процедура ДобавитьПКО_МинимальноеПКОПолученияДляГруппы(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"МинимальноеПКОПолученияДляГруппы\";",
				EMPTY_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				FOR_GROUP,
				IDENTIFICATION_UUID,
				"	",
				"",
				END_OF_PROCEDURE,
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("МинимальноеПКОПолученияДляГруппы", false, false, false, true, true, null);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения с минимумом данных для группы",
				report1,
				report2.toString());
	}

	@Test
	public void testTabularSection() {
		String report1 = String.join(LS,
				"#Область ПКОПолученияТЧ",
				"Процедура ДобавитьПКО_ПКОПолученияТЧ(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияТЧ\";",
				FILLED_CONFIGURATION_OBJECT,
				FILLED_FORMAT_OBJECT,
				IDENTIFICATION_UUID,
				"	",
				"	",
				FIRST_TABULAR_SECTION,
				"",
				END_OF_PROCEDURE,
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияТЧ", true, true, false, true, false, null);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c табличной частью",
				report1,
				report2.toString());
	}

	@Test
	public void testTwoTabularSections() {
		String report1 = String.join(LS,
				"#Область ПКОПолученияДвеТЧ",
				"Процедура ДобавитьПКО_ПКОПолученияДвеТЧ(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияДвеТЧ\";",
				FILLED_CONFIGURATION_OBJECT,
				FILLED_FORMAT_OBJECT,
				IDENTIFICATION_UUID,
				"	",
				"	",
				FIRST_TABULAR_SECTION,
				"	",
				SECOND_TABULAR_SECTION,
				"",
				END_OF_PROCEDURE,
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияДвеТЧ", true, true, false, true, false, null);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения с двумя ТЧ", report1, report2.toString());
	}

	@Test
	public void testWEvent12() {
		String report1 = String.join(LS,
				"#Область ПКОПолученияСобытие12",
				"Процедура ДобавитьПКО_ПКОПолученияСобытие12(ПравилаКонвертации)",
				"",
				NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияСобытие12\";",
				EMPTY_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				"	ПравилоКонвертации.ПриКонвертацииДанныхXDTO     = \"ПКО_ПКОПолученияСобытие12_ПриКонвертацииДанныхXDTO\";",
				"	ПравилоКонвертации.ПередЗаписьюПолученныхДанных = \"ПКО_ПКОПолученияСобытие12_ПередЗаписьюПолученныхДанных\";",
				IDENTIFICATION_UUID,
				"	",
				"",
				END_OF_PROCEDURE,
				"",
				"Процедура ПКО_ПКОПолученияСобытие12".concat(BEFORE_RECEIVING_EVENT_SECTION),
				"",
				"Процедура ПКО_ПКОПолученияСобытие12".concat(ON_RECEIVING_EVENT_SECTION),
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияСобытие12", false, false, false, true, false, null);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(false, true, true, "", "", objectRule, null);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, report2);

		assertEquals(
				"Формирование модуля обмена: Добавить ПКО для получения c событиями ПриКонвертацииДанныхXDTO и ПередЗаписьюПолученныхДанных",
				report1,
				report2.toString());
	}

}
