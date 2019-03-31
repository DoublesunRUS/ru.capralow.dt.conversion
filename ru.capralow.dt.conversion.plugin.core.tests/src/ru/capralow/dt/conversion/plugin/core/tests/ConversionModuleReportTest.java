package ru.capralow.dt.conversion.plugin.core.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import com._1c.g5.v8.dt.xdto.model.Enumeration;
import com._1c.g5.v8.dt.xdto.model.XdtoFactory;

import ru.capralow.dt.conversion.plugin.core.ConversionModuleReport;
import ru.capralow.dt.conversion.plugin.core.MarkdownTable;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdDefinedType;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdType;
import ru.capralow.dt.conversion.plugin.core.ed.model.edFactory;

public class ConversionModuleReportTest {
	private static final String IDENTIFICATION_VARIANT_UUID = "**Вариант идентификации: По уникальному идентификатору**";
	private static final String IDENTIFICATION_SEARCH_FIELDS = "**Вариант идентификации: По полям поиска**";

	private static final String THREE_FIELDS = "Реквизит1,Реквизит2,Реквизит3";
	private static final String TWO_FIELDS = "Реквизит1,Реквизит2";
	private static final String ONE_FIELD = "Реквизит1";

	private static final String KEY_FIELDS = "КлючевыеСвойства";
	private static final String KEY_FIELDS_ORGANIZATIONS = "КлючевыеСвойстваОрганизации";
	private static final String KEY_FIELDS_DIVISIONS = "КлючевыеСвойстваПодразделения";
	private static final String KEY_FIELDS_MY_DOCUMENT = "КлючевыеСвойстваМойДокумент";
	private static final String KEY_FIELDS_TWO_DOCUMENTS = "МойДокумент1Ссылка:КлючевыеСвойстваМойДокумент1;МойДокумент2Ссылка:КлючевыеСвойстваМойДокумент2";

	private static final String FIELD_TYPE_STRING2 = "Строка(2)";
	private static final String FIELD_TYPE_STRING9 = "Строка(9)";
	private static final String FIELD_TYPE_STRING10 = "Строка(10)";
	private static final String FIELD_TYPE_STRING11 = "Строка(11)";
	private static final String FIELD_TYPE_STRING14 = "Строка(14)";
	private static final String FIELD_TYPE_STRING100 = "Строка(100)";
	private static final String FIELD_TYPE_STRING150 = "Строка(150)";
	private static final String FIELD_TYPE_DATETIME = "ДатаВремя";

	private static final String FIELD_NAME_REF = "Ссылка";
	private static final String FIELD_NAME_OWNER = "Владелец";
	private static final String FIELD_NAME_VALUE = "Значение";
	private static final String FIELD_NAME_MAIN_DOCUMENT = "ДокументОснование";
	private static final String FIELD_NAME_NAME = "Наименование";
	private static final String FIELD_NAME_NUMBER = "Номер";
	private static final String FIELD_NAME_DATE = "Дата";
	private static final String FIELD_NAME_ORGANIZATION = "Организация";

	private static final String REF_FIELD_ORGANIZATION = "СправочникСсылка.Организации";
	private static final String REF_FIELD_DIVISION = "СправочникСсылка.Подразделения";
	private static final String REF_FIELD_PERSON = "СправочникСсылка.ФизическиеЛица";
	private static final String REF_FIELD_MY_DOCUMENT = "ДокументСсылка.МойДокумент";

	@Test
	public void testCreateIdentificationReportEmpty() {
		String report1 = "**Вариант идентификации: Не определен**";

		String report2 = ConversionModuleReport.createIdentificationReport(null, new BasicEList<>());

		assertEquals("Описание формата: Вариант идентификации не определен", report1, report2);
	}

	@Test
	public void testCreateIdentificationReportUUIDNoFields() {
		String report1 = String.join(System.lineSeparator(), IDENTIFICATION_VARIANT_UUID, "");

		String report2 = ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.UUID,
				new BasicEList<String>());

		assertEquals("Описание формата: Вариант идентификации по УУИД без полей", report1, report2);
	}

	@Test
	public void testCreateIdentificationReportUUIDWithFields() {
		String report1 = String.join(System.lineSeparator(), IDENTIFICATION_VARIANT_UUID, "");

		String report2 = ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.UUID, getFields3());

		assertEquals("Описание формата: Вариан идентификации по УУИД с полями", report1, report2);
	}

	@Test
	public void testCreateIdentificationReportSearchFieldsNoFields() {
		String report1 = String.join(System.lineSeparator(), IDENTIFICATION_SEARCH_FIELDS, "");

		String report2 = ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.SEARCH_FIELDS,
				new BasicEList<String>());

		assertEquals("Описание формата: Вариант идентификации по полям поиска без полей", report1, report2);
	}

	@Test
	public void testCreateIdentificationReportSearchFieldsWithField() {
		String report1 = IDENTIFICATION_SEARCH_FIELDS + System.lineSeparator() + System.lineSeparator()
				+ getIdentificationTable1().getTable();

		String report2 = ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.SEARCH_FIELDS,
				getFields1());

		assertEquals("Описание формата: Вариант идентификации по полям поиска с 1 полем", report1, report2);
	}

	@Test
	public void testCreateIdentificationReportSearchFieldsWithFields() {
		String report1 = IDENTIFICATION_SEARCH_FIELDS + System.lineSeparator() + System.lineSeparator()
				+ getIdentificationTable3().getTable();

		String report2 = ConversionModuleReport.createIdentificationReport(CmIdentificationVariant.SEARCH_FIELDS,
				getFields3());

		assertEquals("Описание формата: Вариант идентификации по полям поиска с 3 полями", report1, report2);
	}

	@Test
	public void testCreateIdentificationReportUUIDThenFieldsNoFields() {
		String report1 = String.join(System.lineSeparator(), IDENTIFICATION_VARIANT_UUID, "");

		String report2 = ConversionModuleReport
				.createIdentificationReport(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS, new BasicEList<String>());

		assertEquals("Описание формата: Вариант идентификации по УУИД затем поля поиска без полей", report1, report2);
	}

	@Test
	public void testCreateIdentificationReportUUIDThenFieldsWithField() {
		String report1 = "**Вариант идентификации: Сначала по уникальному идентификатору потом по полям поиска**"
				+ System.lineSeparator() + System.lineSeparator() + getIdentificationTable1().getTable();

		String report2 = ConversionModuleReport
				.createIdentificationReport(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS, getFields1());

		assertEquals("Описание формата: Вариант идентификации по УУИД затем поля поиска с 1 полем", report1, report2);
	}

	@Test
	public void testCreateIdentificationReportUUIDThenFieldsWithFields() {
		String report1 = "**Вариант идентификации: Сначала по уникальному идентификатору потом по полям поиска**"
				+ System.lineSeparator() + System.lineSeparator() + getIdentificationTable3().getTable();

		String report2 = ConversionModuleReport
				.createIdentificationReport(CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS, getFields3());

		assertEquals("Описание формата: Вариант идентификации по УУИД затем поля поиска с 3 полями", report1, report2);
	}

	@Test
	public void testCreateDefinedTypesReportEmpty() {
		String report1 = "";

		String report2 = ConversionModuleReport.createDefinedTypesReport(new BasicEList<EdDefinedType>(),
				new HashMap<String, EList<EdProperty>>());

		assertEquals("Описание формата: Определяемые типы отсутствуют", report1, report2);
	}

	@Test
	public void testCreateDefinedTypesReport() {
		EList<EdDefinedType> edDefinedTypes = new BasicEList<>();
		EdDefinedType edDefinedType;

		edDefinedType = edFactory.eINSTANCE.createEdDefinedType();
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
		edType.setPropertyType(KEY_FIELDS_MY_DOCUMENT);

		edDefinedType = edFactory.eINSTANCE.createEdDefinedType();
		edDefinedTypes.add(edDefinedType);

		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<>();
		mapKeyProperties.put(KEY_FIELDS_MY_DOCUMENT, getKeyPropertiesMyDocumentSingleType(""));

		String report1 = "### Определяемые типы" + System.lineSeparator() + System.lineSeparator();

		MarkdownTable mdTable = new MarkdownTable(new String[] { "Имя типа", "Состав типа" });
		mdTable.addRow(1, new String[][] { { "Составной тип", "0", "" }, { "", "0", "" } });
		mdTable.addRow(1, new String[][] { { "_Тип1", "1", "" }, { "Дата", "1", "" } });
		mdTable.addRow(1, new String[][] { { "_Тип2", "1", "" }, { "ЛюбаяСсылка", "1", "" } });
		mdTable.addRow(1, new String[][] { { "_Тип3", "1", "" }, { KEY_FIELDS, "1", "" } });
		mdTable.addRow(1,
				new String[][] { { "_".concat(FIELD_NAME_REF), "2", "" }, { REF_FIELD_MY_DOCUMENT, "2", "" } });
		mdTable.addRow(1,
				new String[][] { { "_".concat(FIELD_NAME_NUMBER), "2", "" }, { FIELD_TYPE_STRING11, "2", "" } });
		mdTable.addRow(1,
				new String[][] { { "_".concat(FIELD_NAME_DATE), "2", "" }, { FIELD_TYPE_DATETIME, "2", "" } });
		report1 += mdTable.getTable();

		String report2 = ConversionModuleReport.createDefinedTypesReport(edDefinedTypes, mapKeyProperties);

		assertEquals("Описание формата: Определяемые типы заполнены", report1, report2);
	}

	@Test
	public void testCreateEnumsReportEmpty() {
		String report1 = "";

		String report2 = ConversionModuleReport.createEnumsReport(new BasicEList<EdEnum>());

		assertEquals("Описание формата: Перечисления отсутствуют", report1, report2);
	}

	@Test
	public void testCreateEnumsReport() {
		EList<EdEnum> edEnums = new BasicEList<>();

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

		String report1 = "### Перечисления и предопределенные элементы" + System.lineSeparator()
				+ System.lineSeparator();

		MarkdownTable mdTable = new MarkdownTable(new String[] { "Имя перечисления", "Значения" });
		mdTable.addRow(1, new String[][] { { "Перечисление1", "0", "" }, { "Значение11", "0", "" } });
		mdTable.addRow(1, new String[][] { { "Перечисление2", "0", "" }, { "Значение21", "0", "" } });
		mdTable.addRow(1, new String[][] { { "", "0", "" }, { "Значение22", "0", "" } });
		mdTable.addRow(1, new String[][] { { "", "0", "" }, { "Значение23", "0", "" } });
		mdTable.addRow(1, new String[][] { { "", "0", "" }, { "Значение24", "0", "" } });
		mdTable.addRow(1, new String[][] { { "Перечисление3", "0", "" }, { "Значение31", "0", "" } });
		mdTable.addRow(1, new String[][] { { "", "0", "" }, { "Значение32", "0", "" } });
		report1 += mdTable.getTable();

		String report2 = ConversionModuleReport.createEnumsReport(edEnums);

		assertEquals("Описание формата: Перечисления заполнены", report1, report2);
	}

	@Test
	public void testExpandPropertyNameEmpty() {
		List<String> report1 = new ArrayList<>();

		List<String> report2 = ConversionModuleReport.expandPropertyType("", "", false,
				new HashMap<String, EList<EdProperty>>());

		assertEquals("Описание формата: КлючевыеСвойства пустая строка", report1.toString(), report2.toString());
	}

	@Test
	public void testExpandPropertyTypeEmpty() {
		List<String> report1 = new ArrayList<>();
		report1.add(String.join(",", FIELD_NAME_OWNER, "**Не указан тип**", ""));

		List<String> report2 = ConversionModuleReport.expandPropertyType(FIELD_NAME_OWNER, "", false,
				new HashMap<String, EList<EdProperty>>());

		assertEquals("Описание формата: КлючевыеСвойства отсутствует тип", report1.toString(), report2.toString());
	}

	@Test
	public void testExpandPropertyTypeSingleType() {
		List<String> report1 = new ArrayList<>();
		report1.add(String.join(",", "Комментарий", "Строка", ""));

		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<>();

		List<String> report2 = ConversionModuleReport.expandPropertyType("Комментарий", "Строка", false,
				mapKeyProperties);

		assertEquals("Описание формата: КлючевыеСвойства заполнен простой тип",
				report1.toString().replace(" ", System.lineSeparator()),
				report2.toString().replace(" ", System.lineSeparator()));
	}

	@Test
	public void testExpandPropertyTypeEnumType() {
		List<String> report1 = new ArrayList<>();
		report1.add(String.join(",", "Вид", "ВидыКонтактнойИнформации", "true"));

		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<>();

		List<String> report2 = ConversionModuleReport.expandPropertyType("Вид", "ВидыКонтактнойИнформации", true,
				mapKeyProperties);

		assertEquals("Описание формата: КлючевыеСвойства заполнен предопределенный элемент",
				report1.toString().replace(" ", System.lineSeparator()),
				report2.toString().replace(" ", System.lineSeparator()));
	}

	@Test
	public void testExpandPropertyTypeDefinedType() {
		List<String> report1 = new ArrayList<>();
		report1.add(String.join(",", FIELD_NAME_VALUE, "ЗначениеДополнительногоРеквизита", ""));

		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<>();

		List<String> report2 = ConversionModuleReport.expandPropertyType(FIELD_NAME_VALUE,
				"ЗначениеДополнительногоРеквизита", false, mapKeyProperties);

		assertEquals("Описание формата: КлючевыеСвойства заполнен предопределенный элемент",
				report1.toString().replace(" ", System.lineSeparator()),
				report2.toString().replace(" ", System.lineSeparator()));
	}

	@Test
	public void testExpandPropertyTypeNonexistantSingleKeyType() {
		List<String> report1 = new ArrayList<>();
		report1.add(String.join(",", FIELD_NAME_MAIN_DOCUMENT, "**Не найдены КлючевыеСвойстваМойДокумент**", ""));

		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<>();

		List<String> report2 = ConversionModuleReport.expandPropertyType(FIELD_NAME_MAIN_DOCUMENT,
				KEY_FIELDS_MY_DOCUMENT, false, mapKeyProperties);

		assertEquals("Описание формата: КлючевыеСвойства заполнен несуществующий ключевой тип",
				report1.toString().replace(" ", System.lineSeparator()),
				report2.toString().replace(" ", System.lineSeparator()));
	}

	@Test
	public void testExpandPropertyTypeSingleKeyType() {
		List<String> report1 = new ArrayList<>();
		report1.add(String.join(",", FIELD_NAME_MAIN_DOCUMENT, KEY_FIELDS, ""));
		report1.add(String.join(",", FIELD_NAME_MAIN_DOCUMENT.concat("_").concat(FIELD_NAME_REF), REF_FIELD_MY_DOCUMENT,
				"true"));
		report1.add(String.join(",", FIELD_NAME_MAIN_DOCUMENT.concat("_").concat(FIELD_NAME_NUMBER),
				FIELD_TYPE_STRING11, ""));
		report1.add(String.join(",", FIELD_NAME_MAIN_DOCUMENT.concat("_").concat(FIELD_NAME_DATE), FIELD_TYPE_DATETIME,
				""));

		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<>();
		mapKeyProperties.put(KEY_FIELDS_MY_DOCUMENT, getKeyPropertiesMyDocumentSingleType(""));

		List<String> report2 = ConversionModuleReport.expandPropertyType(FIELD_NAME_MAIN_DOCUMENT,
				KEY_FIELDS_MY_DOCUMENT, false, mapKeyProperties);

		assertEquals("Описание формата: КлючевыеСвойства заполнен ключевой тип",
				report1.toString().replace(" ", System.lineSeparator()),
				report2.toString().replace(" ", System.lineSeparator()));
	}

	@Test
	public void testExpandPropertyTypeNonexistantMultiKeyType() {
		List<String> report1 = new ArrayList<>();
		report1.add(String.join(",", FIELD_NAME_VALUE, "", "true"));
		report1.addAll(getDocumentReport("1"));
		report1.add(String.join(",", "Значение_МойДокумент2Ссылка", "**Не найдены КлючевыеСвойстваМойДокумент2**", ""));

		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<>();

		mapKeyProperties.put(KEY_FIELDS_ORGANIZATIONS, getKeyPropertiesOrganization());
		mapKeyProperties.put(KEY_FIELDS_MY_DOCUMENT.concat("1"), getKeyPropertiesMyDocumentSingleType("1"));

		List<String> report2 = ConversionModuleReport.expandPropertyType(FIELD_NAME_VALUE, KEY_FIELDS_TWO_DOCUMENTS,
				true, mapKeyProperties);

		assertEquals(
				"Описание формата: КлючевыеСвойства заполнено несколько ключевых типов и несуществующий ключевой тип",
				report1.toString().replace(" ", System.lineSeparator()),
				report2.toString().replace(" ", System.lineSeparator()));
	}

	@Test
	public void testExpandPropertyTypeMultiKeyType() {
		List<String> report1 = new ArrayList<>();
		report1.add(String.join(",", FIELD_NAME_VALUE, "", ""));
		report1.addAll(getDocumentReport("1"));
		report1.addAll(getDocumentReport("2"));

		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<>();

		mapKeyProperties.put(KEY_FIELDS_ORGANIZATIONS, getKeyPropertiesOrganization());
		mapKeyProperties.put(KEY_FIELDS_MY_DOCUMENT.concat("1"), getKeyPropertiesMyDocumentSingleType("1"));
		mapKeyProperties.put(KEY_FIELDS_MY_DOCUMENT.concat("2"), getKeyPropertiesMyDocumentSingleType("2"));

		List<String> report2 = ConversionModuleReport.expandPropertyType(FIELD_NAME_VALUE, KEY_FIELDS_TWO_DOCUMENTS,
				false, mapKeyProperties);

		assertEquals("Описание формата: КлючевыеСвойства заполнено несколько ключевых типов",
				report1.toString().replace(" ", System.lineSeparator()),
				report2.toString().replace(" ", System.lineSeparator()));
	}

	@Test
	public void testExpandPropertyTypeSingleKeyMultiType() {
		List<String> report1 = new ArrayList<>();
		report1.add(String.join(",", FIELD_NAME_VALUE, KEY_FIELDS, ""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_Ссылка"), REF_FIELD_MY_DOCUMENT, ""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_Номер"), FIELD_TYPE_STRING11, ""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_Дата"), FIELD_TYPE_DATETIME, ""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_Организация"), "", "true"));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_Организация_ОрганизацииСсылка"), KEY_FIELDS, ""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_Организация_ОрганизацииСсылка_Ссылка"),
				REF_FIELD_ORGANIZATION, ""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_Организация_ОрганизацииСсылка_Наименование"),
				FIELD_TYPE_STRING150, "true"));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_Организация_ОрганизацииСсылка_РегистрационныйНомерПФР"),
				FIELD_TYPE_STRING14, ""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_Организация_ОрганизацииСсылка_Префикс"),
				FIELD_TYPE_STRING2, ""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_Организация_ФизическиеЛицаСсылка"), KEY_FIELDS, ""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_Организация_ФизическиеЛицаСсылка_Ссылка"),
				REF_FIELD_PERSON, ""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_Организация_ФизическиеЛицаСсылка_ДатаРождения"), "Дата",
				""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_Организация_ФизическиеЛицаСсылка_Наименование"),
				FIELD_TYPE_STRING100, "true"));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_Организация_ФизическиеЛицаСсылка_Код"),
				FIELD_TYPE_STRING10, ""));

		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<>();

		mapKeyProperties.put(KEY_FIELDS_ORGANIZATIONS, getKeyPropertiesOrganization());

		EList<EdProperty> edProperties = new BasicEList<>();
		EdProperty edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName(FIELD_NAME_REF);
		edProperty.setType(REF_FIELD_PERSON);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("ДатаРождения");
		edProperty.setType("Дата");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName(FIELD_NAME_NAME);
		edProperty.setType(FIELD_TYPE_STRING100);
		edProperty.setRequired(true);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Код");
		edProperty.setType(FIELD_TYPE_STRING10);
		mapKeyProperties.put("КлючевыеСвойстваФизическиеЛица", edProperties);

		mapKeyProperties.put(KEY_FIELDS_MY_DOCUMENT, getKeyPropertiesMyDocumentMultiType(""));

		List<String> report2 = ConversionModuleReport.expandPropertyType(FIELD_NAME_VALUE, KEY_FIELDS_MY_DOCUMENT,
				false, mapKeyProperties);

		assertEquals("Описание формата: КлючевыеСвойства заполнен ключевой тип внутри несколько типов",
				report1.toString().replace(" ", System.lineSeparator()),
				report2.toString().replace(" ", System.lineSeparator()));
	}

	@Test
	public void testExpandPropertyTypeMultiKeyMultiType() {
		List<String> report1 = new ArrayList<>();
		report1.add(String.join(",", FIELD_NAME_VALUE, "", ""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_МойДокумент1Ссылка"), KEY_FIELDS, ""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_МойДокумент1Ссылка_Ссылка"),
				REF_FIELD_MY_DOCUMENT.concat("1"), ""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_МойДокумент1Ссылка_Номер"), FIELD_TYPE_STRING11, ""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_МойДокумент1Ссылка_Дата"), FIELD_TYPE_DATETIME, ""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_МойДокумент1Ссылка_Организация"), "", "true"));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_МойДокумент1Ссылка_Организация_ОрганизацииСсылка"),
				KEY_FIELDS, ""));
		report1.add(
				String.join(",", FIELD_NAME_VALUE.concat("_МойДокумент1Ссылка_Организация_ОрганизацииСсылка_Ссылка"),
						REF_FIELD_ORGANIZATION, ""));
		report1.add(String.join(",",
				FIELD_NAME_VALUE.concat("_МойДокумент1Ссылка_Организация_ОрганизацииСсылка_Наименование"),
				FIELD_TYPE_STRING150, "true"));
		report1.add(String.join(",",
				FIELD_NAME_VALUE.concat("_МойДокумент1Ссылка_Организация_ОрганизацииСсылка_РегистрационныйНомерПФР"),
				FIELD_TYPE_STRING14, ""));
		report1.add(
				String.join(",", FIELD_NAME_VALUE.concat("_МойДокумент1Ссылка_Организация_ОрганизацииСсылка_Префикс"),
						FIELD_TYPE_STRING2, ""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_МойДокумент1Ссылка_Организация_ФизическиеЛицаСсылка"),
				KEY_FIELDS, ""));
		report1.add(
				String.join(",", FIELD_NAME_VALUE.concat("_МойДокумент1Ссылка_Организация_ФизическиеЛицаСсылка_Ссылка"),
						REF_FIELD_PERSON, ""));
		report1.add(String.join(",",
				FIELD_NAME_VALUE.concat("_МойДокумент1Ссылка_Организация_ФизическиеЛицаСсылка_ДатаРождения"), "Дата",
				""));
		report1.add(String.join(",",
				FIELD_NAME_VALUE.concat("_МойДокумент1Ссылка_Организация_ФизическиеЛицаСсылка_Наименование"),
				FIELD_TYPE_STRING100, "true"));
		report1.add(
				String.join(",", FIELD_NAME_VALUE.concat("_МойДокумент1Ссылка_Организация_ФизическиеЛицаСсылка_Код"),
						FIELD_TYPE_STRING10, ""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_МойДокумент2Ссылка"), KEY_FIELDS, ""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_МойДокумент2Ссылка_Ссылка"),
				REF_FIELD_MY_DOCUMENT.concat("2"), ""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_МойДокумент2Ссылка_Номер"), FIELD_TYPE_STRING11, ""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_МойДокумент2Ссылка_Дата"), FIELD_TYPE_DATETIME, ""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_МойДокумент2Ссылка_Организация"), "", "true"));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_МойДокумент2Ссылка_Организация_ОрганизацииСсылка"),
				KEY_FIELDS, ""));
		report1.add(
				String.join(",", FIELD_NAME_VALUE.concat("_МойДокумент2Ссылка_Организация_ОрганизацииСсылка_Ссылка"),
						REF_FIELD_ORGANIZATION, ""));
		report1.add(String.join(",",
				FIELD_NAME_VALUE.concat("_МойДокумент2Ссылка_Организация_ОрганизацииСсылка_Наименование"),
				FIELD_TYPE_STRING150, "true"));
		report1.add(String.join(",",
				FIELD_NAME_VALUE.concat("_МойДокумент2Ссылка_Организация_ОрганизацииСсылка_РегистрационныйНомерПФР"),
				FIELD_TYPE_STRING14, ""));
		report1.add(
				String.join(",", FIELD_NAME_VALUE.concat("_МойДокумент2Ссылка_Организация_ОрганизацииСсылка_Префикс"),
						FIELD_TYPE_STRING2, ""));
		report1.add(String.join(",", FIELD_NAME_VALUE.concat("_МойДокумент2Ссылка_Организация_ФизическиеЛицаСсылка"),
				KEY_FIELDS, ""));
		report1.add(
				String.join(",", FIELD_NAME_VALUE.concat("_МойДокумент2Ссылка_Организация_ФизическиеЛицаСсылка_Ссылка"),
						REF_FIELD_PERSON, ""));
		report1.add(String.join(",",
				FIELD_NAME_VALUE.concat("_МойДокумент2Ссылка_Организация_ФизическиеЛицаСсылка_ДатаРождения"), "Дата",
				""));
		report1.add(String.join(",",
				FIELD_NAME_VALUE.concat("_МойДокумент2Ссылка_Организация_ФизическиеЛицаСсылка_Наименование"),
				FIELD_TYPE_STRING100, "true"));
		report1.add(
				String.join(",", FIELD_NAME_VALUE.concat("_МойДокумент2Ссылка_Организация_ФизическиеЛицаСсылка_Код"),
						FIELD_TYPE_STRING10, ""));

		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<>();

		mapKeyProperties.put(KEY_FIELDS_ORGANIZATIONS, getKeyPropertiesOrganization());

		EList<EdProperty> edProperties = new BasicEList<>();
		EdProperty edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName(FIELD_NAME_REF);
		edProperty.setType(REF_FIELD_PERSON);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("ДатаРождения");
		edProperty.setType("Дата");
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName(FIELD_NAME_NAME);
		edProperty.setType(FIELD_TYPE_STRING100);
		edProperty.setRequired(true);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Код");
		edProperty.setType(FIELD_TYPE_STRING10);
		mapKeyProperties.put("КлючевыеСвойстваФизическиеЛица", edProperties);

		mapKeyProperties.put(KEY_FIELDS_MY_DOCUMENT.concat("1"), getKeyPropertiesMyDocumentMultiType("1"));

		mapKeyProperties.put(KEY_FIELDS_MY_DOCUMENT.concat("2"), getKeyPropertiesMyDocumentMultiType("2"));

		List<String> report2 = ConversionModuleReport.expandPropertyType(FIELD_NAME_VALUE, KEY_FIELDS_TWO_DOCUMENTS,
				false, mapKeyProperties);

		assertEquals("Описание формата: КлючевыеСвойства заполнено несколько ключевых типов внутри несколько типов",
				report1.toString().replace(" ", System.lineSeparator()),
				report2.toString().replace(" ", System.lineSeparator()));
	}

	@Test
	public void testExpandPropertyTypeGroup() {
		List<String> report1 = new ArrayList<>();
		report1.add(String.join(",", FIELD_NAME_VALUE, KEY_FIELDS, ""));
		report1.add(String.join(",", "Значение_Ссылка", REF_FIELD_MY_DOCUMENT, ""));
		report1.add(String.join(",", "Значение_Номер", FIELD_TYPE_STRING11, ""));
		report1.add(String.join(",", "Значение_Дата", FIELD_TYPE_DATETIME, ""));
		report1.add(String.join(",", "Значение_Организация", KEY_FIELDS, "true"));
		report1.add(String.join(",", "Значение_Организация_Ссылка", REF_FIELD_ORGANIZATION, ""));
		report1.add(String.join(",", "Значение_Организация_Наименование", FIELD_TYPE_STRING150, "true"));
		report1.add(String.join(",", "Значение_Организация_РегистрационныйНомерПФР", FIELD_TYPE_STRING14, ""));
		report1.add(String.join(",", "Значение_Организация_Префикс", FIELD_TYPE_STRING2, ""));
		report1.add(String.join(",", "Значение_Подразделение", KEY_FIELDS, ""));
		report1.add(String.join(",", "Значение_Подразделение_Ссылка", REF_FIELD_DIVISION, ""));
		report1.add(String.join(",", "Значение_Подразделение_Владелец", KEY_FIELDS, "true"));
		report1.add(String.join(",", "Значение_Подразделение_Владелец_Ссылка", REF_FIELD_ORGANIZATION, ""));
		report1.add(String.join(",", "Значение_Подразделение_Владелец_Наименование", FIELD_TYPE_STRING150, "true"));
		report1.add(
				String.join(",", "Значение_Подразделение_Владелец_РегистрационныйНомерПФР", FIELD_TYPE_STRING14, ""));
		report1.add(String.join(",", "Значение_Подразделение_Владелец_Префикс", FIELD_TYPE_STRING2, ""));
		report1.add(String.join(",", "Значение_Подразделение_Наименование", FIELD_TYPE_STRING150, "true"));
		report1.add(String.join(",", "Значение_Подразделение_Родитель", KEY_FIELDS, ""));
		report1.add(String.join(",", "Значение_Подразделение_Родитель_Ссылка", REF_FIELD_DIVISION, ""));
		report1.add(String.join(",", "Значение_Подразделение_Родитель_Наименование", FIELD_TYPE_STRING150, "true"));
		report1.add(String.join(",", "Значение_Подразделение_Родитель_Код", FIELD_TYPE_STRING9, ""));
		report1.add(String.join(",", "Значение_Подразделение_Код", FIELD_TYPE_STRING9, ""));

		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<>();

		mapKeyProperties.put(KEY_FIELDS_ORGANIZATIONS, getKeyPropertiesOrganization());
		mapKeyProperties.put(KEY_FIELDS_DIVISIONS, getKeyPropertiedDivisions());

		EList<EdProperty> edProperties = new BasicEList<>();
		EdProperty edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName(FIELD_NAME_REF);
		edProperty.setType(REF_FIELD_MY_DOCUMENT);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName(FIELD_NAME_NUMBER);
		edProperty.setType(FIELD_TYPE_STRING11);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Дата");
		edProperty.setType(FIELD_TYPE_DATETIME);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName(FIELD_NAME_ORGANIZATION);
		edProperty.setType(KEY_FIELDS_ORGANIZATIONS);
		edProperty.setRequired(true);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Подразделение");
		edProperty.setType(KEY_FIELDS_DIVISIONS);
		mapKeyProperties.put(KEY_FIELDS_MY_DOCUMENT, edProperties);

		List<String> report2 = ConversionModuleReport.expandPropertyType(FIELD_NAME_VALUE, KEY_FIELDS_MY_DOCUMENT,
				false, mapKeyProperties);

		assertEquals("Описание формата: КлючевыеСвойства заполнена группа с родителем",
				report1.toString().replace(" ", System.lineSeparator()),
				report2.toString().replace(" ", System.lineSeparator()));
	}

	private MarkdownTable getIdentificationTable3() {
		MarkdownTable mdTable = new MarkdownTable(
				new String[] { "Порядок поиска по ключевым полям", "Реквизиты поиска" });
		mdTable.addRow(1, new String[][] { { "1", "0", "" }, { THREE_FIELDS, "0", "" } });
		mdTable.addRow(1, new String[][] { { "2", "0", "" }, { TWO_FIELDS, "0", "" } });
		mdTable.addRow(1, new String[][] { { "3", "0", "" }, { ONE_FIELD, "0", "" } });

		return mdTable;
	}

	private MarkdownTable getIdentificationTable1() {
		MarkdownTable mdTable = new MarkdownTable(
				new String[] { "Порядок поиска по ключевым полям", "Реквизиты поиска" });
		mdTable.addRow(1, new String[][] { { "1", "0", "" }, { ONE_FIELD, "0", "" } });

		return mdTable;
	}

	private EList<String> getFields3() {
		EList<String> fields = new BasicEList<>();
		fields.add(THREE_FIELDS);
		fields.add(TWO_FIELDS);
		fields.add(ONE_FIELD);

		return fields;
	}

	private EList<String> getFields1() {
		EList<String> fields = new BasicEList<>();
		fields.add(ONE_FIELD);

		return fields;
	}

	private EList<EdProperty> getKeyPropertiesOrganization() {
		EList<EdProperty> edProperties = new BasicEList<>();
		EdProperty edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName(FIELD_NAME_REF);
		edProperty.setType(REF_FIELD_ORGANIZATION);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName(FIELD_NAME_NAME);
		edProperty.setType(FIELD_TYPE_STRING150);
		edProperty.setRequired(true);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("РегистрационныйНомерПФР");
		edProperty.setType(FIELD_TYPE_STRING14);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Префикс");
		edProperty.setType(FIELD_TYPE_STRING2);

		return edProperties;
	}

	private EList<EdProperty> getKeyPropertiedDivisions() {
		EList<EdProperty> edProperties = new BasicEList<>();
		EdProperty edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName(FIELD_NAME_REF);
		edProperty.setType(REF_FIELD_DIVISION);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName(FIELD_NAME_OWNER);
		edProperty.setType(KEY_FIELDS_ORGANIZATIONS);
		edProperty.setRequired(true);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName(FIELD_NAME_NAME);
		edProperty.setType(FIELD_TYPE_STRING150);
		edProperty.setRequired(true);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Родитель");
		edProperty.setType(KEY_FIELDS_DIVISIONS);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Код");
		edProperty.setType(FIELD_TYPE_STRING9);

		return edProperties;
	}

	private EList<EdProperty> getKeyPropertiesMyDocumentSingleType(String postfix) {
		EList<EdProperty> edProperties = new BasicEList<>();
		EdProperty edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName(FIELD_NAME_REF);
		edProperty.setType(REF_FIELD_MY_DOCUMENT + postfix);
		edProperty.setRequired(true);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName(FIELD_NAME_NUMBER);
		edProperty.setType(FIELD_TYPE_STRING11);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Дата");
		edProperty.setType(FIELD_TYPE_DATETIME);
		if (!postfix.isEmpty()) {
			edProperty = edFactory.eINSTANCE.createEdProperty();
			edProperties.add(edProperty);
			edProperty.setName(FIELD_NAME_ORGANIZATION);
			edProperty.setType(KEY_FIELDS_ORGANIZATIONS);
			edProperty.setRequired(true);
		}

		return edProperties;
	}

	private EList<EdProperty> getKeyPropertiesMyDocumentMultiType(String postfix) {
		EList<EdProperty> edProperties = new BasicEList<>();
		EdProperty edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName(FIELD_NAME_REF);
		edProperty.setType(REF_FIELD_MY_DOCUMENT + postfix);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName(FIELD_NAME_NUMBER);
		edProperty.setType(FIELD_TYPE_STRING11);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName("Дата");
		edProperty.setType(FIELD_TYPE_DATETIME);
		edProperty = edFactory.eINSTANCE.createEdProperty();
		edProperties.add(edProperty);
		edProperty.setName(FIELD_NAME_ORGANIZATION);
		edProperty.setType(
				"ОрганизацииСсылка:КлючевыеСвойстваОрганизации;ФизическиеЛицаСсылка:КлючевыеСвойстваФизическиеЛица");
		edProperty.setRequired(true);

		return edProperties;
	}

	private ArrayList<String> getDocumentReport(String postfix) {
		String fieldName = "Значение_МойДокумент".concat(postfix).concat(FIELD_NAME_REF);

		ArrayList<String> report = new ArrayList<>();
		report.add(String.join(",", fieldName, KEY_FIELDS, ""));
		report.add(String.join(",", fieldName.concat("_Ссылка"), REF_FIELD_MY_DOCUMENT.concat(postfix), "true"));
		report.add(String.join(",", fieldName.concat("_Номер"), FIELD_TYPE_STRING11, ""));
		report.add(String.join(",", fieldName.concat("_Дата"), FIELD_TYPE_DATETIME, ""));
		report.add(String.join(",", fieldName.concat("_Организация"), KEY_FIELDS, "true"));
		report.add(String.join(",", fieldName.concat("_Организация_Ссылка"), REF_FIELD_ORGANIZATION, ""));
		report.add(String.join(",", fieldName.concat("_Организация_Наименование"), FIELD_TYPE_STRING150, "true"));
		report.add(String.join(",", fieldName.concat("_Организация_РегистрационныйНомерПФР"), FIELD_TYPE_STRING14, ""));
		report.add(String.join(",", fieldName.concat("_Организация_Префикс"), FIELD_TYPE_STRING2, ""));

		return report;
	}
}
