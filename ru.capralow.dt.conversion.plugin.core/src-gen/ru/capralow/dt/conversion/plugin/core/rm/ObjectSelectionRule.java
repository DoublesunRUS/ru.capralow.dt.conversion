/**
 */
package ru.capralow.dt.conversion.plugin.core.rm;

import com._1c.g5.v8.bm.core.IBmObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Selection Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.ObjectSelectionRule#getIsFolder <em>Is Folder</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getObjectSelectionRule()
 * @model
 * @extends IBmObject
 * @generated
 */
public interface ObjectSelectionRule extends IBmObject {
	/**
	 * Returns the value of the '<em><b>Is Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Folder</em>' attribute.
	 * @see #setIsFolder(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.rm.RmPackage#getObjectSelectionRule_IsFolder()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getIsFolder();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rm.ObjectSelectionRule#getIsFolder <em>Is Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Folder</em>' attribute.
	 * @see #getIsFolder()
	 * @generated
	 */
	void setIsFolder(Boolean value);

} // ObjectSelectionRule
