package ru.capralow.dt.conversion.plugin.core.cm;

import java.io.IOException;
import java.util.Iterator;

public class ConversionModuleReport {

	private ConversionModule conversionModule;

	public ConversionModuleReport(ConversionModule conversionModule) {
		this.conversionModule = conversionModule;
	}

	public String createReport() throws IOException {
		String result = "";
		result += "## Описание формата миграции данных (подробное)\r\n";
		result += "\r\n";

		Iterator<CmSubsystem> itr = conversionModule.getSubsystems().iterator();
		while (itr.hasNext()) {
			CmSubsystem subsystem = itr.next();

			result += "### " + subsystem.getName() + "\r\n\r\n";
		}

		return result;
	}

}
