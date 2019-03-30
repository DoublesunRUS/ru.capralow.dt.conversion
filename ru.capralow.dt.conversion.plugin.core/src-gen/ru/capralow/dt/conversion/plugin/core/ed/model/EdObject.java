/**
 */
package ru.capralow.dt.conversion.plugin.core.ed.model;

import com._1c.g5.v8.dt.xdto.model.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ed Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getMainName <em>Main Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getKeysName <em>Keys Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getXdtoMainObject <em>Xdto Main Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getXdtoKeysObject <em>Xdto Keys Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getMainProperties <em>Main Properties</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEdObject()
 * @model
 * @generated
 */
public interface EdObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Main Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Name</em>' attribute.
	 * @see #setMainName(String)
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEdObject_MainName()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getMainName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getMainName <em>Main Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Name</em>' attribute.
	 * @see #getMainName()
	 * @generated
	 */
	void setMainName(String value);

	/**
	 * Returns the value of the '<em><b>Keys Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys Name</em>' attribute.
	 * @see #setKeysName(String)
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEdObject_KeysName()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getKeysName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getKeysName <em>Keys Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keys Name</em>' attribute.
	 * @see #getKeysName()
	 * @generated
	 */
	void setKeysName(String value);

	/**
	 * Returns the value of the '<em><b>Xdto Main Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xdto Main Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xdto Main Object</em>' reference.
	 * @see #setXdtoMainObject(ObjectType)
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEdObject_XdtoMainObject()
	 * @model
	 * @generated
	 */
	ObjectType getXdtoMainObject();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getXdtoMainObject <em>Xdto Main Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xdto Main Object</em>' reference.
	 * @see #getXdtoMainObject()
	 * @generated
	 */
	void setXdtoMainObject(ObjectType value);

	/**
	 * Returns the value of the '<em><b>Xdto Keys Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xdto Keys Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xdto Keys Object</em>' reference.
	 * @see #setXdtoKeysObject(ObjectType)
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEdObject_XdtoKeysObject()
	 * @model
	 * @generated
	 */
	ObjectType getXdtoKeysObject();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject#getXdtoKeysObject <em>Xdto Keys Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xdto Keys Object</em>' reference.
	 * @see #getXdtoKeysObject()
	 * @generated
	 */
	void setXdtoKeysObject(ObjectType value);

	/**
	 * Returns the value of the '<em><b>Main Properties</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Properties</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEdObject_MainProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdProperty> getMainProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty%&gt;&gt; _mainProperties = this.getMainProperties();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty%&gt; edProperty : _mainProperties)\n{\n\tboolean _equals = name.equals(edProperty.getName());\n\tif (_equals)\n\t{\n\t\treturn edProperty;\n\t}\n}\nreturn null;'"
	 * @generated
	 */
	EdProperty getProperty(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty%&gt;&gt; keyProperties = &lt;%org.eclipse.emf.ecore.xcore.lib.XcoreCollectionLiterals%&gt;.&lt;&lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty%&gt;&gt;newBasicEList();\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty%&gt;&gt; _mainProperties = this.getMainProperties();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty%&gt; edProperty : _mainProperties)\n{\n\t&lt;%java.lang.Boolean%&gt; _isKey = edProperty.getIsKey();\n\tif ((_isKey).booleanValue())\n\t{\n\t\tkeyProperties.add(edProperty);\n\t}\n}\nreturn keyProperties;'"
	 * @generated
	 */
	EList<EdProperty> getKeyProperties();

} // EdObject
