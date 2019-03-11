package ru.capralow.dt.conversion.plugin.core;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.antlr.stringtemplate.StringTemplate;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com._1c.g5.v8.dt.metadata.mdclass.BasicRegister;
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
import com.google.common.io.CharSource;
import com.google.common.io.CharStreams;
import com.google.common.io.Resources;

import ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmIdentificationVariant;
import ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmSubsystem;
import ru.capralow.dt.conversion.plugin.core.cm.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.cm.impl.CmAttributeRuleImpl;
import ru.capralow.dt.conversion.plugin.core.fp.FormatPackage;
import ru.capralow.dt.conversion.plugin.core.fp.FpDefinedType;
import ru.capralow.dt.conversion.plugin.core.fp.FpProperty;
import ru.capralow.dt.conversion.plugin.core.rg.RgGroup;
import ru.capralow.dt.conversion.plugin.core.rg.RgRule;
import ru.capralow.dt.conversion.plugin.core.rg.RgVariant;

public class ConversionModuleReport {

	private ConversionModule conversionModule;
	private FormatPackage formatPackage;
	private RgVariant rgVariant;

	public ConversionModuleReport(ConversionModule conversionModule, FormatPackage formatPackage, RgVariant rgVariant) {
		this.conversionModule = conversionModule;
		this.formatPackage = formatPackage;
		this.rgVariant = rgVariant;
	}

	public String createFullReport() throws IOException {
		final String TEMPLATE_NAME_MAIN = "ReceivingConversionReport.txt";
		String templateMainContent = readContents(getFileInputSupplier(TEMPLATE_NAME_MAIN), TEMPLATE_NAME_MAIN);

		final String TEMPLATE_NAME_GROUP = "ReceivingGroup.txt";
		String templateGroupContent = readContents(getFileInputSupplier(TEMPLATE_NAME_GROUP), TEMPLATE_NAME_GROUP);

		final String TEMPLATE_NAME_DEFINEDTYPES = "ReceivingDefinedTypes.txt";
		String templateDefinedTypesContent = readContents(getFileInputSupplier(TEMPLATE_NAME_DEFINEDTYPES),
				TEMPLATE_NAME_DEFINEDTYPES);

		StringTemplate templateMain = new StringTemplate(templateMainContent);

		String groupObjects = "";

		EList<FpDefinedType> fpDefinedTypes = new BasicEList<FpDefinedType>();

		if (rgVariant != null) {
			templateMain.setAttribute("FormatVersion", rgVariant.getName() + " " + formatPackage.getVersion());

			for (RgGroup rgGroup : rgVariant.getGroups()) {
				StringTemplate templateGroups = new StringTemplate(templateGroupContent);

				templateGroups.setAttribute("GroupName", rgGroup.getName());

				String objects = "";
				for (RgRule rgRule : rgGroup.getRules()) {
					CmDataRule dataRule = conversionModule.getDataRule(rgRule.getName());
					if (dataRule == null)
						continue;

					for (Object objectRule : dataRule.getObjectRules())
						objects += getFullObject((CmObjectRule) objectRule, fpDefinedTypes);
				}

				templateGroups.setAttribute("ObjectRules", objects);

				groupObjects += templateGroups.toString();

			}

		} else {
			templateMain.setAttribute("FormatVersion", formatPackage.getVersion());

			for (CmSubsystem cmSubsystem : conversionModule.getSubsystems()) {
				EList<Object> receivingObjectRules = conversionModule.getReceivingObjectRules(cmSubsystem);
				if (receivingObjectRules.size() == 0)
					continue;

				StringTemplate templateGroups = new StringTemplate(templateGroupContent);

				templateGroups.setAttribute("GroupName", cmSubsystem.getName());

				String objects = "";
				for (Object objectRule : receivingObjectRules)
					objects += getFullObject((CmObjectRule) objectRule, fpDefinedTypes);
				templateGroups.setAttribute("ObjectRules", objects);

				groupObjects += templateGroups.toString();
			}
		}

		templateMain.setAttribute("ObjectRules", groupObjects);

		// TODO: Добавить вывод типов, перечислений и предопределенных элементов в конец
		// документа
		StringTemplate templateDefinedTypes = new StringTemplate(templateDefinedTypesContent);

		String typesRows = "";
		for (FpDefinedType fpDefinedType : fpDefinedTypes) {
			typesRows += fpDefinedType.getName() + " | " + fpDefinedType.getTypes().get(0).getPropertyType() + "\r\n";
		}

		templateDefinedTypes.setAttribute("TypesRows", typesRows);

		templateMain.setAttribute("DefinedTypes", templateDefinedTypes.toString());

		return templateMain.toString();
	}

	public String createObjectsReport() throws IOException {
		final String TEMPLATE_NAME_MAIN = "ReceivingObjectsList.txt";
		String templateMainContent = readContents(getFileInputSupplier(TEMPLATE_NAME_MAIN), TEMPLATE_NAME_MAIN);

		StringTemplate templateMain = new StringTemplate(templateMainContent);

		String tabularRows = "";

		if (rgVariant != null) {
			templateMain.setAttribute("FormatVersion", rgVariant.getName() + " " + formatPackage.getVersion());

			for (RgGroup rgGroup : rgVariant.getGroups()) {
				tabularRows += "**" + rgGroup.getName() + "** | | | | \r\n";

				for (RgRule rgRule : rgGroup.getRules()) {
					CmDataRule dataRule = conversionModule.getDataRule(rgRule.getName());
					if (dataRule == null)
						continue;

					for (Object objectRule : dataRule.getObjectRules())
						tabularRows += getObjectRow((CmObjectRule) objectRule) + "\r\n";
				}

			}

		} else {
			templateMain.setAttribute("FormatVersion", formatPackage.getVersion());

			for (CmSubsystem cmSubsystem : conversionModule.getSubsystems()) {
				EList<Object> receivingObjectRules = conversionModule.getReceivingObjectRules(cmSubsystem);
				if (receivingObjectRules.size() == 0)
					continue;

				tabularRows += "**" + cmSubsystem.getName() + "** | | | | \r\n";

				for (Object objectRule : receivingObjectRules)
					tabularRows += getObjectRow((CmObjectRule) objectRule) + "\r\n";
			}
		}

		templateMain.setAttribute("TabularRows", tabularRows);

		return templateMain.toString();
	}

	private String getFullObject(CmObjectRule cmObjectRule, EList<FpDefinedType> fpDefinedTypes) {
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

		EList<String> identificationFields = cmObjectRule.getIdentificationFields();

		CmIdentificationVariant identificationVariant = cmObjectRule.getIdentificationVariant();
		if (identificationVariant == CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS
				&& identificationFields.size() == 0)
			identificationVariant = CmIdentificationVariant.UUID;

		templateObject.setAttribute("IdentificationVariant", identificationVariant);

		if (identificationFields.size() != 0) {
			String identificationFieldsTable = "";
			identificationFieldsTable += "Порядок поиска по ключевым полям | Реквизиты поиска\r\n";
			identificationFieldsTable += "--- | ---";
			for (String identificationField : cmObjectRule.getIdentificationFields()) {
				identificationFieldsTable += "\r\n" + (identificationFields.indexOf(identificationField) + 1) + " | "
						+ identificationField;
			}
			templateObject.setAttribute("IdentificationFields", identificationFieldsTable);
		}

		Map<String, String> tabularSectionSynonyms = new HashMap<String, String>();
		Map<String, String> attributeSynonyms = new HashMap<String, String>();

		// TODO: Добавить синонимы для стандартных реквизитов
		// TODO: Добавить синонимы для движений документов
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

			for (BasicRegister tabularSection : typedObject.getRegisterRecords()) {
				tabularSectionSynonyms.put(tabularSection.getName(), tabularSection.getSynonym().get("ru"));
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

		}

		List<CmAttributeRule> attributeRules = cmObjectRule.getAttributeRules().stream().collect(Collectors.toList());

		if (!(configurationObject instanceof InformationRegister)) {
			CmAttributeRuleImpl refAttributeRule = new CmAttributeRuleImpl();

			refAttributeRule.setConfigurationAttribute("Ссылка");

			if (!cmObjectRule.getFormatObject().isEmpty())
				refAttributeRule.setFormatAttribute("Ссылка");

			refAttributeRule.setObjectRule(cmObjectRule);

			attributeRules.add(0, refAttributeRule);
		}

		HashMap<String, String[]> tabularSectionsRows = new HashMap<String, String[]>();

		boolean hasRef = false;
		for (CmAttributeRule attributeRule : attributeRules) {
			if (attributeRule.getConfigurationAttribute().equals("Ссылка"))
				if (hasRef)
					continue;
				else
					hasRef = true;

			String configurationTabularSectionName = attributeRule.getConfigurationTabularSection();

			String[] tabularSectionRow = tabularSectionsRows.get(configurationTabularSectionName);
			if (tabularSectionRow == null) {
				tabularSectionRow = new String[2];
				tabularSectionRow[0] = "";
				tabularSectionRow[1] = "";
			}

			FpProperty fpProperty = formatPackage.getProperty(cmObjectRule.getFormatObject(),
					attributeRule.getFormatAttributeFullName());
			if (fpProperty == null) {
				String formatAttribute = attributeRule.getFormatAttribute();

				String propertyType = attributeRule.getFormatAttributeFullName().length() != 0
						? "<Свойство формата не найдено>"
						: "";

				String attributeSynonym = attributeSynonyms.get(attributeRule.getConfigurationAttribute());
				if (attributeSynonym == null)
					attributeSynonym = attributeRule.getConfigurationAttribute();

				String required = "";

				String comment = "";
				if (attributeRule.getFormatAttribute().isEmpty())
					comment = "<Заполняется алгоритмом>";

				tabularSectionRow[0] += getTableRow(formatAttribute, propertyType, attributeSynonym, required, comment,
						false, 0);

			} else {
				boolean isKey = fpProperty.getIsKey();

				String formatAttribute = attributeRule.getFormatAttribute();

				String attributeSynonym = attributeSynonyms.get(attributeRule.getConfigurationAttribute());
				if (attributeSynonym == null)
					attributeSynonym = attributeRule.getConfigurationAttribute();

				String comment = "";
				if (attributeRule.getFormatAttribute().isEmpty())
					comment = "<Заполняется алгоритмом>";

				String required = fpProperty.getRequired() ? "Да" : "";

				// TODO: Раскрывать КлючевыеСвойства у подсвойств
				String[] subPropertyTypes = fpProperty.getPropertyType().split("[;]");
				if (subPropertyTypes.length == 1) {
					String subPropertyType = subPropertyTypes[0];
					if (subPropertyType.isEmpty())
						subPropertyType = "<Свойство формата не найдено>";

					FpDefinedType fpDefinedType = formatPackage.getDefinedType(subPropertyType);
					if (fpDefinedType != null && !fpDefinedTypes.contains(fpDefinedType))
						fpDefinedTypes.add(fpDefinedType);

					Boolean isSubKey = subPropertyType.startsWith("КлючевыеСвойства");

					if (isKey)
						tabularSectionRow[0] += getTableRow(formatAttribute,
								isSubKey ? "КлючевыеСвойства" : subPropertyType, attributeSynonym, required, comment,
								isKey, 0);
					else
						tabularSectionRow[1] += getTableRow(formatAttribute,
								isSubKey ? "КлючевыеСвойства" : subPropertyType, attributeSynonym, required, comment,
								isKey, 0);

					if (isSubKey) {
						EList<FpProperty> keyProperties = formatPackage.getKeyProperties(subPropertyType);
						if (keyProperties != null) {
							for (FpProperty fpKeyProperty : keyProperties) {
								if (isKey)
									tabularSectionRow[0] += getTableRow("_" + fpKeyProperty.getName(),
											fpKeyProperty.getPropertyType(), "",
											fpKeyProperty.getRequired() ? "Да" : "", "", isKey, 1);
								else
									tabularSectionRow[1] += getTableRow("_" + fpKeyProperty.getName(),
											fpKeyProperty.getPropertyType(), "",
											fpKeyProperty.getRequired() ? "Да" : "", "", isKey, 1);
							}
						}

					}

				} else {
					if (isKey)
						tabularSectionRow[0] += getTableRow(formatAttribute, "", attributeSynonym, required, comment,
								isKey, 0);
					else
						tabularSectionRow[1] += getTableRow(formatAttribute, "", attributeSynonym, required, comment,
								isKey, 0);

					for (String subPropertyType : subPropertyTypes) {
						Boolean isSubKey = subPropertyType.startsWith("КлючевыеСвойства");

						if (isKey)
							tabularSectionRow[0] += getTableRow("_" + subPropertyType,
									isSubKey ? "КлючевыеСвойства" : subPropertyType, "", "", "", isKey, 1);
						else
							tabularSectionRow[1] += getTableRow("_" + subPropertyType,
									isSubKey ? "КлючевыеСвойства" : subPropertyType, "", "", "", isKey, 1);

						if (isSubKey) {
							EList<FpProperty> keyProperties = formatPackage.getKeyProperties(subPropertyType);
							if (keyProperties != null) {
								for (FpProperty fpKeyProperty : keyProperties) {
									if (isKey)
										tabularSectionRow[0] += getTableRow("_" + fpKeyProperty.getName(),
												fpKeyProperty.getPropertyType(), "",
												fpKeyProperty.getRequired() ? "Да" : "", "", isKey, 2);
									else
										tabularSectionRow[1] += getTableRow("_" + fpKeyProperty.getName(),
												fpKeyProperty.getPropertyType(), "",
												fpKeyProperty.getRequired() ? "Да" : "", "", isKey, 2);
								}
							}
						}
					}
				}

				tabularSectionsRows.put(configurationTabularSectionName, tabularSectionRow);
			}

		}

		String attributeRulesText = "";
		for (Map.Entry<String, String[]> tabularSectionRow : tabularSectionsRows.entrySet()) {
			StringTemplate templateAttributes = new StringTemplate(templateAttributesContent);

			String configurationTabularSectionName = tabularSectionRow.getKey();

			if (configurationTabularSectionName.equals("")) {
				templateAttributes.setAttribute("TabularSection", "Шапка");

			} else {
				// TODO: Добавить ключевые поля в табличные части
				String tabularSynonym = tabularSectionSynonyms.get(configurationTabularSectionName);
				if (tabularSynonym == null)
					tabularSynonym = configurationTabularSectionName;

				templateAttributes.setAttribute("TabularSection", tabularSynonym);

			}

			templateAttributes.setAttribute("TabularRows",
					tabularSectionRow.getValue()[0] + tabularSectionRow.getValue()[1]);

			attributeRulesText += templateAttributes.toString();
		}

		templateObject.setAttribute("AttributeRules", attributeRulesText);

		return templateObject.toString();
	}

	private String getObjectRow(CmObjectRule cmObjectRule) {
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

		String objectRow = objectSynonym + " | " + cmObjectRule.getFormatObject() + " | "
				+ cmObjectRule.getConfigurationObjectFormattedName() + " | " + identificationVariant
				+ identificationFieldsTable + " | ";

		return objectRow;
	}

	private String getTableRow(String col1, String col2, String col3, String col4, String col5, Boolean isKey,
			int numOfTabs) {
		// String tabString = "\u00a0\u00a0\u00a0\u00a0";
		String tabString = "&nbsp; &nbsp; ";

		String prefix = "";
		for (int i = 1; i <= numOfTabs; i++)
			prefix += tabString;

		if (isKey) {
			if (!col1.isEmpty())
				col1 = "*" + col1 + "*";
			if (!col2.isEmpty())
				col2 = "*" + col2 + "*";
			if (!col3.isEmpty())
				col3 = "*" + col3 + "*";
			if (!col4.isEmpty())
				col4 = "*" + col4 + "*";
			if (!col5.isEmpty())
				col5 = "*" + col5 + "*";
		}

		return prefix + col1 + " | " + prefix + col2 + " | " + prefix + col3 + " | " + col4 + " | " + col5 + "\r\n";
	}

	private static String readContents(CharSource source, String path) {
		try (Reader reader = source.openBufferedStream()) {
			return CharStreams.toString(reader);
		} catch (IOException | NullPointerException e) {
			return "";
		}
	}

	private static CharSource getFileInputSupplier(String partName) {
		return Resources.asCharSource(ConversionModuleAnalyzer.class.getResource("/resources/report/" + partName),
				StandardCharsets.UTF_8);
	}
}