package ru.capralow.dt.conversion.plugin.ui.editors;

import com._1c.g5.v8.dt.bsl.model.DeclareStatement;
import com._1c.g5.v8.dt.bsl.model.Module;
import com._1c.g5.v8.dt.bsl.model.RegionPreprocessorDeclareStatement;
import com._1c.g5.v8.dt.core.expressions.AbstractDtPropertyTester;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;

public class ConversionModuleTester extends AbstractDtPropertyTester {

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (!"isAvailable".equals(property) || !(receiver instanceof CommonModule))
			return false;

		CommonModule commonModule = (CommonModule) receiver;
		if (!isAlive(commonModule))
			return false;

		Module module = commonModule.getModule();
		if (module == null)
			return false;

		if (module.allMethods().isEmpty())
			return true;

		for (DeclareStatement statement : module.getDeclareStatements()) {
			if (!(statement instanceof RegionPreprocessorDeclareStatement))
				continue;

			if (((RegionPreprocessorDeclareStatement) statement).getName().equals("ПроцедурыКонвертации"))
				return true;
		}

		return false;
	}

}
