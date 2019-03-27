package ru.capralow.dt.conversion.plugin.core.tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import com.google.common.io.CharSource;
import com.google.common.io.CharStreams;
import com.google.common.io.Resources;

import ru.capralow.dt.conversion.plugin.core.ConversionModuleAnalyzer;
import ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule;

public class ConversionModuleAnalyzerTest {

	@Test
	public void testGetModuleText() {
		String projectName = "ЗУПКОРП-3_1_9";
		String moduleName = "МенеджерОбменаЧерезУниверсальныйФормат";

		final String NAME = projectName + "/" + moduleName + ".txt";
		String report1 = readContents(getFileInputSupplier(NAME), NAME);

		URI xmiURI = getResourceURI(projectName + "/" + "conversionModule-" + moduleName + ".xmi");
		ConversionModule conversionModule = ConversionModuleAnalyzer.loadResource(xmiURI, null);

		String report2 = ConversionModuleAnalyzer.getModuleText(conversionModule, "ЗУП3.1.3",
				LocalDateTime.of(2017, 8, 21, 13, 5, 35));

		assertEquals("Модуль обмена: " + projectName + " запись модуля", report1, report2);
	}

	private static String readContents(CharSource source, String path) {
		try (Reader reader = source.openBufferedStream()) {
			return CharStreams.toString(reader);
		} catch (IOException | NullPointerException e) {
			return "";
		}
	}

	private static CharSource getFileInputSupplier(String partName) {
		return Resources.asCharSource(ConversionModuleAnalyzerTest.class.getResource("/resources/" + partName),
				StandardCharsets.UTF_8);
	}

	private static URI getResourceURI(String partName) {
		return URI.createPlatformPluginURI("ru.capralow.dt.conversion.plugin.core.tests"
				+ ConversionModuleAnalyzerTest.class.getResource("/resources/" + partName).getFile(), true);
	}
}
