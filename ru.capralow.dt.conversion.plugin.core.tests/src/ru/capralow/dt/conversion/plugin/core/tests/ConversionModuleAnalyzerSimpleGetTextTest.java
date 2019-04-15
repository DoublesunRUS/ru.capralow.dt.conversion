package ru.capralow.dt.conversion.plugin.core.tests;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import ru.capralow.dt.conversion.plugin.core.ConversionModuleAnalyzer;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined;
import ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmFactory;

public class ConversionModuleAnalyzerSimpleGetTextTest {
	@Test
	public void testBothV2() {
		testBoth("2");
	}

	@Test
	public void testDoubleReceivingV2() {
		testDoubleReceiving("2");
	}

	@Test
	public void testDoubleSendingV2() {
		testDoubleSending("2");
	}

	// @Test
	public void testEmptyV1() {
		testEmpty("1");
	}

	@Test
	public void testEmptyV2() {
		testEmpty("2");
	}

	@Test
	public void testFullV2() {
		testFull("2");
	}

	@Test
	public void testReceivingV2() {
		testReceiving("2");
	}

	@Test
	public void testSendingV2() {
		testSending("2");
	}

	private void addMinimalBothRules(ConversionModule conversionModule) {
		ConversionModuleAnalyzerUtils.addFilledObjectRule("МинимальноеПКООтправкиПолучения",
				false,
				false,
				true,
				true,
				false,
				conversionModule.getObjectRules());
		ConversionModuleAnalyzerUtils.addFilledPredefined("МинимальноеПКПДОтправкиПолучения",
				false,
				true,
				true,
				conversionModule.getPredefineds());
	}

	private void addMinimalReceivingRules(ConversionModule conversionModule) {
		ConversionModuleAnalyzerUtils.addFilledDataRule("МинимальныйПОДПолучения",
				false,
				false,
				false,
				true,
				false,
				conversionModule.getDataRules());
		ConversionModuleAnalyzerUtils.addFilledObjectRule("МинимальноеПКПДПолучения",
				false,
				false,
				false,
				false,
				true,
				conversionModule.getObjectRules());
		ConversionModuleAnalyzerUtils.addFilledObjectRule("МинимальноеПКОПолучения",
				false,
				false,
				false,
				true,
				false,
				conversionModule.getObjectRules());
		ConversionModuleAnalyzerUtils.addFilledObjectRule("МинимальноеПКОПолученияДляГруппы",
				false,
				false,
				false,
				true,
				true,
				conversionModule.getObjectRules());

		ConversionModuleAnalyzerUtils
				.addFilledPredefined("МинимальноеПКПДПолучения", false, false, true, conversionModule.getPredefineds());

	}

	private void addMinimalSendingRules(ConversionModule conversionModule) {
		ConversionModuleAnalyzerUtils.addFilledDataRule("МинимальныйПОДОтправки",
				false,
				false,
				true,
				false,
				false,
				conversionModule.getDataRules());
		ConversionModuleAnalyzerUtils.addFilledObjectRule("МинимальноеПКООтправки",
				false,
				false,
				true,
				false,
				true,
				conversionModule.getObjectRules());
		ConversionModuleAnalyzerUtils
				.addFilledPredefined("МинимальноеПКПДОтправки", false, true, false, conversionModule.getPredefineds());

	}

	private void testBoth(String version) {
		String moduleName = "ОтправкаИПолучение".concat(version);

		String report1 = ConversionModuleAnalyzerUtils.getModuleText("", moduleName);

		ConversionModule conversionModule = cmFactory.eINSTANCE.createConversionModule();
		conversionModule.setStoreVersion(version);

		addMinimalBothRules(conversionModule);
		ConversionModuleAnalyzerUtils.addFilledDataRule("МинимальныйПОДОтправки",
				false,
				false,
				true,
				false,
				false,
				conversionModule.getDataRules());
		ConversionModuleAnalyzerUtils.addFilledDataRule("МинимальныйПОДПолучения",
				false,
				false,
				false,
				true,
				false,
				conversionModule.getDataRules());

		String report2 = ConversionModuleAnalyzer
				.getModuleText(conversionModule, "ОтправкаИПолучение", LocalDateTime.of(1, 1, 1, 0, 0, 0));

		assertEquals(String.format("Модуль обмена V%1$s: запись минимального модуля отправки и получения", version),
				report1,
				report2);
	}

	private void testDoubleReceiving(String version) {
		String moduleName = "ДвойноеПолучение".concat(version);

		String report1 = ConversionModuleAnalyzerUtils.getModuleText("", moduleName);

		ConversionModule conversionModule = cmFactory.eINSTANCE.createConversionModule();
		conversionModule.setStoreVersion(version);

		addMinimalReceivingRules(conversionModule);
		addMinimalBothRules(conversionModule);

		String report2 = ConversionModuleAnalyzer
				.getModuleText(conversionModule, "ДвойноеПолучение", LocalDateTime.of(1, 1, 1, 0, 0, 0));

		assertEquals(String.format("Модуль обмена V%1$s: запись минимального модуля получения с отправкой", version),
				report1,
				report2);
	}

	private void testDoubleSending(String version) {
		String moduleName = "ДвойнаяОтправка".concat(version);

		String report1 = ConversionModuleAnalyzerUtils.getModuleText("", moduleName);

		ConversionModule conversionModule = cmFactory.eINSTANCE.createConversionModule();
		conversionModule.setStoreVersion(version);

		addMinimalSendingRules(conversionModule);
		addMinimalBothRules(conversionModule);

		String report2 = ConversionModuleAnalyzer
				.getModuleText(conversionModule, "ДвойнаяОтправка", LocalDateTime.of(1, 1, 1, 0, 0, 0));

		assertEquals(String.format("Модуль обмена V%1$s: запись минимального модуля отправки с получением", version),
				report1,
				report2);
	}

	private void testEmpty(String version) {
		String moduleName = "ПустаяВерсия".concat(version);

		String report1 = ConversionModuleAnalyzerUtils.getModuleText("", moduleName);

		ConversionModule conversionModule = cmFactory.eINSTANCE.createConversionModule();
		conversionModule.setStoreVersion(version);

		String report2 = ConversionModuleAnalyzer
				.getModuleText(conversionModule, "ПустаяКонвертация", LocalDateTime.of(1, 1, 1, 0, 0, 0));

		assertEquals(String.format("Модуль обмена V%1$s: запись пустого модуля", version), report1, report2);
	}

	private void testFull(String version) {
		String moduleName = "Версия".concat(version);

		String report1 = ConversionModuleAnalyzerUtils.getModuleText("", moduleName);

		ConversionModule conversionModule = cmFactory.eINSTANCE.createConversionModule();
		conversionModule.setStoreVersion(version);

		conversionModule.setBeforeConvertationEvent("	ПередКонвертацией();");
		conversionModule.setBeforeFillingEvent("	ПередОтложеннымЗаполнением();");
		conversionModule.setAfterConvertationEvent("	ПослеКонвертации();");

		addMinimalSendingRules(conversionModule);
		addMinimalReceivingRules(conversionModule);
		addMinimalBothRules(conversionModule);

		EList<CmDataRule> dataRules = conversionModule.getDataRules();
		CmDataRule dataRule;

		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиПроизвольноеБезПравил", false, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils.addFilledDataRule("ПОДОтправкиПроизвольноеНесколькоПравил",
				false,
				false,
				true,
				false,
				false,
				dataRules);
		ConversionModuleAnalyzerUtils.addFilledDataRule("ПОДОтправкиПроизвольноеНесколькоПравилИОчистка",
				false,
				false,
				true,
				false,
				false,
				dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиПроизвольноеОдноПравило", false, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиПроизвольноеПолное", false, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиПроизвольноеСобытие1", false, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиПроизвольноеСобытие12", false, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиПроизвольноеСобытие2", false, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиСтандартноеБезПравил", false, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils.addFilledDataRule("ПОДОтправкиСтандартноеНесколькоПравил",
				false,
				false,
				true,
				false,
				false,
				dataRules);
		ConversionModuleAnalyzerUtils.addFilledDataRule("ПОДОтправкиСтандартноеНесколькоПравилИОчистка",
				false,
				false,
				true,
				false,
				false,
				dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиСтандартноеОдноПравило", false, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиСтандартноеПолное", false, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиСтандартноеСобытие1", false, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиСтандартноеСобытие12", false, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиСтандартноеСобытие2", false, false, true, false, false, dataRules);

		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДПолученияПроизвольноеБезПравил", false, false, false, true, false, dataRules);
		ConversionModuleAnalyzerUtils.addFilledDataRule("ПОДПолученияПроизвольноеНесколькоПравил",
				false,
				false,
				false,
				true,
				false,
				dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДПолученияПроизвольноеОдноПравило", false, false, false, true, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДПолученияПроизвольноеПолное", false, false, false, true, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДПолученияПроизвольноеСобытие1", false, false, false, true, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДПолученияСтандартноеБезПравил", false, false, false, true, false, dataRules);
		ConversionModuleAnalyzerUtils.addFilledDataRule("ПОДПолученияСтандартноеНесколькоПравил",
				false,
				false,
				false,
				true,
				false,
				dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДПолученияСтандартноеОдноПравило", false, false, false, true, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДПолученияСтандартноеПолное", false, false, false, true, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДПолученияСтандартноеСобытие1", false, false, false, true, false, dataRules);

		EList<CmObjectRule> objectRules = conversionModule.getObjectRules();
		CmObjectRule objectRule;

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиДвеТЧ", true, true, true, false, false, objectRules);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);

		ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиОбъектКонфигурации", true, false, true, false, false, objectRules);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиОбъектКонфигурацииСПолями",
				true,
				false,
				true,
				false,
				false,
				objectRules);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);

		ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиОбъектКонфигурацииФормата",
				true,
				true,
				true,
				false,
				false,
				objectRules);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиОбъектКонфигурацииФорматаСПолями",
				true,
				true,
				true,
				false,
				false,
				objectRules);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);

		ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиОбъектФормата", false, true, true, false, false, objectRules);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиОбъектФорматаСПолями", false, true, true, false, false, objectRules);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолное", true, true, true, false, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addEvents(true, false, false, false, objectRule, conversionModule.getAlgorithms());
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиСобытие1", false, false, true, false, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addEvents(true, false, false, false, objectRule, conversionModule.getAlgorithms());

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиТЧ", true, true, true, false, false, objectRules);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиШапка", true, true, true, false, false, objectRules);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиШапкаТЧ", true, true, true, false, false, objectRules);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияДвеТЧ", true, true, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияИдентификация1СПолями", true, false, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addIdentificationFields2(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияИдентификация2", false, false, false, true, false, objectRules);
		objectRule.setIdentificationVariant(CmIdentificationVariant.SEARCH_FIELDS);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияИдентификация2СПолями",
				false,
				false,
				false,
				true,
				false,
				objectRules);
		objectRule.setIdentificationVariant(CmIdentificationVariant.SEARCH_FIELDS);
		ConversionModuleAnalyzerUtils.addIdentificationFields1(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияИдентификация3", false, false, false, true, false, objectRules);
		objectRule.setIdentificationVariant(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияИдентификация3СПолями", true, false, false, true, false, objectRules);
		objectRule.setIdentificationVariant(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS);
		ConversionModuleAnalyzerUtils.addIdentificationFields2(objectRule);

		ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияОбъектКонфигурации", true, false, false, true, false, objectRules);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияОбъектКонфигурацииСПолями",
				true,
				false,
				false,
				true,
				false,
				objectRules);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);

		ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияОбъектКонфигурацииФормата",
				true,
				true,
				false,
				true,
				false,
				objectRules);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияОбъектКонфигурацииФорматаСПолями",
				true,
				true,
				false,
				true,
				false,
				objectRules);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);

		ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияОбъектФормата", false, true, false, true, false, objectRules);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияОбъектФорматаСПолями", false, true, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияПолное", true, true, false, true, true, objectRules);
		ConversionModuleAnalyzerUtils.addEvents(false, true, true, true, objectRule, conversionModule.getAlgorithms());
		conversionModule.getAlgorithms().add(objectRule.getAfterReceivingAlgorithm());
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);
		ConversionModuleAnalyzerUtils.addIdentificationFields2(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияСобытие1", false, false, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addEvents(false, true, false, false, objectRule, conversionModule.getAlgorithms());

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияСобытие12", false, false, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addEvents(false, true, true, false, objectRule, conversionModule.getAlgorithms());

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияСобытие13", false, false, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addEvents(false, true, false, true, objectRule, conversionModule.getAlgorithms());

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияСобытие2", false, false, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addEvents(false, false, true, false, objectRule, conversionModule.getAlgorithms());

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияСобытие23", false, false, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addEvents(false, false, true, true, objectRule, conversionModule.getAlgorithms());

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияСобытие3", false, false, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addEvents(false, false, false, true, objectRule, conversionModule.getAlgorithms());

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияТЧ", true, true, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияШапка", true, true, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияШапкаТЧ", true, true, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияДвеТЧ", true, true, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияПолное", true, true, true, true, true, objectRules);
		ConversionModuleAnalyzerUtils.addEvents(true, true, true, true, objectRule, conversionModule.getAlgorithms());
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);
		ConversionModuleAnalyzerUtils.addIdentificationFields2(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияСобытие1", false, false, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils
				.addEvents(true, false, false, false, objectRule, conversionModule.getAlgorithms());

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияСобытие12", false, false, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addEvents(true, true, false, false, objectRule, conversionModule.getAlgorithms());

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияСобытие123", false, false, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addEvents(true, true, true, false, objectRule, conversionModule.getAlgorithms());

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияСобытие124", false, false, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addEvents(true, true, false, true, objectRule, conversionModule.getAlgorithms());

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияСобытие13", false, false, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addEvents(true, false, true, false, objectRule, conversionModule.getAlgorithms());

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияСобытие134", false, false, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addEvents(true, false, true, true, objectRule, conversionModule.getAlgorithms());

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияСобытие14", false, false, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addEvents(true, false, false, true, objectRule, conversionModule.getAlgorithms());

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияТЧ", true, true, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияШапка", true, true, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияШапкаТЧ", true, true, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);

		EList<CmPredefined> predefineds = conversionModule.getPredefineds();
		CmPredefined predefined;

		predefined = ConversionModuleAnalyzerUtils
				.addFilledPredefined("ПКПДОтправкиНесколькоПолей", true, true, false, predefineds);
		ConversionModuleAnalyzerUtils.addPredefinedValue1(predefined);
		ConversionModuleAnalyzerUtils.addPredefinedValue2(predefined);

		predefined = ConversionModuleAnalyzerUtils
				.addFilledPredefined("ПКПДОтправкиОдноПоле", true, true, false, predefineds);
		ConversionModuleAnalyzerUtils.addPredefinedValue1(predefined);

		predefined = ConversionModuleAnalyzerUtils
				.addFilledPredefined("ПКПДПолученияНесколькоПолей", true, false, true, predefineds);
		ConversionModuleAnalyzerUtils.addPredefinedValue1(predefined);
		ConversionModuleAnalyzerUtils.addPredefinedValue2(predefined);

		predefined = ConversionModuleAnalyzerUtils
				.addFilledPredefined("ПКПДПолученияОдноПоле", true, false, true, predefineds);
		ConversionModuleAnalyzerUtils.addPredefinedValue1(predefined);

		predefined = ConversionModuleAnalyzerUtils
				.addFilledPredefined("ПКПДОтправкиПолученияНесколькоПолей", true, true, true, predefineds);
		ConversionModuleAnalyzerUtils.addPredefinedValue1(predefined);
		ConversionModuleAnalyzerUtils.addPredefinedValue2(predefined);

		predefined = ConversionModuleAnalyzerUtils
				.addFilledPredefined("ПКПДОтправкиПолученияОдноПоле", true, true, true, predefineds);
		ConversionModuleAnalyzerUtils.addPredefinedValue1(predefined);

		conversionModule.getParams().add("Параметр1");
		conversionModule.getParams().add("Параметр2");
		conversionModule.getParams().add("Параметр3");

		String report2 = ConversionModuleAnalyzer
				.getModuleText(conversionModule, "Тестирование", LocalDateTime.of(1, 1, 1, 0, 0, 0));

		assertEquals(String.format("Модуль обмена V%1$s: запись полного модуля", version), report1, report2);
	}

	private void testReceiving(String version) {
		String moduleName = "ТолькоПолучение".concat(version);

		String report1 = ConversionModuleAnalyzerUtils.getModuleText("", moduleName);

		ConversionModule conversionModule = cmFactory.eINSTANCE.createConversionModule();
		conversionModule.setStoreVersion(version);

		addMinimalReceivingRules(conversionModule);

		String report2 = ConversionModuleAnalyzer
				.getModuleText(conversionModule, "ТолькоПолучение", LocalDateTime.of(1, 1, 1, 0, 0, 0));

		assertEquals(String.format("Модуль обмена V%1$s: запись минимального модуля получения", version),
				report1,
				report2);
	}

	private void testSending(String version) {
		String moduleName = "ТолькоОтправка".concat(version);

		String report1 = ConversionModuleAnalyzerUtils.getModuleText("", moduleName);

		ConversionModule conversionModule = cmFactory.eINSTANCE.createConversionModule();
		conversionModule.setStoreVersion(version);

		addMinimalSendingRules(conversionModule);

		String report2 = ConversionModuleAnalyzer
				.getModuleText(conversionModule, "ТолькоОтправка", LocalDateTime.of(1, 1, 1, 0, 0, 0));

		assertEquals(String.format("Модуль обмена V%1$s: запись минимального модуля отправки", version),
				report1,
				report2);
	}
}
