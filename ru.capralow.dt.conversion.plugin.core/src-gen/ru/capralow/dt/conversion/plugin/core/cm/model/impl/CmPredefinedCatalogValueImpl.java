/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model.impl;

import com._1c.g5.v8.dt.metadata.mdclass.CatalogPredefinedItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedCatalogValue;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cm Predefined Catalog Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedCatalogValueImpl#getConfigurationValue <em>Configuration Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmPredefinedCatalogValueImpl extends CmPredefinedValueImpl implements CmPredefinedCatalogValue {
	/**
	 * The cached value of the '{@link #getConfigurationValue() <em>Configuration Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationValue()
	 * @generated
	 * @ordered
	 */
	protected CatalogPredefinedItem configurationValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmPredefinedCatalogValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cmPackage.Literals.CM_PREDEFINED_CATALOG_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogPredefinedItem getConfigurationValue() {
		if (configurationValue != null && configurationValue.eIsProxy()) {
			InternalEObject oldConfigurationValue = (InternalEObject)configurationValue;
			configurationValue = (CatalogPredefinedItem)eResolveProxy(oldConfigurationValue);
			if (configurationValue != oldConfigurationValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cmPackage.CM_PREDEFINED_CATALOG_VALUE__CONFIGURATION_VALUE, oldConfigurationValue, configurationValue));
			}
		}
		return configurationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogPredefinedItem basicGetConfigurationValue() {
		return configurationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationValue(CatalogPredefinedItem newConfigurationValue) {
		CatalogPredefinedItem oldConfigurationValue = configurationValue;
		configurationValue = newConfigurationValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_PREDEFINED_CATALOG_VALUE__CONFIGURATION_VALUE, oldConfigurationValue, configurationValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case cmPackage.CM_PREDEFINED_CATALOG_VALUE__CONFIGURATION_VALUE:
				if (resolve) return getConfigurationValue();
				return basicGetConfigurationValue();
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
			case cmPackage.CM_PREDEFINED_CATALOG_VALUE__CONFIGURATION_VALUE:
				setConfigurationValue((CatalogPredefinedItem)newValue);
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
			case cmPackage.CM_PREDEFINED_CATALOG_VALUE__CONFIGURATION_VALUE:
				setConfigurationValue((CatalogPredefinedItem)null);
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
			case cmPackage.CM_PREDEFINED_CATALOG_VALUE__CONFIGURATION_VALUE:
				return configurationValue != null;
		}
		return super.eIsSet(featureID);
	}

} //CmPredefinedCatalogValueImpl
