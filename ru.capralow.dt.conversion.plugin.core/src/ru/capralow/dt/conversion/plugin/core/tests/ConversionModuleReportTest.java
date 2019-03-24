package ru.capralow.dt.conversion.plugin.core.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import com._1c.g5.v8.dt.xdto.model.Enumeration;
import com._1c.g5.v8.dt.xdto.model.XdtoFactory;

import ru.capralow.dt.conversion.plugin.core.ConversionModuleReport;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdDefinedType;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdType;
import ru.capralow.dt.conversion.plugin.core.ed.model.edFactory;

public class ConversionModuleReportTest {

	@Test
	public void testCreateIdentificationReportEmpty() {
		EList<String> fields0 = new BasicEList<String>();

		String report1 = "**Вариант идентификации: Не определен**";

		String report2 = ConversionModuleReport.createIdentificationReport(null, fields0);

		assertEquals("Описание формата: Вариант идентификации не определен", report1, report2);
	}

	@Test
	public void testCreateIdentificationReportUUIDNoFields() {
		String report1 = String.join(System.lineSeparator(), "**Вариант идентификации: По уникальному идентификатору**",
				"");

		String report2 = ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.UUID,
				new BasicEList<String>());

		assertEquals("Описание формата: Вариант идентификации по УУИД без полей", report1, report2);
	}

	@Test
	public void testCreateIdentificationReportUUIDWithFields() {
		EList<String> fields = new BasicEList<String>();
		fields.add("Реквизит1,Реквизит2,Реквизит3");
		fields.add("Реквизит1,Реквизит2");
		fields.add("Реквизит1");

		String report1 = String.join(System.lineSeparator(), "**Вариант идентификации: По уникальному идентификатору**",
				"");

		String report2 = ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.UUID, fields);

		assertEquals("Описание формата: Вариан идентификации по УУИД с полями", report1, report2);
	}

	@Test
	public void testCreateIdentificationReportSearchFieldsNoFields() {
		String report1 = String.join(System.lineSeparator(), "**Вариант идентификации: По полям поиска**", "");

		String report2 = ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.SEARCH_FIELDS,
				new BasicEList<String>());

		assertEquals("Описание формата: Вариант идентификации по полям поиска без полей", report1, report2);
	}

	@Test
	public void testCreateIdentificationReportSearchFieldsWithField() {
		EList<String> fields = new BasicEList<String>();
		fields.add("Реквизит1");

		String report1 = String.join(System.lineSeparator(), "**Вариант идентификации: По полям поиска**", "",
				"Порядок поиска по ключевым полям | Реквизиты поиска", "--- | ---", "1 | Реквизит1", "");

		String report2 = ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.SEARCH_FIELDS,
				fields);

		assertEquals("Описание формата: Вариант идентификации по полям поиска с 1 полем", report1, report2);
	}

	@Test
	public void testCreateIdentificationReportSearchFieldsWithFields() {
		EList<String> fields = new BasicEList<String>();
		fields.add("Реквизит1,Реквизит2,Реквизит3");
		fields.add("Реквизит1,Реквизит2");
		fields.add("Реквизит1");

		String report1 = String.join(System.lineSeparator(), "**Вариант идентификации: По полям поиска**", "",
				"Порядок поиска по ключевым полям | Реквизиты поиска", "--- | ---", "1 | Реквизит1,Реквизит2,Реквизит3",
				"2 | Реквизит1,Реквизит2", "3 | Реквизит1", "");

		String report2 = ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.SEARCH_FIELDS,
				fields);

		assertEquals("Описание формата: Вариант идентификации по полям поиска с 3 полями", report1, report2);
	}

	@Test
	public void testCreateIdentificationReportUUIDThenFieldsNoFields() {
		String report1 = String.join(System.lineSeparator(), "**Вариант идентификации: По уникальному идентификатору**",
				"");

		String report2 = ConversionModuleReport
				.createIdentificationReport(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS, new BasicEList<String>());

		assertEquals("Описание формата: Вариант идентификации по УУИД затем поля поиска без полей", report1, report2);
	}

	@Test
	public void testCreateIdentificationReportUUIDThenFieldsWithField() {
		EList<String> fields = new BasicEList<String>();
		fields.add("Реквизит1");

		String report1 = String.join(System.lineSeparator(),
				"**Вариант идентификации: Сначала по уникальному идентификатору потом по полям поиска**", "",
				"Порядок поиска по ключевым полям | Реквизиты поиска", "--- | ---", "1 | Реквизит1", "");

		String report2 = ConversionModuleReport
				.createIdentificationReport(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS, fields);

		assertEquals("Описание формата: Вариант идентификации по УУИД затем поля поиска с 1 полем", report1, report2);
	}

	@Test
	public void testCreateIdentificationReportUUIDThenFieldsWithFields() {
		EList<String> fields = new BasicEList<String>();
		fields.add("Реквизит1,Реквизит2,Реквизит3");
		fields.add("Реквизит1,Реквизит2");
		fields.add("Реквизит1");

		String report1 = String.join(System.lineSeparator(),
				"**Вариант идентификации: Сначала по уникальному идентификатору потом по полям поиска**", "",
				"Порядок поиска по ключевым полям | Реквизиты поиска", "--- | ---", "1 | Реквизит1,Реквизит2,Реквизит3",
				"2 | Реквизит1,Реквизит2", "3 | Реквизит1", "");

		String report2 = ConversionModuleReport
				.createIdentificationReport(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS, fields);

		assertEquals("Описание формата: Вариант идентификации по УУИД затем поля поиска с 3 полями", report1, report2);
	}

	@Test
	public void testCreateDefinedTypesReportEmpty() {
		EList<EdDefinedType> edDefinedTypes = new BasicEList<EdDefinedType>();
		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<String, EList<EdProperty>>();

		String report1 = "";

		String report2 = ConversionModuleReport.createDefinedTypesReport(edDefinedTypes, mapKeyProperties);

		assertEquals("Описание формата: Определяемые типы отсутствуют", report1, report2);
	}

	@Test
	public void testCreateDefinedTypesReport() {
		EList<EdDefinedType> edDefinedTypes = new BasicEList<EdDefinedType>();

		EdDefinedType edDefinedType = edFactory.eINSTANCE.createEdDefinedType();
		edDefinedTypes.add(edDefinedType);
		edDefinedType = edFactory.eINSTANCE.createEdDefinedType();
		edDefinedTypes.add(edDefinedType);
		edDefinedType.setName("Составной тип");
		EList<EdType> edTypes = edDefinedType.getTypes();
		EdType edType = edFactory.eINSTANCE.createEdType();
		edTypes.add(edType);
		edType.setName("Тип1");
		edType.setPropertyType("Дата");
		edType = edFactory.eINSTANCE.createEdType();
		edTypes.add(edType);
		edType.setName("Тип2");
		edType.setPropertyType("ЛюбаяСсылка");
		edType = edFactory.eINSTANCE.createEdType();
		edTypes.add(edType);
		edType.setName("Тип3");
		edType.setPropertyType("КлючевыеСвойстваМойДокумент");
		edDefinedType = edFactory.eINSTANCE.createEdDefinedType();
		edDefinedTypes.add(edDefinedType);

		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<String, EList<EdProperty>>();
		EList<EdProperty> edProperties = new BasicEList<EdProperty>();
		EdProperty edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Ссылка");
		edProperty.setType("СправочникСсылка.МойДокумент");
		edProperty.setRequired(true);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Номер");
		edProperty.setType("Строка(11)");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Дата");
		edProperty.setType("ДатаВремя");
		mapKeyProperties.put("КлючевыеСвойстваМойДокумент", edProperties);

		String report1 = String.join(System.lineSeparator(), "### Определяемые типы", "", "Имя типа | Состав типа",
				"--- | ---", "Составной тип | ", "&nbsp; &nbsp; _Тип1 | Дата", "&nbsp; &nbsp; _Тип2 | ЛюбаяСсылка",
				"&nbsp; &nbsp; _Тип3 | КлючевыеСвойства",
				"&nbsp; &nbsp; &nbsp; &nbsp; _Ссылка | СправочникСсылка.МойДокумент",
				"&nbsp; &nbsp; &nbsp; &nbsp; _Номер | Строка(11)", "&nbsp; &nbsp; &nbsp; &nbsp; _Дата | ДатаВремя", "");

		String report2 = ConversionModuleReport.createDefinedTypesReport(edDefinedTypes, mapKeyProperties);

		assertEquals("Описание формата: Определяемые типы заполнены", report1, report2);
	}

	@Test
	public void testCreateEnumsReportEmpty() {
		EList<EdEnum> edEnums = new BasicEList<EdEnum>();

		String report1 = "";

		String report2 = ConversionModuleReport.createEnumsReport(edEnums);

		assertEquals("Описание формата: Перечисления отсутствуют", report1, report2);
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

		assertEquals("Описание формата: Перечисления заполнены", report1, report2);
	}

	@Test
	public void testExpandPropertyNameEmpty() {
		ArrayList<String> report1 = new ArrayList<String>();

		ArrayList<String> report2 = ConversionModuleReport.expandPropertyType("", "", false,
				new HashMap<String, EList<EdProperty>>());

		assertEquals("Описание формата: КлючевыеСвойства пустая строка", report1.toString(), report2.toString());
	}

	@Test
	public void testExpandPropertyTypeEmpty() {
		ArrayList<String> report1 = new ArrayList<String>();
		report1.add(String.join(",", "Владелец", "**Не указан тип**", ""));

		ArrayList<String> report2 = ConversionModuleReport.expandPropertyType("Владелец", "", false,
				new HashMap<String, EList<EdProperty>>());

		assertEquals("Описание формата: КлючевыеСвойства отсутствует тип", report1.toString(), report2.toString());
	}

	@Test
	public void testExpandPropertyTypeSingleType() {
		ArrayList<String> report1 = new ArrayList<String>();
		report1.add(String.join(",", "Комментарий", "Строка", ""));

		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<String, EList<EdProperty>>();

		ArrayList<String> report2 = ConversionModuleReport.expandPropertyType("Комментарий", "Строка", false,
				mapKeyProperties);

		assertEquals("Описание формата: КлючевыеСвойства заполнен простой тип",
				report1.toString().replace(" ", System.lineSeparator()),
				report2.toString().replace(" ", System.lineSeparator()));
	}

	@Test
	public void testExpandPropertyTypeEnumType() {
		ArrayList<String> report1 = new ArrayList<String>();
		report1.add(String.join(",", "Вид", "ВидыКонтактнойИнформации", "true"));

		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<String, EList<EdProperty>>();

		ArrayList<String> report2 = ConversionModuleReport.expandPropertyType("Вид", "ВидыКонтактнойИнформации", true,
				mapKeyProperties);

		assertEquals("Описание формата: КлючевыеСвойства заполнен предопределенный элемент",
				report1.toString().replace(" ", System.lineSeparator()),
				report2.toString().replace(" ", System.lineSeparator()));
	}

	@Test
	public void testExpandPropertyTypeDefinedType() {
		ArrayList<String> report1 = new ArrayList<String>();
		report1.add(String.join(",", "Значение", "ЗначениеДополнительногоРеквизита", ""));

		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<String, EList<EdProperty>>();
		// edProperties = new BasicEList<EdProperty>();
		// edProperty = edFactory.eINSTANCE.createEdProperty();
		// edProperties.add(edProperty);
		// edProperty.setName("ЗначенияСвойствОбъектовСсылка");
		// edProperty.setType("КлючевыеСвойстваЗначенияСвойствОбъектов");
		// edProperty = edFactory.eINSTANCE.createEdProperty();
		// edProperties.add(edProperty);
		// edProperty.setName("ШтатноеРасписаниеСсылка");
		// edProperty.setType("КлючевыеСвойстваШтатноеРасписание");
		// edProperty = edFactory.eINSTANCE.createEdProperty();
		// edProperties.add(edProperty);
		// edProperty.setName("ДатаВремя");
		// edProperty.setType("ДатаВремя");
		// mapKeyProperties.put("ЗначениеДополнительногоРеквизита", edProperties);

		ArrayList<String> report2 = ConversionModuleReport.expandPropertyType("Значение",
				"ЗначениеДополнительногоРеквизита", false, mapKeyProperties);

		assertEquals("Описание формата: КлючевыеСвойства заполнен предопределенный элемент",
				report1.toString().replace(" ", System.lineSeparator()),
				report2.toString().replace(" ", System.lineSeparator()));
	}

	@Test
	public void testExpandPropertyTypeNonexistantSingleKeyType() {
		ArrayList<String> report1 = new ArrayList<String>();
		report1.add(String.join(",", "ДокументОснование", "**Не найдены КлючевыеСвойстваМойДокумент**", ""));

		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<String, EList<EdProperty>>();

		ArrayList<String> report2 = ConversionModuleReport.expandPropertyType("ДокументОснование",
				"КлючевыеСвойстваМойДокумент", false, mapKeyProperties);

		assertEquals("Описание формата: КлючевыеСвойства заполнен несуществующий ключевой тип",
				report1.toString().replace(" ", System.lineSeparator()),
				report2.toString().replace(" ", System.lineSeparator()));
	}

	@Test
	public void testExpandPropertyTypeSingleKeyType() {
		ArrayList<String> report1 = new ArrayList<String>();
		report1.add(String.join(",", "ДокументОснование", "КлючевыеСвойства", ""));
		report1.add(String.join(",", "ДокументОснование_Ссылка", "СправочникСсылка.МойДокумент", "true"));
		report1.add(String.join(",", "ДокументОснование_Номер", "Строка(11)", ""));
		report1.add(String.join(",", "ДокументОснование_Дата", "ДатаВремя", ""));

		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<String, EList<EdProperty>>();
		EList<EdProperty> edProperties = new BasicEList<EdProperty>();
		EdProperty edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Ссылка");
		edProperty.setType("СправочникСсылка.МойДокумент");
		edProperty.setRequired(true);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Номер");
		edProperty.setType("Строка(11)");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Дата");
		edProperty.setType("ДатаВремя");
		mapKeyProperties.put("КлючевыеСвойстваМойДокумент", edProperties);

		ArrayList<String> report2 = ConversionModuleReport.expandPropertyType("ДокументОснование",
				"КлючевыеСвойстваМойДокумент", false, mapKeyProperties);

		assertEquals("Описание формата: КлючевыеСвойства заполнен ключевой тип",
				report1.toString().replace(" ", System.lineSeparator()),
				report2.toString().replace(" ", System.lineSeparator()));
	}

	@Test
	public void testExpandPropertyTypeNonexistantMultiKeyType() {
		ArrayList<String> report1 = new ArrayList<String>();
		report1.add(String.join(",", "Значение", "", "true"));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка", "КлючевыеСвойства", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка_Ссылка", "ДокументСсылка.МойДокумент1", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка_Номер", "Строка(11)", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка_Дата", "ДатаВремя", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка_Организация", "КлючевыеСвойства", "true"));
		report1.add(
				String.join(",", "Значение_МойДокумент1Ссылка_Организация_Ссылка", "СправочникСсылка.Организации", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка_Организация_Наименование", "Строка(150)", "true"));
		report1.add(
				String.join(",", "Значение_МойДокумент1Ссылка_Организация_РегистрационныйНомерПФР", "Строка(14)", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка_Организация_Префикс", "Строка(2)", ""));
		report1.add(String.join(",", "Значение_МойДокумент2Ссылка", "**Не найдены КлючевыеСвойстваМойДокумент2**", ""));

		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<String, EList<EdProperty>>();

		EList<EdProperty> edProperties = new BasicEList<EdProperty>();
		EdProperty edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Ссылка");
		edProperty.setType("СправочникСсылка.Организации");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Наименование");
		edProperty.setType("Строка(150)");
		edProperty.setRequired(true);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("РегистрационныйНомерПФР");
		edProperty.setType("Строка(14)");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Префикс");
		edProperty.setType("Строка(2)");
		mapKeyProperties.put("КлючевыеСвойстваОрганизации", edProperties);

		edProperties = new BasicEList<EdProperty>();
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Ссылка");
		edProperty.setType("ДокументСсылка.МойДокумент1");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Номер");
		edProperty.setType("Строка(11)");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Дата");
		edProperty.setType("ДатаВремя");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Организация");
		edProperty.setType("КлючевыеСвойстваОрганизации");
		edProperty.setRequired(true);
		mapKeyProperties.put("КлючевыеСвойстваМойДокумент1", edProperties);

		ArrayList<String> report2 = ConversionModuleReport.expandPropertyType("Значение",
				"МойДокумент1Ссылка:КлючевыеСвойстваМойДокумент1;МойДокумент2Ссылка:КлючевыеСвойстваМойДокумент2", true,
				mapKeyProperties);

		assertEquals(
				"Описание формата: КлючевыеСвойства заполнено несколько ключевых типов и несуществующий ключевой тип",
				report1.toString().replace(" ", System.lineSeparator()),
				report2.toString().replace(" ", System.lineSeparator()));
	}

	@Test
	public void testExpandPropertyTypeMultiKeyType() {
		ArrayList<String> report1 = new ArrayList<String>();
		report1.add(String.join(",", "Значение", "", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка", "КлючевыеСвойства", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка_Ссылка", "ДокументСсылка.МойДокумент1", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка_Номер", "Строка(11)", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка_Дата", "ДатаВремя", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка_Организация", "КлючевыеСвойства", "true"));
		report1.add(
				String.join(",", "Значение_МойДокумент1Ссылка_Организация_Ссылка", "СправочникСсылка.Организации", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка_Организация_Наименование", "Строка(150)", "true"));
		report1.add(
				String.join(",", "Значение_МойДокумент1Ссылка_Организация_РегистрационныйНомерПФР", "Строка(14)", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка_Организация_Префикс", "Строка(2)", ""));
		report1.add(String.join(",", "Значение_МойДокумент2Ссылка", "КлючевыеСвойства", ""));
		report1.add(String.join(",", "Значение_МойДокумент2Ссылка_Ссылка", "ДокументСсылка.МойДокумент2", ""));
		report1.add(String.join(",", "Значение_МойДокумент2Ссылка_Номер", "Строка(11)", ""));
		report1.add(String.join(",", "Значение_МойДокумент2Ссылка_Дата", "ДатаВремя", ""));
		report1.add(String.join(",", "Значение_МойДокумент2Ссылка_Организация", "КлючевыеСвойства", "true"));
		report1.add(
				String.join(",", "Значение_МойДокумент2Ссылка_Организация_Ссылка", "СправочникСсылка.Организации", ""));
		report1.add(String.join(",", "Значение_МойДокумент2Ссылка_Организация_Наименование", "Строка(150)", "true"));
		report1.add(
				String.join(",", "Значение_МойДокумент2Ссылка_Организация_РегистрационныйНомерПФР", "Строка(14)", ""));
		report1.add(String.join(",", "Значение_МойДокумент2Ссылка_Организация_Префикс", "Строка(2)", ""));

		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<String, EList<EdProperty>>();

		EList<EdProperty> edProperties = new BasicEList<EdProperty>();
		EdProperty edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Ссылка");
		edProperty.setType("СправочникСсылка.Организации");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Наименование");
		edProperty.setType("Строка(150)");
		edProperty.setRequired(true);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("РегистрационныйНомерПФР");
		edProperty.setType("Строка(14)");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Префикс");
		edProperty.setType("Строка(2)");
		mapKeyProperties.put("КлючевыеСвойстваОрганизации", edProperties);

		edProperties = new BasicEList<EdProperty>();
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Ссылка");
		edProperty.setType("ДокументСсылка.МойДокумент1");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Номер");
		edProperty.setType("Строка(11)");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Дата");
		edProperty.setType("ДатаВремя");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Организация");
		edProperty.setType("КлючевыеСвойстваОрганизации");
		edProperty.setRequired(true);
		mapKeyProperties.put("КлючевыеСвойстваМойДокумент1", edProperties);

		edProperties = new BasicEList<EdProperty>();
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Ссылка");
		edProperty.setType("ДокументСсылка.МойДокумент2");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Номер");
		edProperty.setType("Строка(11)");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Дата");
		edProperty.setType("ДатаВремя");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Организация");
		edProperty.setType("КлючевыеСвойстваОрганизации");
		edProperty.setRequired(true);
		mapKeyProperties.put("КлючевыеСвойстваМойДокумент2", edProperties);

		ArrayList<String> report2 = ConversionModuleReport.expandPropertyType("Значение",
				"МойДокумент1Ссылка:КлючевыеСвойстваМойДокумент1;МойДокумент2Ссылка:КлючевыеСвойстваМойДокумент2",
				false, mapKeyProperties);

		assertEquals("Описание формата: КлючевыеСвойства заполнено несколько ключевых типов",
				report1.toString().replace(" ", System.lineSeparator()),
				report2.toString().replace(" ", System.lineSeparator()));
	}

	@Test
	public void testExpandPropertyTypeSingleKeyMultiType() {
		ArrayList<String> report1 = new ArrayList<String>();
		report1.add(String.join(",", "Значение", "КлючевыеСвойства", ""));
		report1.add(String.join(",", "Значение_Ссылка", "ДокументСсылка.МойДокумент", ""));
		report1.add(String.join(",", "Значение_Номер", "Строка(11)", ""));
		report1.add(String.join(",", "Значение_Дата", "ДатаВремя", ""));
		report1.add(String.join(",", "Значение_Организация", "", "true"));
		report1.add(String.join(",", "Значение_Организация_ОрганизацииСсылка", "КлючевыеСвойства", ""));
		report1.add(
				String.join(",", "Значение_Организация_ОрганизацииСсылка_Ссылка", "СправочникСсылка.Организации", ""));
		report1.add(String.join(",", "Значение_Организация_ОрганизацииСсылка_Наименование", "Строка(150)", "true"));
		report1.add(
				String.join(",", "Значение_Организация_ОрганизацииСсылка_РегистрационныйНомерПФР", "Строка(14)", ""));
		report1.add(String.join(",", "Значение_Организация_ОрганизацииСсылка_Префикс", "Строка(2)", ""));
		report1.add(String.join(",", "Значение_Организация_ФизическиеЛицаСсылка", "КлючевыеСвойства", ""));
		report1.add(String.join(",", "Значение_Организация_ФизическиеЛицаСсылка_Ссылка",
				"СправочникСсылка.ФизическиеЛица", ""));
		report1.add(String.join(",", "Значение_Организация_ФизическиеЛицаСсылка_ДатаРождения", "Дата", ""));
		report1.add(String.join(",", "Значение_Организация_ФизическиеЛицаСсылка_Наименование", "Строка(100)", "true"));
		report1.add(String.join(",", "Значение_Организация_ФизическиеЛицаСсылка_Код", "Строка(10)", ""));

		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<String, EList<EdProperty>>();

		EList<EdProperty> edProperties = new BasicEList<EdProperty>();
		EdProperty edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Ссылка");
		edProperty.setType("СправочникСсылка.Организации");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Наименование");
		edProperty.setType("Строка(150)");
		edProperty.setRequired(true);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("РегистрационныйНомерПФР");
		edProperty.setType("Строка(14)");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Префикс");
		edProperty.setType("Строка(2)");
		mapKeyProperties.put("КлючевыеСвойстваОрганизации", edProperties);

		edProperties = new BasicEList<EdProperty>();
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Ссылка");
		edProperty.setType("СправочникСсылка.ФизическиеЛица");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("ДатаРождения");
		edProperty.setType("Дата");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Наименование");
		edProperty.setType("Строка(100)");
		edProperty.setRequired(true);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Код");
		edProperty.setType("Строка(10)");
		mapKeyProperties.put("КлючевыеСвойстваФизическиеЛица", edProperties);

		edProperties = new BasicEList<EdProperty>();
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Ссылка");
		edProperty.setType("ДокументСсылка.МойДокумент");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Номер");
		edProperty.setType("Строка(11)");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Дата");
		edProperty.setType("ДатаВремя");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Организация");
		edProperty.setType(
				"ОрганизацииСсылка:КлючевыеСвойстваОрганизации;ФизическиеЛицаСсылка:КлючевыеСвойстваФизическиеЛица");
		edProperty.setRequired(true);
		mapKeyProperties.put("КлючевыеСвойстваМойДокумент", edProperties);

		ArrayList<String> report2 = ConversionModuleReport.expandPropertyType("Значение", "КлючевыеСвойстваМойДокумент",
				false, mapKeyProperties);

		assertEquals("Описание формата: КлючевыеСвойства заполнен ключевой тип внутри несколько типов",
				report1.toString().replace(" ", System.lineSeparator()),
				report2.toString().replace(" ", System.lineSeparator()));
	}

	@Test
	public void testExpandPropertyTypeMultiKeyMultiType() {
		ArrayList<String> report1 = new ArrayList<String>();
		report1.add(String.join(",", "Значение", "", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка", "КлючевыеСвойства", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка_Ссылка", "ДокументСсылка.МойДокумент1", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка_Номер", "Строка(11)", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка_Дата", "ДатаВремя", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка_Организация", "", "true"));
		report1.add(
				String.join(",", "Значение_МойДокумент1Ссылка_Организация_ОрганизацииСсылка", "КлючевыеСвойства", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка_Организация_ОрганизацииСсылка_Ссылка",
				"СправочникСсылка.Организации", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка_Организация_ОрганизацииСсылка_Наименование",
				"Строка(150)", "true"));
		report1.add(String.join(",",
				"Значение_МойДокумент1Ссылка_Организация_ОрганизацииСсылка_РегистрационныйНомерПФР", "Строка(14)", ""));
		report1.add(
				String.join(",", "Значение_МойДокумент1Ссылка_Организация_ОрганизацииСсылка_Префикс", "Строка(2)", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка_Организация_ФизическиеЛицаСсылка", "КлючевыеСвойства",
				""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка_Организация_ФизическиеЛицаСсылка_Ссылка",
				"СправочникСсылка.ФизическиеЛица", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка_Организация_ФизическиеЛицаСсылка_ДатаРождения",
				"Дата", ""));
		report1.add(String.join(",", "Значение_МойДокумент1Ссылка_Организация_ФизическиеЛицаСсылка_Наименование",
				"Строка(100)", "true"));
		report1.add(
				String.join(",", "Значение_МойДокумент1Ссылка_Организация_ФизическиеЛицаСсылка_Код", "Строка(10)", ""));
		report1.add(String.join(",", "Значение_МойДокумент2Ссылка", "КлючевыеСвойства", ""));
		report1.add(String.join(",", "Значение_МойДокумент2Ссылка_Ссылка", "ДокументСсылка.МойДокумент2", ""));
		report1.add(String.join(",", "Значение_МойДокумент2Ссылка_Номер", "Строка(11)", ""));
		report1.add(String.join(",", "Значение_МойДокумент2Ссылка_Дата", "ДатаВремя", ""));
		report1.add(String.join(",", "Значение_МойДокумент2Ссылка_Организация", "", "true"));
		report1.add(
				String.join(",", "Значение_МойДокумент2Ссылка_Организация_ОрганизацииСсылка", "КлючевыеСвойства", ""));
		report1.add(String.join(",", "Значение_МойДокумент2Ссылка_Организация_ОрганизацииСсылка_Ссылка",
				"СправочникСсылка.Организации", ""));
		report1.add(String.join(",", "Значение_МойДокумент2Ссылка_Организация_ОрганизацииСсылка_Наименование",
				"Строка(150)", "true"));
		report1.add(String.join(",",
				"Значение_МойДокумент2Ссылка_Организация_ОрганизацииСсылка_РегистрационныйНомерПФР", "Строка(14)", ""));
		report1.add(
				String.join(",", "Значение_МойДокумент2Ссылка_Организация_ОрганизацииСсылка_Префикс", "Строка(2)", ""));
		report1.add(String.join(",", "Значение_МойДокумент2Ссылка_Организация_ФизическиеЛицаСсылка", "КлючевыеСвойства",
				""));
		report1.add(String.join(",", "Значение_МойДокумент2Ссылка_Организация_ФизическиеЛицаСсылка_Ссылка",
				"СправочникСсылка.ФизическиеЛица", ""));
		report1.add(String.join(",", "Значение_МойДокумент2Ссылка_Организация_ФизическиеЛицаСсылка_ДатаРождения",
				"Дата", ""));
		report1.add(String.join(",", "Значение_МойДокумент2Ссылка_Организация_ФизическиеЛицаСсылка_Наименование",
				"Строка(100)", "true"));
		report1.add(
				String.join(",", "Значение_МойДокумент2Ссылка_Организация_ФизическиеЛицаСсылка_Код", "Строка(10)", ""));

		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<String, EList<EdProperty>>();

		EList<EdProperty> edProperties = new BasicEList<EdProperty>();
		EdProperty edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Ссылка");
		edProperty.setType("СправочникСсылка.Организации");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Наименование");
		edProperty.setType("Строка(150)");
		edProperty.setRequired(true);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("РегистрационныйНомерПФР");
		edProperty.setType("Строка(14)");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Префикс");
		edProperty.setType("Строка(2)");
		mapKeyProperties.put("КлючевыеСвойстваОрганизации", edProperties);

		edProperties = new BasicEList<EdProperty>();
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Ссылка");
		edProperty.setType("СправочникСсылка.ФизическиеЛица");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("ДатаРождения");
		edProperty.setType("Дата");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Наименование");
		edProperty.setType("Строка(100)");
		edProperty.setRequired(true);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Код");
		edProperty.setType("Строка(10)");
		mapKeyProperties.put("КлючевыеСвойстваФизическиеЛица", edProperties);

		edProperties = new BasicEList<EdProperty>();
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Ссылка");
		edProperty.setType("ДокументСсылка.МойДокумент1");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Номер");
		edProperty.setType("Строка(11)");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Дата");
		edProperty.setType("ДатаВремя");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Организация");
		edProperty.setType(
				"ОрганизацииСсылка:КлючевыеСвойстваОрганизации;ФизическиеЛицаСсылка:КлючевыеСвойстваФизическиеЛица");
		edProperty.setRequired(true);
		mapKeyProperties.put("КлючевыеСвойстваМойДокумент1", edProperties);

		edProperties = new BasicEList<EdProperty>();
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Ссылка");
		edProperty.setType("ДокументСсылка.МойДокумент2");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Номер");
		edProperty.setType("Строка(11)");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Дата");
		edProperty.setType("ДатаВремя");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Организация");
		edProperty.setType(
				"ОрганизацииСсылка:КлючевыеСвойстваОрганизации;ФизическиеЛицаСсылка:КлючевыеСвойстваФизическиеЛица");
		edProperty.setRequired(true);
		mapKeyProperties.put("КлючевыеСвойстваМойДокумент2", edProperties);

		ArrayList<String> report2 = ConversionModuleReport.expandPropertyType("Значение",
				"МойДокумент1Ссылка:КлючевыеСвойстваМойДокумент1;МойДокумент2Ссылка:КлючевыеСвойстваМойДокумент2",
				false, mapKeyProperties);

		assertEquals("Описание формата: КлючевыеСвойства заполнено несколько ключевых типов внутри несколько типов",
				report1.toString().replace(" ", System.lineSeparator()),
				report2.toString().replace(" ", System.lineSeparator()));
	}

	@Test
	public void testExpandPropertyTypeGroup() {
		ArrayList<String> report1 = new ArrayList<String>();
		report1.add(String.join(",", "Значение", "КлючевыеСвойства", ""));
		report1.add(String.join(",", "Значение_Ссылка", "ДокументСсылка.МойДокумент", ""));
		report1.add(String.join(",", "Значение_Номер", "Строка(11)", ""));
		report1.add(String.join(",", "Значение_Дата", "ДатаВремя", ""));
		report1.add(String.join(",", "Значение_Организация", "КлючевыеСвойства", "true"));
		report1.add(String.join(",", "Значение_Организация_Ссылка", "СправочникСсылка.Организации", ""));
		report1.add(String.join(",", "Значение_Организация_Наименование", "Строка(150)", "true"));
		report1.add(String.join(",", "Значение_Организация_РегистрационныйНомерПФР", "Строка(14)", ""));
		report1.add(String.join(",", "Значение_Организация_Префикс", "Строка(2)", ""));
		report1.add(String.join(",", "Значение_Подразделение", "КлючевыеСвойства", ""));
		report1.add(String.join(",", "Значение_Подразделение_Ссылка", "СправочникСсылка.Подразделения", ""));
		report1.add(String.join(",", "Значение_Подразделение_Владелец", "КлючевыеСвойства", "true"));
		report1.add(String.join(",", "Значение_Подразделение_Владелец_Ссылка", "СправочникСсылка.Организации", ""));
		report1.add(String.join(",", "Значение_Подразделение_Владелец_Наименование", "Строка(150)", "true"));
		report1.add(String.join(",", "Значение_Подразделение_Владелец_РегистрационныйНомерПФР", "Строка(14)", ""));
		report1.add(String.join(",", "Значение_Подразделение_Владелец_Префикс", "Строка(2)", ""));
		report1.add(String.join(",", "Значение_Подразделение_Наименование", "Строка(150)", "true"));
		report1.add(String.join(",", "Значение_Подразделение_Родитель", "КлючевыеСвойства", ""));
		report1.add(String.join(",", "Значение_Подразделение_Родитель_Ссылка", "СправочникСсылка.Подразделения", ""));
		report1.add(String.join(",", "Значение_Подразделение_Родитель_Наименование", "Строка(150)", "true"));
		report1.add(String.join(",", "Значение_Подразделение_Родитель_Код", "Строка(9)", ""));
		report1.add(String.join(",", "Значение_Подразделение_Код", "Строка(9)", ""));

		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<String, EList<EdProperty>>();

		EList<EdProperty> edProperties = new BasicEList<EdProperty>();
		EdProperty edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Ссылка");
		edProperty.setType("СправочникСсылка.Организации");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Наименование");
		edProperty.setType("Строка(150)");
		edProperty.setRequired(true);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("РегистрационныйНомерПФР");
		edProperty.setType("Строка(14)");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Префикс");
		edProperty.setType("Строка(2)");
		mapKeyProperties.put("КлючевыеСвойстваОрганизации", edProperties);

		edProperties = new BasicEList<EdProperty>();
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Ссылка");
		edProperty.setType("СправочникСсылка.Подразделения");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Владелец");
		edProperty.setType("КлючевыеСвойстваОрганизации");
		edProperty.setRequired(true);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Наименование");
		edProperty.setType("Строка(150)");
		edProperty.setRequired(true);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Родитель");
		edProperty.setType("КлючевыеСвойстваПодразделения");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Код");
		edProperty.setType("Строка(9)");
		mapKeyProperties.put("КлючевыеСвойстваПодразделения", edProperties);

		edProperties = new BasicEList<EdProperty>();
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Ссылка");
		edProperty.setType("ДокументСсылка.МойДокумент");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Номер");
		edProperty.setType("Строка(11)");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Дата");
		edProperty.setType("ДатаВремя");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Организация");
		edProperty.setType("КлючевыеСвойстваОрганизации");
		edProperty.setRequired(true);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Подразделение");
		edProperty.setType("КлючевыеСвойстваПодразделения");
		mapKeyProperties.put("КлючевыеСвойстваМойДокумент", edProperties);

		ArrayList<String> report2 = ConversionModuleReport.expandPropertyType("Значение", "КлючевыеСвойстваМойДокумент",
				false, mapKeyProperties);

		assertEquals("Описание формата: КлючевыеСвойства заполнена группа с родителем",
				report1.toString().replace(" ", System.lineSeparator()),
				report2.toString().replace(" ", System.lineSeparator()));
	}
}
