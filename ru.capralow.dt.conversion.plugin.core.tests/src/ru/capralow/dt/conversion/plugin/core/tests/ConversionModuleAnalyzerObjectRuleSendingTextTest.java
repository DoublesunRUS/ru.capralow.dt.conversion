package ru.capralow.dt.conversion.plugin.core.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ru.capralow.dt.conversion.plugin.core.ConversionModuleAnalyzer;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmFactory;

public class ConversionModuleAnalyzerObjectRuleSendingTextTest {
	private static final String LS = System.lineSeparator();

	private static final String NEW_RULE = "	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);";
	private static final String NEW_HEADER = "	СвойстваШапки = ПравилоКонвертации.Свойства;";

	private static final String FILLED_CONFIGURATION_OBJECT = "	ПравилоКонвертации.ОбъектДанных      = Метаданные.Справочники.Организации;";
	private static final String FILLED_FORMAT_OBJECT = "	ПравилоКонвертации.ОбъектФормата     = \"Справочник.Организации\";";

	private static final String EMPTY_CONFIGURATION_OBJECT = "	ПравилоКонвертации.ОбъектДанных      = Неопределено;";
	private static final String EMPTY_FORMAT_OBJECT = "	ПравилоКонвертации.ОбъектФормата     = \"\";";

	private static final String HEADER_SECTION = String.join(LS,
			"	ДобавитьПКС(СвойстваШапки, \"\",                    \"КПП\");",
			"	ДобавитьПКС(СвойстваШапки, \"ГоловнаяОрганизация\", \"\", , \"ПКООтправкиОбъектКонфигурации\");",
			"	ДобавитьПКС(СвойстваШапки, \"ИНН\",                 \"\");",
			"	ДобавитьПКС(СвойстваШапки, \"Наименование\",        \"Наименование\");",
			"	ДобавитьПКС(СвойстваШапки, \"\",                    \"ГоловнаяОрганизация\", 1, \"ПКООтправкиОбъектФорматаСПолями\");");
	private static final String FIRST_TABULAR_SECTION = String.join(LS,
			"	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, \"ДополнительныеРеквизиты\", \"ДополнительныеРеквизиты\");",
			"	ДобавитьПКС(СвойстваТЧ, \"Значение\", \"ЗначениеСвойства\");",
			"	ДобавитьПКС(СвойстваТЧ, \"\",         \"ЗначениеСвойства\", 1,\"НесуществующееПравило\");");
	private static final String SECOND_TABULAR_SECTION = String.join(LS,
			"	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, \"КонтактнаяИнформация\",    \"КонтактнаяИнформация\");",
			"	ДобавитьПКС(СвойстваТЧ, \"Вид\", \"ВидКонтактнойИнформации\", ,\"ВидыКонтактнойИнформации\");");

	private static final String END_OF_PROCEDURE = "КонецПроцедуры";
	private static final String END_OF_REGION = "#КонецОбласти";

	private static final String ON_SENDING_EVENT_TEXT = "	Сообщить(\"ПриОтправкеДанных\");";
	private static final String ON_SENDING_EVENT_SECTION = String.join(LS,
			"_ПриОтправкеДанных(ДанныеИБ, ДанныеXDTO, КомпонентыОбмена, СтекВыгрузки)", ON_SENDING_EVENT_TEXT,
			END_OF_PROCEDURE);

	@Test
	public void testConfigurationFormatObject() {
		String report1 = String.join(LS, "#Область ПКООтправкиОбъектКонфигурацииФормата",
				"Процедура ДобавитьПКО_ПКООтправкиОбъектКонфигурацииФормата(ПравилаКонвертации)", "", NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиОбъектКонфигурацииФормата\";",
				FILLED_CONFIGURATION_OBJECT, FILLED_FORMAT_OBJECT, "	", "", END_OF_PROCEDURE, END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиОбъектКонфигурацииФормата", true, true, true, false, false);

		ConversionModuleAnalyzer.createObjectRuleSendingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки c объектами конфигурации и формата",
				report1, report2.toString());
	}

	@Test
	public void testConfigurationFormatObjectWithFields() {
		String report1 = String.join(LS, "#Область ПКООтправкиОбъектКонфигурацииФорматаСПолями",
				"Процедура ДобавитьПКО_ПКООтправкиОбъектКонфигурацииФорматаСПолями(ПравилаКонвертации)", "", NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиОбъектКонфигурацииФорматаСПолями\";",
				FILLED_CONFIGURATION_OBJECT, FILLED_FORMAT_OBJECT, "	", NEW_HEADER, HEADER_SECTION, "",
				END_OF_PROCEDURE, END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиОбъектКонфигурацииФорматаСПолями", true, true, true, false, false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);

		ConversionModuleAnalyzer.createObjectRuleSendingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals(
				"Формирование модуля обмена: Добавить ПКО для отправки c объектами конфигурации и формата и полями",
				report1, report2.toString());
	}

	@Test
	public void testConfigurationObject() {
		String report1 = String.join(LS, "#Область ПКООтправкиОбъектКонфигурации",
				"Процедура ДобавитьПКО_ПКООтправкиОбъектКонфигурации(ПравилаКонвертации)", "", NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиОбъектКонфигурации\";",
				FILLED_CONFIGURATION_OBJECT, EMPTY_FORMAT_OBJECT, "	", "", END_OF_PROCEDURE, END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиОбъектКонфигурации",
				true, false, true, false, false);

		ConversionModuleAnalyzer.createObjectRuleSendingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки c объектом конфигурации", report1,
				report2.toString());
	}

	@Test
	public void testConfigurationObjectWithFields() {
		String report1 = String.join(LS, "#Область ПКООтправкиОбъектКонфигурацииСПолями",
				"Процедура ДобавитьПКО_ПКООтправкиОбъектКонфигурацииСПолями(ПравилаКонвертации)", "", NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиОбъектКонфигурацииСПолями\";",
				FILLED_CONFIGURATION_OBJECT, EMPTY_FORMAT_OBJECT, "	", NEW_HEADER, HEADER_SECTION, "", END_OF_PROCEDURE,
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиОбъектКонфигурацииСПолями", true, false, true, false, false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);

		ConversionModuleAnalyzer.createObjectRuleSendingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки c объектом конфигурации и полями", report1,
				report2.toString());
	}

	@Test
	public void testEmpty() {
		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();

		ConversionModuleAnalyzer.createObjectRuleSendingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить пустое ПКО для отправки", "", report2.toString());
	}

	@Test
	public void testEvent() {
		String report1 = String.join(LS, "#Область ПКООтправкиСобытие1",
				"Процедура ДобавитьПКО_ПКООтправкиСобытие1(ПравилаКонвертации)", "", NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиСобытие1\";", EMPTY_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				"	ПравилоКонвертации.ПриОтправкеДанных = \"ПКО_ПКООтправкиСобытие1_ПриОтправкеДанных\";", "	", "",
				END_OF_PROCEDURE, "", "Процедура ПКО_ПКООтправкиСобытие1".concat(ON_SENDING_EVENT_SECTION),
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиСобытие1", false, false,
				true, false, false);
		ConversionModuleAnalyzerUtils.addEvents(true, false, false, false, objectRule, null);

		ConversionModuleAnalyzer.createObjectRuleSendingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки c событием ПриОтправкеДанных", report1,
				report2.toString());
	}

	@Test
	public void testFormatObject() {
		String report1 = String.join(LS, "#Область ПКООтправкиОбъектФормата",
				"Процедура ДобавитьПКО_ПКООтправкиОбъектФормата(ПравилаКонвертации)", "", NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиОбъектФормата\";", EMPTY_CONFIGURATION_OBJECT,
				FILLED_FORMAT_OBJECT, "	", "", END_OF_PROCEDURE, END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиОбъектФормата", false,
				true, true, false, false);

		ConversionModuleAnalyzer.createObjectRuleSendingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки c объектом формата", report1,
				report2.toString());
	}

	@Test
	public void testFormatObjectWithFields() {
		String report1 = String.join(LS, "#Область ПКООтправкиОбъектФорматаСПолями",
				"Процедура ДобавитьПКО_ПКООтправкиОбъектФорматаСПолями(ПравилаКонвертации)", "", NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиОбъектФорматаСПолями\";",
				EMPTY_CONFIGURATION_OBJECT, FILLED_FORMAT_OBJECT, "	", NEW_HEADER, HEADER_SECTION, "", END_OF_PROCEDURE,
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиОбъектФорматаСПолями",
				false, true, true, false, false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);

		ConversionModuleAnalyzer.createObjectRuleSendingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки c объектом формата и полями", report1,
				report2.toString());
	}

	@Test
	public void testFull() {
		String report1 = String.join(LS, "#Область ПКООтправкиПолное",
				"Процедура ДобавитьПКО_ПКООтправкиПолное(ПравилаКонвертации)", "", NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиПолное\";", FILLED_CONFIGURATION_OBJECT,
				FILLED_FORMAT_OBJECT,
				"	ПравилоКонвертации.ПриОтправкеДанных = \"ПКО_ПКООтправкиПолное_ПриОтправкеДанных\";", "	",
				NEW_HEADER, HEADER_SECTION, "	", FIRST_TABULAR_SECTION, "	", SECOND_TABULAR_SECTION, "",
				END_OF_PROCEDURE, "", "Процедура ПКО_ПКООтправкиПолное".concat(ON_SENDING_EVENT_SECTION),
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолное", true, true,
				true, false, false);
		ConversionModuleAnalyzerUtils.addEvents(true, false, false, false, objectRule, null);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);

		ConversionModuleAnalyzer.createObjectRuleSendingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки полное", report1, report2.toString());
	}

	@Test
	public void testHeader() {
		String report1 = String.join(LS, "#Область ПКООтправкиШапка",
				"Процедура ДобавитьПКО_ПКООтправкиШапка(ПравилаКонвертации)", "", NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиШапка\";", FILLED_CONFIGURATION_OBJECT,
				FILLED_FORMAT_OBJECT, "	", NEW_HEADER, HEADER_SECTION, "", END_OF_PROCEDURE, END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиШапка", true, true,
				true, false, false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);

		ConversionModuleAnalyzer.createObjectRuleSendingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки c шапкой", report1, report2.toString());
	}

	@Test
	public void testHeaderAndTabularSection() {
		String report1 = String.join(LS, "#Область ПКООтправкиШапкаТЧ",
				"Процедура ДобавитьПКО_ПКООтправкиШапкаТЧ(ПравилаКонвертации)", "", NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиШапкаТЧ\";", FILLED_CONFIGURATION_OBJECT,
				FILLED_FORMAT_OBJECT, "	", NEW_HEADER, HEADER_SECTION, "	", FIRST_TABULAR_SECTION, "",
				END_OF_PROCEDURE, END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиШапкаТЧ", true, true,
				true, false, false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);

		ConversionModuleAnalyzer.createObjectRuleSendingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки шапка и табличная часть", report1,
				report2.toString());
	}

	@Test
	public void testNameOnly() {
		String report1 = String.join(LS, "#Область МинимальноеПКООтправки",
				"Процедура ДобавитьПКО_МинимальноеПКООтправки(ПравилаКонвертации)", "", NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО            = \"МинимальноеПКООтправки\";", EMPTY_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT, "	", "", END_OF_PROCEDURE, END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("МинимальноеПКООтправки", false,
				false, true, false, true);
		objectRule.setIdentificationVariant(CmIdentificationVariant.UUID);

		ConversionModuleAnalyzer.createObjectRuleSendingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки с минимумом данных", report1,
				report2.toString());
	}

	@Test
	public void testTabularSection() {
		String report1 = String.join(LS, "#Область ПКООтправкиТЧ",
				"Процедура ДобавитьПКО_ПКООтправкиТЧ(ПравилаКонвертации)", "", NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиТЧ\";", FILLED_CONFIGURATION_OBJECT,
				FILLED_FORMAT_OBJECT, "	", "	", FIRST_TABULAR_SECTION, "", END_OF_PROCEDURE, END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиТЧ", true, true, true,
				false, false);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);

		ConversionModuleAnalyzer.createObjectRuleSendingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки c табличной частью", report1,
				report2.toString());
	}

	@Test
	public void testTwoTabularSections() {
		String report1 = String.join(LS, "#Область ПКООтправкиДвеТЧ",
				"Процедура ДобавитьПКО_ПКООтправкиДвеТЧ(ПравилаКонвертации)", "", NEW_RULE,
				"	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиДвеТЧ\";", FILLED_CONFIGURATION_OBJECT,
				FILLED_FORMAT_OBJECT, "	", "	", FIRST_TABULAR_SECTION, "	", SECOND_TABULAR_SECTION, "",
				END_OF_PROCEDURE, END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиДвеТЧ", true, true,
				true, false, false);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);

		ConversionModuleAnalyzer.createObjectRuleSendingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки с двумя ТЧ", report1, report2.toString());
	}

}
