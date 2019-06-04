/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cm Predefined</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#getPredefinedValues <em>Predefined Values</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefined()
 * @model
 * @generated
 */
public interface CmPredefined extends CmObject {
	/**
	 * Returns the value of the '<em><b>Predefined Values</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Values</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefined_PredefinedValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<CmPredefinedValue> getPredefinedValues();

	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedType
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefined_PredefinedType()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	CmPredefinedType getPredefinedType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" configurationValueNameUnique="false"
	 * @generated
	 */
	CmPredefinedValue getPredefinedConfigurationValue(String configurationValueName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" configurationValueNameUnique="false" formatValueUnique="false"
	 * @generated
	 */
	Boolean predefinedValueExists(String configurationValueName, String formatValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String toString();

} // CmPredefined
