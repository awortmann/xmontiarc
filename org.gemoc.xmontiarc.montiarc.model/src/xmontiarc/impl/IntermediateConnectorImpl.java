/**
 */
package xmontiarc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xmontiarc.IncomingPort;
import xmontiarc.IntermediateConnector;
import xmontiarc.OutgoingPort;
import xmontiarc.XmontiarcPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intermediate Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xmontiarc.impl.IntermediateConnectorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link xmontiarc.impl.IntermediateConnectorImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntermediateConnectorImpl extends ConnectorImpl implements IntermediateConnector {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected OutgoingPort source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected IncomingPort target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermediateConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmontiarcPackage.Literals.INTERMEDIATE_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingPort getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (OutgoingPort)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmontiarcPackage.INTERMEDIATE_CONNECTOR__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingPort basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(OutgoingPort newSource) {
		OutgoingPort oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmontiarcPackage.INTERMEDIATE_CONNECTOR__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingPort getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (IncomingPort)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmontiarcPackage.INTERMEDIATE_CONNECTOR__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingPort basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(IncomingPort newTarget) {
		IncomingPort oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmontiarcPackage.INTERMEDIATE_CONNECTOR__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmontiarcPackage.INTERMEDIATE_CONNECTOR__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case XmontiarcPackage.INTERMEDIATE_CONNECTOR__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case XmontiarcPackage.INTERMEDIATE_CONNECTOR__SOURCE:
				setSource((OutgoingPort)newValue);
				return;
			case XmontiarcPackage.INTERMEDIATE_CONNECTOR__TARGET:
				setTarget((IncomingPort)newValue);
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
			case XmontiarcPackage.INTERMEDIATE_CONNECTOR__SOURCE:
				setSource((OutgoingPort)null);
				return;
			case XmontiarcPackage.INTERMEDIATE_CONNECTOR__TARGET:
				setTarget((IncomingPort)null);
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
			case XmontiarcPackage.INTERMEDIATE_CONNECTOR__SOURCE:
				return source != null;
			case XmontiarcPackage.INTERMEDIATE_CONNECTOR__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //IntermediateConnectorImpl
