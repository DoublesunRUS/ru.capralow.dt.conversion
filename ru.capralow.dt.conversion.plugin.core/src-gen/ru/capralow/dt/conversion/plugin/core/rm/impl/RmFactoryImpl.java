/**
 */
package ru.capralow.dt.conversion.plugin.core.rm.impl;

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

import ru.capralow.dt.conversion.plugin.core.rm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RmFactoryImpl extends EFactoryImpl implements RmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RmFactory init() {
		try {
			RmFactory theRmFactory = (RmFactory)EPackage.Registry.INSTANCE.getEFactory(RmPackage.eNS_URI);
			if (theRmFactory != null) {
				return theRmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RmFactoryImpl() {
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
			case RmPackage.REGISTRATION_MODULE: return (EObject)createRegistrationModule();
			case RmPackage.EXCHANGE_PLAN_CONTENT: return (EObject)createExchangePlanContent();
			case RmPackage.REGISTRATION_RULE: return (EObject)createRegistrationRule();
			case RmPackage.OBJECT_SELECTION_RULE: return (EObject)createObjectSelectionRule();
			case RmPackage.EXCHANGE_PLAN_SELECTION_RULE: return (EObject)createExchangePlanSelectionRule();
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
			case RmPackage.AUTO_REGISTRATION:
				return createAutoRegistrationFromString(eDataType, initialValue);
			case RmPackage.DATE:
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
			case RmPackage.AUTO_REGISTRATION:
				return convertAutoRegistrationToString(eDataType, instanceValue);
			case RmPackage.DATE:
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
	public RmPackage getRmPackage() {
		return (RmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RmPackage getPackage() {
		return RmPackage.eINSTANCE;
	}

} //RmFactoryImpl
