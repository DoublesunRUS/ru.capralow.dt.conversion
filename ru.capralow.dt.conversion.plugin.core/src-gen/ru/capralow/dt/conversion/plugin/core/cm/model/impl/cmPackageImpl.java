/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model.impl;

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

import ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmDataRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmGroup;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmIdentificationVariant;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObject;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmSelectionVariant;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmSpecialSubsystemType;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem;
import ru.capralow.dt.conversion.plugin.core.cm.model.ConversionModule;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmFactory;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class cmPackageImpl extends EPackageImpl implements cmPackage {
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
	private EClass cmObjectEClass = null;

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
	private EClass cmPredefinedMapEClass = null;

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
	private EClass cmSubsystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmGroupEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cmSpecialSubsystemTypeEEnum = null;

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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private cmPackageImpl() {
		super(eNS_URI, cmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link cmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static cmPackage init() {
		if (isInited) return (cmPackage)EPackage.Registry.INSTANCE.getEPackage(cmPackage.eNS_URI);

		// Obtain or create and register package
		cmPackageImpl thecmPackage = (cmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof cmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new cmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MdClassPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		McorePackage.eINSTANCE.eClass();
		CommonPackage.eINSTANCE.eClass();
		BslPackage.eINSTANCE.eClass();
		MdTypePackage.eINSTANCE.eClass();
		DbViewPackage.eINSTANCE.eClass();
		XdtoPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thecmPackage.createPackageContents();

		// Initialize created meta-data
		thecmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thecmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(cmPackage.eNS_URI, thecmPackage);
		return thecmPackage;
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
	public EReference getConversionModule_Subsystems() {
		return (EReference)conversionModuleEClass.getEStructuralFeatures().get(1);
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
	public EOperation getConversionModule__GetSubsystem__Subsystem() {
		return conversionModuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetBeforeConvertationEventText() {
		return conversionModuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetAfterConvertationEventText() {
		return conversionModuleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetBeforeFillingEventText() {
		return conversionModuleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetDataRule__String() {
		return conversionModuleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetSendingDataRules() {
		return conversionModuleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetSendingDataRules__CmSubsystem() {
		return conversionModuleEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetReceivingDataRules() {
		return conversionModuleEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetReceivingDataRules__CmSubsystem() {
		return conversionModuleEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetObjectRule__String() {
		return conversionModuleEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetSendingObjectRules() {
		return conversionModuleEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetSendingObjectRules__CmSubsystem() {
		return conversionModuleEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetReceivingObjectRules() {
		return conversionModuleEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetReceivingObjectRules__CmSubsystem() {
		return conversionModuleEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetAlgorithm__String() {
		return conversionModuleEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversionModule__GetAllAlgorithmsText__String() {
		return conversionModuleEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmObject() {
		return cmObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObject_Name() {
		return (EAttribute)cmObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmObject_ConfigurationObject() {
		return (EReference)cmObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObject_ConfigurationObjectName() {
		return (EAttribute)cmObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObject_ConfigurationObjectFormattedName() {
		return (EAttribute)cmObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObject_FormatObject() {
		return (EAttribute)cmObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObject_ForSending() {
		return (EAttribute)cmObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObject_ForReceiving() {
		return (EAttribute)cmObjectEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getCmDataRule_IsDisabled() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_SelectionVariant() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_OnProcessingEvent() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_OnProcessingEventPrefix() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_OnProcessingEventSuffix() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_DataSelectionEvent() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_DataSelectionEventPrefix() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_DataSelectionEventSuffix() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmDataRule_IsDataCleaning() {
		return (EAttribute)cmDataRuleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmDataRule_ObjectRules() {
		return (EReference)cmDataRuleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmDataRule_Subsystems() {
		return (EReference)cmDataRuleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmDataRule_Group() {
		return (EReference)cmDataRuleEClass.getEStructuralFeatures().get(11);
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
	public EOperation getCmDataRule__IncludedInSubsystem__CmSubsystem() {
		return cmDataRuleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCmDataRule__ToString() {
		return cmDataRuleEClass.getEOperations().get(6);
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
	public EAttribute getCmObjectRule_IsDisabled() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_ForGroup() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmObjectRule_AttributeRules() {
		return (EReference)cmObjectRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_OnSendingEvent() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_OnSendingEventPrefix() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_OnSendingEventSuffix() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_BeforeReceivingEvent() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_BeforeReceivingEventPrefix() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_BeforeReceivingEventSuffix() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_OnReceivingEvent() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_OnReceivingEventPrefix() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_OnReceivingEventSuffix() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmObjectRule_AfterReceivingAlgorithm() {
		return (EReference)cmObjectRuleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_IdentificationVariant() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmObjectRule_IdentificationFields() {
		return (EAttribute)cmObjectRuleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmObjectRule_Subsystems() {
		return (EReference)cmObjectRuleEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCmObjectRule__GetForGroupDeclaration() {
		return cmObjectRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCmObjectRule__GetOnSendingEventText() {
		return cmObjectRuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCmObjectRule__GetOnSendingEventDeclaration() {
		return cmObjectRuleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCmObjectRule__GetBeforeReceivingEventText() {
		return cmObjectRuleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCmObjectRule__GetOnReceivingEventText() {
		return cmObjectRuleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCmObjectRule__IncludedInSubsystem__CmSubsystem() {
		return cmObjectRuleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCmObjectRule__ToString() {
		return cmObjectRuleEClass.getEOperations().get(6);
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
	public EAttribute getCmAttributeRule_ConfigurationTabularSection() {
		return (EAttribute)cmAttributeRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmAttributeRule_ConfigurationAttribute() {
		return (EAttribute)cmAttributeRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmAttributeRule_FormatTabularSection() {
		return (EAttribute)cmAttributeRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmAttributeRule_FormatAttribute() {
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
	public EOperation getCmAttributeRule__GetConfigurationAttributeFullName() {
		return cmAttributeRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCmAttributeRule__GetFormatAttributeFullName() {
		return cmAttributeRuleEClass.getEOperations().get(1);
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
	public EReference getCmPredefined_PredefinedMaps() {
		return (EReference)cmPredefinedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCmPredefined__PredefinedMapExists__String_String() {
		return cmPredefinedEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCmPredefined__ToString() {
		return cmPredefinedEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmPredefinedMap() {
		return cmPredefinedMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmPredefinedMap_ConfigurationValue() {
		return (EAttribute)cmPredefinedMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmPredefinedMap_FormatValue() {
		return (EAttribute)cmPredefinedMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCmPredefinedMap__GetConfigurationValueName() {
		return cmPredefinedMapEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCmPredefinedMap__GetFormatValueName() {
		return cmPredefinedMapEClass.getEOperations().get(1);
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
	public EAttribute getCmAlgorithm_Name() {
		return (EAttribute)cmAlgorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmAlgorithm_MethodType() {
		return (EAttribute)cmAlgorithmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmAlgorithm_Params() {
		return (EAttribute)cmAlgorithmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmAlgorithm_IsExport() {
		return (EAttribute)cmAlgorithmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmAlgorithm_Body() {
		return (EAttribute)cmAlgorithmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmAlgorithm_Prefix() {
		return (EAttribute)cmAlgorithmEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmAlgorithm_Suffix() {
		return (EAttribute)cmAlgorithmEClass.getEStructuralFeatures().get(6);
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
	public EOperation getCmAlgorithm__ToString() {
		return cmAlgorithmEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmSubsystem() {
		return cmSubsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmSubsystem_Subsystem() {
		return (EReference)cmSubsystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmSubsystem_Name() {
		return (EAttribute)cmSubsystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmSubsystem_SpecialSubsystemType() {
		return (EAttribute)cmSubsystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmGroup() {
		return cmGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmGroup_Name() {
		return (EAttribute)cmGroupEClass.getEStructuralFeatures().get(0);
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
	public EEnum getCmSpecialSubsystemType() {
		return cmSpecialSubsystemTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cmFactory getcmFactory() {
		return (cmFactory)getEFactoryInstance();
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
		createEReference(conversionModuleEClass, CONVERSION_MODULE__SUBSYSTEMS);
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
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_SUBSYSTEM__SUBSYSTEM);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_BEFORE_CONVERTATION_EVENT_TEXT);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_AFTER_CONVERTATION_EVENT_TEXT);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_BEFORE_FILLING_EVENT_TEXT);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_DATA_RULE__STRING);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_SENDING_DATA_RULES);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_SENDING_DATA_RULES__CMSUBSYSTEM);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_RECEIVING_DATA_RULES);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_RECEIVING_DATA_RULES__CMSUBSYSTEM);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_OBJECT_RULE__STRING);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_SENDING_OBJECT_RULES);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_SENDING_OBJECT_RULES__CMSUBSYSTEM);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_RECEIVING_OBJECT_RULES);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_RECEIVING_OBJECT_RULES__CMSUBSYSTEM);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_ALGORITHM__STRING);
		createEOperation(conversionModuleEClass, CONVERSION_MODULE___GET_ALL_ALGORITHMS_TEXT__STRING);

		cmObjectEClass = createEClass(CM_OBJECT);
		createEAttribute(cmObjectEClass, CM_OBJECT__NAME);
		createEReference(cmObjectEClass, CM_OBJECT__CONFIGURATION_OBJECT);
		createEAttribute(cmObjectEClass, CM_OBJECT__CONFIGURATION_OBJECT_NAME);
		createEAttribute(cmObjectEClass, CM_OBJECT__CONFIGURATION_OBJECT_FORMATTED_NAME);
		createEAttribute(cmObjectEClass, CM_OBJECT__FORMAT_OBJECT);
		createEAttribute(cmObjectEClass, CM_OBJECT__FOR_SENDING);
		createEAttribute(cmObjectEClass, CM_OBJECT__FOR_RECEIVING);

		cmDataRuleEClass = createEClass(CM_DATA_RULE);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__IS_DISABLED);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__SELECTION_VARIANT);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__ON_PROCESSING_EVENT);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__ON_PROCESSING_EVENT_PREFIX);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__ON_PROCESSING_EVENT_SUFFIX);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__DATA_SELECTION_EVENT);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__DATA_SELECTION_EVENT_PREFIX);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__DATA_SELECTION_EVENT_SUFFIX);
		createEAttribute(cmDataRuleEClass, CM_DATA_RULE__IS_DATA_CLEANING);
		createEReference(cmDataRuleEClass, CM_DATA_RULE__OBJECT_RULES);
		createEReference(cmDataRuleEClass, CM_DATA_RULE__SUBSYSTEMS);
		createEReference(cmDataRuleEClass, CM_DATA_RULE__GROUP);
		createEOperation(cmDataRuleEClass, CM_DATA_RULE___GET_ON_PROCESSING_EVENT_TEXT);
		createEOperation(cmDataRuleEClass, CM_DATA_RULE___GET_ON_PROCESSING_EVENT_DECLARATION);
		createEOperation(cmDataRuleEClass, CM_DATA_RULE___GET_DATA_SELECTION_EVENT_TEXT);
		createEOperation(cmDataRuleEClass, CM_DATA_RULE___GET_DATA_SELECTION_EVENT_DECLARATION);
		createEOperation(cmDataRuleEClass, CM_DATA_RULE___GET_DATA_CLEANING_DECLARATION);
		createEOperation(cmDataRuleEClass, CM_DATA_RULE___INCLUDED_IN_SUBSYSTEM__CMSUBSYSTEM);
		createEOperation(cmDataRuleEClass, CM_DATA_RULE___TO_STRING);

		cmObjectRuleEClass = createEClass(CM_OBJECT_RULE);
		createEAttribute(cmObjectRuleEClass, CM_OBJECT_RULE__IS_DISABLED);
		createEAttribute(cmObjectRuleEClass, CM_OBJECT_RULE__FOR_GROUP);
		createEReference(cmObjectRuleEClass, CM_OBJECT_RULE__ATTRIBUTE_RULES);
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
		createEAttribute(cmObjectRuleEClass, CM_OBJECT_RULE__IDENTIFICATION_VARIANT);
		createEAttribute(cmObjectRuleEClass, CM_OBJECT_RULE__IDENTIFICATION_FIELDS);
		createEReference(cmObjectRuleEClass, CM_OBJECT_RULE__SUBSYSTEMS);
		createEOperation(cmObjectRuleEClass, CM_OBJECT_RULE___GET_FOR_GROUP_DECLARATION);
		createEOperation(cmObjectRuleEClass, CM_OBJECT_RULE___GET_ON_SENDING_EVENT_TEXT);
		createEOperation(cmObjectRuleEClass, CM_OBJECT_RULE___GET_ON_SENDING_EVENT_DECLARATION);
		createEOperation(cmObjectRuleEClass, CM_OBJECT_RULE___GET_BEFORE_RECEIVING_EVENT_TEXT);
		createEOperation(cmObjectRuleEClass, CM_OBJECT_RULE___GET_ON_RECEIVING_EVENT_TEXT);
		createEOperation(cmObjectRuleEClass, CM_OBJECT_RULE___INCLUDED_IN_SUBSYSTEM__CMSUBSYSTEM);
		createEOperation(cmObjectRuleEClass, CM_OBJECT_RULE___TO_STRING);

		cmAttributeRuleEClass = createEClass(CM_ATTRIBUTE_RULE);
		createEAttribute(cmAttributeRuleEClass, CM_ATTRIBUTE_RULE__CONFIGURATION_TABULAR_SECTION);
		createEAttribute(cmAttributeRuleEClass, CM_ATTRIBUTE_RULE__CONFIGURATION_ATTRIBUTE);
		createEAttribute(cmAttributeRuleEClass, CM_ATTRIBUTE_RULE__FORMAT_TABULAR_SECTION);
		createEAttribute(cmAttributeRuleEClass, CM_ATTRIBUTE_RULE__FORMAT_ATTRIBUTE);
		createEReference(cmAttributeRuleEClass, CM_ATTRIBUTE_RULE__OBJECT_RULE);
		createEAttribute(cmAttributeRuleEClass, CM_ATTRIBUTE_RULE__IS_CUSTOM_RULE);
		createEOperation(cmAttributeRuleEClass, CM_ATTRIBUTE_RULE___GET_CONFIGURATION_ATTRIBUTE_FULL_NAME);
		createEOperation(cmAttributeRuleEClass, CM_ATTRIBUTE_RULE___GET_FORMAT_ATTRIBUTE_FULL_NAME);

		cmPredefinedEClass = createEClass(CM_PREDEFINED);
		createEReference(cmPredefinedEClass, CM_PREDEFINED__PREDEFINED_MAPS);
		createEOperation(cmPredefinedEClass, CM_PREDEFINED___PREDEFINED_MAP_EXISTS__STRING_STRING);
		createEOperation(cmPredefinedEClass, CM_PREDEFINED___TO_STRING);

		cmPredefinedMapEClass = createEClass(CM_PREDEFINED_MAP);
		createEAttribute(cmPredefinedMapEClass, CM_PREDEFINED_MAP__CONFIGURATION_VALUE);
		createEAttribute(cmPredefinedMapEClass, CM_PREDEFINED_MAP__FORMAT_VALUE);
		createEOperation(cmPredefinedMapEClass, CM_PREDEFINED_MAP___GET_CONFIGURATION_VALUE_NAME);
		createEOperation(cmPredefinedMapEClass, CM_PREDEFINED_MAP___GET_FORMAT_VALUE_NAME);

		cmAlgorithmEClass = createEClass(CM_ALGORITHM);
		createEAttribute(cmAlgorithmEClass, CM_ALGORITHM__NAME);
		createEAttribute(cmAlgorithmEClass, CM_ALGORITHM__METHOD_TYPE);
		createEAttribute(cmAlgorithmEClass, CM_ALGORITHM__PARAMS);
		createEAttribute(cmAlgorithmEClass, CM_ALGORITHM__IS_EXPORT);
		createEAttribute(cmAlgorithmEClass, CM_ALGORITHM__BODY);
		createEAttribute(cmAlgorithmEClass, CM_ALGORITHM__PREFIX);
		createEAttribute(cmAlgorithmEClass, CM_ALGORITHM__SUFFIX);
		createEOperation(cmAlgorithmEClass, CM_ALGORITHM___GET_ALGORITHM_TEXT);
		createEOperation(cmAlgorithmEClass, CM_ALGORITHM___TO_STRING);

		cmSubsystemEClass = createEClass(CM_SUBSYSTEM);
		createEReference(cmSubsystemEClass, CM_SUBSYSTEM__SUBSYSTEM);
		createEAttribute(cmSubsystemEClass, CM_SUBSYSTEM__NAME);
		createEAttribute(cmSubsystemEClass, CM_SUBSYSTEM__SPECIAL_SUBSYSTEM_TYPE);

		cmGroupEClass = createEClass(CM_GROUP);
		createEAttribute(cmGroupEClass, CM_GROUP__NAME);

		// Create enums
		cmSelectionVariantEEnum = createEEnum(CM_SELECTION_VARIANT);
		cmIdentificationVariantEEnum = createEEnum(CM_IDENTIFICATION_VARIANT);
		cmMethodTypeEEnum = createEEnum(CM_METHOD_TYPE);
		cmSpecialSubsystemTypeEEnum = createEEnum(CM_SPECIAL_SUBSYSTEM_TYPE);
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
		cmDataRuleEClass.getESuperTypes().add(this.getCmObject());
		cmObjectRuleEClass.getESuperTypes().add(this.getCmObject());
		cmPredefinedEClass.getESuperTypes().add(this.getCmObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(conversionModuleEClass, ConversionModule.class, "ConversionModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getConversionModule_StoreVersion(), theEcorePackage.getEString(), "storeVersion", "1", 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getConversionModule_Subsystems(), this.getCmSubsystem(), null, "subsystems", null, 0, -1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getConversionModule_Params(), theEcorePackage.getEString(), "params", "", 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getConversionModule_BeforeConvertationEvent(), theEcorePackage.getEString(), "beforeConvertationEvent", "", 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getConversionModule_BeforeConvertationEventPrefix(), theEcorePackage.getEString(), "beforeConvertationEventPrefix", "\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u041f\u0435\u0440\u0435\u0434\u041a\u043e\u043d\u0432\u0435\u0440\u0442\u0430\u0446\u0438\u0435\u0439(\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b\u041e\u0431\u043c\u0435\u043d\u0430) \u042d\u043a\u0441\u043f\u043e\u0440\u0442", 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getConversionModule_BeforeConvertationEventSuffix(), theEcorePackage.getEString(), "beforeConvertationEventSuffix", "\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b", 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getConversionModule_AfterConvertationEvent(), theEcorePackage.getEString(), "afterConvertationEvent", "", 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getConversionModule_AfterConvertationEventPrefix(), theEcorePackage.getEString(), "afterConvertationEventPrefix", "\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u041f\u043e\u0441\u043b\u0435\u041a\u043e\u043d\u0432\u0435\u0440\u0442\u0430\u0446\u0438\u0438(\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b\u041e\u0431\u043c\u0435\u043d\u0430) \u042d\u043a\u0441\u043f\u043e\u0440\u0442", 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getConversionModule_AfterConvertationEventSuffix(), theEcorePackage.getEString(), "afterConvertationEventSuffix", "\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b", 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getConversionModule_BeforeFillingEvent(), theEcorePackage.getEString(), "beforeFillingEvent", "", 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getConversionModule_BeforeFillingEventPrefix(), theEcorePackage.getEString(), "beforeFillingEventPrefix", "\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u0430 \u041f\u0435\u0440\u0435\u0434\u041e\u0442\u043b\u043e\u0436\u0435\u043d\u043d\u044b\u043c\u0417\u0430\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435\u043c(\u041a\u043e\u043c\u043f\u043e\u043d\u0435\u043d\u0442\u044b\u041e\u0431\u043c\u0435\u043d\u0430) \u042d\u043a\u0441\u043f\u043e\u0440\u0442", 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getConversionModule_BeforeFillingEventSuffix(), theEcorePackage.getEString(), "beforeFillingEventSuffix", "\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b", 0, 1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getConversionModule_DataRules(), this.getCmDataRule(), null, "dataRules", null, 0, -1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConversionModule_ObjectRules(), this.getCmObjectRule(), null, "objectRules", null, 0, -1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConversionModule_Predefineds(), this.getCmPredefined(), null, "predefineds", null, 0, -1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getConversionModule_Algorithms(), this.getCmAlgorithm(), null, "algorithms", null, 0, -1, ConversionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		EOperation op = initEOperation(getConversionModule__GetSubsystem__Subsystem(), this.getCmSubsystem(), "getSubsystem", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theMdClassPackage.getSubsystem(), "mdSubsystem", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getConversionModule__GetBeforeConvertationEventText(), theEcorePackage.getEString(), "getBeforeConvertationEventText", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getConversionModule__GetAfterConvertationEventText(), theEcorePackage.getEString(), "getAfterConvertationEventText", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getConversionModule__GetBeforeFillingEventText(), theEcorePackage.getEString(), "getBeforeFillingEventText", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getConversionModule__GetDataRule__String(), this.getCmDataRule(), "getDataRule", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "ruleName", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getConversionModule__GetSendingDataRules(), this.getCmDataRule(), "getSendingDataRules", 0, -1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getConversionModule__GetSendingDataRules__CmSubsystem(), this.getCmDataRule(), "getSendingDataRules", 0, -1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getCmSubsystem(), "subsystem", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getConversionModule__GetReceivingDataRules(), this.getCmDataRule(), "getReceivingDataRules", 0, -1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getConversionModule__GetReceivingDataRules__CmSubsystem(), this.getCmDataRule(), "getReceivingDataRules", 0, -1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getCmSubsystem(), "subsystem", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getConversionModule__GetObjectRule__String(), this.getCmObjectRule(), "getObjectRule", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "ruleName", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getConversionModule__GetSendingObjectRules(), this.getCmObjectRule(), "getSendingObjectRules", 0, -1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getConversionModule__GetSendingObjectRules__CmSubsystem(), this.getCmObjectRule(), "getSendingObjectRules", 0, -1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getCmSubsystem(), "cmSubsystem", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getConversionModule__GetReceivingObjectRules(), this.getCmObjectRule(), "getReceivingObjectRules", 0, -1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getConversionModule__GetReceivingObjectRules__CmSubsystem(), this.getCmObjectRule(), "getReceivingObjectRules", 0, -1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getCmSubsystem(), "cmSubsystem", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getConversionModule__GetAlgorithm__String(), this.getCmAlgorithm(), "getAlgorithm", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "algorithmName", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getConversionModule__GetAllAlgorithmsText__String(), theEcorePackage.getEString(), "getAllAlgorithmsText", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "algorithmName", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(cmObjectEClass, CmObject.class, "CmObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCmObject_Name(), theEcorePackage.getEString(), "name", "", 0, 1, CmObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getCmObject_ConfigurationObject(), theMdClassPackage.getMdObject(), null, "configurationObject", null, 0, 1, CmObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmObject_ConfigurationObjectName(), theEcorePackage.getEString(), "configurationObjectName", "", 0, 1, CmObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmObject_ConfigurationObjectFormattedName(), theEcorePackage.getEString(), "configurationObjectFormattedName", null, 0, 1, CmObject.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmObject_FormatObject(), theEcorePackage.getEString(), "formatObject", "", 0, 1, CmObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmObject_ForSending(), theEcorePackage.getEBooleanObject(), "forSending", "false", 0, 1, CmObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmObject_ForReceiving(), theEcorePackage.getEBooleanObject(), "forReceiving", "false", 0, 1, CmObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(cmDataRuleEClass, CmDataRule.class, "CmDataRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCmDataRule_IsDisabled(), theEcorePackage.getEBooleanObject(), "isDisabled", "false", 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmDataRule_SelectionVariant(), this.getCmSelectionVariant(), "selectionVariant", null, 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmDataRule_OnProcessingEvent(), theEcorePackage.getEString(), "onProcessingEvent", "", 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmDataRule_OnProcessingEventPrefix(), theEcorePackage.getEString(), "onProcessingEventPrefix", null, 0, 1, CmDataRule.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmDataRule_OnProcessingEventSuffix(), theEcorePackage.getEString(), "onProcessingEventSuffix", "\u041a\u043e\u043d\u0435\u0446\u041f\u0440\u043e\u0446\u0435\u0434\u0443\u0440\u044b", 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmDataRule_DataSelectionEvent(), theEcorePackage.getEString(), "dataSelectionEvent", "", 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmDataRule_DataSelectionEventPrefix(), theEcorePackage.getEString(), "dataSelectionEventPrefix", null, 0, 1, CmDataRule.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmDataRule_DataSelectionEventSuffix(), theEcorePackage.getEString(), "dataSelectionEventSuffix", "\u041a\u043e\u043d\u0435\u0446\u0424\u0443\u043d\u043a\u0446\u0438\u0438", 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmDataRule_IsDataCleaning(), theEcorePackage.getEBooleanObject(), "isDataCleaning", "false", 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getCmDataRule_ObjectRules(), this.getCmObjectRule(), null, "objectRules", null, 0, -1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCmDataRule_Subsystems(), this.getCmSubsystem(), null, "subsystems", null, 0, -1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCmDataRule_Group(), this.getCmGroup(), null, "group", null, 0, 1, CmDataRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmDataRule__GetOnProcessingEventText(), theEcorePackage.getEString(), "getOnProcessingEventText", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmDataRule__GetOnProcessingEventDeclaration(), theEcorePackage.getEString(), "getOnProcessingEventDeclaration", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmDataRule__GetDataSelectionEventText(), theEcorePackage.getEString(), "getDataSelectionEventText", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmDataRule__GetDataSelectionEventDeclaration(), theEcorePackage.getEString(), "getDataSelectionEventDeclaration", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmDataRule__GetDataCleaningDeclaration(), theEcorePackage.getEString(), "getDataCleaningDeclaration", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getCmDataRule__IncludedInSubsystem__CmSubsystem(), theEcorePackage.getEBooleanObject(), "includedInSubsystem", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getCmSubsystem(), "cmSubsystem", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmDataRule__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(cmObjectRuleEClass, CmObjectRule.class, "CmObjectRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCmObjectRule_IsDisabled(), theEcorePackage.getEBooleanObject(), "isDisabled", "false", 0, 1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmObjectRule_ForGroup(), theEcorePackage.getEBooleanObject(), "forGroup", "false", 0, 1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getCmObjectRule_AttributeRules(), this.getCmAttributeRule(), null, "attributeRules", null, 0, -1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
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
		initEAttribute(getCmObjectRule_IdentificationVariant(), this.getCmIdentificationVariant(), "identificationVariant", null, 0, 1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmObjectRule_IdentificationFields(), theEcorePackage.getEString(), "identificationFields", null, 0, -1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCmObjectRule_Subsystems(), this.getCmSubsystem(), null, "subsystems", null, 0, -1, CmObjectRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmObjectRule__GetForGroupDeclaration(), theEcorePackage.getEString(), "getForGroupDeclaration", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmObjectRule__GetOnSendingEventText(), theEcorePackage.getEString(), "getOnSendingEventText", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmObjectRule__GetOnSendingEventDeclaration(), theEcorePackage.getEString(), "getOnSendingEventDeclaration", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmObjectRule__GetBeforeReceivingEventText(), theEcorePackage.getEString(), "getBeforeReceivingEventText", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmObjectRule__GetOnReceivingEventText(), theEcorePackage.getEString(), "getOnReceivingEventText", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getCmObjectRule__IncludedInSubsystem__CmSubsystem(), theEcorePackage.getEBooleanObject(), "includedInSubsystem", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getCmSubsystem(), "cmSubsystem", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmObjectRule__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(cmAttributeRuleEClass, CmAttributeRule.class, "CmAttributeRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCmAttributeRule_ConfigurationTabularSection(), theEcorePackage.getEString(), "configurationTabularSection", "", 0, 1, CmAttributeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmAttributeRule_ConfigurationAttribute(), theEcorePackage.getEString(), "configurationAttribute", "", 0, 1, CmAttributeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmAttributeRule_FormatTabularSection(), theEcorePackage.getEString(), "formatTabularSection", "", 0, 1, CmAttributeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmAttributeRule_FormatAttribute(), theEcorePackage.getEString(), "formatAttribute", "", 0, 1, CmAttributeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getCmAttributeRule_ObjectRule(), this.getCmObjectRule(), null, "objectRule", null, 0, 1, CmAttributeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmAttributeRule_IsCustomRule(), theEcorePackage.getEBooleanObject(), "isCustomRule", "false", 0, 1, CmAttributeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEOperation(getCmAttributeRule__GetConfigurationAttributeFullName(), theEcorePackage.getEString(), "getConfigurationAttributeFullName", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmAttributeRule__GetFormatAttributeFullName(), theEcorePackage.getEString(), "getFormatAttributeFullName", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(cmPredefinedEClass, CmPredefined.class, "CmPredefined", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCmPredefined_PredefinedMaps(), this.getCmPredefinedMap(), null, "predefinedMaps", null, 0, -1, CmPredefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getCmPredefined__PredefinedMapExists__String_String(), theEcorePackage.getEBooleanObject(), "predefinedMapExists", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "configurationValue", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "formatValue", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmPredefined__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(cmPredefinedMapEClass, CmPredefinedMap.class, "CmPredefinedMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCmPredefinedMap_ConfigurationValue(), theEcorePackage.getEString(), "configurationValue", null, 0, 1, CmPredefinedMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmPredefinedMap_FormatValue(), theEcorePackage.getEString(), "formatValue", null, 0, 1, CmPredefinedMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmPredefinedMap__GetConfigurationValueName(), theEcorePackage.getEString(), "getConfigurationValueName", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmPredefinedMap__GetFormatValueName(), theEcorePackage.getEString(), "getFormatValueName", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(cmAlgorithmEClass, CmAlgorithm.class, "CmAlgorithm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCmAlgorithm_Name(), theEcorePackage.getEString(), "name", "", 0, 1, CmAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmAlgorithm_MethodType(), this.getCmMethodType(), "methodType", null, 0, 1, CmAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmAlgorithm_Params(), theEcorePackage.getEString(), "params", "", 0, 1, CmAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmAlgorithm_IsExport(), theEcorePackage.getEBooleanObject(), "isExport", "false", 0, 1, CmAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmAlgorithm_Body(), theEcorePackage.getEString(), "body", "", 0, 1, CmAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getCmAlgorithm_Prefix(), theEcorePackage.getEString(), "prefix", null, 0, 1, CmAlgorithm.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmAlgorithm_Suffix(), theEcorePackage.getEString(), "suffix", null, 0, 1, CmAlgorithm.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmAlgorithm__GetAlgorithmText(), theEcorePackage.getEString(), "getAlgorithmText", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getCmAlgorithm__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(cmSubsystemEClass, CmSubsystem.class, "CmSubsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCmSubsystem_Subsystem(), theMdClassPackage.getSubsystem(), null, "subsystem", null, 0, 1, CmSubsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmSubsystem_Name(), theEcorePackage.getEString(), "name", null, 0, 1, CmSubsystem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getCmSubsystem_SpecialSubsystemType(), this.getCmSpecialSubsystemType(), "specialSubsystemType", null, 0, 1, CmSubsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(cmGroupEClass, CmGroup.class, "CmGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCmGroup_Name(), theEcorePackage.getEString(), "name", null, 0, 1, CmGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(cmSelectionVariantEEnum, CmSelectionVariant.class, "CmSelectionVariant"); //$NON-NLS-1$
		addEEnumLiteral(cmSelectionVariantEEnum, CmSelectionVariant.STANDART);
		addEEnumLiteral(cmSelectionVariantEEnum, CmSelectionVariant.CUSTOM);

		initEEnum(cmIdentificationVariantEEnum, CmIdentificationVariant.class, "CmIdentificationVariant"); //$NON-NLS-1$
		addEEnumLiteral(cmIdentificationVariantEEnum, CmIdentificationVariant.UUID);
		addEEnumLiteral(cmIdentificationVariantEEnum, CmIdentificationVariant.SEARCH_FIELDS);
		addEEnumLiteral(cmIdentificationVariantEEnum, CmIdentificationVariant.UUID_THEN_SEARCH_FIELDS);

		initEEnum(cmMethodTypeEEnum, CmMethodType.class, "CmMethodType"); //$NON-NLS-1$
		addEEnumLiteral(cmMethodTypeEEnum, CmMethodType.PROCEDURE);
		addEEnumLiteral(cmMethodTypeEEnum, CmMethodType.FUNCTION);

		initEEnum(cmSpecialSubsystemTypeEEnum, CmSpecialSubsystemType.class, "CmSpecialSubsystemType"); //$NON-NLS-1$
		addEEnumLiteral(cmSpecialSubsystemTypeEEnum, CmSpecialSubsystemType.SUBSYSTEM);
		addEEnumLiteral(cmSpecialSubsystemTypeEEnum, CmSpecialSubsystemType.ALL);
		addEEnumLiteral(cmSpecialSubsystemTypeEEnum, CmSpecialSubsystemType.MAIN);
		addEEnumLiteral(cmSpecialSubsystemTypeEEnum, CmSpecialSubsystemType.EMPTY);

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

} //cmPackageImpl
