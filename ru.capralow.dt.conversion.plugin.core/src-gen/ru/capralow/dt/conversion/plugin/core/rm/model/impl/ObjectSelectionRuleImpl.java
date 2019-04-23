/**
 */
package ru.capralow.dt.conversion.plugin.core.rm.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.capralow.dt.conversion.plugin.core.rm.model.ObjectSelectionRule;
import ru.capralow.dt.conversion.plugin.core.rm.model.rmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Selection Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rm.model.impl.ObjectSelectionRuleImpl#getIsFolder <em>Is Folder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectSelectionRuleImpl extends MinimalEObjectImpl.Container implements ObjectSelectionRule {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectSelectionRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rmPackage.Literals.OBJECT_SELECTION_RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, rmPackage.OBJECT_SELECTION_RULE__IS_FOLDER, oldIsFolder, isFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rmPackage.OBJECT_SELECTION_RULE__IS_FOLDER:
				return getIsFolder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case rmPackage.OBJECT_SELECTION_RULE__IS_FOLDER:
				setIsFolder((Boolean)newValue);
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
			case rmPackage.OBJECT_SELECTION_RULE__IS_FOLDER:
				setIsFolder(IS_FOLDER_EDEFAULT);
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
			case rmPackage.OBJECT_SELECTION_RULE__IS_FOLDER:
				return IS_FOLDER_EDEFAULT == null ? isFolder != null : !IS_FOLDER_EDEFAULT.equals(isFolder);
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
		result.append(')');
		return result.toString();
	}

} //ObjectSelectionRuleImpl
