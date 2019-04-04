/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefined;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmPredefinedMap;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cm Predefined</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmPredefinedImpl#getPredefinedMaps <em>Predefined Maps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmPredefinedImpl extends CmObjectImpl implements CmPredefined {
	/**
	 * The cached value of the '{@link #getPredefinedMaps() <em>Predefined Maps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedMaps()
	 * @generated
	 * @ordered
	 */
	protected EList<CmPredefinedMap> predefinedMaps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmPredefinedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cmPackage.Literals.CM_PREDEFINED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CmPredefinedMap> getPredefinedMaps() {
		if (predefinedMaps == null) {
			predefinedMaps = new EObjectContainmentEList<CmPredefinedMap>(CmPredefinedMap.class, this, cmPackage.CM_PREDEFINED__PREDEFINED_MAPS);
		}
		return predefinedMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean predefinedMapExists(final String configurationValue, final String formatValue) {
		EList<CmPredefinedMap> _predefinedMaps = this.getPredefinedMaps();
		for (final CmPredefinedMap predefinedMap : _predefinedMaps) {
			if ((configurationValue.equals(predefinedMap.getConfigurationValue()) && formatValue.equals(predefinedMap.getFormatValue()))) {
				return Boolean.valueOf(true);
			}
		}
		return Boolean.valueOf(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		String nameString = this.getName();
		boolean _isEmpty = this.getName().isEmpty();
		if (_isEmpty) {
			nameString = "<\u041F\u0443\u0441\u0442\u043E\u0435>";
		}
		String configurationString = this.getConfigurationObjectName();
		boolean _isEmpty_1 = this.getConfigurationObjectName().isEmpty();
		if (_isEmpty_1) {
			configurationString = "<\u041F\u0443\u0441\u0442\u043E\u0435>";
		}
		String formatString = this.getFormatObject();
		boolean _isEmpty_2 = this.getFormatObject().isEmpty();
		if (_isEmpty_2) {
			formatString = "<\u041F\u0443\u0441\u0442\u043E\u0435>";
		}
		String routeString = "<\u041D\u0430\u043F\u0440\u0430\u0432\u043B\u0435\u043D\u0438\u0435\u041D\u0435\u0417\u0430\u0434\u0430\u043D\u043E>";
		Boolean _forSending = this.getForSending();
		if ((_forSending).booleanValue()) {
			routeString = "\u041E\u0442\u043F\u0440\u0430\u0432\u043A\u0430";
		}
		Boolean _forReceiving = this.getForReceiving();
		if ((_forReceiving).booleanValue()) {
			routeString = "\u041F\u043E\u043B\u0443\u0447\u0435\u043D\u0438\u0435";
		}
		if (((this.getForSending()).booleanValue() && (this.getForReceiving()).booleanValue())) {
			routeString = "\u041E\u0442\u043F\u0440\u0430\u0432\u043A\u0430\u0418\u041F\u043E\u043B\u0443\u0447\u0435\u043D\u0438\u0435";
		}
		return ((((((("name:" + nameString) + " md:") + configurationString) + " xdto:") + formatString) + " ") + routeString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case cmPackage.CM_PREDEFINED__PREDEFINED_MAPS:
				return ((InternalEList<?>)getPredefinedMaps()).basicRemove(otherEnd, msgs);
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
			case cmPackage.CM_PREDEFINED__PREDEFINED_MAPS:
				return getPredefinedMaps();
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
			case cmPackage.CM_PREDEFINED__PREDEFINED_MAPS:
				getPredefinedMaps().clear();
				getPredefinedMaps().addAll((Collection<? extends CmPredefinedMap>)newValue);
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
			case cmPackage.CM_PREDEFINED__PREDEFINED_MAPS:
				getPredefinedMaps().clear();
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
			case cmPackage.CM_PREDEFINED__PREDEFINED_MAPS:
				return predefinedMaps != null && !predefinedMaps.isEmpty();
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
			case cmPackage.CM_PREDEFINED___PREDEFINED_MAP_EXISTS__STRING_STRING:
				return predefinedMapExists((String)arguments.get(0), (String)arguments.get(1));
			case cmPackage.CM_PREDEFINED___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CmPredefinedImpl