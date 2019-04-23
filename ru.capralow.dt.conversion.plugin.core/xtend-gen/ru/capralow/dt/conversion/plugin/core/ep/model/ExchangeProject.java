/**
 */
package ru.capralow.dt.conversion.plugin.core.ep.model;

import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getStoreVersion <em>Store Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getStatus <em>Status</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getFormatVersions <em>Format Versions</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getSettingsModules <em>Settings Modules</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage#getExchangeProject()
 * @model
 * @generated
 */
public interface ExchangeProject extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage#getExchangeProject_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Store Version</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Version</em>' attribute.
	 * @see #setStoreVersion(String)
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage#getExchangeProject_StoreVersion()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getStoreVersion();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getStoreVersion <em>Store Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Version</em>' attribute.
	 * @see #getStoreVersion()
	 * @generated
	 */
	void setStoreVersion(String value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.ep.model.EpExtension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage#getExchangeProject_Extensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<EpExtension> getExtensions();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link ru.capralow.dt.conversion.plugin.core.ep.model.EpProjectStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpProjectStatus
	 * @see #setStatus(EpProjectStatus)
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage#getExchangeProject_Status()
	 * @model unique="false"
	 * @generated
	 */
	EpProjectStatus getStatus();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.EpProjectStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EpProjectStatus value);

	/**
	 * Returns the value of the '<em><b>Format Versions</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format Versions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format Versions</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage#getExchangeProject_FormatVersions()
	 * @model containment="true"
	 * @generated
	 */
	EList<EpFormatVersion> getFormatVersions();

	/**
	 * Returns the value of the '<em><b>Settings Modules</b></em>' reference list.
	 * The list contents are of type {@link com._1c.g5.v8.dt.metadata.mdclass.CommonModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings Modules</em>' reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.ep.model.epPackage#getExchangeProject_SettingsModules()
	 * @model
	 * @generated
	 */
	EList<CommonModule> getSettingsModules();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%java.lang.String%&gt;&gt; result = &lt;%org.eclipse.emf.ecore.xcore.lib.XcoreCollectionLiterals%&gt;.&lt;&lt;%java.lang.String%&gt;&gt;newBasicEList();\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion%&gt;&gt; _formatVersions = this.getFormatVersions();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion%&gt; formatVersion : _formatVersions)\n{\n\tresult.add(formatVersion.getVersion());\n}\nreturn result;'"
	 * @generated
	 */
	EList<String> getVersions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" moduleUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion%&gt;&gt; result = &lt;%org.eclipse.emf.ecore.xcore.lib.XcoreCollectionLiterals%&gt;.&lt;&lt;%ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion%&gt;&gt;newBasicEList();\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion%&gt;&gt; _formatVersions = this.getFormatVersions();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion%&gt; formatVersion : _formatVersions)\n{\n\tboolean _equals = formatVersion.getModule().equals(module);\n\tif (_equals)\n\t{\n\t\tresult.add(formatVersion);\n\t}\n}\nreturn result;'"
	 * @generated
	 */
	EList<EpFormatVersion> getModuleFormatVersions(CommonModule module);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%com._1c.g5.v8.dt.metadata.mdclass.CommonModule%&gt;&gt; result = &lt;%org.eclipse.emf.ecore.xcore.lib.XcoreCollectionLiterals%&gt;.&lt;&lt;%com._1c.g5.v8.dt.metadata.mdclass.CommonModule%&gt;&gt;newBasicEList();\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion%&gt;&gt; _formatVersions = this.getFormatVersions();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.ep.model.EpFormatVersion%&gt; formatVersion : _formatVersions)\n{\n\tboolean _contains = result.contains(formatVersion.getModule());\n\tboolean _not = (!_contains);\n\tif (_not)\n\t{\n\t\tresult.add(formatVersion.getModule());\n\t}\n}\nreturn result;'"
	 * @generated
	 */
	EList<CommonModule> getFormatModules();

} // ExchangeProject
