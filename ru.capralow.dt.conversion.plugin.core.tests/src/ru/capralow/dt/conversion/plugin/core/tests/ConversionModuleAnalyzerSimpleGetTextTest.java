package ru.capralow.dt.conversion.plugin.core.tests;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import ru.capralow.dt.conversion.plugin.core.ConversionModuleAnalyzer;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined;
import ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmFactory;

public class ConversionModuleAnalyzerSimpleGetTextTest {
	private static final String ALGORITHM_BODY_TEXT = "	Сообщить(\"%1$s\");";

	private static final String ALGORITHM_NAME_3PARAMS_DIRECT = "ПослеЗагрузкиВсехДанныхТриПараметраПрямойПорядок";
	private static final String ALGORITHM_3PARAMS_DIRECT = "Объект, КомпонентыОбмена, ОбъектМодифицирован";

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
	public void testSendingOrReceivingV2() {
		testSendingOrReceiving("2");
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
		EList<CmAlgorithm> algorithms = conversionModule.getAlgorithms();
		CmDataRule dataRule;

		final String sendingObjectRuleName = "ПКООтправкиПолное";
		final String[] sendingObjectRule = new String[] {
				sendingObjectRuleName,
				"ПКООтправкиОбъектКонфигурацииФорматаСПолями" };

		final String receivingObjectRuleName = "ПКОПолученияПолное";
		final String[] receivingObjectRule = new String[] { receivingObjectRuleName, "ПКООтправкиПолученияПолное" };

		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиПроизвольноеБезПравил", false, false, true, false, false, dataRules);

		dataRule = ConversionModuleAnalyzerUtils.addFilledDataRule("ПОДОтправкиПроизвольноеНесколькоПравил",
				false,
				false,
				true,
				false,
				false,
				dataRules);
		ConversionModuleAnalyzerUtils.addObjectRulesToDataRule(dataRule, conversionModule, sendingObjectRule);

		dataRule = ConversionModuleAnalyzerUtils.addFilledDataRule("ПОДОтправкиПроизвольноеНесколькоПравилИОчистка",
				false,
				false,
				true,
				false,
				true,
				dataRules);
		ConversionModuleAnalyzerUtils.addObjectRulesToDataRule(dataRule, conversionModule, sendingObjectRule);

		dataRule = ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиПроизвольноеОдноПравило", false, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addObjectRulesToDataRule(dataRule, conversionModule, new String[] { sendingObjectRuleName });

		dataRule = ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиПроизвольноеПолное", false, false, true, false, true, dataRules);
		ConversionModuleAnalyzerUtils.addObjectRulesToDataRule(dataRule, conversionModule, sendingObjectRule);
		ConversionModuleAnalyzerUtils.addODataRuleEvents(true, true, dataRule);

		dataRule = ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиПроизвольноеСобытие1", false, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils.addODataRuleEvents(true, false, dataRule);

		dataRule = ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиПроизвольноеСобытие12", false, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils.addODataRuleEvents(true, true, dataRule);

		dataRule = ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиПроизвольноеСобытие2", false, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils.addODataRuleEvents(false, true, dataRule);

		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиСтандартноеБезПравил", true, false, true, false, false, dataRules);

		dataRule = ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиСтандартноеНесколькоПравил", true, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils.addObjectRulesToDataRule(dataRule, conversionModule, sendingObjectRule);

		dataRule = ConversionModuleAnalyzerUtils.addFilledDataRule("ПОДОтправкиСтандартноеНесколькоПравилИОчистка",
				true,
				false,
				true,
				false,
				true,
				dataRules);
		ConversionModuleAnalyzerUtils.addObjectRulesToDataRule(dataRule, conversionModule, sendingObjectRule);

		dataRule = ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиСтандартноеОдноПравило", true, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addObjectRulesToDataRule(dataRule, conversionModule, new String[] { sendingObjectRuleName });

		dataRule = ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиСтандартноеПолное", true, false, true, false, true, dataRules);
		ConversionModuleAnalyzerUtils.addObjectRulesToDataRule(dataRule, conversionModule, sendingObjectRule);
		ConversionModuleAnalyzerUtils.addODataRuleEvents(true, true, dataRule);

		dataRule = ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиСтандартноеСобытие1", true, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils.addODataRuleEvents(true, false, dataRule);

		dataRule = ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиСтандартноеСобытие12", true, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils.addODataRuleEvents(true, true, dataRule);

		dataRule = ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДОтправкиСтандартноеСобытие2", true, false, true, false, false, dataRules);
		ConversionModuleAnalyzerUtils.addODataRuleEvents(false, true, dataRule);

		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДПолученияПроизвольноеБезПравил", false, false, false, true, false, dataRules);

		dataRule = ConversionModuleAnalyzerUtils.addFilledDataRule("ПОДПолученияПроизвольноеНесколькоПравил",
				false,
				false,
				false,
				true,
				false,
				dataRules);
		ConversionModuleAnalyzerUtils.addObjectRulesToDataRule(dataRule, conversionModule, receivingObjectRule);

		dataRule = ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДПолученияПроизвольноеОдноПравило", false, false, false, true, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addObjectRulesToDataRule(dataRule, conversionModule, new String[] { receivingObjectRuleName });

		dataRule = ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДПолученияПроизвольноеПолное", false, false, false, true, false, dataRules);
		ConversionModuleAnalyzerUtils.addObjectRulesToDataRule(dataRule, conversionModule, receivingObjectRule);
		ConversionModuleAnalyzerUtils.addODataRuleEvents(true, false, dataRule);

		dataRule = ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДПолученияПроизвольноеСобытие1", false, false, false, true, false, dataRules);
		ConversionModuleAnalyzerUtils.addODataRuleEvents(true, false, dataRule);

		ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДПолученияСтандартноеБезПравил", false, true, false, true, false, dataRules);

		dataRule = ConversionModuleAnalyzerUtils.addFilledDataRule("ПОДПолученияСтандартноеНесколькоПравил",
				false,
				true,
				false,
				true,
				false,
				dataRules);
		ConversionModuleAnalyzerUtils.addObjectRulesToDataRule(dataRule, conversionModule, receivingObjectRule);

		dataRule = ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДПолученияСтандартноеОдноПравило", false, true, false, true, false, dataRules);
		ConversionModuleAnalyzerUtils
				.addObjectRulesToDataRule(dataRule, conversionModule, new String[] { receivingObjectRuleName });

		dataRule = ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДПолученияСтандартноеПолное", false, true, false, true, false, dataRules);
		ConversionModuleAnalyzerUtils.addObjectRulesToDataRule(dataRule, conversionModule, receivingObjectRule);
		ConversionModuleAnalyzerUtils.addODataRuleEvents(true, false, dataRule);

		dataRule = ConversionModuleAnalyzerUtils
				.addFilledDataRule("ПОДПолученияСтандартноеСобытие1", false, true, false, true, false, dataRules);
		ConversionModuleAnalyzerUtils.addODataRuleEvents(true, false, dataRule);

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
		ConversionModuleAnalyzerUtils.sortAttributes(objectRule);

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
		ConversionModuleAnalyzerUtils.sortAttributes(objectRule);

		ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиОбъектФормата", false, true, true, false, false, objectRules);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиОбъектФорматаСПолями", false, true, true, false, false, objectRules);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.sortAttributes(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule(sendingObjectRuleName, true, true, true, false, false, objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(true, false, false, "", "", objectRule, algorithms);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);
		ConversionModuleAnalyzerUtils.sortAttributes(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиСобытие1", false, false, true, false, false, objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(true, false, false, "", "", objectRule, algorithms);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиТЧ", true, true, true, false, false, objectRules);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.sortAttributes(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиШапка", true, true, true, false, false, objectRules);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.sortAttributes(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиШапкаТЧ", true, true, true, false, false, objectRules);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.sortAttributes(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияДвеТЧ", true, true, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);
		ConversionModuleAnalyzerUtils.sortAttributes(objectRule);

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
		ConversionModuleAnalyzerUtils.sortAttributes(objectRule);

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
		ConversionModuleAnalyzerUtils.sortAttributes(objectRule);

		ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияОбъектФормата", false, true, false, true, false, objectRules);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияОбъектФорматаСПолями", false, true, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.sortAttributes(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule(receivingObjectRuleName, true, true, false, true, true, objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(false,
				true,
				true,
				ALGORITHM_NAME_3PARAMS_DIRECT,
				ALGORITHM_3PARAMS_DIRECT,
				objectRule,
				algorithms);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);
		ConversionModuleAnalyzerUtils.addIdentificationFields2(objectRule);
		ConversionModuleAnalyzerUtils.sortAttributes(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияСобытие1", false, false, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(false, true, false, "", "", objectRule, algorithms);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияСобытие12", false, false, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(false, true, true, "", "", objectRule, algorithms);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияСобытие13", false, false, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(false,
				true,
				false,
				ALGORITHM_NAME_3PARAMS_DIRECT,
				ALGORITHM_3PARAMS_DIRECT,
				objectRule,
				algorithms);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияСобытие2", false, false, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(false, false, true, "", "", objectRule, algorithms);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияСобытие23", false, false, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(false,
				false,
				true,
				ALGORITHM_NAME_3PARAMS_DIRECT,
				ALGORITHM_3PARAMS_DIRECT,
				objectRule,
				algorithms);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияСобытиеАлгоритмДваОбратный",
				false,
				false,
				false,
				true,
				false,
				objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(false,
				false,
				false,
				"ПослеЗагрузкиВсехДанныхДваПараметраОбратныйПорядок",
				"КомпонентыОбмена, Объект",
				objectRule,
				algorithms);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияСобытиеАлгоритмДваПрямой",
				false,
				false,
				false,
				true,
				false,
				objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(false,
				false,
				false,
				"ПослеЗагрузкиВсехДанныхДваПараметраПрямойПорядок",
				"Объект, КомпонентыОбмена",
				objectRule,
				algorithms);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияСобытиеАлгоритмНесуществующий",
				false,
				false,
				false,
				true,
				false,
				objectRules);
		ConversionModuleAnalyzerUtils
				.addObjectRuleEvents(false, false, false, "НесуществующийАлгоритм", "", objectRule, null);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияСобытиеАлгоритмТриОбратный",
				false,
				false,
				false,
				true,
				false,
				objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(false,
				false,
				false,
				"ПослеЗагрузкиВсехДанныхТриПараметраОбратныйПорядок",
				"ОбъектМодифицирован, КомпонентыОбмена, Объект",
				objectRule,
				algorithms);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКОПолученияСобытиеАлгоритмТриПрямой",
				false,
				false,
				false,
				true,
				false,
				objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(false,
				false,
				false,
				ALGORITHM_NAME_3PARAMS_DIRECT,
				ALGORITHM_3PARAMS_DIRECT,
				objectRule,
				algorithms);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияТЧ", true, true, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.sortAttributes(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияШапка", true, true, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.sortAttributes(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКОПолученияШапкаТЧ", true, true, false, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.sortAttributes(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияДвеТЧ", true, true, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);
		ConversionModuleAnalyzerUtils.sortAttributes(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияПолное", true, true, true, true, true, objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(true,
				true,
				true,
				ALGORITHM_NAME_3PARAMS_DIRECT,
				ALGORITHM_3PARAMS_DIRECT,
				objectRule,
				algorithms);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection2(objectRule);
		ConversionModuleAnalyzerUtils.addIdentificationFields2(objectRule);
		ConversionModuleAnalyzerUtils.sortAttributes(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияСобытие1", false, false, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(true, false, false, "", "", objectRule, algorithms);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияСобытие12", false, false, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(true, true, false, "", "", objectRule, algorithms);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияСобытие123", false, false, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(true, true, true, "", "", objectRule, algorithms);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияСобытие124", false, false, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(true,
				true,
				false,
				ALGORITHM_NAME_3PARAMS_DIRECT,
				ALGORITHM_3PARAMS_DIRECT,
				objectRule,
				algorithms);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияСобытие13", false, false, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(true, false, true, "", "", objectRule, algorithms);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияСобытие134", false, false, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(true,
				false,
				true,
				ALGORITHM_NAME_3PARAMS_DIRECT,
				ALGORITHM_3PARAMS_DIRECT,
				objectRule,
				algorithms);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияСобытие14", false, false, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(true,
				false,
				false,
				ALGORITHM_NAME_3PARAMS_DIRECT,
				ALGORITHM_3PARAMS_DIRECT,
				objectRule,
				algorithms);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияСобытиеАлгоритмДваОбратный",
				false,
				false,
				true,
				true,
				false,
				objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(false,
				false,
				false,
				"ПослеЗагрузкиВсехДанныхДваПараметраОбратныйПорядок",
				"КомпонентыОбмена, Объект",
				objectRule,
				algorithms);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияСобытиеАлгоритмДваПрямой",
				false,
				false,
				true,
				true,
				false,
				objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(false,
				false,
				false,
				"ПослеЗагрузкиВсехДанныхДваПараметраПрямойПорядок",
				"Объект, КомпонентыОбмена",
				objectRule,
				algorithms);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule(
				"ПКООтправкиПолученияСобытиеАлгоритмНесуществующий",
				false,
				false,
				true,
				true,
				false,
				objectRules);
		ConversionModuleAnalyzerUtils
				.addObjectRuleEvents(false, false, false, "НесуществующийАлгоритм", "", objectRule, null);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияСобытиеАлгоритмТриОбратный",
				false,
				false,
				true,
				true,
				false,
				objectRules);
		ConversionModuleAnalyzerUtils.addObjectRuleEvents(false,
				false,
				false,
				"ПослеЗагрузкиВсехДанныхТриПараметраОбратныйПорядок",
				"",
				objectRule,
				algorithms);

		objectRule = ConversionModuleAnalyzerUtils.addFilledObjectRule("ПКООтправкиПолученияСобытиеАлгоритмТриПрямой",
				false,
				false,
				true,
				true,
				false,
				objectRules);
		ConversionModuleAnalyzerUtils
				.addObjectRuleEvents(false, false, false, ALGORITHM_NAME_3PARAMS_DIRECT, "", objectRule, algorithms);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияТЧ", true, true, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.sortAttributes(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияШапка", true, true, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.sortAttributes(objectRule);

		objectRule = ConversionModuleAnalyzerUtils
				.addFilledObjectRule("ПКООтправкиПолученияШапкаТЧ", true, true, true, true, false, objectRules);
		ConversionModuleAnalyzerUtils.addHeader(objectRule);
		ConversionModuleAnalyzerUtils.addTabularSection1(objectRule);
		ConversionModuleAnalyzerUtils.sortAttributes(objectRule);

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

		final String param1 = "Параметр1";

		conversionModule.getParams().add(param1);
		conversionModule.getParams().add("Параметр2");
		conversionModule.getParams().add("Параметр3");

		ConversionModuleAnalyzerUtils.addAlgorithm("ПроцедураБезПараметров",
				"",
				String.format(ALGORITHM_BODY_TEXT, "ПроцедураБезПараметров"),
				CmMethodType.PROCEDURE,
				false,
				algorithms);
		ConversionModuleAnalyzerUtils.addAlgorithm("ПроцедураНесколькоПараметров",
				"Параметр1, Знач Параметр2, Параметр3",
				String.format(ALGORITHM_BODY_TEXT, "ПроцедураНесколькоПараметров"),
				CmMethodType.PROCEDURE,
				false,
				algorithms);
		ConversionModuleAnalyzerUtils.addAlgorithm("ПроцедураНесколькоПараметровСоЗначениями",
				"Параметр1 = Неопределено, Параметр2 = \"2\", Параметр3 = 3",
				String.format(ALGORITHM_BODY_TEXT, "ПроцедураНесколькоПараметровСоЗначениями"),
				CmMethodType.PROCEDURE,
				false,
				algorithms);
		ConversionModuleAnalyzerUtils.addAlgorithm("ПроцедураОдинПараметр",
				param1,
				String.format(ALGORITHM_BODY_TEXT, "ПроцедураОдинПараметр"),
				CmMethodType.PROCEDURE,
				false,
				algorithms);
		ConversionModuleAnalyzerUtils.addAlgorithm("ФункцияБезПараметров",
				"",
				String.format(ALGORITHM_BODY_TEXT, "ФункцияБезПараметров"),
				CmMethodType.FUNCTION,
				false,
				algorithms);
		ConversionModuleAnalyzerUtils.addAlgorithm("ФункцияНесколькоПараметров",
				"Параметр1, Знач Параметр2, Параметр3",
				String.format(ALGORITHM_BODY_TEXT, "ФункцияНесколькоПараметров"),
				CmMethodType.FUNCTION,
				false,
				algorithms);
		ConversionModuleAnalyzerUtils.addAlgorithm("ФункцияНесколькоПараметровСоЗначениями",
				"Параметр1 = Неопределено, Параметр2 = \"2\", Параметр3 = 3",
				String.format(ALGORITHM_BODY_TEXT, "ФункцияНесколькоПараметровСоЗначениями"),
				CmMethodType.FUNCTION,
				false,
				algorithms);
		ConversionModuleAnalyzerUtils.addAlgorithm("ФункцияОдинПараметр",
				param1,
				String.format(ALGORITHM_BODY_TEXT, "ФункцияОдинПараметр"),
				CmMethodType.FUNCTION,
				false,
				algorithms);
		ConversionModuleAnalyzerUtils.addAlgorithm("ЭкспортнаяПроцедураБезПараметров",
				"",
				String.format(ALGORITHM_BODY_TEXT, "ЭкспортнаяПроцедураБезПараметров"),
				CmMethodType.PROCEDURE,
				true,
				algorithms);
		ConversionModuleAnalyzerUtils.addAlgorithm("ЭкспортнаяФункцияБезПараметров",
				"",
				String.format(ALGORITHM_BODY_TEXT, "ЭкспортнаяФункцияБезПараметров"),
				CmMethodType.FUNCTION,
				true,
				algorithms);

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

	private void testSendingOrReceiving(String version) {
		String moduleName = "ОтправкаИлиПолучение".concat(version);

		String report1 = ConversionModuleAnalyzerUtils.getModuleText("", moduleName);

		ConversionModule conversionModule = cmFactory.eINSTANCE.createConversionModule();
		conversionModule.setStoreVersion(version);

		addMinimalSendingRules(conversionModule);
		addMinimalReceivingRules(conversionModule);

		String report2 = ConversionModuleAnalyzer
				.getModuleText(conversionModule, "ОтправкаИлиПолучение", LocalDateTime.of(1, 1, 1, 0, 0, 0));

		assertEquals(String.format("Модуль обмена V%1$s: запись минимального модуля отправки или получения", version),
				report1,
				report2);
	}
}
