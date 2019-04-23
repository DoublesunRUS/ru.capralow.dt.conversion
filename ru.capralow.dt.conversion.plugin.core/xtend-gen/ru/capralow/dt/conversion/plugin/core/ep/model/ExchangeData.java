/**
 */
package ru.capralow.dt.conversion.plugin.core.ep.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeData#getProjects <em>Projects</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeData#getPairs <em>Pairs</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage#getExchangeData()
 * @model
 * @generated
 */
public interface ExchangeData extends EObject {
	/**
	 * Returns the value of the '<em><b>Projects</b></em>' reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage#getExchangeData_Projects()
	 * @model
	 * @generated
	 */
	EList<ExchangeProject> getProjects();

	/**
	 * Returns the value of the '<em><b>Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pairs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pairs</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage#getExchangeData_Pairs()
	 * @model containment="true"
	 * @generated
	 */
	EList<EpExchangePair> getPairs();

} // ExchangeData
