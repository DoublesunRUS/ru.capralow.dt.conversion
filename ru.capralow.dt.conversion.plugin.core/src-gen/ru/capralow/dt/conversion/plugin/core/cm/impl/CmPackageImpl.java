/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ru.capralow.dt.conversion.plugin.core.cm.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmFactory;
import ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmPackage;
import ru.capralow.dt.conversion.plugin.core.cm.CmSelectionVariant;
import ru.capralow.dt.conversion.plugin.core.cm.CmSendingRule;
import ru.capralow.dt.conversion.plugin.core.cm.ConversionModule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CmPackageImpl extends EPackageImpl implements CmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversionModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmSendingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmDataRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmObjectRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cmSelectionVariantEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CmPackageImpl() {
		super(eNS_URI, CmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CmPackage init() {
		if (isInited) return (CmPackage)EPackage.Registry.INSTANCE.getEPackage(CmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CmPackageImpl theCmPackage = registeredCmPackage instanceof CmPackageImpl ? (CmPackageImpl)registeredCmPackage : new CmPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCmPackage.createPackageContents();

		// Initialize created meta-data
		theCmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CmPackage.eNS_URI, theCmPackage);
		return theCmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConversionModule() {
		return conversionModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionModule_StoreVersion() {
		return (EAttribute)conversionModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionModule_DataRules() {
		return (EReference)conversionModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionModule_ObjectRules() {
		return (EReference)conversionModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionModule_Predefineds() {
		return (EAttribute)conversionModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionModule_Params() {
		return (EAttribute)conversionModuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionModule_BeforeConvertationEvent() {
		return (EAttribute)conversionModuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionModule_AfterConvertationEvent() {
		return (EAttribute)conversionModuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionModule_BeforeFillingEvent() {
		return (EAttribute)conversionModuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionModule_SendingRules() {
		return (EReference)conversionModuleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionModule_Algorithms() {
		return (EAttribute)conversionModuleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmSendingRule() {
		return cmSendingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmSendingRule_DataRule() {
		return (EReference)cmSendingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmSendingRule_ObjectRules() {
		return (EReference)cmSendingRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmDataRule() {
		return cmDataRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_Name() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_DataSelectionEvent() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_BeforeProcessingEvent() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_OnProcessingEvent() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_ForSending() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_ForReceiving() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_ConfigurationObject() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_FormatObject() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_IsDisabled() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_IsDataCleaning() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_SelectionVariant() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmDataRule_ObjectRules() {
		return (EReference)cmDataRuleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmObjectRule() {
		return cmObjectRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_Name() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCmSelectionVariant() {
		return cmSelectionVariantEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmFactory getCmFactory() {
		return (CmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		conversionModuleEClass = createEClass(CONVERSION_MODULE);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__STORE_VERSION);
		createEReference(conversionModuleEClass, CONVERSION_MODULE__DATA_RULES);
		createEReference(conversionModuleEClass, CONVERSION_MODULE__OBJECT_RULES);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__PREDEFINEDS);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__PARAMS);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__AFTER_CONVERTATION_EVENT);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__BEFORE_FILLING_EVENT);
		createEReference(conversionModuleEClass, CONVERSION_MODULE__SENDING_RULES);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__ALGORITHMS);

		cmSendingRuleEClass = createEClass(CM_SENDING_RULE);
		createEReference(cmSendingRuleEClass, CM_SENDING_RULE__DATA_RULE);
		createEReference(cmSendingRuleEClass, CM_SENDING_RULE__OBJECT_RULES);

		cmDataRuleEClass = createEClass(CM_DATA_RULE);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__NAME);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__DATA_SELECTION_EVENT);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__BEFORE_PROCESSING_EVENT);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__ON_PROCESSING_EVENT);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__FOR_SENDING);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__FOR_RECEIVING);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__CONFIGURATION_OBJECT);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__FORMAT_OBJECT);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__IS_DISABLED);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__IS_DATA_CLEANING);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__SELECTION_VARIANT);
		createEReference(cmDataRuleEClass, CM_DATA_RULE__OBJECT_RULES);

		cmObjectRuleEClass = createEClass(CM_OBJECT_RULE);
		createEAttribute(cmObjectRuleEClass, CM_OBJECT_RULE__NAME);

		// Create enums
		cmSelectionVariantEEnum = createEEnum(CM_SELECTION_VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(conversionModuleEClass, ConversionModule.class, "ConversionModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getConversionModule_StoreVersion(), theEcorePackage.getEString(), "storeVersion", null, 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConversionModule_DataRules(), this.getCmDataRule(), null, "dataRules", null, 0, -1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConversionModule_ObjectRules(), this.getCmObjectRule(), null, "objectRules", null, 0, -1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConversionModule_Predefineds(), theEcorePackage.getEString(), "predefineds", null, 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConversionModule_Params(), theEcorePackage.getEString(), "params", null, 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConversionModule_BeforeConvertationEvent(), theEcorePackage.getEString(), "beforeConvertationEvent", null, 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConversionModule_AfterConvertationEvent(), theEcorePackage.getEString(), "afterConvertationEvent", null, 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConversionModule_BeforeFillingEvent(), theEcorePackage.getEString(), "beforeFillingEvent", null, 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConversionModule_SendingRules(), this.getCmSendingRule(), null, "sendingRules", null, 0, -1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConversionModule_Algorithms(), theEcorePackage.getEString(), "algorithms", null, 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(cmSendingRuleEClass, CmSendingRule.class, "CmSendingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCmSendingRule_DataRule(), this.getCmDataRule(), null, "dataRule", null, 0, 1, CmSendingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCmSendingRule_ObjectRules(), this.getCmObjectRule(), null, "objectRules", null, 0, -1, CmSendingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(cmDataRuleEClass, CmDataRule.class, "CmDataRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCmDataRule_Name(), theEcorePackage.getEString(), "name", null, 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmDataRule_DataSelectionEvent(), theEcorePackage.getEString(), "dataSelectionEvent", null, 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmDataRule_BeforeProcessingEvent(), theEcorePackage.getEString(), "beforeProcessingEvent", null, 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmDataRule_OnProcessingEvent(), theEcorePackage.getEString(), "onProcessingEvent", null, 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmDataRule_ForSending(), theEcorePackage.getEBooleanObject(), "forSending", null, 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmDataRule_ForReceiving(), theEcorePackage.getEBooleanObject(), "forReceiving", null, 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmDataRule_ConfigurationObject(), theEcorePackage.getEJavaObject(), "configurationObject", null, 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmDataRule_FormatObject(), theEcorePackage.getEString(), "formatObject", null, 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmDataRule_IsDisabled(), theEcorePackage.getEBooleanObject(), "isDisabled", null, 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmDataRule_IsDataCleaning(), theEcorePackage.getEBooleanObject(), "isDataCleaning", null, 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmDataRule_SelectionVariant(), this.getCmSelectionVariant(), "selectionVariant", null, 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCmDataRule_ObjectRules(), this.getCmObjectRule(), null, "objectRules", null, 0, -1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(cmObjectRuleEClass, CmObjectRule.class, "CmObjectRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCmObjectRule_Name(), theEcorePackage.getEString(), "name", null, 0, 1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(cmSelectionVariantEEnum, CmSelectionVariant.class, "CmSelectionVariant"); //$NON-NLS-1$
		addEEnumLiteral(cmSelectionVariantEEnum, CmSelectionVariant.STANDART);
		addEEnumLiteral(cmSelectionVariantEEnum, CmSelectionVariant.CUSTOM);

		// Create resource
		createResource(eNS_URI);
	}

} //CmPackageImpl
