package ru.capralow.dt.conversion.plugin.core.tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import com.google.common.io.CharSource;
import com.google.common.io.CharStreams;
import com.google.common.io.Resources;

import ru.capralow.dt.conversion.plugin.core.ConversionModuleAnalyzer;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined;
import ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmFactory;

public class ConversionModuleAnalyzerTest {

	@Test
	public void testGetDataRuleComparatorByName() {
		String report1 = String.join(System.lineSeparator(), "Документ.МойВторойДокумент ВтороеПравило",
				"Документ.МойПервыйДокумент ВтороеПравило", "Документ.МойВторойДокумент ПервоеПравило",
				"Документ.МойПервыйДокумент ПервоеПравило", "Документ.МойВторойДокумент ТретьеПравило",
				"Документ.МойПервыйДокумент ТретьеПравило");

		BasicEList<CmDataRule> report2 = new BasicEList<CmDataRule>();

		CmDataRule dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ПервоеПравило");
		dataRule.setFormatObject("Документ.МойПервыйДокумент");
		dataRule.setConfigurationObjectName("Метаданные.Документы.МойПервыйДокумент");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ВтороеПравило");
		dataRule.setFormatObject("Документ.МойПервыйДокумент");
		dataRule.setConfigurationObjectName("Метаданные.Документы.МойПервыйДокумент");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ТретьеПравило");
		dataRule.setFormatObject("Документ.МойПервыйДокумент");
		dataRule.setConfigurationObjectName("Метаданные.Документы.МойПервыйДокумент");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ПервоеПравило");
		dataRule.setFormatObject("Документ.МойВторойДокумент");
		dataRule.setConfigurationObjectName("Метаданные.Документы.МойВторойДокумент");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ВтороеПравило");
		dataRule.setFormatObject("Документ.МойВторойДокумент");
		dataRule.setConfigurationObjectName("Метаданные.Документы.МойВторойДокумент");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ТретьеПравило");
		dataRule.setFormatObject("Документ.МойВторойДокумент");
		dataRule.setConfigurationObjectName("Метаданные.Документы.МойВторойДокумент");

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getDataRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_NAME));

		assertEquals("Модуль обмена: сортировка ПОД", report1.toString().replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testGetDataRuleComparatorBySending() {
		String report1 = String.join(System.lineSeparator(), "Документ.МойВторойДокумент ВтороеПравило",
				"Документ.МойВторойДокумент ПервоеПравило", "Документ.МойВторойДокумент ТретьеПравило",
				"Документ.МойПервыйДокумент ВтороеПравило", "Документ.МойПервыйДокумент ПервоеПравило",
				"Документ.МойПервыйДокумент ТретьеПравило");

		BasicEList<CmDataRule> report2 = new BasicEList<CmDataRule>();

		CmDataRule dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ПервоеПравило");
		dataRule.setFormatObject("Документ.МойПервыйДокумент");
		dataRule.setConfigurationObjectName("Метаданные.Документы.МойПервыйДокумент");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ВтороеПравило");
		dataRule.setFormatObject("Документ.МойПервыйДокумент");
		dataRule.setConfigurationObjectName("Метаданные.Документы.МойПервыйДокумент");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ТретьеПравило");
		dataRule.setFormatObject("Документ.МойПервыйДокумент");
		dataRule.setConfigurationObjectName("Метаданные.Документы.МойПервыйДокумент");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ПервоеПравило");
		dataRule.setFormatObject("Документ.МойВторойДокумент");
		dataRule.setConfigurationObjectName("Метаданные.Документы.МойВторойДокумент");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ВтороеПравило");
		dataRule.setFormatObject("Документ.МойВторойДокумент");
		dataRule.setConfigurationObjectName("Метаданные.Документы.МойВторойДокумент");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ТретьеПравило");
		dataRule.setFormatObject("Документ.МойВторойДокумент");
		dataRule.setConfigurationObjectName("Метаданные.Документы.МойВторойДокумент");

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getDataRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_SENDING));

		assertEquals("Модуль обмена: сортировка ПОД", report1.toString().replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testGetDataRuleComparatorByReceiving() {
		String report1 = String.join(System.lineSeparator(), "Документ.МойВторойДокумент ВтороеПравило",
				"Документ.МойВторойДокумент ПервоеПравило", "Документ.МойВторойДокумент ТретьеПравило",
				"Документ.МойПервыйДокумент ВтороеПравило", "Документ.МойПервыйДокумент ПервоеПравило",
				"Документ.МойПервыйДокумент ТретьеПравило");

		BasicEList<CmDataRule> report2 = new BasicEList<CmDataRule>();

		CmDataRule dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ПервоеПравило");
		dataRule.setFormatObject("Документ.МойПервыйДокумент");
		dataRule.setConfigurationObjectName("Метаданные.Документы.МойПервыйДокумент");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ВтороеПравило");
		dataRule.setFormatObject("Документ.МойПервыйДокумент");
		dataRule.setConfigurationObjectName("Метаданные.Документы.МойПервыйДокумент");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ТретьеПравило");
		dataRule.setFormatObject("Документ.МойПервыйДокумент");
		dataRule.setConfigurationObjectName("Метаданные.Документы.МойПервыйДокумент");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ПервоеПравило");
		dataRule.setFormatObject("Документ.МойВторойДокумент");
		dataRule.setConfigurationObjectName("Метаданные.Документы.МойВторойДокумент");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ВтороеПравило");
		dataRule.setFormatObject("Документ.МойВторойДокумент");
		dataRule.setConfigurationObjectName("Метаданные.Документы.МойВторойДокумент");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ТретьеПравило");
		dataRule.setFormatObject("Документ.МойВторойДокумент");
		dataRule.setConfigurationObjectName("Метаданные.Документы.МойВторойДокумент");

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getDataRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_RECEIVING));

		assertEquals("Модуль обмена: сортировка ПОД", report1.toString().replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testGetObjectRuleComparatorByName() {
		String report1 = String.join(System.lineSeparator(), "Документ.МойВторойДокумент ВтороеПравило",
				"Документ.МойПервыйДокумент ВтороеПравило", "Документ.МойВторойДокумент ПервоеПравило",
				"Документ.МойПервыйДокумент ПервоеПравило", "Документ.МойВторойДокумент ТретьеПравило",
				"Документ.МойПервыйДокумент ТретьеПравило");

		BasicEList<CmObjectRule> report2 = new BasicEList<CmObjectRule>();

		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ПервоеПравило");
		objectRule.setFormatObject("Документ.МойПервыйДокумент");
		objectRule.setConfigurationObjectName("Метаданные.Документы.МойПервыйДокумент");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ВтороеПравило");
		objectRule.setFormatObject("Документ.МойПервыйДокумент");
		objectRule.setConfigurationObjectName("Метаданные.Документы.МойПервыйДокумент");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ТретьеПравило");
		objectRule.setFormatObject("Документ.МойПервыйДокумент");
		objectRule.setConfigurationObjectName("Метаданные.Документы.МойПервыйДокумент");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ПервоеПравило");
		objectRule.setFormatObject("Документ.МойВторойДокумент");
		objectRule.setConfigurationObjectName("Метаданные.Документы.МойВторойДокумент");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ВтороеПравило");
		objectRule.setFormatObject("Документ.МойВторойДокумент");
		objectRule.setConfigurationObjectName("Метаданные.Документы.МойВторойДокумент");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ТретьеПравило");
		objectRule.setFormatObject("Документ.МойВторойДокумент");
		objectRule.setConfigurationObjectName("Метаданные.Документы.МойВторойДокумент");

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getObjectRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_NAME));

		assertEquals("Модуль обмена: сортировка ПКО", report1.toString().replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testGetObjectRuleComparatorBySending() {
		String report1 = String.join(System.lineSeparator(), "Документ.МойВторойДокумент ВтороеПравило",
				"Документ.МойВторойДокумент ПервоеПравило", "Документ.МойВторойДокумент ТретьеПравило",
				"Документ.МойПервыйДокумент ВтороеПравило", "Документ.МойПервыйДокумент ПервоеПравило",
				"Документ.МойПервыйДокумент ТретьеПравило");

		BasicEList<CmObjectRule> report2 = new BasicEList<CmObjectRule>();

		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ПервоеПравило");
		objectRule.setFormatObject("Документ.МойПервыйДокумент");
		objectRule.setConfigurationObjectName("Метаданные.Документы.МойПервыйДокумент");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ВтороеПравило");
		objectRule.setFormatObject("Документ.МойПервыйДокумент");
		objectRule.setConfigurationObjectName("Метаданные.Документы.МойПервыйДокумент");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ТретьеПравило");
		objectRule.setFormatObject("Документ.МойПервыйДокумент");
		objectRule.setConfigurationObjectName("Метаданные.Документы.МойПервыйДокумент");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ПервоеПравило");
		objectRule.setFormatObject("Документ.МойВторойДокумент");
		objectRule.setConfigurationObjectName("Метаданные.Документы.МойВторойДокумент");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ВтороеПравило");
		objectRule.setFormatObject("Документ.МойВторойДокумент");
		objectRule.setConfigurationObjectName("Метаданные.Документы.МойВторойДокумент");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ТретьеПравило");
		objectRule.setFormatObject("Документ.МойВторойДокумент");
		objectRule.setConfigurationObjectName("Метаданные.Документы.МойВторойДокумент");

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getObjectRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_SENDING));

		assertEquals("Модуль обмена: сортировка ПКО", report1.toString().replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testGetObjectRuleComparatorByReceiving() {
		String report1 = String.join(System.lineSeparator(), "Документ.МойВторойДокумент ВтороеПравило",
				"Документ.МойВторойДокумент ПервоеПравило", "Документ.МойВторойДокумент ТретьеПравило",
				"Документ.МойПервыйДокумент ВтороеПравило", "Документ.МойПервыйДокумент ПервоеПравило",
				"Документ.МойПервыйДокумент ТретьеПравило");

		BasicEList<CmObjectRule> report2 = new BasicEList<CmObjectRule>();

		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ПервоеПравило");
		objectRule.setFormatObject("Документ.МойПервыйДокумент");
		objectRule.setConfigurationObjectName("Метаданные.Документы.МойПервыйДокумент");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ВтороеПравило");
		objectRule.setFormatObject("Документ.МойПервыйДокумент");
		objectRule.setConfigurationObjectName("Метаданные.Документы.МойПервыйДокумент");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ТретьеПравило");
		objectRule.setFormatObject("Документ.МойПервыйДокумент");
		objectRule.setConfigurationObjectName("Метаданные.Документы.МойПервыйДокумент");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ПервоеПравило");
		objectRule.setFormatObject("Документ.МойВторойДокумент");
		objectRule.setConfigurationObjectName("Метаданные.Документы.МойВторойДокумент");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ВтороеПравило");
		objectRule.setFormatObject("Документ.МойВторойДокумент");
		objectRule.setConfigurationObjectName("Метаданные.Документы.МойВторойДокумент");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ТретьеПравило");
		objectRule.setFormatObject("Документ.МойВторойДокумент");
		objectRule.setConfigurationObjectName("Метаданные.Документы.МойВторойДокумент");

		ECollections.sort(report2, ConversionModuleAnalyzer
				.getObjectRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_RECEIVING));

		assertEquals("Модуль обмена: сортировка ПКО", report1.toString().replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testGetPredefinedComparator() {
		String report1 = String.join(System.lineSeparator(), "Документ.МойВторойДокумент ВтороеПравило",
				"Документ.МойВторойДокумент ПервоеПравило", "Документ.МойВторойДокумент ТретьеПравило",
				"Документ.МойПервыйДокумент ВтороеПравило", "Документ.МойПервыйДокумент ПервоеПравило",
				"Документ.МойПервыйДокумент ТретьеПравило");

		BasicEList<CmPredefined> report2 = new BasicEList<CmPredefined>();

		CmPredefined predefined = cmFactory.eINSTANCE.createCmPredefined();
		report2.add(predefined);
		predefined.setName("ПервоеПравило");
		predefined.setFormatObject("Документ.МойПервыйДокумент");
		predefined.setConfigurationObjectName("Метаданные.Документы.МойПервыйДокумент");
		predefined = cmFactory.eINSTANCE.createCmPredefined();
		report2.add(predefined);
		predefined.setName("ВтороеПравило");
		predefined.setFormatObject("Документ.МойПервыйДокумент");
		predefined.setConfigurationObjectName("Метаданные.Документы.МойПервыйДокумент");
		predefined = cmFactory.eINSTANCE.createCmPredefined();
		report2.add(predefined);
		predefined.setName("ТретьеПравило");
		predefined.setFormatObject("Документ.МойПервыйДокумент");
		predefined.setConfigurationObjectName("Метаданные.Документы.МойПервыйДокумент");
		predefined = cmFactory.eINSTANCE.createCmPredefined();
		report2.add(predefined);
		predefined.setName("ПервоеПравило");
		predefined.setFormatObject("Документ.МойВторойДокумент");
		predefined.setConfigurationObjectName("Метаданные.Документы.МойВторойДокумент");
		predefined = cmFactory.eINSTANCE.createCmPredefined();
		report2.add(predefined);
		predefined.setName("ВтороеПравило");
		predefined.setFormatObject("Документ.МойВторойДокумент");
		predefined.setConfigurationObjectName("Метаданные.Документы.МойВторойДокумент");
		predefined = cmFactory.eINSTANCE.createCmPredefined();
		report2.add(predefined);
		predefined.setName("ТретьеПравило");
		predefined.setFormatObject("Документ.МойВторойДокумент");
		predefined.setConfigurationObjectName("Метаданные.Документы.МойВторойДокумент");

		ECollections.sort(report2, ConversionModuleAnalyzer.getPredefinedComparator());

		assertEquals("Модуль обмена: сортировка ПКПД", report1.toString().replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testGetAlgorithmComparator() {
		String report1 = String.join(System.lineSeparator(), "Документ.МойВторойДокумент ВтороеПравило",
				"Документ.МойВторойДокумент ПервоеПравило", "Документ.МойВторойДокумент ТретьеПравило",
				"Документ.МойПервыйДокумент ВтороеПравило", "Документ.МойПервыйДокумент ПервоеПравило",
				"Документ.МойПервыйДокумент ТретьеПравило");

		BasicEList<CmAlgorithm> report2 = new BasicEList<CmAlgorithm>();

		CmAlgorithm objectRule = cmFactory.eINSTANCE.createCmAlgorithm();
		report2.add(objectRule);
		objectRule.setName("ПервоеПравило");
		objectRule = cmFactory.eINSTANCE.createCmAlgorithm();
		report2.add(objectRule);
		objectRule.setName("ВтороеПравило");
		objectRule = cmFactory.eINSTANCE.createCmAlgorithm();
		report2.add(objectRule);
		objectRule.setName("ТретьеПравило");
		objectRule = cmFactory.eINSTANCE.createCmAlgorithm();
		report2.add(objectRule);
		objectRule.setName("ПервоеПравило");
		objectRule = cmFactory.eINSTANCE.createCmAlgorithm();
		report2.add(objectRule);
		objectRule.setName("ВтороеПравило");
		objectRule = cmFactory.eINSTANCE.createCmAlgorithm();
		report2.add(objectRule);
		objectRule.setName("ТретьеПравило");

		ECollections.sort(report2, ConversionModuleAnalyzer.getAlgorithmComparator());

		assertEquals("Модуль обмена: сортировка Алгоритмов", report1.toString().replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testGetModuleText() {
		String projectName = "ЗУПКОРП-3_1_9";
		String moduleName = "МенеджерОбменаЧерезУниверсальныйФормат";

		final String NAME = projectName + "/" + moduleName + ".txt";
		String report1 = readContents(getFileInputSupplier(NAME), NAME).replace("\r\n", System.lineSeparator());

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
