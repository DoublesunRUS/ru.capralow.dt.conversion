/**
 */
package ru.capralow.dt.conversion.plugin.core.ep.model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProject;
import ru.capralow.dt.conversion.plugin.core.ep.model.ExchangeProjects;
import ru.capralow.dt.conversion.plugin.core.ep.model.epPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Projects</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.ep.model.impl.ExchangeProjectsImpl#getProjects <em>Projects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExchangeProjectsImpl extends MinimalEObjectImpl.Container implements ExchangeProjects {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangeProjectsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return epPackage.Literals.EXCHANGE_PROJECTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeProject> getProjects() {
		if (projects == null) {
			projects = new EObjectResolvingEList<ExchangeProject>(ExchangeProject.class, this, epPackage.EXCHANGE_PROJECTS__PROJECTS);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeProject getProject(final String name) {
		EList<ExchangeProject> _projects = this.getProjects();
		for (final ExchangeProject project : _projects) {
			boolean _equals = name.equals(project.getName());
			if (_equals) {
				return project;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case epPackage.EXCHANGE_PROJECTS__PROJECTS:
				return getProjects();
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
			case epPackage.EXCHANGE_PROJECTS__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends ExchangeProject>)newValue);
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
			case epPackage.EXCHANGE_PROJECTS__PROJECTS:
				getProjects().clear();
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
			case epPackage.EXCHANGE_PROJECTS__PROJECTS:
				return projects != null && !projects.isEmpty();
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
			case epPackage.EXCHANGE_PROJECTS___GET_PROJECT__STRING:
				return getProject((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExchangeProjectsImpl
