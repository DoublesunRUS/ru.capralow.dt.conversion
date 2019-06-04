/**
 */
package ru.capralow.dt.conversion.plugin.core.rg.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report Groups</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rg.model.ReportGroups#getVariants <em>Variants</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rg.model.ReportGroups#getAddObjectsList <em>Add Objects List</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.rg.model.rgPackage#getReportGroups()
 * @model
 * @generated
 */
public interface ReportGroups extends EObject {
	/**
	 * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.rg.model.RgVariant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variants</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.rgPackage#getReportGroups_Variants()
	 * @model containment="true"
	 * @generated
	 */
	EList<RgVariant> getVariants();

	/**
	 * Returns the value of the '<em><b>Add Objects List</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Objects List</em>' attribute.
	 * @see #setAddObjectsList(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.rg.model.rgPackage#getReportGroups_AddObjectsList()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getAddObjectsList();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.rg.model.ReportGroups#getAddObjectsList <em>Add Objects List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Objects List</em>' attribute.
	 * @see #getAddObjectsList()
	 * @generated
	 */
	void setAddObjectsList(Boolean value);

} // ReportGroups
