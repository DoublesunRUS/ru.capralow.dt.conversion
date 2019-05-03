package ru.capralow.dt.conversion.plugin.core.utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MarkdownTable {

	private String[] caption;
	private Map<Integer, String[][][]> mapPriorities = new HashMap<>();
	private Integer numOfCols;

	public MarkdownTable(String[] caption) {
		this.caption = caption;

		this.numOfCols = caption.length;
	}

	public void addRow(Integer priority, String[][] row) {
		if (row.length != numOfCols)
			throw new java.lang.StringIndexOutOfBoundsException(
					"Markdown table: Количество колонок в строке не соответствует количеству колонок в заголовке");

		String[][][] rows = mapPriorities.get(priority);
		if (rows == null) {
			rows = new String[1][][];

		} else {
			String[][][] tempRows = new String[rows.length + 1][][];
			for (Integer i = 0; i < rows.length; i++)
				tempRows[i] = rows[i];
			rows = tempRows;

		}

		rows[rows.length - 1] = row;
		for (Integer colIndex = 0; colIndex < numOfCols; colIndex++) {
			String[] cell = row[colIndex];
			if (cell.length != 3)
				throw new java.lang.StringIndexOutOfBoundsException(
						"Markdown table: Количество значений в ячейке должно быть равно 3");

			if (!cell[0].isEmpty()) {
				Integer numOfTabs = Integer.parseInt(cell[1]);
				String cellStyle = cell[2];
				cell[0] = addTabs(numOfTabs) + cellStyle + cell[0] + cellStyle;
			}
		}

		mapPriorities.put(priority, rows);
	}

	public String getTable() {
		StringBuilder table = new StringBuilder();
		if (mapPriorities.isEmpty())
			return table.toString();

		Integer[] priorities = new Integer[mapPriorities.size()];
		Integer priorityIndex = 0;
		for (Entry<Integer, String[][][]> priority : mapPriorities.entrySet()) {
			priorities[priorityIndex] = priority.getKey();
			priorityIndex++;
		}
		Arrays.sort(priorities);

		Integer[] colsMaxLength = countColsMaxLength(priorities);

		table.append(addCaptionRow(caption, " ", colsMaxLength));
		table.append(addCaptionRow(new String[5], "-", colsMaxLength));
		for (priorityIndex = 0; priorityIndex < priorities.length; priorityIndex++) {
			String[][][] rows = mapPriorities.get(priorities[priorityIndex]);
			for (Integer rowIndex = 0; rowIndex < rows.length; rowIndex++)
				table.append(addTableRow(rows[rowIndex], " ", colsMaxLength));
		}

		return table.toString();
	}

	private String addCaptionRow(String[] row, String postfixChar, Integer[] colsMaxLength) {
		StringBuilder tableRow = new StringBuilder();
		for (Integer colIndex = 0; colIndex < numOfCols; colIndex++) {
			if (tableRow.length() != 0)
				tableRow.append(" | ");

			String rowValue = "";
			Integer rowLength = 0;
			if (row[colIndex] != null) {
				rowValue = row[colIndex];
				rowLength = rowValue.length();
			}

			StringBuilder postfix = new StringBuilder();
			for (Integer postfixIndex = 1; postfixIndex <= colsMaxLength[colIndex] - rowLength; postfixIndex++)
				postfix.append(postfixChar);
			tableRow.append(rowValue).append(postfix);
		}
		tableRow.append(System.lineSeparator());

		return tableRow.toString();
	}

	private String addTableRow(String[][] row, String postfixChar, Integer[] colsMaxLength) {
		StringBuilder tableRow = new StringBuilder();
		for (Integer colIndex = 0; colIndex < numOfCols; colIndex++) {
			if (tableRow.length() != 0)
				tableRow.append(" | ");

			String rowValue = "";
			Integer rowLength = 0;
			if (row[colIndex] != null) {
				rowValue = row[colIndex][0];
				rowLength = rowValue.length();
			}

			StringBuilder postfix = new StringBuilder();
			for (Integer postfixIndex = 1; postfixIndex <= colsMaxLength[colIndex] - rowLength; postfixIndex++)
				postfix.append(postfixChar);
			tableRow.append(rowValue).append(postfix);
		}
		tableRow.append(System.lineSeparator());

		return tableRow.toString();
	}

	private String addTabs(Integer numOfTabs) {
		final String tabString = "&nbsp; &nbsp; ";

		StringBuilder tabs = new StringBuilder();
		for (Integer tabIndex = 1; tabIndex <= numOfTabs; tabIndex++)
			tabs.append(tabString);

		return tabs.toString();
	}

	private Integer[] countColsMaxLength(Integer[] priorities) {
		Integer[] colsMaxLength = new Integer[numOfCols];

		for (Integer colIndex = 0; colIndex < numOfCols; colIndex++)
			colsMaxLength[colIndex] = caption[colIndex].length();

		for (Integer priorityIndex = 0; priorityIndex < priorities.length; priorityIndex++) {
			String[][][] rows = mapPriorities.get(priorities[priorityIndex]);
			for (Integer rowIndex = 0; rowIndex < rows.length; rowIndex++) {
				if (rows[rowIndex] == null)
					throw new java.lang.StringIndexOutOfBoundsException(
							"Markdown table: Количество строк в таблице меньше ожидаемого количества");

				for (Integer colIndex = 0; colIndex < numOfCols; colIndex++) {
					Integer colLength = rows[rowIndex][colIndex][0].length();
					if (colsMaxLength[colIndex] < colLength)
						colsMaxLength[colIndex] = colLength;
				}
			}
		}

		return colsMaxLength;
	}
}
