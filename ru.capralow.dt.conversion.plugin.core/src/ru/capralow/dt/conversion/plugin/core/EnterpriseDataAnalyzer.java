package ru.capralow.dt.conversion.plugin.core;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com._1c.g5.v8.dt.mcore.QName;
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

public class EnterpriseDataAnalyzer {
	private static final String PLUGIN_ID = "ru.capralow.dt.conversion.plugin.ui";
	private static ILog LOG = Platform.getLog(Platform.getBundle(PLUGIN_ID));

	public static EnterpriseData loadResource(String version, IProject project, Configuration configuration,
			AbstractUIPlugin plugin) {
		URI uri = URI.createPlatformResourceURI(
				project.getName() + File.separator + "enterpriseDataPackage-" + version.replace(".", "_") + ".xmi",
				false);

		try {
			File file = ConversionUtils.getResourceFile(uri, plugin);

			XMIResource xmiResource = new XMIResourceImpl(URI.createFileURI(file.getPath()));

			// TODO: Сделать пересборку вторичных данных если файла нет
			if (!file.exists())
				return null;

			final Map<Object, Object> loadOptions = xmiResource.getDefaultLoadOptions();
			xmiResource.load(loadOptions);
			EnterpriseData enterpriseDataPackage = (EnterpriseData) xmiResource.getContents().get(0);

			enterpriseDataPackage.setXdtoPackage(
					(XDTOPackage) EcoreUtil.resolve(enterpriseDataPackage.getXdtoPackage(), configuration));

			for (EdEnum edEnum : enterpriseDataPackage.getEnums()) {
				edEnum.setObject((ValueType) EcoreUtil.resolve(edEnum.getObject(), configuration));

				EList<Enumeration> oldList = edEnum.getEnumerations();
				EList<Enumeration> newList = new BasicEList<Enumeration>();
				for (Enumeration oldItem : oldList)
					newList.add((Enumeration) EcoreUtil.resolve(oldItem, configuration));
				oldList.clear();
				oldList.addAll(newList);
			}

			return enterpriseDataPackage;

		} catch (IOException e) {
			e.printStackTrace();

		}

		return null;
	}

	public static void saveResource(EnterpriseData enterpriseDataPackage, IProject project, AbstractUIPlugin plugin) {
		URI uri = URI.createPlatformResourceURI(project.getName() + File.separator + "enterpriseDataPackage-"
				+ enterpriseDataPackage.getVersion().replace(".", "_") + ".xmi", false);

		File file;
		try {
			file = ConversionUtils.getResourceFile(uri, plugin);

			XMIResource xmiResource = new XMIResourceImpl(URI.createFileURI(file.getPath()));

			xmiResource.getContents().add(enterpriseDataPackage);
			final Map<Object, Object> saveOptions = xmiResource.getDefaultSaveOptions();
			saveOptions.put(XMIResource.OPTION_ENCODING, "UTF-8");
			xmiResource.save(saveOptions);

		} catch (IOException e) {
			e.printStackTrace();

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

		HashMap<String, ObjectType> packageObjects = new HashMap<String, ObjectType>();
		for (ObjectType object : dataPackage.getObjects()) {
			String objectName = object.getName();
			packageObjects.put(objectName, object);
		}

		HashMap<String, ValueType> packageValues = new HashMap<String, ValueType>();
		for (ValueType type : dataPackage.getTypes()) {
			String typeName = type.getName();
			packageValues.put(typeName, type);
		}

		for (ObjectType xdtoObject : dataPackage.getObjects()) {
			QName baseType = xdtoObject.getBaseType();

			String objectName = xdtoObject.getName();
			if (baseType != null && baseType.getName().equals("Object")) {
				if (objectName.startsWith("Справочник.")) {
					addCatalog(xdtoObject, enterpriseDataPackage, packageObjects, packageValues);

				} else if (objectName.startsWith("Документ.")) {
					addDocument(xdtoObject, enterpriseDataPackage, packageObjects, packageValues);

				} else if (objectName.startsWith("Регистр")) {
					addRegister(xdtoObject, enterpriseDataPackage, packageObjects, packageValues);

				} else {
					addUnknownObject(xdtoObject, enterpriseDataPackage, packageObjects, packageValues);
					String msg = String.format(
							"У типа объекта \"%1$s\" версии формата \"%2$s\" ошибочно заполнен базовый тип", objectName,
							version);

					LOG.log(new Status(IStatus.WARNING, PLUGIN_ID, msg));
					continue;

				}

			} else {
				if (objectName.contains(".") || objectName.startsWith("КлючевыеСвойства"))
					continue;

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
		}

		for (ValueType type : dataPackage.getTypes()) {
			EList<Enumeration> enums = type.getEnumerations();
			if (enums.size() == 0)
				continue;

			EdEnum edEnum = edFactory.eINSTANCE.createEdEnum();
			edEnums.add(edEnum);

			edEnum.setObject(type);
			edEnum.setName(type.getName());

			edEnum.getEnumerations().addAll(enums);
		}

		return enterpriseDataPackage;
	}

	private static EdObject addObject(ObjectType xdtoObject, HashMap<String, ObjectType> packageObjects,
			HashMap<String, ValueType> packageValues) {
		EdObject edObject = edFactory.eINSTANCE.createEdObject();

		edObject.setMainName(xdtoObject.getName());

		edObject.setXdtoMainObject(xdtoObject);

		EList<EdProperty> edProperties = edObject.getMainProperties();

		for (Property xdtoProperty : xdtoObject.getProperties()) {
			String xdtoPropertyName = xdtoProperty.getName();

			if (xdtoPropertyName.equals("КлючевыеСвойства")) {
				String xdtoKeyPropertyName = xdtoProperty.getType().getName();
				ObjectType xdtoKeyObject = packageObjects.get(xdtoKeyPropertyName);

				edObject.setXdtoKeysObject(xdtoKeyObject);
				edObject.setKeysName(xdtoKeyPropertyName);

				for (Property xdtoKeyProperty : xdtoKeyObject.getProperties()) {
					edProperties.add(addProperty(xdtoKeyProperty, xdtoKeyProperty.getName(), true));
				}

			} else {
				boolean tabularSection = false;

				String xdtoTabularSectionName = "";
				if (xdtoProperty.getType() != null) {
					String xdtoTabularName = xdtoProperty.getType().getName();
					ObjectType xdtoTabularObject = packageObjects.get(xdtoTabularName);

					if (xdtoTabularObject != null) {
						EList<Property> xdtoTabularProperties = xdtoTabularObject.getProperties();
						if (xdtoTabularProperties.size() == 1) {
							Property xdtoTabularProperty = xdtoTabularObject.getProperties().get(0);
							if (xdtoTabularProperty.getName().equals("Строка")) {
								xdtoTabularSectionName = xdtoTabularProperty.getType().getName();
								tabularSection = true;
							}
						}
					}
				}

				if (tabularSection) {
					ObjectType xdtoTabularObject = packageObjects.get(xdtoTabularSectionName);

					for (Property xdtoTabularProperty : xdtoTabularObject.getProperties()) {
						edProperties.add(addProperty(xdtoTabularProperty,
								xdtoPropertyName.concat(".").concat(xdtoTabularProperty.getName()), false));
					}

				} else
					edProperties.add(addProperty(xdtoProperty, xdtoProperty.getName(), false));

			}
		}

		return edObject;
	}

	private static void addCatalog(ObjectType xdtoObject, EnterpriseData enterpriseDataPackage,
			HashMap<String, ObjectType> packageObjects, HashMap<String, ValueType> packageValues) {
		enterpriseDataPackage.getCatalogs().add(addObject(xdtoObject, packageObjects, packageValues));
	}

	private static void addDocument(ObjectType xdtoObject, EnterpriseData enterpriseDataPackage,
			HashMap<String, ObjectType> packageObjects, HashMap<String, ValueType> packageValues) {
		enterpriseDataPackage.getDocuments().add(addObject(xdtoObject, packageObjects, packageValues));
	}

	private static void addRegister(ObjectType xdtoObject, EnterpriseData enterpriseDataPackage,
			HashMap<String, ObjectType> packageObjects, HashMap<String, ValueType> packageValues) {
		enterpriseDataPackage.getRegisters().add(addObject(xdtoObject, packageObjects, packageValues));
	}

	private static void addUnknownObject(ObjectType xdtoObject, EnterpriseData enterpriseDataPackage,
			HashMap<String, ObjectType> packageObjects, HashMap<String, ValueType> packageValues) {
		enterpriseDataPackage.getUnknownObjects().add(addObject(xdtoObject, packageObjects, packageValues));
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
			Type propertyTypeDef = property.getTypeDefs();

			if (propertyTypeDef instanceof ValueType) {
				ValueType propertyValueTypeDef = (ValueType) propertyTypeDef;

				if (propertyValueTypeDef.getName() != null)
					propertyTypeName = propertyValueTypeDef.getName();

				else if (propertyValueTypeDef.getBaseType() != null)
					propertyTypeName = getBasePropertyType(propertyValueTypeDef);

			} else if (propertyTypeDef instanceof ObjectType) {
				ObjectType propertyObjectTypeDef = (ObjectType) propertyTypeDef;

				for (Property typeProperty : propertyObjectTypeDef.getProperties()) {
					if (!propertyTypeName.isEmpty())
						propertyTypeName += ";";
					propertyTypeName += typeProperty.getName().concat(":").concat(getPropertyType(typeProperty));
				}

			}

		} else {
			propertyTypeName = propertyType.getName();

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
				propertyTypeName = "Строка";

			else if (propertyTypeName.equals("time"))
				propertyTypeName = "Время";

		}

		return propertyTypeName;
	}

	private static String getBasePropertyType(ValueType propertyValueTypeDef) {
		String propertyTypeName = propertyValueTypeDef.getBaseType().getName();

		if (propertyTypeName.equals("string")) {
			propertyTypeName = "Строка";

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
