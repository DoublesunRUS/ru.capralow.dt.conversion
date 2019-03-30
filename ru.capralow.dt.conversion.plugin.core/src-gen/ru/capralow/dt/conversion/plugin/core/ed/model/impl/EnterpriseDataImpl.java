/**
 */
package ru.capralow.dt.conversion.plugin.core.ed.model.impl;

import com._1c.g5.v8.dt.metadata.mdclass.XDTOPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.capralow.dt.conversion.plugin.core.ed.model.EdDefinedType;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdEnum;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdObject;
import ru.capralow.dt.conversion.plugin.core.ed.model.EdProperty;
import ru.capralow.dt.conversion.plugin.core.ed.model.EnterpriseData;
import ru.capralow.dt.conversion.plugin.core.ed.model.edPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enterprise Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EnterpriseDataImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EnterpriseDataImpl#getXdtoPackage <em>Xdto Package</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EnterpriseDataImpl#getDefinedTypes <em>Defined Types</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EnterpriseDataImpl#getRefTypes <em>Ref Types</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EnterpriseDataImpl#getCatalogs <em>Catalogs</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EnterpriseDataImpl#getDocuments <em>Documents</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EnterpriseDataImpl#getEnums <em>Enums</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EnterpriseDataImpl#getRegisters <em>Registers</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ed.model.impl.EnterpriseDataImpl#getUnknownObjects <em>Unknown Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnterpriseDataImpl extends MinimalEObjectImpl.Container implements EnterpriseData {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXdtoPackage() <em>Xdto Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXdtoPackage()
	 * @generated
	 * @ordered
	 */
	protected XDTOPackage xdtoPackage;

	/**
	 * The cached value of the '{@link #getDefinedTypes() <em>Defined Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EdDefinedType> definedTypes;

	/**
	 * The cached value of the '{@link #getRefTypes() <em>Ref Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EdDefinedType> refTypes;

	/**
	 * The cached value of the '{@link #getCatalogs() <em>Catalogs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogs()
	 * @generated
	 * @ordered
	 */
	protected EList<EdObject> catalogs;

	/**
	 * The cached value of the '{@link #getDocuments() <em>Documents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<EdObject> documents;

	/**
	 * The cached value of the '{@link #getEnums() <em>Enums</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnums()
	 * @generated
	 * @ordered
	 */
	protected EList<EdEnum> enums;

	/**
	 * The cached value of the '{@link #getRegisters() <em>Registers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisters()
	 * @generated
	 * @ordered
	 */
	protected EList<EdObject> registers;

	/**
	 * The cached value of the '{@link #getUnknownObjects() <em>Unknown Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<EdObject> unknownObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnterpriseDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return edPackage.Literals.ENTERPRISE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, edPackage.ENTERPRISE_DATA__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDTOPackage getXdtoPackage() {
		if (xdtoPackage != null && xdtoPackage.eIsProxy()) {
			InternalEObject oldXdtoPackage = (InternalEObject)xdtoPackage;
			xdtoPackage = (XDTOPackage)eResolveProxy(oldXdtoPackage);
			if (xdtoPackage != oldXdtoPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, edPackage.ENTERPRISE_DATA__XDTO_PACKAGE, oldXdtoPackage, xdtoPackage));
			}
		}
		return xdtoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDTOPackage basicGetXdtoPackage() {
		return xdtoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXdtoPackage(XDTOPackage newXdtoPackage) {
		XDTOPackage oldXdtoPackage = xdtoPackage;
		xdtoPackage = newXdtoPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, edPackage.ENTERPRISE_DATA__XDTO_PACKAGE, oldXdtoPackage, xdtoPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EdDefinedType> getDefinedTypes() {
		if (definedTypes == null) {
			definedTypes = new EObjectContainmentEList<EdDefinedType>(EdDefinedType.class, this, edPackage.ENTERPRISE_DATA__DEFINED_TYPES);
		}
		return definedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EdDefinedType> getRefTypes() {
		if (refTypes == null) {
			refTypes = new EObjectContainmentEList<EdDefinedType>(EdDefinedType.class, this, edPackage.ENTERPRISE_DATA__REF_TYPES);
		}
		return refTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EdObject> getCatalogs() {
		if (catalogs == null) {
			catalogs = new EObjectContainmentEList<EdObject>(EdObject.class, this, edPackage.ENTERPRISE_DATA__CATALOGS);
		}
		return catalogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EdObject> getDocuments() {
		if (documents == null) {
			documents = new EObjectContainmentEList<EdObject>(EdObject.class, this, edPackage.ENTERPRISE_DATA__DOCUMENTS);
		}
		return documents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EdEnum> getEnums() {
		if (enums == null) {
			enums = new EObjectContainmentEList<EdEnum>(EdEnum.class, this, edPackage.ENTERPRISE_DATA__ENUMS);
		}
		return enums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EdObject> getRegisters() {
		if (registers == null) {
			registers = new EObjectContainmentEList<EdObject>(EdObject.class, this, edPackage.ENTERPRISE_DATA__REGISTERS);
		}
		return registers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EdObject> getUnknownObjects() {
		if (unknownObjects == null) {
			unknownObjects = new EObjectContainmentEList<EdObject>(EdObject.class, this, edPackage.ENTERPRISE_DATA__UNKNOWN_OBJECTS);
		}
		return unknownObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdProperty getProperty(final String objectName, final String propertyName) {
		EList<EdObject> _catalogs = this.getCatalogs();
		for (final EdObject fpCatalog : _catalogs) {
			boolean _equals = fpCatalog.getMainName().equals(objectName);
			if (_equals) {
				EdProperty property = fpCatalog.getProperty(propertyName);
				if ((property == null)) {
					return null;
				}
				return property;
			}
		}
		EList<EdObject> _documents = this.getDocuments();
		for (final EdObject fpDocument : _documents) {
			boolean _equals_1 = fpDocument.getMainName().equals(objectName);
			if (_equals_1) {
				EdProperty property_1 = fpDocument.getProperty(propertyName);
				if ((property_1 == null)) {
					return null;
				}
				return property_1;
			}
		}
		EList<EdObject> _registers = this.getRegisters();
		for (final EdObject fpRegister : _registers) {
			boolean _equals_2 = fpRegister.getMainName().equals(objectName);
			if (_equals_2) {
				EdProperty property_2 = fpRegister.getProperty(propertyName);
				if ((property_2 == null)) {
					return null;
				}
				return property_2;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdObject getObject(final String name) {
		EList<EdObject> _catalogs = this.getCatalogs();
		for (final EdObject fpCatalog : _catalogs) {
			boolean _equals = fpCatalog.getMainName().equals(name);
			if (_equals) {
				return fpCatalog;
			}
		}
		EList<EdObject> _documents = this.getDocuments();
		for (final EdObject fpDocument : _documents) {
			boolean _equals_1 = fpDocument.getMainName().equals(name);
			if (_equals_1) {
				return fpDocument;
			}
		}
		EList<EdObject> _registers = this.getRegisters();
		for (final EdObject fpRegister : _registers) {
			boolean _equals_2 = fpRegister.getMainName().equals(name);
			if (_equals_2) {
				return fpRegister;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdDefinedType getDefinedType(final String name) {
		EList<EdDefinedType> _definedTypes = this.getDefinedTypes();
		for (final EdDefinedType fpDefinedType : _definedTypes) {
			boolean _equals = fpDefinedType.getName().equals(name);
			if (_equals) {
				return fpDefinedType;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdEnum getEnum(final String name) {
		EList<EdEnum> _enums = this.getEnums();
		for (final EdEnum fpEnum : _enums) {
			boolean _equals = fpEnum.getName().equals(name);
			if (_equals) {
				return fpEnum;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case edPackage.ENTERPRISE_DATA__DEFINED_TYPES:
				return ((InternalEList<?>)getDefinedTypes()).basicRemove(otherEnd, msgs);
			case edPackage.ENTERPRISE_DATA__REF_TYPES:
				return ((InternalEList<?>)getRefTypes()).basicRemove(otherEnd, msgs);
			case edPackage.ENTERPRISE_DATA__CATALOGS:
				return ((InternalEList<?>)getCatalogs()).basicRemove(otherEnd, msgs);
			case edPackage.ENTERPRISE_DATA__DOCUMENTS:
				return ((InternalEList<?>)getDocuments()).basicRemove(otherEnd, msgs);
			case edPackage.ENTERPRISE_DATA__ENUMS:
				return ((InternalEList<?>)getEnums()).basicRemove(otherEnd, msgs);
			case edPackage.ENTERPRISE_DATA__REGISTERS:
				return ((InternalEList<?>)getRegisters()).basicRemove(otherEnd, msgs);
			case edPackage.ENTERPRISE_DATA__UNKNOWN_OBJECTS:
				return ((InternalEList<?>)getUnknownObjects()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case edPackage.ENTERPRISE_DATA__VERSION:
				return getVersion();
			case edPackage.ENTERPRISE_DATA__XDTO_PACKAGE:
				if (resolve) return getXdtoPackage();
				return basicGetXdtoPackage();
			case edPackage.ENTERPRISE_DATA__DEFINED_TYPES:
				return getDefinedTypes();
			case edPackage.ENTERPRISE_DATA__REF_TYPES:
				return getRefTypes();
			case edPackage.ENTERPRISE_DATA__CATALOGS:
				return getCatalogs();
			case edPackage.ENTERPRISE_DATA__DOCUMENTS:
				return getDocuments();
			case edPackage.ENTERPRISE_DATA__ENUMS:
				return getEnums();
			case edPackage.ENTERPRISE_DATA__REGISTERS:
				return getRegisters();
			case edPackage.ENTERPRISE_DATA__UNKNOWN_OBJECTS:
				return getUnknownObjects();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case edPackage.ENTERPRISE_DATA__VERSION:
				setVersion((String)newValue);
				return;
			case edPackage.ENTERPRISE_DATA__XDTO_PACKAGE:
				setXdtoPackage((XDTOPackage)newValue);
				return;
			case edPackage.ENTERPRISE_DATA__DEFINED_TYPES:
				getDefinedTypes().clear();
				getDefinedTypes().addAll((Collection<? extends EdDefinedType>)newValue);
				return;
			case edPackage.ENTERPRISE_DATA__REF_TYPES:
				getRefTypes().clear();
				getRefTypes().addAll((Collection<? extends EdDefinedType>)newValue);
				return;
			case edPackage.ENTERPRISE_DATA__CATALOGS:
				getCatalogs().clear();
				getCatalogs().addAll((Collection<? extends EdObject>)newValue);
				return;
			case edPackage.ENTERPRISE_DATA__DOCUMENTS:
				getDocuments().clear();
				getDocuments().addAll((Collection<? extends EdObject>)newValue);
				return;
			case edPackage.ENTERPRISE_DATA__ENUMS:
				getEnums().clear();
				getEnums().addAll((Collection<? extends EdEnum>)newValue);
				return;
			case edPackage.ENTERPRISE_DATA__REGISTERS:
				getRegisters().clear();
				getRegisters().addAll((Collection<? extends EdObject>)newValue);
				return;
			case edPackage.ENTERPRISE_DATA__UNKNOWN_OBJECTS:
				getUnknownObjects().clear();
				getUnknownObjects().addAll((Collection<? extends EdObject>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case edPackage.ENTERPRISE_DATA__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case edPackage.ENTERPRISE_DATA__XDTO_PACKAGE:
				setXdtoPackage((XDTOPackage)null);
				return;
			case edPackage.ENTERPRISE_DATA__DEFINED_TYPES:
				getDefinedTypes().clear();
				return;
			case edPackage.ENTERPRISE_DATA__REF_TYPES:
				getRefTypes().clear();
				return;
			case edPackage.ENTERPRISE_DATA__CATALOGS:
				getCatalogs().clear();
				return;
			case edPackage.ENTERPRISE_DATA__DOCUMENTS:
				getDocuments().clear();
				return;
			case edPackage.ENTERPRISE_DATA__ENUMS:
				getEnums().clear();
				return;
			case edPackage.ENTERPRISE_DATA__REGISTERS:
				getRegisters().clear();
				return;
			case edPackage.ENTERPRISE_DATA__UNKNOWN_OBJECTS:
				getUnknownObjects().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case edPackage.ENTERPRISE_DATA__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case edPackage.ENTERPRISE_DATA__XDTO_PACKAGE:
				return xdtoPackage != null;
			case edPackage.ENTERPRISE_DATA__DEFINED_TYPES:
				return definedTypes != null && !definedTypes.isEmpty();
			case edPackage.ENTERPRISE_DATA__REF_TYPES:
				return refTypes != null && !refTypes.isEmpty();
			case edPackage.ENTERPRISE_DATA__CATALOGS:
				return catalogs != null && !catalogs.isEmpty();
			case edPackage.ENTERPRISE_DATA__DOCUMENTS:
				return documents != null && !documents.isEmpty();
			case edPackage.ENTERPRISE_DATA__ENUMS:
				return enums != null && !enums.isEmpty();
			case edPackage.ENTERPRISE_DATA__REGISTERS:
				return registers != null && !registers.isEmpty();
			case edPackage.ENTERPRISE_DATA__UNKNOWN_OBJECTS:
				return unknownObjects != null && !unknownObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case edPackage.ENTERPRISE_DATA___GET_PROPERTY__STRING_STRING:
				return getProperty((String)arguments.get(0), (String)arguments.get(1));
			case edPackage.ENTERPRISE_DATA___GET_OBJECT__STRING:
				return getObject((String)arguments.get(0));
			case edPackage.ENTERPRISE_DATA___GET_DEFINED_TYPE__STRING:
				return getDefinedType((String)arguments.get(0));
			case edPackage.ENTERPRISE_DATA___GET_ENUM__STRING:
				return getEnum((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (version: "); //$NON-NLS-1$
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //EnterpriseDataImpl
