/**
 */
package ru.capralow.dt.conversion.plugin.core.cp.impl;

import com._1c.g5.v8.dt.bsl.model.BslPackage;

import com._1c.g5.v8.dt.mcore.McorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ru.capralow.dt.conversion.plugin.core.cp.ConfigurationStatus;
import ru.capralow.dt.conversion.plugin.core.cp.ConversionPanel;
import ru.capralow.dt.conversion.plugin.core.cp.CpFactory;
import ru.capralow.dt.conversion.plugin.core.cp.CpPackage;
import ru.capralow.dt.conversion.plugin.core.cp.ExchangePairStatus;
import ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration;
import ru.capralow.dt.conversion.plugin.core.cp.cpExchangePair;
import ru.capralow.dt.conversion.plugin.core.cp.cpExtension;
import ru.capralow.dt.conversion.plugin.core.cp.cpFormatVersion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CpPackageImpl extends EPackageImpl implements CpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversionPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpFormatVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpExchangePairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exchangePairStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum configurationStatusEEnum = null;

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
	 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CpPackageImpl() {
		super(eNS_URI, CpFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CpPackage init() {
		if (isInited) return (CpPackage)EPackage.Registry.INSTANCE.getEPackage(CpPackage.eNS_URI);

		// Obtain or create and register package
		CpPackageImpl theCpPackage = (CpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CpPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		BslPackage.eINSTANCE.eClass();
		McorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCpPackage.createPackageContents();

		// Initialize created meta-data
		theCpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CpPackage.eNS_URI, theCpPackage);
		return theCpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConversionPanel() {
		return conversionPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionPanel_ExchangePairs() {
		return (EReference)conversionPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionPanel_Configurations() {
		return (EReference)conversionPanelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionPanel__GetConfiguration__String() {
		return conversionPanelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionPanel__GetObjects() {
		return conversionPanelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcpConfiguration() {
		return cpConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpConfiguration_ConfigurationObject() {
		return (EAttribute)cpConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpConfiguration_ConfigurationName() {
		return (EAttribute)cpConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpConfiguration_StoreVersion() {
		return (EAttribute)cpConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcpConfiguration_Extensions() {
		return (EReference)cpConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpConfiguration_Status() {
		return (EAttribute)cpConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcpConfiguration_AvailableFormatVersions() {
		return (EReference)cpConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpConfiguration_CoreObjects() {
		return (EAttribute)cpConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcpConfiguration__GetVersions() {
		return cpConfigurationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcpExtension() {
		return cpExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpExtension_ConfigurationObject() {
		return (EAttribute)cpExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpExtension_ConfigurationName() {
		return (EAttribute)cpExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcpFormatVersion() {
		return cpFormatVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpFormatVersion_Version() {
		return (EAttribute)cpFormatVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpFormatVersion_ConfigurationName() {
		return (EAttribute)cpFormatVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcpFormatVersion_Module() {
		return (EReference)cpFormatVersionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcpExchangePair() {
		return cpExchangePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpExchangePair_ConfigurationName1() {
		return (EAttribute)cpExchangePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpExchangePair_ConfigurationName2() {
		return (EAttribute)cpExchangePairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpExchangePair_Status() {
		return (EAttribute)cpExchangePairEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcpExchangePair_Versions() {
		return (EAttribute)cpExchangePairEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExchangePairStatus() {
		return exchangePairStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConfigurationStatus() {
		return configurationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpFactory getCpFactory() {
		return (CpFactory)getEFactoryInstance();
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
		conversionPanelEClass = createEClass(CONVERSION_PANEL);
		createEReference(conversionPanelEClass, CONVERSION_PANEL__EXCHANGE_PAIRS);
		createEReference(conversionPanelEClass, CONVERSION_PANEL__CONFIGURATIONS);
		createEOperation(conversionPanelEClass, CONVERSION_PANEL___GET_CONFIGURATION__STRING);
		createEOperation(conversionPanelEClass, CONVERSION_PANEL___GET_OBJECTS);

		cpConfigurationEClass = createEClass(CP_CONFIGURATION);
		createEAttribute(cpConfigurationEClass, CP_CONFIGURATION__CONFIGURATION_OBJECT);
		createEAttribute(cpConfigurationEClass, CP_CONFIGURATION__CONFIGURATION_NAME);
		createEAttribute(cpConfigurationEClass, CP_CONFIGURATION__STORE_VERSION);
		createEReference(cpConfigurationEClass, CP_CONFIGURATION__EXTENSIONS);
		createEAttribute(cpConfigurationEClass, CP_CONFIGURATION__STATUS);
		createEReference(cpConfigurationEClass, CP_CONFIGURATION__AVAILABLE_FORMAT_VERSIONS);
		createEAttribute(cpConfigurationEClass, CP_CONFIGURATION__CORE_OBJECTS);
		createEOperation(cpConfigurationEClass, CP_CONFIGURATION___GET_VERSIONS);

		cpExtensionEClass = createEClass(CP_EXTENSION);
		createEAttribute(cpExtensionEClass, CP_EXTENSION__CONFIGURATION_OBJECT);
		createEAttribute(cpExtensionEClass, CP_EXTENSION__CONFIGURATION_NAME);

		cpFormatVersionEClass = createEClass(CP_FORMAT_VERSION);
		createEAttribute(cpFormatVersionEClass, CP_FORMAT_VERSION__VERSION);
		createEAttribute(cpFormatVersionEClass, CP_FORMAT_VERSION__CONFIGURATION_NAME);
		createEReference(cpFormatVersionEClass, CP_FORMAT_VERSION__MODULE);

		cpExchangePairEClass = createEClass(CP_EXCHANGE_PAIR);
		createEAttribute(cpExchangePairEClass, CP_EXCHANGE_PAIR__CONFIGURATION_NAME1);
		createEAttribute(cpExchangePairEClass, CP_EXCHANGE_PAIR__CONFIGURATION_NAME2);
		createEAttribute(cpExchangePairEClass, CP_EXCHANGE_PAIR__STATUS);
		createEAttribute(cpExchangePairEClass, CP_EXCHANGE_PAIR__VERSIONS);

		// Create enums
		exchangePairStatusEEnum = createEEnum(EXCHANGE_PAIR_STATUS);
		configurationStatusEEnum = createEEnum(CONFIGURATION_STATUS);
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
		BslPackage theBslPackage = (BslPackage)EPackage.Registry.INSTANCE.getEPackage(BslPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(conversionPanelEClass, ConversionPanel.class, "ConversionPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getConversionPanel_ExchangePairs(), this.getcpExchangePair(), null, "ExchangePairs", null, 0, -1, ConversionPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConversionPanel_Configurations(), this.getcpConfiguration(), null, "configurations", null, 0, -1, ConversionPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		EOperation op = initEOperation(getConversionPanel__GetConfiguration__String(), this.getcpConfiguration(), "getConfiguration", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "configurationName", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getConversionPanel__GetObjects(), theEcorePackage.getEJavaObject(), "getObjects", 0, -1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(cpConfigurationEClass, cpConfiguration.class, "cpConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getcpConfiguration_ConfigurationObject(), theEcorePackage.getEJavaObject(), "configurationObject", null, 0, 1, cpConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getcpConfiguration_ConfigurationName(), theEcorePackage.getEString(), "configurationName", null, 0, 1, cpConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getcpConfiguration_StoreVersion(), theEcorePackage.getEString(), "storeVersion", null, 0, 1, cpConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getcpConfiguration_Extensions(), this.getcpExtension(), null, "extensions", null, 0, -1, cpConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getcpConfiguration_Status(), this.getConfigurationStatus(), "Status", null, 0, 1, cpConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getcpConfiguration_AvailableFormatVersions(), this.getcpFormatVersion(), null, "availableFormatVersions", null, 0, -1, cpConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getcpConfiguration_CoreObjects(), theEcorePackage.getEJavaObject(), "coreObjects", null, 0, -1, cpConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getcpConfiguration__GetVersions(), theEcorePackage.getEString(), "getVersions", 0, -1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(cpExtensionEClass, cpExtension.class, "cpExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getcpExtension_ConfigurationObject(), theEcorePackage.getEJavaObject(), "configurationObject", null, 0, 1, cpExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getcpExtension_ConfigurationName(), theEcorePackage.getEString(), "configurationName", null, 0, 1, cpExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(cpFormatVersionEClass, cpFormatVersion.class, "cpFormatVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getcpFormatVersion_Version(), theEcorePackage.getEString(), "version", null, 0, 1, cpFormatVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getcpFormatVersion_ConfigurationName(), theEcorePackage.getEString(), "configurationName", null, 0, 1, cpFormatVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getcpFormatVersion_Module(), theBslPackage.getModule(), null, "module", null, 0, 1, cpFormatVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(cpExchangePairEClass, cpExchangePair.class, "cpExchangePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getcpExchangePair_ConfigurationName1(), theEcorePackage.getEString(), "configurationName1", null, 0, 1, cpExchangePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getcpExchangePair_ConfigurationName2(), theEcorePackage.getEString(), "configurationName2", null, 0, 1, cpExchangePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getcpExchangePair_Status(), this.getExchangePairStatus(), "Status", null, 0, 1, cpExchangePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getcpExchangePair_Versions(), theEcorePackage.getEString(), "versions", null, 0, -1, cpExchangePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(exchangePairStatusEEnum, ExchangePairStatus.class, "ExchangePairStatus"); //$NON-NLS-1$
		addEEnumLiteral(exchangePairStatusEEnum, ExchangePairStatus.NO_SHARED_FORMAT_VERSIONS);
		addEEnumLiteral(exchangePairStatusEEnum, ExchangePairStatus.READY);

		initEEnum(configurationStatusEEnum, ConfigurationStatus.class, "ConfigurationStatus"); //$NON-NLS-1$
		addEEnumLiteral(configurationStatusEEnum, ConfigurationStatus.NO_CONFIGURATION);
		addEEnumLiteral(configurationStatusEEnum, ConfigurationStatus.NO_SUBSYSTEM);
		addEEnumLiteral(configurationStatusEEnum, ConfigurationStatus.NO_SSL_VERSION);
		addEEnumLiteral(configurationStatusEEnum, ConfigurationStatus.NO_COMMON_MODULE);
		addEEnumLiteral(configurationStatusEEnum, ConfigurationStatus.NO_METHOD);
		addEEnumLiteral(configurationStatusEEnum, ConfigurationStatus.EMPTY_METHOD);
		addEEnumLiteral(configurationStatusEEnum, ConfigurationStatus.READY);

		// Create resource
		createResource(eNS_URI);
	}

} //CpPackageImpl
