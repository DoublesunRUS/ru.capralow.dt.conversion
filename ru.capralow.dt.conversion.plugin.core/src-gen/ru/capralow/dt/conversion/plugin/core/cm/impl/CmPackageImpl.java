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

import ru.capralow.dt.conversion.plugin.core.cm.CmFactory;
import ru.capralow.dt.conversion.plugin.core.cm.CmPackage;
import ru.capralow.dt.conversion.plugin.core.cm.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.cm.SelectionVariant;
import ru.capralow.dt.conversion.plugin.core.cm.cpPKO;
import ru.capralow.dt.conversion.plugin.core.cm.cpPOD;

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
	private EClass cpPODEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpPKOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum selectionVariantEEnum = null;

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
	public EReference getConversionModule_PODs() {
		return (EReference)conversionModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionModule_PKOs() {
		return (EReference)conversionModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionModule_PKPDs() {
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
	public EAttribute getConversionModule_Algorithms() {
		return (EAttribute)conversionModuleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcpPOD() {
		return cpPODEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpPOD_Name() {
		return (EAttribute)cpPODEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpPOD_DataSelectionEvent() {
		return (EAttribute)cpPODEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpPOD_BeforeProcessingEvent() {
		return (EAttribute)cpPODEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpPOD_OnProcessingEvent() {
		return (EAttribute)cpPODEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpPOD_ForSending() {
		return (EAttribute)cpPODEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpPOD_ForReceiving() {
		return (EAttribute)cpPODEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpPOD_ConfigurationObject() {
		return (EAttribute)cpPODEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpPOD_FormatObject() {
		return (EAttribute)cpPODEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpPOD_IsDisabled() {
		return (EAttribute)cpPODEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpPOD_IsDataCleaning() {
		return (EAttribute)cpPODEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpPOD_SelectionVariant() {
		return (EAttribute)cpPODEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcpPOD_PKOs() {
		return (EReference)cpPODEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcpPKO() {
		return cpPKOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpPKO_Name() {
		return (EAttribute)cpPKOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSelectionVariant() {
		return selectionVariantEEnum;
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
		createEReference(conversionModuleEClass, CONVERSION_MODULE__PO_DS);
		createEReference(conversionModuleEClass, CONVERSION_MODULE__PK_OS);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__PKP_DS);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__PARAMS);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__AFTER_CONVERTATION_EVENT);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__BEFORE_FILLING_EVENT);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__ALGORITHMS);

		cpPODEClass = createEClass(CP_POD);
		createEAttribute(cpPODEClass, CP_POD__NAME);
		createEAttribute(cpPODEClass, CP_POD__DATA_SELECTION_EVENT);
		createEAttribute(cpPODEClass, CP_POD__BEFORE_PROCESSING_EVENT);
		createEAttribute(cpPODEClass, CP_POD__ON_PROCESSING_EVENT);
		createEAttribute(cpPODEClass, CP_POD__FOR_SENDING);
		createEAttribute(cpPODEClass, CP_POD__FOR_RECEIVING);
		createEAttribute(cpPODEClass, CP_POD__CONFIGURATION_OBJECT);
		createEAttribute(cpPODEClass, CP_POD__FORMAT_OBJECT);
		createEAttribute(cpPODEClass, CP_POD__IS_DISABLED);
		createEAttribute(cpPODEClass, CP_POD__IS_DATA_CLEANING);
		createEAttribute(cpPODEClass, CP_POD__SELECTION_VARIANT);
		createEReference(cpPODEClass, CP_POD__PK_OS);

		cpPKOEClass = createEClass(CP_PKO);
		createEAttribute(cpPKOEClass, CP_PKO__NAME);

		// Create enums
		selectionVariantEEnum = createEEnum(SELECTION_VARIANT);
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
		initEReference(getConversionModule_PODs(), this.getcpPOD(), null, "PODs", null, 0, -1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConversionModule_PKOs(), this.getcpPKO(), null, "PKOs", null, 0, -1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConversionModule_PKPDs(), theEcorePackage.getEString(), "PKPDs", null, 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConversionModule_Params(), theEcorePackage.getEString(), "params", null, 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConversionModule_BeforeConvertationEvent(), theEcorePackage.getEString(), "beforeConvertationEvent", null, 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConversionModule_AfterConvertationEvent(), theEcorePackage.getEString(), "afterConvertationEvent", null, 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConversionModule_BeforeFillingEvent(), theEcorePackage.getEString(), "beforeFillingEvent", null, 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConversionModule_Algorithms(), theEcorePackage.getEString(), "algorithms", null, 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(cpPODEClass, cpPOD.class, "cpPOD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getcpPOD_Name(), theEcorePackage.getEString(), "name", null, 0, 1, cpPOD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getcpPOD_DataSelectionEvent(), theEcorePackage.getEString(), "dataSelectionEvent", null, 0, 1, cpPOD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getcpPOD_BeforeProcessingEvent(), theEcorePackage.getEString(), "beforeProcessingEvent", null, 0, 1, cpPOD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getcpPOD_OnProcessingEvent(), theEcorePackage.getEString(), "onProcessingEvent", null, 0, 1, cpPOD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getcpPOD_ForSending(), theEcorePackage.getEBooleanObject(), "forSending", null, 0, 1, cpPOD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getcpPOD_ForReceiving(), theEcorePackage.getEBooleanObject(), "forReceiving", null, 0, 1, cpPOD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getcpPOD_ConfigurationObject(), theEcorePackage.getEJavaObject(), "configurationObject", null, 0, 1, cpPOD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getcpPOD_FormatObject(), theEcorePackage.getEString(), "formatObject", null, 0, 1, cpPOD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getcpPOD_IsDisabled(), theEcorePackage.getEBooleanObject(), "isDisabled", null, 0, 1, cpPOD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getcpPOD_IsDataCleaning(), theEcorePackage.getEBooleanObject(), "isDataCleaning", null, 0, 1, cpPOD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getcpPOD_SelectionVariant(), this.getSelectionVariant(), "selectionVariant", null, 0, 1, cpPOD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getcpPOD_PKOs(), this.getcpPKO(), null, "PKOs", null, 0, -1, cpPOD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(cpPKOEClass, cpPKO.class, "cpPKO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getcpPKO_Name(), theEcorePackage.getEString(), "name", null, 0, 1, cpPKO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(selectionVariantEEnum, SelectionVariant.class, "SelectionVariant"); //$NON-NLS-1$
		addEEnumLiteral(selectionVariantEEnum, SelectionVariant.STANDART);
		addEEnumLiteral(selectionVariantEEnum, SelectionVariant.CUSTOM);

		// Create resource
		createResource(eNS_URI);
	}

} //CmPackageImpl
