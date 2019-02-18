package ru.capralow.dt.conversion.plugin.core;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import com._1c.g5.v8.dt.mcore.QName;
import com._1c.g5.v8.dt.metadata.mdclass.XDTOPackage;
import com._1c.g5.v8.dt.xdto.model.ObjectType;
import com._1c.g5.v8.dt.xdto.model.Package;
import com._1c.g5.v8.dt.xdto.model.Property;
import com._1c.g5.v8.dt.xdto.model.ValueType;

import ru.capralow.dt.conversion.plugin.core.ev.EvFormatVersion;
import ru.capralow.dt.conversion.plugin.core.fp.FormatPackage;
import ru.capralow.dt.conversion.plugin.core.fp.FpCatalog;
import ru.capralow.dt.conversion.plugin.core.fp.FpProperty;
import ru.capralow.dt.conversion.plugin.core.fp.impl.FormatPackageImpl;
import ru.capralow.dt.conversion.plugin.core.fp.impl.FpCatalogImpl;
import ru.capralow.dt.conversion.plugin.core.fp.impl.FpPropertyImpl;

public class FormatPackageAnalyzer {

	private FormatPackage formatPackage;

	public FormatPackage getFormatPackage() {
		return formatPackage;
	}

	public FormatPackageAnalyzer() {
		this.formatPackage = new FormatPackageImpl();
	}

	public void analyze(EvFormatVersion formatVersion) {
		EList<FpCatalog> fpCatalogs = formatPackage.getCatalogs();

		fpCatalogs.clear();

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
			String objectName = object.getName();
			if (!objectName.startsWith("Справочник."))
				continue;

			FpCatalogImpl fpCatalog = new FpCatalogImpl();
			fpCatalogs.add(fpCatalog);

			fpCatalog.setObject(object);

			EList<FpProperty> fpProperties = fpCatalog.getProperties();
			fpProperties.clear();

			for (Property property : object.getProperties()) {
				String propertyName = property.getName();

				if (propertyName.equals("КлючевыеСвойства")) {
					String propertyTypeName = property.getType().getName();

					ObjectType propertyObject = packageObjects.get(propertyTypeName);
					for (Property subProperty : propertyObject.getProperties()) {
						addProperty(subProperty, fpProperties, packageObjects, packageValues);
					}

					continue;
				}

				addProperty(property, fpProperties, packageObjects, packageValues);
			}
		}

	}

	private void addProperty(Property property, EList<FpProperty> fpProperties, Map<String, ObjectType> packageObjects,
			Map<String, ValueType> packageValues) {
		FpPropertyImpl fpProperty = new FpPropertyImpl();
		fpProperties.add(fpProperty);

		fpProperty.setProperty(property);

		fpProperty.setRequired(property.getLowerBound() == 1);

		QName propertyType = property.getType();
		if (propertyType == null) {
			fpProperty.setPropertyType(property.getTypeDefs());

		} else {
			String propertyTypeName = propertyType.getName();

			fpProperty.setPropertyType(property);

			ObjectType propertyObject = packageObjects.get(propertyTypeName);
			if (propertyObject != null)
				fpProperty.setPropertyType(propertyObject);

			ValueType propertyValue = packageValues.get(propertyTypeName);
			if (propertyValue != null)
				fpProperty.setPropertyType(propertyValue);

		}
	}
}
