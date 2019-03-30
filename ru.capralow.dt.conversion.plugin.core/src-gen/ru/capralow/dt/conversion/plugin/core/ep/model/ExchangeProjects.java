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
	 * <p>
	 * If the meaning of the '<em>Projects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject%&gt;&gt; _projects = this.getProjects();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject%&gt; project : _projects)\n{\n\tboolean _equals = name.equals(project.getName());\n\tif (_equals)\n\t{\n\t\treturn project;\n\t}\n}\nreturn null;'"
	 * @generated
	 */
	ExchangeProject getProject(String name);

} // ExchangeProjects
