package ru.capralow.dt.conversion.plugin.core;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import com._1c.g5.v8.dt.xdto.model.Enumeration;
import com._1c.g5.v8.dt.xdto.model.XdtoFactory;

import ru.capralow.dt.conversion.plugin.core.cm.CmIdentificationVariant;
import ru.capralow.dt.conversion.plugin.core.fp.FpDefinedType;
import ru.capralow.dt.conversion.plugin.core.fp.FpEnum;
import ru.capralow.dt.conversion.plugin.core.fp.FpType;
import ru.capralow.dt.conversion.plugin.core.fp.impl.FpDefinedTypeImpl;
import ru.capralow.dt.conversion.plugin.core.fp.impl.FpEnumImpl;
import ru.capralow.dt.conversion.plugin.core.fp.impl.FpTypeImpl;

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
		EList<FpDefinedType> fpDefinedTypes = new BasicEList<FpDefinedType>();

		String report1 = "";

		String report2 = ConversionModuleReport.createDefinedTypesReport(fpDefinedTypes);

		assertEquals("Описание формата для пустых определяемых типов соответствует ожидаемому", report1, report2);
	}

	@Test
	public void testCreateDefinedTypesReport() {
		EList<FpDefinedType> fpDefinedTypes = new BasicEList<FpDefinedType>();

		FpDefinedType fpDefinedType = new FpDefinedTypeImpl();
		fpDefinedTypes.add(fpDefinedType);
		fpDefinedType.setName("Простой тип");
		EList<FpType> fpTypes = fpDefinedType.getTypes();
		FpType fpType = new FpTypeImpl();
		fpTypes.add(fpType);
		fpType.setName("ЦелоеЧисло");
		fpType.setPropertyType("Число (целое)");

		fpDefinedType = new FpDefinedTypeImpl();
		fpDefinedTypes.add(fpDefinedType);
		fpDefinedType.setName("Составной тип");
		fpTypes = fpDefinedType.getTypes();
		fpType = new FpTypeImpl();
		fpTypes.add(fpType);
		fpType.setName("Дата");
		fpType.setPropertyType("Дата (дата)");
		fpType = new FpTypeImpl();
		fpTypes.add(fpType);
		fpType.setName("СсылкаНаОбъект");
		fpType.setPropertyType("ЛюбаяСсылка");
		fpType = new FpTypeImpl();
		fpTypes.add(fpType);
		fpType.setName("ДокументСсылка");
		fpType.setPropertyType("КлючевыеСвойстваДокумент");
		fpDefinedType = new FpDefinedTypeImpl();
		fpDefinedTypes.add(fpDefinedType);
		fpDefinedType.setName("Простой тип");
		fpTypes = fpDefinedType.getTypes();
		fpType = new FpTypeImpl();
		fpTypes.add(fpType);
		fpType.setName("Дата");
		fpType.setPropertyType("Число (целое)");

		String report1 = String.join(System.lineSeparator(), "### Определяемые типы", "", "Имя типа | Состав типа",
				"--- | ---", "Простой тип | Число (целое)", "Составной тип | ", " | Дата (дата)", " | ЛюбаяСсылка",
				" | КлючевыеСвойстваДокумент", "Простой тип | Число (целое)", "");

		String report2 = ConversionModuleReport.createDefinedTypesReport(fpDefinedTypes);

		assertEquals("Описание формата для определяемых типов соответствует ожидаемому", report1, report2);
	}

	@Test
	public void testCreateEmptyEnumsReport() {
		EList<FpEnum> fpEnums = new BasicEList<FpEnum>();

		String report1 = "";

		String report2 = ConversionModuleReport.createEnumsReport(fpEnums);

		assertEquals("Описание формата для пустых перечислений соответствует ожидаемому", report1, report2);
	}

	@Test
	public void testCreateEnumsReport() {
		EList<FpEnum> fpEnums = new BasicEList<FpEnum>();

		FpEnum fpEnum = new FpEnumImpl();
		fpEnums.add(fpEnum);
		fpEnum.setName("Перечисление1");
		EList<Enumeration> enumerations = fpEnum.getEnumerations();
		Enumeration enumeration = XdtoFactory.eINSTANCE.createEnumeration();
		enumerations.add(enumeration);
		enumeration.setContent("Значение11");

		fpEnum = new FpEnumImpl();
		fpEnums.add(fpEnum);
		fpEnum.setName("Перечисление2");
		enumerations = fpEnum.getEnumerations();
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

		fpEnum = new FpEnumImpl();
		fpEnums.add(fpEnum);
		fpEnum.setName("Перечисление3");
		enumerations = fpEnum.getEnumerations();
		enumeration = XdtoFactory.eINSTANCE.createEnumeration();
		enumerations.add(enumeration);
		enumeration.setContent("Значение31");
		enumeration = XdtoFactory.eINSTANCE.createEnumeration();
		enumerations.add(enumeration);
		enumeration.setContent("Значение32");

		String report1 = String.join(System.lineSeparator(), "### Перечисления", "", "Имя перечисления | Значения",
				"--- | ---", "Перечисление1 | Значение11", "Перечисление2 | Значение21", " | Значение22",
				" | Значение23", " | Значение24", "Перечисление3 | Значение31", " | Значение32", "");

		String report2 = ConversionModuleReport.createEnumsReport(fpEnums);

		assertEquals("Описание формата для перечислений соответствует ожидаемому", report1, report2);
	}
}
