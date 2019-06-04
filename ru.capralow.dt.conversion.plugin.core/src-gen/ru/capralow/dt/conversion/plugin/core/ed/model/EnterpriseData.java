/**
 */
package ru.capralow.dt.conversion.plugin.core.ed.model;

import com._1c.g5.v8.dt.metadata.mdclass.XDTOPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enterprise Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getVersion <em>Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getXdtoPackage <em>Xdto Package</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getDefinedTypes <em>Defined Types</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getRefTypes <em>Ref Types</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getCatalogs <em>Catalogs</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getDocuments <em>Documents</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getEnums <em>Enums</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getRegisters <em>Registers</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getUnknownObjects <em>Unknown Objects</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEnterpriseData()
 * @model
 * @generated
 */
public interface EnterpriseData extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEnterpriseData_Version()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Xdto Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xdto Package</em>' reference.
	 * @see #setXdtoPackage(XDTOPackage)
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEnterpriseData_XdtoPackage()
	 * @model
	 * @generated
	 */
	XDTOPackage getXdtoPackage();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getXdtoPackage <em>Xdto Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xdto Package</em>' reference.
	 * @see #getXdtoPackage()
	 * @generated
	 */
	void setXdtoPackage(XDTOPackage value);

	/**
	 * Returns the value of the '<em><b>Defined Types</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.ed.model.EdDefinedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined Types</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEnterpriseData_DefinedTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdDefinedType> getDefinedTypes();

	/**
	 * Returns the value of the '<em><b>Ref Types</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.ed.model.EdDefinedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Types</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEnterpriseData_RefTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdDefinedType> getRefTypes();

	/**
	 * Returns the value of the '<em><b>Catalogs</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalogs</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEnterpriseData_Catalogs()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdObject> getCatalogs();

	/**
	 * Returns the value of the '<em><b>Documents</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEnterpriseData_Documents()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdObject> getDocuments();

	/**
	 * Returns the value of the '<em><b>Enums</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enums</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEnterpriseData_Enums()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdEnum> getEnums();

	/**
	 * Returns the value of the '<em><b>Registers</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registers</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEnterpriseData_Registers()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdObject> getRegisters();

	/**
	 * Returns the value of the '<em><b>Unknown Objects</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Objects</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEnterpriseData_UnknownObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdObject> getUnknownObjects();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" objectNameUnique="false" propertyNameUnique="false"
	 * @generated
	 */
	EdProperty getProperty(String objectName, String propertyName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false"
	 * @generated
	 */
	EdObject getObject(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false"
	 * @generated
	 */
	EdDefinedType getDefinedType(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false"
	 * @generated
	 */
	EdEnum getEnum(String name);

} // EnterpriseData
