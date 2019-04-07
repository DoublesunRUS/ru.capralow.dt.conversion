package ru.capralow.dt.conversion.plugin.core.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ru.capralow.dt.conversion.plugin.core.ConversionModuleAnalyzer;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmFactory;

public class ConversionModuleAnalyzerObjectRuleBothTextTest {
	private static final String LS = System.lineSeparator();

	private static final String BEGIN_OF_REGION = "#Область %1$s";
	private static final String BEGIN_OF_PROCEDURE = "Процедура ДобавитьПКО_%1$s(ПравилаКонвертации)";

	private static final String RULE_NAME = "	ПравилоКонвертации.ИмяПКО                       = \"%1$s\";";

	private static final String NEW_RULE = "	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);";

	private static final String FILLED_CONFIGURATION_OBJECT = "	ПравилоКонвертации.ОбъектДанных                 = Метаданные.Справочники.Организации;";
	private static final String FILLED_FORMAT_OBJECT = "	ПравилоКонвертации.ОбъектФормата                = \"Справочник.Организации\";";

	private static final String EMPTY_CONFIGURATION_OBJECT = "	ПравилоКонвертации.ОбъектДанных                 = Неопределено;";
	private static final String EMPTY_FORMAT_OBJECT = "	ПравилоКонвертации.ОбъектФормата                = \"\";";

	private static final String FOR_GROUP = "	ПравилоКонвертации.ПравилоДляГруппыСправочника  = Истина;";

	private static final String IDENTIFICATION_UUID = "	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";";

	private static final String NEW_HEADER = "	СвойстваШапки = ПравилоКонвертации.Свойства;";
	private static final String HEADER_SECTION = String.join(LS,
			"	ДобавитьПКС(СвойстваШапки, \"\",                    \"КПП\");",
			"	ДобавитьПКС(СвойстваШапки, \"ГоловнаяОрганизация\", \"\", , \"ПКООтправкиОбъектКонфигурации\");",
			"	ДобавитьПКС(СвойстваШапки, \"ИНН\",                 \"\");",
			"	ДобавитьПКС(СвойстваШапки, \"Наименование\",        \"Наименование\");",
			"	ДобавитьПКС(СвойстваШапки, \"\",                    \"ГоловнаяОрганизация\", 1, \"ПКООтправкиОбъектФорматаСПолями\");");

	private static final String FIRST_TABULAR_SECTION = String.join(LS,
			"	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, \"ДополнительныеРеквизиты\", \"ДополнительныеРеквизиты\");",
			"	ДобавитьПКС(СвойстваТЧ, \"Значение\", \"ЗначениеСвойства\");", "	",
			"	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, \"\",                        \"ДополнительныеРеквизиты\");",
			"	ДобавитьПКС(СвойстваТЧ, \"\", \"ЗначениеСвойства\", 1,\"НесуществующееПравило\");", "	",
			"	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, \"ДополнительныеРеквизиты\", \"\");",
			"	ДобавитьПКС(СвойстваТЧ, \"Свойство\", \"\", ,\"НесуществующееПравило\");");

	private static final String TWO_TABULAR_SECTIONS = String.join(LS,
			"	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, \"ДополнительныеРеквизиты\", \"ДополнительныеРеквизиты\");",
			"	ДобавитьПКС(СвойстваТЧ, \"Значение\", \"ЗначениеСвойства\");", "	",
			"	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, \"КонтактнаяИнформация\",    \"КонтактнаяИнформация\");",
			"	ДобавитьПКС(СвойстваТЧ, \"Вид\", \"ВидКонтактнойИнформации\", ,\"ВидыКонтактнойИнформации\");", "	",
			"	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, \"\",                        \"ДополнительныеРеквизиты\");",
			"	ДобавитьПКС(СвойстваТЧ, \"\", \"ЗначениеСвойства\", 1,\"НесуществующееПравило\");", "	",
			"	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, \"ДополнительныеРеквизиты\", \"\");",
			"	ДобавитьПКС(СвойстваТЧ, \"Свойство\", \"\", ,\"НесуществующееПравило\");");

	private static final String IDENTIFICATION_FIELDS2 = String.join(LS,
			"	ПравилоКонвертации.ПоляПоиска.Добавить(\"ГоловнаяОрганизация\");",
			"	ПравилоКонвертации.ПоляПоиска.Добавить(\"ИНН,Префикс\");");

	private static final String ON_SENDING_EVENT_DECLARATION = "	ПравилоКонвертации.ПриОтправкеДанных            = \"ПКО_%1$s_ПриОтправкеДанных\";";
	private static final String BEFORE_RECEIVING_EVENT_DECLARATION = "	ПравилоКонвертации.ПриКонвертацииДанныхXDTO     = \"ПКО_%1$s_ПриКонвертацииДанныхXDTO\";";
	private static final String ON_RECEIVING_EVENT_DECLARATION = "	ПравилоКонвертации.ПередЗаписьюПолученныхДанных = \"ПКО_%1$s_ПередЗаписьюПолученныхДанных\";";
	private static final String AFTER_RECEIVING_ALGORITHM_DECLARATION = "	ПравилоКонвертации.ПослеЗагрузкиВсехДанных      = \"АлгоритмПослеЗагрузкиВсехДанных\";";

	private static final String END_OF_PROCEDURE = "КонецПроцедуры";
	private static final String END_OF_REGION = "#КонецОбласти";

	private static final String ON_SENDING_EVENT_TEXT = "	Сообщить(\"ПриОтправкеДанных\");";
	private static final String BEFORE_RECEIVING_EVENT_TEXT = "	Сообщить(\"ПриКонвертацииДанныхXDTO\");";
	private static final String ON_RECEIVING_EVENT_TEXT = "	Сообщить(\"ПередЗаписьюПолученныхДанных\");";

	private static final String BEGIN_OF_EVENT_PROCEDURE = "Процедура ПКО_%1$s%2$s";

	private static final String ON_SENDING_EVENT_SECTION = String.join(LS,
			"_ПриОтправкеДанных(ДанныеИБ, ДанныеXDTO, КомпонентыОбмена, СтекВыгрузки)", ON_SENDING_EVENT_TEXT,
			END_OF_PROCEDURE);
	private static final String BEFORE_RECEIVING_EVENT_SECTION = String.join(LS,
			"_ПриКонвертацииДанныхXDTO(ДанныеXDTO, ПолученныеДанные, КомпонентыОбмена)", BEFORE_RECEIVING_EVENT_TEXT,
			END_OF_PROCEDURE);
	private static final String ON_RECEIVING_EVENT_SECTION = String.join(LS,
			"_ПередЗаписьюПолученныхДанных(ПолученныеДанные, ДанныеИБ, КонвертацияСвойств, КомпонентыОбмена)",
			ON_RECEIVING_EVENT_TEXT, END_OF_PROCEDURE);

	@Test
	public void testEmpty() {
		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить пустое ПКО для отправки и получения", "",
				report2.toString());
	}

	@Test
	public void testEvent1() {
		String ruleName = "ПКООтправкиПолученияСобытие1";

		String report1 = String.join(LS, String.format(BEGIN_OF_REGION, ruleName),
				String.format(BEGIN_OF_PROCEDURE, ruleName), "", NEW_RULE, String.format(RULE_NAME, ruleName),
				EMPTY_CONFIGURATION_OBJECT, EMPTY_FORMAT_OBJECT, String.format(ON_SENDING_EVENT_DECLARATION, ruleName),
				IDENTIFICATION_UUID, "	", "", END_OF_PROCEDURE, "",
				String.format(BEGIN_OF_EVENT_PROCEDURE, ruleName, ON_SENDING_EVENT_SECTION), END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияСобытие1",
				false, false, true, true, false);
		ConversionModuleAnalyzerUtils.addEvents(true, false, false, false, objectRule, null);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки и получения c событием ПриОтправкеДанных",
				report1, report2.toString());
	}

	@Test
	public void testEvent12() {
		String ruleName = "ПКООтправкиПолученияСобытие12";

		String report1 = String.join(LS, String.format(BEGIN_OF_REGION, ruleName),
				String.format(BEGIN_OF_PROCEDURE, ruleName), "", NEW_RULE, String.format(RULE_NAME, ruleName),
				EMPTY_CONFIGURATION_OBJECT, EMPTY_FORMAT_OBJECT, String.format(ON_SENDING_EVENT_DECLARATION, ruleName),
				String.format(BEFORE_RECEIVING_EVENT_DECLARATION, ruleName), IDENTIFICATION_UUID, "	", "",
				END_OF_PROCEDURE, "", String.format(BEGIN_OF_EVENT_PROCEDURE, ruleName, ON_SENDING_EVENT_SECTION), "",
				String.format(BEGIN_OF_EVENT_PROCEDURE, ruleName, BEFORE_RECEIVING_EVENT_SECTION), END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияСобытие12",
				false, false, true, true, false);
		ConversionModuleAnalyzerUtils.addEvents(true, true, false, false, objectRule, null);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals(
				"Формирование модуля обмена: Добавить ПКО для отправки и получения c событиями ПриОтправкеДанных и ПриКонвертацииДанныхXDTO",
				report1, report2.toString());
	}

	@Test
	public void testEvent123() {
		String ruleName = "ПКООтправкиПолученияСобытие123";

		String report1 = String.join(LS, String.format(BEGIN_OF_REGION, ruleName),
				String.format(BEGIN_OF_PROCEDURE, ruleName), "", NEW_RULE, String.format(RULE_NAME, ruleName),
				EMPTY_CONFIGURATION_OBJECT, EMPTY_FORMAT_OBJECT, String.format(ON_SENDING_EVENT_DECLARATION, ruleName),
				String.format(BEFORE_RECEIVING_EVENT_DECLARATION, ruleName),
				String.format(ON_RECEIVING_EVENT_DECLARATION, ruleName), IDENTIFICATION_UUID, "	", "", END_OF_PROCEDURE,
				"", String.format(BEGIN_OF_EVENT_PROCEDURE, ruleName, ON_SENDING_EVENT_SECTION), "",
				String.format(BEGIN_OF_EVENT_PROCEDURE, ruleName, BEFORE_RECEIVING_EVENT_SECTION), "",
				String.format(BEGIN_OF_EVENT_PROCEDURE, ruleName, ON_RECEIVING_EVENT_SECTION), END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияСобытие123",
				false, false, true, true, false);
		ConversionModuleAnalyzerUtils.addEvents(true, true, true, false, objectRule, null);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals(
				"Формирование модуля обмена: Добавить ПКО для отправки и получения c событиями ПриОтправкеДанных и ПриКонвертацииДанныхXDTO и ПередЗаписьюПолученныхДанных",
				report1, report2.toString());
	}

	@Test
	public void testEvent124() {
		String ruleName = "ПКООтправкиПолученияСобытие124";

		String report1 = String.join(LS, String.format(BEGIN_OF_REGION, ruleName),
				String.format(BEGIN_OF_PROCEDURE, ruleName), "", NEW_RULE, String.format(RULE_NAME, ruleName),
				EMPTY_CONFIGURATION_OBJECT, EMPTY_FORMAT_OBJECT, String.format(ON_SENDING_EVENT_DECLARATION, ruleName),
				String.format(BEFORE_RECEIVING_EVENT_DECLARATION, ruleName), AFTER_RECEIVING_ALGORITHM_DECLARATION,
				IDENTIFICATION_UUID, "	", "", END_OF_PROCEDURE, "",
				String.format(BEGIN_OF_EVENT_PROCEDURE, ruleName, ON_SENDING_EVENT_SECTION), "",
				String.format(BEGIN_OF_EVENT_PROCEDURE, ruleName, BEFORE_RECEIVING_EVENT_SECTION), END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияСобытие124",
				false, false, true, true, false);
		ConversionModuleAnalyzerUtils.addEvents(true, true, false, true, objectRule, null);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals(
				"Формирование модуля обмена: Добавить ПКО для отправки и получения c событиями ПриОтправкеДанных и ПриКонвертацииДанныхXDTO и АлгоритмПослеЗагрузкиВсехДанных",
				report1, report2.toString());
	}

	@Test
	public void testEvent13() {
		String ruleName = "ПКООтправкиПолученияСобытие13";

		String report1 = String.join(LS, String.format(BEGIN_OF_REGION, ruleName),
				String.format(BEGIN_OF_PROCEDURE, ruleName), "", NEW_RULE, String.format(RULE_NAME, ruleName),
				EMPTY_CONFIGURATION_OBJECT, EMPTY_FORMAT_OBJECT, String.format(ON_SENDING_EVENT_DECLARATION, ruleName),
				String.format(ON_RECEIVING_EVENT_DECLARATION, ruleName), IDENTIFICATION_UUID, "	", "", END_OF_PROCEDURE,
				"", String.format(BEGIN_OF_EVENT_PROCEDURE, ruleName, ON_SENDING_EVENT_SECTION), "",
				String.format(BEGIN_OF_EVENT_PROCEDURE, ruleName, ON_RECEIVING_EVENT_SECTION), END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияСобытие13",
				false, false, true, true, false);
		ConversionModuleAnalyzerUtils.addEvents(true, false, true, false, objectRule, null);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals(
				"Формирование модуля обмена: Добавить ПКО для отправки и получения c событиями ПриОтправкеДанных и ПередЗаписьюПолученныхДанных",
				report1, report2.toString());
	}

	@Test
	public void testEvent134() {
		String ruleName = "ПКООтправкиПолученияСобытие134";

		String report1 = String.join(LS, String.format(BEGIN_OF_REGION, ruleName),
				String.format(BEGIN_OF_PROCEDURE, ruleName), "", NEW_RULE, String.format(RULE_NAME, ruleName),
				EMPTY_CONFIGURATION_OBJECT, EMPTY_FORMAT_OBJECT, String.format(ON_SENDING_EVENT_DECLARATION, ruleName),
				String.format(ON_RECEIVING_EVENT_DECLARATION, ruleName), AFTER_RECEIVING_ALGORITHM_DECLARATION,
				IDENTIFICATION_UUID, "	", "", END_OF_PROCEDURE, "",
				String.format(BEGIN_OF_EVENT_PROCEDURE, ruleName, ON_SENDING_EVENT_SECTION), "",
				String.format(BEGIN_OF_EVENT_PROCEDURE, ruleName, ON_RECEIVING_EVENT_SECTION), END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияСобытие134",
				false, false, true, true, false);
		ConversionModuleAnalyzerUtils.addEvents(true, false, true, true, objectRule, null);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals(
				"Формирование модуля обмена: Добавить ПКО для отправки и получения c событиями ПриОтправкеДанных и ПередЗаписьюПолученныхДанных и АлгоритмПослеЗагрузкиВсехДанных",
				report1, report2.toString());
	}

	@Test
	public void testEvent14() {
		String ruleName = "ПКООтправкиПолученияСобытие14";

		String report1 = String.join(LS, String.format(BEGIN_OF_REGION, ruleName),
				String.format(BEGIN_OF_PROCEDURE, ruleName), "", NEW_RULE, String.format(RULE_NAME, ruleName),
				EMPTY_CONFIGURATION_OBJECT, EMPTY_FORMAT_OBJECT, String.format(ON_SENDING_EVENT_DECLARATION, ruleName),
				AFTER_RECEIVING_ALGORITHM_DECLARATION, IDENTIFICATION_UUID, "	", "", END_OF_PROCEDURE, "",
				String.format(BEGIN_OF_EVENT_PROCEDURE, ruleName, ON_SENDING_EVENT_SECTION), END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияСобытие14",
				false, false, true, true, false);
		ConversionModuleAnalyzerUtils.addEvents(true, false, false, true, objectRule, null);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals(
				"Формирование модуля обмена: Добавить ПКО для отправки и получения c событиями ПриОтправкеДанных и АлгоритмПослеЗагрузкиВсехДанных",
				report1, report2.toString());
	}

	@Test
	public void testFull() {
		String ruleName = "ПКООтправкиПолученияПолное";

		String report1 = String.join(LS, String.format(BEGIN_OF_REGION, ruleName),
				String.format(BEGIN_OF_PROCEDURE, ruleName), "", NEW_RULE, String.format(RULE_NAME, ruleName),
				FILLED_CONFIGURATION_OBJECT, FILLED_FORMAT_OBJECT, FOR_GROUP,
				String.format(ON_SENDING_EVENT_DECLARATION, ruleName),
				String.format(BEFORE_RECEIVING_EVENT_DECLARATION, ruleName),
				String.format(ON_RECEIVING_EVENT_DECLARATION, ruleName), AFTER_RECEIVING_ALGORITHM_DECLARATION,
				IDENTIFICATION_UUID, "	", NEW_HEADER, HEADER_SECTION, "	", TWO_TABULAR_SECTIONS, "",
				IDENTIFICATION_FIELDS2, END_OF_PROCEDURE, "",
				String.format(BEGIN_OF_EVENT_PROCEDURE, ruleName, ON_SENDING_EVENT_SECTION), "",
				String.format(BEGIN_OF_EVENT_PROCEDURE, ruleName, BEFORE_RECEIVING_EVENT_SECTION), "",
				String.format(BEGIN_OF_EVENT_PROCEDURE, ruleName, ON_RECEIVING_EVENT_SECTION), END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияПолное", true,
				true, true, true, true);
		ConversionModuleAnalyzerUtils.addEvents(true, true, true, true, objectRule, null);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);
		ConversionModuleAnalyzerUtils.addIdentificationFields2(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки и получения полное", report1,
				report2.toString());
	}

	@Test
	public void testHeader() {
		String ruleName = "ПКООтправкиПолученияШапка";

		String report1 = String.join(LS, String.format(BEGIN_OF_REGION, ruleName),
				String.format(BEGIN_OF_PROCEDURE, ruleName), "", NEW_RULE, String.format(RULE_NAME, ruleName),
				FILLED_CONFIGURATION_OBJECT, FILLED_FORMAT_OBJECT, IDENTIFICATION_UUID, "	", NEW_HEADER,
				HEADER_SECTION, "", END_OF_PROCEDURE, END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияШапка", true,
				true, true, true, false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки и получения c шапкой", report1,
				report2.toString());
	}

	@Test
	public void testHeaderAndTabularSection() {
		String ruleName = "ПКООтправкиПолученияШапкаТЧ";

		String report1 = String.join(LS, String.format(BEGIN_OF_REGION, ruleName),
				String.format(BEGIN_OF_PROCEDURE, ruleName), "", NEW_RULE, String.format(RULE_NAME, ruleName),
				FILLED_CONFIGURATION_OBJECT, FILLED_FORMAT_OBJECT, IDENTIFICATION_UUID, "	", NEW_HEADER,
				HEADER_SECTION, "	", FIRST_TABULAR_SECTION, "", END_OF_PROCEDURE, END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияШапкаТЧ", true,
				true, true, true, false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки получения шапки и табличной части", report1,
				report2.toString());
	}

	@Test
	public void testNameOnly() {
		String ruleName = "МинимальноеПКООтправкиПолучения";

		String report1 = String.join(LS, String.format(BEGIN_OF_REGION, ruleName),
				String.format(BEGIN_OF_PROCEDURE, ruleName), "", NEW_RULE, String.format(RULE_NAME, ruleName),
				EMPTY_CONFIGURATION_OBJECT, EMPTY_FORMAT_OBJECT, IDENTIFICATION_UUID, "	", "", END_OF_PROCEDURE,
				END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("МинимальноеПКООтправкиПолучения",
				false, false, true, true, false);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки и получения с минимумом данных", report1,
				report2.toString());
	}

	@Test
	public void testTabularSection() {
		String ruleName = "ПКООтправкиПолученияТЧ";

		String report1 = String.join(LS, String.format(BEGIN_OF_REGION, ruleName),
				String.format(BEGIN_OF_PROCEDURE, ruleName), "", NEW_RULE, String.format(RULE_NAME, ruleName),
				FILLED_CONFIGURATION_OBJECT, FILLED_FORMAT_OBJECT, IDENTIFICATION_UUID, "	", "	",
				FIRST_TABULAR_SECTION, "", END_OF_PROCEDURE, END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияТЧ", true,
				true, true, true, false);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки и получения c табличной частью", report1,
				report2.toString());
	}

	@Test
	public void testTwoTabularSections() {
		String ruleName = "ПКООтправкиПолученияДвеТЧ";

		String report1 = String.join(LS, String.format(BEGIN_OF_REGION, ruleName),
				String.format(BEGIN_OF_PROCEDURE, ruleName), "", NEW_RULE, String.format(RULE_NAME, ruleName),
				FILLED_CONFIGURATION_OBJECT, FILLED_FORMAT_OBJECT, IDENTIFICATION_UUID, "	", "	",
				TWO_TABULAR_SECTIONS, "", END_OF_PROCEDURE, END_OF_REGION);

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияДвеТЧ", true,
				true, true, true, false);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);

		ConversionModuleAnalyzer.createObjectRuleReceivingText(objectRule, new StringBuilder(), report2,
				new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки и получения с двумя ТЧ", report1,
				report2.toString());
	}

}
