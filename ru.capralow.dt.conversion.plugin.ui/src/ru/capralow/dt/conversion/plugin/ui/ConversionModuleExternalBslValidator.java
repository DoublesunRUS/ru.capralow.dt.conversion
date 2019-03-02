package ru.capralow.dt.conversion.plugin.ui;

import org.eclipse.emf.ecore.EObject;

import com._1c.g5.v8.dt.bsl.validation.CustomValidationMessageAcceptor;
import com._1c.g5.v8.dt.bsl.validation.IExternalBslValidator;
import com._1c.g5.v8.dt.bsl.validation.IMessages;
import com._1c.g5.v8.dt.mcore.McorePackage;

public class ConversionModuleExternalBslValidator implements IExternalBslValidator {

	public static final String ERROR_CODE = "Export method in form or command module";

	@Override
	public boolean needValidation(EObject object) {
		return false;
	}

	@Override
	public void validate(EObject object, CustomValidationMessageAcceptor messageAcceptor) {
		messageAcceptor.error(IMessages.INSTANCE.not_allowed_export_method_in_form_and_command_module(), object,
				McorePackage.Literals.NAMED_ELEMENT__NAME, ERROR_CODE);
	}

}
