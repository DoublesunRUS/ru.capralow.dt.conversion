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
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#getPredefinedMaps <em>Predefined Maps</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefined()
 * @model
 * @generated
 */
public interface CmPredefined extends CmObject {
	/**
	 * Returns the value of the '<em><b>Predefined Maps</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Maps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Maps</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefined_PredefinedMaps()
	 * @model containment="true"
	 * @generated
	 */
	EList<CmPredefinedMap> getPredefinedMaps();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" configurationValueUnique="false" formatValueUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap%&gt;&gt; _predefinedMaps = this.getPredefinedMaps();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap%&gt; predefinedMap : _predefinedMaps)\n{\n\tif ((configurationValue.equals(predefinedMap.getConfigurationValue()) &amp;&amp; formatValue.equals(predefinedMap.getFormatValue())))\n\t{\n\t\treturn &lt;%java.lang.Boolean%&gt;.valueOf(true);\n\t}\n}\nreturn &lt;%java.lang.Boolean%&gt;.valueOf(false);'"
	 * @generated
	 */
	Boolean predefinedMapExists(String configurationValue, String formatValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.lang.String%&gt; nameString = this.getName();\nboolean _isEmpty = this.getName().isEmpty();\nif (_isEmpty)\n{\n\tnameString = \"&lt;\\u041F\\u0443\\u0441\\u0442\\u043E\\u0435&gt;\";\n}\n&lt;%java.lang.String%&gt; configurationString = this.getConfigurationObjectName();\nboolean _isEmpty_1 = this.getConfigurationObjectName().isEmpty();\nif (_isEmpty_1)\n{\n\tconfigurationString = \"&lt;\\u041F\\u0443\\u0441\\u0442\\u043E\\u0435&gt;\";\n}\n&lt;%java.lang.String%&gt; formatString = this.getFormatObject();\nboolean _isEmpty_2 = this.getFormatObject().isEmpty();\nif (_isEmpty_2)\n{\n\tformatString = \"&lt;\\u041F\\u0443\\u0441\\u0442\\u043E\\u0435&gt;\";\n}\n&lt;%java.lang.String%&gt; routeString = \"&lt;\\u041D\\u0430\\u043F\\u0440\\u0430\\u0432\\u043B\\u0435\\u043D\\u0438\\u0435\\u041D\\u0435\\u0417\\u0430\\u0434\\u0430\\u043D\\u043E&gt;\";\n&lt;%java.lang.Boolean%&gt; _forSending = this.getForSending();\nif ((_forSending).booleanValue())\n{\n\trouteString = \"\\u041E\\u0442\\u043F\\u0440\\u0430\\u0432\\u043A\\u0430\";\n}\n&lt;%java.lang.Boolean%&gt; _forReceiving = this.getForReceiving();\nif ((_forReceiving).booleanValue())\n{\n\trouteString = \"\\u041F\\u043E\\u043B\\u0443\\u0447\\u0435\\u043D\\u0438\\u0435\";\n}\nif (((this.getForSending()).booleanValue() &amp;&amp; (this.getForReceiving()).booleanValue()))\n{\n\trouteString = \"\\u041E\\u0442\\u043F\\u0440\\u0430\\u0432\\u043A\\u0430\\u0418\\u041F\\u043E\\u043B\\u0443\\u0447\\u0435\\u043D\\u0438\\u0435\";\n}\nreturn (((((((\"name:\" + nameString) + \" md:\") + configurationString) + \" xdto:\") + formatString) + \" \") + routeString);'"
	 * @generated
	 */
	String toString();

} // CmPredefined
