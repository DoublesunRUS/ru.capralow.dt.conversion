/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model.impl;

import com._1c.g5.v8.dt.metadata.mdclass.Subsystem;

import com.google.common.base.Objects;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.capralow.dt.conversion.plugin.core.cm.model.CmSpecialSubsystemType;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmSubsystem;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cm Subsystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmSubsystemImpl#getSubsystem <em>Subsystem</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmSubsystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmSubsystemImpl#getSpecialSubsystemType <em>Special Subsystem Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmSubsystemImpl extends MinimalEObjectImpl.Container implements CmSubsystem {
	/**
	 * The cached value of the '{@link #getSubsystem() <em>Subsystem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystem()
	 * @generated
	 * @ordered
	 */
	protected Subsystem subsystem;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSpecialSubsystemType() <em>Special Subsystem Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialSubsystemType()
	 * @generated
	 * @ordered
	 */
	protected static final CmSpecialSubsystemType SPECIAL_SUBSYSTEM_TYPE_EDEFAULT = CmSpecialSubsystemType.SUBSYSTEM;

	/**
	 * The cached value of the '{@link #getSpecialSubsystemType() <em>Special Subsystem Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialSubsystemType()
	 * @generated
	 * @ordered
	 */
	protected CmSpecialSubsystemType specialSubsystemType = SPECIAL_SUBSYSTEM_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmSubsystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cmPackage.Literals.CM_SUBSYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subsystem getSubsystem() {
		if (subsystem != null && subsystem.eIsProxy()) {
			InternalEObject oldSubsystem = (InternalEObject)subsystem;
			subsystem = (Subsystem)eResolveProxy(oldSubsystem);
			if (subsystem != oldSubsystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, cmPackage.CM_SUBSYSTEM__SUBSYSTEM, oldSubsystem, subsystem));
			}
		}
		return subsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subsystem basicGetSubsystem() {
		return subsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsystem(Subsystem newSubsystem) {
		Subsystem oldSubsystem = subsystem;
		subsystem = newSubsystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_SUBSYSTEM__SUBSYSTEM, oldSubsystem, subsystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		String name = "";
		CmSpecialSubsystemType _specialSubsystemType = this.getSpecialSubsystemType();
		boolean _equals = Objects.equal(_specialSubsystemType, CmSpecialSubsystemType.SUBSYSTEM);
		if (_equals) {
			name = this.getSubsystem().getSynonym().get("ru");
		}
		else {
			name = this.getSpecialSubsystemType().getLiteral();
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmSpecialSubsystemType getSpecialSubsystemType() {
		return specialSubsystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialSubsystemType(CmSpecialSubsystemType newSpecialSubsystemType) {
		CmSpecialSubsystemType oldSpecialSubsystemType = specialSubsystemType;
		specialSubsystemType = newSpecialSubsystemType == null ? SPECIAL_SUBSYSTEM_TYPE_EDEFAULT : newSpecialSubsystemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_SUBSYSTEM__SPECIAL_SUBSYSTEM_TYPE, oldSpecialSubsystemType, specialSubsystemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case cmPackage.CM_SUBSYSTEM__SUBSYSTEM:
				if (resolve) return getSubsystem();
				return basicGetSubsystem();
			case cmPackage.CM_SUBSYSTEM__NAME:
				return getName();
			case cmPackage.CM_SUBSYSTEM__SPECIAL_SUBSYSTEM_TYPE:
				return getSpecialSubsystemType();
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
			case cmPackage.CM_SUBSYSTEM__SUBSYSTEM:
				setSubsystem((Subsystem)newValue);
				return;
			case cmPackage.CM_SUBSYSTEM__SPECIAL_SUBSYSTEM_TYPE:
				setSpecialSubsystemType((CmSpecialSubsystemType)newValue);
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
			case cmPackage.CM_SUBSYSTEM__SUBSYSTEM:
				setSubsystem((Subsystem)null);
				return;
			case cmPackage.CM_SUBSYSTEM__SPECIAL_SUBSYSTEM_TYPE:
				setSpecialSubsystemType(SPECIAL_SUBSYSTEM_TYPE_EDEFAULT);
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
			case cmPackage.CM_SUBSYSTEM__SUBSYSTEM:
				return subsystem != null;
			case cmPackage.CM_SUBSYSTEM__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case cmPackage.CM_SUBSYSTEM__SPECIAL_SUBSYSTEM_TYPE:
				return specialSubsystemType != SPECIAL_SUBSYSTEM_TYPE_EDEFAULT;
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
		result.append(" (specialSubsystemType: "); //$NON-NLS-1$
		result.append(specialSubsystemType);
		result.append(')');
		return result.toString();
	}

} //CmSubsystemImpl
