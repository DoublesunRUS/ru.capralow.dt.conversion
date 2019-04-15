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

public class ConversionModuleAnalyzerComparatorTest {
	private static final String LS = System.lineSeparator();

	private static final String RULE = "name:%1$s md:%2$s xdto:%3$s %4$s";

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

	private static final String EMPTY = "<Пустое>";

	private static final String NO_ROUTE = "<НаправлениеНеЗадано>";
	private static final String SENDING_ROUTE = "Отправка";
	private static final String RECEIVING_ROUTE = "Получение";

	@Test
	public void testAlgorithmComparator() {
		String report1 = String.join(LS,
				"Процедура ВтораяПроцедура(1)",
				"Процедура ПерваяПроцедура(2)",
				"Процедура ПятаяПроцедура(3)",
				"Процедура ТретьяПроцедура(4)",
				"Процедура ЧетвертаяПроцедура(5)",
				"Процедура ШестаяПроцедура(6)");

		EList<CmAlgorithm> report2 = new BasicEList<>();
		ConversionModuleAnalyzerUtils.addAlgorithm("ПерваяПроцедура", "2", "", report2);
		ConversionModuleAnalyzerUtils.addAlgorithm("ВтораяПроцедура", "1", "", report2);
		ConversionModuleAnalyzerUtils.addAlgorithm("ТретьяПроцедура", "4", "", report2);
		ConversionModuleAnalyzerUtils.addAlgorithm("ЧетвертаяПроцедура", "5", "", report2);
		ConversionModuleAnalyzerUtils.addAlgorithm("ПятаяПроцедура", "3", "", report2);
		ConversionModuleAnalyzerUtils.addAlgorithm("ШестаяПроцедура", "6", "", report2);

		ECollections.sort(report2, ConversionModuleAnalyzer.getAlgorithmComparator());

		assertEquals("Модуль обмена: сортировка Алгоритмов",
				report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}

	@Test
	public void testAttributeRuleComparatorReceiving() {
		String report1 = String.join(LS,
				"md:<Пустое> xdto:ЧетвертыйАтрибут",
				"md:ВторойАтрибут xdto:ВторойАтрибут",
				"md:ТретийАтрибут xdto:ВторойАтрибут",
				"md:ЧетвертыйАтрибут xdto:<Пустое>",
				"md:ПервыйАтрибут xdto:ПервыйАтрибут <Алгоритм>",
				"md:ВтораяТЧ. xdto:ВтораяТЧ.ТретийАтрибут",
				"md:<Пустое> xdto:ВтораяТЧ.ЧетвертыйАтрибут",
				"md:ВтораяТЧ.ВторойАтрибут xdto:ВтораяТЧ.ВторойАтрибут",
				"md:ВтораяТЧ.ВторойАтрибут xdto:ВтораяТЧ.ТретийАтрибут",
				"md:ВтораяТЧ.ПервыйАтрибут xdto:ВтораяТЧ.ПервыйАтрибут <Алгоритм>",
				"md:ПерваяТЧ.ВторойАтрибут xdto:ПерваяТЧ.ВторойАтрибут",
				"md:ПерваяТЧ.ТретийАтрибут xdto:ПерваяТЧ.",
				"md:ПерваяТЧ.ТретийАтрибут xdto:ПерваяТЧ.ВторойАтрибут",
				"md:ПерваяТЧ.ЧетвертыйАтрибут xdto:<Пустое>",
				"md:ПерваяТЧ.ПервыйАтрибут xdto:ПерваяТЧ.ПервыйАтрибут <Алгоритм>");

		EList<CmAttributeRule> report2 = new BasicEList<>();
		ConversionModuleAnalyzerUtils.addAttributeRule(String.join(".", FIRST_TABULAR, FIRST_ATTRIBUTE),
				String.join(".", FIRST_TABULAR, FIRST_ATTRIBUTE),
				true,
				"",
				report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String.join(".", FIRST_TABULAR, SECOND_ATTRIBUTE),
				String.join(".", FIRST_TABULAR, SECOND_ATTRIBUTE),
				false,
				"",
				report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String.join(".", FIRST_TABULAR, THIRD_ATTRIBUTE),
				String.join(".", FIRST_TABULAR, SECOND_ATTRIBUTE),
				false,
				"",
				report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String.join(".", SECOND_TABULAR, FIRST_ATTRIBUTE),
				String.join(".", SECOND_TABULAR, FIRST_ATTRIBUTE),
				true,
				"",
				report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String.join(".", SECOND_TABULAR, SECOND_ATTRIBUTE),
				String.join(".", SECOND_TABULAR, SECOND_ATTRIBUTE),
				false,
				"",
				report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String.join(".", SECOND_TABULAR, SECOND_ATTRIBUTE),
				String.join(".", SECOND_TABULAR, THIRD_ATTRIBUTE),
				false,
				"",
				report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String
				.join(".", FIRST_TABULAR, FOURTH_ATTRIBUTE), String.join(".", "", ""), false, "", report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String
				.join(".", "", ""), String.join(".", SECOND_TABULAR, FOURTH_ATTRIBUTE), false, "", report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String
				.join(".", "", FIRST_ATTRIBUTE), String.join(".", "", FIRST_ATTRIBUTE), true, "", report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String
				.join(".", "", SECOND_ATTRIBUTE), String.join(".", "", SECOND_ATTRIBUTE), false, "", report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String
				.join(".", "", THIRD_ATTRIBUTE), String.join(".", "", SECOND_ATTRIBUTE), false, "", report2);
		ConversionModuleAnalyzerUtils
				.addAttributeRule(String.join(".", "", FOURTH_ATTRIBUTE), String.join(".", "", ""), false, "", report2);
		ConversionModuleAnalyzerUtils
				.addAttributeRule(String.join(".", "", ""), String.join(".", "", FOURTH_ATTRIBUTE), false, "", report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String
				.join(".", FIRST_TABULAR, THIRD_ATTRIBUTE), String.join(".", FIRST_TABULAR, ""), false, "", report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String
				.join(".", SECOND_TABULAR, ""), String.join(".", SECOND_TABULAR, THIRD_ATTRIBUTE), false, "", report2);

		ECollections.sort(report2,
				ConversionModuleAnalyzer
						.getAttributeRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_RECEIVING));

		assertEquals("Модуль обмена: сортировка Атрибутов",
				report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}

	@Test
	public void testAttributeRuleComparatorSending() {
		String report1 = String.join(LS,
				"md:<Пустое> xdto:ЧетвертыйАтрибут",
				"md:ВторойАтрибут xdto:ВторойАтрибут",
				"md:ТретийАтрибут xdto:ВторойАтрибут",
				"md:ЧетвертыйАтрибут xdto:<Пустое>",
				"md:ПервыйАтрибут xdto:ПервыйАтрибут <Алгоритм>",
				"md:ПерваяТЧ.ЧетвертыйАтрибут xdto:<Пустое>",
				"md:ВтораяТЧ. xdto:ВтораяТЧ.ТретийАтрибут",
				"md:<Пустое> xdto:ВтораяТЧ.ЧетвертыйАтрибут",
				"md:ВтораяТЧ.ВторойАтрибут xdto:ВтораяТЧ.ВторойАтрибут",
				"md:ВтораяТЧ.ВторойАтрибут xdto:ВтораяТЧ.ТретийАтрибут",
				"md:ВтораяТЧ.ПервыйАтрибут xdto:ВтораяТЧ.ПервыйАтрибут <Алгоритм>",
				"md:ПерваяТЧ.ВторойАтрибут xdto:ПерваяТЧ.ВторойАтрибут",
				"md:ПерваяТЧ.ТретийАтрибут xdto:ПерваяТЧ.",
				"md:ПерваяТЧ.ТретийАтрибут xdto:ПерваяТЧ.ВторойАтрибут",
				"md:ПерваяТЧ.ПервыйАтрибут xdto:ПерваяТЧ.ПервыйАтрибут <Алгоритм>");

		EList<CmAttributeRule> report2 = new BasicEList<>();
		ConversionModuleAnalyzerUtils.addAttributeRule(String.join(".", FIRST_TABULAR, FIRST_ATTRIBUTE),
				String.join(".", FIRST_TABULAR, FIRST_ATTRIBUTE),
				true,
				"",
				report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String.join(".", FIRST_TABULAR, SECOND_ATTRIBUTE),
				String.join(".", FIRST_TABULAR, SECOND_ATTRIBUTE),
				false,
				"",
				report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String.join(".", FIRST_TABULAR, THIRD_ATTRIBUTE),
				String.join(".", FIRST_TABULAR, SECOND_ATTRIBUTE),
				false,
				"",
				report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String.join(".", SECOND_TABULAR, FIRST_ATTRIBUTE),
				String.join(".", SECOND_TABULAR, FIRST_ATTRIBUTE),
				true,
				"",
				report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String.join(".", SECOND_TABULAR, SECOND_ATTRIBUTE),
				String.join(".", SECOND_TABULAR, SECOND_ATTRIBUTE),
				false,
				"",
				report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String.join(".", SECOND_TABULAR, SECOND_ATTRIBUTE),
				String.join(".", SECOND_TABULAR, THIRD_ATTRIBUTE),
				false,
				"",
				report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String
				.join(".", FIRST_TABULAR, FOURTH_ATTRIBUTE), String.join(".", "", ""), false, "", report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String
				.join(".", "", ""), String.join(".", SECOND_TABULAR, FOURTH_ATTRIBUTE), false, "", report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String
				.join(".", "", FIRST_ATTRIBUTE), String.join(".", "", FIRST_ATTRIBUTE), true, "", report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String
				.join(".", "", SECOND_ATTRIBUTE), String.join(".", "", SECOND_ATTRIBUTE), false, "", report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String
				.join(".", "", THIRD_ATTRIBUTE), String.join(".", "", SECOND_ATTRIBUTE), false, "", report2);
		ConversionModuleAnalyzerUtils
				.addAttributeRule(String.join(".", "", FOURTH_ATTRIBUTE), String.join(".", "", ""), false, "", report2);
		ConversionModuleAnalyzerUtils
				.addAttributeRule(String.join(".", "", ""), String.join(".", "", FOURTH_ATTRIBUTE), false, "", report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String
				.join(".", FIRST_TABULAR, THIRD_ATTRIBUTE), String.join(".", FIRST_TABULAR, ""), false, "", report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String
				.join(".", SECOND_TABULAR, ""), String.join(".", SECOND_TABULAR, THIRD_ATTRIBUTE), false, "", report2);

		ECollections.sort(report2,
				ConversionModuleAnalyzer
						.getAttributeRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_SENDING));

		assertEquals("Модуль обмена: сортировка Атрибутов",
				report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}

	@Test
	public void testAttributeRuleComparatorSendingAndReceiving() {
		String report1 = String.join(LS,
				"md:ВтораяТЧ.ВторойАтрибут xdto:ВтораяТЧ.ВторойАтрибут",
				"md:ВтораяТЧ.ВторойАтрибут xdto:ВтораяТЧ.ТретийАтрибут",
				"md:ВтораяТЧ.ПервыйАтрибут xdto:ВтораяТЧ.ПервыйАтрибут <Алгоритм>",
				"md:ПерваяТЧ.ВторойАтрибут xdto:ПерваяТЧ.ВторойАтрибут",
				"md:ПерваяТЧ.ТретийАтрибут xdto:ПерваяТЧ.ВторойАтрибут",
				"md:ПерваяТЧ.ПервыйАтрибут xdto:ПерваяТЧ.ПервыйАтрибут <Алгоритм>",
				"md:<Пустое> xdto:ЧетвертыйАтрибут",
				"md:ВторойАтрибут xdto:ВторойАтрибут",
				"md:ТретийАтрибут xdto:ВторойАтрибут",
				"md:ЧетвертыйАтрибут xdto:<Пустое>",
				"md:ПервыйАтрибут xdto:ПервыйАтрибут <Алгоритм>",
				"md:ВтораяТЧ. xdto:ВтораяТЧ.ТретийАтрибут",
				"md:<Пустое> xdto:ВтораяТЧ.ЧетвертыйАтрибут",
				"md:ПерваяТЧ.ТретийАтрибут xdto:ПерваяТЧ.",
				"md:ПерваяТЧ.ЧетвертыйАтрибут xdto:<Пустое>");

		EList<CmAttributeRule> report2 = new BasicEList<>();
		ConversionModuleAnalyzerUtils.addAttributeRule(String.join(".", FIRST_TABULAR, FIRST_ATTRIBUTE),
				String.join(".", FIRST_TABULAR, FIRST_ATTRIBUTE),
				true,
				"",
				report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String.join(".", FIRST_TABULAR, SECOND_ATTRIBUTE),
				String.join(".", FIRST_TABULAR, SECOND_ATTRIBUTE),
				false,
				"",
				report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String.join(".", FIRST_TABULAR, THIRD_ATTRIBUTE),
				String.join(".", FIRST_TABULAR, SECOND_ATTRIBUTE),
				false,
				"",
				report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String.join(".", SECOND_TABULAR, FIRST_ATTRIBUTE),
				String.join(".", SECOND_TABULAR, FIRST_ATTRIBUTE),
				true,
				"",
				report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String.join(".", SECOND_TABULAR, SECOND_ATTRIBUTE),
				String.join(".", SECOND_TABULAR, SECOND_ATTRIBUTE),
				false,
				"",
				report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String.join(".", SECOND_TABULAR, SECOND_ATTRIBUTE),
				String.join(".", SECOND_TABULAR, THIRD_ATTRIBUTE),
				false,
				"",
				report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String
				.join(".", FIRST_TABULAR, FOURTH_ATTRIBUTE), String.join(".", "", ""), false, "", report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String
				.join(".", "", ""), String.join(".", SECOND_TABULAR, FOURTH_ATTRIBUTE), false, "", report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String
				.join(".", "", FIRST_ATTRIBUTE), String.join(".", "", FIRST_ATTRIBUTE), true, "", report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String
				.join(".", "", SECOND_ATTRIBUTE), String.join(".", "", SECOND_ATTRIBUTE), false, "", report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String
				.join(".", "", THIRD_ATTRIBUTE), String.join(".", "", SECOND_ATTRIBUTE), false, "", report2);
		ConversionModuleAnalyzerUtils
				.addAttributeRule(String.join(".", "", FOURTH_ATTRIBUTE), String.join(".", "", ""), false, "", report2);
		ConversionModuleAnalyzerUtils
				.addAttributeRule(String.join(".", "", ""), String.join(".", "", FOURTH_ATTRIBUTE), false, "", report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String
				.join(".", FIRST_TABULAR, THIRD_ATTRIBUTE), String.join(".", FIRST_TABULAR, ""), false, "", report2);
		ConversionModuleAnalyzerUtils.addAttributeRule(String
				.join(".", SECOND_TABULAR, ""), String.join(".", SECOND_TABULAR, THIRD_ATTRIBUTE), false, "", report2);

		ECollections.sort(report2,
				ConversionModuleAnalyzer
						.getAttributeRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_SENDING_RECEIVING));

		assertEquals("Модуль обмена: сортировка Атрибутов",
				report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}

	@Test
	public void testDataRuleComparatorByMd() {
		String report1 = String.join(LS,
				String.format(RULE, FIRST_RULE, EMPTY, EMPTY, SENDING_ROUTE),
				String.format(RULE, SECOND_RULE, EMPTY, XDTO_DOCUMENT.concat("5"), SENDING_ROUTE),
				String.format(RULE, THIRD_RULE, MD_DOCUMENT.concat("1"), EMPTY, SENDING_ROUTE),
				String.format(RULE, FOURTH_RULE, MD_DOCUMENT.concat("1"), XDTO_DOCUMENT.concat("4"), SENDING_ROUTE),
				String.format(RULE, FIFTH_RULE, MD_DOCUMENT.concat("2"), XDTO_DOCUMENT.concat("6"), SENDING_ROUTE),
				String.format(RULE, SIXTH_RULE, MD_DOCUMENT.concat("3"), XDTO_DOCUMENT.concat("2"), SENDING_ROUTE));

		EList<CmDataRule> report2 = new BasicEList<>();
		ConversionModuleAnalyzerUtils.addDataRule(FIFTH_RULE,
				MD_DOCUMENT.concat("2"),
				XDTO_DOCUMENT.concat("6"),
				true,
				false,
				false,
				report2);
		ConversionModuleAnalyzerUtils.addDataRule(SIXTH_RULE,
				MD_DOCUMENT.concat("3"),
				XDTO_DOCUMENT.concat("2"),
				true,
				false,
				false,
				report2);
		ConversionModuleAnalyzerUtils.addDataRule(FOURTH_RULE,
				MD_DOCUMENT.concat("1"),
				XDTO_DOCUMENT.concat("4"),
				true,
				false,
				false,
				report2);
		ConversionModuleAnalyzerUtils.addDataRule(THIRD_RULE, MD_DOCUMENT.concat("1"), "", true, false, false, report2);
		ConversionModuleAnalyzerUtils
				.addDataRule(SECOND_RULE, "", XDTO_DOCUMENT.concat("5"), true, false, false, report2);
		ConversionModuleAnalyzerUtils.addDataRule(FIRST_RULE, "", "", true, false, false, report2);

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getDataRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_SENDING));

		assertEquals("Модуль обмена: сортировка ПОД по метаданным",
				report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}

	@Test
	public void testDataRuleComparatorByName() {
		String report1 = String.join(LS,
				String.format(RULE, SECOND_RULE, MD_DOCUMENT.concat("1"), EMPTY, NO_ROUTE),
				String.format(RULE, FIRST_RULE, MD_DOCUMENT.concat("2"), EMPTY, NO_ROUTE),
				String.format(RULE, FIFTH_RULE, MD_DOCUMENT.concat("3"), EMPTY, NO_ROUTE),
				String.format(RULE, THIRD_RULE, MD_DOCUMENT.concat("4"), EMPTY, NO_ROUTE),
				String.format(RULE, FOURTH_RULE, MD_DOCUMENT.concat("5"), EMPTY, NO_ROUTE),
				String.format(RULE, SIXTH_RULE, MD_DOCUMENT.concat("6"), EMPTY, NO_ROUTE));

		EList<CmDataRule> report2 = new BasicEList<>();
		ConversionModuleAnalyzerUtils
				.addDataRule(FIRST_RULE, MD_DOCUMENT.concat("2"), "", false, false, false, report2);
		ConversionModuleAnalyzerUtils
				.addDataRule(SECOND_RULE, MD_DOCUMENT.concat("1"), "", false, false, false, report2);
		ConversionModuleAnalyzerUtils
				.addDataRule(THIRD_RULE, MD_DOCUMENT.concat("4"), "", false, false, false, report2);
		ConversionModuleAnalyzerUtils
				.addDataRule(FOURTH_RULE, MD_DOCUMENT.concat("5"), "", false, false, false, report2);
		ConversionModuleAnalyzerUtils
				.addDataRule(FIFTH_RULE, MD_DOCUMENT.concat("3"), "", false, false, false, report2);
		ConversionModuleAnalyzerUtils
				.addDataRule(SIXTH_RULE, MD_DOCUMENT.concat("6"), "", false, false, false, report2);

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getDataRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_NAME));

		assertEquals("Модуль обмена: сортировка ПОД по имени",
				report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}

	@Test
	public void testDataRuleComparatorByXdto() {
		String report1 = String.join(LS,
				String.format(RULE, FIRST_RULE, EMPTY, EMPTY, RECEIVING_ROUTE),
				String.format(RULE, SECOND_RULE, MD_DOCUMENT.concat("5"), EMPTY, RECEIVING_ROUTE),
				String.format(RULE, THIRD_RULE, EMPTY, XDTO_DOCUMENT.concat("1"), RECEIVING_ROUTE),
				String.format(RULE, FOURTH_RULE, MD_DOCUMENT.concat("4"), XDTO_DOCUMENT.concat("1"), RECEIVING_ROUTE),
				String.format(RULE, FIFTH_RULE, MD_DOCUMENT.concat("6"), XDTO_DOCUMENT.concat("2"), RECEIVING_ROUTE),
				String.format(RULE, SIXTH_RULE, MD_DOCUMENT.concat("2"), XDTO_DOCUMENT.concat("3"), RECEIVING_ROUTE));

		EList<CmDataRule> report2 = new BasicEList<>();
		ConversionModuleAnalyzerUtils.addDataRule(FIFTH_RULE,
				MD_DOCUMENT.concat("6"),
				XDTO_DOCUMENT.concat("2"),
				false,
				true,
				false,
				report2);
		ConversionModuleAnalyzerUtils.addDataRule(SIXTH_RULE,
				MD_DOCUMENT.concat("2"),
				XDTO_DOCUMENT.concat("3"),
				false,
				true,
				false,
				report2);
		ConversionModuleAnalyzerUtils.addDataRule(FOURTH_RULE,
				MD_DOCUMENT.concat("4"),
				XDTO_DOCUMENT.concat("1"),
				false,
				true,
				false,
				report2);
		ConversionModuleAnalyzerUtils
				.addDataRule(THIRD_RULE, "", XDTO_DOCUMENT.concat("1"), false, true, false, report2);
		ConversionModuleAnalyzerUtils
				.addDataRule(SECOND_RULE, MD_DOCUMENT.concat("5"), "", false, true, false, report2);
		ConversionModuleAnalyzerUtils.addDataRule(FIRST_RULE, "", "", false, true, false, report2);

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getDataRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_RECEIVING));

		assertEquals("Модуль обмена: сортировка ПОД по формату",
				report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}

	@Test
	public void testObjectRuleComparatorByMd() {
		String report1 = String.join(LS,
				String.format(RULE, FIRST_RULE, EMPTY, EMPTY, NO_ROUTE),
				String.format(RULE, SECOND_RULE, EMPTY, XDTO_DOCUMENT.concat("5"), NO_ROUTE),
				String.format(RULE, THIRD_RULE, MD_DOCUMENT.concat("1"), EMPTY, NO_ROUTE),
				String.format(RULE, FOURTH_RULE, MD_DOCUMENT.concat("1"), XDTO_DOCUMENT.concat("4"), NO_ROUTE),
				String.format(RULE, FIFTH_RULE, MD_DOCUMENT.concat("2"), XDTO_DOCUMENT.concat("6"), NO_ROUTE),
				String.format(RULE, SIXTH_RULE, MD_DOCUMENT.concat("3"), XDTO_DOCUMENT.concat("2"), NO_ROUTE));

		EList<CmObjectRule> report2 = new BasicEList<>();
		ConversionModuleAnalyzerUtils.addObjectRule(FIFTH_RULE,
				MD_DOCUMENT.concat("2"),
				XDTO_DOCUMENT.concat("6"),
				false,
				false,
				false,
				report2);
		ConversionModuleAnalyzerUtils.addObjectRule(SIXTH_RULE,
				MD_DOCUMENT.concat("3"),
				XDTO_DOCUMENT.concat("2"),
				false,
				false,
				false,
				report2);
		ConversionModuleAnalyzerUtils.addObjectRule(FOURTH_RULE,
				MD_DOCUMENT.concat("1"),
				XDTO_DOCUMENT.concat("4"),
				false,
				false,
				false,
				report2);
		ConversionModuleAnalyzerUtils
				.addObjectRule(THIRD_RULE, MD_DOCUMENT.concat("1"), "", false, false, false, report2);
		ConversionModuleAnalyzerUtils
				.addObjectRule(SECOND_RULE, "", XDTO_DOCUMENT.concat("5"), false, false, false, report2);
		ConversionModuleAnalyzerUtils.addObjectRule(FIRST_RULE, "", "", false, false, false, report2);

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getObjectRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_SENDING));

		assertEquals("Модуль обмена: сортировка ПКО по объекту конфигурации (метаданным)",
				report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}

	@Test
	public void testObjectRuleComparatorByName() {
		String report1 = String.join(LS,
				String.format(RULE, SECOND_RULE, MD_DOCUMENT.concat("1"), EMPTY, NO_ROUTE),
				String.format(RULE, FIRST_RULE, MD_DOCUMENT.concat("2"), EMPTY, NO_ROUTE),
				String.format(RULE, FIFTH_RULE, MD_DOCUMENT.concat("3"), EMPTY, NO_ROUTE),
				String.format(RULE, THIRD_RULE, MD_DOCUMENT.concat("4"), EMPTY, NO_ROUTE),
				String.format(RULE, FOURTH_RULE, MD_DOCUMENT.concat("5"), EMPTY, NO_ROUTE),
				String.format(RULE, SIXTH_RULE, MD_DOCUMENT.concat("6"), EMPTY, NO_ROUTE));

		EList<CmObjectRule> report2 = new BasicEList<>();
		ConversionModuleAnalyzerUtils
				.addObjectRule(FIRST_RULE, MD_DOCUMENT.concat("2"), "", false, false, false, report2);
		ConversionModuleAnalyzerUtils
				.addObjectRule(SECOND_RULE, MD_DOCUMENT.concat("1"), "", false, false, false, report2);
		ConversionModuleAnalyzerUtils
				.addObjectRule(THIRD_RULE, MD_DOCUMENT.concat("4"), "", false, false, false, report2);
		ConversionModuleAnalyzerUtils
				.addObjectRule(FOURTH_RULE, MD_DOCUMENT.concat("5"), "", false, false, false, report2);
		ConversionModuleAnalyzerUtils
				.addObjectRule(FIFTH_RULE, MD_DOCUMENT.concat("3"), "", false, false, false, report2);
		ConversionModuleAnalyzerUtils
				.addObjectRule(SIXTH_RULE, MD_DOCUMENT.concat("6"), "", false, false, false, report2);

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getObjectRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_NAME));

		assertEquals("Модуль обмена: сортировка ПКО",
				report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}

	@Test
	public void testObjectRuleComparatorByXdto() {
		String report1 = String.join(LS,
				String.format(RULE, FIRST_RULE, EMPTY, EMPTY, NO_ROUTE),
				String.format(RULE, SECOND_RULE, MD_DOCUMENT.concat("5"), EMPTY, NO_ROUTE),
				String.format(RULE, THIRD_RULE, EMPTY, XDTO_DOCUMENT.concat("1"), NO_ROUTE),
				String.format(RULE, FOURTH_RULE, MD_DOCUMENT.concat("4"), XDTO_DOCUMENT.concat("1"), NO_ROUTE),
				String.format(RULE, FIFTH_RULE, MD_DOCUMENT.concat("6"), XDTO_DOCUMENT.concat("2"), NO_ROUTE),
				String.format(RULE, SIXTH_RULE, MD_DOCUMENT.concat("2"), XDTO_DOCUMENT.concat("3"), NO_ROUTE));

		EList<CmObjectRule> report2 = new BasicEList<>();
		ConversionModuleAnalyzerUtils.addObjectRule(FIFTH_RULE,
				MD_DOCUMENT.concat("6"),
				XDTO_DOCUMENT.concat("2"),
				false,
				false,
				false,
				report2);
		ConversionModuleAnalyzerUtils.addObjectRule(SIXTH_RULE,
				MD_DOCUMENT.concat("2"),
				XDTO_DOCUMENT.concat("3"),
				false,
				false,
				false,
				report2);
		ConversionModuleAnalyzerUtils.addObjectRule(FOURTH_RULE,
				MD_DOCUMENT.concat("4"),
				XDTO_DOCUMENT.concat("1"),
				false,
				false,
				false,
				report2);
		ConversionModuleAnalyzerUtils
				.addObjectRule(THIRD_RULE, "", XDTO_DOCUMENT.concat("1"), false, false, false, report2);
		ConversionModuleAnalyzerUtils
				.addObjectRule(SECOND_RULE, MD_DOCUMENT.concat("5"), "", false, false, false, report2);
		ConversionModuleAnalyzerUtils.addObjectRule(FIRST_RULE, "", "", false, false, false, report2);

		ECollections.sort(report2,
				ConversionModuleAnalyzer
						.getObjectRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_RECEIVING));

		assertEquals("Модуль обмена: сортировка ПКО",
				report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}

	@Test
	public void testPredefinedComparatorByName() {
		String report1 = String.join(LS,
				String.format(RULE, SECOND_RULE, MD_DOCUMENT.concat("1"), EMPTY, RECEIVING_ROUTE),
				String.format(RULE, FIRST_RULE, MD_DOCUMENT.concat("2"), EMPTY, RECEIVING_ROUTE),
				String.format(RULE, FIFTH_RULE, MD_DOCUMENT.concat("3"), EMPTY, RECEIVING_ROUTE),
				String.format(RULE, THIRD_RULE, MD_DOCUMENT.concat("4"), EMPTY, SENDING_ROUTE),
				String.format(RULE, FOURTH_RULE, MD_DOCUMENT.concat("5"), EMPTY, SENDING_ROUTE),
				String.format(RULE, SIXTH_RULE, MD_DOCUMENT.concat("6"), EMPTY, SENDING_ROUTE));

		EList<CmPredefined> report2 = new BasicEList<>();
		ConversionModuleAnalyzerUtils.addPredefined(FIRST_RULE, MD_DOCUMENT.concat("2"), "", false, true, report2);
		ConversionModuleAnalyzerUtils.addPredefined(SECOND_RULE, MD_DOCUMENT.concat("1"), "", false, true, report2);
		ConversionModuleAnalyzerUtils.addPredefined(THIRD_RULE, MD_DOCUMENT.concat("4"), "", true, false, report2);
		ConversionModuleAnalyzerUtils.addPredefined(FOURTH_RULE, MD_DOCUMENT.concat("5"), "", true, false, report2);
		ConversionModuleAnalyzerUtils.addPredefined(FIFTH_RULE, MD_DOCUMENT.concat("3"), "", false, true, report2);
		ConversionModuleAnalyzerUtils.addPredefined(SIXTH_RULE, MD_DOCUMENT.concat("6"), "", true, false, report2);

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getPredefinedComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_NAME));

		assertEquals("Модуль обмена: сортировка ПКПД",
				report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}

	@Test
	public void testPredefinedComparatorByRouteName() {
		String report1 = String.join(LS,
				String.format(RULE, FIFTH_RULE, MD_DOCUMENT.concat("1"), EMPTY, SENDING_ROUTE),
				String.format(RULE, FOURTH_RULE, MD_DOCUMENT.concat("2"), EMPTY, SENDING_ROUTE),
				String.format(RULE, SIXTH_RULE, MD_DOCUMENT.concat("3"), EMPTY, SENDING_ROUTE),
				String.format(RULE, SECOND_RULE, MD_DOCUMENT.concat("4"), EMPTY, RECEIVING_ROUTE),
				String.format(RULE, FIRST_RULE, MD_DOCUMENT.concat("5"), EMPTY, RECEIVING_ROUTE),
				String.format(RULE, THIRD_RULE, MD_DOCUMENT.concat("6"), EMPTY, RECEIVING_ROUTE));

		EList<CmPredefined> report2 = new BasicEList<>();
		ConversionModuleAnalyzerUtils.addPredefined(FIRST_RULE, MD_DOCUMENT.concat("5"), "", false, true, report2);
		ConversionModuleAnalyzerUtils.addPredefined(SECOND_RULE, MD_DOCUMENT.concat("4"), "", false, true, report2);
		ConversionModuleAnalyzerUtils.addPredefined(THIRD_RULE, MD_DOCUMENT.concat("6"), "", false, true, report2);
		ConversionModuleAnalyzerUtils.addPredefined(FOURTH_RULE, MD_DOCUMENT.concat("2"), "", true, false, report2);
		ConversionModuleAnalyzerUtils.addPredefined(FIFTH_RULE, MD_DOCUMENT.concat("1"), "", true, false, report2);
		ConversionModuleAnalyzerUtils.addPredefined(SIXTH_RULE, MD_DOCUMENT.concat("3"), "", true, false, report2);

		ECollections.sort(report2,
				ConversionModuleAnalyzer
						.getPredefinedComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_ROUTE_NAME));

		assertEquals("Модуль обмена: сортировка ПКПД",
				report1.replace(", ", LS),
				report2.toString().replace(", ", LS).replace("[", "").replace("]", ""));
	}
}
