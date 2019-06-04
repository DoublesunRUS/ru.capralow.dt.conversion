/**
 */
package ru.capralow.dt.conversion.plugin.core.cm.model.impl;

import com.google.common.base.Objects;

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

import ru.capralow.dt.conversion.plugin.core.cm.model.CmAlgorithm;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmMethodType;
import ru.capralow.dt.conversion.plugin.core.cm.model.CmParam;
import ru.capralow.dt.conversion.plugin.core.cm.model.cmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cm Algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAlgorithmImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAlgorithmImpl#getExists <em>Exists</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAlgorithmImpl#getMethodType <em>Method Type</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAlgorithmImpl#getParams <em>Params</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAlgorithmImpl#getIsExport <em>Is Export</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAlgorithmImpl#getBody <em>Body</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAlgorithmImpl#getMethodParams <em>Method Params</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAlgorithmImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link ru.capralow.dt.conversion.plugin.core.cm.model.impl.CmAlgorithmImpl#getSuffix <em>Suffix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CmAlgorithmImpl extends MinimalEObjectImpl.Container implements CmAlgorithm {
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
	 * The default value of the '{@link #getExists() <em>Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExists()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXISTS_EDEFAULT = java.lang.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getExists() <em>Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExists()
	 * @generated
	 * @ordered
	 */
	protected Boolean exists = EXISTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodType() <em>Method Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodType()
	 * @generated
	 * @ordered
	 */
	protected static final CmMethodType METHOD_TYPE_EDEFAULT = CmMethodType.PROCEDURE;

	/**
	 * The cached value of the '{@link #getMethodType() <em>Method Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodType()
	 * @generated
	 * @ordered
	 */
	protected CmMethodType methodType = METHOD_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<CmParam> params;

	/**
	 * The default value of the '{@link #getIsExport() <em>Is Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExport()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_EXPORT_EDEFAULT = java.lang.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsExport() <em>Is Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExport()
	 * @generated
	 * @ordered
	 */
	protected Boolean isExport = IS_EXPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodParams() <em>Method Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodParams()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_PARAMS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmAlgorithmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cmPackage.Literals.CM_ALGORITHM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_ALGORITHM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExists() {
		return exists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExists(Boolean newExists) {
		Boolean oldExists = exists;
		exists = newExists;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_ALGORITHM__EXISTS, oldExists, exists));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CmMethodType getMethodType() {
		return methodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodType(CmMethodType newMethodType) {
		CmMethodType oldMethodType = methodType;
		methodType = newMethodType == null ? METHOD_TYPE_EDEFAULT : newMethodType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_ALGORITHM__METHOD_TYPE, oldMethodType, methodType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CmParam> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<CmParam>(CmParam.class, this, cmPackage.CM_ALGORITHM__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsExport() {
		return isExport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsExport(Boolean newIsExport) {
		Boolean oldIsExport = isExport;
		isExport = newIsExport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_ALGORITHM__IS_EXPORT, oldIsExport, isExport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, cmPackage.CM_ALGORITHM__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethodParams() {
		String methodParams = "";
		EList<CmParam> _params = this.getParams();
		for (final CmParam param : _params) {
			{
				boolean _isEmpty = methodParams.isEmpty();
				boolean _not = (!_isEmpty);
				if (_not) {
					String _methodParams = methodParams;
					methodParams = (_methodParams + ", ");
				}
				Boolean _byValue = param.getByValue();
				if ((_byValue).booleanValue()) {
					String _methodParams_1 = methodParams;
					methodParams = (_methodParams_1 + "\u0417\u043D\u0430\u0447 ");
				}
				String _methodParams_2 = methodParams;
				String _trim = param.getName().trim();
				methodParams = (_methodParams_2 + _trim);
				boolean _isEmpty_1 = param.getDefaultValue().isEmpty();
				boolean _not_1 = (!_isEmpty_1);
				if (_not_1) {
					String _methodParams_3 = methodParams;
					String _defaultValue = param.getDefaultValue();
					String _plus = (" = " + _defaultValue);
					methodParams = (_methodParams_3 + _plus);
				}
			}
		}
		return methodParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrefix() {
		String prefix = "";
		CmMethodType _methodType = this.getMethodType();
		boolean _equals = Objects.equal(_methodType, CmMethodType.PROCEDURE);
		if (_equals) {
			prefix = "\u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u0430";
		}
		else {
			prefix = "\u0424\u0443\u043D\u043A\u0446\u0438\u044F";
		}
		String export = "";
		Boolean _isExport = this.getIsExport();
		if ((_isExport).booleanValue()) {
			export = " \u042D\u043A\u0441\u043F\u043E\u0440\u0442";
		}
		String _name = this.getName();
		String _plus = ((prefix + " ") + _name);
		String _plus_1 = (_plus + "(");
		String _methodParams = this.getMethodParams();
		String _plus_2 = (_plus_1 + _methodParams);
		String _plus_3 = (_plus_2 + ")");
		return (_plus_3 + export);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuffix() {
		String result = "";
		CmMethodType _methodType = this.getMethodType();
		boolean _equals = Objects.equal(_methodType, CmMethodType.PROCEDURE);
		if (_equals) {
			result = "\u041A\u043E\u043D\u0435\u0446\u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u044B";
		}
		else {
			result = "\u041A\u043E\u043D\u0435\u0446\u0424\u0443\u043D\u043A\u0446\u0438\u0438";
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlgorithmText() {
		String _prefix = this.getPrefix();
		String _lineSeparator = System.lineSeparator();
		String _plus = (_prefix + _lineSeparator);
		String _body = this.getBody();
		String _plus_1 = (_plus + _body);
		String _lineSeparator_1 = System.lineSeparator();
		String _plus_2 = (_plus_1 + _lineSeparator_1);
		String _suffix = this.getSuffix();
		String _plus_3 = (_plus_2 + _suffix);
		String _lineSeparator_2 = System.lineSeparator();
		String result = (_plus_3 + _lineSeparator_2);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return this.getPrefix();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case cmPackage.CM_ALGORITHM__PARAMS:
				return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
			case cmPackage.CM_ALGORITHM__NAME:
				return getName();
			case cmPackage.CM_ALGORITHM__EXISTS:
				return getExists();
			case cmPackage.CM_ALGORITHM__METHOD_TYPE:
				return getMethodType();
			case cmPackage.CM_ALGORITHM__PARAMS:
				return getParams();
			case cmPackage.CM_ALGORITHM__IS_EXPORT:
				return getIsExport();
			case cmPackage.CM_ALGORITHM__BODY:
				return getBody();
			case cmPackage.CM_ALGORITHM__METHOD_PARAMS:
				return getMethodParams();
			case cmPackage.CM_ALGORITHM__PREFIX:
				return getPrefix();
			case cmPackage.CM_ALGORITHM__SUFFIX:
				return getSuffix();
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
			case cmPackage.CM_ALGORITHM__NAME:
				setName((String)newValue);
				return;
			case cmPackage.CM_ALGORITHM__EXISTS:
				setExists((Boolean)newValue);
				return;
			case cmPackage.CM_ALGORITHM__METHOD_TYPE:
				setMethodType((CmMethodType)newValue);
				return;
			case cmPackage.CM_ALGORITHM__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends CmParam>)newValue);
				return;
			case cmPackage.CM_ALGORITHM__IS_EXPORT:
				setIsExport((Boolean)newValue);
				return;
			case cmPackage.CM_ALGORITHM__BODY:
				setBody((String)newValue);
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
			case cmPackage.CM_ALGORITHM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case cmPackage.CM_ALGORITHM__EXISTS:
				setExists(EXISTS_EDEFAULT);
				return;
			case cmPackage.CM_ALGORITHM__METHOD_TYPE:
				setMethodType(METHOD_TYPE_EDEFAULT);
				return;
			case cmPackage.CM_ALGORITHM__PARAMS:
				getParams().clear();
				return;
			case cmPackage.CM_ALGORITHM__IS_EXPORT:
				setIsExport(IS_EXPORT_EDEFAULT);
				return;
			case cmPackage.CM_ALGORITHM__BODY:
				setBody(BODY_EDEFAULT);
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
			case cmPackage.CM_ALGORITHM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case cmPackage.CM_ALGORITHM__EXISTS:
				return EXISTS_EDEFAULT == null ? exists != null : !EXISTS_EDEFAULT.equals(exists);
			case cmPackage.CM_ALGORITHM__METHOD_TYPE:
				return methodType != METHOD_TYPE_EDEFAULT;
			case cmPackage.CM_ALGORITHM__PARAMS:
				return params != null && !params.isEmpty();
			case cmPackage.CM_ALGORITHM__IS_EXPORT:
				return IS_EXPORT_EDEFAULT == null ? isExport != null : !IS_EXPORT_EDEFAULT.equals(isExport);
			case cmPackage.CM_ALGORITHM__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case cmPackage.CM_ALGORITHM__METHOD_PARAMS:
				return METHOD_PARAMS_EDEFAULT == null ? getMethodParams() != null : !METHOD_PARAMS_EDEFAULT.equals(getMethodParams());
			case cmPackage.CM_ALGORITHM__PREFIX:
				return PREFIX_EDEFAULT == null ? getPrefix() != null : !PREFIX_EDEFAULT.equals(getPrefix());
			case cmPackage.CM_ALGORITHM__SUFFIX:
				return SUFFIX_EDEFAULT == null ? getSuffix() != null : !SUFFIX_EDEFAULT.equals(getSuffix());
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
			case cmPackage.CM_ALGORITHM___GET_ALGORITHM_TEXT:
				return getAlgorithmText();
			case cmPackage.CM_ALGORITHM___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CmAlgorithmImpl
