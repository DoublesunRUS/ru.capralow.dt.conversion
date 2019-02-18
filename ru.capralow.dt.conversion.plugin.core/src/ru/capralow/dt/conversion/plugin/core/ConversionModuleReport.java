package ru.capralow.dt.conversion.plugin.core;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;

import com._1c.g5.v8.dt.mcore.DerivedField;
import com._1c.g5.v8.dt.metadata.mdclass.Catalog;
import com._1c.g5.v8.dt.metadata.mdclass.CatalogAttribute;
import com._1c.g5.v8.dt.metadata.mdclass.CatalogTabularSection;
import com._1c.g5.v8.dt.metadata.mdclass.ChartOfCalculationTypes;
import com._1c.g5.v8.dt.metadata.mdclass.ChartOfCalculationTypesAttribute;
import com._1c.g5.v8.dt.metadata.mdclass.ChartOfCalculationTypesTabularSection;
import com._1c.g5.v8.dt.metadata.mdclass.ChartOfCharacteristicTypes;
import com._1c.g5.v8.dt.metadata.mdclass.ChartOfCharacteristicTypesAttribute;
import com._1c.g5.v8.dt.metadata.mdclass.ChartOfCharacteristicTypesTabularSection;
import com._1c.g5.v8.dt.metadata.mdclass.Document;
import com._1c.g5.v8.dt.metadata.mdclass.DocumentAttribute;
import com._1c.g5.v8.dt.metadata.mdclass.DocumentTabularSection;
import com._1c.g5.v8.dt.metadata.mdclass.Enum;
import com._1c.g5.v8.dt.metadata.mdclass.InformationRegister;
import com._1c.g5.v8.dt.metadata.mdclass.TabularSectionAttribute;

import ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmIdentificationVariant;
import ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmSubsystem;
import ru.capralow.dt.conversion.plugin.core.cm.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.fp.FormatPackage;
import ru.capralow.dt.conversion.plugin.core.fp.FpProperty;

public class ConversionModuleReport {

	private ConversionModule conversionModule;
	private FormatPackage formatPackage;

	public ConversionModuleReport(ConversionModule conversionModule, FormatPackage formatPackage) {
		this.conversionModule = conversionModule;
		this.formatPackage = formatPackage;
	}

	public String createReport() throws IOException {
		String result = "";
		result += "Описание формата загрузки данных " + formatPackage.getVersion() + "\r\n\r\n";
		result += "[TOC]\r\n\r\n";

		for (CmSubsystem subsystem : conversionModule.getSubsystems()) {
			EList<Object> receivingObjectRules = conversionModule.getReceivingObjectRules(subsystem);
			if (receivingObjectRules.size() == 0)
				continue;

			result += "### " + subsystem.getName() + "\r\n\r\n";

			for (Object objectRule : receivingObjectRules) {
				CmObjectRule cmObjectRule = (CmObjectRule) objectRule;

				Object configurationObject = cmObjectRule.getConfigurationObject();
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

				result += "##### " + objectSynonym + "\r\n";
				result += "---\r\n";
				result += "Объект формата: " + cmObjectRule.getFormatObjectName() + "\r\n";
				result += "Объект конфигурации: " + cmObjectRule.getConfigurationObjectName() + "\r\n";
				result += "\r\n";

				EList<String> identificationFields = cmObjectRule.getIdentificationFields();

				CmIdentificationVariant identificationVariant = cmObjectRule.getIdentificationVariant();
				if (identificationVariant == CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS
						&& identificationFields.size() == 0)
					identificationVariant = CmIdentificationVariant.UUID;

				result += "**Вариант идентификации: " + identificationVariant + "**\r\n\r\n";
				if (identificationFields.size() != 0) {
					result += "Порядок поиска по ключевым полям | Реквизиты поиска\r\n";
					result += "--- | ---\r\n";
					for (String identificationField : cmObjectRule.getIdentificationFields()) {
						result += (identificationFields.indexOf(identificationField) + 1) + " | " + identificationField
								+ "\r\n";
					}
				}

				String configurationTabularSectionName = "<>";
				String formatTabularSectionName = "<>";
				for (CmAttributeRule attributeRule : cmObjectRule.getAttributeRules()) {
					if (!(attributeRule.getConfigurationTabularSectionName().equals(configurationTabularSectionName))
							|| !(attributeRule.getFormatTabularSectionName().equals(formatTabularSectionName))) {

						configurationTabularSectionName = attributeRule.getConfigurationTabularSectionName();
						formatTabularSectionName = attributeRule.getFormatTabularSectionName();

						if (configurationTabularSectionName.equals("")) {
							result += "\r\n";
							result += "**Шапка**\r\n\r\n";
							result += "Свойство формата | Тип значения | Свойство конфигурации | Обязательное | Примечание\r\n";
							result += "--- | --- | --- | --- | ---\r\n";

						} else {

							String tabularSynonym = configurationTabularSectionName;
							Object configurationTabularSection = attributeRule.getConfigurationTabularSection();
							if (configurationTabularSection != null) {
								tabularSynonym = "<Не задан синоним>" + configurationTabularSectionName;
								if (configurationTabularSection instanceof CatalogTabularSection) {
									tabularSynonym = ((CatalogTabularSection) configurationTabularSection).getSynonym()
											.get("ru");

								} else if (configurationTabularSection instanceof DocumentTabularSection) {
									tabularSynonym = ((DocumentTabularSection) configurationTabularSection).getSynonym()
											.get("ru");

								} else if (configurationTabularSection instanceof ChartOfCharacteristicTypesTabularSection) {
									tabularSynonym = ((ChartOfCharacteristicTypesTabularSection) configurationTabularSection)
											.getSynonym().get("ru");

								} else if (configurationTabularSection instanceof ChartOfCalculationTypesTabularSection) {
									tabularSynonym = ((ChartOfCalculationTypesTabularSection) configurationTabularSection)
											.getSynonym().get("ru");

								} else
									tabularSynonym = "<Неизвестный тип ТЧ>" + configurationTabularSection.getClass();
							}

							result += "\r\n\r\n";
							result += "**Табличная часть: " + tabularSynonym + "**\r\n\r\n";
							result += "Свойство формата | Тип значения | Свойство конфигурации | Обязательное | Примечание\r\n";
							result += "--- | --- | --- | --- | ---\r\n";
						}

					}

					String attributeSynonym = attributeRule.getConfigurationAttributeName();
					Object configurationAttribute = attributeRule.getConfigurationAttribute();
					if (configurationAttribute != null) {
						attributeSynonym = "<Не задан синоним>" + attributeRule.getConfigurationAttributeName();
						if (configurationAttribute instanceof CatalogAttribute) {
							attributeSynonym = ((CatalogAttribute) configurationAttribute).getSynonym().get("ru");

						} else if (configurationAttribute instanceof DocumentAttribute) {
							attributeSynonym = ((DocumentAttribute) configurationAttribute).getSynonym().get("ru");

						} else if (configurationAttribute instanceof ChartOfCharacteristicTypesAttribute) {
							attributeSynonym = ((ChartOfCharacteristicTypesAttribute) configurationAttribute)
									.getSynonym().get("ru");

						} else if (configurationAttribute instanceof ChartOfCalculationTypesAttribute) {
							attributeSynonym = ((ChartOfCalculationTypesAttribute) configurationAttribute).getSynonym()
									.get("ru");

						} else if (configurationAttribute instanceof TabularSectionAttribute) {
							attributeSynonym = ((TabularSectionAttribute) configurationAttribute).getSynonym()
									.get("ru");

						} else if (configurationAttribute instanceof DerivedField) {
							attributeSynonym = ((DerivedField) configurationAttribute).getNameRu();

						} else
							attributeSynonym = "<Неизвестный тип атрибута>" + configurationAttribute.getClass();
					}

					String propertyTypeName = attributeRule.getFormatAttributeFullName().length() != 0
							? "<Свойство формата не найдено>"
							: "";
					String required = "";
					String comment = "";
					FpProperty property = formatPackage.getProperty(cmObjectRule.getFormatObjectName(),
							attributeRule.getFormatAttributeFullName());

					if (property != null) {
						propertyTypeName = property.getTypeName();
						required = property.getRequired() ? "Да" : "";
					}

					if (attributeRule.getFormatAttributeName().isEmpty())
						comment = "<Заполняется алгоритмом>";

					result += attributeRule.getFormatAttributeName() + " | " + propertyTypeName + " | "
							+ attributeSynonym + " | " + required + " | " + comment + "\r\n";
				}

				result += "\r\n\r\n\r\n";

			}
		}

		return result;
	}

}
