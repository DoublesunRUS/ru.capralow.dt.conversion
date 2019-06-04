/**
 */
package ru.capralow.dt.conversion.plugin.core.ep.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange Projects</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProjects#getProjects <em>Projects</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage#getExchangeProjects()
 * @model
 * @generated
 */
public interface ExchangeProjects extends EObject {
	/**
	 * Returns the value of the '<em><b>Projects</b></em>' reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage#getExchangeProjects_Projects()
	 * @model
	 * @generated
	 */
	EList<ExchangeProject> getProjects();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false"
	 * @generated
	 */
	ExchangeProject getProject(String name);

} // ExchangeProjects
