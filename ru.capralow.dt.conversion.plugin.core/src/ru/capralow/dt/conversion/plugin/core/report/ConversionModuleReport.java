package ru.capralow.dt.conversion.plugin.core.report;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.antlr.stringtemplate.StringTemplate;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Pair;

import com._1c.g5.v8.dt.metadata.mdclass.AccumulationRegister;
import com._1c.g5.v8.dt.metadata.mdclass.BasicRegister;
import com._1c.g5.v8.dt.metadata.mdclass.CalculationRegister;
import com._1c.g5.v8.dt.metadata.mdclass.Catalog;
import com._1c.g5.v8.dt.metadata.mdclass.CatalogTabularSection;
import com._1c.g5.v8.dt.metadata.mdclass.ChartOfCalculationTypes;
import com._1c.g5.v8.dt.metadata.mdclass.ChartOfCalculationTypesTabularSection;
import com._1c.g5.v8.dt.metadata.mdclass.ChartOfCharacteristicTypes;
import com._1c.g5.v8.dt.metadata.mdclass.ChartOfCharacteristicTypesTabularSection;
import com._1c.g5.v8.dt.metadata.mdclass.Document;
import com._1c.g5.v8.dt.metadata.mdclass.DocumentTabularSection;
import com._1c.g5.v8.dt.metadata.mdclass.Enum;
import com._1c.g5.v8.dt.metadata.mdclass.InformationRegister;
import com._1c.g5.v8.dt.metadata.mdclass.MdObject;
import com._1c.g5.v8.dt.metadata.mdclass.StandardAttribute;
import com._1c.g5.v8.dt.metadata.mdclass.StandardTabularSectionDescription;
import com._1c.g5.v8.dt.xdto.model.Enumeration;
import com.google.common.io.CharSource;
import com.google.common.io.CharStreams;
import com.google.common.io.Resources;

import ru.capralow.dt.conversion.plugin.core.ConversionPlugin;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem;
import ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmFactory;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdDefinedType;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdObject;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdType;
import ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData;
import ru.capralow.dt.conversion.plugin.core.rg.model.RgGroup;
import ru.capralow.dt.conversion.plugin.core.rg.model.RgRule;
import ru.capralow.dt.conversion.plugin.core.rg.model.RgVariant;
import ru.capralow.dt.conversion.plugin.core.utils.MarkdownTable;

public class ConversionModuleReport {
	private static final String ATTRIBUTE_FORMATVERSION = "FormatVersion";
	private static final String ATTRIBUTE_OBJECTRULES = "ObjectRules";
	private static final String KEY_FIELD_REF = "Ссылка";
	private static final String TABULAR_SECTION_REGISTER = "НаборЗаписей";

	public static String createDefinedTypesReport(EList<EdDefinedType> edDefinedTypes,
			Map<String, EList<EdProperty>> mapKeyProperties) {
		if (edDefinedTypes.isEmpty())
			return "";

		final String TEMPLATE_NAME = "ReceivingDefinedTypes.txt";
		String templateContent = readContents(getFileInputSupplier(TEMPLATE_NAME));

		StringTemplate template = new StringTemplate(templateContent);

		MarkdownTable mdTable = new MarkdownTable(new String[] { "Имя типа", "Состав типа" });

		for (EdDefinedType edDefinedType : edDefinedTypes) {
			EList<EdType> edTypes = edDefinedType.getTypes();

			StringBuilder definedTypesType = new StringBuilder();
			for (EdType edType : edTypes) {
				if (definedTypesType.length() != 0)
					definedTypesType.append(";");
				definedTypesType.append(edType.getName()).append(":").append(edType.getPropertyType());
			}

			List<String> definedTypes = expandPropertyType(edDefinedType.getName(),
					definedTypesType.toString(),
					false,
					mapKeyProperties);
			for (String definedType : definedTypes) {
				String[] definedTypeArray = definedType.split("[,]", 3);

				String[] definedTypeName = definedTypeArray[0].split("[_]");

				String numOfTabs = Integer.toString(definedTypeName.length - 1);
				mdTable.addRow(1,
						new String[][] {
								{
										(definedTypeName.length == 1 ? "" : "_")
												+ definedTypeName[definedTypeName.length - 1],
										numOfTabs,
										"" },
								{ definedTypeArray[1], numOfTabs, "" } });
			}
		}

		template.setAttribute("Rows", mdTable.getTable());

		return template.toString();
	}

	public static String createEnumsReport(EList<EdEnum> edEnums) {
		if (edEnums.isEmpty())
			return "";

		final String TEMPLATE_NAME = "ReceivingEnums.txt";
		String templateContent = readContents(getFileInputSupplier(TEMPLATE_NAME));

		StringTemplate template = new StringTemplate(templateContent);

		MarkdownTable mdTable = new MarkdownTable(new String[] { "Имя перечисления", "Значения" });

		for (EdEnum edEnum : edEnums) {
			boolean firstRow = true;
			for (Enumeration enumeration : edEnum.getEnumerations()) {
				if (firstRow) {
					mdTable.addRow(1,
							new String[][] { { edEnum.getName(), "0", "" }, { enumeration.getContent(), "0", "" } });

					firstRow = false;

				} else {
					mdTable.addRow(1, new String[][] { { "", "0", "" }, { enumeration.getContent(), "0", "" } });

				}
			}
		}

		template.setAttribute("Rows", mdTable.getTable());

		return template.toString();
	}

	public static String createFullReport(RgVariant rgVariant, EnterpriseData enterpriseDataPackage,
			ConversionModule conversionModule) {
		final String TEMPLATE_NAME_MAIN = "ReceivingConversionReport.txt";
		String templateMainContent = readContents(getFileInputSupplier(TEMPLATE_NAME_MAIN));

		StringTemplate templateMain = new StringTemplate(templateMainContent);

		String groupObjects = "";

		EList<EdDefinedType> edDefinedTypes = new BasicEList<>();
		EList<EdEnum> edEnums = new BasicEList<>();

		Map<String, EList<EdProperty>> mapKeyProperties = getKeyPropertiesMap(conversionModule.getObjectRules(),
				enterpriseDataPackage);

		if (rgVariant != null) {
			templateMain.setAttribute(ATTRIBUTE_FORMATVERSION,
					rgVariant.getName() + " " + enterpriseDataPackage.getVersion());

			groupObjects = createFullReportForVariant(rgVariant,
					mapKeyProperties,
					edDefinedTypes,
					edEnums,
					enterpriseDataPackage,
					conversionModule);

		} else {
			templateMain.setAttribute(ATTRIBUTE_FORMATVERSION, enterpriseDataPackage.getVersion());

			groupObjects = createFullReportForSubsystems(conversionModule.getSubsystems(),
					mapKeyProperties,
					edDefinedTypes,
					edEnums,
					enterpriseDataPackage,
					conversionModule);
		}

		templateMain.setAttribute(ATTRIBUTE_OBJECTRULES, groupObjects);

		templateMain.setAttribute("DefinedTypes", createDefinedTypesReport(edDefinedTypes, mapKeyProperties));

		templateMain.setAttribute("Enums", createEnumsReport(edEnums));

		return templateMain.toString();
	}

	public static String createIdentificationReport(CmIdentificationVariant identificationVariant,
			EList<String> identificationFields) {
		if (identificationVariant == null)
			return "**Вариант идентификации: Не определен**";

		if (identificationVariant == CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS && identificationFields.isEmpty())
			identificationVariant = CmIdentificationVariant.UUID;

		StringBuilder result = new StringBuilder();
		result.append("**Вариант идентификации: " + identificationVariant + "**");

		if (identificationVariant != CmIdentificationVariant.UUID && !identificationFields.isEmpty()) {
			MarkdownTable mdTable = new MarkdownTable(
					new String[] { "Порядок поиска по ключевым полям", "Реквизиты поиска" });

			for (String identificationField : identificationFields)
				mdTable.addRow(1,
						new String[][] {
								{ Integer.toString(identificationFields.indexOf(identificationField) + 1), "0", "" },
								{ identificationField, "0", "" } });

			result.append(System.lineSeparator()).append(System.lineSeparator()).append(mdTable.getTable());

		} else {
			result.append(System.lineSeparator());

		}

		return result.toString();
	}

	public static String createManualReport(RgVariant rgVariant, EnterpriseData enterpriseDataPackage,
			ConversionModule conversionModule) {
		final String TEMPLATE_NAME_MAIN = "ReceivingConversionReport.txt";
		String templateMainContent = readContents(getFileInputSupplier(TEMPLATE_NAME_MAIN));

		StringTemplate templateMain = new StringTemplate(templateMainContent);

		String groupObjects = "";

		EList<EdDefinedType> edDefinedTypes = new BasicEList<>();
		EList<EdEnum> edEnums = new BasicEList<>();

		Map<String, EList<EdProperty>> mapKeyProperties = getKeyPropertiesMap(conversionModule.getObjectRules(),
				enterpriseDataPackage);

		if (rgVariant != null) {
			templateMain.setAttribute(ATTRIBUTE_FORMATVERSION,
					rgVariant.getName() + " " + enterpriseDataPackage.getVersion());

			groupObjects = createManualReportForVariant(rgVariant,
					mapKeyProperties,
					edDefinedTypes,
					edEnums,
					enterpriseDataPackage,
					conversionModule);

		} else {
			templateMain.setAttribute(ATTRIBUTE_FORMATVERSION, enterpriseDataPackage.getVersion());

			groupObjects = createManualReportForSubsystems(conversionModule.getSubsystems(),
					mapKeyProperties,
					edDefinedTypes,
					edEnums,
					enterpriseDataPackage,
					conversionModule);
		}

		templateMain.setAttribute(ATTRIBUTE_OBJECTRULES, groupObjects);

		templateMain.setAttribute("DefinedTypes", createDefinedTypesReport(edDefinedTypes, mapKeyProperties));

		templateMain.setAttribute("Enums", createEnumsReport(edEnums));

		return templateMain.toString();
	}

	public static String createObjectsReport(RgVariant rgVariant, EnterpriseData enterpriseDataPackage,
			ConversionModule conversionModule) {
		final String TEMPLATE_NAME_MAIN = "ReceivingObjectsList.txt";
		String templateMainContent = readContents(getFileInputSupplier(TEMPLATE_NAME_MAIN));

		StringTemplate templateMain = new StringTemplate(templateMainContent);

		MarkdownTable mdTable = new MarkdownTable(new String[] {
				"Наименование",
				"Объект формата",
				"Объект конфигурации",
				"Правила поиска",
				"Примечание" });

		if (rgVariant != null) {
			templateMain.setAttribute(ATTRIBUTE_FORMATVERSION,
					rgVariant.getName() + " " + enterpriseDataPackage.getVersion());

			createObjectsReportForVariant(mdTable, rgVariant, conversionModule);

		} else {
			templateMain.setAttribute(ATTRIBUTE_FORMATVERSION, enterpriseDataPackage.getVersion());

			createObjectsReportForSubsystems(mdTable, conversionModule.getSubsystems(), conversionModule);
		}

		templateMain.setAttribute("TabularRows", mdTable.getTable());

		return templateMain.toString();
	}

	public static List<String> expandPropertyType(String propertyName, String propertyType, Boolean propertyRequired,
			Map<String, EList<EdProperty>> mapKeyProperties) {
		List<String> listProperties = new ArrayList<>();

		if (propertyType.isEmpty()) {
			if (!propertyName.isEmpty())
				listProperties.add(String.join(",", propertyName, "**Не указан тип**", propertyRequired ? "true" : ""));

			return listProperties;
		}

		String[] subPropertyTypes = propertyType.split("[;]");
		if (subPropertyTypes.length == 1)
			addSingleType(listProperties, subPropertyTypes, propertyName, propertyRequired, mapKeyProperties);

		else
			addMultiType(listProperties, subPropertyTypes, propertyName, propertyRequired, mapKeyProperties);

		return listProperties;
	}

	public static Map<String, EList<EdProperty>> getKeyPropertiesMap(EList<CmObjectRule> objectRules,
			EnterpriseData enterpriseDataPackage) {
		Map<String, EList<EdProperty>> mapKeyProperties = new HashMap<>();

		for (CmObjectRule objectRule : objectRules) {
			if (objectRule.getFormatObject().isEmpty())
				continue;

			EdObject formatObject = enterpriseDataPackage.getObject(objectRule.getFormatObject());
			if (formatObject == null) {
				String msg = MessageFormat.format("В версии формата \"{0}\" не найден объект \"{1}\".",
						enterpriseDataPackage.getVersion(),
						objectRule.getFormatObject());
				ConversionPlugin.log(ConversionPlugin.createWarningStatus(msg));
				continue;
			}

			EList<EdProperty> edKeyProperties = getKeyPropertiesList(objectRule, formatObject);

			mapKeyProperties.put(formatObject.getKeysName(), edKeyProperties);
		}

		return mapKeyProperties;
	}

	private static void addDefinedTypesAndEnums(List<String> listPropertyTypes, EList<EdDefinedType> edDefinedTypes,
			EList<EdEnum> edEnums, EnterpriseData enterpriseDataPackage) {
		for (String propertyType : listPropertyTypes) {
			String propertyTypeType = propertyType.split("[,]", 3)[1];

			EdDefinedType edDefinedType = enterpriseDataPackage.getDefinedType(propertyTypeType);
			if (edDefinedType != null && !edDefinedTypes.contains(edDefinedType))
				edDefinedTypes.add(edDefinedType);

			EdEnum edEnum = enterpriseDataPackage.getEnum(propertyTypeType);
			if (edEnum != null && !edEnums.contains(edEnum))
				edEnums.add(edEnum);
		}
	}

	private static void addMultiType(List<String> listProperties, String[] subPropertyTypes, String propertyName,
			Boolean propertyRequired, Map<String, EList<EdProperty>> mapKeyProperties) {
		listProperties.add(String.join(",", propertyName, "", propertyRequired ? "true" : ""));

		for (String subPropertyType : subPropertyTypes)
			listProperties
					.addAll(expandPropertyType(propertyName.concat("_"), subPropertyType, false, mapKeyProperties));
	}

	private static void addRefToObjects(List<CmAttributeRule> attributeRules, CmObjectRule cmObjectRule,
			MdObject configurationObject) {
		if (configurationObject instanceof InformationRegister)
			return;
		for (CmAttributeRule attributeRule : attributeRules)
			if (attributeRule.getConfigurationAttribute().equals(KEY_FIELD_REF))
				return;

		CmAttributeRule refAttributeRule = cmFactory.eINSTANCE.createCmAttributeRule();

		refAttributeRule.setConfigurationAttribute(KEY_FIELD_REF);

		if (!cmObjectRule.getFormatObject().isEmpty())
			refAttributeRule.setFormatAttribute(KEY_FIELD_REF);

		refAttributeRule.setObjectRule(cmObjectRule);

		attributeRules.add(0, refAttributeRule);
	}

	private static void addSingleType(List<String> listProperties, String[] subPropertyTypes, String propertyName,
			Boolean propertyRequired, Map<String, EList<EdProperty>> mapKeyProperties) {
		Pair<String, String> propertyNameAndType = getPropertyNameAndType(subPropertyTypes[0]);
		String subPropertyTypeName = propertyNameAndType.getKey();
		String subPropertyTypeType = propertyNameAndType.getValue();

		if (subPropertyTypeType.startsWith("КлючевыеСвойства")) {
			expandKeyProperties(listProperties,
					subPropertyTypeName,
					subPropertyTypeType,
					propertyName,
					propertyRequired,
					mapKeyProperties);

		} else {
			listProperties.add(String.join(",",
					propertyName.concat(subPropertyTypeName),
					subPropertyTypeType,
					propertyRequired ? "true" : ""));

		}
	}

	private static void addTabularSectionRowForEmptyFormatAttribute(CmAttributeRule attributeRule,
			MarkdownTable tabularSectionRow, Map<String, String> attributeSynonyms) {
		String formatAttribute = attributeRule.getFormatAttribute();

		String propertyType = attributeRule.getFormatAttributeFullName().length() != 0 ? "<Свойство формата не найдено>"
				: "";

		String attributeSynonym = attributeSynonyms.get(attributeRule.getConfigurationAttributeFullName());
		if (attributeSynonym == null)
			attributeSynonym = attributeRule.getConfigurationAttribute();

		String required = "";

		String comment = "";
		if (attributeRule.getFormatAttribute().isEmpty())
			comment = "<Заполняется алгоритмом>";

		tabularSectionRow.addRow(1,
				new String[][] {
						{ formatAttribute, "0", "" },
						{ propertyType, "0", "" },
						{ attributeSynonym, "0", "" },
						{ required, "0", "" },
						{ comment, "0", "" } });

	}

	private static void addTabularSectionRowForPropertyType(String propertyType, MarkdownTable tabularSectionRow,
			boolean isKey, String attributeSynonym, String comment, boolean firstRow) {
		String[] propertyTypeArray = propertyType.split("[,]", 3);

		String propertyTypeName = propertyTypeArray[0];
		String propertyTypeType = propertyTypeArray[1];
		String propertyTypeRequired = propertyTypeArray[2];

		String[] propertyTypeNameArray = propertyTypeName.split("[_]");

		String numOfTabs = Integer.toString(propertyTypeNameArray.length - 1);
		tabularSectionRow.addRow(isKey ? 1 : 2,
				new String[][] {
						{
								(propertyTypeNameArray.length == 1 ? "" : "_")
										+ propertyTypeNameArray[propertyTypeNameArray.length - 1],
								numOfTabs,
								isKey ? "*" : "" },
						{ propertyTypeType, numOfTabs, isKey ? "*" : "" },
						{ firstRow ? attributeSynonym : "", "0", isKey ? "*" : "" },
						{ propertyTypeRequired.equals("true") ? "Да" : "", "0", isKey ? "*" : "" },
						{ firstRow ? comment : "", "0", isKey ? "*" : "" } });
	}

	private static void addTabularSectionRowsForEdProperty(CmAttributeRule attributeRule,
			MarkdownTable tabularSectionRow, EdProperty edProperty, Map<String, String> attributeSynonyms,
			List<String> listPropertyTypes) {
		boolean isKey = edProperty.getIsKey();

		String attributeSynonym = attributeSynonyms.get(attributeRule.getConfigurationAttributeFullName());
		if (attributeSynonym == null)
			attributeSynonym = attributeRule.getConfigurationAttribute();

		String comment = "";
		if (attributeRule.getFormatAttribute().isEmpty())
			comment = "<Заполняется алгоритмом>";

		boolean firstRow = true;
		for (String propertyType : listPropertyTypes) {

			addTabularSectionRowForPropertyType(propertyType,
					tabularSectionRow,
					isKey,
					attributeSynonym,
					comment,
					firstRow);

			if (firstRow)
				firstRow = false;
		}

	}

	private static String createFullReportForSubsystems(EList<CmSubsystem> cmSubsystems,
			Map<String, EList<EdProperty>> mapKeyProperties, EList<EdDefinedType> edDefinedTypes, EList<EdEnum> edEnums,
			EnterpriseData enterpriseDataPackage, ConversionModule conversionModule) {
		final String TEMPLATE_NAME_GROUP = "ReceivingGroup.txt";
		String templateGroupContent = readContents(getFileInputSupplier(TEMPLATE_NAME_GROUP));

		StringBuilder groupObjects = new StringBuilder();

		for (CmSubsystem cmSubsystem : cmSubsystems) {
			EList<CmObjectRule> receivingObjectRules = conversionModule.getReceivingObjectRules(cmSubsystem);
			if (receivingObjectRules.isEmpty())
				continue;

			StringTemplate templateGroups = new StringTemplate(templateGroupContent);

			templateGroups.setAttribute("GroupName", cmSubsystem.getName());

			StringBuilder objects = new StringBuilder();
			for (CmObjectRule objectRule : receivingObjectRules)
				objects.append(
						getFullObject(objectRule, mapKeyProperties, edDefinedTypes, edEnums, enterpriseDataPackage));
			templateGroups.setAttribute(ATTRIBUTE_OBJECTRULES, objects);

			groupObjects.append(templateGroups.toString());
		}

		return groupObjects.toString();
	}

	private static String createFullReportForVariant(RgVariant rgVariant,
			Map<String, EList<EdProperty>> mapKeyProperties, EList<EdDefinedType> edDefinedTypes, EList<EdEnum> edEnums,
			EnterpriseData enterpriseDataPackage, ConversionModule conversionModule) {
		final String TEMPLATE_NAME_GROUP = "ReceivingGroup.txt";
		String templateGroupContent = readContents(getFileInputSupplier(TEMPLATE_NAME_GROUP));

		StringBuilder groupObjects = new StringBuilder();

		for (RgGroup rgGroup : rgVariant.getGroups()) {
			StringTemplate templateGroups = new StringTemplate(templateGroupContent);

			templateGroups.setAttribute("GroupName", rgGroup.getName());

			StringBuilder objects = new StringBuilder();
			for (RgRule rgRule : rgGroup.getRules()) {
				CmDataRule dataRule = conversionModule.getDataRule(rgRule.getName());
				if (dataRule == null)
					continue;

				for (CmObjectRule objectRule : dataRule.getObjectRules())
					objects.append(getFullObject((CmObjectRule) objectRule,
							mapKeyProperties,
							edDefinedTypes,
							edEnums,
							enterpriseDataPackage));
			}

			templateGroups.setAttribute(ATTRIBUTE_OBJECTRULES, objects);

			groupObjects.append(templateGroups.toString());

		}

		return groupObjects.toString();
	}

	private static String createManualReportForSubsystems(EList<CmSubsystem> cmSubsystems,
			Map<String, EList<EdProperty>> mapKeyProperties, EList<EdDefinedType> edDefinedTypes, EList<EdEnum> edEnums,
			EnterpriseData enterpriseDataPackage, ConversionModule conversionModule) {
		final String TEMPLATE_NAME_GROUP = "ReceivingGroup.txt";
		String templateGroupContent = readContents(getFileInputSupplier(TEMPLATE_NAME_GROUP));

		StringBuilder groupObjects = new StringBuilder();

		for (CmSubsystem cmSubsystem : cmSubsystems) {
			EList<CmObjectRule> receivingObjectRules = conversionModule.getReceivingObjectRules(cmSubsystem);
			if (receivingObjectRules.isEmpty())
				continue;

			StringTemplate templateGroups = new StringTemplate(templateGroupContent);

			templateGroups.setAttribute("GroupName", cmSubsystem.getName());

			StringBuilder objects = new StringBuilder();
			for (CmObjectRule objectRule : receivingObjectRules)
				objects.append(
						getManualObject(objectRule, mapKeyProperties, edDefinedTypes, edEnums, enterpriseDataPackage));
			templateGroups.setAttribute(ATTRIBUTE_OBJECTRULES, objects);

			groupObjects.append(templateGroups.toString());
		}

		return groupObjects.toString();
	}

	private static String createManualReportForVariant(RgVariant rgVariant,
			Map<String, EList<EdProperty>> mapKeyProperties, EList<EdDefinedType> edDefinedTypes, EList<EdEnum> edEnums,
			EnterpriseData enterpriseDataPackage, ConversionModule conversionModule) {
		final String TEMPLATE_NAME_GROUP = "ReceivingGroup.txt";
		String templateGroupContent = readContents(getFileInputSupplier(TEMPLATE_NAME_GROUP));

		StringBuilder groupObjects = new StringBuilder();

		for (RgGroup rgGroup : rgVariant.getGroups()) {
			StringTemplate templateGroups = new StringTemplate(templateGroupContent);

			templateGroups.setAttribute("GroupName", rgGroup.getName());

			StringBuilder objects = new StringBuilder();
			for (RgRule rgRule : rgGroup.getRules()) {
				CmDataRule dataRule = conversionModule.getDataRule(rgRule.getName());
				if (dataRule == null)
					continue;

				for (CmObjectRule objectRule : dataRule.getObjectRules())
					objects.append(getManualObject((CmObjectRule) objectRule,
							mapKeyProperties,
							edDefinedTypes,
							edEnums,
							enterpriseDataPackage));
			}

			templateGroups.setAttribute(ATTRIBUTE_OBJECTRULES, objects);

			groupObjects.append(templateGroups.toString());

		}

		return groupObjects.toString();
	}

	private static void createObjectsReportForSubsystems(MarkdownTable mdTable, EList<CmSubsystem> cmSubsystems,
			ConversionModule conversionModule) {
		for (CmSubsystem cmSubsystem : cmSubsystems) {
			EList<CmObjectRule> receivingObjectRules = conversionModule.getReceivingObjectRules(cmSubsystem);
			if (receivingObjectRules.isEmpty())
				continue;

			for (CmObjectRule objectRule : receivingObjectRules)
				mdTable.addRow(1, getObjectRow(objectRule));
		}
	}

	private static void createObjectsReportForVariant(MarkdownTable mdTable, RgVariant rgVariant,
			ConversionModule conversionModule) {
		for (RgGroup rgGroup : rgVariant.getGroups()) {
			mdTable.addRow(1,
					new String[][] {
							{ rgGroup.getName(), "0", "**" },
							{ "", "0", "" },
							{ "", "0", "" },
							{ "", "0", "" },
							{ "", "0", "" } });

			for (RgRule rgRule : rgGroup.getRules()) {
				CmDataRule dataRule = conversionModule.getDataRule(rgRule.getName());
				if (dataRule == null)
					continue;

				for (CmObjectRule objectRule : dataRule.getObjectRules())
					mdTable.addRow(1, getObjectRow((CmObjectRule) objectRule));
			}
		}
	}

	private static void expandKeyProperties(List<String> listProperties, String subPropertyTypeName,
			String subPropertyTypeType, String propertyName, Boolean propertyRequired,
			Map<String, EList<EdProperty>> mapKeyProperties) {
		EList<EdProperty> subPropertyKeys = mapKeyProperties.get(subPropertyTypeType);
		if (subPropertyKeys == null) {
			listProperties.add(String.join(",",
					propertyName.concat(subPropertyTypeName),
					String.format("**Не найдены %1$s**", subPropertyTypeType),
					propertyRequired ? "true" : ""));
			return;
		}

		listProperties.add(String.join(",",
				propertyName.concat(subPropertyTypeName),
				"КлючевыеСвойства",
				propertyRequired ? "true" : ""));
		for (EdProperty subPropertyKey : subPropertyKeys) {
			String subPropertyName = propertyName.concat(subPropertyTypeName).concat("_")
					.concat(subPropertyKey.getName());
			if (propertyName.endsWith(subPropertyKey.getName()) || subPropertyName.endsWith("Родитель_Владелец"))
				continue;
			listProperties.addAll(expandPropertyType(subPropertyName,
					subPropertyKey.getType(),
					subPropertyKey.getRequired(),
					mapKeyProperties));
		}

	}

	private static Map<String, String> getAccumulationRegisterAttributesSynonyms(AccumulationRegister registerObject) {
		Map<String, String> attributeSynonyms = new HashMap<>();

		for (StandardAttribute attribute : registerObject.getStandardAttributes())
			attributeSynonyms.put(registerObject.getName().concat(".").concat(attribute.getName()),
					attribute.getSynonym().get("ru"));
		for (MdObject attribute : registerObject.getDimensions())
			attributeSynonyms.put(registerObject.getName().concat(".").concat(attribute.getName()),
					attribute.getSynonym().get("ru"));
		for (MdObject attribute : registerObject.getResources())
			attributeSynonyms.put(registerObject.getName().concat(".").concat(attribute.getName()),
					attribute.getSynonym().get("ru"));
		for (MdObject attribute : registerObject.getAttributes())
			attributeSynonyms.put(registerObject.getName().concat(".").concat(attribute.getName()),
					attribute.getSynonym().get("ru"));

		return attributeSynonyms;
	}

	private static Pair<Map<String, String>, Map<String, String>> getAttributesSynonyms(MdObject configurationObject) {
		Map<String, String> attributeSynonyms = new HashMap<>();
		Map<String, String> tabularSectionSynonyms = new HashMap<>();

		// TODO: Добавить синонимы для стандартных реквизитов
		if (configurationObject instanceof Catalog) {
			return getCatalogAttributesSynonyms((Catalog) configurationObject);

		} else if (configurationObject instanceof Document) {
			return getDocumentAttributesSynonyms((Document) configurationObject);

		} else if (configurationObject instanceof ChartOfCharacteristicTypes) {
			return getChartOfCharacteristicTypesSynonyms((ChartOfCharacteristicTypes) configurationObject);

		} else if (configurationObject instanceof ChartOfCalculationTypes) {
			return getChartOfCalculationTypesSynonyms((ChartOfCalculationTypes) configurationObject);

		} else if (configurationObject instanceof InformationRegister) {
			return getInformationRegisterSynonyms((InformationRegister) configurationObject);

		}

		return new Pair<>(attributeSynonyms, tabularSectionSynonyms);
	}

	private static Map<String, String> getCalculationRegisterAttributesSynonyms(CalculationRegister registerObject) {
		Map<String, String> attributeSynonyms = new HashMap<>();

		for (StandardAttribute attribute : registerObject.getStandardAttributes())
			attributeSynonyms.put(registerObject.getName().concat(".").concat(attribute.getName()),
					attribute.getSynonym().get("ru"));
		for (MdObject attribute : registerObject.getDimensions())
			attributeSynonyms.put(registerObject.getName().concat(".").concat(attribute.getName()),
					attribute.getSynonym().get("ru"));
		for (MdObject attribute : registerObject.getResources())
			attributeSynonyms.put(registerObject.getName().concat(".").concat(attribute.getName()),
					attribute.getSynonym().get("ru"));
		for (MdObject attribute : registerObject.getAttributes())
			attributeSynonyms.put(registerObject.getName().concat(".").concat(attribute.getName()),
					attribute.getSynonym().get("ru"));

		return attributeSynonyms;
	}

	private static Pair<Map<String, String>, Map<String, String>> getCatalogAttributesSynonyms(
			Catalog configurationObject) {
		Map<String, String> attributeSynonyms = new HashMap<>();
		Map<String, String> tabularSectionSynonyms = new HashMap<>();

		for (StandardAttribute attribute : configurationObject.getStandardAttributes())
			attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));
		for (MdObject attribute : configurationObject.getAttributes())
			attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));

		for (CatalogTabularSection tabularSection : configurationObject.getTabularSections()) {
			tabularSectionSynonyms.put(tabularSection.getName(), tabularSection.getSynonym().get("ru"));

			for (StandardAttribute attribute : tabularSection.getStandardAttributes())
				attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
						attribute.getSynonym().get("ru"));
			for (MdObject attribute : tabularSection.getAttributes())
				attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
						attribute.getSynonym().get("ru"));
		}

		return new Pair<>(attributeSynonyms, tabularSectionSynonyms);
	}

	private static Pair<Map<String, String>, Map<String, String>> getChartOfCalculationTypesSynonyms(
			ChartOfCalculationTypes configurationObject) {
		Map<String, String> attributeSynonyms = new HashMap<>();
		Map<String, String> tabularSectionSynonyms = new HashMap<>();

		for (StandardAttribute attribute : configurationObject.getStandardAttributes())
			attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));
		for (MdObject attribute : configurationObject.getAttributes())
			attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));

		for (StandardTabularSectionDescription tabularSection : configurationObject.getStandardTabularSections()) {
			tabularSectionSynonyms.put(tabularSection.getName(), tabularSection.getSynonym().get("ru"));

			for (StandardAttribute attribute : tabularSection.getStandardAttributes())
				attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
						attribute.getSynonym().get("ru"));
		}

		for (ChartOfCalculationTypesTabularSection tabularSection : configurationObject.getTabularSections()) {
			tabularSectionSynonyms.put(tabularSection.getName(), tabularSection.getSynonym().get("ru"));

			for (StandardAttribute attribute : tabularSection.getStandardAttributes())
				attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
						attribute.getSynonym().get("ru"));
			for (MdObject attribute : tabularSection.getAttributes())
				attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
						attribute.getSynonym().get("ru"));
		}

		return new Pair<>(attributeSynonyms, tabularSectionSynonyms);
	}

	private static Pair<Map<String, String>, Map<String, String>> getChartOfCharacteristicTypesSynonyms(
			ChartOfCharacteristicTypes configurationObject) {
		Map<String, String> attributeSynonyms = new HashMap<>();
		Map<String, String> tabularSectionSynonyms = new HashMap<>();

		for (StandardAttribute attribute : configurationObject.getStandardAttributes())
			attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));
		for (MdObject attribute : configurationObject.getAttributes())
			attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));

		for (ChartOfCharacteristicTypesTabularSection tabularSection : configurationObject.getTabularSections()) {
			tabularSectionSynonyms.put(tabularSection.getName(), tabularSection.getSynonym().get("ru"));

			for (StandardAttribute attribute : tabularSection.getStandardAttributes())
				attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
						attribute.getSynonym().get("ru"));
			for (MdObject attribute : tabularSection.getAttributes())
				attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
						attribute.getSynonym().get("ru"));
		}

		return new Pair<>(attributeSynonyms, tabularSectionSynonyms);
	}

	private static Pair<Map<String, String>, Map<String, String>> getDocumentAttributesSynonyms(
			Document configurationObject) {
		Map<String, String> attributeSynonyms = new HashMap<>();
		Map<String, String> tabularSectionSynonyms = new HashMap<>();

		for (StandardAttribute attribute : configurationObject.getStandardAttributes())
			attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));
		for (MdObject attribute : configurationObject.getAttributes())
			attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));

		for (DocumentTabularSection tabularSection : configurationObject.getTabularSections()) {
			tabularSectionSynonyms.put(tabularSection.getName(), tabularSection.getSynonym().get("ru"));

			for (StandardAttribute attribute : tabularSection.getStandardAttributes())
				attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
						attribute.getSynonym().get("ru"));
			for (MdObject attribute : tabularSection.getAttributes())
				attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
						attribute.getSynonym().get("ru"));
		}

		for (BasicRegister registerObject : configurationObject.getRegisterRecords()) {
			tabularSectionSynonyms.put(registerObject.getName(), registerObject.getSynonym().get("ru"));

			if (registerObject instanceof InformationRegister)
				attributeSynonyms
						.putAll(getInformationRegisterAttributesSynonyms((InformationRegister) registerObject));

			else if (registerObject instanceof AccumulationRegister)
				attributeSynonyms
						.putAll(getAccumulationRegisterAttributesSynonyms((AccumulationRegister) registerObject));

			else if (registerObject instanceof CalculationRegister)
				attributeSynonyms
						.putAll(getCalculationRegisterAttributesSynonyms((CalculationRegister) registerObject));
		}

		return new Pair<>(attributeSynonyms, tabularSectionSynonyms);
	}

	private static CharSource getFileInputSupplier(String partName) {
		return Resources.asCharSource(ConversionModuleReport.class.getResource("/resources/report/" + partName),
				StandardCharsets.UTF_8);
	}

	private static String getFullObject(CmObjectRule cmObjectRule, Map<String, EList<EdProperty>> mapKeyProperties,
			EList<EdDefinedType> edDefinedTypes, EList<EdEnum> edEnums, EnterpriseData enterpriseDataPackage) {
		final String TEMPLATE_NAME_OBJECT = "ReceivingObject.txt";
		String templateObjectContent = readContents(getFileInputSupplier(TEMPLATE_NAME_OBJECT));

		StringTemplate templateObject = new StringTemplate(templateObjectContent);

		MdObject configurationObject = cmObjectRule.getConfigurationObject();

		templateObject.setAttribute("Subsystem",
				!cmObjectRule.getSubsystems().isEmpty() ? cmObjectRule.getSubsystems().get(0).getName() : "Нет");
		templateObject.setAttribute("ObjectRule", getObjectSynonym(cmObjectRule));
		templateObject.setAttribute("FormatObject", cmObjectRule.getFormatObject());
		templateObject.setAttribute("ConfigurationObject", cmObjectRule.getConfigurationObjectFormattedName());

		templateObject.setAttribute("Identification",
				createIdentificationReport(cmObjectRule.getIdentificationVariant(),
						cmObjectRule.getIdentificationFields()));

		Pair<Map<String, String>, Map<String, String>> synonyms = getAttributesSynonyms(configurationObject);
		Map<String, String> attributeSynonyms = synonyms.getKey();
		Map<String, String> tabularSectionSynonyms = synonyms.getValue();

		List<CmAttributeRule> attributeRules = cmObjectRule.getAttributeRules().stream().collect(Collectors.toList());
		addRefToObjects(attributeRules, cmObjectRule, configurationObject);

		Map<String, MarkdownTable> tabularSectionsRows = getTabularSectionsRows(attributeRules,
				attributeSynonyms,
				cmObjectRule,
				mapKeyProperties,
				edDefinedTypes,
				edEnums,
				enterpriseDataPackage);

		templateObject.setAttribute("AttributesRules",
				getObjectAttributesRules(tabularSectionsRows, tabularSectionSynonyms));

		return templateObject.toString();
	}

	private static Map<String, String> getInformationRegisterAttributesSynonyms(InformationRegister registerObject) {
		Map<String, String> attributeSynonyms = new HashMap<>();

		for (StandardAttribute attribute : registerObject.getStandardAttributes())
			attributeSynonyms.put(registerObject.getName().concat(".").concat(attribute.getName()),
					attribute.getSynonym().get("ru"));
		for (MdObject attribute : registerObject.getDimensions())
			attributeSynonyms.put(registerObject.getName().concat(".").concat(attribute.getName()),
					attribute.getSynonym().get("ru"));
		for (MdObject attribute : registerObject.getResources())
			attributeSynonyms.put(registerObject.getName().concat(".").concat(attribute.getName()),
					attribute.getSynonym().get("ru"));
		for (MdObject attribute : registerObject.getAttributes())
			attributeSynonyms.put(registerObject.getName().concat(".").concat(attribute.getName()),
					attribute.getSynonym().get("ru"));

		return attributeSynonyms;
	}

	private static Pair<Map<String, String>, Map<String, String>> getInformationRegisterSynonyms(
			InformationRegister configurationObject) {
		Map<String, String> attributeSynonyms = new HashMap<>();
		Map<String, String> tabularSectionSynonyms = new HashMap<>();

		for (StandardAttribute attribute : configurationObject.getStandardAttributes())
			attributeSynonyms.put(TABULAR_SECTION_REGISTER.concat(".").concat(attribute.getName()),
					attribute.getSynonym().get("ru"));
		for (MdObject attribute : configurationObject.getDimensions())
			attributeSynonyms.put(TABULAR_SECTION_REGISTER.concat(".").concat(attribute.getName()),
					attribute.getSynonym().get("ru"));
		for (MdObject attribute : configurationObject.getResources())
			attributeSynonyms.put(TABULAR_SECTION_REGISTER.concat(".").concat(attribute.getName()),
					attribute.getSynonym().get("ru"));
		for (MdObject attribute : configurationObject.getAttributes())
			attributeSynonyms.put(TABULAR_SECTION_REGISTER.concat(".").concat(attribute.getName()),
					attribute.getSynonym().get("ru"));

		return new Pair<>(attributeSynonyms, tabularSectionSynonyms);
	}

	private static EList<EdProperty> getKeyPropertiesList(CmObjectRule objectRule, EdObject formatObject) {
		EList<EdProperty> edKeyProperties = new BasicEList<>();

		if (objectRule.getIdentificationVariant() != CmIdentificationVariant.SEARCH_FIELDS) {
			EdProperty edKeyProperty = getKeyProperty(KEY_FIELD_REF, formatObject);
			if (edKeyProperty != null)
				edKeyProperties.add(edKeyProperty);
		}

		ArrayList<String> listIdentificationFields = getUniqueIdentificationFields(
				objectRule.getIdentificationFields());
		for (CmAttributeRule cmAttributeRule : objectRule.getAttributeRules()) {
			if (!listIdentificationFields.contains(cmAttributeRule.getConfigurationAttribute()))
				continue;

			EdProperty edKeyProperty = getKeyProperty(cmAttributeRule.getFormatAttribute(), formatObject);
			if (edKeyProperty != null)
				edKeyProperties.add(edKeyProperty);
		}

		return edKeyProperties;
	}

	private static EdProperty getKeyProperty(String propertyName, EdObject formatObject) {
		for (EdProperty edKeyProperty : formatObject.getKeyProperties())
			if (edKeyProperty.getName().equals(propertyName))
				return edKeyProperty;

		return null;
	}

	private static String getManualObject(CmObjectRule cmObjectRule, Map<String, EList<EdProperty>> mapKeyProperties,
			EList<EdDefinedType> edDefinedTypes, EList<EdEnum> edEnums, EnterpriseData enterpriseDataPackage) {
		final String TEMPLATE_NAME_OBJECT = "ReceivingObject.txt";
		String templateObjectContent = readContents(getFileInputSupplier(TEMPLATE_NAME_OBJECT));

		StringTemplate templateObject = new StringTemplate(templateObjectContent);

		MdObject configurationObject = cmObjectRule.getConfigurationObject();

		templateObject.setAttribute("Subsystem",
				!cmObjectRule.getSubsystems().isEmpty() ? cmObjectRule.getSubsystems().get(0).getName() : "Нет");
		templateObject.setAttribute("ObjectRule", getObjectSynonym(cmObjectRule));
		templateObject.setAttribute("FormatObject", cmObjectRule.getFormatObject());
		templateObject.setAttribute("ConfigurationObject", cmObjectRule.getConfigurationObjectFormattedName());

		templateObject.setAttribute("Identification",
				createIdentificationReport(cmObjectRule.getIdentificationVariant(),
						cmObjectRule.getIdentificationFields()));

		Pair<Map<String, String>, Map<String, String>> synonyms = getAttributesSynonyms(configurationObject);
		Map<String, String> attributeSynonyms = synonyms.getKey();
		Map<String, String> tabularSectionSynonyms = synonyms.getValue();

		List<CmAttributeRule> attributeRules = cmObjectRule.getAttributeRules().stream().collect(Collectors.toList());
		addRefToObjects(attributeRules, cmObjectRule, configurationObject);

		Map<String, MarkdownTable> tabularSectionsRows = getTabularSectionsRows(attributeRules,
				attributeSynonyms,
				cmObjectRule,
				mapKeyProperties,
				edDefinedTypes,
				edEnums,
				enterpriseDataPackage);

		templateObject.setAttribute("AttributesRules",
				getObjectAttributesRules(tabularSectionsRows, tabularSectionSynonyms));

		return templateObject.toString();
	}

	private static String getObjectAttributesRules(Map<String, MarkdownTable> tabularSectionsRows,
			Map<String, String> tabularSectionSynonyms) {
		StringBuilder attributesRulesText = new StringBuilder();

		final String TEMPLATE_NAME_ATTRIBUTES = "ReceivingAttributes.txt";
		String templateAttributesContent = readContents(getFileInputSupplier(TEMPLATE_NAME_ATTRIBUTES));

		for (Map.Entry<String, MarkdownTable> tabularSectionRow : tabularSectionsRows.entrySet()) {
			StringTemplate templateAttributes = new StringTemplate(templateAttributesContent);

			String configurationTabularSectionName = tabularSectionRow.getKey();

			if (configurationTabularSectionName.isEmpty()) {
				templateAttributes.setAttribute("TabularSection", "Шапка");

			} else {
				String tabularSynonym = tabularSectionSynonyms.get(configurationTabularSectionName);
				if (tabularSynonym == null)
					tabularSynonym = configurationTabularSectionName;

				templateAttributes.setAttribute("TabularSection", tabularSynonym);

			}

			templateAttributes.setAttribute("TabularRows", tabularSectionRow.getValue().getTable());

			attributesRulesText.append(templateAttributes);
		}

		return attributesRulesText.toString();
	}

	private static String[][] getObjectRow(CmObjectRule cmObjectRule) {
		MdObject configurationObject = cmObjectRule.getConfigurationObject();

		String objectSynonym = "";
		if (configurationObject instanceof Catalog) {
			objectSynonym = ((Catalog) configurationObject).getSynonym().get("ru");

		} else if (configurationObject instanceof Document) {
			objectSynonym = ((Document) configurationObject).getSynonym().get("ru");

		} else if (configurationObject instanceof Enum) {
			objectSynonym = ((Enum) configurationObject).getSynonym().get("ru");

		} else if (configurationObject instanceof ChartOfCharacteristicTypes) {
			objectSynonym = ((ChartOfCharacteristicTypes) configurationObject).getSynonym().get("ru");

		} else if (configurationObject instanceof ChartOfCalculationTypes) {
			objectSynonym = ((ChartOfCalculationTypes) configurationObject).getSynonym().get("ru");

		} else if (configurationObject instanceof InformationRegister) {
			objectSynonym = ((InformationRegister) configurationObject).getSynonym().get("ru");

		}
		if (cmObjectRule.getForGroup())
			objectSynonym += " (группа)";

		EList<String> identificationFields = cmObjectRule.getIdentificationFields();

		CmIdentificationVariant identificationVariant = cmObjectRule.getIdentificationVariant();
		if (identificationVariant == CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS && identificationFields.isEmpty())
			identificationVariant = CmIdentificationVariant.UUID;

		StringBuilder identificationFieldsTable = new StringBuilder();
		if (!identificationFields.isEmpty()) {
			for (String identificationField : cmObjectRule.getIdentificationFields()) {
				identificationFieldsTable.append("<br>").append(identificationField);
			}
		}

		return new String[][] {
				{ objectSynonym, "0", "" },
				{ cmObjectRule.getFormatObject(), "0", "" },
				{ cmObjectRule.getConfigurationObjectFormattedName(), "0", "" },
				{ identificationVariant.getLiteral() + identificationFieldsTable, "0", "" },
				{ "", "0", "" } };
	}

	private static String getObjectSynonym(CmObjectRule cmObjectRule) {
		String objectSynonym = "";

		MdObject configurationObject = cmObjectRule.getConfigurationObject();

		if (configurationObject instanceof Catalog) {
			objectSynonym = ((Catalog) configurationObject).getSynonym().get("ru");

		} else if (configurationObject instanceof Document) {
			objectSynonym = ((Document) configurationObject).getSynonym().get("ru");

		} else if (configurationObject instanceof Enum) {
			objectSynonym = ((Enum) configurationObject).getSynonym().get("ru");

		} else if (configurationObject instanceof ChartOfCharacteristicTypes) {
			objectSynonym = ((ChartOfCharacteristicTypes) configurationObject).getSynonym().get("ru");

		} else if (configurationObject instanceof ChartOfCalculationTypes) {
			objectSynonym = ((ChartOfCalculationTypes) configurationObject).getSynonym().get("ru");

		} else if (configurationObject instanceof InformationRegister) {
			objectSynonym = ((InformationRegister) configurationObject).getSynonym().get("ru");

		}
		if (cmObjectRule.getForGroup())
			objectSynonym += " (группа)";

		return objectSynonym;
	}

	private static Pair<String, String> getPropertyNameAndType(String subPropertyType) {
		String[] subPropertyTypeList = subPropertyType.split(":");
		String subPropertyTypeName = "";
		String subPropertyTypeType = "";
		if (subPropertyTypeList.length == 1)
			subPropertyTypeType = subPropertyTypeList[0];

		else {
			subPropertyTypeName = subPropertyTypeList[0];
			subPropertyTypeType = subPropertyTypeList[1];

		}

		return new Pair<>(subPropertyTypeName, subPropertyTypeType);
	}

	private static Map<String, MarkdownTable> getTabularSectionsRows(List<CmAttributeRule> attributeRules,
			Map<String, String> attributeSynonyms, CmObjectRule cmObjectRule,
			Map<String, EList<EdProperty>> mapKeyProperties, EList<EdDefinedType> edDefinedTypes, EList<EdEnum> edEnums,
			EnterpriseData enterpriseDataPackage) {
		Map<String, MarkdownTable> tabularSectionsRows = new HashMap<>();

		for (CmAttributeRule attributeRule : attributeRules) {
			String configurationTabularSectionName = attributeRule.getConfigurationTabularSection();

			MarkdownTable tabularSectionRow = tabularSectionsRows.get(configurationTabularSectionName);
			if (tabularSectionRow == null) {
				tabularSectionRow = new MarkdownTable(new String[] {
						"Свойство формата",
						"Тип значения",
						"Наименование поля",
						"Обязательное",
						"Примечание" });
			}

			EdProperty edProperty = enterpriseDataPackage.getProperty(cmObjectRule.getFormatObject(),
					attributeRule.getFormatAttributeFullName());
			if (edProperty == null) {
				addTabularSectionRowForEmptyFormatAttribute(attributeRule, tabularSectionRow, attributeSynonyms);

			} else {
				List<String> listPropertyTypes = expandPropertyType(attributeRule.getFormatAttribute(),
						edProperty.getType(),
						edProperty.getRequired(),
						mapKeyProperties);

				addDefinedTypesAndEnums(listPropertyTypes, edDefinedTypes, edEnums, enterpriseDataPackage);

				addTabularSectionRowsForEdProperty(attributeRule,
						tabularSectionRow,
						edProperty,
						attributeSynonyms,
						listPropertyTypes);

			}

			tabularSectionsRows.put(configurationTabularSectionName, tabularSectionRow);

		}

		return tabularSectionsRows;
	}

	private static ArrayList<String> getUniqueIdentificationFields(EList<String> identificationFields) {
		ArrayList<String> listIdentificationFields = new ArrayList<>();
		for (String identificationVariant : identificationFields) {
			for (String identificationField : identificationVariant.split("[,]")) {
				if (!listIdentificationFields.contains(identificationField))
					listIdentificationFields.add(identificationField);
			}
		}

		return listIdentificationFields;
	}

	private static String readContents(CharSource source) {
		try (Reader reader = source.openBufferedStream()) {
			return CharStreams.toString(reader);
		} catch (IOException | NullPointerException e) {
			return "";
		}
	}

	private ConversionModuleReport() {
		throw new IllegalStateException("Вспомогательный класс");
	}
}