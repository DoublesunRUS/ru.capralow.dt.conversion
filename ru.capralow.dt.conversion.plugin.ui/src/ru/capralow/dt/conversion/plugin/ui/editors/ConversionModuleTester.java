package ru.capralow.dt.conversion.plugin.ui.editors;

import com._1c.g5.v8.dt.core.expressions.AbstractDtPropertyTester;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;

public class ConversionModuleTester extends AbstractDtPropertyTester {

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if ("isAvailable".equals(property) && receiver instanceof CommonModule) {
			CommonModule commonModule = (CommonModule) receiver;
			return isAlive(commonModule) && "МенеджерОбменаЧерезУниверсальныйФормат".equals(commonModule.getName());
		}
		return false;
	}

}
