/**
 */
package ru.capralow.dt.conversion.plugin.core.rm.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Selection Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.ObjectSelectionRule#getIsFolder <em>Is Folder</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.rm.model.rmPackage#getObjectSelectionRule()
 * @model
 * @generated
 */
public interface ObjectSelectionRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Folder</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Folder</em>' attribute.
	 * @see #setIsFolder(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.model.rmPackage#getObjectSelectionRule_IsFolder()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getIsFolder();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.model.ObjectSelectionRule#getIsFolder <em>Is Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Folder</em>' attribute.
	 * @see #getIsFolder()
	 * @generated
	 */
	void setIsFolder(Boolean value);

} // ObjectSelectionRule
