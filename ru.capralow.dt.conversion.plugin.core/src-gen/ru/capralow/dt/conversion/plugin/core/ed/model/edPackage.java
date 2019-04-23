/**
 */
package ru.capralow.dt.conversion.plugin.core.ed.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel loadInitialization='false' literalsInterface='true' nonNLSMarkers='true' prefix='ed' updateClasspath='false' basePackage='ru.capralow.dt.conversion.plugin.core.ed'"
 * @generated
 */
public interface edPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ru.capralow.dt.conversion.plugin.core.ed.model"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ed"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	edPackage eINSTANCE = ru.capralow.dt.conversion.plugin.core.ed.model.impl.edPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EnterpriseDataImpl <em>Enterprise Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.EnterpriseDataImpl
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.edPackageImpl#getEnterpriseData()
	 * @generated
	 */
	int ENTERPRISE_DATA = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATA__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Xdto Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATA__XDTO_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Defined Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATA__DEFINED_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Ref Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATA__REF_TYPES = 3;

	/**
	 * The feature id for the '<em><b>Catalogs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATA__CATALOGS = 4;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATA__DOCUMENTS = 5;

	/**
	 * The feature id for the '<em><b>Enums</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATA__ENUMS = 6;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATA__REGISTERS = 7;

	/**
	 * The feature id for the '<em><b>Unknown Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATA__UNKNOWN_OBJECTS = 8;

	/**
	 * The number of structural features of the '<em>Enterprise Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATA_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATA___GET_PROPERTY__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Get Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATA___GET_OBJECT__STRING = 1;

	/**
	 * The operation id for the '<em>Get Defined Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATA___GET_DEFINED_TYPE__STRING = 2;

	/**
	 * The operation id for the '<em>Get Enum</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATA___GET_ENUM__STRING = 3;

	/**
	 * The number of operations of the '<em>Enterprise Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_DATA_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdDefinedTypeImpl <em>Ed Defined Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdDefinedTypeImpl
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.edPackageImpl#getEdDefinedType()
	 * @generated
	 */
	int ED_DEFINED_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_DEFINED_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_DEFINED_TYPE__TYPES = 1;

	/**
	 * The number of structural features of the '<em>Ed Defined Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_DEFINED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ed Defined Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_DEFINED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdTypeImpl <em>Ed Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdTypeImpl
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.edPackageImpl#getEdType()
	 * @generated
	 */
	int ED_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Property Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_TYPE__PROPERTY_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Ed Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ed Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdObjectImpl <em>Ed Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdObjectImpl
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.edPackageImpl#getEdObject()
	 * @generated
	 */
	int ED_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Main Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_OBJECT__MAIN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Keys Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_OBJECT__KEYS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Xdto Main Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_OBJECT__XDTO_MAIN_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Xdto Keys Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_OBJECT__XDTO_KEYS_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Main Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_OBJECT__MAIN_PROPERTIES = 4;

	/**
	 * The number of structural features of the '<em>Ed Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_OBJECT_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_OBJECT___GET_PROPERTY__STRING = 0;

	/**
	 * The operation id for the '<em>Get Key Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_OBJECT___GET_KEY_PROPERTIES = 1;

	/**
	 * The number of operations of the '<em>Ed Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_OBJECT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdPropertyImpl <em>Ed Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdPropertyImpl
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.edPackageImpl#getEdProperty()
	 * @generated
	 */
	int ED_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Xdto Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_PROPERTY__XDTO_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Is Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_PROPERTY__IS_KEY = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_PROPERTY__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_PROPERTY__REQUIRED = 4;

	/**
	 * The number of structural features of the '<em>Ed Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_PROPERTY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Ed Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdEnumImpl <em>Ed Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdEnumImpl
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.edPackageImpl#getEdEnum()
	 * @generated
	 */
	int ED_ENUM = 5;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_ENUM__OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_ENUM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Enumerations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_ENUM__ENUMERATIONS = 2;

	/**
	 * The number of structural features of the '<em>Ed Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_ENUM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ed Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED_ENUM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData <em>Enterprise Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enterprise Data</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData
	 * @generated
	 */
	EClass getEnterpriseData();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getVersion()
	 * @see #getEnterpriseData()
	 * @generated
	 */
	EAttribute getEnterpriseData_Version();

	/**
	 * Returns the meta object for the reference '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getXdtoPackage <em>Xdto Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xdto Package</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getXdtoPackage()
	 * @see #getEnterpriseData()
	 * @generated
	 */
	EReference getEnterpriseData_XdtoPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getDefinedTypes <em>Defined Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defined Types</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getDefinedTypes()
	 * @see #getEnterpriseData()
	 * @generated
	 */
	EReference getEnterpriseData_DefinedTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getRefTypes <em>Ref Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref Types</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getRefTypes()
	 * @see #getEnterpriseData()
	 * @generated
	 */
	EReference getEnterpriseData_RefTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getCatalogs <em>Catalogs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catalogs</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getCatalogs()
	 * @see #getEnterpriseData()
	 * @generated
	 */
	EReference getEnterpriseData_Catalogs();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documents</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getDocuments()
	 * @see #getEnterpriseData()
	 * @generated
	 */
	EReference getEnterpriseData_Documents();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getEnums <em>Enums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enums</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getEnums()
	 * @see #getEnterpriseData()
	 * @generated
	 */
	EReference getEnterpriseData_Enums();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getRegisters <em>Registers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registers</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getRegisters()
	 * @see #getEnterpriseData()
	 * @generated
	 */
	EReference getEnterpriseData_Registers();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getUnknownObjects <em>Unknown Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unknown Objects</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getUnknownObjects()
	 * @see #getEnterpriseData()
	 * @generated
	 */
	EReference getEnterpriseData_UnknownObjects();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getProperty(java.lang.String, java.lang.String) <em>Get Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Property</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getProperty(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getEnterpriseData__GetProperty__String_String();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getObject(java.lang.String) <em>Get Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Object</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getObject(java.lang.String)
	 * @generated
	 */
	EOperation getEnterpriseData__GetObject__String();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getDefinedType(java.lang.String) <em>Get Defined Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Defined Type</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getDefinedType(java.lang.String)
	 * @generated
	 */
	EOperation getEnterpriseData__GetDefinedType__String();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getEnum(java.lang.String) <em>Get Enum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Enum</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getEnum(java.lang.String)
	 * @generated
	 */
	EOperation getEnterpriseData__GetEnum__String();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdDefinedType <em>Ed Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ed Defined Type</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdDefinedType
	 * @generated
	 */
	EClass getEdDefinedType();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdDefinedType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdDefinedType#getName()
	 * @see #getEdDefinedType()
	 * @generated
	 */
	EAttribute getEdDefinedType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdDefinedType#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdDefinedType#getTypes()
	 * @see #getEdDefinedType()
	 * @generated
	 */
	EReference getEdDefinedType_Types();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdType <em>Ed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ed Type</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdType
	 * @generated
	 */
	EClass getEdType();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdType#getName()
	 * @see #getEdType()
	 * @generated
	 */
	EAttribute getEdType_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdType#getPropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Type</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdType#getPropertyType()
	 * @see #getEdType()
	 * @generated
	 */
	EAttribute getEdType_PropertyType();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject <em>Ed Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ed Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdObject
	 * @generated
	 */
	EClass getEdObject();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getMainName <em>Main Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getMainName()
	 * @see #getEdObject()
	 * @generated
	 */
	EAttribute getEdObject_MainName();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getKeysName <em>Keys Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keys Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getKeysName()
	 * @see #getEdObject()
	 * @generated
	 */
	EAttribute getEdObject_KeysName();

	/**
	 * Returns the meta object for the reference '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getXdtoMainObject <em>Xdto Main Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xdto Main Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getXdtoMainObject()
	 * @see #getEdObject()
	 * @generated
	 */
	EReference getEdObject_XdtoMainObject();

	/**
	 * Returns the meta object for the reference '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getXdtoKeysObject <em>Xdto Keys Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xdto Keys Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getXdtoKeysObject()
	 * @see #getEdObject()
	 * @generated
	 */
	EReference getEdObject_XdtoKeysObject();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getMainProperties <em>Main Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Main Properties</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getMainProperties()
	 * @see #getEdObject()
	 * @generated
	 */
	EReference getEdObject_MainProperties();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getProperty(java.lang.String) <em>Get Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Property</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getProperty(java.lang.String)
	 * @generated
	 */
	EOperation getEdObject__GetProperty__String();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getKeyProperties() <em>Get Key Properties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Key Properties</em>' operation.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getKeyProperties()
	 * @generated
	 */
	EOperation getEdObject__GetKeyProperties();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty <em>Ed Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ed Property</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty
	 * @generated
	 */
	EClass getEdProperty();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty#getName()
	 * @see #getEdProperty()
	 * @generated
	 */
	EAttribute getEdProperty_Name();

	/**
	 * Returns the meta object for the reference '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty#getXdtoProperty <em>Xdto Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xdto Property</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty#getXdtoProperty()
	 * @see #getEdProperty()
	 * @generated
	 */
	EReference getEdProperty_XdtoProperty();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty#getIsKey <em>Is Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Key</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty#getIsKey()
	 * @see #getEdProperty()
	 * @generated
	 */
	EAttribute getEdProperty_IsKey();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty#getType()
	 * @see #getEdProperty()
	 * @generated
	 */
	EAttribute getEdProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty#getRequired()
	 * @see #getEdProperty()
	 * @generated
	 */
	EAttribute getEdProperty_Required();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum <em>Ed Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ed Enum</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum
	 * @generated
	 */
	EClass getEdEnum();

	/**
	 * Returns the meta object for the reference '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum#getObject()
	 * @see #getEdEnum()
	 * @generated
	 */
	EReference getEdEnum_Object();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum#getName()
	 * @see #getEdEnum()
	 * @generated
	 */
	EAttribute getEdEnum_Name();

	/**
	 * Returns the meta object for the reference list '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum#getEnumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enumerations</em>'.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum#getEnumerations()
	 * @see #getEdEnum()
	 * @generated
	 */
	EReference getEdEnum_Enumerations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	edFactory getedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EnterpriseDataImpl <em>Enterprise Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.EnterpriseDataImpl
		 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.edPackageImpl#getEnterpriseData()
		 * @generated
		 */
		EClass ENTERPRISE_DATA = eINSTANCE.getEnterpriseData();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTERPRISE_DATA__VERSION = eINSTANCE.getEnterpriseData_Version();

		/**
		 * The meta object literal for the '<em><b>Xdto Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_DATA__XDTO_PACKAGE = eINSTANCE.getEnterpriseData_XdtoPackage();

		/**
		 * The meta object literal for the '<em><b>Defined Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_DATA__DEFINED_TYPES = eINSTANCE.getEnterpriseData_DefinedTypes();

		/**
		 * The meta object literal for the '<em><b>Ref Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_DATA__REF_TYPES = eINSTANCE.getEnterpriseData_RefTypes();

		/**
		 * The meta object literal for the '<em><b>Catalogs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_DATA__CATALOGS = eINSTANCE.getEnterpriseData_Catalogs();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_DATA__DOCUMENTS = eINSTANCE.getEnterpriseData_Documents();

		/**
		 * The meta object literal for the '<em><b>Enums</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_DATA__ENUMS = eINSTANCE.getEnterpriseData_Enums();

		/**
		 * The meta object literal for the '<em><b>Registers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_DATA__REGISTERS = eINSTANCE.getEnterpriseData_Registers();

		/**
		 * The meta object literal for the '<em><b>Unknown Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_DATA__UNKNOWN_OBJECTS = eINSTANCE.getEnterpriseData_UnknownObjects();

		/**
		 * The meta object literal for the '<em><b>Get Property</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_DATA___GET_PROPERTY__STRING_STRING = eINSTANCE.getEnterpriseData__GetProperty__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_DATA___GET_OBJECT__STRING = eINSTANCE.getEnterpriseData__GetObject__String();

		/**
		 * The meta object literal for the '<em><b>Get Defined Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_DATA___GET_DEFINED_TYPE__STRING = eINSTANCE.getEnterpriseData__GetDefinedType__String();

		/**
		 * The meta object literal for the '<em><b>Get Enum</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTERPRISE_DATA___GET_ENUM__STRING = eINSTANCE.getEnterpriseData__GetEnum__String();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdDefinedTypeImpl <em>Ed Defined Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdDefinedTypeImpl
		 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.edPackageImpl#getEdDefinedType()
		 * @generated
		 */
		EClass ED_DEFINED_TYPE = eINSTANCE.getEdDefinedType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED_DEFINED_TYPE__NAME = eINSTANCE.getEdDefinedType_Name();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ED_DEFINED_TYPE__TYPES = eINSTANCE.getEdDefinedType_Types();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdTypeImpl <em>Ed Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdTypeImpl
		 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.edPackageImpl#getEdType()
		 * @generated
		 */
		EClass ED_TYPE = eINSTANCE.getEdType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED_TYPE__NAME = eINSTANCE.getEdType_Name();

		/**
		 * The meta object literal for the '<em><b>Property Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED_TYPE__PROPERTY_TYPE = eINSTANCE.getEdType_PropertyType();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdObjectImpl <em>Ed Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdObjectImpl
		 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.edPackageImpl#getEdObject()
		 * @generated
		 */
		EClass ED_OBJECT = eINSTANCE.getEdObject();

		/**
		 * The meta object literal for the '<em><b>Main Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED_OBJECT__MAIN_NAME = eINSTANCE.getEdObject_MainName();

		/**
		 * The meta object literal for the '<em><b>Keys Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED_OBJECT__KEYS_NAME = eINSTANCE.getEdObject_KeysName();

		/**
		 * The meta object literal for the '<em><b>Xdto Main Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ED_OBJECT__XDTO_MAIN_OBJECT = eINSTANCE.getEdObject_XdtoMainObject();

		/**
		 * The meta object literal for the '<em><b>Xdto Keys Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ED_OBJECT__XDTO_KEYS_OBJECT = eINSTANCE.getEdObject_XdtoKeysObject();

		/**
		 * The meta object literal for the '<em><b>Main Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ED_OBJECT__MAIN_PROPERTIES = eINSTANCE.getEdObject_MainProperties();

		/**
		 * The meta object literal for the '<em><b>Get Property</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ED_OBJECT___GET_PROPERTY__STRING = eINSTANCE.getEdObject__GetProperty__String();

		/**
		 * The meta object literal for the '<em><b>Get Key Properties</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ED_OBJECT___GET_KEY_PROPERTIES = eINSTANCE.getEdObject__GetKeyProperties();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdPropertyImpl <em>Ed Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdPropertyImpl
		 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.edPackageImpl#getEdProperty()
		 * @generated
		 */
		EClass ED_PROPERTY = eINSTANCE.getEdProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED_PROPERTY__NAME = eINSTANCE.getEdProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Xdto Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ED_PROPERTY__XDTO_PROPERTY = eINSTANCE.getEdProperty_XdtoProperty();

		/**
		 * The meta object literal for the '<em><b>Is Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED_PROPERTY__IS_KEY = eINSTANCE.getEdProperty_IsKey();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED_PROPERTY__TYPE = eINSTANCE.getEdProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED_PROPERTY__REQUIRED = eINSTANCE.getEdProperty_Required();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdEnumImpl <em>Ed Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.EdEnumImpl
		 * @see ru.capralow.dt.conversion.plugin.core.ed.model.impl.edPackageImpl#getEdEnum()
		 * @generated
		 */
		EClass ED_ENUM = eINSTANCE.getEdEnum();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ED_ENUM__OBJECT = eINSTANCE.getEdEnum_Object();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED_ENUM__NAME = eINSTANCE.getEdEnum_Name();

		/**
		 * The meta object literal for the '<em><b>Enumerations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ED_ENUM__ENUMERATIONS = eINSTANCE.getEdEnum_Enumerations();

	}

} //edPackage
