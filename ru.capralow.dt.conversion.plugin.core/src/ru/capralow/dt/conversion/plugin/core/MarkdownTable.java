package ru.capralow.dt.conversion.plugin.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class MarkdownTable {

	private String[] caption;
	private HashMap<Integer, String[][][]> mapPriorities = new HashMap<Integer, String[][][]>();
	private int numOfCols;

	public MarkdownTable(String[] caption) {
		this.caption = caption;

		this.numOfCols = caption.length;
	}

	public void addRow(int priority, String[][] row) {
		if (row.length != numOfCols)
			throw new java.lang.StringIndexOutOfBoundsException(
					"Markdown table: Количество колонок в строке не соответствует количеству колонок в заголовке");

		String[][][] rows = mapPriorities.get(priority);
		if (rows == null) {
			rows = new String[1][][];

		} else {
			String[][][] tempRows = new String[rows.length + 1][][];
			for (int i = 0; i < rows.length; i++)
				tempRows[i] = rows[i];
			rows = tempRows;

		}

		rows[rows.length - 1] = row;
		for (int colIndex = 0; colIndex < numOfCols; colIndex++) {
			String[] cell = row[colIndex];
			if (cell.length != 3)
				throw new java.lang.StringIndexOutOfBoundsException(
						"Markdown table: Количество значений в ячейке должно быть равно 3");

			if (!cell[0].isEmpty()) {
				int numOfTabs = Integer.parseInt(cell[1]);
				String cellStyle = cell[2];
				cell[0] = addTabs(numOfTabs) + cellStyle + cell[0] + cellStyle;
			}
		}

		mapPriorities.put(priority, rows);
	}

	public String getTable() {
		String table = "";
		if (mapPriorities.size() == 0)
			return table;

		int[] colsMaxLength = new int[numOfCols];

		for (int colIndex = 0; colIndex < numOfCols; colIndex++) {
			colsMaxLength[colIndex] = caption[colIndex].length();
		}

		int[] priorities = new int[mapPriorities.size()];
		int priorityIndex = 0;
		for (Entry<Integer, String[][][]> priority : mapPriorities.entrySet()) {
			priorities[priorityIndex] = priority.getKey();
			priorityIndex++;
		}
		Arrays.sort(priorities);

		for (priorityIndex = 0; priorityIndex < priorities.length; priorityIndex++) {
			String[][][] rows = mapPriorities.get(priorities[priorityIndex]);
			for (int rowIndex = 0; rowIndex < rows.length; rowIndex++) {
				if (rows[rowIndex] == null)
					throw new java.lang.StringIndexOutOfBoundsException(
							"Markdown table: Количество строк в таблице меньше ожидаемого количества");

				for (int colIndex = 0; colIndex < numOfCols; colIndex++) {
					int colLength = rows[rowIndex][colIndex][0].length();
					if (colsMaxLength[colIndex] < colLength)
						colsMaxLength[colIndex] = colLength;
				}
			}
		}

		table += addTableRow(caption, " ", colsMaxLength);
		table += addTableRow(new String[5], "-", colsMaxLength);
		for (priorityIndex = 0; priorityIndex < priorities.length; priorityIndex++) {
			String[][][] rows = mapPriorities.get(priorities[priorityIndex]);
			for (int rowIndex = 0; rowIndex < rows.length; rowIndex++)
				table += addTableRow(rows[rowIndex], " ", colsMaxLength);
		}

		return table;
	}

	private String addTableRow(String[] row, String postfixChar, int[] colsMaxLength) {
		String tableRow = "";
		for (int colIndex = 0; colIndex < numOfCols; colIndex++) {
			if (!tableRow.isEmpty())
				tableRow += " | ";

			String rowValue = "";
			int rowLength = 0;
			if (row[colIndex] != null) {
				rowValue = row[colIndex];
				rowLength = rowValue.length();
			}

			String postfix = "";
			for (int postfixIndex = 1; postfixIndex <= colsMaxLength[colIndex] - rowLength; postfixIndex++)
				postfix += postfixChar;
			tableRow += rowValue.concat(postfix);
		}

		return tableRow + System.lineSeparator();
	}

	private String addTableRow(String[][] row, String postfixChar, int[] colsMaxLength) {
		String tableRow = "";
		for (int colIndex = 0; colIndex < numOfCols; colIndex++) {
			if (!tableRow.isEmpty())
				tableRow += " | ";

			String rowValue = "";
			int rowLength = 0;
			if (row[colIndex] != null) {
				rowValue = row[colIndex][0];
				rowLength = rowValue.length();
			}

			String postfix = "";
			for (int postfixIndex = 1; postfixIndex <= colsMaxLength[colIndex] - rowLength; postfixIndex++)
				postfix += postfixChar;
			tableRow += rowValue.concat(postfix);
		}

		return tableRow + System.lineSeparator();
	}

	private String addTabs(int numOfTabs) {
		String tabString = "&nbsp; &nbsp; ";

		String tabs = "";
		for (int tabIndex = 1; tabIndex <= numOfTabs; tabIndex++)
			tabs += tabString;

		return tabs;
	}
}
