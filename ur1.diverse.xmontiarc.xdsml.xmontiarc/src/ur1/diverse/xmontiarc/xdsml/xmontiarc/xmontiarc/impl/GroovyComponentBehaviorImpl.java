/**
 */
package ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.GroovyComponentBehavior;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.XmontiarcPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Groovy Component Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.impl.GroovyComponentBehaviorImpl#getScriptBody <em>Script Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroovyComponentBehaviorImpl extends ComponentBehaviorImpl implements GroovyComponentBehavior {
	/**
	 * The default value of the '{@link #getScriptBody() <em>Script Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptBody()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_BODY_EDEFAULT = "\"\"";

	/**
	 * The cached value of the '{@link #getScriptBody() <em>Script Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptBody()
	 * @generated
	 * @ordered
	 */
	protected String scriptBody = SCRIPT_BODY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroovyComponentBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmontiarcPackage.Literals.GROOVY_COMPONENT_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScriptBody() {
		return scriptBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptBody(String newScriptBody) {
		String oldScriptBody = scriptBody;
		scriptBody = newScriptBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmontiarcPackage.GROOVY_COMPONENT_BEHAVIOR__SCRIPT_BODY, oldScriptBody, scriptBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmontiarcPackage.GROOVY_COMPONENT_BEHAVIOR__SCRIPT_BODY:
				return getScriptBody();
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
			case XmontiarcPackage.GROOVY_COMPONENT_BEHAVIOR__SCRIPT_BODY:
				setScriptBody((String)newValue);
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
			case XmontiarcPackage.GROOVY_COMPONENT_BEHAVIOR__SCRIPT_BODY:
				setScriptBody(SCRIPT_BODY_EDEFAULT);
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
			case XmontiarcPackage.GROOVY_COMPONENT_BEHAVIOR__SCRIPT_BODY:
				return SCRIPT_BODY_EDEFAULT == null ? scriptBody != null : !SCRIPT_BODY_EDEFAULT.equals(scriptBody);
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
		result.append(" (scriptBody: ");
		result.append(scriptBody);
		result.append(')');
		return result.toString();
	}

} //GroovyComponentBehaviorImpl
