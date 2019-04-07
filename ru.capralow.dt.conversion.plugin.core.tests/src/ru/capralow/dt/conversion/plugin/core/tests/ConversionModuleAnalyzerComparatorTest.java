package ru.capralow.dt.conversion.plugin.core.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import ru.capralow.dt.conversion.plugin.core.ConversionModuleAnalyzer;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmFactory;

public class ConversionModuleAnalyzerComparatorTest {
	private static final String LS = System.lineSeparator();

	private static final String FIRST_RULE_MD = "name:ПервоеПравило md:Метаданные.Документы.Документ2 xdto:<Пустое> <НаправлениеНеЗадано>";
	private static final String SECOND_RULE_MD = "name:ВтороеПравило md:Метаданные.Документы.Документ1 xdto:<Пустое> <НаправлениеНеЗадано>";
	private static final String THIRD_RULE_MD = "name:ТретьеПравило md:Метаданные.Документы.Документ4 xdto:<Пустое> <НаправлениеНеЗадано>";
	private static final String FOURTH_RULE_MD = "name:ЧетвертоеПравило md:Метаданные.Документы.Документ5 xdto:<Пустое> <НаправлениеНеЗадано>";
	private static final String FIFTH_RULE_MD = "name:ПятоеПравило md:Метаданные.Документы.Документ3 xdto:<Пустое> <НаправлениеНеЗадано>";
	private static final String SIXTH_RULE_MD = "name:ШестоеПравило md:Метаданные.Документы.Документ6 xdto:<Пустое> <НаправлениеНеЗадано>";

	private static final String FIRST_RULE_XDTO = "name:ПервоеПравило md:<Пустое> xdto:<Пустое> <НаправлениеНеЗадано>";

	private static final String FIRST_RULE = "ПервоеПравило";
	private static final String SECOND_RULE = "ВтороеПравило";
	private static final String THIRD_RULE = "ТретьеПравило";
	private static final String FOURTH_RULE = "ЧетвертоеПравило";
	private static final String FIFTH_RULE = "ПятоеПравило";
	private static final String SIXTH_RULE = "ШестоеПравило";

	private static final String MD_DOCUMENT = "Метаданные.Документы.Документ";
	private static final String XDTO_DOCUMENT = "Документ.Документ";

	private static final String FIRST_TABULAR = "ПерваяТЧ";
	private static final String SECOND_TABULAR = "ВтораяТЧ";

	private static final String FIRST_ATTRIBUTE = "ПервыйАтрибут";
	private static final String SECOND_ATTRIBUTE = "ВторойАтрибут";
	private static final String THIRD_ATTRIBUTE = "ТретийАтрибут";
	private static final String FOURTH_ATTRIBUTE = "ЧетвертыйАтрибут";

	private static void addAlgorithm(String name, String params, EList<CmAlgorithm> algorithms) {
		CmAlgorithm algorithm = cmFactory.eINSTANCE.createCmAlgorithm();
		algorithms.add(algorithm);
		algorithm.setName(name);
		algorithm.setParams(params);
	}

	private static void addAttributeRule(String configurationTabularSection, String configurationAttribute,
			String formatTabularSection, String formatAttribute, Boolean isCustomRule,
			EList<CmAttributeRule> dataRules) {
		CmAttributeRule dataRule = cmFactory.eINSTANCE.createCmAttributeRule();
		dataRules.add(dataRule);
		dataRule.setConfigurationTabularSection(configurationTabularSection);
		dataRule.setConfigurationAttribute(configurationAttribute);
		dataRule.setFormatTabularSection(formatTabularSection);
		dataRule.setFormatAttribute(formatAttribute);
		dataRule.setIsCustomRule(isCustomRule);
	}

	private static void addDataRule(String name, String configurationObject, String formatObject,
			EList<CmDataRule> dataRules) {
		CmDataRule dataRule = cmFactory.eINSTANCE.createCmDataRule();
		dataRules.add(dataRule);
		dataRule.setName(name);
		dataRule.setConfigurationObjectName(configurationObject);
		dataRule.setFormatObject(formatObject);
	}

	private static void addObjectRule(String name, String configurationObject, String formatObject,
			EList<CmObjectRule> objectRules) {
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		objectRules.add(objectRule);
		objectRule.setName(name);
		objectRule.setConfigurationObjectName(configurationObject);
		objectRule.setFormatObject(formatObject);
	}

	private static void addPredefined(String name, String configurationObject, String formatObject,
			EList<CmPredefined> algorithms) {
		CmPredefined predefined = cmFactory.eINSTANCE.createCmPredefined();
		algorithms.add(predefined);
		predefined.setName(name);
		predefined.setConfigurationObjectName(configurationObject);
		predefined.setFormatObject(formatObject);
	}

	@Test
	public void testAlgorithmComparator() {
		String report1 = String.join(LS, "Процедура ВтораяПроцедура(1)", "Процедура ПерваяПроцедура(2)",
				"Процедура ПятаяПроцедура(3)", "Процедура ТретьяПроцедура(4)", "Процедура ЧетвертаяПроцедура(5)",
				"Процедура ШестаяПроцедура(6)");

		EList<CmAlgorithm> report2 = new BasicEList<>();
		addAlgorithm("ПерваяПроцедура", "2", report2);
		addAlgorithm("ВтораяПроцедура", "1", report2);
		addAlgorithm("ТретьяПроцедура", "4", report2);
		addAlgorithm("ЧетвертаяПроцедура", "5", report2);
		addAlgorithm("ПятаяПроцедура", "3", report2);
		addAlgorithm("ШестаяПроцедура", "6", report2);

		ECollections.sort(report2, ConversionModuleAnalyzer.getAlgorithmComparator());

		assertEquals("Модуль обмена: сортировка Алгоритмов", report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}

	@Test
	public void testAttributeRuleComparatorReceiving() {
		String report1 = String.join(LS, "md:<Пустое> xdto:ЧетвертыйАтрибут", "md:ВторойАтрибут xdto:ВторойАтрибут",
				"md:ТретийАтрибут xdto:ВторойАтрибут", "md:ЧетвертыйАтрибут xdto:<Пустое>",
				"md:ПервыйАтрибут xdto:ПервыйАтрибут <Алгоритм>", "md:ВтораяТЧ. xdto:ВтораяТЧ.ТретийАтрибут",
				"md:<Пустое> xdto:ВтораяТЧ.ЧетвертыйАтрибут", "md:ВтораяТЧ.ВторойАтрибут xdto:ВтораяТЧ.ВторойАтрибут",
				"md:ВтораяТЧ.ВторойАтрибут xdto:ВтораяТЧ.ТретийАтрибут",
				"md:ВтораяТЧ.ПервыйАтрибут xdto:ВтораяТЧ.ПервыйАтрибут <Алгоритм>",
				"md:ПерваяТЧ.ВторойАтрибут xdto:ПерваяТЧ.ВторойАтрибут", "md:ПерваяТЧ.ТретийАтрибут xdto:ПерваяТЧ.",
				"md:ПерваяТЧ.ТретийАтрибут xdto:ПерваяТЧ.ВторойАтрибут", "md:ПерваяТЧ.ЧетвертыйАтрибут xdto:<Пустое>",
				"md:ПерваяТЧ.ПервыйАтрибут xdto:ПерваяТЧ.ПервыйАтрибут <Алгоритм>");

		EList<CmAttributeRule> report2 = new BasicEList<>();
		addAttributeRule(FIRST_TABULAR, FIRST_ATTRIBUTE, FIRST_TABULAR, FIRST_ATTRIBUTE, true, report2);
		addAttributeRule(FIRST_TABULAR, SECOND_ATTRIBUTE, FIRST_TABULAR, SECOND_ATTRIBUTE, false, report2);
		addAttributeRule(FIRST_TABULAR, THIRD_ATTRIBUTE, FIRST_TABULAR, SECOND_ATTRIBUTE, false, report2);
		addAttributeRule(SECOND_TABULAR, FIRST_ATTRIBUTE, SECOND_TABULAR, FIRST_ATTRIBUTE, true, report2);
		addAttributeRule(SECOND_TABULAR, SECOND_ATTRIBUTE, SECOND_TABULAR, SECOND_ATTRIBUTE, false, report2);
		addAttributeRule(SECOND_TABULAR, SECOND_ATTRIBUTE, SECOND_TABULAR, THIRD_ATTRIBUTE, false, report2);
		addAttributeRule(FIRST_TABULAR, FOURTH_ATTRIBUTE, "", "", false, report2);
		addAttributeRule("", "", SECOND_TABULAR, FOURTH_ATTRIBUTE, false, report2);
		addAttributeRule("", FIRST_ATTRIBUTE, "", FIRST_ATTRIBUTE, true, report2);
		addAttributeRule("", SECOND_ATTRIBUTE, "", SECOND_ATTRIBUTE, false, report2);
		addAttributeRule("", THIRD_ATTRIBUTE, "", SECOND_ATTRIBUTE, false, report2);
		addAttributeRule("", FOURTH_ATTRIBUTE, "", "", false, report2);
		addAttributeRule("", "", "", FOURTH_ATTRIBUTE, false, report2);
		addAttributeRule(FIRST_TABULAR, THIRD_ATTRIBUTE, FIRST_TABULAR, "", false, report2);
		addAttributeRule(SECOND_TABULAR, "", SECOND_TABULAR, THIRD_ATTRIBUTE, false, report2);

		ECollections.sort(report2, ConversionModuleAnalyzer
				.getAttributeRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_RECEIVING));

		assertEquals("Модуль обмена: сортировка Атрибутов", report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}

	@Test
	public void testAttributeRuleComparatorSending() {
		String report1 = String.join(LS, "md:<Пустое> xdto:ЧетвертыйАтрибут", "md:ВторойАтрибут xdto:ВторойАтрибут",
				"md:ТретийАтрибут xdto:ВторойАтрибут", "md:ЧетвертыйАтрибут xdto:<Пустое>",
				"md:ПервыйАтрибут xdto:ПервыйАтрибут <Алгоритм>", "md:ПерваяТЧ.ЧетвертыйАтрибут xdto:<Пустое>",
				"md:ВтораяТЧ. xdto:ВтораяТЧ.ТретийАтрибут", "md:<Пустое> xdto:ВтораяТЧ.ЧетвертыйАтрибут",
				"md:ВтораяТЧ.ВторойАтрибут xdto:ВтораяТЧ.ВторойАтрибут",
				"md:ВтораяТЧ.ВторойАтрибут xdto:ВтораяТЧ.ТретийАтрибут",
				"md:ВтораяТЧ.ПервыйАтрибут xdto:ВтораяТЧ.ПервыйАтрибут <Алгоритм>",
				"md:ПерваяТЧ.ВторойАтрибут xdto:ПерваяТЧ.ВторойАтрибут", "md:ПерваяТЧ.ТретийАтрибут xdto:ПерваяТЧ.",
				"md:ПерваяТЧ.ТретийАтрибут xdto:ПерваяТЧ.ВторойАтрибут",
				"md:ПерваяТЧ.ПервыйАтрибут xdto:ПерваяТЧ.ПервыйАтрибут <Алгоритм>");

		EList<CmAttributeRule> report2 = new BasicEList<>();
		addAttributeRule(FIRST_TABULAR, FIRST_ATTRIBUTE, FIRST_TABULAR, FIRST_ATTRIBUTE, true, report2);
		addAttributeRule(FIRST_TABULAR, SECOND_ATTRIBUTE, FIRST_TABULAR, SECOND_ATTRIBUTE, false, report2);
		addAttributeRule(FIRST_TABULAR, THIRD_ATTRIBUTE, FIRST_TABULAR, SECOND_ATTRIBUTE, false, report2);
		addAttributeRule(SECOND_TABULAR, FIRST_ATTRIBUTE, SECOND_TABULAR, FIRST_ATTRIBUTE, true, report2);
		addAttributeRule(SECOND_TABULAR, SECOND_ATTRIBUTE, SECOND_TABULAR, SECOND_ATTRIBUTE, false, report2);
		addAttributeRule(SECOND_TABULAR, SECOND_ATTRIBUTE, SECOND_TABULAR, THIRD_ATTRIBUTE, false, report2);
		addAttributeRule(FIRST_TABULAR, FOURTH_ATTRIBUTE, "", "", false, report2);
		addAttributeRule("", "", SECOND_TABULAR, FOURTH_ATTRIBUTE, false, report2);
		addAttributeRule("", FIRST_ATTRIBUTE, "", FIRST_ATTRIBUTE, true, report2);
		addAttributeRule("", SECOND_ATTRIBUTE, "", SECOND_ATTRIBUTE, false, report2);
		addAttributeRule("", THIRD_ATTRIBUTE, "", SECOND_ATTRIBUTE, false, report2);
		addAttributeRule("", FOURTH_ATTRIBUTE, "", "", false, report2);
		addAttributeRule("", "", "", FOURTH_ATTRIBUTE, false, report2);
		addAttributeRule(FIRST_TABULAR, THIRD_ATTRIBUTE, FIRST_TABULAR, "", false, report2);
		addAttributeRule(SECOND_TABULAR, "", SECOND_TABULAR, THIRD_ATTRIBUTE, false, report2);

		ECollections.sort(report2, ConversionModuleAnalyzer
				.getAttributeRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_SENDING));

		assertEquals("Модуль обмена: сортировка Атрибутов", report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}

	@Test
	public void testAttributeRuleComparatorSendingAndReceiving() {
		String report1 = String.join(LS, "md:ВтораяТЧ.ВторойАтрибут xdto:ВтораяТЧ.ВторойАтрибут",
				"md:ВтораяТЧ.ВторойАтрибут xdto:ВтораяТЧ.ТретийАтрибут",
				"md:ВтораяТЧ.ПервыйАтрибут xdto:ВтораяТЧ.ПервыйАтрибут <Алгоритм>",
				"md:ПерваяТЧ.ВторойАтрибут xdto:ПерваяТЧ.ВторойАтрибут",
				"md:ПерваяТЧ.ТретийАтрибут xdto:ПерваяТЧ.ВторойАтрибут",
				"md:ПерваяТЧ.ПервыйАтрибут xdto:ПерваяТЧ.ПервыйАтрибут <Алгоритм>", "md:<Пустое> xdto:ЧетвертыйАтрибут",
				"md:ВторойАтрибут xdto:ВторойАтрибут", "md:ТретийАтрибут xdto:ВторойАтрибут",
				"md:ЧетвертыйАтрибут xdto:<Пустое>", "md:ПервыйАтрибут xdto:ПервыйАтрибут <Алгоритм>",
				"md:ВтораяТЧ. xdto:ВтораяТЧ.ТретийАтрибут", "md:<Пустое> xdto:ВтораяТЧ.ЧетвертыйАтрибут",
				"md:ПерваяТЧ.ТретийАтрибут xdto:ПерваяТЧ.", "md:ПерваяТЧ.ЧетвертыйАтрибут xdto:<Пустое>");

		EList<CmAttributeRule> report2 = new BasicEList<>();
		addAttributeRule(FIRST_TABULAR, FIRST_ATTRIBUTE, FIRST_TABULAR, FIRST_ATTRIBUTE, true, report2);
		addAttributeRule(FIRST_TABULAR, SECOND_ATTRIBUTE, FIRST_TABULAR, SECOND_ATTRIBUTE, false, report2);
		addAttributeRule(FIRST_TABULAR, THIRD_ATTRIBUTE, FIRST_TABULAR, SECOND_ATTRIBUTE, false, report2);
		addAttributeRule(SECOND_TABULAR, FIRST_ATTRIBUTE, SECOND_TABULAR, FIRST_ATTRIBUTE, true, report2);
		addAttributeRule(SECOND_TABULAR, SECOND_ATTRIBUTE, SECOND_TABULAR, SECOND_ATTRIBUTE, false, report2);
		addAttributeRule(SECOND_TABULAR, SECOND_ATTRIBUTE, SECOND_TABULAR, THIRD_ATTRIBUTE, false, report2);
		addAttributeRule(FIRST_TABULAR, FOURTH_ATTRIBUTE, "", "", false, report2);
		addAttributeRule("", "", SECOND_TABULAR, FOURTH_ATTRIBUTE, false, report2);
		addAttributeRule("", FIRST_ATTRIBUTE, "", FIRST_ATTRIBUTE, true, report2);
		addAttributeRule("", SECOND_ATTRIBUTE, "", SECOND_ATTRIBUTE, false, report2);
		addAttributeRule("", THIRD_ATTRIBUTE, "", SECOND_ATTRIBUTE, false, report2);
		addAttributeRule("", FOURTH_ATTRIBUTE, "", "", false, report2);
		addAttributeRule("", "", "", FOURTH_ATTRIBUTE, false, report2);
		addAttributeRule(FIRST_TABULAR, THIRD_ATTRIBUTE, FIRST_TABULAR, "", false, report2);
		addAttributeRule(SECOND_TABULAR, "", SECOND_TABULAR, THIRD_ATTRIBUTE, false, report2);

		ECollections.sort(report2, ConversionModuleAnalyzer
				.getAttributeRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_SENDING_RECEIVING));

		assertEquals("Модуль обмена: сортировка Атрибутов", report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}

	@Test
	public void testDataRuleComparatorByMd() {
		String report1 = String.join(LS, FIRST_RULE_XDTO,
				"name:ВтороеПравило md:<Пустое> xdto:Документ.Документ5 <НаправлениеНеЗадано>",
				"name:ТретьеПравило md:Метаданные.Документы.Документ1 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ЧетвертоеПравило md:Метаданные.Документы.Документ1 xdto:Документ.Документ4 <НаправлениеНеЗадано>",
				"name:ПятоеПравило md:Метаданные.Документы.Документ2 xdto:Документ.Документ6 <НаправлениеНеЗадано>",
				"name:ШестоеПравило md:Метаданные.Документы.Документ3 xdto:Документ.Документ2 <НаправлениеНеЗадано>");

		EList<CmDataRule> report2 = new BasicEList<>();
		addDataRule(FIFTH_RULE, MD_DOCUMENT.concat("2"), XDTO_DOCUMENT.concat("6"), report2);
		addDataRule(SIXTH_RULE, MD_DOCUMENT.concat("3"), XDTO_DOCUMENT.concat("2"), report2);
		addDataRule(FOURTH_RULE, MD_DOCUMENT.concat("1"), XDTO_DOCUMENT.concat("4"), report2);
		addDataRule(THIRD_RULE, MD_DOCUMENT.concat("1"), "", report2);
		addDataRule(SECOND_RULE, "", XDTO_DOCUMENT.concat("5"), report2);
		addDataRule(FIRST_RULE, "", "", report2);

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getDataRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_SENDING));

		assertEquals("Модуль обмена: сортировка ПОД по метаданным", report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}

	@Test
	public void testDataRuleComparatorByName() {
		String report1 = String.join(LS, SECOND_RULE_MD, FIRST_RULE_MD, FIFTH_RULE_MD, THIRD_RULE_MD, FOURTH_RULE_MD,
				SIXTH_RULE_MD);

		EList<CmDataRule> report2 = new BasicEList<>();
		addDataRule(FIRST_RULE, MD_DOCUMENT.concat("2"), "", report2);
		addDataRule(SECOND_RULE, MD_DOCUMENT.concat("1"), "", report2);
		addDataRule(THIRD_RULE, MD_DOCUMENT.concat("4"), "", report2);
		addDataRule(FOURTH_RULE, MD_DOCUMENT.concat("5"), "", report2);
		addDataRule(FIFTH_RULE, MD_DOCUMENT.concat("3"), "", report2);
		addDataRule(SIXTH_RULE, MD_DOCUMENT.concat("6"), "", report2);

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getDataRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_NAME));

		assertEquals("Модуль обмена: сортировка ПОД по имени", report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}

	@Test
	public void testDataRuleComparatorByXdto() {
		String report1 = String.join(LS, FIRST_RULE_XDTO,
				"name:ВтороеПравило md:Метаданные.Документы.Документ5 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ТретьеПравило md:<Пустое> xdto:Документ.Документ1 <НаправлениеНеЗадано>",
				"name:ЧетвертоеПравило md:Метаданные.Документы.Документ4 xdto:Документ.Документ1 <НаправлениеНеЗадано>",
				"name:ПятоеПравило md:Метаданные.Документы.Документ6 xdto:Документ.Документ2 <НаправлениеНеЗадано>",
				"name:ШестоеПравило md:Метаданные.Документы.Документ2 xdto:Документ.Документ3 <НаправлениеНеЗадано>");

		EList<CmDataRule> report2 = new BasicEList<>();
		addDataRule(FIFTH_RULE, MD_DOCUMENT.concat("6"), XDTO_DOCUMENT.concat("2"), report2);
		addDataRule(SIXTH_RULE, MD_DOCUMENT.concat("2"), XDTO_DOCUMENT.concat("3"), report2);
		addDataRule(FOURTH_RULE, MD_DOCUMENT.concat("4"), XDTO_DOCUMENT.concat("1"), report2);
		addDataRule(THIRD_RULE, "", XDTO_DOCUMENT.concat("1"), report2);
		addDataRule(SECOND_RULE, MD_DOCUMENT.concat("5"), "", report2);
		addDataRule(FIRST_RULE, "", "", report2);

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getDataRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_RECEIVING));

		assertEquals("Модуль обмена: сортировка ПОД по формату", report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}

	@Test
	public void testObjectRuleComparatorByMd() {
		String report1 = String.join(LS, FIRST_RULE_XDTO,
				"name:ВтороеПравило md:<Пустое> xdto:Документ.Документ5 <НаправлениеНеЗадано>",
				"name:ТретьеПравило md:Метаданные.Документы.Документ1 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ЧетвертоеПравило md:Метаданные.Документы.Документ1 xdto:Документ.Документ4 <НаправлениеНеЗадано>",
				"name:ПятоеПравило md:Метаданные.Документы.Документ2 xdto:Документ.Документ6 <НаправлениеНеЗадано>",
				"name:ШестоеПравило md:Метаданные.Документы.Документ3 xdto:Документ.Документ2 <НаправлениеНеЗадано>");

		EList<CmObjectRule> report2 = new BasicEList<>();
		addObjectRule(FIFTH_RULE, MD_DOCUMENT.concat("2"), XDTO_DOCUMENT.concat("6"), report2);
		addObjectRule(SIXTH_RULE, MD_DOCUMENT.concat("3"), XDTO_DOCUMENT.concat("2"), report2);
		addObjectRule(FOURTH_RULE, MD_DOCUMENT.concat("1"), XDTO_DOCUMENT.concat("4"), report2);
		addObjectRule(THIRD_RULE, MD_DOCUMENT.concat("1"), "", report2);
		addObjectRule(SECOND_RULE, "", XDTO_DOCUMENT.concat("5"), report2);
		addObjectRule(FIRST_RULE, "", "", report2);

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getObjectRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_SENDING));

		assertEquals("Модуль обмена: сортировка ПКО по объекту конфигурации (метаданным)", report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}

	@Test
	public void testObjectRuleComparatorByName() {
		String report1 = String.join(LS, SECOND_RULE_MD, FIRST_RULE_MD, FIFTH_RULE_MD, THIRD_RULE_MD, FOURTH_RULE_MD,
				SIXTH_RULE_MD);

		EList<CmObjectRule> report2 = new BasicEList<>();
		addObjectRule(FIRST_RULE, MD_DOCUMENT.concat("2"), "", report2);
		addObjectRule(SECOND_RULE, MD_DOCUMENT.concat("1"), "", report2);
		addObjectRule(THIRD_RULE, MD_DOCUMENT.concat("4"), "", report2);
		addObjectRule(FOURTH_RULE, MD_DOCUMENT.concat("5"), "", report2);
		addObjectRule(FIFTH_RULE, MD_DOCUMENT.concat("3"), "", report2);
		addObjectRule(SIXTH_RULE, MD_DOCUMENT.concat("6"), "", report2);

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getObjectRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_NAME));

		assertEquals("Модуль обмена: сортировка ПКО", report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}

	@Test
	public void testObjectRuleComparatorByXdto() {
		String report1 = String.join(LS, FIRST_RULE_XDTO,
				"name:ВтороеПравило md:Метаданные.Документы.Документ5 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ТретьеПравило md:<Пустое> xdto:Документ.Документ1 <НаправлениеНеЗадано>",
				"name:ЧетвертоеПравило md:Метаданные.Документы.Документ4 xdto:Документ.Документ1 <НаправлениеНеЗадано>",
				"name:ПятоеПравило md:Метаданные.Документы.Документ6 xdto:Документ.Документ2 <НаправлениеНеЗадано>",
				"name:ШестоеПравило md:Метаданные.Документы.Документ2 xdto:Документ.Документ3 <НаправлениеНеЗадано>");

		EList<CmObjectRule> report2 = new BasicEList<>();
		addObjectRule(FIFTH_RULE, MD_DOCUMENT.concat("6"), XDTO_DOCUMENT.concat("2"), report2);
		addObjectRule(SIXTH_RULE, MD_DOCUMENT.concat("2"), XDTO_DOCUMENT.concat("3"), report2);
		addObjectRule(FOURTH_RULE, MD_DOCUMENT.concat("4"), XDTO_DOCUMENT.concat("1"), report2);
		addObjectRule(THIRD_RULE, "", XDTO_DOCUMENT.concat("1"), report2);
		addObjectRule(SECOND_RULE, MD_DOCUMENT.concat("5"), "", report2);
		addObjectRule(FIRST_RULE, "", "", report2);

		ECollections.sort(report2, ConversionModuleAnalyzer
				.getObjectRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_RECEIVING));

		assertEquals("Модуль обмена: сортировка ПКО", report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}

	@Test
	public void testPredefinedComparator() {
		String report1 = String.join(LS, SECOND_RULE_MD, FIRST_RULE_MD, FIFTH_RULE_MD, THIRD_RULE_MD, FOURTH_RULE_MD,
				SIXTH_RULE_MD);

		EList<CmPredefined> report2 = new BasicEList<>();
		addPredefined(FIRST_RULE, MD_DOCUMENT.concat("2"), "", report2);
		addPredefined(SECOND_RULE, MD_DOCUMENT.concat("1"), "", report2);
		addPredefined(THIRD_RULE, MD_DOCUMENT.concat("4"), "", report2);
		addPredefined(FOURTH_RULE, MD_DOCUMENT.concat("5"), "", report2);
		addPredefined(FIFTH_RULE, MD_DOCUMENT.concat("3"), "", report2);
		addPredefined(SIXTH_RULE, MD_DOCUMENT.concat("6"), "", report2);

		ECollections.sort(report2, ConversionModuleAnalyzer.getPredefinedComparator());

		assertEquals("Модуль обмена: сортировка ПКПД", report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}
}
