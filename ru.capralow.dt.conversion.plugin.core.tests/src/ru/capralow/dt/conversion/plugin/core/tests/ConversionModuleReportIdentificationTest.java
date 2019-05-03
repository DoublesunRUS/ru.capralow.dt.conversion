package ru.capralow.dt.conversion.plugin.core.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import ru.capralow.dt.conversion.plugin.core.ConversionModuleReport;
import ru.capralow.dt.conversion.plugin.core.MarkdownTable;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant;

public class ConversionModuleReportIdentificationTest {
	private static final String IDENTIFICATION_VARIANT_UUID = "**Вариант идентификации: По уникальному идентификатору**";
	private static final String IDENTIFICATION_SEARCH_FIELDS = "**Вариант идентификации: По полям поиска**";

	private static final String THREE_FIELDS = "Реквизит1,Реквизит2,Реквизит3";
	private static final String TWO_FIELDS = "Реквизит1,Реквизит2";
	private static final String ONE_FIELD = "Реквизит1";

	private static EList<String> getFields1() {
		EList<String> fields = new BasicEList<>();
		fields.add(ONE_FIELD);

		return fields;
	}

	private static EList<String> getFields3() {
		EList<String> fields = new BasicEList<>();
		fields.add(THREE_FIELDS);
		fields.add(TWO_FIELDS);
		fields.add(ONE_FIELD);

		return fields;
	}

	private static MarkdownTable getIdentificationTable1() {
		MarkdownTable mdTable = new MarkdownTable(
				new String[] { "Порядок поиска по ключевым полям", "Реквизиты поиска" });
		mdTable.addRow(1, new String[][] { { "1", "0", "" }, { ONE_FIELD, "0", "" } });

		return mdTable;
	}

	private static MarkdownTable getIdentificationTable3() {
		MarkdownTable mdTable = new MarkdownTable(
				new String[] { "Порядок поиска по ключевым полям", "Реквизиты поиска" });
		mdTable.addRow(1, new String[][] { { "1", "0", "" }, { THREE_FIELDS, "0", "" } });
		mdTable.addRow(1, new String[][] { { "2", "0", "" }, { TWO_FIELDS, "0", "" } });
		mdTable.addRow(1, new String[][] { { "3", "0", "" }, { ONE_FIELD, "0", "" } });

		return mdTable;
	}

	@Test
	public void testEmpty() {
		String report1 = "**Вариант идентификации: Не определен**";

		String report2 = ConversionModuleReport.createIdentificationReport(null, new BasicEList<>());

		assertEquals("Описание формата: Вариант идентификации не определен", report1, report2);
	}

	@Test
	public void testSearchFieldsNoFields() {
		String report1 = String.join(System.lineSeparator(), IDENTIFICATION_SEARCH_FIELDS, "");

		String report2 = ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.SEARCH_FIELDS,
				new BasicEList<String>());

		assertEquals("Описание формата: Вариант идентификации по полям поиска без полей", report1, report2);
	}

	@Test
	public void testSearchFieldsWithField() {
		String report1 = IDENTIFICATION_SEARCH_FIELDS + System.lineSeparator() + System.lineSeparator()
				+ getIdentificationTable1().getTable();

		String report2 = ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.SEARCH_FIELDS,
				getFields1());

		assertEquals("Описание формата: Вариант идентификации по полям поиска с 1 полем", report1, report2);
	}

	@Test
	public void testSearchFieldsWithFields() {
		String report1 = IDENTIFICATION_SEARCH_FIELDS + System.lineSeparator() + System.lineSeparator()
				+ getIdentificationTable3().getTable();

		String report2 = ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.SEARCH_FIELDS,
				getFields3());

		assertEquals("Описание формата: Вариант идентификации по полям поиска с 3 полями", report1, report2);
	}

	@Test
	public void testUUIDNoFields() {
		String report1 = String.join(System.lineSeparator(), IDENTIFICATION_VARIANT_UUID, "");

		String report2 = ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.UUID,
				new BasicEList<String>());

		assertEquals("Описание формата: Вариант идентификации по УУИД без полей", report1, report2);
	}

	@Test
	public void testUUIDThenFieldsNoFields() {
		String report1 = String.join(System.lineSeparator(), IDENTIFICATION_VARIANT_UUID, "");

		String report2 = ConversionModuleReport
				.createIdentificationReport(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS, new BasicEList<String>());

		assertEquals("Описание формата: Вариант идентификации по УУИД затем поля поиска без полей", report1, report2);
	}

	@Test
	public void testUUIDThenFieldsWithField() {
		String report1 = "**Вариант идентификации: Сначала по уникальному идентификатору потом по полям поиска**"
				+ System.lineSeparator() + System.lineSeparator() + getIdentificationTable1().getTable();

		String report2 = ConversionModuleReport
				.createIdentificationReport(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS, getFields1());

		assertEquals("Описание формата: Вариант идентификации по УУИД затем поля поиска с 1 полем", report1, report2);
	}

	@Test
	public void testUUIDThenFieldsWithFields() {
		String report1 = "**Вариант идентификации: Сначала по уникальному идентификатору потом по полям поиска**"
				+ System.lineSeparator() + System.lineSeparator() + getIdentificationTable3().getTable();

		String report2 = ConversionModuleReport
				.createIdentificationReport(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS, getFields3());

		assertEquals("Описание формата: Вариант идентификации по УУИД затем поля поиска с 3 полями", report1, report2);
	}

	@Test
	public void testUUIDWithFields() {
		String report1 = String.join(System.lineSeparator(), IDENTIFICATION_VARIANT_UUID, "");

		String report2 = ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.UUID, getFields3());

		assertEquals("Описание формата: Вариан идентификации по УУИД с полями", report1, report2);
	}

}
