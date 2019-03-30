/**
 */
package ru.capralow.dt.conversion.plugin.core.rm.model.impl;

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

import ru.capralow.dt.conversion.plugin.core.rm.model.ExchangePlanSelectionRule;
import ru.capralow.dt.conversion.plugin.core.rm.model.ObjectSelectionRule;
import ru.capralow.dt.conversion.plugin.core.rm.model.RegistrationRule;
import ru.capralow.dt.conversion.plugin.core.rm.model.rmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registration Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationRuleImpl#getIsFolder <em>Is Folder</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationRuleImpl#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationRuleImpl#getValid <em>Valid</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationRuleImpl#getCode <em>Code</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationRuleImpl#getMdObject <em>Md Object</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationRuleImpl#getObjectName <em>Object Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationRuleImpl#getMdClass <em>Md Class</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationRuleImpl#getAttributeSendMode <em>Attribute Send Mode</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationRuleImpl#getObjectSelectionRules <em>Object Selection Rules</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.RegistrationRuleImpl#getExchangePlanSelectionRules <em>Exchange Plan Selection Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegistrationRuleImpl extends MinimalEObjectImpl.Container implements RegistrationRule {
	/**
	 * The default value of the '{@link #getIsFolder() <em>Is Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFolder()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_FOLDER_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsFolder() <em>Is Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFolder()
	 * @generated
	 * @ordered
	 */
	protected Boolean isFolder = IS_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DISABLED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean disabled = DISABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValid()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VALID_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValid()
	 * @generated
	 * @ordered
	 */
	protected Boolean valid = VALID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMdObject() <em>Md Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdObject()
	 * @generated
	 * @ordered
	 */
	protected static final String MD_OBJECT_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getMdObject() <em>Md Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdObject()
	 * @generated
	 * @ordered
	 */
	protected String mdObject = MD_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectName() <em>Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_NAME_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getObjectName() <em>Object Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectName()
	 * @generated
	 * @ordered
	 */
	protected String objectName = OBJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMdClass() <em>Md Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdClass()
	 * @generated
	 * @ordered
	 */
	protected static final String MD_CLASS_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getMdClass() <em>Md Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdClass()
	 * @generated
	 * @ordered
	 */
	protected String mdClass = MD_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeSendMode() <em>Attribute Send Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeSendMode()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_SEND_MODE_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getAttributeSendMode() <em>Attribute Send Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeSendMode()
	 * @generated
	 * @ordered
	 */
	protected String attributeSendMode = ATTRIBUTE_SEND_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObjectSelectionRules() <em>Object Selection Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectSelectionRules()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectSelectionRule> objectSelectionRules;

	/**
	 * The cached value of the '{@link #getExchangePlanSelectionRules() <em>Exchange Plan Selection Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangePlanSelectionRules()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangePlanSelectionRule> exchangePlanSelectionRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistrationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rmPackage.Literals.REGISTRATION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsFolder() {
		return isFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFolder(Boolean newIsFolder) {
		Boolean oldIsFolder = isFolder;
		isFolder = newIsFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rmPackage.REGISTRATION_RULE__IS_FOLDER, oldIsFolder, isFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getDisabled() {
		return disabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(Boolean newDisabled) {
		Boolean oldDisabled = disabled;
		disabled = newDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rmPackage.REGISTRATION_RULE__DISABLED, oldDisabled, disabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getValid() {
		return valid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValid(Boolean newValid) {
		Boolean oldValid = valid;
		valid = newValid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rmPackage.REGISTRATION_RULE__VALID, oldValid, valid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rmPackage.REGISTRATION_RULE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rmPackage.REGISTRATION_RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMdObject() {
		return mdObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdObject(String newMdObject) {
		String oldMdObject = mdObject;
		mdObject = newMdObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rmPackage.REGISTRATION_RULE__MD_OBJECT, oldMdObject, mdObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectName() {
		return objectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectName(String newObjectName) {
		String oldObjectName = objectName;
		objectName = newObjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rmPackage.REGISTRATION_RULE__OBJECT_NAME, oldObjectName, objectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMdClass() {
		return mdClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdClass(String newMdClass) {
		String oldMdClass = mdClass;
		mdClass = newMdClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rmPackage.REGISTRATION_RULE__MD_CLASS, oldMdClass, mdClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeSendMode() {
		return attributeSendMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeSendMode(String newAttributeSendMode) {
		String oldAttributeSendMode = attributeSendMode;
		attributeSendMode = newAttributeSendMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rmPackage.REGISTRATION_RULE__ATTRIBUTE_SEND_MODE, oldAttributeSendMode, attributeSendMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectSelectionRule> getObjectSelectionRules() {
		if (objectSelectionRules == null) {
			objectSelectionRules = new EObjectContainmentEList<ObjectSelectionRule>(ObjectSelectionRule.class, this, rmPackage.REGISTRATION_RULE__OBJECT_SELECTION_RULES);
		}
		return objectSelectionRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangePlanSelectionRule> getExchangePlanSelectionRules() {
		if (exchangePlanSelectionRules == null) {
			exchangePlanSelectionRules = new EObjectContainmentEList<ExchangePlanSelectionRule>(ExchangePlanSelectionRule.class, this, rmPackage.REGISTRATION_RULE__EXCHANGE_PLAN_SELECTION_RULES);
		}
		return exchangePlanSelectionRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case rmPackage.REGISTRATION_RULE__OBJECT_SELECTION_RULES:
				return ((InternalEList<?>)getObjectSelectionRules()).basicRemove(otherEnd, msgs);
			case rmPackage.REGISTRATION_RULE__EXCHANGE_PLAN_SELECTION_RULES:
				return ((InternalEList<?>)getExchangePlanSelectionRules()).basicRemove(otherEnd, msgs);
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
			case rmPackage.REGISTRATION_RULE__IS_FOLDER:
				return getIsFolder();
			case rmPackage.REGISTRATION_RULE__DISABLED:
				return getDisabled();
			case rmPackage.REGISTRATION_RULE__VALID:
				return getValid();
			case rmPackage.REGISTRATION_RULE__CODE:
				return getCode();
			case rmPackage.REGISTRATION_RULE__NAME:
				return getName();
			case rmPackage.REGISTRATION_RULE__MD_OBJECT:
				return getMdObject();
			case rmPackage.REGISTRATION_RULE__OBJECT_NAME:
				return getObjectName();
			case rmPackage.REGISTRATION_RULE__MD_CLASS:
				return getMdClass();
			case rmPackage.REGISTRATION_RULE__ATTRIBUTE_SEND_MODE:
				return getAttributeSendMode();
			case rmPackage.REGISTRATION_RULE__OBJECT_SELECTION_RULES:
				return getObjectSelectionRules();
			case rmPackage.REGISTRATION_RULE__EXCHANGE_PLAN_SELECTION_RULES:
				return getExchangePlanSelectionRules();
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
			case rmPackage.REGISTRATION_RULE__IS_FOLDER:
				setIsFolder((Boolean)newValue);
				return;
			case rmPackage.REGISTRATION_RULE__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case rmPackage.REGISTRATION_RULE__VALID:
				setValid((Boolean)newValue);
				return;
			case rmPackage.REGISTRATION_RULE__CODE:
				setCode((String)newValue);
				return;
			case rmPackage.REGISTRATION_RULE__NAME:
				setName((String)newValue);
				return;
			case rmPackage.REGISTRATION_RULE__MD_OBJECT:
				setMdObject((String)newValue);
				return;
			case rmPackage.REGISTRATION_RULE__OBJECT_NAME:
				setObjectName((String)newValue);
				return;
			case rmPackage.REGISTRATION_RULE__MD_CLASS:
				setMdClass((String)newValue);
				return;
			case rmPackage.REGISTRATION_RULE__ATTRIBUTE_SEND_MODE:
				setAttributeSendMode((String)newValue);
				return;
			case rmPackage.REGISTRATION_RULE__OBJECT_SELECTION_RULES:
				getObjectSelectionRules().clear();
				getObjectSelectionRules().addAll((Collection<? extends ObjectSelectionRule>)newValue);
				return;
			case rmPackage.REGISTRATION_RULE__EXCHANGE_PLAN_SELECTION_RULES:
				getExchangePlanSelectionRules().clear();
				getExchangePlanSelectionRules().addAll((Collection<? extends ExchangePlanSelectionRule>)newValue);
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
			case rmPackage.REGISTRATION_RULE__IS_FOLDER:
				setIsFolder(IS_FOLDER_EDEFAULT);
				return;
			case rmPackage.REGISTRATION_RULE__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case rmPackage.REGISTRATION_RULE__VALID:
				setValid(VALID_EDEFAULT);
				return;
			case rmPackage.REGISTRATION_RULE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case rmPackage.REGISTRATION_RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case rmPackage.REGISTRATION_RULE__MD_OBJECT:
				setMdObject(MD_OBJECT_EDEFAULT);
				return;
			case rmPackage.REGISTRATION_RULE__OBJECT_NAME:
				setObjectName(OBJECT_NAME_EDEFAULT);
				return;
			case rmPackage.REGISTRATION_RULE__MD_CLASS:
				setMdClass(MD_CLASS_EDEFAULT);
				return;
			case rmPackage.REGISTRATION_RULE__ATTRIBUTE_SEND_MODE:
				setAttributeSendMode(ATTRIBUTE_SEND_MODE_EDEFAULT);
				return;
			case rmPackage.REGISTRATION_RULE__OBJECT_SELECTION_RULES:
				getObjectSelectionRules().clear();
				return;
			case rmPackage.REGISTRATION_RULE__EXCHANGE_PLAN_SELECTION_RULES:
				getExchangePlanSelectionRules().clear();
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
			case rmPackage.REGISTRATION_RULE__IS_FOLDER:
				return IS_FOLDER_EDEFAULT == null ? isFolder != null : !IS_FOLDER_EDEFAULT.equals(isFolder);
			case rmPackage.REGISTRATION_RULE__DISABLED:
				return DISABLED_EDEFAULT == null ? disabled != null : !DISABLED_EDEFAULT.equals(disabled);
			case rmPackage.REGISTRATION_RULE__VALID:
				return VALID_EDEFAULT == null ? valid != null : !VALID_EDEFAULT.equals(valid);
			case rmPackage.REGISTRATION_RULE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case rmPackage.REGISTRATION_RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case rmPackage.REGISTRATION_RULE__MD_OBJECT:
				return MD_OBJECT_EDEFAULT == null ? mdObject != null : !MD_OBJECT_EDEFAULT.equals(mdObject);
			case rmPackage.REGISTRATION_RULE__OBJECT_NAME:
				return OBJECT_NAME_EDEFAULT == null ? objectName != null : !OBJECT_NAME_EDEFAULT.equals(objectName);
			case rmPackage.REGISTRATION_RULE__MD_CLASS:
				return MD_CLASS_EDEFAULT == null ? mdClass != null : !MD_CLASS_EDEFAULT.equals(mdClass);
			case rmPackage.REGISTRATION_RULE__ATTRIBUTE_SEND_MODE:
				return ATTRIBUTE_SEND_MODE_EDEFAULT == null ? attributeSendMode != null : !ATTRIBUTE_SEND_MODE_EDEFAULT.equals(attributeSendMode);
			case rmPackage.REGISTRATION_RULE__OBJECT_SELECTION_RULES:
				return objectSelectionRules != null && !objectSelectionRules.isEmpty();
			case rmPackage.REGISTRATION_RULE__EXCHANGE_PLAN_SELECTION_RULES:
				return exchangePlanSelectionRules != null && !exchangePlanSelectionRules.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (isFolder: "); //$NON-NLS-1$
		result.append(isFolder);
		result.append(", disabled: "); //$NON-NLS-1$
		result.append(disabled);
		result.append(", valid: "); //$NON-NLS-1$
		result.append(valid);
		result.append(", code: "); //$NON-NLS-1$
		result.append(code);
		result.append(", name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", mdObject: "); //$NON-NLS-1$
		result.append(mdObject);
		result.append(", objectName: "); //$NON-NLS-1$
		result.append(objectName);
		result.append(", mdClass: "); //$NON-NLS-1$
		result.append(mdClass);
		result.append(", attributeSendMode: "); //$NON-NLS-1$
		result.append(attributeSendMode);
		result.append(')');
		return result.toString();
	}

} //RegistrationRuleImpl
