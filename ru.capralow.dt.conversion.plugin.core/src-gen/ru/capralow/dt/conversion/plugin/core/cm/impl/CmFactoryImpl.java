/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.capralow.dt.conversion.plugin.core.cm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CmFactoryImpl extends EFactoryImpl implements CmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CmFactory init() {
		try {
			CmFactory theCmFactory = (CmFactory)EPackage.Registry.INSTANCE.getEFactory(CmPackage.eNS_URI);
			if (theCmFactory != null) {
				return theCmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmFactoryImpl() {
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
			case CmPackage.CONVERSION_MODULE: return createConversionModule();
			case CmPackage.CM_DATA_RULE: return createCmDataRule();
			case CmPackage.CM_OBJECT_RULE: return createCmObjectRule();
			case CmPackage.CM_ATTRIBUTE_RULE: return createCmAttributeRule();
			case CmPackage.CM_PREDEFINED: return createCmPredefined();
			case CmPackage.CM_ALGORITHM: return createCmAlgorithm();
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
			case CmPackage.CM_SELECTION_VARIANT:
				return createCmSelectionVariantFromString(eDataType, initialValue);
			case CmPackage.CM_IDENTIFICATION_VARIANT:
				return createCmIdentificationVariantFromString(eDataType, initialValue);
			case CmPackage.CM_METHOD_TYPE:
				return createCmMethodTypeFromString(eDataType, initialValue);
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
			case CmPackage.CM_SELECTION_VARIANT:
				return convertCmSelectionVariantToString(eDataType, instanceValue);
			case CmPackage.CM_IDENTIFICATION_VARIANT:
				return convertCmIdentificationVariantToString(eDataType, instanceValue);
			case CmPackage.CM_METHOD_TYPE:
				return convertCmMethodTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionModule createConversionModule() {
		ConversionModuleImpl conversionModule = new ConversionModuleImpl();
		return conversionModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmDataRule createCmDataRule() {
		CmDataRuleImpl cmDataRule = new CmDataRuleImpl();
		return cmDataRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmObjectRule createCmObjectRule() {
		CmObjectRuleImpl cmObjectRule = new CmObjectRuleImpl();
		return cmObjectRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmAttributeRule createCmAttributeRule() {
		CmAttributeRuleImpl cmAttributeRule = new CmAttributeRuleImpl();
		return cmAttributeRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmPredefined createCmPredefined() {
		CmPredefinedImpl cmPredefined = new CmPredefinedImpl();
		return cmPredefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmAlgorithm createCmAlgorithm() {
		CmAlgorithmImpl cmAlgorithm = new CmAlgorithmImpl();
		return cmAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmSelectionVariant createCmSelectionVariantFromString(EDataType eDataType, String initialValue) {
		CmSelectionVariant result = CmSelectionVariant.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmSelectionVariantToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmIdentificationVariant createCmIdentificationVariantFromString(EDataType eDataType, String initialValue) {
		CmIdentificationVariant result = CmIdentificationVariant.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmIdentificationVariantToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmMethodType createCmMethodTypeFromString(EDataType eDataType, String initialValue) {
		CmMethodType result = CmMethodType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmMethodTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmPackage getCmPackage() {
		return (CmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CmPackage getPackage() {
		return CmPackage.eINSTANCE;
	}

} //CmFactoryImpl
