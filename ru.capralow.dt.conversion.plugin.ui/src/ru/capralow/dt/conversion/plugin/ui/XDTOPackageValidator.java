package ru.capralow.dt.conversion.plugin.ui;

import org.eclipse.emf.ecore.EObject;

import com._1c.g5.v8.dt.bsl.validation.CustomValidationMessageAcceptor;
import com._1c.g5.v8.dt.bsl.validation.IExternalBslValidator;

public class XDTOPackageValidator implements IExternalBslValidator {
	// @Inject
	// private IV8ProjectManager projectManager;
	//
	// @Inject
	// private IBmEmfIndexManager bmEmfIndexManager;

	@Override
	public boolean needValidation(EObject object) {
		// if (!(object instanceof CommonModule))
		// return false;
		//
		// ConversionModuleAnalyzer conversionModuleAnalyzer = new
		// ConversionModuleAnalyzer(projectManager,
		// bmEmfIndexManager);
		// conversionModuleAnalyzer.analyze((CommonModule) object);
		// ConversionModule conversionModule =
		// conversionModuleAnalyzer.getConversionModule();

		return false;
	}

	@Override
	public void validate(EObject object, CustomValidationMessageAcceptor messageAcceptor) {
	}

}
