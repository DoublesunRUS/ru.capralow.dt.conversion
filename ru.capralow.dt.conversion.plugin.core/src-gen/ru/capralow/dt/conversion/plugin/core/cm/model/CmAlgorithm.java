/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cm Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getExists <em>Exists</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getMethodType <em>Method Type</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getParams <em>Params</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getIsExport <em>Is Export</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getBody <em>Body</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getMethodParams <em>Method Params</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getSuffix <em>Suffix</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAlgorithm()
 * @model
 * @generated
 */
public interface CmAlgorithm extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAlgorithm_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Exists</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exists</em>' attribute.
	 * @see #setExists(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAlgorithm_Exists()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getExists();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getExists <em>Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exists</em>' attribute.
	 * @see #getExists()
	 * @generated
	 */
	void setExists(Boolean value);

	/**
	 * Returns the value of the '<em><b>Method Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Type</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType
	 * @see #setMethodType(CmMethodType)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAlgorithm_MethodType()
	 * @model unique="false"
	 * @generated
	 */
	CmMethodType getMethodType();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getMethodType <em>Method Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Type</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType
	 * @see #getMethodType()
	 * @generated
	 */
	void setMethodType(CmMethodType value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.model.CmParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAlgorithm_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<CmParam> getParams();

	/**
	 * Returns the value of the '<em><b>Is Export</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Export</em>' attribute.
	 * @see #setIsExport(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAlgorithm_IsExport()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getIsExport();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getIsExport <em>Is Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Export</em>' attribute.
	 * @see #getIsExport()
	 * @generated
	 */
	void setIsExport(Boolean value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAlgorithm_Body()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Method Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Params</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAlgorithm_MethodParams()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getMethodParams();

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAlgorithm_Prefix()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAlgorithm_Suffix()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getSuffix();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getAlgorithmText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String toString();

} // CmAlgorithm
