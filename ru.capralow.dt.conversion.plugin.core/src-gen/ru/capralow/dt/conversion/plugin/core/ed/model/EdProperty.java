/**
 */
package ru.capralow.dt.conversion.plugin.core.ed.model;

import com._1c.g5.v8.dt.xdto.model.Property;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ed Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty#getXdtoProperty <em>Xdto Property</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty#getIsKey <em>Is Key</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty#getType <em>Type</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEdProperty()
 * @model
 * @generated
 */
public interface EdProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEdProperty_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Xdto Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xdto Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xdto Property</em>' reference.
	 * @see #setXdtoProperty(Property)
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEdProperty_XdtoProperty()
	 * @model
	 * @generated
	 */
	Property getXdtoProperty();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty#getXdtoProperty <em>Xdto Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xdto Property</em>' reference.
	 * @see #getXdtoProperty()
	 * @generated
	 */
	void setXdtoProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Is Key</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Key</em>' attribute.
	 * @see #setIsKey(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEdProperty_IsKey()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getIsKey();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty#getIsKey <em>Is Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Key</em>' attribute.
	 * @see #getIsKey()
	 * @generated
	 */
	void setIsKey(Boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEdProperty_Type()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEdProperty_Required()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getRequired();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty#getRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(Boolean value);

} // EdProperty
