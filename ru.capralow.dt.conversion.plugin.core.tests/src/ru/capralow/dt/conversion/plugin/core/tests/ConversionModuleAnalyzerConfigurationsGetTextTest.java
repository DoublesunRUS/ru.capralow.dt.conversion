package ru.capralow.dt.conversion.plugin.core.tests;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import ru.capralow.dt.conversion.plugin.core.ConversionModuleAnalyzer;
import ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule;

public class ConversionModuleAnalyzerConfigurationsGetTextTest {
	private static ConversionModule getConversionModule(String projectName, String moduleName) {
		URI xmiURI = getResourceURI(projectName + "/" + "conversionModule-" + moduleName + ".xmi");
		return ConversionModuleAnalyzer.loadResource(xmiURI, null);
	}

	private static URI getResourceURI(String partName) {
		return URI
				.createPlatformPluginURI(
						"ru.capralow.dt.conversion.plugin.core.tests"
								+ ConversionModuleAnalyzerObjectRuleSendingTextTest.class
										.getResource("/resources/" + partName).getFile(),
						true);
	}

	@Test
	public void testHrmCorp319() {
		String projectName = "ЗУПКОРП-3_1_9";
		String moduleName = "МенеджерОбменаЧерезУниверсальныйФормат";

		String report1 = ConversionModuleAnalyzerUtils.getModuleText(projectName, moduleName);

		ConversionModule conversionModule = getConversionModule(projectName, moduleName);

		// Конвертация ЗУП3.1.3 от 21.08.2017 13:05:35
		String report2 = ConversionModuleAnalyzer
				.getModuleText(conversionModule, "ЗУП3.1.3", LocalDateTime.of(2017, 8, 21, 13, 5, 35));

		assertEquals("Модуль обмена: " + projectName + " запись модуля", report1, report2);
	}

	@Test
	public void testErp247() {
		String projectName = "УП-2_4_7";
		String moduleName = "МенеджерОбменаЧерезУниверсальныйФормат";

		String report1 = ConversionModuleAnalyzerUtils.getModuleText(projectName, moduleName);

		ConversionModule conversionModule = getConversionModule(projectName, moduleName);

		// Конвертация УП2.4.7 от 28.02.2019 16:35:46
		String report2 = ConversionModuleAnalyzer
				.getModuleText(conversionModule, "УП2.4.7", LocalDateTime.of(2019, 2, 28, 16, 35, 46));

		assertEquals("Модуль обмена: " + projectName + " запись модуля", report1, report2);
	}
}
