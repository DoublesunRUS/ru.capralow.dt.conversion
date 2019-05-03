/**
 */
package ru.capralow.dt.conversion.plugin.core.rm.model.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.xbase.lib.Exceptions;

import ru.capralow.dt.conversion.plugin.core.rm.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class rmFactoryImpl extends EFactoryImpl implements rmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static rmFactory init() {
		try {
			rmFactory thermFactory = (rmFactory)EPackage.Registry.INSTANCE.getEFactory(rmPackage.eNS_URI);
			if (thermFactory != null) {
				return thermFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new rmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case rmPackage.REGISTRATION_MODULE: return createRegistrationModule();
			case rmPackage.EXCHANGE_PLAN_CONTENT: return createExchangePlanContent();
			case rmPackage.REGISTRATION_RULE: return createRegistrationRule();
			case rmPackage.OBJECT_SELECTION_RULE: return createObjectSelectionRule();
			case rmPackage.EXCHANGE_PLAN_SELECTION_RULE: return createExchangePlanSelectionRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case rmPackage.AUTO_REGISTRATION:
				return createAutoRegistrationFromString(eDataType, initialValue);
			case rmPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case rmPackage.AUTO_REGISTRATION:
				return convertAutoRegistrationToString(eDataType, instanceValue);
			case rmPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationModule createRegistrationModule() {
		RegistrationModuleImpl registrationModule = new RegistrationModuleImpl();
		return registrationModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangePlanContent createExchangePlanContent() {
		ExchangePlanContentImpl exchangePlanContent = new ExchangePlanContentImpl();
		return exchangePlanContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationRule createRegistrationRule() {
		RegistrationRuleImpl registrationRule = new RegistrationRuleImpl();
		return registrationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectSelectionRule createObjectSelectionRule() {
		ObjectSelectionRuleImpl objectSelectionRule = new ObjectSelectionRuleImpl();
		return objectSelectionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangePlanSelectionRule createExchangePlanSelectionRule() {
		ExchangePlanSelectionRuleImpl exchangePlanSelectionRule = new ExchangePlanSelectionRuleImpl();
		return exchangePlanSelectionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoRegistration createAutoRegistrationFromString(EDataType eDataType, String initialValue) {
		AutoRegistration result = AutoRegistration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAutoRegistrationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate(final String it) {
		Date _xtrycatchfinallyexpression = null;
		try {
			Date _xifexpression = null;
			if ((it != null)) {
				_xifexpression = new SimpleDateFormat("yyyy-MM-ddTHH:mm:ss").parse(it);
			}
			_xtrycatchfinallyexpression = _xifexpression;
		}
		catch (final Throwable _t) {
			if (_t instanceof ParseException) {
				final ParseException exception = (ParseException)_t;
				throw new RuntimeException(exception);
			}
			else {
				throw Exceptions.sneakyThrow(_t);
			}
		}
		return _xtrycatchfinallyexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateFromString(EDataType eDataType, String initialValue) {
		return createDate(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDate(final Date it) {
		String _xifexpression = null;
		if ((it != null)) {
			_xifexpression = new SimpleDateFormat("yyyy-MM-ddTHH:mm:ss").format(it);
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return convertDate((Date)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rmPackage getrmPackage() {
		return (rmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static rmPackage getPackage() {
		return rmPackage.eINSTANCE;
	}

} //rmFactoryImpl
