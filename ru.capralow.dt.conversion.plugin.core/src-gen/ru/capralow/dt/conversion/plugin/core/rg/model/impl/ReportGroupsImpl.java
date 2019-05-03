/**
 */
package ru.capralow.dt.conversion.plugin.core.rg.model.impl;

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

import ru.capralow.dt.conversion.plugin.core.rg.model.ReportGroups;
import ru.capralow.dt.conversion.plugin.core.rg.model.RgVariant;
import ru.capralow.dt.conversion.plugin.core.rg.model.rgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report Groups</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rg.model.impl.ReportGroupsImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.rg.model.impl.ReportGroupsImpl#getAddObjectsList <em>Add Objects List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportGroupsImpl extends MinimalEObjectImpl.Container implements ReportGroups {
	/**
	 * The cached value of the '{@link #getVariants() <em>Variants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariants()
	 * @generated
	 * @ordered
	 */
	protected EList<RgVariant> variants;

	/**
	 * The default value of the '{@link #getAddObjectsList() <em>Add Objects List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddObjectsList()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ADD_OBJECTS_LIST_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getAddObjectsList() <em>Add Objects List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddObjectsList()
	 * @generated
	 * @ordered
	 */
	protected Boolean addObjectsList = ADD_OBJECTS_LIST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportGroupsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rgPackage.Literals.REPORT_GROUPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RgVariant> getVariants() {
		if (variants == null) {
			variants = new EObjectContainmentEList<RgVariant>(RgVariant.class, this, rgPackage.REPORT_GROUPS__VARIANTS);
		}
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAddObjectsList() {
		return addObjectsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddObjectsList(Boolean newAddObjectsList) {
		Boolean oldAddObjectsList = addObjectsList;
		addObjectsList = newAddObjectsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rgPackage.REPORT_GROUPS__ADD_OBJECTS_LIST, oldAddObjectsList, addObjectsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case rgPackage.REPORT_GROUPS__VARIANTS:
				return ((InternalEList<?>)getVariants()).basicRemove(otherEnd, msgs);
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
			case rgPackage.REPORT_GROUPS__VARIANTS:
				return getVariants();
			case rgPackage.REPORT_GROUPS__ADD_OBJECTS_LIST:
				return getAddObjectsList();
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
			case rgPackage.REPORT_GROUPS__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends RgVariant>)newValue);
				return;
			case rgPackage.REPORT_GROUPS__ADD_OBJECTS_LIST:
				setAddObjectsList((Boolean)newValue);
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
			case rgPackage.REPORT_GROUPS__VARIANTS:
				getVariants().clear();
				return;
			case rgPackage.REPORT_GROUPS__ADD_OBJECTS_LIST:
				setAddObjectsList(ADD_OBJECTS_LIST_EDEFAULT);
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
			case rgPackage.REPORT_GROUPS__VARIANTS:
				return variants != null && !variants.isEmpty();
			case rgPackage.REPORT_GROUPS__ADD_OBJECTS_LIST:
				return ADD_OBJECTS_LIST_EDEFAULT == null ? addObjectsList != null : !ADD_OBJECTS_LIST_EDEFAULT.equals(addObjectsList);
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
		result.append(" (addObjectsList: "); //$NON-NLS-1$
		result.append(addObjectsList);
		result.append(')');
		return result.toString();
	}

} //ReportGroupsImpl
