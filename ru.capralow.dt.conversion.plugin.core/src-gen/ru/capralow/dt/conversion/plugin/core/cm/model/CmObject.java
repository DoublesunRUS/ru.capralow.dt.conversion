/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model;

import com._1c.g5.v8.dt.metadata.mdclass.MdObject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cm Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getConfigurationObject <em>Configuration Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getConfigurationObjectName <em>Configuration Object Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getConfigurationObjectFormattedName <em>Configuration Object Formatted Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getFormatObject <em>Format Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getForSending <em>For Sending</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getForReceiving <em>For Receiving</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObject()
 * @model
 * @generated
 */
public interface CmObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObject_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Configuration Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Object</em>' reference.
	 * @see #setConfigurationObject(MdObject)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObject_ConfigurationObject()
	 * @model
	 * @generated
	 */
	MdObject getConfigurationObject();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getConfigurationObject <em>Configuration Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Object</em>' reference.
	 * @see #getConfigurationObject()
	 * @generated
	 */
	void setConfigurationObject(MdObject value);

	/**
	 * Returns the value of the '<em><b>Configuration Object Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Object Name</em>' attribute.
	 * @see #setConfigurationObjectName(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObject_ConfigurationObjectName()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getConfigurationObjectName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getConfigurationObjectName <em>Configuration Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Object Name</em>' attribute.
	 * @see #getConfigurationObjectName()
	 * @generated
	 */
	void setConfigurationObjectName(String value);

	/**
	 * Returns the value of the '<em><b>Configuration Object Formatted Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Object Formatted Name</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObject_ConfigurationObjectFormattedName()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getConfigurationObjectFormattedName();

	/**
	 * Returns the value of the '<em><b>Format Object</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format Object</em>' attribute.
	 * @see #setFormatObject(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObject_FormatObject()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getFormatObject();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getFormatObject <em>Format Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format Object</em>' attribute.
	 * @see #getFormatObject()
	 * @generated
	 */
	void setFormatObject(String value);

	/**
	 * Returns the value of the '<em><b>For Sending</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Sending</em>' attribute.
	 * @see #setForSending(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObject_ForSending()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getForSending();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getForSending <em>For Sending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Sending</em>' attribute.
	 * @see #getForSending()
	 * @generated
	 */
	void setForSending(Boolean value);

	/**
	 * Returns the value of the '<em><b>For Receiving</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Receiving</em>' attribute.
	 * @see #setForReceiving(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmObject_ForReceiving()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getForReceiving();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObject#getForReceiving <em>For Receiving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Receiving</em>' attribute.
	 * @see #getForReceiving()
	 * @generated
	 */
	void setForReceiving(Boolean value);

} // CmObject
