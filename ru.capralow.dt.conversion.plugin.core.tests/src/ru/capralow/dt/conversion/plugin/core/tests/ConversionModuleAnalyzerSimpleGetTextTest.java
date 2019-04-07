package ru.capralow.dt.conversion.plugin.core.tests;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import ru.capralow.dt.conversion.plugin.core.ConversionModuleAnalyzer;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant;
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

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("МинимальноеПКООтправки", false, false, true,
				false, false);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиДвеТЧ", true, true, true, false,
				false);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиОбъектКонфигурации", true, false,
				true, false, false);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиОбъектКонфигурацииСПолями", true,
				false, true, false, false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиОбъектКонфигурацииФормата", true,
				true, true, false, false);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиОбъектКонфигурацииФорматаСПолями",
				true, true, true, false, false);
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
		ConversionModuleAnalyzerUtils.addEvents(true, false, false, false, objectRule,
				conversionModule.getAlgorithms());
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиСобытие1", false, false, true, false,
				false);
		ConversionModuleAnalyzerUtils.addEvents(true, false, false, false, objectRule,
				conversionModule.getAlgorithms());
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиТЧ", true, true, true, false, false);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиШапка", true, true, true, false,
				false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиШапкаТЧ", true, true, true, false,
				false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("МинимальноеПКОПолучения", false, false, false,
				true, false);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("МинимальноеПКОПолученияДляГруппы", false, false,
				false, true, true);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияДвеТЧ", true, true, false, true,
				false);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияИдентификация1СПолями", true, false,
				false, true, false);
		ConversionModuleAnalyzerUtils.addIdentificationFields2(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияИдентификация2", false, false,
				false, true, false);
		objectRule.setIdentificationVariant(CmIdentificationVariant.SEARCH_FIELDS);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияИдентификация2СПолями", false,
				false, false, true, false);
		objectRule.setIdentificationVariant(CmIdentificationVariant.SEARCH_FIELDS);
		ConversionModuleAnalyzerUtils.addIdentificationFields1(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияИдентификация3", false, false,
				false, true, false);
		objectRule.setIdentificationVariant(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияИдентификация3СПолями", true, false,
				false, true, false);
		objectRule.setIdentificationVariant(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS);
		ConversionModuleAnalyzerUtils.addIdentificationFields2(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияОбъектКонфигурации", true, false,
				false, true, false);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияОбъектКонфигурацииСПолями", true,
				false, false, true, false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияОбъектКонфигурацииФормата", true,
				true, false, true, false);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияОбъектКонфигурацииФорматаСПолями",
				true, true, false, true, false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияОбъектФормата", false, true, false,
				true, false);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияОбъектФорматаСПолями", false, true,
				false, true, false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияПолное", true, true, false, true,
				true);
		ConversionModuleAnalyzerUtils.addEvents(false, true, true, true, objectRule, conversionModule.getAlgorithms());
		conversionModule.getAlgorithms().add(objectRule.getAfterReceivingAlgorithm());
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);
		ConversionModuleAnalyzerUtils.addIdentificationFields2(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияСобытие1", false, false, false,
				true, false);
		ConversionModuleAnalyzerUtils.addEvents(false, true, false, false, objectRule,
				conversionModule.getAlgorithms());
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияСобытие12", false, false, false,
				true, false);
		ConversionModuleAnalyzerUtils.addEvents(false, true, true, false, objectRule, conversionModule.getAlgorithms());
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияСобытие13", false, false, false,
				true, false);
		ConversionModuleAnalyzerUtils.addEvents(false, true, false, true, objectRule, conversionModule.getAlgorithms());
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияСобытие2", false, false, false,
				true, false);
		ConversionModuleAnalyzerUtils.addEvents(false, false, true, false, objectRule,
				conversionModule.getAlgorithms());
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияСобытие23", false, false, false,
				true, false);
		ConversionModuleAnalyzerUtils.addEvents(false, false, true, true, objectRule, conversionModule.getAlgorithms());
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияСобытие3", false, false, false,
				true, false);
		ConversionModuleAnalyzerUtils.addEvents(false, false, false, true, objectRule,
				conversionModule.getAlgorithms());
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияТЧ", true, true, false, true,
				false);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияШапка", true, true, false, true,
				false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияШапкаТЧ", true, true, false, true,
				false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("МинимальноеПКООтправкиПолучения", false, false,
				true, true, false);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияДвеТЧ", true, true, true,
				true, false);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияПолное", true, true, true,
				true, true);
		ConversionModuleAnalyzerUtils.addEvents(true, true, true, true, objectRule, conversionModule.getAlgorithms());
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);
		ConversionModuleAnalyzerUtils.addIdentificationFields2(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияСобытие1", false, false,
				true, true, false);
		ConversionModuleAnalyzerUtils.addEvents(true, false, false, false, objectRule,
				conversionModule.getAlgorithms());
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияСобытие12", false, false,
				true, true, false);
		ConversionModuleAnalyzerUtils.addEvents(true, true, false, false, objectRule, conversionModule.getAlgorithms());
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияСобытие123", false, false,
				true, true, false);
		ConversionModuleAnalyzerUtils.addEvents(true, true, true, false, objectRule, conversionModule.getAlgorithms());
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияСобытие124", false, false,
				true, true, false);
		ConversionModuleAnalyzerUtils.addEvents(true, true, false, true, objectRule, conversionModule.getAlgorithms());
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияСобытие13", false, false,
				true, true, false);
		ConversionModuleAnalyzerUtils.addEvents(true, false, true, false, objectRule, conversionModule.getAlgorithms());
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияСобытие134", false, false,
				true, true, false);
		ConversionModuleAnalyzerUtils.addEvents(true, false, true, true, objectRule, conversionModule.getAlgorithms());
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияСобытие14", false, false,
				true, true, false);
		ConversionModuleAnalyzerUtils.addEvents(true, false, false, true, objectRule, conversionModule.getAlgorithms());
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияТЧ", true, true, true, true,
				false);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияШапка", true, true, true,
				true, false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		objectRules.add(objectRule);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияШапкаТЧ", true, true, true,
				true, false);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		objectRules.add(objectRule);

		String report2 = ConversionModuleAnalyzer.getModuleText(conversionModule, "Тестирование",
				LocalDateTime.of(1, 1, 1, 0, 0, 0));

		assertEquals("Модуль обмена V2: запись модуля", report1, report2);
	}
}
