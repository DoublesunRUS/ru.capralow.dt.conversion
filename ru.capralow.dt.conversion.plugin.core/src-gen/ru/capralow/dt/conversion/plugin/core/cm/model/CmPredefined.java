/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model;

import com._1c.g5.v8.dt.metadata.mdclass.MdObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cm Predefined</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#getConfigurationObject <em>Configuration Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#getConfigurationObjectName <em>Configuration Object Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#getConfigurationObjectFormattedName <em>Configuration Object Formatted Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#getFormatObject <em>Format Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#getForSending <em>For Sending</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#getForReceiving <em>For Receiving</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#getPredefinedMaps <em>Predefined Maps</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefined()
 * @model
 * @generated
 */
public interface CmPredefined extends EObject {
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
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefined_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Configuration Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Object</em>' reference.
	 * @see #setConfigurationObject(MdObject)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefined_ConfigurationObject()
	 * @model
	 * @generated
	 */
	MdObject getConfigurationObject();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#getConfigurationObject <em>Configuration Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Object</em>' reference.
	 * @see #getConfigurationObject()
	 * @generated
	 */
	void setConfigurationObject(MdObject value);

	/**
	 * Returns the value of the '<em><b>Configuration Object Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Object Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Object Name</em>' attribute.
	 * @see #setConfigurationObjectName(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefined_ConfigurationObjectName()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getConfigurationObjectName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#getConfigurationObjectName <em>Configuration Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Object Name</em>' attribute.
	 * @see #getConfigurationObjectName()
	 * @generated
	 */
	void setConfigurationObjectName(String value);

	/**
	 * Returns the value of the '<em><b>Configuration Object Formatted Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Object Formatted Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Object Formatted Name</em>' attribute.
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefined_ConfigurationObjectFormattedName()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; result = \"\";\nboolean _startsWith = this.getConfigurationObjectName().startsWith(\"\\u041C\\u0435\\u0442\\u0430\\u0434\\u0430\\u043D\\u043D\\u044B\\u0435.\\u0421\\u043F\\u0440\\u0430\\u0432\\u043E\\u0447\\u043D\\u0438\\u043A\\u0438\");\nif (_startsWith)\n{\n\t&lt;%java.lang.String%&gt; _get = this.getConfigurationObjectName().split(\"[.]\")[2];\n\t&lt;%java.lang.String%&gt; _plus = (\"\\u0421\\u043F\\u0440\\u0430\\u0432\\u043E\\u0447\\u043D\\u0438\\u043A.\" + _get);\n\tresult = _plus;\n}\nelse\n{\n\tboolean _startsWith_1 = this.getConfigurationObjectName().startsWith(\"\\u041C\\u0435\\u0442\\u0430\\u0434\\u0430\\u043D\\u043D\\u044B\\u0435.\\u0414\\u043E\\u043A\\u0443\\u043C\\u0435\\u043D\\u0442\\u044B\");\n\tif (_startsWith_1)\n\t{\n\t\t&lt;%java.lang.String%&gt; _get_1 = this.getConfigurationObjectName().split(\"[.]\")[2];\n\t\t&lt;%java.lang.String%&gt; _plus_1 = (\"\\u0414\\u043E\\u043A\\u0443\\u043C\\u0435\\u043D\\u0442.\" + _get_1);\n\t\tresult = _plus_1;\n\t}\n\telse\n\t{\n\t\tboolean _startsWith_2 = this.getConfigurationObjectName().startsWith(\"\\u041C\\u0435\\u0442\\u0430\\u0434\\u0430\\u043D\\u043D\\u044B\\u0435.\\u041F\\u0435\\u0440\\u0435\\u0447\\u0438\\u0441\\u043B\\u0435\\u043D\\u0438\\u044F\");\n\t\tif (_startsWith_2)\n\t\t{\n\t\t\t&lt;%java.lang.String%&gt; _get_2 = this.getConfigurationObjectName().split(\"[.]\")[2];\n\t\t\t&lt;%java.lang.String%&gt; _plus_2 = (\"\\u041F\\u0435\\u0440\\u0435\\u0447\\u0438\\u0441\\u043B\\u0435\\u043D\\u0438\\u0435.\" + _get_2);\n\t\t\tresult = _plus_2;\n\t\t}\n\t\telse\n\t\t{\n\t\t\tboolean _startsWith_3 = this.getConfigurationObjectName().startsWith(\"\\u041C\\u0435\\u0442\\u0430\\u0434\\u0430\\u043D\\u043D\\u044B\\u0435.\\u041F\\u043B\\u0430\\u043D\\u044B\\u0412\\u0438\\u0434\\u043E\\u0432\\u0425\\u0430\\u0440\\u0430\\u043A\\u0442\\u0435\\u0440\\u0438\\u0441\\u0442\\u0438\\u043A\");\n\t\t\tif (_startsWith_3)\n\t\t\t{\n\t\t\t\t&lt;%java.lang.String%&gt; _get_3 = this.getConfigurationObjectName().split(\"[.]\")[2];\n\t\t\t\t&lt;%java.lang.String%&gt; _plus_3 = (\"\\u041F\\u043B\\u0430\\u043D\\u0412\\u0438\\u0434\\u043E\\u0432\\u0425\\u0430\\u0440\\u0430\\u043A\\u0442\\u0435\\u0440\\u0438\\u0441\\u0442\\u0438\\u043A.\" + _get_3);\n\t\t\t\tresult = _plus_3;\n\t\t\t}\n\t\t\telse\n\t\t\t{\n\t\t\t\tboolean _startsWith_4 = this.getConfigurationObjectName().startsWith(\"\\u041C\\u0435\\u0442\\u0430\\u0434\\u0430\\u043D\\u043D\\u044B\\u0435.\\u041F\\u043B\\u0430\\u043D\\u044B\\u0412\\u0438\\u0434\\u043E\\u0432\\u0420\\u0430\\u0441\\u0447\\u0435\\u0442\\u0430\");\n\t\t\t\tif (_startsWith_4)\n\t\t\t\t{\n\t\t\t\t\t&lt;%java.lang.String%&gt; _get_4 = this.getConfigurationObjectName().split(\"[.]\")[2];\n\t\t\t\t\t&lt;%java.lang.String%&gt; _plus_4 = (\"\\u041F\\u043B\\u0430\\u043D\\u0412\\u0438\\u0434\\u043E\\u0432\\u0420\\u0430\\u0441\\u0447\\u0435\\u0442\\u0430.\" + _get_4);\n\t\t\t\t\tresult = _plus_4;\n\t\t\t\t}\n\t\t\t\telse\n\t\t\t\t{\n\t\t\t\t\tboolean _startsWith_5 = this.getConfigurationObjectName().startsWith(\"\\u041C\\u0435\\u0442\\u0430\\u0434\\u0430\\u043D\\u043D\\u044B\\u0435.\\u0420\\u0435\\u0433\\u0438\\u0441\\u0442\\u0440\\u044B\\u0421\\u0432\\u0435\\u0434\\u0435\\u043D\\u0438\\u0439\");\n\t\t\t\t\tif (_startsWith_5)\n\t\t\t\t\t{\n\t\t\t\t\t\t&lt;%java.lang.String%&gt; _get_5 = this.getConfigurationObjectName().split(\"[.]\")[2];\n\t\t\t\t\t\t&lt;%java.lang.String%&gt; _plus_5 = (\"\\u0420\\u0435\\u0433\\u0438\\u0441\\u0442\\u0440\\u0421\\u0432\\u0435\\u0434\\u0435\\u043D\\u0438\\u0439.\" + _get_5);\n\t\t\t\t\t\tresult = _plus_5;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t}\n}\nreturn result;'"
	 * @generated
	 */
	String getConfigurationObjectFormattedName();

	/**
	 * Returns the value of the '<em><b>Format Object</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format Object</em>' attribute.
	 * @see #setFormatObject(String)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefined_FormatObject()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getFormatObject();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#getFormatObject <em>Format Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format Object</em>' attribute.
	 * @see #getFormatObject()
	 * @generated
	 */
	void setFormatObject(String value);

	/**
	 * Returns the value of the '<em><b>For Sending</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Sending</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Sending</em>' attribute.
	 * @see #setForSending(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefined_ForSending()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getForSending();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#getForSending <em>For Sending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Sending</em>' attribute.
	 * @see #getForSending()
	 * @generated
	 */
	void setForSending(Boolean value);

	/**
	 * Returns the value of the '<em><b>For Receiving</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Receiving</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Receiving</em>' attribute.
	 * @see #setForReceiving(Boolean)
	 * @see ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage#getCmPredefined_ForReceiving()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getForReceiving();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined#getForReceiving <em>For Receiving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Receiving</em>' attribute.
	 * @see #getForReceiving()
	 * @generated
	 */
	void setForReceiving(Boolean value);

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