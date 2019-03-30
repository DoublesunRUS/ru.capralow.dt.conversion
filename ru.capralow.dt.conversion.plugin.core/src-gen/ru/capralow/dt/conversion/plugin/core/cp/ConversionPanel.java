/**
 */
package ru.capralow.dt.conversion.plugin.core.cp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversion Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.ConversionPanel#getExchangePairs <em>Exchange Pairs</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cp.ConversionPanel#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getConversionPanel()
 * @model
 * @generated
 */
public interface ConversionPanel extends EObject {
	/**
	 * Returns the value of the '<em><b>Exchange Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cp.cpExchangePair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Pairs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Pairs</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getConversionPanel_ExchangePairs()
	 * @model containment="true"
	 * @generated
	 */
	EList<cpExchangePair> getExchangePairs();

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cp.CpPackage#getConversionPanel_Configurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<cpConfiguration> getConfigurations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" configurationNameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration%&gt;&gt; _configurations = this.getConfigurations();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration%&gt; configuration : _configurations)\n{\n\t&lt;%java.lang.String%&gt; _configurationName = configuration.getConfigurationName();\n\tboolean _equals = &lt;%com.google.common.base.Objects%&gt;.equal(configurationName, _configurationName);\n\tif (_equals)\n\t{\n\t\treturn configuration;\n\t}\n}\nreturn null;'"
	 * @generated
	 */
	cpConfiguration getConfiguration(String configurationName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; result = &lt;%org.eclipse.emf.ecore.xcore.lib.XcoreCollectionLiterals%&gt;.&lt;&lt;%java.lang.Object%&gt;&gt;newBasicEList();\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration%&gt;&gt; _configurations = this.getConfigurations();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.cp.cpConfiguration%&gt; configuration : _configurations)\n{\n\t&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; _coreObjects = configuration.getCoreObjects();\n\tfor (final &lt;%java.lang.Object%&gt; coreObject : _coreObjects)\n\t{\n\t\tresult.add(coreObject);\n\t}\n}\nreturn result;'"
	 * @generated
	 */
	EList<Object> getObjects();

} // ConversionPanel
