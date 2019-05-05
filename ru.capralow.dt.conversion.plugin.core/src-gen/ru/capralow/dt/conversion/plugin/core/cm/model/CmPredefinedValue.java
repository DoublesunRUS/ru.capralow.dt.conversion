/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cm Predefined Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedValue#getConfigurationValueName <em>Configuration Value Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedValue#getFormatValue <em>Format Value</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefinedValue()
 * @model
 * @generated
 */
public interface CmPredefinedValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration Value Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Value Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Value Name</em>' attribute.
	 * @see #setConfigurationValueName(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefinedValue_ConfigurationValueName()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getConfigurationValueName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedValue#getConfigurationValueName <em>Configuration Value Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Value Name</em>' attribute.
	 * @see #getConfigurationValueName()
	 * @generated
	 */
	void setConfigurationValueName(String value);

	/**
	 * Returns the value of the '<em><b>Format Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format Value</em>' attribute.
	 * @see #setFormatValue(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefinedValue_FormatValue()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getFormatValue();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedValue#getFormatValue <em>Format Value</em>}' attribute.
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _isEmpty = this.getConfigurationValueName().isEmpty();\nif (_isEmpty)\n{\n\treturn \"\";\n}\n&lt;%java.lang.String%&gt; configurationValueFormattedName = this.getConfigurationValueName().toString();\nint _indexOf = configurationValueFormattedName.indexOf(\".\");\nint _plus = (_indexOf + 1);\nconfigurationValueFormattedName = configurationValueFormattedName.substring(_plus);\nint _indexOf_1 = configurationValueFormattedName.indexOf(\".\");\nint _plus_1 = (_indexOf_1 + 1);\nconfigurationValueFormattedName = configurationValueFormattedName.substring(_plus_1);\nreturn configurationValueFormattedName;'"
	 * @generated
	 */
	String getConfigurationValueFormattedName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _isEmpty = this.getFormatValue().isEmpty();\nif (_isEmpty)\n{\n\treturn \"\";\n}\nreturn this.getFormatValue().toString();'"
	 * @generated
	 */
	String getFormatValueName();

} // CmPredefinedValue
