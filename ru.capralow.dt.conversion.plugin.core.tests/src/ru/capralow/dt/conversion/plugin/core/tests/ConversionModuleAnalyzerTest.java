package ru.capralow.dt.conversion.plugin.core.tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import com.google.common.io.CharSource;
import com.google.common.io.CharStreams;
import com.google.common.io.Resources;

import ru.capralow.dt.conversion.plugin.core.ConversionModuleAnalyzer;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined;
import ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmFactory;

public class ConversionModuleAnalyzerTest {
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

	@Test
	public void testGetDataRuleComparatorByName() {
		String report1 = String.join(System.lineSeparator(), SECOND_RULE_MD, FIRST_RULE_MD, FIFTH_RULE_MD,
				THIRD_RULE_MD, FOURTH_RULE_MD, SIXTH_RULE_MD);

		EList<CmDataRule> report2 = new BasicEList<>();

		CmDataRule dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName(FIRST_RULE);
		dataRule.setConfigurationObjectName(MD_DOCUMENT.concat("2"));
		dataRule.setFormatObject("");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName(SECOND_RULE);
		dataRule.setConfigurationObjectName(MD_DOCUMENT.concat("1"));
		dataRule.setFormatObject("");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName(THIRD_RULE);
		dataRule.setConfigurationObjectName(MD_DOCUMENT.concat("4"));
		dataRule.setFormatObject("");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName(FOURTH_RULE);
		dataRule.setConfigurationObjectName(MD_DOCUMENT.concat("5"));
		dataRule.setFormatObject("");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName(FIFTH_RULE);
		dataRule.setConfigurationObjectName(MD_DOCUMENT.concat("3"));
		dataRule.setFormatObject("");
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setName(SIXTH_RULE);
		dataRule.setConfigurationObjectName(MD_DOCUMENT.concat("6"));
		dataRule.setFormatObject("");

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getDataRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_NAME));

		assertEquals("Модуль обмена: сортировка ПОД по имени", report1.replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testGetDataRuleComparatorByMd() {
		String report1 = String.join(System.lineSeparator(), FIRST_RULE_XDTO,
				"name:ВтороеПравило md:<Пустое> xdto:Документ.Документ5 <НаправлениеНеЗадано>",
				"name:ТретьеПравило md:Метаданные.Документы.Документ1 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ЧетвертоеПравило md:Метаданные.Документы.Документ1 xdto:Документ.Документ4 <НаправлениеНеЗадано>",
				"name:ПятоеПравило md:Метаданные.Документы.Документ2 xdto:Документ.Документ6 <НаправлениеНеЗадано>",
				"name:ШестоеПравило md:Метаданные.Документы.Документ3 xdto:Документ.Документ2 <НаправлениеНеЗадано>");

		EList<CmDataRule> report2 = new BasicEList<>();

		CmDataRule dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setConfigurationObjectName(MD_DOCUMENT.concat("2"));
		dataRule.setFormatObject(XDTO_DOCUMENT.concat("6"));
		dataRule.setName(FIFTH_RULE);
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setConfigurationObjectName(MD_DOCUMENT.concat("3"));
		dataRule.setFormatObject(XDTO_DOCUMENT.concat("2"));
		dataRule.setName(SIXTH_RULE);
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setConfigurationObjectName(MD_DOCUMENT.concat("1"));
		dataRule.setFormatObject(XDTO_DOCUMENT.concat("4"));
		dataRule.setName(FOURTH_RULE);
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setConfigurationObjectName(MD_DOCUMENT.concat("1"));
		dataRule.setFormatObject("");
		dataRule.setName(THIRD_RULE);
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setConfigurationObjectName("");
		dataRule.setFormatObject(XDTO_DOCUMENT.concat("5"));
		dataRule.setName(SECOND_RULE);
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setConfigurationObjectName("");
		dataRule.setFormatObject("");
		dataRule.setName(FIRST_RULE);

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getDataRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_SENDING));

		assertEquals("Модуль обмена: сортировка ПОД по метаданным", report1.replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testGetDataRuleComparatorByXdto() {
		String report1 = String.join(System.lineSeparator(), FIRST_RULE_XDTO,
				"name:ВтороеПравило md:Метаданные.Документы.Документ5 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ТретьеПравило md:<Пустое> xdto:Документ.Документ1 <НаправлениеНеЗадано>",
				"name:ЧетвертоеПравило md:Метаданные.Документы.Документ4 xdto:Документ.Документ1 <НаправлениеНеЗадано>",
				"name:ПятоеПравило md:Метаданные.Документы.Документ6 xdto:Документ.Документ2 <НаправлениеНеЗадано>",
				"name:ШестоеПравило md:Метаданные.Документы.Документ2 xdto:Документ.Документ3 <НаправлениеНеЗадано>");

		EList<CmDataRule> report2 = new BasicEList<>();

		CmDataRule dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setFormatObject(XDTO_DOCUMENT.concat("2"));
		dataRule.setConfigurationObjectName(MD_DOCUMENT.concat("6"));
		dataRule.setName(FIFTH_RULE);
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setFormatObject(XDTO_DOCUMENT.concat("3"));
		dataRule.setConfigurationObjectName(MD_DOCUMENT.concat("2"));
		dataRule.setName(SIXTH_RULE);
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setFormatObject(XDTO_DOCUMENT.concat("1"));
		dataRule.setConfigurationObjectName(MD_DOCUMENT.concat("4"));
		dataRule.setName(FOURTH_RULE);
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setFormatObject(XDTO_DOCUMENT.concat("1"));
		dataRule.setConfigurationObjectName("");
		dataRule.setName(THIRD_RULE);
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setFormatObject("");
		dataRule.setConfigurationObjectName(MD_DOCUMENT.concat("5"));
		dataRule.setName(SECOND_RULE);
		dataRule = cmFactory.eINSTANCE.createCmDataRule();
		report2.add(dataRule);
		dataRule.setConfigurationObjectName("");
		dataRule.setFormatObject("");
		dataRule.setName(FIRST_RULE);

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getDataRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_RECEIVING));

		assertEquals("Модуль обмена: сортировка ПОД по формату", report1.replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testGetObjectRuleComparatorByName() {
		String report1 = String.join(System.lineSeparator(), SECOND_RULE_MD, FIRST_RULE_MD, FIFTH_RULE_MD,
				THIRD_RULE_MD, FOURTH_RULE_MD, SIXTH_RULE_MD);

		EList<CmObjectRule> report2 = new BasicEList<>();

		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName(FIRST_RULE);
		objectRule.setConfigurationObjectName(MD_DOCUMENT.concat("2"));
		objectRule.setFormatObject("");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName(SECOND_RULE);
		objectRule.setConfigurationObjectName(MD_DOCUMENT.concat("1"));
		objectRule.setFormatObject("");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName(THIRD_RULE);
		objectRule.setConfigurationObjectName(MD_DOCUMENT.concat("4"));
		objectRule.setFormatObject("");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName(FOURTH_RULE);
		objectRule.setConfigurationObjectName(MD_DOCUMENT.concat("5"));
		objectRule.setFormatObject("");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName(FIFTH_RULE);
		objectRule.setConfigurationObjectName(MD_DOCUMENT.concat("3"));
		objectRule.setFormatObject("");
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setName(SIXTH_RULE);
		objectRule.setConfigurationObjectName(MD_DOCUMENT.concat("6"));
		objectRule.setFormatObject("");

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getObjectRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_NAME));

		assertEquals("Модуль обмена: сортировка ПКО", report1.replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testGetObjectRuleComparatorByMd() {
		String report1 = String.join(System.lineSeparator(), FIRST_RULE_XDTO,
				"name:ВтороеПравило md:<Пустое> xdto:Документ.Документ5 <НаправлениеНеЗадано>",
				"name:ТретьеПравило md:Метаданные.Документы.Документ1 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ЧетвертоеПравило md:Метаданные.Документы.Документ1 xdto:Документ.Документ4 <НаправлениеНеЗадано>",
				"name:ПятоеПравило md:Метаданные.Документы.Документ2 xdto:Документ.Документ6 <НаправлениеНеЗадано>",
				"name:ШестоеПравило md:Метаданные.Документы.Документ3 xdto:Документ.Документ2 <НаправлениеНеЗадано>");

		EList<CmObjectRule> report2 = new BasicEList<>();

		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setConfigurationObjectName(MD_DOCUMENT.concat("2"));
		objectRule.setFormatObject(XDTO_DOCUMENT.concat("6"));
		objectRule.setName(FIFTH_RULE);
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setConfigurationObjectName(MD_DOCUMENT.concat("3"));
		objectRule.setFormatObject(XDTO_DOCUMENT.concat("2"));
		objectRule.setName(SIXTH_RULE);
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setConfigurationObjectName(MD_DOCUMENT.concat("1"));
		objectRule.setFormatObject(XDTO_DOCUMENT.concat("4"));
		objectRule.setName(FOURTH_RULE);
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setConfigurationObjectName(MD_DOCUMENT.concat("1"));
		objectRule.setFormatObject("");
		objectRule.setName(THIRD_RULE);
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setConfigurationObjectName("");
		objectRule.setFormatObject(XDTO_DOCUMENT.concat("5"));
		objectRule.setName(SECOND_RULE);
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setConfigurationObjectName("");
		objectRule.setFormatObject("");
		objectRule.setName(FIRST_RULE);

		ECollections.sort(report2,
				ConversionModuleAnalyzer.getObjectRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_SENDING));

		assertEquals("Модуль обмена: сортировка ПКО по объекту конфигурации (метаданным)",
				report1.replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testGetObjectRuleComparatorByXdto() {
		String report1 = String.join(System.lineSeparator(), FIRST_RULE_XDTO,
				"name:ВтороеПравило md:Метаданные.Документы.Документ5 xdto:<Пустое> <НаправлениеНеЗадано>",
				"name:ТретьеПравило md:<Пустое> xdto:Документ.Документ1 <НаправлениеНеЗадано>",
				"name:ЧетвертоеПравило md:Метаданные.Документы.Документ4 xdto:Документ.Документ1 <НаправлениеНеЗадано>",
				"name:ПятоеПравило md:Метаданные.Документы.Документ6 xdto:Документ.Документ2 <НаправлениеНеЗадано>",
				"name:ШестоеПравило md:Метаданные.Документы.Документ2 xdto:Документ.Документ3 <НаправлениеНеЗадано>");

		EList<CmObjectRule> report2 = new BasicEList<>();

		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setFormatObject(XDTO_DOCUMENT.concat("2"));
		objectRule.setConfigurationObjectName(MD_DOCUMENT.concat("6"));
		objectRule.setName(FIFTH_RULE);
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setFormatObject(XDTO_DOCUMENT.concat("3"));
		objectRule.setConfigurationObjectName(MD_DOCUMENT.concat("2"));
		objectRule.setName(SIXTH_RULE);
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setFormatObject(XDTO_DOCUMENT.concat("1"));
		objectRule.setConfigurationObjectName(MD_DOCUMENT.concat("4"));
		objectRule.setName(FOURTH_RULE);
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setFormatObject(XDTO_DOCUMENT.concat("1"));
		objectRule.setConfigurationObjectName("");
		objectRule.setName(THIRD_RULE);
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setFormatObject("");
		objectRule.setConfigurationObjectName(MD_DOCUMENT.concat("5"));
		objectRule.setName(SECOND_RULE);
		objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		report2.add(objectRule);
		objectRule.setConfigurationObjectName("");
		objectRule.setFormatObject("");
		objectRule.setName(FIRST_RULE);

		ECollections.sort(report2, ConversionModuleAnalyzer
				.getObjectRuleComparator(ConversionModuleAnalyzer.COMPARATOR_ORDER_BY_RECEIVING));

		assertEquals("Модуль обмена: сортировка ПКО", report1.replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testGetPredefinedComparator() {
		String report1 = String.join(System.lineSeparator(), SECOND_RULE_MD, FIRST_RULE_MD, FIFTH_RULE_MD,
				THIRD_RULE_MD, FOURTH_RULE_MD, SIXTH_RULE_MD);

		EList<CmPredefined> report2 = new BasicEList<>();

		CmPredefined predefined = cmFactory.eINSTANCE.createCmPredefined();
		report2.add(predefined);
		predefined.setName(FIRST_RULE);
		predefined.setConfigurationObjectName(MD_DOCUMENT.concat("2"));
		predefined.setFormatObject("");
		predefined = cmFactory.eINSTANCE.createCmPredefined();
		report2.add(predefined);
		predefined.setName(SECOND_RULE);
		predefined.setConfigurationObjectName(MD_DOCUMENT.concat("1"));
		predefined.setFormatObject("");
		predefined = cmFactory.eINSTANCE.createCmPredefined();
		report2.add(predefined);
		predefined.setName(THIRD_RULE);
		predefined.setConfigurationObjectName(MD_DOCUMENT.concat("4"));
		predefined.setFormatObject("");
		predefined = cmFactory.eINSTANCE.createCmPredefined();
		report2.add(predefined);
		predefined.setName(FOURTH_RULE);
		predefined.setConfigurationObjectName(MD_DOCUMENT.concat("5"));
		predefined.setFormatObject("");
		predefined = cmFactory.eINSTANCE.createCmPredefined();
		report2.add(predefined);
		predefined.setName(FIFTH_RULE);
		predefined.setConfigurationObjectName(MD_DOCUMENT.concat("3"));
		predefined.setFormatObject("");
		predefined = cmFactory.eINSTANCE.createCmPredefined();
		report2.add(predefined);
		predefined.setName(SIXTH_RULE);
		predefined.setConfigurationObjectName(MD_DOCUMENT.concat("6"));
		predefined.setFormatObject("");

		ECollections.sort(report2, ConversionModuleAnalyzer.getPredefinedComparator());

		assertEquals("Модуль обмена: сортировка ПКПД", report1.replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testGetAlgorithmComparator() {
		String report1 = String.join(System.lineSeparator(), "Процедура ВтораяПроцедура(1)",
				"Процедура ПерваяПроцедура(2)", "Процедура ПятаяПроцедура(3)", "Процедура ТретьяПроцедура(4)",
				"Процедура ЧетвертаяПроцедура(5)", "Процедура ШестаяПроцедура(6)");

		EList<CmAlgorithm> report2 = new BasicEList<>();

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

		assertEquals("Модуль обмена: сортировка Алгоритмов", report1.replace(", ", System.lineSeparator()),
				report2.toString().replace(", ", System.lineSeparator()).replace("[", "").replace("]", ""));
	}

	@Test
	public void testCreateSendingObjectRuleTextEmpty() {
		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();

		ConversionModuleAnalyzer.createSendingObjectRuleText(objectRule, new StringBuilder(), report2);

		assertEquals("Формирование модуля обмена: Добавить пустое ПКО для отправки", "", report2.toString());
	}

	@Test
	public void testCreateSendingObjectRuleTextNameOnly() {
		String report1 = "#Область МинимальноеПКООтправки\r\n"
				+ "Процедура ДобавитьПКО_МинимальноеПКООтправки(ПравилаКонвертации)\r\n" + "\r\n"
				+ "	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);\r\n"
				+ "	ПравилоКонвертации.ИмяПКО            = \"МинимальноеПКООтправки\";\r\n"
				+ "	ПравилоКонвертации.ОбъектДанных      = Неопределено;\r\n"
				+ "	ПравилоКонвертации.ОбъектФормата     = \"\";\r\n" + "	\r\n" + "\r\n" + "КонецПроцедуры\r\n"
				+ "#КонецОбласти";

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		objectRule.setForSending(true);
		objectRule.setName("МинимальноеПКООтправки");

		ConversionModuleAnalyzer.createSendingObjectRuleText(objectRule, new StringBuilder(), report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки с минимумом данных", report1,
				report2.toString());
	}

	@Test
	public void testCreateSendingObjectRuleTextTwoTabularSections() {
		String report1 = "#Область ПКООтправкиДвеТЧ\r\n"
				+ "Процедура ДобавитьПКО_ПКООтправкиДвеТЧ(ПравилаКонвертации)\r\n" + "\r\n"
				+ "	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);\r\n"
				+ "	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиДвеТЧ\";\r\n"
				+ "	ПравилоКонвертации.ОбъектДанных      = Метаданные.Справочники.Организации;\r\n"
				+ "	ПравилоКонвертации.ОбъектФормата     = \"Справочник.Организации\";\r\n" + "	\r\n" + "	\r\n"
				+ "	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, \"ДополнительныеРеквизиты\", \"ДополнительныеРеквизиты\");\r\n"
				+ "	ДобавитьПКС(СвойстваТЧ, \"Значение\", \"ЗначениеСвойства\");\r\n"
				+ "	ДобавитьПКС(СвойстваТЧ, \"\",         \"ЗначениеСвойства\", 1,\"НесуществующееПравило\");\r\n"
				+ "	\r\n"
				+ "	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, \"КонтактнаяИнформация\",    \"КонтактнаяИнформация\");\r\n"
				+ "	ДобавитьПКС(СвойстваТЧ, \"Вид\", \"ВидКонтактнойИнформации\", ,\"ВидыКонтактнойИнформации\");\r\n"
				+ "\r\n" + "КонецПроцедуры\r\n" + "#КонецОбласти";

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		objectRule.setForSending(true);
		objectRule.setName("ПКООтправкиДвеТЧ");
		objectRule.setConfigurationObjectName("Метаданные.Справочники.Организации");
		objectRule.setFormatObject("Справочник.Организации");

		addAttribute("ДополнительныеРеквизиты.Значение", "ДополнительныеРеквизиты.", false, "НесуществующееПравило",
				objectRule);
		addAttribute("ДополнительныеРеквизиты.Значение", "ДополнительныеРеквизиты.ЗначениеСвойства", false, "",
				objectRule);
		addAttribute("ДополнительныеРеквизиты.", "ДополнительныеРеквизиты.ЗначениеСвойства", true,
				"НесуществующееПравило", objectRule);

		addAttribute("КонтактнаяИнформация.Вид", "КонтактнаяИнформация.ВидКонтактнойИнформации", false,
				"ВидыКонтактнойИнформации", objectRule);

		ConversionModuleAnalyzer.createSendingObjectRuleText(objectRule, new StringBuilder(), report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки с двумя ТЧ", report1, report2.toString());
	}

	@Test
	public void testCreateSendingObjectRuleTextConfigurationObject() {
		String report1 = "#Область ПКООтправкиОбъектКонфигурации\r\n"
				+ "Процедура ДобавитьПКО_ПКООтправкиОбъектКонфигурации(ПравилаКонвертации)\r\n" + "\r\n"
				+ "	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);\r\n"
				+ "	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиОбъектКонфигурации\";\r\n"
				+ "	ПравилоКонвертации.ОбъектДанных      = Метаданные.Справочники.Организации;\r\n"
				+ "	ПравилоКонвертации.ОбъектФормата     = \"\";\r\n" + "	\r\n" + "\r\n" + "КонецПроцедуры\r\n"
				+ "#КонецОбласти";

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		objectRule.setForSending(true);
		objectRule.setName("ПКООтправкиОбъектКонфигурации");
		objectRule.setConfigurationObjectName("Метаданные.Справочники.Организации");

		ConversionModuleAnalyzer.createSendingObjectRuleText(objectRule, new StringBuilder(), report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки c объектом конфигурации", report1,
				report2.toString());
	}

	@Test
	public void testCreateSendingObjectRuleTextConfigurationObjectWithFields() {
		String report1 = "#Область ПКООтправкиОбъектКонфигурацииСПолями\r\n"
				+ "Процедура ДобавитьПКО_ПКООтправкиОбъектКонфигурацииСПолями(ПравилаКонвертации)\r\n" + "\r\n"
				+ "	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);\r\n"
				+ "	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиОбъектКонфигурацииСПолями\";\r\n"
				+ "	ПравилоКонвертации.ОбъектДанных      = Метаданные.Справочники.Организации;\r\n"
				+ "	ПравилоКонвертации.ОбъектФормата     = \"\";\r\n" + "	\r\n"
				+ "	СвойстваШапки = ПравилоКонвертации.Свойства;\r\n"
				+ "	ДобавитьПКС(СвойстваШапки, \"Наименование\", \"\");\r\n" + "\r\n" + "КонецПроцедуры\r\n"
				+ "#КонецОбласти";

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		objectRule.setForSending(true);
		objectRule.setName("ПКООтправкиОбъектКонфигурацииСПолями");
		objectRule.setConfigurationObjectName("Метаданные.Справочники.Организации");
		addAttribute("Наименование", "", false, "", objectRule);

		ConversionModuleAnalyzer.createSendingObjectRuleText(objectRule, new StringBuilder(), report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки c объектом конфигурации и полями", report1,
				report2.toString());
	}

	@Test
	public void testCreateSendingObjectRuleTextConfigurationFormatObject() {
		String report1 = "#Область ПКООтправкиОбъектКонфигурацииФормата\r\n"
				+ "Процедура ДобавитьПКО_ПКООтправкиОбъектКонфигурацииФормата(ПравилаКонвертации)\r\n" + "\r\n"
				+ "	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);\r\n"
				+ "	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиОбъектКонфигурацииФормата\";\r\n"
				+ "	ПравилоКонвертации.ОбъектДанных      = Метаданные.Справочники.Организации;\r\n"
				+ "	ПравилоКонвертации.ОбъектФормата     = \"Справочник.Организации\";\r\n" + "	\r\n" + "\r\n"
				+ "КонецПроцедуры\r\n" + "#КонецОбласти";

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		objectRule.setForSending(true);
		objectRule.setName("ПКООтправкиОбъектКонфигурацииФормата");
		objectRule.setConfigurationObjectName("Метаданные.Справочники.Организации");
		objectRule.setFormatObject("Справочник.Организации");

		ConversionModuleAnalyzer.createSendingObjectRuleText(objectRule, new StringBuilder(), report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки c объектами конфигурации и формата",
				report1, report2.toString());
	}

	@Test
	public void testCreateSendingObjectRuleTextConfigurationFormatObjectWithFields() {
		String report1 = "#Область ПКООтправкиОбъектКонфигурацииФорматаСПолями\r\n"
				+ "Процедура ДобавитьПКО_ПКООтправкиОбъектКонфигурацииФорматаСПолями(ПравилаКонвертации)\r\n" + "\r\n"
				+ "	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);\r\n"
				+ "	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиОбъектКонфигурацииФорматаСПолями\";\r\n"
				+ "	ПравилоКонвертации.ОбъектДанных      = Метаданные.Справочники.Организации;\r\n"
				+ "	ПравилоКонвертации.ОбъектФормата     = \"Справочник.Организации\";\r\n" + "	\r\n"
				+ "	СвойстваШапки = ПравилоКонвертации.Свойства;\r\n"
				+ "	ДобавитьПКС(СвойстваШапки, \"\",                    \"КПП\");\r\n"
				+ "	ДобавитьПКС(СвойстваШапки, \"ГоловнаяОрганизация\", \"\", , \"ПКООтправкиОбъектКонфигурации\");\r\n"
				+ "	ДобавитьПКС(СвойстваШапки, \"ИНН\",                 \"\");\r\n"
				+ "	ДобавитьПКС(СвойстваШапки, \"Наименование\",        \"Наименование\");\r\n"
				+ "	ДобавитьПКС(СвойстваШапки, \"\",                    \"ГоловнаяОрганизация\", 1, \"ПКООтправкиОбъектФорматаСПолями\");\r\n"
				+ "\r\n" + "КонецПроцедуры\r\n" + "#КонецОбласти";

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		objectRule.setForSending(true);
		objectRule.setName("ПКООтправкиОбъектКонфигурацииФорматаСПолями");
		objectRule.setConfigurationObjectName("Метаданные.Справочники.Организации");
		objectRule.setFormatObject("Справочник.Организации");
		addAttribute("", "КПП", false, "", objectRule);
		addAttribute("ГоловнаяОрганизация", "", false, "ПКООтправкиОбъектКонфигурации", objectRule);
		addAttribute("ИНН", "", false, "", objectRule);
		addAttribute("Наименование", "Наименование", false, "", objectRule);
		addAttribute("", "ГоловнаяОрганизация", true, "ПКООтправкиОбъектФорматаСПолями", objectRule);

		ConversionModuleAnalyzer.createSendingObjectRuleText(objectRule, new StringBuilder(), report2);

		assertEquals(
				"Формирование модуля обмена: Добавить ПКО для отправки c объектами конфигурации и формата и полями",
				report1, report2.toString());
	}

	@Test
	public void testCreateSendingObjectRuleTextFormatObject() {
		String report1 = "#Область ПКООтправкиОбъектФормата\r\n"
				+ "Процедура ДобавитьПКО_ПКООтправкиОбъектФормата(ПравилаКонвертации)\r\n" + "\r\n"
				+ "	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);\r\n"
				+ "	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиОбъектФормата\";\r\n"
				+ "	ПравилоКонвертации.ОбъектДанных      = Неопределено;\r\n"
				+ "	ПравилоКонвертации.ОбъектФормата     = \"Справочник.Организации\";\r\n" + "	\r\n" + "\r\n"
				+ "КонецПроцедуры\r\n" + "#КонецОбласти";

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		objectRule.setForSending(true);
		objectRule.setName("ПКООтправкиОбъектФормата");
		objectRule.setFormatObject("Справочник.Организации");

		ConversionModuleAnalyzer.createSendingObjectRuleText(objectRule, new StringBuilder(), report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки c объектом формата", report1,
				report2.toString());
	}

	@Test
	public void testCreateSendingObjectRuleTextFormatObjectWithFields() {
		String report1 = "#Область ПКООтправкиОбъектФорматаСПолями\r\n"
				+ "Процедура ДобавитьПКО_ПКООтправкиОбъектФорматаСПолями(ПравилаКонвертации)\r\n" + "\r\n"
				+ "	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);\r\n"
				+ "	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиОбъектФорматаСПолями\";\r\n"
				+ "	ПравилоКонвертации.ОбъектДанных      = Неопределено;\r\n"
				+ "	ПравилоКонвертации.ОбъектФормата     = \"Справочник.Организации\";\r\n" + "	\r\n"
				+ "	СвойстваШапки = ПравилоКонвертации.Свойства;\r\n"
				+ "	ДобавитьПКС(СвойстваШапки, \"\", \"Наименование\");\r\n" + "\r\n" + "КонецПроцедуры\r\n"
				+ "#КонецОбласти";

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		objectRule.setForSending(true);
		objectRule.setName("ПКООтправкиОбъектФорматаСПолями");
		objectRule.setFormatObject("Справочник.Организации");
		addAttribute("", "Наименование", false, "", objectRule);

		ConversionModuleAnalyzer.createSendingObjectRuleText(objectRule, new StringBuilder(), report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки c объектом формата", report1,
				report2.toString());
	}

	@Test
	public void testCreateSendingObjectRuleTextFull() {
		String report1 = "#Область ПКООтправкиПолное\r\n"
				+ "Процедура ДобавитьПКО_ПКООтправкиПолное(ПравилаКонвертации)\r\n" + "\r\n"
				+ "	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);\r\n"
				+ "	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиПолное\";\r\n"
				+ "	ПравилоКонвертации.ОбъектДанных      = Метаданные.Справочники.Организации;\r\n"
				+ "	ПравилоКонвертации.ОбъектФормата     = \"Справочник.Организации\";\r\n"
				+ "	ПравилоКонвертации.ПриОтправкеДанных = \"ПКО_ПКООтправкиПолное_ПриОтправкеДанных\";\r\n"
				+ "	\r\n" + "	СвойстваШапки = ПравилоКонвертации.Свойства;\r\n"
				+ "	ДобавитьПКС(СвойстваШапки, \"\",             \"КПП\");\r\n"
				+ "	ДобавитьПКС(СвойстваШапки, \"ИНН\",          \"\");\r\n"
				+ "	ДобавитьПКС(СвойстваШапки, \"Наименование\", \"Наименование\");\r\n" + "	\r\n"
				+ "	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, \"ДополнительныеРеквизиты\", \"ДополнительныеРеквизиты\");\r\n"
				+ "	ДобавитьПКС(СвойстваТЧ, \"Значение\", \"ЗначениеСвойства\");\r\n"
				+ "	ДобавитьПКС(СвойстваТЧ, \"\",         \"ЗначениеСвойства\", 1,\"НесуществующееПравило\");\r\n"
				+ "	\r\n"
				+ "	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, \"КонтактнаяИнформация\",    \"КонтактнаяИнформация\");\r\n"
				+ "	ДобавитьПКС(СвойстваТЧ, \"Вид\", \"ВидКонтактнойИнформации\", ,\"ВидыКонтактнойИнформации\");\r\n"
				+ "\r\n" + "КонецПроцедуры\r\n" + "\r\n"
				+ "Процедура ПКО_ПКООтправкиПолное_ПриОтправкеДанных(ДанныеИБ, ДанныеXDTO, КомпонентыОбмена, СтекВыгрузки)\r\n"
				+ "	Сообщить(\"ПриОтправкеДанных\");\r\n" + "КонецПроцедуры\r\n" + "#КонецОбласти";

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		objectRule.setForSending(true);
		objectRule.setName("ПКООтправкиПолное");
		objectRule.setConfigurationObjectName("Метаданные.Справочники.Организации");
		objectRule.setFormatObject("Справочник.Организации");
		objectRule.setOnSendingEvent("	Сообщить(\"ПриОтправкеДанных\");");

		addAttribute("", "КПП", false, "", objectRule);
		addAttribute("ИНН", "", false, "", objectRule);
		addAttribute("Наименование", "Наименование", false, "", objectRule);

		addAttribute("ДополнительныеРеквизиты.Значение", "ДополнительныеРеквизиты.", false, "НесуществующееПравило",
				objectRule);
		addAttribute("ДополнительныеРеквизиты.Значение", "ДополнительныеРеквизиты.ЗначениеСвойства", false, "",
				objectRule);
		addAttribute("ДополнительныеРеквизиты.", "ДополнительныеРеквизиты.ЗначениеСвойства", true,
				"НесуществующееПравило", objectRule);

		addAttribute("КонтактнаяИнформация.Вид", "КонтактнаяИнформация.ВидКонтактнойИнформации", false,
				"ВидыКонтактнойИнформации", objectRule);

		ConversionModuleAnalyzer.createSendingObjectRuleText(objectRule, new StringBuilder(), report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки полное", report1, report2.toString());
	}

	@Test
	public void testCreateSendingObjectRuleTextWithEvent() {
		String report1 = "#Область ПКООтправкиСобытие1\r\n"
				+ "Процедура ДобавитьПКО_ПКООтправкиСобытие1(ПравилаКонвертации)\r\n" + "\r\n"
				+ "	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);\r\n"
				+ "	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиСобытие1\";\r\n"
				+ "	ПравилоКонвертации.ОбъектДанных      = Неопределено;\r\n"
				+ "	ПравилоКонвертации.ОбъектФормата     = \"\";\r\n"
				+ "	ПравилоКонвертации.ПриОтправкеДанных = \"ПКО_ПКООтправкиСобытие1_ПриОтправкеДанных\";\r\n"
				+ "	\r\n" + "\r\n" + "КонецПроцедуры\r\n" + "\r\n"
				+ "Процедура ПКО_ПКООтправкиСобытие1_ПриОтправкеДанных(ДанныеИБ, ДанныеXDTO, КомпонентыОбмена, СтекВыгрузки)\r\n"
				+ "	Сообщить(\"ПриОтправкеДанных\");\r\n" + "КонецПроцедуры\r\n" + "#КонецОбласти";

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		objectRule.setForSending(true);
		objectRule.setName("ПКООтправкиСобытие1");
		objectRule.setOnSendingEvent("	Сообщить(\"ПриОтправкеДанных\");");

		ConversionModuleAnalyzer.createSendingObjectRuleText(objectRule, new StringBuilder(), report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки c событием", report1, report2.toString());
	}

	@Test
	public void testCreateSendingObjectRuleTextWithTabularSection() {
		String report1 = "#Область ПКООтправкиТЧ\r\n" + "Процедура ДобавитьПКО_ПКООтправкиТЧ(ПравилаКонвертации)\r\n"
				+ "\r\n"
				+ "	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);\r\n"
				+ "	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиТЧ\";\r\n"
				+ "	ПравилоКонвертации.ОбъектДанных      = Метаданные.Справочники.Организации;\r\n"
				+ "	ПравилоКонвертации.ОбъектФормата     = \"Справочник.Организации\";\r\n" + "	\r\n" + "	\r\n"
				+ "	СвойстваТЧ = ДобавитьПКТЧ(ПравилоКонвертации, \"ДополнительныеРеквизиты\", \"ДополнительныеРеквизиты\");\r\n"
				+ "	ДобавитьПКС(СвойстваТЧ, \"Значение\", \"ЗначениеСвойства\");\r\n"
				+ "	ДобавитьПКС(СвойстваТЧ, \"\",         \"ЗначениеСвойства\", 1,\"НесуществующееПравило\");\r\n"
				+ "\r\n" + "КонецПроцедуры\r\n" + "#КонецОбласти";

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		objectRule.setForSending(true);
		objectRule.setName("ПКООтправкиТЧ");
		objectRule.setConfigurationObjectName("Метаданные.Справочники.Организации");
		objectRule.setFormatObject("Справочник.Организации");

		addAttribute("ДополнительныеРеквизиты.Значение", "ДополнительныеРеквизиты.", false, "НесуществующееПравило",
				objectRule);
		addAttribute("ДополнительныеРеквизиты.Значение", "ДополнительныеРеквизиты.ЗначениеСвойства", false, "",
				objectRule);
		addAttribute("ДополнительныеРеквизиты.", "ДополнительныеРеквизиты.ЗначениеСвойства", true,
				"НесуществующееПравило", objectRule);

		ConversionModuleAnalyzer.createSendingObjectRuleText(objectRule, new StringBuilder(), report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки c табличной частью", report1,
				report2.toString());
	}

	@Test
	public void testCreateSendingObjectRuleTextWithAttributes() {
		String report1 = "#Область ПКООтправкиШапка\r\n"
				+ "Процедура ДобавитьПКО_ПКООтправкиШапка(ПравилаКонвертации)\r\n" + "\r\n"
				+ "	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);\r\n"
				+ "	ПравилоКонвертации.ИмяПКО            = \"ПКООтправкиШапка\";\r\n"
				+ "	ПравилоКонвертации.ОбъектДанных      = Метаданные.Справочники.Организации;\r\n"
				+ "	ПравилоКонвертации.ОбъектФормата     = \"Справочник.Организации\";\r\n" + "	\r\n"
				+ "	СвойстваШапки = ПравилоКонвертации.Свойства;\r\n"
				+ "	ДобавитьПКС(СвойстваШапки, \"\",             \"КПП\");\r\n"
				+ "	ДобавитьПКС(СвойстваШапки, \"ИНН\",          \"\");\r\n"
				+ "	ДобавитьПКС(СвойстваШапки, \"Наименование\", \"Наименование\");\r\n" + "\r\n" + "КонецПроцедуры\r\n"
				+ "#КонецОбласти";

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		objectRule.setForSending(true);
		objectRule.setName("ПКООтправкиШапка");
		objectRule.setConfigurationObjectName("Метаданные.Справочники.Организации");
		objectRule.setFormatObject("Справочник.Организации");
		addAttribute("", "КПП", false, "", objectRule);
		addAttribute("ИНН", "", false, "", objectRule);
		addAttribute("Наименование", "Наименование", false, "", objectRule);

		ConversionModuleAnalyzer.createSendingObjectRuleText(objectRule, new StringBuilder(), report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки c шапкой", report1, report2.toString());
	}

	@Test
	public void testCreateReceivingObjectRuleTextEmpty() {
		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();

		ConversionModuleAnalyzer.createReceivingObjectRuleText(objectRule, new StringBuilder(), report2);

		assertEquals("Формирование модуля обмена: Добавить пустое ПКО для получения", "", report2.toString());
	}

	@Test
	public void testCreateReceivingObjectRuleTextNameOnly() {
		String report1 = "#Область МинимальноеПКОПолучения\r\n"
				+ "Процедура ДобавитьПКО_МинимальноеПКОПолучения(ПравилаКонвертации)\r\n" + "\r\n"
				+ "	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);\r\n"
				+ "	ПравилоКонвертации.ИмяПКО                       = \"МинимальноеПКОПолучения\";\r\n"
				+ "	ПравилоКонвертации.ОбъектДанных                 = Неопределено;\r\n"
				+ "	ПравилоКонвертации.ОбъектФормата                = \"\";\r\n"
				+ "	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";\r\n" + "	\r\n"
				+ "\r\n" + "КонецПроцедуры\r\n" + "#КонецОбласти";

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		objectRule.setForReceiving(true);
		objectRule.setName("МинимальноеПКОПолучения");

		ConversionModuleAnalyzer.createReceivingObjectRuleText(objectRule, new StringBuilder(), report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для получения с минимумом данных", report1,
				report2.toString());
	}

	@Test
	public void testCreateBothObjectRuleTextNameOnly() {
		String report1 = "#Область МинимальноеПКООтправкиПолучения\r\n"
				+ "Процедура ДобавитьПКО_МинимальноеПКООтправкиПолучения(ПравилаКонвертации)\r\n" + "\r\n"
				+ "	ПравилоКонвертации = ОбменДаннымиXDTOСервер.ИнициализироватьПравилоКонвертацииОбъекта(ПравилаКонвертации);\r\n"
				+ "	ПравилоКонвертации.ИмяПКО                       = \"МинимальноеПКООтправкиПолучения\";\r\n"
				+ "	ПравилоКонвертации.ОбъектДанных                 = Неопределено;\r\n"
				+ "	ПравилоКонвертации.ОбъектФормата                = \"\";\r\n"
				+ "	ПравилоКонвертации.ВариантИдентификации         = \"ПоУникальномуИдентификатору\";\r\n" + "	\r\n"
				+ "\r\n" + "КонецПроцедуры\r\n" + "#КонецОбласти";

		StringBuilder report2 = new StringBuilder();
		CmObjectRule objectRule = cmFactory.eINSTANCE.createCmObjectRule();
		objectRule.setForSending(true);
		objectRule.setForReceiving(true);
		objectRule.setName("МинимальноеПКООтправкиПолучения");

		ConversionModuleAnalyzer.createReceivingObjectRuleText(objectRule, new StringBuilder(), report2);

		assertEquals("Формирование модуля обмена: Добавить ПКО для отправки и получения с минимумом данных", report1,
				report2.toString());
	}

	private void addAttribute(String configurationFullAttribute, String formatFullAttribute, Boolean isCustom,
			String attributeObjectRuleName, CmObjectRule objectRule) {
		CmAttributeRule attributeRule = cmFactory.eINSTANCE.createCmAttributeRule();
		objectRule.getAttributeRules().add(attributeRule);
		attributeRule.setIsCustomRule(isCustom);

		if (!configurationFullAttribute.isEmpty()) {
			String[] arrayConfigurationFullAttribute = configurationFullAttribute.split("[.]", 2);
			if (arrayConfigurationFullAttribute.length == 2) {
				attributeRule.setConfigurationTabularSection(arrayConfigurationFullAttribute[0]);
				attributeRule.setConfigurationAttribute(arrayConfigurationFullAttribute[1]);

			} else {
				attributeRule.setConfigurationAttribute(arrayConfigurationFullAttribute[0]);

			}
		}

		if (!formatFullAttribute.isEmpty()) {
			String[] arrayFormatFullAttribute = formatFullAttribute.split("[.]", 2);
			if (arrayFormatFullAttribute.length == 2) {
				attributeRule.setFormatTabularSection(arrayFormatFullAttribute[0]);
				attributeRule.setFormatAttribute(arrayFormatFullAttribute[1]);

			} else {
				attributeRule.setFormatAttribute(arrayFormatFullAttribute[0]);

			}
		}

		if (!attributeObjectRuleName.isEmpty()) {
			CmObjectRule attributeObjectRule = cmFactory.eINSTANCE.createCmObjectRule();
			attributeObjectRule.setName(attributeObjectRuleName);
			attributeRule.setObjectRule(attributeObjectRule);
		}
	}

	// @Test
	public void testGetModuleText() {
		String projectName = "ЗУПКОРП-3_1_9";
		String moduleName = "МенеджерОбменаЧерезУниверсальныйФормат";

		final String NAME = projectName + "/" + moduleName + ".txt";
		String report1 = readContents(getFileInputSupplier(NAME)).replace("\r\n", System.lineSeparator());

		URI xmiURI = getResourceURI(projectName + "/" + "conversionModule-" + moduleName + ".xmi");
		ConversionModule conversionModule = ConversionModuleAnalyzer.loadResource(xmiURI, null);

		String report2 = ConversionModuleAnalyzer.getModuleText(conversionModule, "ЗУП3.1.3",
				LocalDateTime.of(2017, 8, 21, 13, 5, 35));

		assertEquals("Модуль обмена: " + projectName + " запись модуля", report1, report2);
	}

	private static String readContents(CharSource source) {
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
