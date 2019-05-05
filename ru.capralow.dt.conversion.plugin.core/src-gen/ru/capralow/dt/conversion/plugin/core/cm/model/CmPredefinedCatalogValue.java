/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model;

import com._1c.g5.v8.dt.metadata.mdclass.CatalogPredefinedItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cm Predefined Catalog Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedCatalogValue#getConfigurationValue <em>Configuration Value</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefinedCatalogValue()
 * @model
 * @generated
 */
public interface CmPredefinedCatalogValue extends CmPredefinedValue {
	/**
	 * Returns the value of the '<em><b>Configuration Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Value</em>' reference.
	 * @see #setConfigurationValue(CatalogPredefinedItem)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefinedCatalogValue_ConfigurationValue()
	 * @model
	 * @generated
	 */
	CatalogPredefinedItem getConfigurationValue();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedCatalogValue#getConfigurationValue <em>Configuration Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Value</em>' reference.
	 * @see #getConfigurationValue()
	 * @generated
	 */
	void setConfigurationValue(CatalogPredefinedItem value);

} // CmPredefinedCatalogValue
