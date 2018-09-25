/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ru.capralow.dt.conversion.plugin.core.cm.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.CmAttributeRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmFactory;
import ru.capralow.dt.conversion.plugin.core.cm.CmIdentificationVariant;
import ru.capralow.dt.conversion.plugin.core.cm.CmMethodType;
import ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.CmPackage;
import ru.capralow.dt.conversion.plugin.core.cm.CmPredefined;
import ru.capralow.dt.conversion.plugin.core.cm.CmSelectionVariant;
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
	private EClass cmAttributeRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmPredefinedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmAlgorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cmSelectionVariantEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cmIdentificationVariantEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cmMethodTypeEEnum = null;

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
	public EAttribute getConversionModule_ModuleURI() {
		return (EAttribute)conversionModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionModule_Params() {
		return (EAttribute)conversionModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionModule_BeforeConvertationEvent() {
		return (EAttribute)conversionModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionModule_BeforeConvertationEventPrefix() {
		return (EAttribute)conversionModuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionModule_BeforeConvertationEventSuffix() {
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
	public EAttribute getConversionModule_AfterConvertationEventPrefix() {
		return (EAttribute)conversionModuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionModule_AfterConvertationEventSuffix() {
		return (EAttribute)conversionModuleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionModule_BeforeFillingEvent() {
		return (EAttribute)conversionModuleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionModule_BeforeFillingEventPrefix() {
		return (EAttribute)conversionModuleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversionModule_BeforeFillingEventSuffix() {
		return (EAttribute)conversionModuleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionModule_DataRules() {
		return (EReference)conversionModuleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionModule_ObjectRules() {
		return (EReference)conversionModuleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionModule_Predefineds() {
		return (EReference)conversionModuleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversionModule_Algorithms() {
		return (EReference)conversionModuleEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetBeforeConvertationEventText() {
		return conversionModuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetAfterConvertationEventText() {
		return conversionModuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetBeforeFillingEventText() {
		return conversionModuleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetDataRule__String() {
		return conversionModuleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetSendingDataRules() {
		return conversionModuleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetReceivingDataRules() {
		return conversionModuleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetObjectRule__String() {
		return conversionModuleEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetAlgorithm__String() {
		return conversionModuleEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetAllAlgorithmsText__String() {
		return conversionModuleEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetModuleTextV2() {
		return conversionModuleEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetModuleText() {
		return conversionModuleEClass.getEOperations().get(10);
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
	public EReference getCmDataRule_ConversionModule() {
		return (EReference)cmDataRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_Name() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_IsDisabled() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_ConfigurationObject() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_FormatObject() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_ForSending() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_ForReceiving() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_SelectionVariant() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_OnProcessingEvent() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_OnProcessingEventPrefix() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_OnProcessingEventSuffix() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_DataSelectionEvent() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_DataSelectionEventPrefix() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_DataSelectionEventSuffix() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_IsDataCleaning() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmDataRule_ObjectRules() {
		return (EReference)cmDataRuleEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCmDataRule__GetOnProcessingEventText() {
		return cmDataRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCmDataRule__GetOnProcessingEventDeclaration() {
		return cmDataRuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCmDataRule__GetDataSelectionEventText() {
		return cmDataRuleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCmDataRule__GetDataSelectionEventDeclaration() {
		return cmDataRuleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCmDataRule__GetDataCleaningDeclaration() {
		return cmDataRuleEClass.getEOperations().get(4);
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
	public EAttribute getCmObjectRule_IsDisabled() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_ConfigurationObject() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_FormatObject() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_ForSending() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_ForReceiving() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_IsForGroup() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_IdentificationVariant() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_OnSendingEvent() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_OnSendingEventPrefix() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_OnSendingEventSuffix() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_BeforeReceivingEvent() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_BeforeReceivingEventPrefix() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_BeforeReceivingEventSuffix() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_OnReceivingEvent() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_OnReceivingEventPrefix() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_OnReceivingEventSuffix() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmObjectRule_AfterReceivingAlgorithm() {
		return (EReference)cmObjectRuleEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmObjectRule_AttributeRules() {
		return (EReference)cmObjectRuleEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCmObjectRule__GetOnSendingEventText() {
		return cmObjectRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCmObjectRule__GetBeforeReceivingEventText() {
		return cmObjectRuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCmObjectRule__GetOnReceivingEventText() {
		return cmObjectRuleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmAttributeRule() {
		return cmAttributeRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmAttributeRule_ConfigurationTabularSectionName() {
		return (EAttribute)cmAttributeRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmAttributeRule_ConfigurationAttributeName() {
		return (EAttribute)cmAttributeRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmAttributeRule_FormatTabularSectionName() {
		return (EAttribute)cmAttributeRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmAttributeRule_FormatAttributeName() {
		return (EAttribute)cmAttributeRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmAttributeRule_ObjectRule() {
		return (EReference)cmAttributeRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmAttributeRule_IsCustomRule() {
		return (EAttribute)cmAttributeRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmPredefined() {
		return cmPredefinedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmPredefined_Name() {
		return (EAttribute)cmPredefinedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmPredefined_ConfigurationObject() {
		return (EAttribute)cmPredefinedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmPredefined_FormatObject() {
		return (EAttribute)cmPredefinedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmPredefined_ForSending() {
		return (EAttribute)cmPredefinedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmPredefined_ForReceiving() {
		return (EAttribute)cmPredefinedEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmAlgorithm() {
		return cmAlgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmAlgorithm_ConversionModule() {
		return (EReference)cmAlgorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmAlgorithm_Name() {
		return (EAttribute)cmAlgorithmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmAlgorithm_MethodType() {
		return (EAttribute)cmAlgorithmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmAlgorithm_Params() {
		return (EAttribute)cmAlgorithmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmAlgorithm_IsExport() {
		return (EAttribute)cmAlgorithmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmAlgorithm_Body() {
		return (EAttribute)cmAlgorithmEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmAlgorithm_Prefix() {
		return (EAttribute)cmAlgorithmEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmAlgorithm_Suffix() {
		return (EAttribute)cmAlgorithmEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCmAlgorithm__GetAlgorithmText() {
		return cmAlgorithmEClass.getEOperations().get(0);
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
	public EEnum getCmIdentificationVariant() {
		return cmIdentificationVariantEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCmMethodType() {
		return cmMethodTypeEEnum;
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
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__MODULE_URI);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__PARAMS);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_PREFIX);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__BEFORE_CONVERTATION_EVENT_SUFFIX);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__AFTER_CONVERTATION_EVENT);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_PREFIX);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__AFTER_CONVERTATION_EVENT_SUFFIX);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__BEFORE_FILLING_EVENT);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__BEFORE_FILLING_EVENT_PREFIX);
		createEAttribute(conversionModuleEClass, CONVERSION_MODULE__BEFORE_FILLING_EVENT_SUFFIX);
		createEReference(conversionModuleEClass, CONVERSION_MODULE__DATA_RULES);
		createEReference(conversionModuleEClass, CONVERSION_MODULE__OBJECT_RULES);
		createEReference(conversionModuleEClass, CONVERSION_MODULE__PREDEFINEDS);
		createEReference(conversionModuleEClass, CONVERSION_MODULE__ALGORITHMS);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_BEFORE_CONVERTATION_EVENT_TEXT);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_AFTER_CONVERTATION_EVENT_TEXT);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_BEFORE_FILLING_EVENT_TEXT);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_DATA_RULE__STRING);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_SENDING_DATA_RULES);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_RECEIVING_DATA_RULES);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_OBJECT_RULE__STRING);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_ALGORITHM__STRING);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_ALL_ALGORITHMS_TEXT__STRING);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_MODULE_TEXT_V2);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_MODULE_TEXT);

		cmDataRuleEClass = createEClass(CM_DATA_RULE);
		createEReference(cmDataRuleEClass, CM_DATA_RULE__CONVERSION_MODULE);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__NAME);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__IS_DISABLED);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__CONFIGURATION_OBJECT);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__FORMAT_OBJECT);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__FOR_SENDING);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__FOR_RECEIVING);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__SELECTION_VARIANT);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__ON_PROCESSING_EVENT);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__ON_PROCESSING_EVENT_PREFIX);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__ON_PROCESSING_EVENT_SUFFIX);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__DATA_SELECTION_EVENT);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__DATA_SELECTION_EVENT_PREFIX);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__DATA_SELECTION_EVENT_SUFFIX);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__IS_DATA_CLEANING);
		createEReference(cmDataRuleEClass, CM_DATA_RULE__OBJECT_RULES);
		createEOperation(cmDataRuleEClass, CM_DATA_RULE___GET_ON_PROCESSING_EVENT_TEXT);
		createEOperation(cmDataRuleEClass, CM_DATA_RULE___GET_ON_PROCESSING_EVENT_DECLARATION);
		createEOperation(cmDataRuleEClass, CM_DATA_RULE___GET_DATA_SELECTION_EVENT_TEXT);
		createEOperation(cmDataRuleEClass, CM_DATA_RULE___GET_DATA_SELECTION_EVENT_DECLARATION);
		createEOperation(cmDataRuleEClass, CM_DATA_RULE___GET_DATA_CLEANING_DECLARATION);

		cmObjectRuleEClass = createEClass(CM_OBJECT_RULE);
		createEAttribute(cmObjectRuleEClass, CM_OBJECT_RULE__NAME);
		createEAttribute(cmObjectRuleEClass, CM_OBJECT_RULE__IS_DISABLED);
		createEAttribute(cmObjectRuleEClass, CM_OBJECT_RULE__CONFIGURATION_OBJECT);
		createEAttribute(cmObjectRuleEClass, CM_OBJECT_RULE__FORMAT_OBJECT);
		createEAttribute(cmObjectRuleEClass, CM_OBJECT_RULE__FOR_SENDING);
		createEAttribute(cmObjectRuleEClass, CM_OBJECT_RULE__FOR_RECEIVING);
		createEAttribute(cmObjectRuleEClass, CM_OBJECT_RULE__IS_FOR_GROUP);
		createEAttribute(cmObjectRuleEClass, CM_OBJECT_RULE__IDENTIFICATION_VARIANT);
		createEAttribute(cmObjectRuleEClass, CM_OBJECT_RULE__ON_SENDING_EVENT);
		createEAttribute(cmObjectRuleEClass, CM_OBJECT_RULE__ON_SENDING_EVENT_PREFIX);
		createEAttribute(cmObjectRuleEClass, CM_OBJECT_RULE__ON_SENDING_EVENT_SUFFIX);
		createEAttribute(cmObjectRuleEClass, CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT);
		createEAttribute(cmObjectRuleEClass, CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT_PREFIX);
		createEAttribute(cmObjectRuleEClass, CM_OBJECT_RULE__BEFORE_RECEIVING_EVENT_SUFFIX);
		createEAttribute(cmObjectRuleEClass, CM_OBJECT_RULE__ON_RECEIVING_EVENT);
		createEAttribute(cmObjectRuleEClass, CM_OBJECT_RULE__ON_RECEIVING_EVENT_PREFIX);
		createEAttribute(cmObjectRuleEClass, CM_OBJECT_RULE__ON_RECEIVING_EVENT_SUFFIX);
		createEReference(cmObjectRuleEClass, CM_OBJECT_RULE__AFTER_RECEIVING_ALGORITHM);
		createEReference(cmObjectRuleEClass, CM_OBJECT_RULE__ATTRIBUTE_RULES);
		createEOperation(cmObjectRuleEClass, CM_OBJECT_RULE___GET_ON_SENDING_EVENT_TEXT);
		createEOperation(cmObjectRuleEClass, CM_OBJECT_RULE___GET_BEFORE_RECEIVING_EVENT_TEXT);
		createEOperation(cmObjectRuleEClass, CM_OBJECT_RULE___GET_ON_RECEIVING_EVENT_TEXT);

		cmAttributeRuleEClass = createEClass(CM_ATTRIBUTE_RULE);
		createEAttribute(cmAttributeRuleEClass, CM_ATTRIBUTE_RULE__CONFIGURATION_TABULAR_SECTION_NAME);
		createEAttribute(cmAttributeRuleEClass, CM_ATTRIBUTE_RULE__CONFIGURATION_ATTRIBUTE_NAME);
		createEAttribute(cmAttributeRuleEClass, CM_ATTRIBUTE_RULE__FORMAT_TABULAR_SECTION_NAME);
		createEAttribute(cmAttributeRuleEClass, CM_ATTRIBUTE_RULE__FORMAT_ATTRIBUTE_NAME);
		createEReference(cmAttributeRuleEClass, CM_ATTRIBUTE_RULE__OBJECT_RULE);
		createEAttribute(cmAttributeRuleEClass, CM_ATTRIBUTE_RULE__IS_CUSTOM_RULE);

		cmPredefinedEClass = createEClass(CM_PREDEFINED);
		createEAttribute(cmPredefinedEClass, CM_PREDEFINED__NAME);
		createEAttribute(cmPredefinedEClass, CM_PREDEFINED__CONFIGURATION_OBJECT);
		createEAttribute(cmPredefinedEClass, CM_PREDEFINED__FORMAT_OBJECT);
		createEAttribute(cmPredefinedEClass, CM_PREDEFINED__FOR_SENDING);
		createEAttribute(cmPredefinedEClass, CM_PREDEFINED__FOR_RECEIVING);

		cmAlgorithmEClass = createEClass(CM_ALGORITHM);
		createEReference(cmAlgorithmEClass, CM_ALGORITHM__CONVERSION_MODULE);
		createEAttribute(cmAlgorithmEClass, CM_ALGORITHM__NAME);
		createEAttribute(cmAlgorithmEClass, CM_ALGORITHM__METHOD_TYPE);
		createEAttribute(cmAlgorithmEClass, CM_ALGORITHM__PARAMS);
		createEAttribute(cmAlgorithmEClass, CM_ALGORITHM__IS_EXPORT);
		createEAttribute(cmAlgorithmEClass, CM_ALGORITHM__BODY);
		createEAttribute(cmAlgorithmEClass, CM_ALGORITHM__PREFIX);
		createEAttribute(cmAlgorithmEClass, CM_ALGORITHM__SUFFIX);
		createEOperation(cmAlgorithmEClass, CM_ALGORITHM___GET_ALGORITHM_TEXT);

		// Create enums
		cmSelectionVariantEEnum = createEEnum(CM_SELECTION_VARIANT);
		cmIdentificationVariantEEnum = createEEnum(CM_IDENTIFICATION_VARIANT);
		cmMethodTypeEEnum = createEEnum(CM_METHOD_TYPE);
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
		initEAttribute(getConversionModule_StoreVersion(), theEcorePackage.getEString(), "storeVersion", "1", 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getConversionModule_ModuleURI(), theEcorePackage.getEJavaObject(), "moduleURI", null, 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConversionModule_Params(), theEcorePackage.getEString(), "params", null, 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConversionModule_BeforeConvertationEvent(), theEcorePackage.getEString(), "beforeConvertationEvent", "", 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getConversionModule_BeforeConvertationEventPrefix(), theEcorePackage.getEString(), "beforeConvertationEventPrefix", "\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u041f\u0435\u0440\u0435\u0434\u041a\u043e\u043d\u0432\u0435\u0440\u0442\u0430\u0446\u0438\u0435\u0439(\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b\u041e\u0431\u043c\u0435\u043d\u0430) \u042d\u043a\u0441\u043f\u043e\u0440\u0442", 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getConversionModule_BeforeConvertationEventSuffix(), theEcorePackage.getEString(), "beforeConvertationEventSuffix", "\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b", 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getConversionModule_AfterConvertationEvent(), theEcorePackage.getEString(), "afterConvertationEvent", "", 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getConversionModule_AfterConvertationEventPrefix(), theEcorePackage.getEString(), "afterConvertationEventPrefix", "\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u041f\u043e\u0441\u043b\u0435\u041a\u043e\u043d\u0432\u0435\u0440\u0442\u0430\u0446\u0438\u0438(\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b\u041e\u0431\u043c\u0435\u043d\u0430) \u042d\u043a\u0441\u043f\u043e\u0440\u0442", 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getConversionModule_AfterConvertationEventSuffix(), theEcorePackage.getEString(), "afterConvertationEventSuffix", "\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b", 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getConversionModule_BeforeFillingEvent(), theEcorePackage.getEString(), "beforeFillingEvent", "", 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getConversionModule_BeforeFillingEventPrefix(), theEcorePackage.getEString(), "beforeFillingEventPrefix", "\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u041f\u0435\u0440\u0435\u0434\u041e\u0442\u043b\u043e\u0436\u0435\u043d\u043d\u044b\u043c\u0417\u0430\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435\u043c(\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b\u041e\u0431\u043c\u0435\u043d\u0430) \u042d\u043a\u0441\u043f\u043e\u0440\u0442", 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getConversionModule_BeforeFillingEventSuffix(), theEcorePackage.getEString(), "beforeFillingEventSuffix", "\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b", 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getConversionModule_DataRules(), this.getCmDataRule(), this.getCmDataRule_ConversionModule(), "dataRules", null, 0, -1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConversionModule_ObjectRules(), this.getCmObjectRule(), null, "objectRules", null, 0, -1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConversionModule_Predefineds(), this.getCmPredefined(), null, "predefineds", null, 0, -1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConversionModule_Algorithms(), this.getCmAlgorithm(), this.getCmAlgorithm_ConversionModule(), "algorithms", null, 0, -1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getConversionModule__GetBeforeConvertationEventText(), theEcorePackage.getEString(), "getBeforeConvertationEventText", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getConversionModule__GetAfterConvertationEventText(), theEcorePackage.getEString(), "getAfterConvertationEventText", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getConversionModule__GetBeforeFillingEventText(), theEcorePackage.getEString(), "getBeforeFillingEventText", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		EOperation op = initEOperation(getConversionModule__GetDataRule__String(), this.getCmDataRule(), "getDataRule", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "ruleName", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getConversionModule__GetSendingDataRules(), theEcorePackage.getEJavaObject(), "getSendingDataRules", 0, -1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getConversionModule__GetReceivingDataRules(), theEcorePackage.getEJavaObject(), "getReceivingDataRules", 0, -1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getConversionModule__GetObjectRule__String(), this.getCmObjectRule(), "getObjectRule", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "ruleName", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getConversionModule__GetAlgorithm__String(), this.getCmAlgorithm(), "getAlgorithm", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "algorithmName", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getConversionModule__GetAllAlgorithmsText__String(), theEcorePackage.getEString(), "getAllAlgorithmsText", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "algorithmName", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getConversionModule__GetModuleTextV2(), theEcorePackage.getEString(), "getModuleTextV2", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getConversionModule__GetModuleText(), theEcorePackage.getEString(), "getModuleText", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(cmDataRuleEClass, CmDataRule.class, "CmDataRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCmDataRule_ConversionModule(), this.getConversionModule(), this.getConversionModule_DataRules(), "conversionModule", null, 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmDataRule_Name(), theEcorePackage.getEString(), "name", "", 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmDataRule_IsDisabled(), theEcorePackage.getEBooleanObject(), "isDisabled", "false", 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmDataRule_ConfigurationObject(), theEcorePackage.getEJavaObject(), "configurationObject", null, 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmDataRule_FormatObject(), theEcorePackage.getEJavaObject(), "formatObject", null, 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmDataRule_ForSending(), theEcorePackage.getEBooleanObject(), "forSending", "false", 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmDataRule_ForReceiving(), theEcorePackage.getEBooleanObject(), "forReceiving", "false", 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmDataRule_SelectionVariant(), this.getCmSelectionVariant(), "selectionVariant", null, 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmDataRule_OnProcessingEvent(), theEcorePackage.getEString(), "onProcessingEvent", "", 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmDataRule_OnProcessingEventPrefix(), theEcorePackage.getEString(), "onProcessingEventPrefix", null, 0, 1, CmDataRule.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmDataRule_OnProcessingEventSuffix(), theEcorePackage.getEString(), "onProcessingEventSuffix", "\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b", 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmDataRule_DataSelectionEvent(), theEcorePackage.getEString(), "dataSelectionEvent", "", 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmDataRule_DataSelectionEventPrefix(), theEcorePackage.getEString(), "dataSelectionEventPrefix", null, 0, 1, CmDataRule.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmDataRule_DataSelectionEventSuffix(), theEcorePackage.getEString(), "dataSelectionEventSuffix", "\u041a\u043e\u043d\u0435\u0446\u0424\u0443\u043d\u043a\u0446\u0438\u0438", 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmDataRule_IsDataCleaning(), theEcorePackage.getEBooleanObject(), "isDataCleaning", "false", 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getCmDataRule_ObjectRules(), this.getCmObjectRule(), null, "objectRules", null, 0, -1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmDataRule__GetOnProcessingEventText(), theEcorePackage.getEString(), "getOnProcessingEventText", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmDataRule__GetOnProcessingEventDeclaration(), theEcorePackage.getEString(), "getOnProcessingEventDeclaration", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmDataRule__GetDataSelectionEventText(), theEcorePackage.getEString(), "getDataSelectionEventText", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmDataRule__GetDataSelectionEventDeclaration(), theEcorePackage.getEString(), "getDataSelectionEventDeclaration", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmDataRule__GetDataCleaningDeclaration(), theEcorePackage.getEString(), "getDataCleaningDeclaration", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(cmObjectRuleEClass, CmObjectRule.class, "CmObjectRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCmObjectRule_Name(), theEcorePackage.getEString(), "name", "", 0, 1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmObjectRule_IsDisabled(), theEcorePackage.getEBooleanObject(), "isDisabled", "false", 0, 1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmObjectRule_ConfigurationObject(), theEcorePackage.getEJavaObject(), "configurationObject", null, 0, 1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmObjectRule_FormatObject(), theEcorePackage.getEJavaObject(), "formatObject", null, 0, 1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmObjectRule_ForSending(), theEcorePackage.getEBooleanObject(), "forSending", "false", 0, 1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmObjectRule_ForReceiving(), theEcorePackage.getEBooleanObject(), "forReceiving", "false", 0, 1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmObjectRule_IsForGroup(), theEcorePackage.getEBooleanObject(), "isForGroup", "false", 0, 1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmObjectRule_IdentificationVariant(), this.getCmIdentificationVariant(), "identificationVariant", null, 0, 1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmObjectRule_OnSendingEvent(), theEcorePackage.getEString(), "onSendingEvent", "", 0, 1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmObjectRule_OnSendingEventPrefix(), theEcorePackage.getEString(), "onSendingEventPrefix", null, 0, 1, CmObjectRule.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmObjectRule_OnSendingEventSuffix(), theEcorePackage.getEString(), "onSendingEventSuffix", "\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b", 0, 1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmObjectRule_BeforeReceivingEvent(), theEcorePackage.getEString(), "beforeReceivingEvent", "", 0, 1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmObjectRule_BeforeReceivingEventPrefix(), theEcorePackage.getEString(), "beforeReceivingEventPrefix", null, 0, 1, CmObjectRule.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmObjectRule_BeforeReceivingEventSuffix(), theEcorePackage.getEString(), "beforeReceivingEventSuffix", "\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b", 0, 1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmObjectRule_OnReceivingEvent(), theEcorePackage.getEString(), "onReceivingEvent", "", 0, 1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmObjectRule_OnReceivingEventPrefix(), theEcorePackage.getEString(), "onReceivingEventPrefix", null, 0, 1, CmObjectRule.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmObjectRule_OnReceivingEventSuffix(), theEcorePackage.getEString(), "onReceivingEventSuffix", "\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b", 0, 1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getCmObjectRule_AfterReceivingAlgorithm(), this.getCmAlgorithm(), null, "afterReceivingAlgorithm", null, 0, 1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCmObjectRule_AttributeRules(), this.getCmAttributeRule(), null, "attributeRules", null, 0, -1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmObjectRule__GetOnSendingEventText(), theEcorePackage.getEString(), "getOnSendingEventText", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmObjectRule__GetBeforeReceivingEventText(), theEcorePackage.getEString(), "getBeforeReceivingEventText", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmObjectRule__GetOnReceivingEventText(), theEcorePackage.getEString(), "getOnReceivingEventText", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(cmAttributeRuleEClass, CmAttributeRule.class, "CmAttributeRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCmAttributeRule_ConfigurationTabularSectionName(), theEcorePackage.getEString(), "configurationTabularSectionName", "", 0, 1, CmAttributeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmAttributeRule_ConfigurationAttributeName(), theEcorePackage.getEString(), "configurationAttributeName", "", 0, 1, CmAttributeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmAttributeRule_FormatTabularSectionName(), theEcorePackage.getEString(), "formatTabularSectionName", "", 0, 1, CmAttributeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmAttributeRule_FormatAttributeName(), theEcorePackage.getEString(), "formatAttributeName", "", 0, 1, CmAttributeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getCmAttributeRule_ObjectRule(), this.getCmObjectRule(), null, "objectRule", null, 0, 1, CmAttributeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmAttributeRule_IsCustomRule(), theEcorePackage.getEBooleanObject(), "isCustomRule", "false", 0, 1, CmAttributeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(cmPredefinedEClass, CmPredefined.class, "CmPredefined", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCmPredefined_Name(), theEcorePackage.getEString(), "name", "", 0, 1, CmPredefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmPredefined_ConfigurationObject(), theEcorePackage.getEJavaObject(), "configurationObject", null, 0, 1, CmPredefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmPredefined_FormatObject(), theEcorePackage.getEJavaObject(), "formatObject", null, 0, 1, CmPredefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmPredefined_ForSending(), theEcorePackage.getEBooleanObject(), "forSending", "false", 0, 1, CmPredefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmPredefined_ForReceiving(), theEcorePackage.getEBooleanObject(), "forReceiving", "false", 0, 1, CmPredefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(cmAlgorithmEClass, CmAlgorithm.class, "CmAlgorithm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCmAlgorithm_ConversionModule(), this.getConversionModule(), this.getConversionModule_Algorithms(), "conversionModule", null, 0, 1, CmAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmAlgorithm_Name(), theEcorePackage.getEString(), "name", "", 0, 1, CmAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmAlgorithm_MethodType(), this.getCmMethodType(), "methodType", null, 0, 1, CmAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmAlgorithm_Params(), theEcorePackage.getEString(), "params", "", 0, 1, CmAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmAlgorithm_IsExport(), theEcorePackage.getEBooleanObject(), "isExport", "false", 0, 1, CmAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmAlgorithm_Body(), theEcorePackage.getEString(), "body", "", 0, 1, CmAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmAlgorithm_Prefix(), theEcorePackage.getEString(), "prefix", null, 0, 1, CmAlgorithm.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmAlgorithm_Suffix(), theEcorePackage.getEString(), "suffix", null, 0, 1, CmAlgorithm.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmAlgorithm__GetAlgorithmText(), theEcorePackage.getEString(), "getAlgorithmText", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(cmSelectionVariantEEnum, CmSelectionVariant.class, "CmSelectionVariant"); //$NON-NLS-1$
		addEEnumLiteral(cmSelectionVariantEEnum, CmSelectionVariant.STANDART);
		addEEnumLiteral(cmSelectionVariantEEnum, CmSelectionVariant.CUSTOM);

		initEEnum(cmIdentificationVariantEEnum, CmIdentificationVariant.class, "CmIdentificationVariant"); //$NON-NLS-1$
		addEEnumLiteral(cmIdentificationVariantEEnum, CmIdentificationVariant.UUID);
		addEEnumLiteral(cmIdentificationVariantEEnum, CmIdentificationVariant.SEARCH_FIELDS);
		addEEnumLiteral(cmIdentificationVariantEEnum, CmIdentificationVariant.UUID_THEN_SERACH_FIELDS);

		initEEnum(cmMethodTypeEEnum, CmMethodType.class, "CmMethodType"); //$NON-NLS-1$
		addEEnumLiteral(cmMethodTypeEEnum, CmMethodType.PROCEDURE);
		addEEnumLiteral(cmMethodTypeEEnum, CmMethodType.FUNCTION);

		// Create resource
		createResource(eNS_URI);
	}

} //CmPackageImpl
