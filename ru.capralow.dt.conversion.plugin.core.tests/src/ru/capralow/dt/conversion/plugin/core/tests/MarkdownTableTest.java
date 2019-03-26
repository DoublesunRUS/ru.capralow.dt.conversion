package ru.capralow.dt.conversion.plugin.core.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ru.capralow.dt.conversion.plugin.core.MarkdownTable;

public class MarkdownTableTest {

	@Test
	public void testGetTableEmpty() {
		MarkdownTable mdTable = new MarkdownTable(new String[] { "Заголовок 1", "Заголовок 2 длинный", "Заголовок 3" });

		// StringIndexOutOfBoundsException exception =
		// assertThrows(StringIndexOutOfBoundsException.class, () -> {
		assertEquals("Markdown table: Пустая таблица", "", mdTable.getTable());
		// });
		// assertEquals("Markdown table: Количество колонок в строке не соответствует
		// количеству колонок в заголовке1",
		// exception.getMessage());
	}

	@Test(expected = StringIndexOutOfBoundsException.class)
	public void testGetTableWithWrongAmountOfColumns() {
		MarkdownTable mdTable = new MarkdownTable(new String[] { "Заголовок 1", "Заголовок 2 длинный", "Заголовок 3" });
		mdTable.addRow(1, new String[][] { { "Значение 1", "0", "" }, { "Значение 2", "0", "" } });
		mdTable.addRow(1, new String[][] { { "Значение 1", "0", "" }, { "Значение 2", "0", "" },
				{ "Значение 3 длинное", "0", "" }, { "Значение 4", "0", "" } });

		// StringIndexOutOfBoundsException exception =
		// assertThrows(StringIndexOutOfBoundsException.class, () -> {
		mdTable.getTable();
		// });
		// assertEquals("Markdown table: Количество колонок в строке не соответствует
		// количеству колонок в заголовке1",
		// exception.getMessage());
	}

	@Test(expected = StringIndexOutOfBoundsException.class)
	public void testGetTableWithWrongCell() {
		MarkdownTable mdTable = new MarkdownTable(new String[] { "Заголовок 1", "Заголовок 2 длинный", "Заголовок 3" });
		mdTable.addRow(1,
				new String[][] { { "Значение 1" }, { "Значение 2", "0" }, { "Значение 3", "0", "", "Значение 4" } });

		// StringIndexOutOfBoundsException exception =
		// assertThrows(StringIndexOutOfBoundsException.class, () -> {
		mdTable.getTable();
		// });
		// assertEquals("Markdown table: Количество колонок в строке не соответствует
		// количеству колонок в заголовке1",
		// exception.getMessage());
	}

	@Test
	public void testGetTableForAlignment() {
		String report1 = String.join(System.lineSeparator(),
				"Заголовок 1        | Заголовок 2 длинный | Заголовок 3       ",
				"------------------ | ------------------- | ------------------",
				"Значение 1 длинное | Значение 2          | Значение 3        ",
				"Значение 1         | Значение 2          | Значение 3 длинное", "");

		MarkdownTable mdTable = new MarkdownTable(new String[] { "Заголовок 1", "Заголовок 2 длинный", "Заголовок 3" });
		mdTable.addRow(1, new String[][] { { "Значение 1 длинное", "0", "" }, { "Значение 2", "0", "" },
				{ "Значение 3", "0", "" } });
		mdTable.addRow(1, new String[][] { { "Значение 1", "0", "" }, { "Значение 2", "0", "" },
				{ "Значение 3 длинное", "0", "" } });
		String report2 = mdTable.getTable();

		assertEquals("Markdown таблица: Проверка выравнивания", report1, report2);
	}

	@Test
	public void testGetTableWithBoldItalic() {
		String report1 = String.join(System.lineSeparator(),
				"Заголовок 1          | Заголовок 2 длинный | Заголовок 3         ",
				"-------------------- | ------------------- | --------------------",
				"_Значение 1 длинное_ | _Значение 2_        | _Значение 3_        ",
				"**Значение 1**       | **Значение 2**      | _Значение 3 длинное_",
				"Значение 1           | **Значение 2**      |                     ", "");

		MarkdownTable mdTable = new MarkdownTable(new String[] { "Заголовок 1", "Заголовок 2 длинный", "Заголовок 3" });
		mdTable.addRow(1, new String[][] { { "Значение 1 длинное", "0", "_" }, { "Значение 2", "0", "_" },
				{ "Значение 3", "0", "_" } });
		mdTable.addRow(1, new String[][] { { "Значение 1", "0", "**" }, { "Значение 2", "0", "**" },
				{ "Значение 3 длинное", "0", "_" } });
		mdTable.addRow(1, new String[][] { { "Значение 1", "0", "" }, { "Значение 2", "0", "**" }, { "", "0", "**" } });
		String report2 = mdTable.getTable();

		assertEquals("Markdown таблица: Проверка ", report1, report2);
	}

	@Test
	public void testGetTableWithTabs() {
		String report1 = String.join(System.lineSeparator(),
				"Заголовок 1                            | Заголовок 2 длинный                    | Заголовок 3       ",
				"-------------------------------------- | -------------------------------------- | ------------------",
				"Значение 1 длинное                     | Значение 2                             | Значение 3        ",
				"&nbsp; &nbsp; Значение 1               | &nbsp; &nbsp; Значение 2               | Значение 3 длинное",
				"&nbsp; &nbsp; &nbsp; &nbsp; Значение 1 | &nbsp; &nbsp; &nbsp; &nbsp; Значение 2 |                   ",
				"");

		MarkdownTable mdTable = new MarkdownTable(new String[] { "Заголовок 1", "Заголовок 2 длинный", "Заголовок 3" });
		mdTable.addRow(1, new String[][] { { "Значение 1 длинное", "0", "" }, { "Значение 2", "0", "" },
				{ "Значение 3", "0", "" } });
		mdTable.addRow(1, new String[][] { { "Значение 1", "1", "" }, { "Значение 2", "1", "" },
				{ "Значение 3 длинное", "0", "" } });
		mdTable.addRow(1, new String[][] { { "Значение 1", "2", "" }, { "Значение 2", "2", "" }, { "", "2", "" } });
		String report2 = mdTable.getTable();

		assertEquals("Markdown таблица: Проверка ", report1, report2);
	}

	@Test
	public void testGetTableWithPriority() {
		String report1 = String.join(System.lineSeparator(),
				"Заголовок 1        | Заголовок 2 длинный | Заголовок 3       ",
				"------------------ | ------------------- | ------------------",
				"Значение 1         | Значение 2          | Значение 3 длинное",
				"Значение 1 длинное | Значение 2          | Значение 3        ",
				"Значение 4         | Значение 5          | Значение 6        ",
				"Значение 7         | Значение 8          | Значение 9        ", "");

		MarkdownTable mdTable = new MarkdownTable(new String[] { "Заголовок 1", "Заголовок 2 длинный", "Заголовок 3" });
		mdTable.addRow(3,
				new String[][] { { "Значение 7", "0", "" }, { "Значение 8", "0", "" }, { "Значение 9", "0", "" } });
		mdTable.addRow(2, new String[][] { { "Значение 1 длинное", "0", "" }, { "Значение 2", "0", "" },
				{ "Значение 3", "0", "" } });
		mdTable.addRow(1, new String[][] { { "Значение 1", "0", "" }, { "Значение 2", "0", "" },
				{ "Значение 3 длинное", "0", "" } });
		mdTable.addRow(2,
				new String[][] { { "Значение 4", "0", "" }, { "Значение 5", "0", "" }, { "Значение 6", "0", "" } });
		String report2 = mdTable.getTable();

		assertEquals("Markdown таблица: Проверка выравнивания", report1, report2);
	}

}
