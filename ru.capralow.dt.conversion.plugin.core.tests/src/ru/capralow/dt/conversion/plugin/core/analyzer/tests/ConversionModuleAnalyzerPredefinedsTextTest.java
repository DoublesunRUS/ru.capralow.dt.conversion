package ru.capralow.dt.conversion.plugin.core.analyzer.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ru.capralow.dt.conversion.plugin.core.analyzer.ConversionModuleAnalyzer;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmFactory;
import ru.capralow.dt.conversion.plugin.core.utils.tests.ConversionModuleAnalyzerUtils;

public class ConversionModuleAnalyzerPredefinedsTextTest {
	private static final String LS = System.lineSeparator();

	private static final String BEGIN_OF_PREDEFINED = "	// %1$s.";
	private static final String NEW_PREDEFINED = "	ПравилоКонвертации           = ПравилаКонвертации.Добавить();";
	private static final String PREDEFINED_NAME = "	ПравилоКонвертации.ИмяПКПД   = \"%1$s\";";

	private static final String FILLED_CONFIGURATION_OBJECT = "	ПравилоКонвертации.ТипДанных = Метаданные.Перечисления.ЮридическоеФизическоеЛицо;";
	private static final String FILLED_FORMAT_OBJECT = "	ПравилоКонвертации.ТипXDTO   = \"ЮридическоеФизическоеЛицо\";";

	private static final String EMPTY_CONFIGURATION_OBJECT = "	ПравилоКонвертации.ТипДанных = Неопределено;";
	private static final String EMPTY_FORMAT_OBJECT = "	ПравилоКонвертации.ТипXDTO   = \"\";";

	private static final String BEGIN_OF_SENDING_VALUES_SECTION = "	ЗначенияДляОтправки = Новый Соответствие;";
	private static final String FIRST_SENDING_VALUE = "	ЗначенияДляОтправки.Вставить(Перечисления.ЮридическоеФизическоеЛицо.ФизическоеЛицо, \"ФизическоеЛицо\");";
	private static final String SECOND_SENDING_VALUE = "	ЗначенияДляОтправки.Вставить(Перечисления.ЮридическоеФизическоеЛицо.ЮридическоеЛицо, \"ЮридическоеЛицо\");";
	private static final String END_OF_SENDING_VALUES_SECTION = "	ПравилоКонвертации.КонвертацииЗначенийПриОтправке = ЗначенияДляОтправки;";

	private static final String BEGIN_OF_RECEIVING_VALUES_SECTION = "	ЗначенияДляПолучения = Новый Соответствие;";
	private static final String FIRST_RECEIVING_VALUE = "	ЗначенияДляПолучения.Вставить(\"ФизическоеЛицо\", Перечисления.ЮридическоеФизическоеЛицо.ФизическоеЛицо);";
	private static final String SECOND_RECEIVING_VALUE = "	ЗначенияДляПолучения.Вставить(\"ЮридическоеЛицо\", Перечисления.ЮридическоеФизическоеЛицо.ЮридическоеЛицо);";
	private static final String END_OF_RECEIVING_VALUES_SECTION = "	ПравилоКонвертации.КонвертацииЗначенийПриПолучении = ЗначенияДляПолучения;";

	@Test
	public void testBothFewValues() {
		String ruleName = "ПКПДОтправкиПолученияНесколькоПолей";

		String report1 = String.join(LS,
				String.format(BEGIN_OF_PREDEFINED, ruleName),
				NEW_PREDEFINED,
				String.format(PREDEFINED_NAME, ruleName),
				FILLED_CONFIGURATION_OBJECT,
				FILLED_FORMAT_OBJECT,
				"",
				BEGIN_OF_SENDING_VALUES_SECTION,
				FIRST_SENDING_VALUE,
				SECOND_SENDING_VALUE,
				END_OF_SENDING_VALUES_SECTION,
				BEGIN_OF_RECEIVING_VALUES_SECTION,
				FIRST_RECEIVING_VALUE,
				SECOND_RECEIVING_VALUE,
				END_OF_RECEIVING_VALUES_SECTION);

		StringBuilder report2 = new StringBuilder();
		CmPredefined predefined = ConversionModuleAnalyzerUtils
				.addFilledPredefined("ПКПДОтправкиПолученияНесколькоПолей", true, true, true, null);
		ConversionModuleAnalyzerUtils.addPredefinedValue1(predefined);
		ConversionModuleAnalyzerUtils.addPredefinedValue2(predefined);

		ConversionModuleAnalyzer.createPredefinedText(predefined, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКПД для отправки и получения c одним значением",
				report1,
				report2.toString());
	}

	@Test
	public void testBothNoValues() {
		String ruleName = "МинимальноеПКПДОтправкиПолучения";

		String report1 = String.join(LS,
				String.format(BEGIN_OF_PREDEFINED, ruleName),
				NEW_PREDEFINED,
				String.format(PREDEFINED_NAME, ruleName),
				EMPTY_CONFIGURATION_OBJECT,
				EMPTY_FORMAT_OBJECT,
				"",
				BEGIN_OF_SENDING_VALUES_SECTION,
				END_OF_SENDING_VALUES_SECTION,
				BEGIN_OF_RECEIVING_VALUES_SECTION,
				END_OF_RECEIVING_VALUES_SECTION);

		StringBuilder report2 = new StringBuilder();
		CmPredefined predefined = ConversionModuleAnalyzerUtils
				.addFilledPredefined("МинимальноеПКПДОтправкиПолучения", false, true, true, null);

		ConversionModuleAnalyzer.createPredefinedText(predefined, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКПД для отправки и получения без значений",
				report1,
				report2.toString());
	}

	@Test
	public void testBothOneValue() {
		String ruleName = "ПКПДОтправкиПолученияОдноПоле";

		String report1 = String.join(LS,
				String.format(BEGIN_OF_PREDEFINED, ruleName),
				NEW_PREDEFINED,
				String.format(PREDEFINED_NAME, ruleName),
				FILLED_CONFIGURATION_OBJECT,
				FILLED_FORMAT_OBJECT,
				"",
				BEGIN_OF_SENDING_VALUES_SECTION,
				FIRST_SENDING_VALUE,
				END_OF_SENDING_VALUES_SECTION,
				BEGIN_OF_RECEIVING_VALUES_SECTION,
				FIRST_RECEIVING_VALUE,
				END_OF_RECEIVING_VALUES_SECTION);

		StringBuilder report2 = new StringBuilder();
		CmPredefined predefined = ConversionModuleAnalyzerUtils
				.addFilledPredefined("ПКПДОтправкиПолученияОдноПоле", true, true, true, null);
		ConversionModuleAnalyzerUtils.addPredefinedValue1(predefined);

		ConversionModuleAnalyzer.createPredefinedText(predefined, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКПД для отправки и получения c несколькими значениями",
				report1,
				report2.toString());
	}

	@Test
	public void testReceivingFewValues() {
		String ruleName = "ПКПДПолученияНесколькоПолей";

		String report1 = String.join(LS,
				"	" + String.format(BEGIN_OF_PREDEFINED, ruleName),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, ruleName),
				"	" + FILLED_CONFIGURATION_OBJECT,
				"	" + FILLED_FORMAT_OBJECT,
				"	",
				"	" + BEGIN_OF_RECEIVING_VALUES_SECTION,
				"	" + FIRST_RECEIVING_VALUE,
				"	" + SECOND_RECEIVING_VALUE,
				"	" + END_OF_RECEIVING_VALUES_SECTION);

		StringBuilder report2 = new StringBuilder();
		CmPredefined predefined = ConversionModuleAnalyzerUtils
				.addFilledPredefined("ПКПДПолученияНесколькоПолей", true, false, true, null);
		ConversionModuleAnalyzerUtils.addPredefinedValue1(predefined);
		ConversionModuleAnalyzerUtils.addPredefinedValue2(predefined);

		ConversionModuleAnalyzer.createPredefinedText(predefined, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКПД для получения c одним значением",
				report1,
				report2.toString());
	}

	@Test
	public void testReceivingNoValues() {
		String ruleName = "МинимальноеПКПДПолучения";

		String report1 = String.join(LS,
				"	" + String.format(BEGIN_OF_PREDEFINED, ruleName),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, ruleName),
				"	" + EMPTY_CONFIGURATION_OBJECT,
				"	" + EMPTY_FORMAT_OBJECT,
				"	",
				"	" + BEGIN_OF_RECEIVING_VALUES_SECTION,
				"	" + END_OF_RECEIVING_VALUES_SECTION);

		StringBuilder report2 = new StringBuilder();
		CmPredefined predefined = ConversionModuleAnalyzerUtils
				.addFilledPredefined("МинимальноеПКПДПолучения", false, false, true, null);

		ConversionModuleAnalyzer.createPredefinedText(predefined, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКПД для получения без значений",
				report1,
				report2.toString());
	}

	@Test
	public void testReceivingOneValue() {
		String ruleName = "ПКПДПолученияОдноПоле";

		String report1 = String.join(LS,
				"	" + String.format(BEGIN_OF_PREDEFINED, ruleName),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, ruleName),
				"	" + FILLED_CONFIGURATION_OBJECT,
				"	" + FILLED_FORMAT_OBJECT,
				"	",
				"	" + BEGIN_OF_RECEIVING_VALUES_SECTION,
				"	" + FIRST_RECEIVING_VALUE,
				"	" + END_OF_RECEIVING_VALUES_SECTION);

		StringBuilder report2 = new StringBuilder();
		CmPredefined predefined = ConversionModuleAnalyzerUtils
				.addFilledPredefined("ПКПДПолученияОдноПоле", true, false, true, null);
		ConversionModuleAnalyzerUtils.addPredefinedValue1(predefined);

		ConversionModuleAnalyzer.createPredefinedText(predefined, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКПД для получения c несколькими значениями",
				report1,
				report2.toString());
	}

	@Test
	public void testSendingEmpty() {
		StringBuilder report2 = new StringBuilder();
		CmPredefined predefined = cmFactory.eINSTANCE.createCmPredefined();
		predefined.setForSending(true);

		ConversionModuleAnalyzer.createPredefinedText(predefined, new StringBuilder());

		assertEquals("Формирование модуля обмена: Добавить пустое ПКПД для отправки", "", report2.toString());
	}

	@Test
	public void testSendingFewValues() {
		String ruleName = "ПКПДОтправкиНесколькоПолей";

		String report1 = String.join(LS,
				"	" + String.format(BEGIN_OF_PREDEFINED, ruleName),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, ruleName),
				"	" + FILLED_CONFIGURATION_OBJECT,
				"	" + FILLED_FORMAT_OBJECT,
				"	",
				"	" + BEGIN_OF_SENDING_VALUES_SECTION,
				"	" + FIRST_SENDING_VALUE,
				"	" + SECOND_SENDING_VALUE,
				"	" + END_OF_SENDING_VALUES_SECTION);

		StringBuilder report2 = new StringBuilder();
		CmPredefined predefined = ConversionModuleAnalyzerUtils
				.addFilledPredefined("ПКПДОтправкиНесколькоПолей", true, true, false, null);
		ConversionModuleAnalyzerUtils.addPredefinedValue1(predefined);
		ConversionModuleAnalyzerUtils.addPredefinedValue2(predefined);

		ConversionModuleAnalyzer.createPredefinedText(predefined, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКПД для отправки c одним значением",
				report1,
				report2.toString());
	}

	@Test
	public void testSendingNoValues() {
		String ruleName = "МинимальноеПКПДОтправки";

		String report1 = String.join(LS,
				"	" + String.format(BEGIN_OF_PREDEFINED, ruleName),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, ruleName),
				"	" + EMPTY_CONFIGURATION_OBJECT,
				"	" + EMPTY_FORMAT_OBJECT,
				"	",
				"	" + BEGIN_OF_SENDING_VALUES_SECTION,
				"	" + END_OF_SENDING_VALUES_SECTION);

		StringBuilder report2 = new StringBuilder();
		CmPredefined predefined = ConversionModuleAnalyzerUtils
				.addFilledPredefined("МинимальноеПКПДОтправки", false, true, false, null);

		ConversionModuleAnalyzer.createPredefinedText(predefined, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКПД для отправки без значений",
				report1,
				report2.toString());
	}

	@Test
	public void testSendingOneValue() {
		String ruleName = "ПКПДОтправкиОдноПоле";

		String report1 = String.join(LS,
				"	" + String.format(BEGIN_OF_PREDEFINED, ruleName),
				"	" + NEW_PREDEFINED,
				"	" + String.format(PREDEFINED_NAME, ruleName),
				"	" + FILLED_CONFIGURATION_OBJECT,
				"	" + FILLED_FORMAT_OBJECT,
				"	",
				"	" + BEGIN_OF_SENDING_VALUES_SECTION,
				"	" + FIRST_SENDING_VALUE,
				"	" + END_OF_SENDING_VALUES_SECTION);

		StringBuilder report2 = new StringBuilder();
		CmPredefined predefined = ConversionModuleAnalyzerUtils
				.addFilledPredefined("ПКПДОтправкиОдноПоле", true, true, false, null);
		ConversionModuleAnalyzerUtils.addPredefinedValue1(predefined);

		ConversionModuleAnalyzer.createPredefinedText(predefined, report2);

		assertEquals("Формирование модуля обмена: Добавить ПКПД для отправки c несколькими значениями",
				report1,
				report2.toString());
	}

}
