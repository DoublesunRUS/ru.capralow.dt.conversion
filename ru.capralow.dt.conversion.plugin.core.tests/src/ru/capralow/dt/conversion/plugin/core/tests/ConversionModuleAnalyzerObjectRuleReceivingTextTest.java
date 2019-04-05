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

	private static final String FILLED_CONFIGURATION_OBJECT = "	ПравилоКонвертации.ОбъектДанных      = Метаданные.Справочники.Организации;";
	private static final String FILLED_FORMAT_OBJECT = "	ПравилоКонвертации.ОбъектФормата     = \"Справочник.Организации\";";

	private static final String EMPTY_CONFIGURATION_OBJECT = "	ПравилоКонвертации.ОбъектДанных      = Неопределено;";
	private static final String EMPTY_FORMAT_OBJECT = "	ПравилоКонвертации.ОбъектФормата     = \"\";";

	private static final String ON_SENDING_EVENT_TEXT = "	Сообщить(\"ПриОтправкеДанных\");";
	private static final String BEFORE_RECEIVING_EVENT_TEXT = "	Сообщить(\"ПриКонвертацииДанныхXDTO\");";
	private static final String ON_RECEIVING_EVENT_TEXT = "	Сообщить(\"ПередЗаписьюПолученныхДанных\");";

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
	private static final String ON_SENDING_EVENT_SECTION = String.join(LS,
			"_ПриОтправкеДанных(ДанныеИБ, ДанныеXDTO, КомпонентыОбмена, СтекВыгрузки)", ON_SENDING_EVENT_TEXT);

	private static final String END_OF_PROCEDURE = "КонецПроцедуры";
	private static final String END_OF_REGION = "#КонецОбласти";

	@Test
	public void testConfigurationFormatObject() {
		String report1 = String.join(LS, "#Область ПКОПолученияОбъектКонфигурацииФормата",
				"Процедура ДобавитьПКО_ПКОПолученияОбъектКонфигурацииФормата(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияОбъектКонфигурацииФормата\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Метаданные.Справочники.Организации;",
				"	ПравилоКонвертации.ОбъектФормата                = \"Справочник.Организации\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";", "	", "",
				"КонецПроцедуры", "#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияОбъектКонфигурацииФормата", true, true, false, true, false);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c объектами конфигурации и формата",
				report1, report2.toString());
	}

	@Test
	public void testConfigurationFormatObjectWithFields() {
		String report1 = String.join(LS, "#Область ПКОПолученияОбъектКонфигурацииФорматаСПолями",
				"Процедура ДобавитьПКО_ПКОПолученияОбъектКонфигурацииФорматаСПолями(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияОбъектКонфигурацииФорматаСПолями\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Метаданные.Справочники.Организации;",
				"	ПравилоКонвертации.ОбъектФормата                = \"Справочник.Организации\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";", "	",
				"	СвойстваШапки = ПравилоКонвертации.Свойства;",
				"	ДобавитьПКС(СвойстваШапки, \"\",                    \"КПП\");",
				"	ДобавитьПКС(СвойстваШапки, \"ГоловнаяОрганизация\", \"\", , \"ПКООтправкиОбъектКонфигурации\");",
				"	ДобавитьПКС(СвойстваШапки, \"ИНН\",                 \"\");",
				"	ДобавитьПКС(СвойстваШапки, \"Наименование\",        \"Наименование\");",
				"	ДобавитьПКС(СвойстваШапки, \"\",                    \"ГоловнаяОрганизация\", 1, \"ПКООтправкиОбъектФорматаСПолями\");",
				"", "КонецПроцедуры", "#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияОбъектКонфигурацииФорматаСПолями", true, true, false, true, false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals(
				"Формирование модуля обмена: Добавить ПКО для получения c объектами конфигурации и формата и полями",
				report1, report2.toString());
	}

	@Test
	public void testConfigurationObject() {
		String report1 = String.join(LS, "#Область ПКОПолученияОбъектКонфигурации",
				"Процедура ДобавитьПКО_ПКОПолученияОбъектКонфигурации(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияОбъектКонфигурации\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Метаданные.Справочники.Организации;",
				"	ПравилоКонвертации.ОбъектФормата                = \"\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";", "	", "",
				"КонецПроцедуры", "#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияОбъектКонфигурации",
				true, false, false, true, false);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c объектом конфигурации", report1,
				report2.toString());
	}

	@Test
	public void testConfigurationObjectWithFields() {
		String report1 = String.join(LS, "#Область ПКОПолученияОбъектКонфигурацииСПолями",
				"Процедура ДобавитьПКО_ПКОПолученияОбъектКонфигурацииСПолями(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияОбъектКонфигурацииСПолями\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Метаданные.Справочники.Организации;",
				"	ПравилоКонвертации.ОбъектФормата                = \"\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";", "	",
				"	СвойстваШапки = ПравилоКонвертации.Свойства;",
				"	ДобавитьПКС(СвойстваШапки, \"\",                    \"КПП\");",
				"	ДобавитьПКС(СвойстваШапки, \"ГоловнаяОрганизация\", \"\", , \"ПКООтправкиОбъектКонфигурации\");",
				"	ДобавитьПКС(СвойстваШапки, \"ИНН\",                 \"\");",
				"	ДобавитьПКС(СвойстваШапки, \"Наименование\",        \"Наименование\");",
				"	ДобавитьПКС(СвойстваШапки, \"\",                    \"ГоловнаяОрганизация\", 1, \"ПКООтправкиОбъектФорматаСПолями\");",
				"", "КонецПроцедуры", "#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияОбъектКонфигурацииСПолями", true, false, false, true, false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c объектом конфигурации и полями", report1,
				report2.toString());
	}

	@Test
	public void testEmpty() {
		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить пустое ПКО для получения", "", report2.toString());
	}

	@Test
	public void testFormatObject() {
		String report1 = String.join(LS, "#Область ПКОПолученияОбъектФормата",
				"Процедура ДобавитьПКО_ПКОПолученияОбъектФормата(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияОбъектФормата\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Неопределено;",
				"	ПравилоКонвертации.ОбъектФормата                = \"Справочник.Организации\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";", "	", "",
				"КонецПроцедуры", "#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияОбъектФормата", false,
				true, false, true, false);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c объектом формата", report1,
				report2.toString());
	}

	@Test
	public void testFormatObjectWithFields() {
		String report1 = String.join(LS, "#Область ПКОПолученияОбъектФорматаСПолями",
				"Процедура ДобавитьПКО_ПКОПолученияОбъектФорматаСПолями(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияОбъектФорматаСПолями\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Неопределено;",
				"	ПравилоКонвертации.ОбъектФормата                = \"Справочник.Организации\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";", "	",
				"	СвойстваШапки = ПравилоКонвертации.Свойства;",
				"	ДобавитьПКС(СвойстваШапки, \"\",                    \"КПП\");",
				"	ДобавитьПКС(СвойстваШапки, \"ГоловнаяОрганизация\", \"\", , \"ПКООтправкиОбъектКонфигурации\");",
				"	ДобавитьПКС(СвойстваШапки, \"ИНН\",                 \"\");",
				"	ДобавитьПКС(СвойстваШапки, \"Наименование\",        \"Наименование\");",
				"	ДобавитьПКС(СвойстваШапки, \"\",                    \"ГоловнаяОрганизация\", 1, \"ПКООтправкиОбъектФорматаСПолями\");",
				"", "КонецПроцедуры", "#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияОбъектФорматаСПолями",
				false, true, false, true, false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c объектом формата", report1,
				report2.toString());
	}

	@Test
	public void testFull() {
		String report1 = String.join(LS, "#Область ПКОПолученияПолное",
				"Процедура ДобавитьПКО_ПКОПолученияПолное(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияПолное\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Метаданные.Справочники.Организации;",
				"	ПравилоКонвертации.ОбъектФормата                = \"Справочник.Организации\";",
				"	ПравилоКонвертации.ПриКонвертацииДанныхXDTO     = \"ПКО_ПКОПолученияПолное_ПриКонвертацииДанныхXDTO\";",
				"	ПравилоКонвертации.ПередЗаписьюПолученныхДанных = \"ПКО_ПКОПолученияПолное_ПередЗаписьюПолученныхДанных\";",
				"	ПравилоКонвертации.ПослеЗагрузкиВсехДанных      = \"АлгоритмПослеЗагрузкиВсехДанных\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";", "	",
				"	СвойстваШапки = ПравилоКонвертации.Свойства;",
				"	ДобавитьПКС(СвойстваШапки, \"\",                    \"КПП\");",
				"	ДобавитьПКС(СвойстваШапки, \"ГоловнаяОрганизация\", \"\", , \"ПКООтправкиОбъектКонфигурации\");",
				"	ДобавитьПКС(СвойстваШапки, \"ИНН\",                 \"\");",
				"	ДобавитьПКС(СвойстваШапки, \"Наименование\",        \"Наименование\");",
				"	ДобавитьПКС(СвойстваШапки, \"\",                    \"ГоловнаяОрганизация\", 1, \"ПКООтправкиОбъектФорматаСПолями\");",
				"	",
				"	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, \"ДополнительныеРеквизиты\", \"ДополнительныеРеквизиты\");",
				"	ДобавитьПКС(СвойстваТЧ, \"Значение\", \"ЗначениеСвойства\");",
				"	ДобавитьПКС(СвойстваТЧ, \"Свойство\", \"\", ,\"НесуществующееПравило\");", "	",
				"	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, \"КонтактнаяИнформация\",    \"КонтактнаяИнформация\");",
				"	ДобавитьПКС(СвойстваТЧ, \"Вид\", \"ВидКонтактнойИнформации\", ,\"ВидыКонтактнойИнформации\");", "",
				"КонецПроцедуры", "",
				"Процедура ПКО_ПКОПолученияПолное_ПриКонвертацииДанныхXDTO(ДанныеXDTO, ПолученныеДанные, КомпонентыОбмена)",
				"	Сообщить(\"ПриКонвертацииДанныхXDTO\");", "КонецПроцедуры", "",
				"Процедура ПКО_ПКОПолученияПолное_ПередЗаписьюПолученныхДанных(ПолученныеДанные, ДанныеИБ, КонвертацияСвойств, КомпонентыОбмена)",
				"	Сообщить(\"ПередЗаписьюПолученныхДанных\");", "КонецПроцедуры", "#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияПолное", true, true,
				false, true, false);
		ConversionModuleAnalyzerUtils.addEvents(false, true, true, true, objectRule);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения полное", report1, report2.toString());
	}

	@Test
	public void testHeaderAndTabularSection() {
		String report1 = String.join(LS, "#Область ПКОПолученияШапкаТЧ",
				"Процедура ДобавитьПКО_ПКОПолученияШапкаТЧ(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияШапкаТЧ\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Метаданные.Справочники.Организации;",
				"	ПравилоКонвертации.ОбъектФормата                = \"Справочник.Организации\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";", "	",
				"	СвойстваШапки = ПравилоКонвертации.Свойства;",
				"	ДобавитьПКС(СвойстваШапки, \"\",                    \"КПП\");",
				"	ДобавитьПКС(СвойстваШапки, \"ГоловнаяОрганизация\", \"\", , \"ПКООтправкиОбъектКонфигурации\");",
				"	ДобавитьПКС(СвойстваШапки, \"ИНН\",                 \"\");",
				"	ДобавитьПКС(СвойстваШапки, \"Наименование\",        \"Наименование\");",
				"	ДобавитьПКС(СвойстваШапки, \"\",                    \"ГоловнаяОрганизация\", 1, \"ПКООтправкиОбъектФорматаСПолями\");",
				"	",
				"	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, \"ДополнительныеРеквизиты\", \"ДополнительныеРеквизиты\");",
				"	ДобавитьПКС(СвойстваТЧ, \"Значение\", \"ЗначениеСвойства\");",
				"	ДобавитьПКС(СвойстваТЧ, \"Свойство\", \"\", ,\"НесуществующееПравило\");", "", "КонецПроцедуры",
				"#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияШапкаТЧ", true, true,
				false, true, false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения шапки и табличной части", report1,
				report2.toString());
	}

	@Test
	public void testIdentificationVariant1WithFields() {
		String report1 = String.join(LS, "#Область ПКОПолученияИдентификация1СПолями",
				"Процедура ДобавитьПКО_ПКОПолученияИдентификация1СПолями(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияИдентификация1СПолями\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Метаданные.Справочники.Организации;",
				"	ПравилоКонвертации.ОбъектФормата                = \"\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";", "	", "",
				"	ПравилоКонвертации.ПоляПоиска.Добавить(\"ГоловнаяОрганизация\");",
				"	ПравилоКонвертации.ПоляПоиска.Добавить(\"ИНН,Префикс\");", "КонецПроцедуры", "#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияИдентификация1СПолями",
				true, false, true, false, false);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c табличной частью", report1,
				report2.toString());
	}

	@Test
	public void testIdentificationVariant2NoFields() {
		String report1 = String.join(LS, "#Область ПКОПолученияИдентификация2",
				"Процедура ДобавитьПКО_ПКОПолученияИдентификация2(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияИдентификация2\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Неопределено;",
				"	ПравилоКонвертации.ОбъектФормата                = \"\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"ПоПолямПоиска\";", "	", "", "КонецПроцедуры",
				"#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияИдентификация2", false,
				false, true, false, false);
		objectRule.setIdentificationVariant(CmIdentificationVariant.SEARCH_FIELDS);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c табличной частью", report1,
				report2.toString());
	}

	@Test
	public void testIdentificationVariant2WithFields() {
		String report1 = String.join(LS, "#Область ПКОПолученияИдентификация2СПолями",
				"Процедура ДобавитьПКО_ПКОПолученияИдентификация2СПолями(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияИдентификация2СПолями\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Неопределено;",
				"	ПравилоКонвертации.ОбъектФормата                = \"\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"ПоПолямПоиска\";", "	", "",
				"	ПравилоКонвертации.ПоляПоиска.Добавить(\"Ссылка\");", "КонецПроцедуры", "#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияИдентификация2СПолями",
				false, false, true, false, false);
		objectRule.setIdentificationVariant(CmIdentificationVariant.SEARCH_FIELDS);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c табличной частью", report1,
				report2.toString());
	}

	@Test
	public void testIdentificationVariant3NoFields() {
		String report1 = String.join(LS, "#Область ПКОПолученияИдентификация3",
				"Процедура ДобавитьПКО_ПКОПолученияИдентификация3(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияИдентификация3\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Неопределено;",
				"	ПравилоКонвертации.ОбъектФормата                = \"\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"СначалаПоУникальномуИдентификаторуПотомПоПолямПоиска\";",
				"	", "", "КонецПроцедуры", "#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияИдентификация3", false,
				false, true, false, false);
		objectRule.setIdentificationVariant(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c табличной частью", report1,
				report2.toString());
	}

	@Test
	public void testIdentificationVariant3WithFields() {
		String report1 = String.join(LS, "#Область ПКОПолученияИдентификация3СПолями",
				"Процедура ДобавитьПКО_ПКОПолученияИдентификация3СПолями(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияИдентификация3СПолями\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Метаданные.Справочники.Организации;",
				"	ПравилоКонвертации.ОбъектФормата                = \"\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"СначалаПоУникальномуИдентификаторуПотомПоПолямПоиска\";",
				"	", "", "	ПравилоКонвертации.ПоляПоиска.Добавить(\"ГоловнаяОрганизация\");",
				"	ПравилоКонвертации.ПоляПоиска.Добавить(\"ИНН,Префикс\");", "КонецПроцедуры", "#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияИдентификация3СПолями",
				true, false, true, false, false);
		objectRule.setIdentificationVariant(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c табличной частью", report1,
				report2.toString());
	}

	@Test
	public void testNameOnly() {
		String report1 = String.join(LS, "#Область МинимальноеПКОПолучения",
				"Процедура ДобавитьПКО_МинимальноеПКОПолучения(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"МинимальноеПКОПолучения\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Неопределено;",
				"	ПравилоКонвертации.ОбъектФормата                = \"\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";", "	", "",
				"КонецПроцедуры", "#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("МинимальноеПКОПолучения", false,
				false, false, true, false);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения с минимумом данных", report1,
				report2.toString());
	}

	@Test
	public void testNameOnlyForGroup() {
		String report1 = String.join(LS, "#Область МинимальноеПКОПолученияДляГруппы",
				"Процедура ДобавитьПКО_МинимальноеПКОПолученияДляГруппы(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"МинимальноеПКОПолученияДляГруппы\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Неопределено;",
				"	ПравилоКонвертации.ОбъектФормата                = \"\";",
				"	ПравилоКонвертации.ПравилоДляГруппыСправочника  = Истина;",
				"	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";", "	", "",
				"КонецПроцедуры", "#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("МинимальноеПКОПолученияДляГруппы",
				false, false, false, true, true);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения с минимумом данных для группы", report1,
				report2.toString());
	}

	@Test
	public void testTwoTabularSections() {
		String report1 = String.join(LS, "#Область ПКОПолученияДвеТЧ",
				"Процедура ДобавитьПКО_ПКОПолученияДвеТЧ(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияДвеТЧ\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Метаданные.Справочники.Организации;",
				"	ПравилоКонвертации.ОбъектФормата                = \"Справочник.Организации\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";", "	", "	",
				"	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, \"ДополнительныеРеквизиты\", \"ДополнительныеРеквизиты\");",
				"	ДобавитьПКС(СвойстваТЧ, \"Значение\", \"ЗначениеСвойства\");",
				"	ДобавитьПКС(СвойстваТЧ, \"Свойство\", \"\", ,\"НесуществующееПравило\");", "	",
				"	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, \"КонтактнаяИнформация\",    \"КонтактнаяИнформация\");",
				"	ДобавитьПКС(СвойстваТЧ, \"Вид\", \"ВидКонтактнойИнформации\", ,\"ВидыКонтактнойИнформации\");", "",
				"КонецПроцедуры", "#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияДвеТЧ", true, true,
				false, true, false);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения с двумя ТЧ", report1, report2.toString());
	}

	@Test
	public void testWithAttributes() {
		String report1 = String.join(LS, "#Область ПКОПолученияШапка",
				"Процедура ДобавитьПКО_ПКОПолученияШапка(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияШапка\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Метаданные.Справочники.Организации;",
				"	ПравилоКонвертации.ОбъектФормата                = \"Справочник.Организации\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";", "	",
				"	СвойстваШапки = ПравилоКонвертации.Свойства;",
				"	ДобавитьПКС(СвойстваШапки, \"\",                    \"КПП\");",
				"	ДобавитьПКС(СвойстваШапки, \"ГоловнаяОрганизация\", \"\", , \"ПКООтправкиОбъектКонфигурации\");",
				"	ДобавитьПКС(СвойстваШапки, \"ИНН\",                 \"\");",
				"	ДобавитьПКС(СвойстваШапки, \"Наименование\",        \"Наименование\");",
				"	ДобавитьПКС(СвойстваШапки, \"\",                    \"ГоловнаяОрганизация\", 1, \"ПКООтправкиОбъектФорматаСПолями\");",
				"", "КонецПроцедуры", "#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияШапка", true, true,
				false, true, false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c шапкой", report1, report2.toString());
	}

	@Test
	public void testWithEvent1() {
		String report1 = String.join(LS, "#Область ПКОПолученияСобытие1",
				"Процедура ДобавитьПКО_ПКОПолученияСобытие1(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияСобытие1\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Неопределено;",
				"	ПравилоКонвертации.ОбъектФормата                = \"\";",
				"	ПравилоКонвертации.ПриКонвертацииДанныхXDTO     = \"ПКО_ПКОПолученияСобытие1_ПриКонвертацииДанныхXDTO\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";", "	", "",
				"КонецПроцедуры", "",
				"Процедура ПКО_ПКОПолученияСобытие1_ПриКонвертацииДанныхXDTO(ДанныеXDTO, ПолученныеДанные, КомпонентыОбмена)",
				"	Сообщить(\"ПриКонвертацииДанныхXDTO\");", "КонецПроцедуры", "#КонецОбласти", "");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияСобытие1", false,
				false, false, true, false);
		ConversionModuleAnalyzerUtils.addEvents(false, true, false, false, objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c событием", report1, report2.toString());
	}

	@Test
	public void testWithEvent12() {
		String report1 = String.join(LS, "#Область ПКОПолученияСобытие12",
				"Процедура ДобавитьПКО_ПКОПолученияСобытие12(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияСобытие12\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Неопределено;",
				"	ПравилоКонвертации.ОбъектФормата                = \"\";",
				"	ПравилоКонвертации.ПриКонвертацииДанныхXDTO     = \"ПКО_ПКОПолученияСобытие12_ПриКонвертацииДанныхXDTO\";",
				"	ПравилоКонвертации.ПередЗаписьюПолученныхДанных = \"ПКО_ПКОПолученияСобытие12_ПередЗаписьюПолученныхДанных\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";", "	", "",
				"КонецПроцедуры", "",
				"Процедура ПКО_ПКОПолученияСобытие12_ПриКонвертацииДанныхXDTO(ДанныеXDTO, ПолученныеДанные, КомпонентыОбмена)",
				"	Сообщить(\"ПриКонвертацииДанныхXDTO\");", "КонецПроцедуры", "",
				"Процедура ПКО_ПКОПолученияСобытие12_ПередЗаписьюПолученныхДанных(ПолученныеДанные, ДанныеИБ, КонвертацияСвойств, КомпонентыОбмена)",
				"	Сообщить(\"ПередЗаписьюПолученныхДанных\");", "КонецПроцедуры", "#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияСобытие12", false,
				false, false, true, false);
		ConversionModuleAnalyzerUtils.addEvents(false, true, true, false, objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c событием", report1, report2.toString());
	}

	@Test
	public void testWithEvent13() {
		String report1 = String.join(LS, "#Область ПКОПолученияСобытие13",
				"Процедура ДобавитьПКО_ПКОПолученияСобытие13(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияСобытие13\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Неопределено;",
				"	ПравилоКонвертации.ОбъектФормата                = \"\";",
				"	ПравилоКонвертации.ПриКонвертацииДанныхXDTO     = \"ПКО_ПКОПолученияСобытие13_ПриКонвертацииДанныхXDTO\";",
				"	ПравилоКонвертации.ПослеЗагрузкиВсехДанных      = \"АлгоритмПослеЗагрузкиВсехДанных\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";", "	", "",
				"КонецПроцедуры", "",
				"Процедура ПКО_ПКОПолученияСобытие13_ПриКонвертацииДанныхXDTO(ДанныеXDTO, ПолученныеДанные, КомпонентыОбмена)",
				"	Сообщить(\"ПриКонвертацииДанныхXDTO\");", "КонецПроцедуры", "#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияСобытие13", false,
				false, false, true, false);
		ConversionModuleAnalyzerUtils.addEvents(false, true, false, true, objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c событием", report1, report2.toString());
	}

	@Test
	public void testWithEvent2() {
		String report1 = String.join(LS, "#Область ПКОПолученияСобытие2",
				"Процедура ДобавитьПКО_ПКОПолученияСобытие2(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияСобытие2\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Неопределено;",
				"	ПравилоКонвертации.ОбъектФормата                = \"\";",
				"	ПравилоКонвертации.ПередЗаписьюПолученныхДанных = \"ПКО_ПКОПолученияСобытие2_ПередЗаписьюПолученныхДанных\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";", "	", "",
				"КонецПроцедуры", "",
				"Процедура ПКО_ПКОПолученияСобытие2_ПередЗаписьюПолученныхДанных(ПолученныеДанные, ДанныеИБ, КонвертацияСвойств, КомпонентыОбмена)",
				"	Сообщить(\"ПередЗаписьюПолученныхДанных\");", "КонецПроцедуры", "#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияСобытие2", false,
				false, false, true, false);
		ConversionModuleAnalyzerUtils.addEvents(false, false, true, false, objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c событием", report1, report2.toString());
	}

	@Test
	public void testWithEvent23() {
		String report1 = String.join(LS, "#Область ПКОПолученияСобытие23",
				"Процедура ДобавитьПКО_ПКОПолученияСобытие23(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияСобытие23\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Неопределено;",
				"	ПравилоКонвертации.ОбъектФормата                = \"\";",
				"	ПравилоКонвертации.ПередЗаписьюПолученныхДанных = \"ПКО_ПКОПолученияСобытие23_ПередЗаписьюПолученныхДанных\";",
				"	ПравилоКонвертации.ПослеЗагрузкиВсехДанных      = \"АлгоритмПослеЗагрузкиВсехДанных\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";", "	", "",
				"КонецПроцедуры", "",
				"Процедура ПКО_ПКОПолученияСобытие23_ПередЗаписьюПолученныхДанных(ПолученныеДанные, ДанныеИБ, КонвертацияСвойств, КомпонентыОбмена)",
				"	Сообщить(\"ПередЗаписьюПолученныхДанных\");", "КонецПроцедуры", "#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияСобытие23", false,
				false, false, true, false);
		ConversionModuleAnalyzerUtils.addEvents(false, false, true, true, objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c событием", report1, report2.toString());
	}

	@Test
	public void testWithEvent3() {
		String report1 = String.join(LS, "#Область ПКОПолученияСобытие3",
				"Процедура ДобавитьПКО_ПКОПолученияСобытие3(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияСобытие3\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Неопределено;",
				"	ПравилоКонвертации.ОбъектФормата                = \"\";",
				"	ПравилоКонвертации.ПослеЗагрузкиВсехДанных      = \"АлгоритмПослеЗагрузкиВсехДанных\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";", "	", "",
				"КонецПроцедуры", "#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияСобытие3", false,
				false, false, true, false);
		ConversionModuleAnalyzerUtils.addEvents(false, false, false, true, objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c событием", report1, report2.toString());
	}

	@Test
	public void testWithTabularSection() {
		String report1 = String.join(LS, "#Область ПКОПолученияТЧ",
				"Процедура ДобавитьПКО_ПКОПолученияТЧ(ПравилаКонвертации)", "",
				"	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);",
				"	ПравилоКонвертации.ИмяПКО                       = \"ПКОПолученияТЧ\";",
				"	ПравилоКонвертации.ОбъектДанных                 = Метаданные.Справочники.Организации;",
				"	ПравилоКонвертации.ОбъектФормата                = \"Справочник.Организации\";",
				"	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";", "	", "	",
				"	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, \"ДополнительныеРеквизиты\", \"ДополнительныеРеквизиты\");",
				"	ДобавитьПКС(СвойстваТЧ, \"Значение\", \"ЗначениеСвойства\");",
				"	ДобавитьПКС(СвойстваТЧ, \"Свойство\", \"\", ,\"НесуществующееПравило\");", "", "КонецПроцедуры",
				"#КонецОбласти");

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияТЧ", true, true, true,
				false, false);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения c табличной частью", report1,
				report2.toString());
	}

}
