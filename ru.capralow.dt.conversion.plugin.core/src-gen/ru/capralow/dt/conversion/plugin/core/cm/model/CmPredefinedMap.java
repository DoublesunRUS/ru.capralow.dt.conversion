/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cm Predefined Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap#getConfigurationValue <em>Configuration Value</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap#getFormatValue <em>Format Value</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefinedMap()
 * @model
 * @generated
 */
public interface CmPredefinedMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Value</em>' attribute.
	 * @see #setConfigurationValue(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefinedMap_ConfigurationValue()
	 * @model unique="false"
	 * @generated
	 */
	String getConfigurationValue();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap#getConfigurationValue <em>Configuration Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Value</em>' attribute.
	 * @see #getConfigurationValue()
	 * @generated
	 */
	void setConfigurationValue(String value);

	/**
	 * Returns the value of the '<em><b>Format Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format Value</em>' attribute.
	 * @see #setFormatValue(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefinedMap_FormatValue()
	 * @model unique="false"
	 * @generated
	 */
	String getFormatValue();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap#getFormatValue <em>Format Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format Value</em>' attribute.
	 * @see #getFormatValue()
	 * @generated
	 */
	void setFormatValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _configurationValue = this.getConfigurationValue();\nboolean _tripleEquals = (_configurationValue == null);\nif (_tripleEquals)\n{\n\treturn \"\";\n}\n&lt;%java.lang.String%&gt; configurationValueName = this.getConfigurationValue().toString();\nint _indexOf = configurationValueName.indexOf(\".\");\nint _plus = (_indexOf + 1);\nconfigurationValueName = configurationValueName.substring(_plus);\nint _indexOf_1 = configurationValueName.indexOf(\".\");\nint _plus_1 = (_indexOf_1 + 1);\nconfigurationValueName = configurationValueName.substring(_plus_1);\nreturn configurationValueName;'"
	 * @generated
	 */
	String getConfigurationValueName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; _formatValue = this.getFormatValue();\nboolean _tripleEquals = (_formatValue == null);\nif (_tripleEquals)\n{\n\treturn \"\";\n}\nreturn this.getFormatValue().toString();'"
	 * @generated
	 */
	String getFormatValueName();

} // CmPredefinedMap
