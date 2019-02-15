package ru.capralow.dt.conversion.plugin.core;

import com._1c.g5.v8.dt.mcore.QName;
import com._1c.g5.v8.dt.metadata.mdclass.XDTOPackage;
import com._1c.g5.v8.dt.xdto.model.ObjectType;
import com._1c.g5.v8.dt.xdto.model.Package;
import com._1c.g5.v8.dt.xdto.model.Property;

import ru.capralow.dt.conversion.plugin.core.fp.FormatPackage;
import ru.capralow.dt.conversion.plugin.core.fp.impl.FormatPackageImpl;

public class FormatPackageAnalyzer {

	private FormatPackage formatPackage;

	public FormatPackage getFormatPackage() {
		return formatPackage;
	}

	public FormatPackageAnalyzer() {
		this.formatPackage = new FormatPackageImpl();
	}

	public void analyze(XDTOPackage xdtoPackage) {
		Package dataPackage = xdtoPackage.getPackage();

		for (ObjectType object : dataPackage.getObjects()) {
			String objectName = object.getName();
			if (!objectName.startsWith("Справочник."))
				continue;

			for (Property property : object.getProperties()) {
				String propertyName = property.getName();
				QName propertyType = property.getType();

				boolean isID = propertyName.equals("КлючевыеСвойства");

				if (propertyType == null) {

				} else {
					String propertyTypeName = propertyType.getName();

				}

			}
		}

	}
}
