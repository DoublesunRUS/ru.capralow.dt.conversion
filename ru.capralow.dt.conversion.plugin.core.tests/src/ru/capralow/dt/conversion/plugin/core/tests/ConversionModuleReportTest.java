package ru.capralow.dt.conversion.plugin.core.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import com._1c.g5.v8.dt.xdto.model.Enumeration;
import com._1c.g5.v8.dt.xdto.model.XdtoFactory;

import ru.capralow.dt.conversion.plugin.core.ConversionModuleReport;
import ru.capralow.dt.conversion.plugin.core.MarkdownTable;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdDefinedType;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdType;
import ru.capralow.dt.conversion.plugin.core.ed.model.edFactory;

public class ConversionModuleReportTest {
	private static final String KEY_FIELDS = "КлючевыеСвойства";
	private static final String KEY_FIELDS_ORGANIZATIONS = "КлючевыеСвойстваОрганизации";
	private static final String KEY_FIELDS_MY_DOCUMENT = "КлючевыеСвойстваМойДокумент";

	private static final String FIELD_TYPE_STRING11 = "Строка(11)";
	private static final String FIELD_TYPE_DATETIME = "ДатаВремя";

	private static final String FIELD_NAME_REF = "Ссылка";
	private static final String FIELD_NAME_NUMBER = "Номер";
	private static final String FIELD_NAME_DATE = "Дата";
	private static final String FIELD_NAME_ORGANIZATION = "Организация";

	private static final String REF_FIELD_MY_DOCUMENT = "ДокументСсылка.МойДокумент";

	private static EList<EdProperty> getKeyPropertiesMyDocumentSingleType(String postfix) {
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

	@Test
	public void tesDefinedTypesEmpty() {
		String report1 = "";

		String report2 = ConversionModuleReport.createDefinedTypesReport(new BasicEList<EdDefinedType>(),
				new HashMap<String, EList<EdProperty>>());

		assertEquals("Описание формата: Определяемые типы отсутствуют", report1, report2);
	}

	@Test
	public void testDefinedTypes() {
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
	public void testEnums() {
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
	public void testEnumsEmpty() {
		String report1 = "";

		String report2 = ConversionModuleReport.createEnumsReport(new BasicEList<EdEnum>());

		assertEquals("Описание формата: Перечисления отсутствуют", report1, report2);
	}
}
