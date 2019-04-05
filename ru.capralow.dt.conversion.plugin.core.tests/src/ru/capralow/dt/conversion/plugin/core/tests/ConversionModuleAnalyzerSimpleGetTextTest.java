package ru.capralow.dt.conversion.plugin.core.tests;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import ru.capralow.dt.conversion.plugin.core.ConversionModuleAnalyzer;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmFactory;

public class ConversionModuleAnalyzerSimpleGetTextTest {
	@Test
	public void testEmptyV2() {
		String moduleName = "ПустаяВерсия2";

		String report1 = ConversionModuleAnalyzerUtils.getModuleText("", moduleName);

		ConversionModule conversionModule = cmFactory.eINSTANCE.createConversionModule();
		conversionModule.setStoreVersion("2");

		String report2 = ConversionModuleAnalyzer.getModuleText(conversionModule, "ПустаяКонвертация",
				LocalDateTime.of(1, 1, 1, 0, 0, 0));

		assertEquals("Модуль обмена V2: запись пустого модуля", report1, report2);
	}

	@Test
	public void testFullV2() {
		String moduleName = "Версия2";

		String report1 = ConversionModuleAnalyzerUtils.getModuleText("", moduleName);

		ConversionModule conversionModule = cmFactory.eINSTANCE.createConversionModule();
		conversionModule.setStoreVersion("2");

		EList<CmObjectRule> objectRules = conversionModule.getObjectRules();
		CmObjectRule objectRule;

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("МинимальноеПКОПолучения", false, false, false,
				true, true);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиОбъектКонфигурацииФормата", true,
				true, true, false, false);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиОбъектКонфигурацииФорматаСПолями",
				true, true, true, false, false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиОбъектКонфигурации", true, false,
				true, false, false);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиОбъектКонфигурацииСПолями", true,
				false, true, false, false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиОбъектФормата", false, true, true,
				false, false);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиОбъектФорматаСПолями", false, true,
				true, false, false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолное", true, true, true, false,
				false);
		ConversionModuleAnalyzerUtils.addEvents(true, false, false, false, objectRule);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиШапкаТЧ", true, true, true, false,
				false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("МинимальноеПКООтправки", false, false, true,
				false, false);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиДвеТЧ", true, true, true, false,
				false);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиШапка", true, true, true, false,
				false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиСобытие1", false, false, true, false,
				false);
		ConversionModuleAnalyzerUtils.addEvents(true, false, false, false, objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиТЧ", true, true, true, false, false);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("МинимальноеПКООтправкиПолучения", false, false,
				true, true, false);
		objectRules.add(objectRule);

		String report2 = ConversionModuleAnalyzer.getModuleText(conversionModule, "Тестирование",
				LocalDateTime.of(1, 1, 1, 0, 0, 0));

		assertEquals("Модуль обмена V2: запись модуля", report1, report2);
	}
}
