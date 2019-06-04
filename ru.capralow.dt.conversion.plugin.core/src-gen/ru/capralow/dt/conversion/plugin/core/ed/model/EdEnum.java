/**
 */
package ru.capralow.dt.conversion.plugin.core.ed.model;

import com._1c.g5.v8.dt.xdto.model.Enumeration;
import com._1c.g5.v8.dt.xdto.model.ValueType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ed Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum#getObject <em>Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum#getEnumerations <em>Enumerations</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEdEnum()
 * @model
 * @generated
 */
public interface EdEnum extends EObject {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(ValueType)
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEdEnum_Object()
	 * @model
	 * @generated
	 */
	ValueType getObject();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ValueType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEdEnum_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Enumerations</b></em>' reference list.
	 * The list contents are of type {@link com._1c.g5.v8.dt.xdto.model.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerations</em>' reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEdEnum_Enumerations()
	 * @model
	 * @generated
	 */
	EList<Enumeration> getEnumerations();

} // EdEnum
