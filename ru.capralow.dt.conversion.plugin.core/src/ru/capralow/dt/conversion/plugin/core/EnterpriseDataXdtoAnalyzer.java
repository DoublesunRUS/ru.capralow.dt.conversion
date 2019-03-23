package ru.capralow.dt.conversion.plugin.core;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.resource.IEObjectDescription;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexProvider;
import com._1c.g5.v8.dt.mcore.QName;
import com._1c.g5.v8.dt.metadata.mdclass.XDTOPackage;
import com._1c.g5.v8.dt.xdto.model.Enumeration;
import com._1c.g5.v8.dt.xdto.model.ObjectType;
import com._1c.g5.v8.dt.xdto.model.Package;
import com._1c.g5.v8.dt.xdto.model.Property;
import com._1c.g5.v8.dt.xdto.model.Type;
import com._1c.g5.v8.dt.xdto.model.ValueType;

import ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseDataXdto;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdDefinedType;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdObject;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdType;
import ru.capralow.dt.conversion.plugin.core.ed.model.edFactory;
import ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion;

public class EnterpriseDataXdtoAnalyzer {
	private static final String PLUGIN_ID = "ru.capralow.dt.conversion.plugin.ui";
	private static ILog LOG = Platform.getLog(Platform.getBundle(PLUGIN_ID));

	public static EnterpriseDataXdto loadResource(EpFormatVersion epFormatVersion, IProject project,
			IBmEmfIndexProvider bmEmfIndexProvider, AbstractUIPlugin plugin) {
		URI uri = URI.createPlatformResourceURI(project.getName() + File.separator + "enterpriseDataPackage-"
				+ epFormatVersion.getVersion().replace(".", "_") + ".xmi", false);

		try {
			File file = ConversionUtils.getResourceFile(uri, plugin);

			XMIResource xmiResource = new XMIResourceImpl(URI.createFileURI(file.getPath()));

			// TODO: Сделать пересборку вторичных данных если файла нет
			if (!file.exists())
				return null;

			final Map<Object, Object> loadOptions = xmiResource.getDefaultLoadOptions();
			xmiResource.load(loadOptions);
			EnterpriseDataXdto enterpriseDataPackage = (EnterpriseDataXdto) xmiResource.getContents().get(0);

			for (EdEnum fpEnum : enterpriseDataPackage.getEnums()) {
				Iterable<IEObjectDescription> objectIndex = bmEmfIndexProvider.getEObjectIndex(fpEnum.getObject());
				Iterator<IEObjectDescription> objectItr = objectIndex.iterator();
				if (objectItr.hasNext())
					fpEnum.setObject((ValueType) objectItr.next().getEObjectOrProxy());

				EList<Enumeration> oldList = fpEnum.getEnumerations();
				EList<Enumeration> newList = new BasicEList<Enumeration>();
				for (Enumeration oldItem : oldList) {
					objectIndex = bmEmfIndexProvider.getEObjectIndex(oldItem);
					objectItr = objectIndex.iterator();
					if (objectItr.hasNext())
						newList.add((Enumeration) objectItr.next().getEObjectOrProxy());
				}
				oldList.clear();
				oldList.addAll(newList);
			}

			return enterpriseDataPackage;

		} catch (IOException e) {
			e.printStackTrace();

		}

		return null;
	}

	public static void saveResource(EpFormatVersion epFormatVersion, EnterpriseDataXdto enterpriseDataPackage,
			IProject project, AbstractUIPlugin plugin) {
		URI uri = URI.createPlatformResourceURI(project.getName() + File.separator + "enterpriseDataPackage-"
				+ epFormatVersion.getVersion().replace(".", "_") + ".xmi", false);

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

	public static EnterpriseDataXdto analyze(EpFormatVersion epFormatVersion) {
		EnterpriseDataXdto enterpriseDataPackage = edFactory.eINSTANCE.createEnterpriseDataXdto();

		EList<EdDefinedType> fpDefinedTypes = enterpriseDataPackage.getDefinedTypes();
		EList<EdObject> fpCatalogs = enterpriseDataPackage.getCatalogs();
		EList<EdObject> fpDocuments = enterpriseDataPackage.getDocuments();
		EList<EdEnum> fpEnums = enterpriseDataPackage.getEnums();
		EList<EdObject> fpRegisters = enterpriseDataPackage.getRegisters();

		fpDefinedTypes.clear();
		fpCatalogs.clear();
		fpDocuments.clear();
		fpEnums.clear();
		fpRegisters.clear();

		enterpriseDataPackage.setVersion(epFormatVersion.getVersion());

		Package dataPackage = ((XDTOPackage) epFormatVersion.getXdtoPackage()).getPackage();

		Map<String, ObjectType> packageObjects = new HashMap<String, ObjectType>();
		for (ObjectType object : dataPackage.getObjects()) {
			String objectName = object.getName();
			packageObjects.put(objectName, object);
		}

		Map<String, ValueType> packageValues = new HashMap<String, ValueType>();
		for (ValueType type : dataPackage.getTypes()) {
			String typeName = type.getName();
			packageValues.put(typeName, type);
		}

		for (ObjectType object : dataPackage.getObjects()) {
			QName baseType = object.getBaseType();

			String objectName = object.getName();
			if (baseType != null && baseType.getName().equals("Object")) {
				EList<EdProperty> fpProperties = null;

				EdObject fpObject = edFactory.eINSTANCE.createEdObject();
				if (objectName.startsWith("Справочник.")) {
					fpCatalogs.add(fpObject);

				} else if (objectName.startsWith("Документ.")) {
					fpDocuments.add(fpObject);

				} else if (objectName.startsWith("Регистр")) {
					fpRegisters.add(fpObject);

				} else {
					String msg = String.format(
							"У типа объекта \"%1$s\" версии формата \"%2$s\" ошибочно заполнен базовый тип", objectName,
							epFormatVersion.getVersion());

					LOG.log(new Status(IStatus.WARNING, PLUGIN_ID, msg));
					continue;

				}

				fpObject.setObject(object);
				fpObject.setName(objectName);

				fpProperties = fpObject.getProperties();

				for (Property property : object.getProperties()) {
					String propertyName = property.getName();

					if (propertyName.equals("КлючевыеСвойства")) {
						String propertyTypeName = property.getType().getName();
						ObjectType propertyTypeObject = packageObjects.get(propertyTypeName);

						EList<EdProperty> fpKeyProperties = null;

						fpObject.setKeysObject(propertyTypeObject);
						fpObject.setKeysObjectName(propertyTypeName);
						fpKeyProperties = fpObject.getKeyProperties();

						for (Property subProperty : propertyTypeObject.getProperties()) {
							addProperty(subProperty, subProperty.getName(), true, fpProperties, packageObjects,
									packageValues);

							addProperty(subProperty, subProperty.getName(), true, fpKeyProperties, packageObjects,
									packageValues);
						}

					} else {
						boolean tabularSection = false;

						String subPropertyTypeName = "";
						if (property.getType() != null) {
							String propertyTabularTypeName = property.getType().getName();
							ObjectType propertyTabularSection = packageObjects.get(propertyTabularTypeName);

							if (propertyTabularSection != null) {
								EList<Property> subProperties = propertyTabularSection.getProperties();
								if (subProperties.size() == 1) {
									Property subProperty = propertyTabularSection.getProperties().get(0);
									String subPropertyName = subProperty.getName();
									if (subPropertyName.equals("Строка")) {
										subPropertyTypeName = subProperty.getType().getName();
										tabularSection = true;
									}
								}
							}
						}

						if (tabularSection) {
							ObjectType propertyObject = packageObjects.get(subPropertyTypeName);

							for (Property subProperty : propertyObject.getProperties()) {
								addProperty(subProperty, propertyName.concat(".").concat(subProperty.getName()), false,
										fpProperties, packageObjects, packageValues);
							}

						} else
							addProperty(property, property.getName(), false, fpProperties, packageObjects,
									packageValues);

					}
				}

			} else {
				if (objectName.contains(".") || objectName.startsWith("КлючевыеСвойства"))
					continue;

				EdDefinedType fpDefinedType = edFactory.eINSTANCE.createEdDefinedType();
				fpDefinedTypes.add(fpDefinedType);

				EList<EdType> fpTypes = fpDefinedType.getTypes();

				fpDefinedType.setName(objectName);
				for (Property property : object.getProperties()) {
					String propertyName = property.getName();

					EdType fpType = edFactory.eINSTANCE.createEdType();
					fpTypes.add(fpType);

					fpType.setName(propertyName);
					fpType.setPropertyType(getPropertyType(property));
				}

			}
		}

		for (ValueType type : dataPackage.getTypes()) {
			EList<Enumeration> enums = type.getEnumerations();
			if (enums.size() == 0)
				continue;

			EdEnum fpEnum = edFactory.eINSTANCE.createEdEnum();
			fpEnums.add(fpEnum);

			fpEnum.setObject(type);
			fpEnum.setName(type.getName());

			fpEnum.getEnumerations().addAll(enums);
		}

		return enterpriseDataPackage;
	}

	private static void addProperty(Property property, String propertyName, Boolean isKey,
			EList<EdProperty> fpProperties, Map<String, ObjectType> packageObjects,
			Map<String, ValueType> packageValues) {
		EdProperty fpProperty = edFactory.eINSTANCE.createEdProperty();
		fpProperties.add(fpProperty);

		fpProperty.setProperty(property);
		fpProperty.setName(propertyName);

		fpProperty.setRequired(property.getLowerBound() == 1);

		fpProperty.setPropertyType(getPropertyType(property));

		fpProperty.setIsKey(isKey);
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
					propertyTypeName += getPropertyType(typeProperty);
				}

			}

		} else {
			propertyTypeName = propertyType.getName();

			if (propertyTypeName.equals("anyType"))
				propertyTypeName = "Произвольный";

			else if (propertyTypeName.equals("boolean"))
				propertyTypeName = "Булево";

			else if (propertyTypeName.equals("date"))
				propertyTypeName = "Дата (дата)";

			else if (propertyTypeName.equals("dateTime"))
				propertyTypeName = "Дата (дата и время)";

			else if (propertyTypeName.equals("decimal"))
				propertyTypeName = "Число (дробное)";

			else if (propertyTypeName.equals("int"))
				propertyTypeName = "Число (целое)";

			else if (propertyTypeName.equals("string"))
				propertyTypeName = "Строка";

			else if (propertyTypeName.equals("time"))
				propertyTypeName = "Дата (время)";

		}

		return propertyTypeName;
	}

	private static String getBasePropertyType(ValueType propertyValueTypeDef) {
		String propertyTypeName = propertyValueTypeDef.getBaseType().getName();

		if (propertyTypeName.equals("string")) {
			propertyTypeName = "Строка";

			int maxLength = propertyValueTypeDef.getMaxLength();
			if (maxLength != 0)
				propertyTypeName += " (".concat(Integer.toString(maxLength)).concat(")");

		} else if (propertyTypeName.equals("decimal")) {
			propertyTypeName = "Число (дробное)";

			int totalDigits = propertyValueTypeDef.getTotalDigits();
			int fractionDigits = propertyValueTypeDef.getFractionDigits();
			if (totalDigits != 0)
				propertyTypeName = "Число (".concat(Integer.toString(totalDigits)).concat(",")
						.concat(Integer.toString(fractionDigits)).concat(")");

		} else if (propertyTypeName.equals("int")) {
			propertyTypeName = "Число (целое)";

			int totalDigits = propertyValueTypeDef.getTotalDigits();
			if (totalDigits != 0)
				propertyTypeName = "Число (".concat(Integer.toString(totalDigits)).concat(")");

		}

		return propertyTypeName;
	}
}
