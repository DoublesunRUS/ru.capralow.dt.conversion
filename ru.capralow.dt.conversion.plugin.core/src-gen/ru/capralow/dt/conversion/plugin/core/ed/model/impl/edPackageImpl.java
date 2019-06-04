/**
 */
package ru.capralow.dt.conversion.plugin.core.ed.model.impl;

import com._1c.g5.v8.dt.bsl.model.BslPackage;

import com._1c.g5.v8.dt.mcore.McorePackage;

import com._1c.g5.v8.dt.metadata.common.CommonPackage;

import com._1c.g5.v8.dt.metadata.dbview.DbViewPackage;

import com._1c.g5.v8.dt.metadata.mdclass.MdClassPackage;

import com._1c.g5.v8.dt.metadata.mdtype.MdTypePackage;

import com._1c.g5.v8.dt.xdto.model.XdtoPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ru.capralow.dt.conversion.plugin.core.ed.model.EdDefinedType;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdObject;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdType;
import ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData;
import ru.capralow.dt.conversion.plugin.core.ed.model.edFactory;
import ru.capralow.dt.conversion.plugin.core.ed.model.edPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class edPackageImpl extends EPackageImpl implements edPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enterpriseDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edDefinedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edEnumEClass = null;

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
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private edPackageImpl() {
		super(eNS_URI, edFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link edPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static edPackage init() {
		if (isInited) return (edPackage)EPackage.Registry.INSTANCE.getEPackage(edPackage.eNS_URI);

		// Obtain or create and register package
		Object registerededPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		edPackageImpl theedPackage = registerededPackage instanceof edPackageImpl ? (edPackageImpl)registerededPackage : new edPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		MdClassPackage.eINSTANCE.eClass();
		XdtoPackage.eINSTANCE.eClass();
		McorePackage.eINSTANCE.eClass();
		CommonPackage.eINSTANCE.eClass();
		BslPackage.eINSTANCE.eClass();
		MdTypePackage.eINSTANCE.eClass();
		DbViewPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theedPackage.createPackageContents();

		// Initialize created meta-data
		theedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theedPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(edPackage.eNS_URI, theedPackage);
		return theedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnterpriseData() {
		return enterpriseDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnterpriseData_Version() {
		return (EAttribute)enterpriseDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnterpriseData_XdtoPackage() {
		return (EReference)enterpriseDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnterpriseData_DefinedTypes() {
		return (EReference)enterpriseDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnterpriseData_RefTypes() {
		return (EReference)enterpriseDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnterpriseData_Catalogs() {
		return (EReference)enterpriseDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnterpriseData_Documents() {
		return (EReference)enterpriseDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnterpriseData_Enums() {
		return (EReference)enterpriseDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnterpriseData_Registers() {
		return (EReference)enterpriseDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnterpriseData_UnknownObjects() {
		return (EReference)enterpriseDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnterpriseData__GetProperty__String_String() {
		return enterpriseDataEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnterpriseData__GetObject__String() {
		return enterpriseDataEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnterpriseData__GetDefinedType__String() {
		return enterpriseDataEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnterpriseData__GetEnum__String() {
		return enterpriseDataEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdDefinedType() {
		return edDefinedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdDefinedType_Name() {
		return (EAttribute)edDefinedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdDefinedType_Types() {
		return (EReference)edDefinedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdType() {
		return edTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdType_Name() {
		return (EAttribute)edTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdType_PropertyType() {
		return (EAttribute)edTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdObject() {
		return edObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdObject_MainName() {
		return (EAttribute)edObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdObject_KeysName() {
		return (EAttribute)edObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdObject_XdtoMainObject() {
		return (EReference)edObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdObject_XdtoKeysObject() {
		return (EReference)edObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdObject_MainProperties() {
		return (EReference)edObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEdObject__GetProperty__String() {
		return edObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEdObject__GetKeyProperties() {
		return edObjectEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdProperty() {
		return edPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdProperty_Name() {
		return (EAttribute)edPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdProperty_XdtoProperty() {
		return (EReference)edPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdProperty_IsKey() {
		return (EAttribute)edPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdProperty_Type() {
		return (EAttribute)edPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdProperty_Required() {
		return (EAttribute)edPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdEnum() {
		return edEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdEnum_Object() {
		return (EReference)edEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdEnum_Name() {
		return (EAttribute)edEnumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdEnum_Enumerations() {
		return (EReference)edEnumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public edFactory getedFactory() {
		return (edFactory)getEFactoryInstance();
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
		enterpriseDataEClass = createEClass(ENTERPRISE_DATA);
		createEAttribute(enterpriseDataEClass, ENTERPRISE_DATA__VERSION);
		createEReference(enterpriseDataEClass, ENTERPRISE_DATA__XDTO_PACKAGE);
		createEReference(enterpriseDataEClass, ENTERPRISE_DATA__DEFINED_TYPES);
		createEReference(enterpriseDataEClass, ENTERPRISE_DATA__REF_TYPES);
		createEReference(enterpriseDataEClass, ENTERPRISE_DATA__CATALOGS);
		createEReference(enterpriseDataEClass, ENTERPRISE_DATA__DOCUMENTS);
		createEReference(enterpriseDataEClass, ENTERPRISE_DATA__ENUMS);
		createEReference(enterpriseDataEClass, ENTERPRISE_DATA__REGISTERS);
		createEReference(enterpriseDataEClass, ENTERPRISE_DATA__UNKNOWN_OBJECTS);
		createEOperation(enterpriseDataEClass, ENTERPRISE_DATA___GET_PROPERTY__STRING_STRING);
		createEOperation(enterpriseDataEClass, ENTERPRISE_DATA___GET_OBJECT__STRING);
		createEOperation(enterpriseDataEClass, ENTERPRISE_DATA___GET_DEFINED_TYPE__STRING);
		createEOperation(enterpriseDataEClass, ENTERPRISE_DATA___GET_ENUM__STRING);

		edDefinedTypeEClass = createEClass(ED_DEFINED_TYPE);
		createEAttribute(edDefinedTypeEClass, ED_DEFINED_TYPE__NAME);
		createEReference(edDefinedTypeEClass, ED_DEFINED_TYPE__TYPES);

		edTypeEClass = createEClass(ED_TYPE);
		createEAttribute(edTypeEClass, ED_TYPE__NAME);
		createEAttribute(edTypeEClass, ED_TYPE__PROPERTY_TYPE);

		edObjectEClass = createEClass(ED_OBJECT);
		createEAttribute(edObjectEClass, ED_OBJECT__MAIN_NAME);
		createEAttribute(edObjectEClass, ED_OBJECT__KEYS_NAME);
		createEReference(edObjectEClass, ED_OBJECT__XDTO_MAIN_OBJECT);
		createEReference(edObjectEClass, ED_OBJECT__XDTO_KEYS_OBJECT);
		createEReference(edObjectEClass, ED_OBJECT__MAIN_PROPERTIES);
		createEOperation(edObjectEClass, ED_OBJECT___GET_PROPERTY__STRING);
		createEOperation(edObjectEClass, ED_OBJECT___GET_KEY_PROPERTIES);

		edPropertyEClass = createEClass(ED_PROPERTY);
		createEAttribute(edPropertyEClass, ED_PROPERTY__NAME);
		createEReference(edPropertyEClass, ED_PROPERTY__XDTO_PROPERTY);
		createEAttribute(edPropertyEClass, ED_PROPERTY__IS_KEY);
		createEAttribute(edPropertyEClass, ED_PROPERTY__TYPE);
		createEAttribute(edPropertyEClass, ED_PROPERTY__REQUIRED);

		edEnumEClass = createEClass(ED_ENUM);
		createEReference(edEnumEClass, ED_ENUM__OBJECT);
		createEAttribute(edEnumEClass, ED_ENUM__NAME);
		createEReference(edEnumEClass, ED_ENUM__ENUMERATIONS);
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
		XdtoPackage theXdtoPackage = (XdtoPackage)EPackage.Registry.INSTANCE.getEPackage(XdtoPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(enterpriseDataEClass, EnterpriseData.class, "EnterpriseData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEnterpriseData_Version(), theEcorePackage.getEString(), "version", "", 0, 1, EnterpriseData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getEnterpriseData_XdtoPackage(), theMdClassPackage.getXDTOPackage(), null, "xdtoPackage", null, 0, 1, EnterpriseData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEnterpriseData_DefinedTypes(), this.getEdDefinedType(), null, "definedTypes", null, 0, -1, EnterpriseData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEnterpriseData_RefTypes(), this.getEdDefinedType(), null, "refTypes", null, 0, -1, EnterpriseData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEnterpriseData_Catalogs(), this.getEdObject(), null, "catalogs", null, 0, -1, EnterpriseData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEnterpriseData_Documents(), this.getEdObject(), null, "documents", null, 0, -1, EnterpriseData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEnterpriseData_Enums(), this.getEdEnum(), null, "enums", null, 0, -1, EnterpriseData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEnterpriseData_Registers(), this.getEdObject(), null, "registers", null, 0, -1, EnterpriseData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEnterpriseData_UnknownObjects(), this.getEdObject(), null, "unknownObjects", null, 0, -1, EnterpriseData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		EOperation op = initEOperation(getEnterpriseData__GetProperty__String_String(), this.getEdProperty(), "getProperty", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "objectName", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "propertyName", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getEnterpriseData__GetObject__String(), this.getEdObject(), "getObject", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getEnterpriseData__GetDefinedType__String(), this.getEdDefinedType(), "getDefinedType", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getEnterpriseData__GetEnum__String(), this.getEdEnum(), "getEnum", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(edDefinedTypeEClass, EdDefinedType.class, "EdDefinedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEdDefinedType_Name(), theEcorePackage.getEString(), "name", "", 0, 1, EdDefinedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getEdDefinedType_Types(), this.getEdType(), null, "types", null, 0, -1, EdDefinedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(edTypeEClass, EdType.class, "EdType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEdType_Name(), theEcorePackage.getEString(), "name", "", 0, 1, EdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getEdType_PropertyType(), theEcorePackage.getEString(), "propertyType", "", 0, 1, EdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(edObjectEClass, EdObject.class, "EdObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEdObject_MainName(), theEcorePackage.getEString(), "mainName", "", 0, 1, EdObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getEdObject_KeysName(), theEcorePackage.getEString(), "keysName", "", 0, 1, EdObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getEdObject_XdtoMainObject(), theXdtoPackage.getObjectType(), null, "xdtoMainObject", null, 0, 1, EdObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEdObject_XdtoKeysObject(), theXdtoPackage.getObjectType(), null, "xdtoKeysObject", null, 0, 1, EdObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEdObject_MainProperties(), this.getEdProperty(), null, "mainProperties", null, 0, -1, EdObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getEdObject__GetProperty__String(), this.getEdProperty(), "getProperty", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getEdObject__GetKeyProperties(), this.getEdProperty(), "getKeyProperties", 0, -1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(edPropertyEClass, EdProperty.class, "EdProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEdProperty_Name(), theEcorePackage.getEString(), "name", "", 0, 1, EdProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getEdProperty_XdtoProperty(), theXdtoPackage.getProperty(), null, "xdtoProperty", null, 0, 1, EdProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEdProperty_IsKey(), theEcorePackage.getEBooleanObject(), "isKey", "false", 0, 1, EdProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getEdProperty_Type(), theEcorePackage.getEString(), "type", "", 0, 1, EdProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getEdProperty_Required(), theEcorePackage.getEBooleanObject(), "required", "false", 0, 1, EdProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(edEnumEClass, EdEnum.class, "EdEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEdEnum_Object(), theXdtoPackage.getValueType(), null, "object", null, 0, 1, EdEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEdEnum_Name(), theEcorePackage.getEString(), "name", "", 0, 1, EdEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getEdEnum_Enumerations(), theXdtoPackage.getEnumeration(), null, "enumerations", null, 0, -1, EdEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //edPackageImpl
