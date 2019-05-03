package ru.capralow.dt.conversion.plugin.core.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ru.capralow.dt.conversion.plugin.core.MarkdownTable;

public class MarkdownTableTest {
	private static final String CAPTION_1 = "Заголовок 1";
	private static final String CAPTION_2 = "Заголовок 2 длинный";
	private static final String CAPTION_3 = "Заголовок 3";

	private static final String VALUE_1 = "Значение 1";
	private static final String VALUE_2 = "Значение 2";
	private static final String VALUE_3 = "Значение 3";
	private static final String VALUE_4 = "Значение 4";

	private static final String VALUE_1_LONG = "Значение 1 длинное";
	private static final String VALUE_3_LONG = "Значение 3 длинное";

	@Test
	public void testEmpty() {
		MarkdownTable mdTable = new MarkdownTable(new String[] { CAPTION_1, CAPTION_2, CAPTION_3 });

		assertEquals("Markdown table: Пустая таблица", "", mdTable.getTable());
	}

	@Test
	public void testForAlignment() {
		String report1 = String.join(System.lineSeparator(),
				"Заголовок 1        | Заголовок 2 длинный | Заголовок 3       ",
				"------------------ | ------------------- | ------------------",
				"Значение 1 длинное | Значение 2          | Значение 3        ",
				"Значение 1         | Значение 2          | Значение 3 длинное",
				"");

		MarkdownTable mdTable = new MarkdownTable(new String[] { CAPTION_1, CAPTION_2, CAPTION_3 });
		mdTable.addRow(1, new String[][] { { VALUE_1_LONG, "0", "" }, { VALUE_2, "0", "" }, { VALUE_3, "0", "" } });
		mdTable.addRow(1, new String[][] { { VALUE_1, "0", "" }, { VALUE_2, "0", "" }, { VALUE_3_LONG, "0", "" } });
		String report2 = mdTable.getTable();

		assertEquals("Markdown таблица: Проверка выравнивания", report1, report2);
	}

	@Test
	public void testWithBoldItalic() {
		String report1 = String.join(System.lineSeparator(),
				"Заголовок 1          | Заголовок 2 длинный | Заголовок 3         ",
				"-------------------- | ------------------- | --------------------",
				"_Значение 1 длинное_ | _Значение 2_        | _Значение 3_        ",
				"**Значение 1**       | **Значение 2**      | _Значение 3 длинное_",
				"Значение 1           | **Значение 2**      |                     ",
				"");

		MarkdownTable mdTable = new MarkdownTable(new String[] { CAPTION_1, CAPTION_2, CAPTION_3 });
		mdTable.addRow(1, new String[][] { { VALUE_1_LONG, "0", "_" }, { VALUE_2, "0", "_" }, { VALUE_3, "0", "_" } });
		mdTable.addRow(1,
				new String[][] { { VALUE_1, "0", "**" }, { VALUE_2, "0", "**" }, { VALUE_3_LONG, "0", "_" } });
		mdTable.addRow(1, new String[][] { { VALUE_1, "0", "" }, { VALUE_2, "0", "**" }, { "", "0", "**" } });
		String report2 = mdTable.getTable();

		assertEquals("Markdown таблица: Проверка ", report1, report2);
	}

	@Test
	public void testWithPriority() {
		String report1 = String.join(System.lineSeparator(),
				"Заголовок 1        | Заголовок 2 длинный | Заголовок 3       ",
				"------------------ | ------------------- | ------------------",
				"Значение 1         | Значение 2          | Значение 3 длинное",
				"Значение 1 длинное | Значение 2          | Значение 3        ",
				"Значение 4         | Значение 5          | Значение 6        ",
				"Значение 7         | Значение 8          | Значение 9        ",
				"");

		MarkdownTable mdTable = new MarkdownTable(new String[] { CAPTION_1, CAPTION_2, CAPTION_3 });
		mdTable.addRow(3,
				new String[][] { { "Значение 7", "0", "" }, { "Значение 8", "0", "" }, { "Значение 9", "0", "" } });
		mdTable.addRow(2, new String[][] { { VALUE_1_LONG, "0", "" }, { VALUE_2, "0", "" }, { VALUE_3, "0", "" } });
		mdTable.addRow(1, new String[][] { { VALUE_1, "0", "" }, { VALUE_2, "0", "" }, { VALUE_3_LONG, "0", "" } });
		mdTable.addRow(2,
				new String[][] { { VALUE_4, "0", "" }, { "Значение 5", "0", "" }, { "Значение 6", "0", "" } });
		String report2 = mdTable.getTable();

		assertEquals("Markdown таблица: Проверка выравнивания", report1, report2);
	}

	@Test
	public void testWithTabs() {
		String report1 = String.join(System.lineSeparator(),
				"Заголовок 1                            | Заголовок 2 длинный                    | Заголовок 3       ",
				"-------------------------------------- | -------------------------------------- | ------------------",
				"Значение 1 длинное                     | Значение 2                             | Значение 3        ",
				"&nbsp; &nbsp; Значение 1               | &nbsp; &nbsp; Значение 2               | Значение 3 длинное",
				"&nbsp; &nbsp; &nbsp; &nbsp; Значение 1 | &nbsp; &nbsp; &nbsp; &nbsp; Значение 2 |                   ",
				"");

		MarkdownTable mdTable = new MarkdownTable(new String[] { CAPTION_1, CAPTION_2, CAPTION_3 });
		mdTable.addRow(1, new String[][] { { VALUE_1_LONG, "0", "" }, { VALUE_2, "0", "" }, { VALUE_3, "0", "" } });
		mdTable.addRow(1, new String[][] { { VALUE_1, "1", "" }, { VALUE_2, "1", "" }, { VALUE_3_LONG, "0", "" } });
		mdTable.addRow(1, new String[][] { { VALUE_1, "2", "" }, { VALUE_2, "2", "" }, { "", "2", "" } });
		String report2 = mdTable.getTable();

		assertEquals("Markdown таблица: Проверка ", report1, report2);
	}

	@Test(expected = StringIndexOutOfBoundsException.class)
	public void testWithWrongAmountOfColumns() {
		MarkdownTable mdTable = new MarkdownTable(new String[] { CAPTION_1, CAPTION_2, CAPTION_3 });
		mdTable.addRow(1, new String[][] { { VALUE_1, "0", "" }, { VALUE_2, "0", "" } });
		mdTable.addRow(1,
				new String[][] { { VALUE_1, "0", "" },
						{ VALUE_2, "0", "" },
						{ VALUE_3_LONG, "0", "" },
						{ VALUE_4, "0", "" } });

		mdTable.getTable();
	}

	@Test(expected = StringIndexOutOfBoundsException.class)
	public void testWithWrongCell() {
		MarkdownTable mdTable = new MarkdownTable(new String[] { CAPTION_1, CAPTION_2, CAPTION_3 });
		mdTable.addRow(1, new String[][] { { VALUE_1 }, { VALUE_2, "0" }, { VALUE_3, "0", "", VALUE_4 } });

		mdTable.getTable();
	}

}
