/**
 */
package ru.capralow.dt.conversion.plugin.core.rm.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ru.capralow.dt.conversion.plugin.core.rm.AutoRegistration;
import ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanContent;
import ru.capralow.dt.conversion.plugin.core.rm.ExchangePlanSelectionRule;
import ru.capralow.dt.conversion.plugin.core.rm.ObjectSelectionRule;
import ru.capralow.dt.conversion.plugin.core.rm.RegistrationModule;
import ru.capralow.dt.conversion.plugin.core.rm.RegistrationRule;
import ru.capralow.dt.conversion.plugin.core.rm.RmFactory;
import ru.capralow.dt.conversion.plugin.core.rm.RmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RmPackageImpl extends EPackageImpl implements RmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registrationModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangePlanContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registrationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectSelectionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangePlanSelectionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum autoRegistrationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

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
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RmPackageImpl() {
		super(eNS_URI, RmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RmPackage init() {
		if (isInited) return (RmPackage)EPackage.Registry.INSTANCE.getEPackage(RmPackage.eNS_URI);

		// Obtain or create and register package
		RmPackageImpl theRmPackage = (RmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRmPackage.createPackageContents();

		// Initialize created meta-data
		theRmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RmPackage.eNS_URI, theRmPackage);
		return theRmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistrationModule() {
		return registrationModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationModule_ModuleRef() {
		return (EAttribute)registrationModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationModule_ModuleName() {
		return (EAttribute)registrationModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationModule_ModuleVersion() {
		return (EAttribute)registrationModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationModule_ModuleCreationDate() {
		return (EAttribute)registrationModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationModule_ExchangePlanName() {
		return (EAttribute)registrationModuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationModule_ExchangePlanMdObject() {
		return (EAttribute)registrationModuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationModule_RuntimeVersion() {
		return (EAttribute)registrationModuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationModule_ConfigurationName() {
		return (EAttribute)registrationModuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationModule_ConfigurationSynonym() {
		return (EAttribute)registrationModuleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationModule_ConfigurationVersion() {
		return (EAttribute)registrationModuleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistrationModule_ExchangePlanContent() {
		return (EReference)registrationModuleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistrationModule_RegistrationRules() {
		return (EReference)registrationModuleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchangePlanContent() {
		return exchangePlanContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangePlanContent_MdObject() {
		return (EAttribute)exchangePlanContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangePlanContent_AutoRecord() {
		return (EAttribute)exchangePlanContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistrationRule() {
		return registrationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationRule_IsFolder() {
		return (EAttribute)registrationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationRule_Disabled() {
		return (EAttribute)registrationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationRule_Valid() {
		return (EAttribute)registrationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationRule_Code() {
		return (EAttribute)registrationRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationRule_Name() {
		return (EAttribute)registrationRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationRule_MdObject() {
		return (EAttribute)registrationRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationRule_ObjectName() {
		return (EAttribute)registrationRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationRule_MdClass() {
		return (EAttribute)registrationRuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationRule_AttributeSendMode() {
		return (EAttribute)registrationRuleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistrationRule_ObjectSelectionRules() {
		return (EReference)registrationRuleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistrationRule_ExchangePlanSelectionRules() {
		return (EReference)registrationRuleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectSelectionRule() {
		return objectSelectionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectSelectionRule_IsFolder() {
		return (EAttribute)objectSelectionRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchangePlanSelectionRule() {
		return exchangePlanSelectionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangePlanSelectionRule_IsFolder() {
		return (EAttribute)exchangePlanSelectionRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAutoRegistration() {
		return autoRegistrationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RmFactory getRmFactory() {
		return (RmFactory)getEFactoryInstance();
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
		registrationModuleEClass = createEClass(REGISTRATION_MODULE);
		createEAttribute(registrationModuleEClass, REGISTRATION_MODULE__MODULE_REF);
		createEAttribute(registrationModuleEClass, REGISTRATION_MODULE__MODULE_NAME);
		createEAttribute(registrationModuleEClass, REGISTRATION_MODULE__MODULE_VERSION);
		createEAttribute(registrationModuleEClass, REGISTRATION_MODULE__MODULE_CREATION_DATE);
		createEAttribute(registrationModuleEClass, REGISTRATION_MODULE__EXCHANGE_PLAN_NAME);
		createEAttribute(registrationModuleEClass, REGISTRATION_MODULE__EXCHANGE_PLAN_MD_OBJECT);
		createEAttribute(registrationModuleEClass, REGISTRATION_MODULE__RUNTIME_VERSION);
		createEAttribute(registrationModuleEClass, REGISTRATION_MODULE__CONFIGURATION_NAME);
		createEAttribute(registrationModuleEClass, REGISTRATION_MODULE__CONFIGURATION_SYNONYM);
		createEAttribute(registrationModuleEClass, REGISTRATION_MODULE__CONFIGURATION_VERSION);
		createEReference(registrationModuleEClass, REGISTRATION_MODULE__EXCHANGE_PLAN_CONTENT);
		createEReference(registrationModuleEClass, REGISTRATION_MODULE__REGISTRATION_RULES);

		exchangePlanContentEClass = createEClass(EXCHANGE_PLAN_CONTENT);
		createEAttribute(exchangePlanContentEClass, EXCHANGE_PLAN_CONTENT__MD_OBJECT);
		createEAttribute(exchangePlanContentEClass, EXCHANGE_PLAN_CONTENT__AUTO_RECORD);

		registrationRuleEClass = createEClass(REGISTRATION_RULE);
		createEAttribute(registrationRuleEClass, REGISTRATION_RULE__IS_FOLDER);
		createEAttribute(registrationRuleEClass, REGISTRATION_RULE__DISABLED);
		createEAttribute(registrationRuleEClass, REGISTRATION_RULE__VALID);
		createEAttribute(registrationRuleEClass, REGISTRATION_RULE__CODE);
		createEAttribute(registrationRuleEClass, REGISTRATION_RULE__NAME);
		createEAttribute(registrationRuleEClass, REGISTRATION_RULE__MD_OBJECT);
		createEAttribute(registrationRuleEClass, REGISTRATION_RULE__OBJECT_NAME);
		createEAttribute(registrationRuleEClass, REGISTRATION_RULE__MD_CLASS);
		createEAttribute(registrationRuleEClass, REGISTRATION_RULE__ATTRIBUTE_SEND_MODE);
		createEReference(registrationRuleEClass, REGISTRATION_RULE__OBJECT_SELECTION_RULES);
		createEReference(registrationRuleEClass, REGISTRATION_RULE__EXCHANGE_PLAN_SELECTION_RULES);

		objectSelectionRuleEClass = createEClass(OBJECT_SELECTION_RULE);
		createEAttribute(objectSelectionRuleEClass, OBJECT_SELECTION_RULE__IS_FOLDER);

		exchangePlanSelectionRuleEClass = createEClass(EXCHANGE_PLAN_SELECTION_RULE);
		createEAttribute(exchangePlanSelectionRuleEClass, EXCHANGE_PLAN_SELECTION_RULE__IS_FOLDER);

		// Create enums
		autoRegistrationEEnum = createEEnum(AUTO_REGISTRATION);

		// Create data types
		dateEDataType = createEDataType(DATE);
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
		initEClass(registrationModuleEClass, RegistrationModule.class, "RegistrationModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRegistrationModule_ModuleRef(), theEcorePackage.getEString(), "moduleRef", null, 0, 1, RegistrationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRegistrationModule_ModuleName(), theEcorePackage.getEString(), "moduleName", null, 0, 1, RegistrationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRegistrationModule_ModuleVersion(), theEcorePackage.getEString(), "moduleVersion", null, 0, 1, RegistrationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRegistrationModule_ModuleCreationDate(), this.getDate(), "moduleCreationDate", null, 0, 1, RegistrationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRegistrationModule_ExchangePlanName(), theEcorePackage.getEString(), "exchangePlanName", null, 0, 1, RegistrationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRegistrationModule_ExchangePlanMdObject(), theEcorePackage.getEString(), "exchangePlanMdObject", null, 0, 1, RegistrationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRegistrationModule_RuntimeVersion(), theEcorePackage.getEString(), "runtimeVersion", null, 0, 1, RegistrationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRegistrationModule_ConfigurationName(), theEcorePackage.getEString(), "configurationName", null, 0, 1, RegistrationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRegistrationModule_ConfigurationSynonym(), theEcorePackage.getEString(), "configurationSynonym", null, 0, 1, RegistrationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRegistrationModule_ConfigurationVersion(), theEcorePackage.getEString(), "configurationVersion", null, 0, 1, RegistrationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRegistrationModule_ExchangePlanContent(), this.getExchangePlanContent(), null, "exchangePlanContent", null, 0, -1, RegistrationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRegistrationModule_RegistrationRules(), this.getRegistrationRule(), null, "registrationRules", null, 0, -1, RegistrationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(exchangePlanContentEClass, ExchangePlanContent.class, "ExchangePlanContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getExchangePlanContent_MdObject(), theEcorePackage.getEString(), "mdObject", null, 0, 1, ExchangePlanContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getExchangePlanContent_AutoRecord(), this.getAutoRegistration(), "AutoRecord", null, 0, 1, ExchangePlanContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(registrationRuleEClass, RegistrationRule.class, "RegistrationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRegistrationRule_IsFolder(), theEcorePackage.getEBooleanObject(), "isFolder", null, 0, 1, RegistrationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRegistrationRule_Disabled(), theEcorePackage.getEBooleanObject(), "disabled", null, 0, 1, RegistrationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRegistrationRule_Valid(), theEcorePackage.getEBooleanObject(), "valid", null, 0, 1, RegistrationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRegistrationRule_Code(), theEcorePackage.getEString(), "code", null, 0, 1, RegistrationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRegistrationRule_Name(), theEcorePackage.getEString(), "name", null, 0, 1, RegistrationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRegistrationRule_MdObject(), theEcorePackage.getEString(), "mdObject", null, 0, 1, RegistrationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRegistrationRule_ObjectName(), theEcorePackage.getEString(), "objectName", null, 0, 1, RegistrationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRegistrationRule_MdClass(), theEcorePackage.getEString(), "mdClass", null, 0, 1, RegistrationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRegistrationRule_AttributeSendMode(), theEcorePackage.getEString(), "attributeSendMode", null, 0, 1, RegistrationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRegistrationRule_ObjectSelectionRules(), this.getObjectSelectionRule(), null, "objectSelectionRules", null, 0, -1, RegistrationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRegistrationRule_ExchangePlanSelectionRules(), this.getExchangePlanSelectionRule(), null, "exchangePlanSelectionRules", null, 0, -1, RegistrationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(objectSelectionRuleEClass, ObjectSelectionRule.class, "ObjectSelectionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getObjectSelectionRule_IsFolder(), theEcorePackage.getEBooleanObject(), "isFolder", null, 0, 1, ObjectSelectionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(exchangePlanSelectionRuleEClass, ExchangePlanSelectionRule.class, "ExchangePlanSelectionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getExchangePlanSelectionRule_IsFolder(), theEcorePackage.getEBooleanObject(), "isFolder", null, 0, 1, ExchangePlanSelectionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(autoRegistrationEEnum, AutoRegistration.class, "AutoRegistration"); //$NON-NLS-1$
		addEEnumLiteral(autoRegistrationEEnum, AutoRegistration.ALLOW);
		addEEnumLiteral(autoRegistrationEEnum, AutoRegistration.DENY);

		// Initialize data types
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //RmPackageImpl
