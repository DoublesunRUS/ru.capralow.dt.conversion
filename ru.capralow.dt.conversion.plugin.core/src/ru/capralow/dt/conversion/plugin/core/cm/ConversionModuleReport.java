package ru.capralow.dt.conversion.plugin.core.cm;

import java.io.IOException;

public class ConversionModuleReport {

	private ConversionModule conversionModule;

	public ConversionModuleReport(ConversionModule conversionModule) {
		this.conversionModule = conversionModule;
	}

	public String createReport() throws IOException {
		String result = "";
		result += "Hello World";
		result += "\r\n"; // write new line
		result += "Good Bye!";

		return result;
	}

}
