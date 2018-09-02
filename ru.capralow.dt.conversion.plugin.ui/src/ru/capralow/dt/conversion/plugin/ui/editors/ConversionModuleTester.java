package ru.capralow.dt.conversion.plugin.ui.editors;

import org.eclipse.emf.common.util.EList;

import com._1c.g5.v8.dt.bsl.model.Method;
import com._1c.g5.v8.dt.bsl.model.RegionPreprocessorDeclareStatement;
import com._1c.g5.v8.dt.core.expressions.AbstractDtPropertyTester;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;

public class ConversionModuleTester extends AbstractDtPropertyTester {

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if ("isAvailable".equals(property) && receiver instanceof CommonModule) {
			CommonModule commonModule = (CommonModule) receiver;
			
			String regionName = "";
			EList<Method> methods = commonModule.getModule().allMethods();
			if (methods.size() != 0) {
				regionName = ((RegionPreprocessorDeclareStatement) methods.get(0).eContainer().eContainer()).getName();
			}
			
			return isAlive(commonModule) && (methods.size() == 0 || regionName.equals("ПроцедурыКонвертации"));
		}
		return false;
	}

}
