/**
 */
package ru.capralow.dt.conversion.plugin.core.cm;

import com._1c.g5.v8.bm.core.IBmObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sending Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmSendingRule#getConfigurationObject <em>Configuration Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmSendingRule#getDataRule <em>Data Rule</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.CmSendingRule#getObjectRules <em>Object Rules</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmSendingRule()
 * @model
 * @extends IBmObject
 * @generated
 */
public interface CmSendingRule extends IBmObject {
	/**
	 * Returns the value of the '<em><b>Configuration Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Object</em>' attribute.
	 * @see #setConfigurationObject(Object)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmSendingRule_ConfigurationObject()
	 * @model unique="false"
	 * @generated
	 */
	Object getConfigurationObject();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmSendingRule#getConfigurationObject <em>Configuration Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Object</em>' attribute.
	 * @see #getConfigurationObject()
	 * @generated
	 */
	void setConfigurationObject(Object value);

	/**
	 * Returns the value of the '<em><b>Data Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Rule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Rule</em>' reference.
	 * @see #setDataRule(CmDataRule)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmSendingRule_DataRule()
	 * @model
	 * @generated
	 */
	CmDataRule getDataRule();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.CmSendingRule#getDataRule <em>Data Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Rule</em>' reference.
	 * @see #getDataRule()
	 * @generated
	 */
	void setDataRule(CmDataRule value);

	/**
	 * Returns the value of the '<em><b>Object Rules</b></em>' reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.CmObjectRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Rules</em>' reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.CmPackage#getCmSendingRule_ObjectRules()
	 * @model
	 * @generated
	 */
	EList<CmObjectRule> getObjectRules();

} // CmSendingRule
