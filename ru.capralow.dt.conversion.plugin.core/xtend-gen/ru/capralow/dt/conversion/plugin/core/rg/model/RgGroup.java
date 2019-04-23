/**
 */
package ru.capralow.dt.conversion.plugin.core.rg.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rg Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rg.model.RgGroup#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rg.model.RgGroup#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.rg.model.rgPackage#getRgGroup()
 * @model
 * @generated
 */
public interface RgGroup extends EObject {
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
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.rgPackage#getRgGroup_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rg.model.RgGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.rg.model.RgRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.rgPackage#getRgGroup_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<RgRule> getRules();

} // RgGroup
