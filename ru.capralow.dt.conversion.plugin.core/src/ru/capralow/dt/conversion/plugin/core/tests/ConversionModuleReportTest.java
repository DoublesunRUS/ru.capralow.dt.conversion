package ru.capralow.dt.conversion.plugin.core.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import com._1c.g5.v8.dt.xdto.model.Enumeration;
import com._1c.g5.v8.dt.xdto.model.XdtoFactory;

import ru.capralow.dt.conversion.plugin.core.ConversionModuleReport;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdDefinedType;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdType;
import ru.capralow.dt.conversion.plugin.core.ed.model.edFactory;

public class ConversionModuleReportTest {

	@Test
	public void testCreateIdentificationReport() {
		EList<String> fields0 = new BasicEList<String>();

		EList<String> fields1 = new BasicEList<String>();
		fields1.add("Реквизит1");

		EList<String> fields3 = new BasicEList<String>();
		fields3.add("Реквизит1,Реквизит2,Реквизит3");
		fields3.add("Реквизит1,Реквизит2");
		fields3.add("Реквизит1");

		String report1 = "";
		report1 += String.join(System.lineSeparator(), "**Вариант идентификации: По уникальному идентификатору**", "")
				+ System.lineSeparator();
		report1 += String.join(System.lineSeparator(), "**Вариант идентификации: По уникальному идентификатору**", "")
				+ System.lineSeparator();
		report1 += String.join(System.lineSeparator(), "**Вариант идентификации: По полям поиска**", "")
				+ System.lineSeparator();
		report1 += String.join(System.lineSeparator(), "**Вариант идентификации: По полям поиска**", "",
				"Порядок поиска по ключевым полям | Реквизиты поиска", "--- | ---", "1 | Реквизит1", "")
				+ System.lineSeparator();
		report1 += String.join(System.lineSeparator(), "**Вариант идентификации: По полям поиска**", "",
				"Порядок поиска по ключевым полям | Реквизиты поиска", "--- | ---", "1 | Реквизит1,Реквизит2,Реквизит3",
				"2 | Реквизит1,Реквизит2", "3 | Реквизит1", "") + System.lineSeparator();
		report1 += String.join(System.lineSeparator(), "**Вариант идентификации: По уникальному идентификатору**", "")
				+ System.lineSeparator();
		report1 += String.join(System.lineSeparator(),
				"**Вариант идентификации: Сначала по уникальному идентификатору потом по полям поиска**", "",
				"Порядок поиска по ключевым полям | Реквизиты поиска", "--- | ---", "1 | Реквизит1", "")
				+ System.lineSeparator();
		report1 += String.join(System.lineSeparator(),
				"**Вариант идентификации: Сначала по уникальному идентификатору потом по полям поиска**", "",
				"Порядок поиска по ключевым полям | Реквизиты поиска", "--- | ---", "1 | Реквизит1,Реквизит2,Реквизит3",
				"2 | Реквизит1,Реквизит2", "3 | Реквизит1", "");

		String report2 = "";
		report2 += ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.UUID, fields0)
				+ System.lineSeparator();
		report2 += ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.UUID, fields3)
				+ System.lineSeparator();
		report2 += ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.SEARCH_FIELDS, fields0)
				+ System.lineSeparator();
		report2 += ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.SEARCH_FIELDS, fields1)
				+ System.lineSeparator();
		report2 += ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.SEARCH_FIELDS, fields3)
				+ System.lineSeparator();
		report2 += ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS,
				fields0) + System.lineSeparator();
		report2 += ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS,
				fields1) + System.lineSeparator();
		report2 += ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS,
				fields3);

		assertEquals("Описание формата для полей поиска соответствует ожидаемому", report1, report2);
	}

	@Test
	public void testCreateEmptyDefinedTypesReport() {
		EList<EdDefinedType> edDefinedTypes = new BasicEList<EdDefinedType>();

		String report1 = "";

		String report2 = ConversionModuleReport.createDefinedTypesReport(edDefinedTypes);

		assertEquals("Описание формата для пустых определяемых типов соответствует ожидаемому", report1, report2);
	}

	@Test
	public void testCreateDefinedTypesReport() {
		EList<EdDefinedType> edDefinedTypes = new BasicEList<EdDefinedType>();

		EdDefinedType edDefinedType = edFactory.eINSTANCE.createEdDefinedType();
		edDefinedTypes.add(edDefinedType);
		edDefinedType.setName("Простой тип");
		EList<EdType> edTypes = edDefinedType.getTypes();
		EdType edType = edFactory.eINSTANCE.createEdType();
		edTypes.add(edType);
		edType.setName("ЦелоеЧисло");
		edType.setPropertyType("Число (целое)");

		edDefinedType = edFactory.eINSTANCE.createEdDefinedType();
		edDefinedTypes.add(edDefinedType);
		edDefinedType.setName("Составной тип");
		edTypes = edDefinedType.getTypes();
		edType = edFactory.eINSTANCE.createEdType();
		edTypes.add(edType);
		edType.setName("Дата");
		edType.setPropertyType("Дата (дата)");
		edType = edFactory.eINSTANCE.createEdType();
		edTypes.add(edType);
		edType.setName("СсылкаНаОбъект");
		edType.setPropertyType("ЛюбаяСсылка");
		edType = edFactory.eINSTANCE.createEdType();
		edTypes.add(edType);
		edType.setName("ДокументСсылка");
		edType.setPropertyType("КлючевыеСвойстваДокумент");
		edDefinedType = edFactory.eINSTANCE.createEdDefinedType();
		edDefinedTypes.add(edDefinedType);
		edDefinedType.setName("Простой тип");
		edTypes = edDefinedType.getTypes();
		edType = edFactory.eINSTANCE.createEdType();
		edTypes.add(edType);
		edType.setName("Дата");
		edType.setPropertyType("Число (целое)");

		String report1 = String.join(System.lineSeparator(), "### Определяемые типы", "", "Имя типа | Состав типа",
				"--- | ---", "Простой тип | Число (целое)", "Составной тип | ", " | Дата (дата)", " | ЛюбаяСсылка",
				" | КлючевыеСвойстваДокумент", "Простой тип | Число (целое)", "");

		String report2 = ConversionModuleReport.createDefinedTypesReport(edDefinedTypes);

		assertEquals("Описание формата для определяемых типов соответствует ожидаемому", report1, report2);
	}

	@Test
	public void testCreateEmptyEnumsReport() {
		EList<EdEnum> edEnums = new BasicEList<EdEnum>();

		String report1 = "";

		String report2 = ConversionModuleReport.createEnumsReport(edEnums);

		assertEquals("Описание формата для пустых перечислений соответствует ожидаемому", report1, report2);
	}

	@Test
	public void testCreateEnumsReport() {
		EList<EdEnum> edEnums = new BasicEList<EdEnum>();

		EdEnum epEnum = edFactory.eINSTANCE.createEdEnum();
		edEnums.add(epEnum);
		epEnum.setName("Перечисление1");
		EList<Enumeration> enumerations = epEnum.getEnumerations();
		Enumeration enumeration = XdtoFactory.eINSTANCE.createEnumeration();
		enumerations.add(enumeration);
		enumeration.setContent("Значение11");

		epEnum = edFactory.eINSTANCE.createEdEnum();
		edEnums.add(epEnum);
		epEnum.setName("Перечисление2");
		enumerations = epEnum.getEnumerations();
		enumeration = XdtoFactory.eINSTANCE.createEnumeration();
		enumerations.add(enumeration);
		enumeration.setContent("Значение21");
		enumeration = XdtoFactory.eINSTANCE.createEnumeration();
		enumerations.add(enumeration);
		enumeration.setContent("Значение22");
		enumeration = XdtoFactory.eINSTANCE.createEnumeration();
		enumerations.add(enumeration);
		enumeration.setContent("Значение23");
		enumeration = XdtoFactory.eINSTANCE.createEnumeration();
		enumerations.add(enumeration);
		enumeration.setContent("Значение24");

		epEnum = edFactory.eINSTANCE.createEdEnum();
		edEnums.add(epEnum);
		epEnum.setName("Перечисление3");
		enumerations = epEnum.getEnumerations();
		enumeration = XdtoFactory.eINSTANCE.createEnumeration();
		enumerations.add(enumeration);
		enumeration.setContent("Значение31");
		enumeration = XdtoFactory.eINSTANCE.createEnumeration();
		enumerations.add(enumeration);
		enumeration.setContent("Значение32");

		String report1 = String.join(System.lineSeparator(), "### Перечисления и предопределенные элементы", "",
				"Имя перечисления | Значения", "--- | ---", "Перечисление1 | Значение11", "Перечисление2 | Значение21",
				" | Значение22", " | Значение23", " | Значение24", "Перечисление3 | Значение31", " | Значение32", "");

		String report2 = ConversionModuleReport.createEnumsReport(edEnums);

		assertEquals("Описание формата для перечислений соответствует ожидаемому", report1, report2);
	}
}
