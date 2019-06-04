/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cm Attribute Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getOwner <em>Owner</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getConfigurationTabularSection <em>Configuration Tabular Section</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getConfigurationAttribute <em>Configuration Attribute</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getFormatTabularSection <em>Format Tabular Section</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getFormatAttribute <em>Format Attribute</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getObjectRule <em>Object Rule</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getIsCustomRule <em>Is Custom Rule</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAttributeRule()
 * @model
 * @generated
 */
public interface CmAttributeRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getAttributeRules <em>Attribute Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(CmObjectRule)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAttributeRule_Owner()
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmObjectRule#getAttributeRules
	 * @model opposite="attributeRules" transient="false"
	 * @generated
	 */
	CmObjectRule getOwner();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(CmObjectRule value);

	/**
	 * Returns the value of the '<em><b>Configuration Tabular Section</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Tabular Section</em>' attribute.
	 * @see #setConfigurationTabularSection(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAttributeRule_ConfigurationTabularSection()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getConfigurationTabularSection();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getConfigurationTabularSection <em>Configuration Tabular Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Tabular Section</em>' attribute.
	 * @see #getConfigurationTabularSection()
	 * @generated
	 */
	void setConfigurationTabularSection(String value);

	/**
	 * Returns the value of the '<em><b>Configuration Attribute</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Attribute</em>' attribute.
	 * @see #setConfigurationAttribute(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAttributeRule_ConfigurationAttribute()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getConfigurationAttribute();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getConfigurationAttribute <em>Configuration Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Attribute</em>' attribute.
	 * @see #getConfigurationAttribute()
	 * @generated
	 */
	void setConfigurationAttribute(String value);

	/**
	 * Returns the value of the '<em><b>Format Tabular Section</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format Tabular Section</em>' attribute.
	 * @see #setFormatTabularSection(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAttributeRule_FormatTabularSection()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getFormatTabularSection();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getFormatTabularSection <em>Format Tabular Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format Tabular Section</em>' attribute.
	 * @see #getFormatTabularSection()
	 * @generated
	 */
	void setFormatTabularSection(String value);

	/**
	 * Returns the value of the '<em><b>Format Attribute</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format Attribute</em>' attribute.
	 * @see #setFormatAttribute(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAttributeRule_FormatAttribute()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getFormatAttribute();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getFormatAttribute <em>Format Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format Attribute</em>' attribute.
	 * @see #getFormatAttribute()
	 * @generated
	 */
	void setFormatAttribute(String value);

	/**
	 * Returns the value of the '<em><b>Object Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Rule</em>' reference.
	 * @see #setObjectRule(CmObjectRule)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAttributeRule_ObjectRule()
	 * @model
	 * @generated
	 */
	CmObjectRule getObjectRule();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getObjectRule <em>Object Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Rule</em>' reference.
	 * @see #getObjectRule()
	 * @generated
	 */
	void setObjectRule(CmObjectRule value);

	/**
	 * Returns the value of the '<em><b>Is Custom Rule</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Custom Rule</em>' attribute.
	 * @see #setIsCustomRule(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmAttributeRule_IsCustomRule()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getIsCustomRule();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmAttributeRule#getIsCustomRule <em>Is Custom Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Custom Rule</em>' attribute.
	 * @see #getIsCustomRule()
	 * @generated
	 */
	void setIsCustomRule(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getConfigurationAttributeFullName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getFormatAttributeFullName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String toString();

} // CmAttributeRule
