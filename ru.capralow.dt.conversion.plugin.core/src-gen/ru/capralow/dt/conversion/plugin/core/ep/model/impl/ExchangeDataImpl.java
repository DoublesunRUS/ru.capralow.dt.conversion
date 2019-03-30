/**
 */
package ru.capralow.dt.conversion.plugin.core.ep.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.capralow.dt.conversion.plugin.core.ep.model.EpExchangePair;
import ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeData;
import ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject;
import ru.capralow.dt.conversion.plugin.core.ep.model.epPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.ExchangeDataImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.ExchangeDataImpl#getPairs <em>Pairs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExchangeDataImpl extends MinimalEObjectImpl.Container implements ExchangeData {
	/**
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeProject> projects;

	/**
	 * The cached value of the '{@link #getPairs() <em>Pairs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPairs()
	 * @generated
	 * @ordered
	 */
	protected EList<EpExchangePair> pairs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangeDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return epPackage.Literals.EXCHANGE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeProject> getProjects() {
		if (projects == null) {
			projects = new EObjectResolvingEList<ExchangeProject>(ExchangeProject.class, this, epPackage.EXCHANGE_DATA__PROJECTS);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EpExchangePair> getPairs() {
		if (pairs == null) {
			pairs = new EObjectContainmentEList<EpExchangePair>(EpExchangePair.class, this, epPackage.EXCHANGE_DATA__PAIRS);
		}
		return pairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case epPackage.EXCHANGE_DATA__PAIRS:
				return ((InternalEList<?>)getPairs()).basicRemove(otherEnd, msgs);
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
			case epPackage.EXCHANGE_DATA__PROJECTS:
				return getProjects();
			case epPackage.EXCHANGE_DATA__PAIRS:
				return getPairs();
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
			case epPackage.EXCHANGE_DATA__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends ExchangeProject>)newValue);
				return;
			case epPackage.EXCHANGE_DATA__PAIRS:
				getPairs().clear();
				getPairs().addAll((Collection<? extends EpExchangePair>)newValue);
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
			case epPackage.EXCHANGE_DATA__PROJECTS:
				getProjects().clear();
				return;
			case epPackage.EXCHANGE_DATA__PAIRS:
				getPairs().clear();
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
			case epPackage.EXCHANGE_DATA__PROJECTS:
				return projects != null && !projects.isEmpty();
			case epPackage.EXCHANGE_DATA__PAIRS:
				return pairs != null && !pairs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExchangeDataImpl
