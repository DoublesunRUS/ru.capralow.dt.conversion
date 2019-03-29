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
		String report1 = String.join(System.lineSeparator(),
				"name:ВтороеПравило md:Метаданные.Документы.Документ1 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ПервоеПравило md:Метаданные.Документы.Документ2 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ПятоеПравило md:Метаданные.Документы.Документ3 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ТретьеПравило md:Метаданные.Документы.Документ4 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ЧетвертоеПравило md:Метаданные.Документы.Документ5 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ШестоеПравило md:Метаданные.Документы.Документ6 xdto:<Пустое> <НаправлениеНеЗадано>");

		BasicEList<CmDataRule> report2 = new BasicEList<CmDataRule>();

		CmDataRule dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ПервоеПравило");
		dataRule.setConfigurationObjectName("Метаданные.Документы.Документ2");
		dataRule.setFormatObject("");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ВтороеПравило");
		dataRule.setConfigurationObjectName("Метаданные.Документы.Документ1");
		dataRule.setFormatObject("");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ТретьеПравило");
		dataRule.setConfigurationObjectName("Метаданные.Документы.Документ4");
		dataRule.setFormatObject("");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ЧетвертоеПравило");
		dataRule.setConfigurationObjectName("Метаданные.Документы.Документ5");
		dataRule.setFormatObject("");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ПятоеПравило");
		dataRule.setConfigurationObjectName("Метаданные.Документы.Документ3");
		dataRule.setFormatObject("");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName("ШестоеПравило");
		dataRule.setConfigurationObjectName("Метаданные.Документы.Документ6");
		dataRule.setFormatObject("");

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getDataRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_NAME));

		assertEquals("Модуль обмена: сортировка ПОД", report1.toString().replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testGetDataRuleComparatorByMd() {
		String report1 = String.join(System.lineSeparator(),
				"name:ПервоеПравило md:<Пустое> xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ВтороеПравило md:<Пустое> xdto:Документ.Документ5 <НаправлениеНеЗадано>",
				"name:ТретьеПравило md:Метаданные.Документы.Документ1 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ЧетвертоеПравило md:Метаданные.Документы.Документ1 xdto:Документ.Документ4 <НаправлениеНеЗадано>",
				"name:ПятоеПравило md:Метаданные.Документы.Документ2 xdto:Документ.Документ6 <НаправлениеНеЗадано>",
				"name:ШестоеПравило md:Метаданные.Документы.Документ3 xdto:Документ.Документ2 <НаправлениеНеЗадано>");

		BasicEList<CmDataRule> report2 = new BasicEList<CmDataRule>();

		CmDataRule dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setConfigurationObjectName("Метаданные.Документы.Документ2");
		dataRule.setFormatObject("Документ.Документ6");
		dataRule.setName("ПятоеПравило");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setConfigurationObjectName("Метаданные.Документы.Документ3");
		dataRule.setFormatObject("Документ.Документ2");
		dataRule.setName("ШестоеПравило");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setConfigurationObjectName("Метаданные.Документы.Документ1");
		dataRule.setFormatObject("Документ.Документ4");
		dataRule.setName("ЧетвертоеПравило");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setConfigurationObjectName("Метаданные.Документы.Документ1");
		dataRule.setFormatObject("");
		dataRule.setName("ТретьеПравило");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setConfigurationObjectName("");
		dataRule.setFormatObject("Документ.Документ5");
		dataRule.setName("ВтороеПравило");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setConfigurationObjectName("");
		dataRule.setFormatObject("");
		dataRule.setName("ПервоеПравило");

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getDataRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_SENDING));

		assertEquals("Модуль обмена: сортировка ПОД", report1.toString().replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testGetDataRuleComparatorByXdto() {
		String report1 = String.join(System.lineSeparator(),
				"name:ПервоеПравило md:<Пустое> xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ВтороеПравило md:Метаданные.Документы.Документ5 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ТретьеПравило md:<Пустое> xdto:Документ.Документ1 <НаправлениеНеЗадано>",
				"name:ЧетвертоеПравило md:Метаданные.Документы.Документ4 xdto:Документ.Документ1 <НаправлениеНеЗадано>",
				"name:ПятоеПравило md:Метаданные.Документы.Документ6 xdto:Документ.Документ2 <НаправлениеНеЗадано>",
				"name:ШестоеПравило md:Метаданные.Документы.Документ2 xdto:Документ.Документ3 <НаправлениеНеЗадано>");

		BasicEList<CmDataRule> report2 = new BasicEList<CmDataRule>();

		CmDataRule dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setFormatObject("Документ.Документ2");
		dataRule.setConfigurationObjectName("Метаданные.Документы.Документ6");
		dataRule.setName("ПятоеПравило");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setFormatObject("Документ.Документ3");
		dataRule.setConfigurationObjectName("Метаданные.Документы.Документ2");
		dataRule.setName("ШестоеПравило");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setFormatObject("Документ.Документ1");
		dataRule.setConfigurationObjectName("Метаданные.Документы.Документ4");
		dataRule.setName("ЧетвертоеПравило");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setFormatObject("Документ.Документ1");
		dataRule.setConfigurationObjectName("");
		dataRule.setName("ТретьеПравило");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setFormatObject("");
		dataRule.setConfigurationObjectName("Метаданные.Документы.Документ5");
		dataRule.setName("ВтороеПравило");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setConfigurationObjectName("");
		dataRule.setFormatObject("");
		dataRule.setName("ПервоеПравило");

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getDataRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_RECEIVING));

		assertEquals("Модуль обмена: сортировка ПОД", report1.toString().replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testGetObjectRuleComparatorByName() {
		String report1 = String.join(System.lineSeparator(),
				"name:ВтороеПравило md:Метаданные.Документы.Документ1 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ПервоеПравило md:Метаданные.Документы.Документ2 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ПятоеПравило md:Метаданные.Документы.Документ3 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ТретьеПравило md:Метаданные.Документы.Документ4 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ЧетвертоеПравило md:Метаданные.Документы.Документ5 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ШестоеПравило md:Метаданные.Документы.Документ6 xdto:<Пустое> <НаправлениеНеЗадано>");

		BasicEList<CmObjectRule> report2 = new BasicEList<CmObjectRule>();

		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ПервоеПравило");
		objectRule.setConfigurationObjectName("Метаданные.Документы.Документ2");
		objectRule.setFormatObject("");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ВтороеПравило");
		objectRule.setConfigurationObjectName("Метаданные.Документы.Документ1");
		objectRule.setFormatObject("");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ТретьеПравило");
		objectRule.setConfigurationObjectName("Метаданные.Документы.Документ4");
		objectRule.setFormatObject("");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ЧетвертоеПравило");
		objectRule.setConfigurationObjectName("Метаданные.Документы.Документ5");
		objectRule.setFormatObject("");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ПятоеПравило");
		objectRule.setConfigurationObjectName("Метаданные.Документы.Документ3");
		objectRule.setFormatObject("");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName("ШестоеПравило");
		objectRule.setConfigurationObjectName("Метаданные.Документы.Документ6");
		objectRule.setFormatObject("");

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getObjectRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_NAME));

		assertEquals("Модуль обмена: сортировка ПКО", report1.toString().replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testGetObjectRuleComparatorByMd() {
		String report1 = String.join(System.lineSeparator(),
				"name:ПервоеПравило md:<Пустое> xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ВтороеПравило md:<Пустое> xdto:Документ.Документ5 <НаправлениеНеЗадано>",
				"name:ТретьеПравило md:Метаданные.Документы.Документ1 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ЧетвертоеПравило md:Метаданные.Документы.Документ1 xdto:Документ.Документ4 <НаправлениеНеЗадано>",
				"name:ПятоеПравило md:Метаданные.Документы.Документ2 xdto:Документ.Документ6 <НаправлениеНеЗадано>",
				"name:ШестоеПравило md:Метаданные.Документы.Документ3 xdto:Документ.Документ2 <НаправлениеНеЗадано>");

		BasicEList<CmObjectRule> report2 = new BasicEList<CmObjectRule>();

		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setConfigurationObjectName("Метаданные.Документы.Документ2");
		objectRule.setFormatObject("Документ.Документ6");
		objectRule.setName("ПятоеПравило");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setConfigurationObjectName("Метаданные.Документы.Документ3");
		objectRule.setFormatObject("Документ.Документ2");
		objectRule.setName("ШестоеПравило");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setConfigurationObjectName("Метаданные.Документы.Документ1");
		objectRule.setFormatObject("Документ.Документ4");
		objectRule.setName("ЧетвертоеПравило");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setConfigurationObjectName("Метаданные.Документы.Документ1");
		objectRule.setFormatObject("");
		objectRule.setName("ТретьеПравило");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setConfigurationObjectName("");
		objectRule.setFormatObject("Документ.Документ5");
		objectRule.setName("ВтороеПравило");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setConfigurationObjectName("");
		objectRule.setFormatObject("");
		objectRule.setName("ПервоеПравило");

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getObjectRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_SENDING));

		assertEquals("Модуль обмена: сортировка ПКО по объекту конфигурации (метаданным)",
				report1.toString().replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testGetObjectRuleComparatorByXdto() {
		String report1 = String.join(System.lineSeparator(),
				"name:ПервоеПравило md:<Пустое> xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ВтороеПравило md:Метаданные.Документы.Документ5 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ТретьеПравило md:<Пустое> xdto:Документ.Документ1 <НаправлениеНеЗадано>",
				"name:ЧетвертоеПравило md:Метаданные.Документы.Документ4 xdto:Документ.Документ1 <НаправлениеНеЗадано>",
				"name:ПятоеПравило md:Метаданные.Документы.Документ6 xdto:Документ.Документ2 <НаправлениеНеЗадано>",
				"name:ШестоеПравило md:Метаданные.Документы.Документ2 xdto:Документ.Документ3 <НаправлениеНеЗадано>");

		BasicEList<CmObjectRule> report2 = new BasicEList<CmObjectRule>();

		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setFormatObject("Документ.Документ2");
		objectRule.setConfigurationObjectName("Метаданные.Документы.Документ6");
		objectRule.setName("ПятоеПравило");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setFormatObject("Документ.Документ3");
		objectRule.setConfigurationObjectName("Метаданные.Документы.Документ2");
		objectRule.setName("ШестоеПравило");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setFormatObject("Документ.Документ1");
		objectRule.setConfigurationObjectName("Метаданные.Документы.Документ4");
		objectRule.setName("ЧетвертоеПравило");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setFormatObject("Документ.Документ1");
		objectRule.setConfigurationObjectName("");
		objectRule.setName("ТретьеПравило");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setFormatObject("");
		objectRule.setConfigurationObjectName("Метаданные.Документы.Документ5");
		objectRule.setName("ВтороеПравило");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setConfigurationObjectName("");
		objectRule.setFormatObject("");
		objectRule.setName("ПервоеПравило");

		ECollections.sort(report2, ConversionModuleAnalyzer
				.getObjectRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_RECEIVING));

		assertEquals("Модуль обмена: сортировка ПКО", report1.toString().replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testGetPredefinedComparator() {
		String report1 = String.join(System.lineSeparator(),
				"name:ВтороеПравило md:Метаданные.Документы.Документ1 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ПервоеПравило md:Метаданные.Документы.Документ2 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ПятоеПравило md:Метаданные.Документы.Документ3 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ТретьеПравило md:Метаданные.Документы.Документ4 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ЧетвертоеПравило md:Метаданные.Документы.Документ5 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ШестоеПравило md:Метаданные.Документы.Документ6 xdto:<Пустое> <НаправлениеНеЗадано>");

		BasicEList<CmPredefined> report2 = new BasicEList<CmPredefined>();

		CmPredefined predefined = cmFactory.eINSTANCE.createCmPredefined();
		report2.add(predefined);
		predefined.setName("ПервоеПравило");
		predefined.setConfigurationObjectName("Метаданные.Документы.Документ2");
		predefined.setFormatObject("");
		predefined = cmFactory.eINSTANCE.createCmPredefined();
		report2.add(predefined);
		predefined.setName("ВтороеПравило");
		predefined.setConfigurationObjectName("Метаданные.Документы.Документ1");
		predefined.setFormatObject("");
		predefined = cmFactory.eINSTANCE.createCmPredefined();
		report2.add(predefined);
		predefined.setName("ТретьеПравило");
		predefined.setConfigurationObjectName("Метаданные.Документы.Документ4");
		predefined.setFormatObject("");
		predefined = cmFactory.eINSTANCE.createCmPredefined();
		report2.add(predefined);
		predefined.setName("ЧетвертоеПравило");
		predefined.setConfigurationObjectName("Метаданные.Документы.Документ5");
		predefined.setFormatObject("");
		predefined = cmFactory.eINSTANCE.createCmPredefined();
		report2.add(predefined);
		predefined.setName("ПятоеПравило");
		predefined.setConfigurationObjectName("Метаданные.Документы.Документ3");
		predefined.setFormatObject("");
		predefined = cmFactory.eINSTANCE.createCmPredefined();
		report2.add(predefined);
		predefined.setName("ШестоеПравило");
		predefined.setConfigurationObjectName("Метаданные.Документы.Документ6");
		predefined.setFormatObject("");

		ECollections.sort(report2, ConversionModuleAnalyzer.getPredefinedComparator());

		assertEquals("Модуль обмена: сортировка ПКПД", report1.toString().replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testGetAlgorithmComparator() {
		String report1 = String.join(System.lineSeparator(), "Процедура ВтораяПроцедура(1)",
				"Процедура ПерваяПроцедура(2)", "Процедура ПятаяПроцедура(3)", "Процедура ТретьяПроцедура(4)",
				"Процедура ЧетвертаяПроцедура(5)", "Процедура ШестаяПроцедура(6)");

		BasicEList<CmAlgorithm> report2 = new BasicEList<CmAlgorithm>();

		CmAlgorithm objectRule = cmFactory.eINSTANCE.createCmAlgorithm();
		report2.add(objectRule);
		objectRule.setName("ПерваяПроцедура");
		objectRule.setParams("2");
		objectRule = cmFactory.eINSTANCE.createCmAlgorithm();
		report2.add(objectRule);
		objectRule.setName("ВтораяПроцедура");
		objectRule.setParams("1");
		objectRule = cmFactory.eINSTANCE.createCmAlgorithm();
		report2.add(objectRule);
		objectRule.setName("ТретьяПроцедура");
		objectRule.setParams("4");
		objectRule = cmFactory.eINSTANCE.createCmAlgorithm();
		report2.add(objectRule);
		objectRule.setName("ЧетвертаяПроцедура");
		objectRule.setParams("5");
		objectRule = cmFactory.eINSTANCE.createCmAlgorithm();
		report2.add(objectRule);
		objectRule.setName("ПятаяПроцедура");
		objectRule.setParams("3");
		objectRule = cmFactory.eINSTANCE.createCmAlgorithm();
		report2.add(objectRule);
		objectRule.setName("ШестаяПроцедура");
		objectRule.setParams("6");

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
