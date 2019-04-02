package ru.capralow.dt.conversion.plugin.core;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com._1c.g5.v8.dt.mcore.QName;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com._1c.g5.v8.dt.metadata.mdclass.Configuration;
import com._1c.g5.v8.dt.metadata.mdclass.XDTOPackage;
import com._1c.g5.v8.dt.xdto.model.Enumeration;
import com._1c.g5.v8.dt.xdto.model.ObjectType;
import com._1c.g5.v8.dt.xdto.model.Package;
import com._1c.g5.v8.dt.xdto.model.Property;
import com._1c.g5.v8.dt.xdto.model.Type;
import com._1c.g5.v8.dt.xdto.model.ValueType;

import ru.capralow.dt.conversion.plugin.core.ed.model.EdDefinedType;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdObject;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdType;
import ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData;
import ru.capralow.dt.conversion.plugin.core.ed.model.edFactory;
import ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion;
import ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject;

public class EnterpriseDataAnalyzer {
	private static final String TABULAR_ID = "Строка";

	private static final String TYPE_STRING = "Строка";

	private EnterpriseDataAnalyzer() {
		throw new IllegalStateException("Вспомогательный класс");
	}

	public static URI getResourceURIforPlugin(String version, IProject project, AbstractUIPlugin plugin) {
		return ConversionUtils.getResourceURIforPlugin(project.getName(),
				"enterpriseDataPackage-" + version.replace(".", "_"), plugin);
	}

	public static EnterpriseData loadResource(URI xmiUri, Configuration configuration) {
		File file = new File(xmiUri.toFileString());
		if (!file.exists())
			return null;

		try {
			XMIResource xmiResource = new XMIResourceImpl(xmiUri);

			// TODO: Сделать пересборку вторичных данных если файла нет
			final Map<Object, Object> loadOptions = xmiResource.getDefaultLoadOptions();
			xmiResource.load(loadOptions);
			EnterpriseData enterpriseDataPackage = (EnterpriseData) xmiResource.getContents().get(0);

			enterpriseDataPackage.setXdtoPackage(
					(XDTOPackage) EcoreUtil.resolve(enterpriseDataPackage.getXdtoPackage(), configuration));

			for (EdEnum edEnum : enterpriseDataPackage.getEnums()) {
				edEnum.setObject((ValueType) EcoreUtil.resolve(edEnum.getObject(), configuration));

				EList<Enumeration> oldList = edEnum.getEnumerations();
				EList<Enumeration> newList = new BasicEList<>();
				for (Enumeration oldItem : oldList)
					newList.add((Enumeration) EcoreUtil.resolve(oldItem, configuration));
				oldList.clear();
				oldList.addAll(newList);
			}

			return enterpriseDataPackage;

		} catch (IOException e) {
			Logger logger = LoggerFactory.getLogger(EnterpriseDataAnalyzer.class);
			logger.error("Не удалось загрузить вторичные данные для EnterpriseData. Перезапустите сборку проекта.", e);

		}

		return null;
	}

	public static void saveResource(EnterpriseData enterpriseDataPackage, URI xmiUri) {
		try {
			XMIResource xmiResource = new XMIResourceImpl(xmiUri);

			xmiResource.getContents().add(enterpriseDataPackage);
			final Map<Object, Object> saveOptions = xmiResource.getDefaultSaveOptions();
			saveOptions.put(XMIResource.OPTION_ENCODING, "UTF-8");
			xmiResource.save(saveOptions);

		} catch (IOException e) {
			Logger logger = LoggerFactory.getLogger(EnterpriseDataAnalyzer.class);
			logger.error("Не удалось сохранить вторичные данные для EnterpriseData. Перезапустите сборку проекта.", e);

		}
	}

	public static EnterpriseData analyze(XDTOPackage xdtoPackage) {
		String[] namespaceArray = xdtoPackage.getNamespace().split("[/]");
		String version = namespaceArray[namespaceArray.length - 1];

		EnterpriseData enterpriseDataPackage = edFactory.eINSTANCE.createEnterpriseData();

		EList<EdDefinedType> edDefinedTypes = enterpriseDataPackage.getDefinedTypes();
		EList<EdEnum> edEnums = enterpriseDataPackage.getEnums();

		edDefinedTypes.clear();
		edEnums.clear();

		enterpriseDataPackage.setVersion(version);
		enterpriseDataPackage.setXdtoPackage(xdtoPackage);

		Package dataPackage = xdtoPackage.getPackage();

		Map<String, ObjectType> packageObjects = new HashMap<>();
		for (ObjectType object : dataPackage.getObjects()) {
			String objectName = object.getName();
			packageObjects.put(objectName, object);
		}

		Map<String, ValueType> packageValues = new HashMap<>();
		for (ValueType type : dataPackage.getTypes()) {
			String typeName = type.getName();
			packageValues.put(typeName, type);
		}

		for (ObjectType xdtoObject : dataPackage.getObjects()) {
			QName baseType = xdtoObject.getBaseType();

			String objectName = xdtoObject.getName();
			if (baseType != null && baseType.getName().equals("Object")) {
				parseObject(objectName, xdtoObject, enterpriseDataPackage, packageObjects, version);

			} else {
				if (objectName.contains(".") || objectName.startsWith("КлючевыеСвойства"))
					continue;

				parseType(objectName, xdtoObject, edDefinedTypes);

			}
		}

		for (ValueType type : dataPackage.getTypes()) {
			EList<Enumeration> enums = type.getEnumerations();
			if (enums.isEmpty())
				continue;

			EdEnum edEnum = edFactory.eINSTANCE.createEdEnum();
			edEnums.add(edEnum);

			edEnum.setObject(type);
			edEnum.setName(type.getName());

			edEnum.getEnumerations().addAll(enums);
		}

		return enterpriseDataPackage;
	}

	public static Map<String, EnterpriseData> loadPluginResources(CommonModule commonModule,
			ExchangeProject exchangeProject, Configuration configuration, IProject project, AbstractUIPlugin plugin) {
		Map<String, EnterpriseData> enterpriseDataPackages = new HashMap<>();

		for (EpFormatVersion epFormatVersion : exchangeProject.getFormatVersions()) {
			if (!epFormatVersion.getModule().equals(commonModule))
				continue;

			URI edXmiURI = EnterpriseDataAnalyzer.getResourceURIforPlugin(epFormatVersion.getVersion(), project,
					plugin);

			EnterpriseData enterpriseDataPackage = loadResource(edXmiURI, configuration);

			enterpriseDataPackages.put(epFormatVersion.getVersion(), enterpriseDataPackage);
		}

		return enterpriseDataPackages;
	}

	private static void parseObject(String objectName, ObjectType xdtoObject, EnterpriseData enterpriseDataPackage,
			Map<String, ObjectType> packageObjects, String version) {
		if (objectName.startsWith("Справочник.")) {
			addCatalog(xdtoObject, enterpriseDataPackage, packageObjects);

		} else if (objectName.startsWith("Документ.")) {
			addDocument(xdtoObject, enterpriseDataPackage, packageObjects);

		} else if (objectName.startsWith("Регистр")) {
			addRegister(xdtoObject, enterpriseDataPackage, packageObjects);

		} else {
			addUnknownObject(xdtoObject, enterpriseDataPackage, packageObjects);
			String msg = String.format("У типа объекта \"%1$s\" версии формата \"%2$s\" ошибочно заполнен базовый тип",
					objectName, version);
			Logger logger = LoggerFactory.getLogger(EnterpriseDataAnalyzer.class);
			logger.warn(msg);
		}

	}

	private static void parseType(String objectName, ObjectType xdtoObject, EList<EdDefinedType> edDefinedTypes) {
		EdDefinedType edDefinedType = edFactory.eINSTANCE.createEdDefinedType();
		edDefinedTypes.add(edDefinedType);

		EList<EdType> edTypes = edDefinedType.getTypes();

		edDefinedType.setName(objectName);
		for (Property property : xdtoObject.getProperties()) {
			String propertyName = property.getName();

			EdType edType = edFactory.eINSTANCE.createEdType();
			edTypes.add(edType);

			edType.setName(propertyName);
			edType.setPropertyType(getPropertyType(property));
		}
	}

	private static EdObject addObject(ObjectType xdtoObject, Map<String, ObjectType> packageObjects) {
		EdObject edObject = edFactory.eINSTANCE.createEdObject();

		edObject.setMainName(xdtoObject.getName());

		edObject.setXdtoMainObject(xdtoObject);

		for (Property xdtoProperty : xdtoObject.getProperties()) {
			String xdtoPropertyName = xdtoProperty.getName();

			if (xdtoPropertyName.equals("КлючевыеСвойства"))
				addKeysToObject(edObject, xdtoProperty, packageObjects);

			else
				addPropertiesToObject(edObject, xdtoProperty, packageObjects);

		}

		return edObject;
	}

	private static void addKeysToObject(EdObject edObject, Property xdtoProperty,
			Map<String, ObjectType> packageObjects) {
		EList<EdProperty> edProperties = edObject.getMainProperties();

		String xdtoKeyPropertyName = xdtoProperty.getType().getName();
		ObjectType xdtoKeyObject = packageObjects.get(xdtoKeyPropertyName);

		edObject.setXdtoKeysObject(xdtoKeyObject);
		edObject.setKeysName(xdtoKeyPropertyName);

		for (Property xdtoKeyProperty : xdtoKeyObject.getProperties()) {
			edProperties.add(addProperty(xdtoKeyProperty, xdtoKeyProperty.getName(), true));
		}

	}

	private static void addPropertiesToObject(EdObject edObject, Property xdtoProperty,
			Map<String, ObjectType> packageObjects) {
		EList<EdProperty> edProperties = edObject.getMainProperties();

		boolean tabularSection = false;

		String xdtoTabularSectionName = "";
		if (xdtoProperty.getType() != null) {
			String xdtoTabularName = xdtoProperty.getType().getName();
			ObjectType xdtoTabularObject = packageObjects.get(xdtoTabularName);

			if (xdtoTabularObject != null) {
				EList<Property> xdtoTabularProperties = xdtoTabularObject.getProperties();
				if (xdtoTabularProperties.size() == 1) {
					Property xdtoTabularProperty = xdtoTabularObject.getProperties().get(0);
					if (xdtoTabularProperty.getName().equals(TABULAR_ID)) {
						xdtoTabularSectionName = xdtoTabularProperty.getType().getName();
						tabularSection = true;
					}
				}
			}
		}

		if (tabularSection) {
			ObjectType xdtoTabularObject = packageObjects.get(xdtoTabularSectionName);
			String xdtoPropertyName = xdtoProperty.getName();

			for (Property xdtoTabularProperty : xdtoTabularObject.getProperties()) {
				edProperties.add(addProperty(xdtoTabularProperty,
						xdtoPropertyName.concat(".").concat(xdtoTabularProperty.getName()), false));
			}

		} else {
			edProperties.add(addProperty(xdtoProperty, xdtoProperty.getName(), false));

		}

	}

	private static void addCatalog(ObjectType xdtoObject, EnterpriseData enterpriseDataPackage,
			Map<String, ObjectType> packageObjects) {
		enterpriseDataPackage.getCatalogs().add(addObject(xdtoObject, packageObjects));
	}

	private static void addDocument(ObjectType xdtoObject, EnterpriseData enterpriseDataPackage,
			Map<String, ObjectType> packageObjects) {
		enterpriseDataPackage.getDocuments().add(addObject(xdtoObject, packageObjects));
	}

	private static void addRegister(ObjectType xdtoObject, EnterpriseData enterpriseDataPackage,
			Map<String, ObjectType> packageObjects) {
		enterpriseDataPackage.getRegisters().add(addObject(xdtoObject, packageObjects));
	}

	private static void addUnknownObject(ObjectType xdtoObject, EnterpriseData enterpriseDataPackage,
			Map<String, ObjectType> packageObjects) {
		enterpriseDataPackage.getUnknownObjects().add(addObject(xdtoObject, packageObjects));
	}

	private static EdProperty addProperty(Property xdtoProperty, String xdtoPropertyName, Boolean isKey) {
		EdProperty edProperty = edFactory.eINSTANCE.createEdProperty();

		edProperty.setName(xdtoPropertyName);

		edProperty.setXdtoProperty(xdtoProperty);

		edProperty.setIsKey(isKey);

		edProperty.setType(getPropertyType(xdtoProperty));

		edProperty.setRequired(xdtoProperty.getLowerBound() == 1);

		return edProperty;
	}

	private static String getPropertyType(Property property) {
		String propertyTypeName = "";

		QName propertyType = property.getType();
		if (propertyType == null) {
			propertyTypeName = getPreportyTypeFromTypeDef(property);

		} else {
			propertyTypeName = getPropertyTypeFromSimpleType(property);

		}

		return propertyTypeName;
	}

	private static String getPreportyTypeFromTypeDef(Property property) {
		String propertyTypeName = "";

		Type propertyTypeDef = property.getTypeDefs();

		if (propertyTypeDef instanceof ValueType) {
			ValueType propertyValueTypeDef = (ValueType) propertyTypeDef;

			if (propertyValueTypeDef.getName() != null)
				propertyTypeName = propertyValueTypeDef.getName();

			else if (propertyValueTypeDef.getBaseType() != null)
				propertyTypeName = getBasePropertyType(propertyValueTypeDef);

		} else if (propertyTypeDef instanceof ObjectType) {
			ObjectType propertyObjectTypeDef = (ObjectType) propertyTypeDef;

			StringBuilder multiPropertyTypeName = new StringBuilder();
			for (Property typeProperty : propertyObjectTypeDef.getProperties()) {
				if (multiPropertyTypeName.length() != 0)
					multiPropertyTypeName.append(";");
				multiPropertyTypeName.append(typeProperty.getName()).append(":").append(getPropertyType(typeProperty));
			}
			propertyTypeName = multiPropertyTypeName.toString();

		}

		return propertyTypeName;
	}

	private static String getPropertyTypeFromSimpleType(Property property) {
		String propertyTypeName = property.getType().getName();

		if (propertyTypeName.equals("anyType"))
			propertyTypeName = "Произвольный";

		else if (propertyTypeName.equals("boolean"))
			propertyTypeName = "Булево";

		else if (propertyTypeName.equals("date"))
			propertyTypeName = "Дата";

		else if (propertyTypeName.equals("dateTime"))
			propertyTypeName = "ДатаВремя";

		else if (propertyTypeName.equals("decimal"))
			propertyTypeName = "ДробноеЧисло";

		else if (propertyTypeName.equals("int"))
			propertyTypeName = "ЦелоеЧисло";

		else if (propertyTypeName.equals("string"))
			propertyTypeName = TYPE_STRING;

		else if (propertyTypeName.equals("time"))
			propertyTypeName = "Время";

		return propertyTypeName;
	}

	private static String getBasePropertyType(ValueType propertyValueTypeDef) {
		String propertyTypeName = propertyValueTypeDef.getBaseType().getName();

		if (propertyTypeName.equals("string")) {
			propertyTypeName = TYPE_STRING;

			int maxLength = propertyValueTypeDef.getMaxLength();
			if (maxLength != 0)
				propertyTypeName = "Строка(".concat(Integer.toString(maxLength)).concat(")");

		} else if (propertyTypeName.equals("decimal")) {
			propertyTypeName = "ДробноеЧисло";

			int totalDigits = propertyValueTypeDef.getTotalDigits();
			int fractionDigits = propertyValueTypeDef.getFractionDigits();
			if (totalDigits != 0)
				propertyTypeName = "ДробноеЧисло(".concat(Integer.toString(totalDigits)).concat(".")
						.concat(Integer.toString(fractionDigits)).concat(")");

		} else if (propertyTypeName.equals("int")) {
			propertyTypeName = "ЦелоеЧисло";

			int totalDigits = propertyValueTypeDef.getTotalDigits();
			if (totalDigits != 0)
				propertyTypeName = "ЦелоеЧисло(".concat(Integer.toString(totalDigits)).concat(")");

		}

		return propertyTypeName;
	}
}
