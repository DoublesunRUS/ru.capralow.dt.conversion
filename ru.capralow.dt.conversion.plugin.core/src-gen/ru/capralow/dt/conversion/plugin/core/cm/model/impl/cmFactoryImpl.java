/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.capralow.dt.conversion.plugin.core.cm.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class cmFactoryImpl extends EFactoryImpl implements cmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static cmFactory init() {
		try {
			cmFactory thecmFactory = (cmFactory)EPackage.Registry.INSTANCE.getEFactory(cmPackage.eNS_URI);
			if (thecmFactory != null) {
				return thecmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new cmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cmFactoryImpl() {
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
			case cmPackage.CONVERSION_MODULE: return createConversionModule();
			case cmPackage.CM_OBJECT: return createCmObject();
			case cmPackage.CM_DATA_RULE: return createCmDataRule();
			case cmPackage.CM_OBJECT_RULE: return createCmObjectRule();
			case cmPackage.CM_ATTRIBUTE_RULE: return createCmAttributeRule();
			case cmPackage.CM_PREDEFINED: return createCmPredefined();
			case cmPackage.CM_PREDEFINED_VALUE: return createCmPredefinedValue();
			case cmPackage.CM_PREDEFINED_CATALOG_VALUE: return createCmPredefinedCatalogValue();
			case cmPackage.CM_PREDEFINED_ENUM_VALUE: return createCmPredefinedEnumValue();
			case cmPackage.CM_ALGORITHM: return createCmAlgorithm();
			case cmPackage.CM_PARAM: return createCmParam();
			case cmPackage.CM_SUBSYSTEM: return createCmSubsystem();
			case cmPackage.CM_GROUP: return createCmGroup();
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
			case cmPackage.CM_SELECTION_VARIANT:
				return createCmSelectionVariantFromString(eDataType, initialValue);
			case cmPackage.CM_IDENTIFICATION_VARIANT:
				return createCmIdentificationVariantFromString(eDataType, initialValue);
			case cmPackage.CM_PREDEFINED_TYPE:
				return createCmPredefinedTypeFromString(eDataType, initialValue);
			case cmPackage.CM_METHOD_TYPE:
				return createCmMethodTypeFromString(eDataType, initialValue);
			case cmPackage.CM_SPECIAL_SUBSYSTEM_TYPE:
				return createCmSpecialSubsystemTypeFromString(eDataType, initialValue);
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
			case cmPackage.CM_SELECTION_VARIANT:
				return convertCmSelectionVariantToString(eDataType, instanceValue);
			case cmPackage.CM_IDENTIFICATION_VARIANT:
				return convertCmIdentificationVariantToString(eDataType, instanceValue);
			case cmPackage.CM_PREDEFINED_TYPE:
				return convertCmPredefinedTypeToString(eDataType, instanceValue);
			case cmPackage.CM_METHOD_TYPE:
				return convertCmMethodTypeToString(eDataType, instanceValue);
			case cmPackage.CM_SPECIAL_SUBSYSTEM_TYPE:
				return convertCmSpecialSubsystemTypeToString(eDataType, instanceValue);
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
	public ConversionModule createConversionModule() {
		ConversionModuleImpl conversionModule = new ConversionModuleImpl();
		return conversionModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CmObject createCmObject() {
		CmObjectImpl cmObject = new CmObjectImpl();
		return cmObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CmDataRule createCmDataRule() {
		CmDataRuleImpl cmDataRule = new CmDataRuleImpl();
		return cmDataRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CmObjectRule createCmObjectRule() {
		CmObjectRuleImpl cmObjectRule = new CmObjectRuleImpl();
		return cmObjectRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CmAttributeRule createCmAttributeRule() {
		CmAttributeRuleImpl cmAttributeRule = new CmAttributeRuleImpl();
		return cmAttributeRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CmPredefined createCmPredefined() {
		CmPredefinedImpl cmPredefined = new CmPredefinedImpl();
		return cmPredefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CmPredefinedValue createCmPredefinedValue() {
		CmPredefinedValueImpl cmPredefinedValue = new CmPredefinedValueImpl();
		return cmPredefinedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CmPredefinedCatalogValue createCmPredefinedCatalogValue() {
		CmPredefinedCatalogValueImpl cmPredefinedCatalogValue = new CmPredefinedCatalogValueImpl();
		return cmPredefinedCatalogValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CmPredefinedEnumValue createCmPredefinedEnumValue() {
		CmPredefinedEnumValueImpl cmPredefinedEnumValue = new CmPredefinedEnumValueImpl();
		return cmPredefinedEnumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CmAlgorithm createCmAlgorithm() {
		CmAlgorithmImpl cmAlgorithm = new CmAlgorithmImpl();
		return cmAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CmParam createCmParam() {
		CmParamImpl cmParam = new CmParamImpl();
		return cmParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CmSubsystem createCmSubsystem() {
		CmSubsystemImpl cmSubsystem = new CmSubsystemImpl();
		return cmSubsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CmGroup createCmGroup() {
		CmGroupImpl cmGroup = new CmGroupImpl();
		return cmGroup;
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
	public CmPredefinedType createCmPredefinedTypeFromString(EDataType eDataType, String initialValue) {
		CmPredefinedType result = CmPredefinedType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmPredefinedTypeToString(EDataType eDataType, Object instanceValue) {
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
	public CmSpecialSubsystemType createCmSpecialSubsystemTypeFromString(EDataType eDataType, String initialValue) {
		CmSpecialSubsystemType result = CmSpecialSubsystemType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCmSpecialSubsystemTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public cmPackage getcmPackage() {
		return (cmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static cmPackage getPackage() {
		return cmPackage.eINSTANCE;
	}

} //cmFactoryImpl
