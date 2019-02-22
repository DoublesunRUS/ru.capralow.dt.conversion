package ru.capralow.dt.conversion.plugin.core;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;

import com._1c.g5.v8.dt.mcore.QName;
import com._1c.g5.v8.dt.metadata.mdclass.XDTOPackage;
import com._1c.g5.v8.dt.xdto.model.ObjectType;
import com._1c.g5.v8.dt.xdto.model.Package;
import com._1c.g5.v8.dt.xdto.model.Property;
import com._1c.g5.v8.dt.xdto.model.Type;
import com._1c.g5.v8.dt.xdto.model.ValueType;

import ru.capralow.dt.conversion.plugin.core.ev.EvFormatVersion;
import ru.capralow.dt.conversion.plugin.core.fp.FormatPackage;
import ru.capralow.dt.conversion.plugin.core.fp.FpCatalog;
import ru.capralow.dt.conversion.plugin.core.fp.FpDocument;
import ru.capralow.dt.conversion.plugin.core.fp.FpProperty;
import ru.capralow.dt.conversion.plugin.core.fp.FpRegister;
import ru.capralow.dt.conversion.plugin.core.fp.impl.FormatPackageImpl;
import ru.capralow.dt.conversion.plugin.core.fp.impl.FpCatalogImpl;
import ru.capralow.dt.conversion.plugin.core.fp.impl.FpDocumentImpl;
import ru.capralow.dt.conversion.plugin.core.fp.impl.FpPropertyImpl;
import ru.capralow.dt.conversion.plugin.core.fp.impl.FpRegisterImpl;

// TODO: Раскрывать КлючевыеСвойства
// TODO: Добавить ключевые поля в табличные части
// TODO: Добавить синонимы для стандартных реквизитов
// TODO: Добавить синонимы для движений документов
// TODO: Добавить вывод типов, перечислений и предопределенных элементов в конец документа
// TODO: Добавить переопределение подсистем и полей по комментарию модуля
// TODO: Ключевые свойства объекта вывести первыми

public class FormatPackageAnalyzer {
	private static final String PLUGIN_ID = "ru.capralow.dt.conversion.plugin.ui"; //$NON-NLS-1$
	private ILog LOG = Platform.getLog(Platform.getBundle(PLUGIN_ID));

	private FormatPackage formatPackage;

	public FormatPackage getFormatPackage() {
		return formatPackage;
	}

	public FormatPackageAnalyzer() {
		this.formatPackage = new FormatPackageImpl();
	}

	public void analyze(EvFormatVersion formatVersion) {
		EList<FpCatalog> fpCatalogs = formatPackage.getCatalogs();
		EList<FpDocument> fpDocuments = formatPackage.getDocuments();
		EList<FpRegister> fpRegisters = formatPackage.getRegisters();

		fpCatalogs.clear();
		fpDocuments.clear();
		fpRegisters.clear();

		formatPackage.setVersion(formatVersion.getVersion());

		Package dataPackage = ((XDTOPackage) formatVersion.getXdtoPackage()).getPackage();

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

				EList<FpProperty> fpProperties = null;

				Object fpObject = null;
				if (objectName.startsWith("Справочник.")) {
					fpObject = new FpCatalogImpl();
					FpCatalogImpl fpCatalog = (FpCatalogImpl) fpObject;
					fpCatalogs.add(fpCatalog);

					fpCatalog.setObject(object);
					fpCatalog.setName(objectName);

					fpProperties = fpCatalog.getProperties();

				} else if (objectName.startsWith("Документ.")) {
					fpObject = new FpDocumentImpl();
					FpDocumentImpl fpDocument = (FpDocumentImpl) fpObject;
					fpDocuments.add(fpDocument);

					fpDocument.setObject(object);
					fpDocument.setName(objectName);

					fpProperties = fpDocument.getProperties();

				} else if (objectName.startsWith("Регистр")) {
					fpObject = new FpRegisterImpl();
					FpRegisterImpl fpRegister = (FpRegisterImpl) fpObject;
					fpRegisters.add(fpRegister);

					fpRegister.setObject(object);
					fpRegister.setName(objectName);

					fpProperties = fpRegister.getProperties();

				} else {
					String msg = String.format(
							"У типа объекта \"%1$s\" версии формата \"%2$s\" ошибочно заполнен базовый тип", objectName,
							formatVersion.getVersion());

					LOG.log(new Status(IStatus.WARNING, PLUGIN_ID, msg));
					continue;
				}

				for (Property property : object.getProperties()) {
					String propertyName = property.getName();

					if (propertyName.equals("КлючевыеСвойства")) {
						String propertyTypeName = property.getType().getName();
						ObjectType propertyTypeObject = packageObjects.get(propertyTypeName);

						EList<FpProperty> fpKeyProperties = null;

						if (objectName.startsWith("Справочник.")) {
							FpCatalogImpl fpCatalog = (FpCatalogImpl) fpObject;

							fpCatalog.setKeysObject(propertyTypeObject);
							fpCatalog.setKeysObjectName(propertyTypeName);

						} else if (objectName.startsWith("Документ.")) {
							FpDocumentImpl fpDocument = (FpDocumentImpl) fpObject;

							fpDocument.setKeysObject(propertyTypeObject);
							fpDocument.setKeysObjectName(propertyTypeName);

						} else if (objectName.startsWith("Регистр")) {
							FpRegisterImpl fpRegister = (FpRegisterImpl) fpObject;

							fpRegister.setKeysObject(propertyTypeObject);
							fpRegister.setKeysObjectName(propertyTypeName);

						}

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
			}
		}

	}

	private void addProperty(Property property, String propertyName, Boolean isKey, EList<FpProperty> fpProperties,
			Map<String, ObjectType> packageObjects, Map<String, ValueType> packageValues) {
		FpPropertyImpl fpProperty = new FpPropertyImpl();
		fpProperties.add(fpProperty);

		fpProperty.setProperty(property);
		fpProperty.setName(propertyName);

		fpProperty.setRequired(property.getLowerBound() == 1);

		fpProperty.setPropertyType(getPropertyType(property));

		fpProperty.setIsKey(isKey);
	}

	private String getPropertyType(Property property) {
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

			if (propertyTypeName.equals("boolean"))
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

	private String getBasePropertyType(ValueType propertyValueTypeDef) {
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
