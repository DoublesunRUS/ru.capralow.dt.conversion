package ru.capralow.dt.conversion.plugin.core;

// derived String configurationObjectName get {
// if (configurationObject === null) {
// return "";
// }
//
// var result = configurationObject.toString();
// if (configurationObject instanceof Catalog) {
// result = "СправочникСсылка." + (configurationObject as Catalog).getName();
//
// } else if (configurationObject instanceof Document) {
// result = "ДокументСсылка." + (configurationObject as Document).getName();
//
// } else if (configurationObject instanceof Enum) {
// result = "ПеречислениеСсылка." + (configurationObject as Enum).getName();
//
// } else if (configurationObject instanceof ChartOfCharacteristicTypes) {
// result = "ПланВидовХарактеристикСсылка." + (configurationObject as
// ChartOfCharacteristicTypes).getName();
//
// } else if (configurationObject instanceof ChartOfCalculationTypes) {
// result = "ПланВидовРасчетаСсылка." + (configurationObject as
// ChartOfCalculationTypes).getName();
//
// } else if (configurationObject instanceof InformationRegister) {
// result = "РегистрСведенийНаборЗаписей." + (configurationObject as
// InformationRegister).getName();
//
// }
//
// return result;
// }

// private EObject getConfigurationTabularSection(MdObject configurationObject,
// String attributeTabularName) {
//
// EObject object = null;
//
// if (configurationObject instanceof Catalog) {
// for (CatalogTabularSection tabularSection : ((Catalog)
// configurationObject).getTabularSections())
// if (tabularSection.getName().equals(attributeTabularName)) {
// object = tabularSection;
// break;
// }
//
// } else if (configurationObject instanceof Document) {
// Document typedObject = (Document) configurationObject;
// for (DocumentTabularSection tabularSection :
// typedObject.getTabularSections())
// if (tabularSection.getName().equals(attributeTabularName)) {
// object = tabularSection;
// break;
// }
// if (object == null)
// for (BasicRegister tabularSection : typedObject.getRegisterRecords())
// if (tabularSection.getName().equals(attributeTabularName)) {
// object = tabularSection;
// break;
// }
//
// } else if (configurationObject instanceof ChartOfCharacteristicTypes) {
// for (ChartOfCharacteristicTypesTabularSection tabularSection :
// ((ChartOfCharacteristicTypes) configurationObject)
// .getTabularSections())
// if (tabularSection.getName().equals(attributeTabularName)) {
// object = tabularSection;
// break;
// }
//
// } else if (configurationObject instanceof ChartOfCalculationTypes) {
// ChartOfCalculationTypes typedObject = (ChartOfCalculationTypes)
// configurationObject;
// for (StandardTabularSectionDescription tabularSection :
// typedObject.getStandardTabularSections())
// if (tabularSection.getName().equals(attributeTabularName)) {
// object = tabularSection;
// break;
// }
// if (object == null)
// for (ChartOfCalculationTypesTabularSection tabularSection :
// typedObject.getTabularSections())
// if (tabularSection.getName().equals(attributeTabularName)) {
// object = tabularSection;
// break;
// }
//
// }
//
// if (object == null)
// LOG.log(new Status(IStatus.WARNING, PLUGIN_ID,
// "Не найдена табличная часть конфигурации: " + attributeTabularName));
//
// return object;
// }
//
// private EObject getConfigurationAttribute(MdObject configurationObject,
// String attributeTabularName,
// String attributeName) {
//
// EObject object = null;
//
// if (attributeTabularName.isEmpty()) {
// if (configurationObject instanceof Catalog) {
// Catalog typedObject = (Catalog) configurationObject;
// for (StandardAttribute attribute : typedObject.getStandardAttributes())
// if (attribute.getName().equals(attributeName)) {
// object = attribute;
// break;
// }
// if (object == null)
// for (MdObject attribute : typedObject.getAttributes())
// if (attribute.getName().equals(attributeName)) {
// object = attribute;
// break;
// }
//
// } else if (configurationObject instanceof Document) {
// Document typedObject = (Document) configurationObject;
// for (StandardAttribute attribute : typedObject.getStandardAttributes())
// if (attribute.getName().equals(attributeName)) {
// object = attribute;
// break;
// }
// if (object == null)
// for (DocumentAttribute attribute : typedObject.getAttributes())
// if (attribute.getName().equals(attributeName)) {
// object = attribute;
// break;
// }
//
// } else if (configurationObject instanceof ChartOfCharacteristicTypes) {
// ChartOfCharacteristicTypes typedObject = (ChartOfCharacteristicTypes)
// configurationObject;
// for (StandardAttribute attribute : typedObject.getStandardAttributes())
// if (attribute.getName().equals(attributeName)) {
// object = attribute;
// break;
// }
// if (object == null)
// for (ChartOfCharacteristicTypesAttribute attribute :
// typedObject.getAttributes())
// if (attribute.getName().equals(attributeName)) {
// object = attribute;
// break;
// }
//
// } else if (configurationObject instanceof ChartOfCalculationTypes) {
// ChartOfCalculationTypes typedObject = (ChartOfCalculationTypes)
// configurationObject;
// for (StandardAttribute attribute : typedObject.getStandardAttributes())
// if (attribute.getName().equals(attributeName)) {
// object = attribute;
// break;
// }
// if (object == null)
// for (ChartOfCalculationTypesAttribute attribute :
// typedObject.getAttributes())
// if (attribute.getName().equals(attributeName)) {
// object = attribute;
// break;
// }
//
// }
//
// if (object == null)
// LOG.log(new Status(IStatus.WARNING, PLUGIN_ID,
// "Не найден реквизит конфигурации: ".concat(attributeName)));
//
// } else {
// if (configurationObject instanceof Catalog) {
// for (CatalogTabularSection tabularSection : ((Catalog)
// configurationObject).getTabularSections())
// if (tabularSection.getName().equals(attributeTabularName)) {
// for (TabularSectionAttribute attribute : tabularSection.getAttributes())
// if (attribute.getName().equals(attributeName)) {
// object = attribute;
// break;
// }
// break;
// }
//
// } else if (configurationObject instanceof Document) {
// Document typedObject = (Document) configurationObject;
// for (DocumentTabularSection tabularSection :
// typedObject.getTabularSections())
// if (tabularSection.getName().equals(attributeTabularName)) {
// for (TabularSectionAttribute attribute : tabularSection.getAttributes())
// if (attribute.getName().equals(attributeName)) {
// object = attribute;
// break;
// }
// break;
// }
// if (object == null)
// for (BasicRegister tabularSection : typedObject.getRegisterRecords())
// if (tabularSection.getName().equals(attributeTabularName)) {
// for (Field attribute : tabularSection.getFields()) {
// String fieldAttributeName = attribute.getName();
// if (attribute instanceof Field)
// fieldAttributeName = attribute.getNameRu();
// if (fieldAttributeName.equals(attributeName)) {
// object = attribute;
// break;
// }
// break;
// }
// }
//
// } else if (configurationObject instanceof ChartOfCharacteristicTypes) {
// for (ChartOfCharacteristicTypesTabularSection tabularSection :
// ((ChartOfCharacteristicTypes) configurationObject)
// .getTabularSections())
// if (tabularSection.getName().equals(attributeTabularName)) {
// for (TabularSectionAttribute attribute : tabularSection.getAttributes())
// if (attribute.getName().equals(attributeName)) {
// object = attribute;
// break;
// }
// break;
// }
//
// } else if (configurationObject instanceof ChartOfCalculationTypes) {
// ChartOfCalculationTypes typedObject = (ChartOfCalculationTypes)
// configurationObject;
// for (StandardTabularSectionDescription tabularSection :
// typedObject.getStandardTabularSections())
// if (tabularSection.getName().equals(attributeTabularName)) {
// for (StandardAttribute attribute : tabularSection.getStandardAttributes())
// if (attribute.getName().equals(attributeName)) {
// object = attribute;
// break;
// }
// break;
// }
// if (object == null)
// for (ChartOfCalculationTypesTabularSection tabularSection :
// typedObject.getTabularSections())
// if (tabularSection.getName().equals(attributeTabularName)) {
// for (TabularSectionAttribute attribute : tabularSection.getAttributes())
// if (attribute.getName().equals(attributeName)) {
// object = attribute;
// break;
// }
// break;
// }
//
// }
//
// if (object == null)
// LOG.log(new Status(IStatus.WARNING, PLUGIN_ID, "Не найден реквизит
// конфигурации: "
// .concat(attributeTabularName).concat(".").concat(attributeName)));
//
// }
//
// return object;
// }
