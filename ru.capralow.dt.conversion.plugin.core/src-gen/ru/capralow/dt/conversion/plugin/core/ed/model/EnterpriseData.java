/**
 */
package ru.capralow.dt.conversion.plugin.core.ed.model;

import com._1c.g5.v8.dt.metadata.mdclass.XDTOPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enterprise Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getVersion <em>Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getXdtoPackage <em>Xdto Package</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getDefinedTypes <em>Defined Types</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getRefTypes <em>Ref Types</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getCatalogs <em>Catalogs</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getDocuments <em>Documents</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getEnums <em>Enums</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getRegisters <em>Registers</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getUnknownObjects <em>Unknown Objects</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEnterpriseData()
 * @model
 * @generated
 */
public interface EnterpriseData extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEnterpriseData_Version()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Xdto Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xdto Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xdto Package</em>' reference.
	 * @see #setXdtoPackage(XDTOPackage)
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEnterpriseData_XdtoPackage()
	 * @model
	 * @generated
	 */
	XDTOPackage getXdtoPackage();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData#getXdtoPackage <em>Xdto Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xdto Package</em>' reference.
	 * @see #getXdtoPackage()
	 * @generated
	 */
	void setXdtoPackage(XDTOPackage value);

	/**
	 * Returns the value of the '<em><b>Defined Types</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.ed.model.EdDefinedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined Types</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEnterpriseData_DefinedTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdDefinedType> getDefinedTypes();

	/**
	 * Returns the value of the '<em><b>Ref Types</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.ed.model.EdDefinedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Types</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEnterpriseData_RefTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdDefinedType> getRefTypes();

	/**
	 * Returns the value of the '<em><b>Catalogs</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalogs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalogs</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEnterpriseData_Catalogs()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdObject> getCatalogs();

	/**
	 * Returns the value of the '<em><b>Documents</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEnterpriseData_Documents()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdObject> getDocuments();

	/**
	 * Returns the value of the '<em><b>Enums</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enums</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enums</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEnterpriseData_Enums()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdEnum> getEnums();

	/**
	 * Returns the value of the '<em><b>Registers</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registers</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEnterpriseData_Registers()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdObject> getRegisters();

	/**
	 * Returns the value of the '<em><b>Unknown Objects</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.conversion.plugin.core.ed.model.EdObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unknown Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Objects</em>' containment reference list.
	 * @see ru.capralow.dt.conversion.plugin.core.ed.model.edPackage#getEnterpriseData_UnknownObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdObject> getUnknownObjects();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" objectNameUnique="false" propertyNameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdObject%&gt;&gt; _catalogs = this.getCatalogs();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdObject%&gt; fpCatalog : _catalogs)\n{\n\tboolean _equals = fpCatalog.getMainName().equals(objectName);\n\tif (_equals)\n\t{\n\t\t&lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty%&gt; property = fpCatalog.getProperty(propertyName);\n\t\tif ((property == null))\n\t\t{\n\t\t\treturn null;\n\t\t}\n\t\treturn property;\n\t}\n}\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdObject%&gt;&gt; _documents = this.getDocuments();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdObject%&gt; fpDocument : _documents)\n{\n\tboolean _equals_1 = fpDocument.getMainName().equals(objectName);\n\tif (_equals_1)\n\t{\n\t\t&lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty%&gt; property_1 = fpDocument.getProperty(propertyName);\n\t\tif ((property_1 == null))\n\t\t{\n\t\t\treturn null;\n\t\t}\n\t\treturn property_1;\n\t}\n}\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdObject%&gt;&gt; _registers = this.getRegisters();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdObject%&gt; fpRegister : _registers)\n{\n\tboolean _equals_2 = fpRegister.getMainName().equals(objectName);\n\tif (_equals_2)\n\t{\n\t\t&lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty%&gt; property_2 = fpRegister.getProperty(propertyName);\n\t\tif ((property_2 == null))\n\t\t{\n\t\t\treturn null;\n\t\t}\n\t\treturn property_2;\n\t}\n}\nreturn null;'"
	 * @generated
	 */
	EdProperty getProperty(String objectName, String propertyName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdObject%&gt;&gt; _catalogs = this.getCatalogs();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdObject%&gt; fpCatalog : _catalogs)\n{\n\tboolean _equals = fpCatalog.getMainName().equals(name);\n\tif (_equals)\n\t{\n\t\treturn fpCatalog;\n\t}\n}\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdObject%&gt;&gt; _documents = this.getDocuments();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdObject%&gt; fpDocument : _documents)\n{\n\tboolean _equals_1 = fpDocument.getMainName().equals(name);\n\tif (_equals_1)\n\t{\n\t\treturn fpDocument;\n\t}\n}\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdObject%&gt;&gt; _registers = this.getRegisters();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdObject%&gt; fpRegister : _registers)\n{\n\tboolean _equals_2 = fpRegister.getMainName().equals(name);\n\tif (_equals_2)\n\t{\n\t\treturn fpRegister;\n\t}\n}\nreturn null;'"
	 * @generated
	 */
	EdObject getObject(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdDefinedType%&gt;&gt; _definedTypes = this.getDefinedTypes();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdDefinedType%&gt; fpDefinedType : _definedTypes)\n{\n\tboolean _equals = fpDefinedType.getName().equals(name);\n\tif (_equals)\n\t{\n\t\treturn fpDefinedType;\n\t}\n}\nreturn null;'"
	 * @generated
	 */
	EdDefinedType getDefinedType(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum%&gt;&gt; _enums = this.getEnums();\nfor (final &lt;%ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum%&gt; fpEnum : _enums)\n{\n\tboolean _equals = fpEnum.getName().equals(name);\n\tif (_equals)\n\t{\n\t\treturn fpEnum;\n\t}\n}\nreturn null;'"
	 * @generated
	 */
	EdEnum getEnum(String name);

} // EnterpriseData
