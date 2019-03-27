package ru.capralow.dt.conversion.plugin.core;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.antlr.stringtemplate.StringTemplate;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

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

public class ConversionModuleReport {

	public static String createFullReport(RgVariant rgVariant, EnterpriseData enterpriseDataPackage,
			ConversionModule conversionModule) throws IOException {
		final String TEMPLATE_NAME_MAIN = "ReceivingConversionReport.txt";
		String templateMainContent = readContents(getFileInputSupplier(TEMPLATE_NAME_MAIN), TEMPLATE_NAME_MAIN);

		final String TEMPLATE_NAME_GROUP = "ReceivingGroup.txt";
		String templateGroupContent = readContents(getFileInputSupplier(TEMPLATE_NAME_GROUP), TEMPLATE_NAME_GROUP);

		StringTemplate templateMain = new StringTemplate(templateMainContent);

		String groupObjects = "";

		EList<EdDefinedType> edDefinedTypes = new BasicEList<EdDefinedType>();
		EList<EdEnum> edEnums = new BasicEList<EdEnum>();

		HashMap<String, EList<EdProperty>> mapKeyProperties = getKeyProperties(conversionModule.getObjectRules(),
				enterpriseDataPackage);

		if (rgVariant != null) {
			templateMain.setAttribute("FormatVersion", rgVariant.getName() + " " + enterpriseDataPackage.getVersion());

			for (RgGroup rgGroup : rgVariant.getGroups()) {
				StringTemplate templateGroups = new StringTemplate(templateGroupContent);

				templateGroups.setAttribute("GroupName", rgGroup.getName());

				String objects = "";
				for (RgRule rgRule : rgGroup.getRules()) {
					CmDataRule dataRule = conversionModule.getDataRule(rgRule.getName());
					if (dataRule == null)
						continue;

					for (Object objectRule : dataRule.getObjectRules())
						objects += getFullObject((CmObjectRule) objectRule, mapKeyProperties, edDefinedTypes, edEnums,
								enterpriseDataPackage);
				}

				templateGroups.setAttribute("ObjectRules", objects);

				groupObjects += templateGroups.toString();

			}

		} else {
			templateMain.setAttribute("FormatVersion", enterpriseDataPackage.getVersion());

			for (CmSubsystem cmSubsystem : conversionModule.getSubsystems()) {
				EList<CmObjectRule> receivingObjectRules = conversionModule.getReceivingObjectRules(cmSubsystem);
				if (receivingObjectRules.size() == 0)
					continue;

				StringTemplate templateGroups = new StringTemplate(templateGroupContent);

				templateGroups.setAttribute("GroupName", cmSubsystem.getName());

				String objects = "";
				for (CmObjectRule objectRule : receivingObjectRules)
					objects += getFullObject(objectRule, mapKeyProperties, edDefinedTypes, edEnums,
							enterpriseDataPackage);
				templateGroups.setAttribute("ObjectRules", objects);

				groupObjects += templateGroups.toString();
			}
		}

		templateMain.setAttribute("ObjectRules", groupObjects);

		templateMain.setAttribute("DefinedTypes", createDefinedTypesReport(edDefinedTypes, mapKeyProperties));

		templateMain.setAttribute("Enums", createEnumsReport(edEnums));

		return templateMain.toString();
	}

	public static HashMap<String, EList<EdProperty>> getKeyProperties(EList<CmObjectRule> objectRules,
			EnterpriseData enterpriseDataPackage) {
		HashMap<String, EList<EdProperty>> mapKeyProperties = new HashMap<String, EList<EdProperty>>();

		for (CmObjectRule objectRule : objectRules) {
			if (objectRule.getFormatObject().isEmpty())
				continue;

			EdObject formatObject = enterpriseDataPackage.getObject(objectRule.getFormatObject());
			EList<EdProperty> edKeyProperties = new BasicEList<EdProperty>();

			ArrayList<String> listIdentificationFields = new ArrayList<String>();
			if (objectRule.getIdentificationVariant() != CmIdentificationVariant.SEARCH_FIELDS)
				for (EdProperty edKeyProperty : formatObject.getKeyProperties()) {
					if (edKeyProperty.getName().equals("Ссылка")) {
						edKeyProperties.add(edKeyProperty);
						break;
					}
				}
			for (String identificationVariant : objectRule.getIdentificationFields()) {
				for (String identificationField : identificationVariant.split("[,]")) {
					if (!listIdentificationFields.contains(identificationField))
						listIdentificationFields.add(identificationField);
				}
			}
			for (CmAttributeRule cmAttributeRule : objectRule.getAttributeRules()) {
				if (!listIdentificationFields.contains(cmAttributeRule.getConfigurationAttribute()))
					continue;

				for (EdProperty edKeyProperty : formatObject.getKeyProperties()) {
					if (edKeyProperty.getName().equals(cmAttributeRule.getFormatAttribute())) {
						edKeyProperties.add(edKeyProperty);
						break;
					}
				}
			}

			mapKeyProperties.put(formatObject.getKeysName(), edKeyProperties);
		}

		return mapKeyProperties;
	}

	public static String createDefinedTypesReport(EList<EdDefinedType> edDefinedTypes,
			HashMap<String, EList<EdProperty>> mapKeyProperties) {
		if (edDefinedTypes.size() == 0)
			return "";

		final String TEMPLATE_NAME = "ReceivingDefinedTypes.txt";
		String templateContent = readContents(getFileInputSupplier(TEMPLATE_NAME), TEMPLATE_NAME);

		StringTemplate template = new StringTemplate(templateContent);

		MarkdownTable mdTable = new MarkdownTable(new String[] { "Имя типа", "Состав типа" });

		for (EdDefinedType edDefinedType : edDefinedTypes) {
			EList<EdType> edTypes = edDefinedType.getTypes();

			String definedTypesType = "";
			for (EdType edType : edTypes) {
				if (!definedTypesType.isEmpty())
					definedTypesType += ";";
				definedTypesType += edType.getName() + ":" + edType.getPropertyType();
			}

			ArrayList<String> definedTypes = expandPropertyType(edDefinedType.getName(), definedTypesType, false,
					mapKeyProperties);
			for (String definedType : definedTypes) {
				String[] definedTypeArray = definedType.split("[,]", 3);

				String[] definedTypeName = definedTypeArray[0].split("[_]");

				String numOfTabs = Integer.toString(definedTypeName.length - 1);
				mdTable.addRow(1,
						new String[][] {
								{ (definedTypeName.length == 1 ? "" : "_")
										+ definedTypeName[definedTypeName.length - 1], numOfTabs, "" },
								{ definedTypeArray[1], numOfTabs, "" } });
			}
		}

		template.setAttribute("Rows", mdTable.getTable());

		return template.toString();
	}

	public static String createEnumsReport(EList<EdEnum> edEnums) {
		if (edEnums.size() == 0)
			return "";

		final String TEMPLATE_NAME = "ReceivingEnums.txt";
		String templateContent = readContents(getFileInputSupplier(TEMPLATE_NAME), TEMPLATE_NAME);

		StringTemplate template = new StringTemplate(templateContent);

		MarkdownTable mdTable = new MarkdownTable(new String[] { "Имя перечисления", "Значения" });

		for (EdEnum edEnum : edEnums) {
			boolean firstRow = true;
			for (Enumeration enumeration : edEnum.getEnumerations()) {
				if (firstRow) {
					mdTable.addRow(1,
							new String[][] { { edEnum.getName(), "0", "" }, { enumeration.getContent(), "0", "" } });

					firstRow = false;

				} else
					mdTable.addRow(1, new String[][] { { "", "0", "" }, { enumeration.getContent(), "0", "" } });
			}
		}

		template.setAttribute("Rows", mdTable.getTable());

		return template.toString();
	}

	public static String createObjectsReport(RgVariant rgVariant, EnterpriseData enterpriseDataPackage,
			ConversionModule conversionModule) throws IOException {
		final String TEMPLATE_NAME_MAIN = "ReceivingObjectsList.txt";
		String templateMainContent = readContents(getFileInputSupplier(TEMPLATE_NAME_MAIN), TEMPLATE_NAME_MAIN);

		StringTemplate templateMain = new StringTemplate(templateMainContent);

		MarkdownTable mdTable = new MarkdownTable(new String[] { "Наименование", "Объект формата",
				"Объект конфигурации", "Правила поиска", "Примечание" });

		if (rgVariant != null) {
			templateMain.setAttribute("FormatVersion", rgVariant.getName() + " " + enterpriseDataPackage.getVersion());

			for (RgGroup rgGroup : rgVariant.getGroups()) {
				mdTable.addRow(1, new String[][] { { rgGroup.getName(), "0", "**" }, { "", "0", "" }, { "", "0", "" },
						{ "", "0", "" }, { "", "0", "" } });

				for (RgRule rgRule : rgGroup.getRules()) {
					CmDataRule dataRule = conversionModule.getDataRule(rgRule.getName());
					if (dataRule == null)
						continue;

					for (Object objectRule : dataRule.getObjectRules())
						mdTable.addRow(1, getObjectRow((CmObjectRule) objectRule));
				}

			}

		} else {
			templateMain.setAttribute("FormatVersion", enterpriseDataPackage.getVersion());

			for (CmSubsystem cmSubsystem : conversionModule.getSubsystems()) {
				EList<CmObjectRule> receivingObjectRules = conversionModule.getReceivingObjectRules(cmSubsystem);
				if (receivingObjectRules.size() == 0)
					continue;

				for (CmObjectRule objectRule : receivingObjectRules)
					mdTable.addRow(1, getObjectRow(objectRule));
			}
		}

		templateMain.setAttribute("TabularRows", mdTable.getTable());

		return templateMain.toString();
	}

	private static String getFullObject(CmObjectRule cmObjectRule, HashMap<String, EList<EdProperty>> mapKeyProperties,
			EList<EdDefinedType> edDefinedTypes, EList<EdEnum> edEnums, EnterpriseData enterpriseDataPackage) {
		final String TEMPLATE_NAME_OBJECT = "ReceivingObject.txt";
		String templateObjectContent = readContents(getFileInputSupplier(TEMPLATE_NAME_OBJECT), TEMPLATE_NAME_OBJECT);

		final String TEMPLATE_NAME_ATTRIBUTES = "ReceivingAttributes.txt";
		String templateAttributesContent = readContents(getFileInputSupplier(TEMPLATE_NAME_ATTRIBUTES),
				TEMPLATE_NAME_ATTRIBUTES);

		StringTemplate templateObject = new StringTemplate(templateObjectContent);

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

		templateObject.setAttribute("Subsystem",
				!cmObjectRule.getSubsystems().isEmpty() ? cmObjectRule.getSubsystems().get(0).getName() : "Нет");
		templateObject.setAttribute("ObjectRule", objectSynonym);
		templateObject.setAttribute("FormatObject", cmObjectRule.getFormatObject());
		templateObject.setAttribute("ConfigurationObject", cmObjectRule.getConfigurationObjectFormattedName());

		templateObject.setAttribute("Identification", createIdentificationReport(
				cmObjectRule.getIdentificationVariant(), cmObjectRule.getIdentificationFields()));

		HashMap<String, String> tabularSectionSynonyms = new HashMap<String, String>();
		HashMap<String, String> attributeSynonyms = new HashMap<String, String>();

		// TODO: Добавить синонимы для стандартных реквизитов
		if (configurationObject instanceof Catalog) {
			Catalog typedObject = (Catalog) configurationObject;

			for (StandardAttribute attribute : typedObject.getStandardAttributes())
				attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));
			for (MdObject attribute : typedObject.getAttributes())
				attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));

			for (CatalogTabularSection tabularSection : ((Catalog) configurationObject).getTabularSections()) {
				tabularSectionSynonyms.put(tabularSection.getName(), tabularSection.getSynonym().get("ru"));

				for (StandardAttribute attribute : tabularSection.getStandardAttributes())
					attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
							attribute.getSynonym().get("ru"));
				for (MdObject attribute : tabularSection.getAttributes())
					attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
							attribute.getSynonym().get("ru"));
			}

		} else if (configurationObject instanceof Document) {
			Document typedObject = (Document) configurationObject;

			for (StandardAttribute attribute : typedObject.getStandardAttributes())
				attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));
			for (MdObject attribute : typedObject.getAttributes())
				attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));

			for (DocumentTabularSection tabularSection : typedObject.getTabularSections()) {
				tabularSectionSynonyms.put(tabularSection.getName(), tabularSection.getSynonym().get("ru"));

				for (StandardAttribute attribute : tabularSection.getStandardAttributes())
					attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
							attribute.getSynonym().get("ru"));
				for (MdObject attribute : tabularSection.getAttributes())
					attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
							attribute.getSynonym().get("ru"));
			}

			for (BasicRegister registerObject : typedObject.getRegisterRecords()) {
				tabularSectionSynonyms.put(registerObject.getName(), registerObject.getSynonym().get("ru"));

				if (registerObject instanceof InformationRegister) {
					InformationRegister typedRegisterObject = (InformationRegister) registerObject;

					for (StandardAttribute attribute : typedRegisterObject.getStandardAttributes())
						attributeSynonyms.put(typedRegisterObject.getName().concat(".").concat(attribute.getName()),
								attribute.getSynonym().get("ru"));
					for (MdObject attribute : typedRegisterObject.getDimensions())
						attributeSynonyms.put(typedRegisterObject.getName().concat(".").concat(attribute.getName()),
								attribute.getSynonym().get("ru"));
					for (MdObject attribute : typedRegisterObject.getResources())
						attributeSynonyms.put(typedRegisterObject.getName().concat(".").concat(attribute.getName()),
								attribute.getSynonym().get("ru"));
					for (MdObject attribute : typedRegisterObject.getAttributes())
						attributeSynonyms.put(typedRegisterObject.getName().concat(".").concat(attribute.getName()),
								attribute.getSynonym().get("ru"));

				} else if (registerObject instanceof AccumulationRegister) {
					AccumulationRegister typedRegisterObject = (AccumulationRegister) registerObject;

					for (StandardAttribute attribute : typedRegisterObject.getStandardAttributes())
						attributeSynonyms.put(typedRegisterObject.getName().concat(".").concat(attribute.getName()),
								attribute.getSynonym().get("ru"));
					for (MdObject attribute : typedRegisterObject.getDimensions())
						attributeSynonyms.put(typedRegisterObject.getName().concat(".").concat(attribute.getName()),
								attribute.getSynonym().get("ru"));
					for (MdObject attribute : typedRegisterObject.getResources())
						attributeSynonyms.put(typedRegisterObject.getName().concat(".").concat(attribute.getName()),
								attribute.getSynonym().get("ru"));
					for (MdObject attribute : typedRegisterObject.getAttributes())
						attributeSynonyms.put(typedRegisterObject.getName().concat(".").concat(attribute.getName()),
								attribute.getSynonym().get("ru"));

				} else if (registerObject instanceof CalculationRegister) {
					CalculationRegister typedRegisterObject = (CalculationRegister) registerObject;

					for (StandardAttribute attribute : typedRegisterObject.getStandardAttributes())
						attributeSynonyms.put(typedRegisterObject.getName().concat(".").concat(attribute.getName()),
								attribute.getSynonym().get("ru"));
					for (MdObject attribute : typedRegisterObject.getDimensions())
						attributeSynonyms.put(typedRegisterObject.getName().concat(".").concat(attribute.getName()),
								attribute.getSynonym().get("ru"));
					for (MdObject attribute : typedRegisterObject.getResources())
						attributeSynonyms.put(typedRegisterObject.getName().concat(".").concat(attribute.getName()),
								attribute.getSynonym().get("ru"));
					for (MdObject attribute : typedRegisterObject.getAttributes())
						attributeSynonyms.put(typedRegisterObject.getName().concat(".").concat(attribute.getName()),
								attribute.getSynonym().get("ru"));

				}

			}

		} else if (configurationObject instanceof ChartOfCharacteristicTypes) {
			ChartOfCharacteristicTypes typedObject = (ChartOfCharacteristicTypes) configurationObject;

			for (StandardAttribute attribute : typedObject.getStandardAttributes())
				attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));
			for (MdObject attribute : typedObject.getAttributes())
				attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));

			for (ChartOfCharacteristicTypesTabularSection tabularSection : typedObject.getTabularSections()) {
				tabularSectionSynonyms.put(tabularSection.getName(), tabularSection.getSynonym().get("ru"));

				for (StandardAttribute attribute : tabularSection.getStandardAttributes())
					attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
							attribute.getSynonym().get("ru"));
				for (MdObject attribute : tabularSection.getAttributes())
					attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
							attribute.getSynonym().get("ru"));
			}

		} else if (configurationObject instanceof ChartOfCalculationTypes) {
			ChartOfCalculationTypes typedObject = (ChartOfCalculationTypes) configurationObject;
			for (StandardAttribute attribute : typedObject.getStandardAttributes())
				attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));
			for (MdObject attribute : typedObject.getAttributes())
				attributeSynonyms.put(attribute.getName(), attribute.getSynonym().get("ru"));

			for (StandardTabularSectionDescription tabularSection : typedObject.getStandardTabularSections()) {
				tabularSectionSynonyms.put(tabularSection.getName(), tabularSection.getSynonym().get("ru"));

				for (StandardAttribute attribute : tabularSection.getStandardAttributes())
					attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
							attribute.getSynonym().get("ru"));
			}

			for (ChartOfCalculationTypesTabularSection tabularSection : typedObject.getTabularSections()) {
				tabularSectionSynonyms.put(tabularSection.getName(), tabularSection.getSynonym().get("ru"));

				for (StandardAttribute attribute : tabularSection.getStandardAttributes())
					attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
							attribute.getSynonym().get("ru"));
				for (MdObject attribute : tabularSection.getAttributes())
					attributeSynonyms.put(tabularSection.getName().concat(".").concat(attribute.getName()),
							attribute.getSynonym().get("ru"));
			}

		} else if (configurationObject instanceof InformationRegister) {
			InformationRegister typedObject = (InformationRegister) configurationObject;
			for (StandardAttribute attribute : typedObject.getStandardAttributes())
				attributeSynonyms.put("НаборЗаписей".concat(".").concat(attribute.getName()),
						attribute.getSynonym().get("ru"));
			for (MdObject attribute : typedObject.getDimensions())
				attributeSynonyms.put("НаборЗаписей".concat(".").concat(attribute.getName()),
						attribute.getSynonym().get("ru"));
			for (MdObject attribute : typedObject.getResources())
				attributeSynonyms.put("НаборЗаписей".concat(".").concat(attribute.getName()),
						attribute.getSynonym().get("ru"));
			for (MdObject attribute : typedObject.getAttributes())
				attributeSynonyms.put("НаборЗаписей".concat(".").concat(attribute.getName()),
						attribute.getSynonym().get("ru"));

		}

		List<CmAttributeRule> attributeRules = cmObjectRule.getAttributeRules().stream().collect(Collectors.toList());

		if (!(configurationObject instanceof InformationRegister)) {
			CmAttributeRule refAttributeRule = cmFactory.eINSTANCE.createCmAttributeRule();

			refAttributeRule.setConfigurationAttribute("Ссылка");

			if (!cmObjectRule.getFormatObject().isEmpty())
				refAttributeRule.setFormatAttribute("Ссылка");

			refAttributeRule.setObjectRule(cmObjectRule);

			attributeRules.add(0, refAttributeRule);
		}

		HashMap<String, MarkdownTable> tabularSectionsRows = new HashMap<String, MarkdownTable>();

		boolean hasRef = false;
		for (CmAttributeRule attributeRule : attributeRules) {
			if (attributeRule.getConfigurationAttribute().equals("Ссылка"))
				if (hasRef)
					continue;
				else
					hasRef = true;

			String configurationTabularSectionName = attributeRule.getConfigurationTabularSection();

			MarkdownTable tabularSectionRow = tabularSectionsRows.get(configurationTabularSectionName);
			if (tabularSectionRow == null) {
				tabularSectionRow = new MarkdownTable(new String[] { "Свойство формата", "Тип значения",
						"Наименование поля", "Обязательное", "Примечание" });
			}

			EdProperty edProperty = enterpriseDataPackage.getProperty(cmObjectRule.getFormatObject(),
					attributeRule.getFormatAttributeFullName());
			if (edProperty == null) {
				String formatAttribute = attributeRule.getFormatAttribute();

				String propertyType = attributeRule.getFormatAttributeFullName().length() != 0
						? "<Свойство формата не найдено>"
						: "";

				String attributeSynonym = attributeSynonyms.get(attributeRule.getConfigurationAttributeFullName());
				if (attributeSynonym == null)
					attributeSynonym = attributeRule.getConfigurationAttribute();

				String required = "";

				String comment = "";
				if (attributeRule.getFormatAttribute().isEmpty())
					comment = "<Заполняется алгоритмом>";

				tabularSectionRow.addRow(1, new String[][] { { formatAttribute, "0", "" }, { propertyType, "0", "" },
						{ attributeSynonym, "0", "" }, { required, "0", "" }, { comment, "0", "" } });

			} else {
				boolean isKey = edProperty.getIsKey();

				String formatAttribute = attributeRule.getFormatAttribute();

				String attributeSynonym = attributeSynonyms.get(attributeRule.getConfigurationAttributeFullName());
				if (attributeSynonym == null)
					attributeSynonym = attributeRule.getConfigurationAttribute();

				String comment = "";
				if (attributeRule.getFormatAttribute().isEmpty())
					comment = "<Заполняется алгоритмом>";

				ArrayList<String> listPropertyTypes = expandPropertyType(formatAttribute, edProperty.getType(),
						edProperty.getRequired(), mapKeyProperties);

				boolean firstRow = true;
				for (String propertyType : listPropertyTypes) {
					String[] propertyTypeArray = propertyType.split("[,]", 3);

					String propertyTypeName = propertyTypeArray[0];
					String propertyTypeType = propertyTypeArray[1];
					String propertyTypeRequired = propertyTypeArray[2];

					EdDefinedType edDefinedType = enterpriseDataPackage.getDefinedType(propertyTypeType);
					if (edDefinedType != null && !edDefinedTypes.contains(edDefinedType))
						edDefinedTypes.add(edDefinedType);

					EdEnum edEnum = enterpriseDataPackage.getEnum(propertyTypeType);
					if (edEnum != null && !edEnums.contains(edEnum))
						edEnums.add(edEnum);

					String[] propertyTypeNameArray = propertyTypeName.split("[_]");

					String numOfTabs = Integer.toString(propertyTypeNameArray.length - 1);
					tabularSectionRow.addRow(isKey ? 1 : 2,
							new String[][] {
									{ (propertyTypeNameArray.length == 1 ? "" : "_")
											+ propertyTypeNameArray[propertyTypeNameArray.length - 1], numOfTabs,
											isKey ? "*" : "" },
									{ propertyTypeType, numOfTabs, isKey ? "*" : "" },
									{ firstRow ? attributeSynonym : "", "0", isKey ? "*" : "" },
									{ propertyTypeRequired.equals("true") ? "Да" : "", "0", isKey ? "*" : "" },
									{ firstRow ? comment : "", "0", isKey ? "*" : "" } });

					if (firstRow)
						firstRow = false;
				}

				tabularSectionsRows.put(configurationTabularSectionName, tabularSectionRow);
			}

		}

		String attributeRulesText = "";
		for (Map.Entry<String, MarkdownTable> tabularSectionRow : tabularSectionsRows.entrySet()) {
			StringTemplate templateAttributes = new StringTemplate(templateAttributesContent);

			String configurationTabularSectionName = tabularSectionRow.getKey();

			if (configurationTabularSectionName.equals("")) {
				templateAttributes.setAttribute("TabularSection", "Шапка");

			} else {
				String tabularSynonym = tabularSectionSynonyms.get(configurationTabularSectionName);
				if (tabularSynonym == null)
					tabularSynonym = configurationTabularSectionName;

				templateAttributes.setAttribute("TabularSection", tabularSynonym);

			}

			templateAttributes.setAttribute("TabularRows", tabularSectionRow.getValue().getTable());

			attributeRulesText += templateAttributes.toString();
		}

		templateObject.setAttribute("AttributeRules", attributeRulesText);

		return templateObject.toString();
	}

	public static ArrayList<String> expandPropertyType(String propertyName, String propertyType,
			Boolean propertyRequired, HashMap<String, EList<EdProperty>> mapKeyProperties) {
		ArrayList<String> listProperties = new ArrayList<String>();

		if (propertyType.isEmpty()) {
			if (!propertyName.isEmpty())
				listProperties.add(String.join(",", propertyName, "**Не указан тип**", propertyRequired ? "true" : ""));

			return listProperties;
		}

		String[] subPropertyTypes = propertyType.split("[;]");
		if (subPropertyTypes.length == 1) {
			String subPropertyType = subPropertyTypes[0];
			String[] subPropertyTypeList = subPropertyType.split(":");
			String subPropertyTypeName = "";
			String subPropertyTypeType = "";
			if (subPropertyTypeList.length == 1)
				subPropertyTypeType = subPropertyTypeList[0];

			else {
				subPropertyTypeName = subPropertyTypeList[0];
				subPropertyTypeType = subPropertyTypeList[1];

			}
			if (subPropertyTypeType.startsWith("КлючевыеСвойства")) {
				EList<EdProperty> subPropertyKeys = mapKeyProperties.get(subPropertyTypeType);
				if (subPropertyKeys == null) {
					listProperties.add(String.join(",", propertyName.concat(subPropertyTypeName),
							"**Не найдены ".concat(subPropertyTypeType).concat("**"), propertyRequired ? "true" : ""));
					return listProperties;
				}

				listProperties.add(String.join(",", propertyName.concat(subPropertyTypeName), "КлючевыеСвойства",
						propertyRequired ? "true" : ""));
				for (EdProperty subPropertyKey : subPropertyKeys) {
					String subPropertyName = propertyName.concat(subPropertyTypeName).concat("_")
							.concat(subPropertyKey.getName());
					if (propertyName.endsWith(subPropertyKey.getName())
							|| subPropertyName.endsWith("Родитель_Владелец"))
						continue;
					listProperties.addAll(expandPropertyType(subPropertyName, subPropertyKey.getType(),
							subPropertyKey.getRequired(), mapKeyProperties));
				}

			} else {
				listProperties.add(String.join(",", propertyName.concat(subPropertyTypeName), subPropertyTypeType,
						propertyRequired ? "true" : ""));

			}

		} else {
			listProperties.add(String.join(",", propertyName, "", propertyRequired ? "true" : ""));

			for (String subPropertyType : subPropertyTypes)
				listProperties
						.addAll(expandPropertyType(propertyName.concat("_"), subPropertyType, false, mapKeyProperties));

		}

		return listProperties;
	}

	public static String createIdentificationReport(CmIdentificationVariant identificationVariant,
			EList<String> identificationFields) {
		if (identificationVariant == null)
			return "**Вариант идентификации: Не определен**";

		if (identificationVariant == CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS
				&& identificationFields.size() == 0)
			identificationVariant = CmIdentificationVariant.UUID;

		String result = "**Вариант идентификации: " + identificationVariant + "**";

		if (identificationVariant != CmIdentificationVariant.UUID && identificationFields.size() != 0) {
			MarkdownTable mdTable = new MarkdownTable(
					new String[] { "Порядок поиска по ключевым полям", "Реквизиты поиска" });

			for (String identificationField : identificationFields)
				mdTable.addRow(1,
						new String[][] {
								{ Integer.toString(identificationFields.indexOf(identificationField) + 1), "0", "" },
								{ identificationField, "0", "" } });

			result += System.lineSeparator() + System.lineSeparator() + mdTable.getTable();

		} else
			result += System.lineSeparator();

		return result;
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
		if (identificationVariant == CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS
				&& identificationFields.size() == 0)
			identificationVariant = CmIdentificationVariant.UUID;

		String identificationFieldsTable = "";
		if (identificationFields.size() != 0) {
			for (String identificationField : cmObjectRule.getIdentificationFields()) {
				identificationFieldsTable += "<br>" + identificationField;
			}
		}

		String[][] objectRow = new String[][] { { objectSynonym, "0", "" }, { cmObjectRule.getFormatObject(), "0", "" },
				{ cmObjectRule.getConfigurationObjectFormattedName(), "0", "" },
				{ identificationVariant.getLiteral() + identificationFieldsTable, "0", "" }, { "", "0", "" } };

		return objectRow;
	}

	private static String readContents(CharSource source, String path) {
		try (Reader reader = source.openBufferedStream()) {
			return CharStreams.toString(reader);
		} catch (IOException | NullPointerException e) {
			return "";
		}
	}

	private static CharSource getFileInputSupplier(String partName) {
		return Resources.asCharSource(ConversionModuleReport.class.getResource("/resources/report/" + partName),
				StandardCharsets.UTF_8);
	}
}