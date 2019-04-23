/**
 */
package ru.capralow.dt.conversion.plugin.core.ep.model.impl;

import com._1c.g5.v8.dt.bsl.model.BslPackage;

import com._1c.g5.v8.dt.mcore.McorePackage;

import com._1c.g5.v8.dt.metadata.common.CommonPackage;

import com._1c.g5.v8.dt.metadata.dbview.DbViewPackage;

import com._1c.g5.v8.dt.metadata.mdclass.MdClassPackage;

import com._1c.g5.v8.dt.metadata.mdtype.MdTypePackage;

import com._1c.g5.v8.dt.xdto.model.XdtoPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePair;
import ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePairStatus;
import ru.capralow.dt.conversion.plugin.core.ep.model.EpExtension;
import ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion;
import ru.capralow.dt.conversion.plugin.core.ep.model.EpProjectStatus;
import ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeData;
import ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject;
import ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProjects;
import ru.capralow.dt.conversion.plugin.core.ep.model.epFactory;
import ru.capralow.dt.conversion.plugin.core.ep.model.epPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class epPackageImpl extends EPackageImpl implements epPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeProjectsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass epExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass epFormatVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass epExchangePairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum epProjectStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum epExchangePairStatusEEnum = null;

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
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private epPackageImpl() {
		super(eNS_URI, epFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link epPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static epPackage init() {
		if (isInited) return (epPackage)EPackage.Registry.INSTANCE.getEPackage(epPackage.eNS_URI);

		// Obtain or create and register package
		epPackageImpl theepPackage = (epPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof epPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new epPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		MdClassPackage.eINSTANCE.eClass();
		McorePackage.eINSTANCE.eClass();
		CommonPackage.eINSTANCE.eClass();
		BslPackage.eINSTANCE.eClass();
		MdTypePackage.eINSTANCE.eClass();
		DbViewPackage.eINSTANCE.eClass();
		XdtoPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theepPackage.createPackageContents();

		// Initialize created meta-data
		theepPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theepPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(epPackage.eNS_URI, theepPackage);
		return theepPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchangeProject() {
		return exchangeProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangeProject_Name() {
		return (EAttribute)exchangeProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangeProject_StoreVersion() {
		return (EAttribute)exchangeProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeProject_Extensions() {
		return (EReference)exchangeProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangeProject_Status() {
		return (EAttribute)exchangeProjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeProject_FormatVersions() {
		return (EReference)exchangeProjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeProject_SettingsModules() {
		return (EReference)exchangeProjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExchangeProject__GetVersions() {
		return exchangeProjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExchangeProject__GetModuleFormatVersions__CommonModule() {
		return exchangeProjectEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExchangeProject__GetFormatModules() {
		return exchangeProjectEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchangeProjects() {
		return exchangeProjectsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeProjects_Projects() {
		return (EReference)exchangeProjectsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExchangeProjects__GetProject__String() {
		return exchangeProjectsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpExtension() {
		return epExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpExtension_Name() {
		return (EAttribute)epExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpFormatVersion() {
		return epFormatVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpFormatVersion_Version() {
		return (EAttribute)epFormatVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpFormatVersion_ExtensionName() {
		return (EAttribute)epFormatVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpFormatVersion_ModuleName() {
		return (EAttribute)epFormatVersionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpFormatVersion_Module() {
		return (EReference)epFormatVersionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpFormatVersion_XdtoPackage() {
		return (EReference)epFormatVersionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchangeData() {
		return exchangeDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeData_Projects() {
		return (EReference)exchangeDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeData_Pairs() {
		return (EReference)exchangeDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpExchangePair() {
		return epExchangePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpExchangePair_ConfigurationName1() {
		return (EAttribute)epExchangePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpExchangePair_ConfigurationName2() {
		return (EAttribute)epExchangePairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpExchangePair_Status() {
		return (EAttribute)epExchangePairEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpExchangePair_Versions() {
		return (EAttribute)epExchangePairEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEpProjectStatus() {
		return epProjectStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEpExchangePairStatus() {
		return epExchangePairStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public epFactory getepFactory() {
		return (epFactory)getEFactoryInstance();
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
		exchangeProjectEClass = createEClass(EXCHANGE_PROJECT);
		createEAttribute(exchangeProjectEClass, EXCHANGE_PROJECT__NAME);
		createEAttribute(exchangeProjectEClass, EXCHANGE_PROJECT__STORE_VERSION);
		createEReference(exchangeProjectEClass, EXCHANGE_PROJECT__EXTENSIONS);
		createEAttribute(exchangeProjectEClass, EXCHANGE_PROJECT__STATUS);
		createEReference(exchangeProjectEClass, EXCHANGE_PROJECT__FORMAT_VERSIONS);
		createEReference(exchangeProjectEClass, EXCHANGE_PROJECT__SETTINGS_MODULES);
		createEOperation(exchangeProjectEClass, EXCHANGE_PROJECT___GET_VERSIONS);
		createEOperation(exchangeProjectEClass, EXCHANGE_PROJECT___GET_MODULE_FORMAT_VERSIONS__COMMONMODULE);
		createEOperation(exchangeProjectEClass, EXCHANGE_PROJECT___GET_FORMAT_MODULES);

		exchangeProjectsEClass = createEClass(EXCHANGE_PROJECTS);
		createEReference(exchangeProjectsEClass, EXCHANGE_PROJECTS__PROJECTS);
		createEOperation(exchangeProjectsEClass, EXCHANGE_PROJECTS___GET_PROJECT__STRING);

		epExtensionEClass = createEClass(EP_EXTENSION);
		createEAttribute(epExtensionEClass, EP_EXTENSION__NAME);

		epFormatVersionEClass = createEClass(EP_FORMAT_VERSION);
		createEAttribute(epFormatVersionEClass, EP_FORMAT_VERSION__VERSION);
		createEAttribute(epFormatVersionEClass, EP_FORMAT_VERSION__EXTENSION_NAME);
		createEAttribute(epFormatVersionEClass, EP_FORMAT_VERSION__MODULE_NAME);
		createEReference(epFormatVersionEClass, EP_FORMAT_VERSION__MODULE);
		createEReference(epFormatVersionEClass, EP_FORMAT_VERSION__XDTO_PACKAGE);

		exchangeDataEClass = createEClass(EXCHANGE_DATA);
		createEReference(exchangeDataEClass, EXCHANGE_DATA__PROJECTS);
		createEReference(exchangeDataEClass, EXCHANGE_DATA__PAIRS);

		epExchangePairEClass = createEClass(EP_EXCHANGE_PAIR);
		createEAttribute(epExchangePairEClass, EP_EXCHANGE_PAIR__CONFIGURATION_NAME1);
		createEAttribute(epExchangePairEClass, EP_EXCHANGE_PAIR__CONFIGURATION_NAME2);
		createEAttribute(epExchangePairEClass, EP_EXCHANGE_PAIR__STATUS);
		createEAttribute(epExchangePairEClass, EP_EXCHANGE_PAIR__VERSIONS);

		// Create enums
		epProjectStatusEEnum = createEEnum(EP_PROJECT_STATUS);
		epExchangePairStatusEEnum = createEEnum(EP_EXCHANGE_PAIR_STATUS);
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
		MdClassPackage theMdClassPackage = (MdClassPackage)EPackage.Registry.INSTANCE.getEPackage(MdClassPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(exchangeProjectEClass, ExchangeProject.class, "ExchangeProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getExchangeProject_Name(), theEcorePackage.getEString(), "name", "", 0, 1, ExchangeProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getExchangeProject_StoreVersion(), theEcorePackage.getEString(), "storeVersion", "", 0, 1, ExchangeProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getExchangeProject_Extensions(), this.getEpExtension(), null, "extensions", null, 0, -1, ExchangeProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getExchangeProject_Status(), this.getEpProjectStatus(), "status", null, 0, 1, ExchangeProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExchangeProject_FormatVersions(), this.getEpFormatVersion(), null, "formatVersions", null, 0, -1, ExchangeProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExchangeProject_SettingsModules(), theMdClassPackage.getCommonModule(), null, "settingsModules", null, 0, -1, ExchangeProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getExchangeProject__GetVersions(), theEcorePackage.getEString(), "getVersions", 0, -1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		EOperation op = initEOperation(getExchangeProject__GetModuleFormatVersions__CommonModule(), this.getEpFormatVersion(), "getModuleFormatVersions", 0, -1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theMdClassPackage.getCommonModule(), "module", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getExchangeProject__GetFormatModules(), theMdClassPackage.getCommonModule(), "getFormatModules", 0, -1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(exchangeProjectsEClass, ExchangeProjects.class, "ExchangeProjects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getExchangeProjects_Projects(), this.getExchangeProject(), null, "projects", null, 0, -1, ExchangeProjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getExchangeProjects__GetProject__String(), this.getExchangeProject(), "getProject", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(epExtensionEClass, EpExtension.class, "EpExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEpExtension_Name(), theEcorePackage.getEString(), "name", "", 0, 1, EpExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(epFormatVersionEClass, EpFormatVersion.class, "EpFormatVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEpFormatVersion_Version(), theEcorePackage.getEString(), "version", "", 0, 1, EpFormatVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getEpFormatVersion_ExtensionName(), theEcorePackage.getEString(), "extensionName", "", 0, 1, EpFormatVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getEpFormatVersion_ModuleName(), theEcorePackage.getEString(), "moduleName", "", 0, 1, EpFormatVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getEpFormatVersion_Module(), theMdClassPackage.getCommonModule(), null, "module", null, 0, 1, EpFormatVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEpFormatVersion_XdtoPackage(), theMdClassPackage.getXDTOPackage(), null, "xdtoPackage", null, 0, 1, EpFormatVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(exchangeDataEClass, ExchangeData.class, "ExchangeData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getExchangeData_Projects(), this.getExchangeProject(), null, "projects", null, 0, -1, ExchangeData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getExchangeData_Pairs(), this.getEpExchangePair(), null, "pairs", null, 0, -1, ExchangeData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(epExchangePairEClass, EpExchangePair.class, "EpExchangePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEpExchangePair_ConfigurationName1(), theEcorePackage.getEString(), "configurationName1", "", 0, 1, EpExchangePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getEpExchangePair_ConfigurationName2(), theEcorePackage.getEString(), "configurationName2", "", 0, 1, EpExchangePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getEpExchangePair_Status(), this.getEpExchangePairStatus(), "status", null, 0, 1, EpExchangePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEpExchangePair_Versions(), theEcorePackage.getEString(), "versions", null, 0, -1, EpExchangePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(epProjectStatusEEnum, EpProjectStatus.class, "EpProjectStatus"); //$NON-NLS-1$
		addEEnumLiteral(epProjectStatusEEnum, EpProjectStatus.NO_CONFIGURATION);
		addEEnumLiteral(epProjectStatusEEnum, EpProjectStatus.NO_SUBSYSTEM);
		addEEnumLiteral(epProjectStatusEEnum, EpProjectStatus.NO_SSL_VERSION);
		addEEnumLiteral(epProjectStatusEEnum, EpProjectStatus.NO_COMMON_MODULE);
		addEEnumLiteral(epProjectStatusEEnum, EpProjectStatus.NO_METHOD);
		addEEnumLiteral(epProjectStatusEEnum, EpProjectStatus.EMPTY_METHOD);
		addEEnumLiteral(epProjectStatusEEnum, EpProjectStatus.READY);

		initEEnum(epExchangePairStatusEEnum, EpExchangePairStatus.class, "EpExchangePairStatus"); //$NON-NLS-1$
		addEEnumLiteral(epExchangePairStatusEEnum, EpExchangePairStatus.NO_SHARED_FORMAT_VERSIONS);
		addEEnumLiteral(epExchangePairStatusEEnum, EpExchangePairStatus.READY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore"; //$NON-NLS-1$	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

} //epPackageImpl
