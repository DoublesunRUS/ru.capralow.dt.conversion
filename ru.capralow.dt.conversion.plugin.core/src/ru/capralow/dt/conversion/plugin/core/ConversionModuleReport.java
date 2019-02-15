package ru.capralow.dt.conversion.plugin.core;

import java.io.IOException;

import ru.capralow.dt.conversion.plugin.core.cm.CmSubsystem;
import ru.capralow.dt.conversion.plugin.core.cm.ConversionModule;

public class ConversionModuleReport {

	private ConversionModule conversionModule;

	public ConversionModuleReport(ConversionModule conversionModule) {
		this.conversionModule = conversionModule;
	}

	public String createReport() throws IOException {
		String result = "";
		result += "## Описание формата миграции данных (подробное)\r\n";
		result += "\r\n";

		for (CmSubsystem subsystem : conversionModule.getSubsystems()) {
			result += "### " + subsystem.getName() + "\r\n\r\n";
		}

		return result;
	}

}
