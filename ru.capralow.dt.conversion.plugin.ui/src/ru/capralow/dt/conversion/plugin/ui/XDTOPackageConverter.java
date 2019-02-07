package ru.capralow.dt.conversion.plugin.ui;

import java.util.ArrayList;
import java.util.Collection;

import com._1c.g5.v8.dt.diagram.framework.model.Data;
import com._1c.g5.v8.dt.erd.model.ErdData;
import com._1c.g5.v8.dt.erd.model.ErdDataPart;
import com._1c.g5.v8.dt.metadata.mdclass.MdObject;

public class XDTOPackageConverter
		implements com._1c.g5.v8.dt.diagram.framework.core.IConverter<com._1c.g5.v8.dt.metadata.mdclass.MdObject>

{

	@Override
	public Collection<Data> getData(MdObject arg0) {
		Collection<Data> entities = new ArrayList<Data>();

		ErdData edAttributes = new ErdData("Реквизиты");
		entities.add(edAttributes);

		Collection<String> attributeTypes = new ArrayList<String>();
		attributeTypes.add("Тип1Реквизита");
		attributeTypes.add("Тип2Реквизита");
		ErdDataPart attribute1 = new ErdDataPart("ИмяРеквизита1", attributeTypes);
		edAttributes.addDataPart(attribute1);

		ErdData edTabularSections = new ErdData("Табличные части");
		entities.add(edTabularSections);

		ErdData edTabularSection1 = new ErdData("Табличная часть 1");
		edTabularSections.addInnerData(edTabularSection1);

		Collection<String> attributeTypesTS1 = new ArrayList<String>();
		attributeTypesTS1.add("ТЧ1ТипРеквизита");
		ErdDataPart ts1Attribute1 = new ErdDataPart("ТЧ1ИмяРеквизита1", attributeTypesTS1);
		edTabularSection1.addDataPart(ts1Attribute1);

		ErdData edTabularSection2 = new ErdData("Табличная часть 2");
		edTabularSections.addInnerData(edTabularSection2);

		Collection<String> attributeTypesTS2 = new ArrayList<String>();
		attributeTypesTS2.add("ТЧ2ТипРеквизита");
		ErdDataPart ts2Attribute1 = new ErdDataPart("ТЧ2ИмяРеквизита1", attributeTypesTS2);
		edTabularSection2.addDataPart(ts2Attribute1);

		return entities;
	}

	@Override
	public int getDefaultPriority() {
		return 0;
	}

	@Override
	public int getType() {
		return 0;
	}

}
