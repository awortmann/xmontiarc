/**
 */
package montiarc.impl;

import montiarc.IncomingConnectorType;
import montiarc.MontiarcPackage;
import montiarc.PortInstance;
import montiarc.PortType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incoming Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link montiarc.impl.IncomingConnectorTypeImpl#getTargetPort <em>Target Port</em>}</li>
 *   <li>{@link montiarc.impl.IncomingConnectorTypeImpl#getSourcePortType <em>Source Port Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncomingConnectorTypeImpl extends ConnectorTypeImpl implements IncomingConnectorType {
	/**
	 * The cached value of the '{@link #getTargetPort() <em>Target Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPort()
	 * @generated
	 * @ordered
	 */
	protected PortInstance targetPort;

	/**
	 * The cached value of the '{@link #getSourcePortType() <em>Source Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePortType()
	 * @generated
	 * @ordered
	 */
	protected PortType sourcePortType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncomingConnectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MontiarcPackage.Literals.INCOMING_CONNECTOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance getTargetPort() {
		if (targetPort != null && targetPort.eIsProxy()) {
			InternalEObject oldTargetPort = (InternalEObject)targetPort;
			targetPort = (PortInstance)eResolveProxy(oldTargetPort);
			if (targetPort != oldTargetPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MontiarcPackage.INCOMING_CONNECTOR_TYPE__TARGET_PORT, oldTargetPort, targetPort));
			}
		}
		return targetPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance basicGetTargetPort() {
		return targetPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPort(PortInstance newTargetPort) {
		PortInstance oldTargetPort = targetPort;
		targetPort = newTargetPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.INCOMING_CONNECTOR_TYPE__TARGET_PORT, oldTargetPort, targetPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType getSourcePortType() {
		if (sourcePortType != null && sourcePortType.eIsProxy()) {
			InternalEObject oldSourcePortType = (InternalEObject)sourcePortType;
			sourcePortType = (PortType)eResolveProxy(oldSourcePortType);
			if (sourcePortType != oldSourcePortType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MontiarcPackage.INCOMING_CONNECTOR_TYPE__SOURCE_PORT_TYPE, oldSourcePortType, sourcePortType));
			}
		}
		return sourcePortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType basicGetSourcePortType() {
		return sourcePortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePortType(PortType newSourcePortType) {
		PortType oldSourcePortType = sourcePortType;
		sourcePortType = newSourcePortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.INCOMING_CONNECTOR_TYPE__SOURCE_PORT_TYPE, oldSourcePortType, sourcePortType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MontiarcPackage.INCOMING_CONNECTOR_TYPE__TARGET_PORT:
				if (resolve) return getTargetPort();
				return basicGetTargetPort();
			case MontiarcPackage.INCOMING_CONNECTOR_TYPE__SOURCE_PORT_TYPE:
				if (resolve) return getSourcePortType();
				return basicGetSourcePortType();
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
			case MontiarcPackage.INCOMING_CONNECTOR_TYPE__TARGET_PORT:
				setTargetPort((PortInstance)newValue);
				return;
			case MontiarcPackage.INCOMING_CONNECTOR_TYPE__SOURCE_PORT_TYPE:
				setSourcePortType((PortType)newValue);
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
			case MontiarcPackage.INCOMING_CONNECTOR_TYPE__TARGET_PORT:
				setTargetPort((PortInstance)null);
				return;
			case MontiarcPackage.INCOMING_CONNECTOR_TYPE__SOURCE_PORT_TYPE:
				setSourcePortType((PortType)null);
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
			case MontiarcPackage.INCOMING_CONNECTOR_TYPE__TARGET_PORT:
				return targetPort != null;
			case MontiarcPackage.INCOMING_CONNECTOR_TYPE__SOURCE_PORT_TYPE:
				return sourcePortType != null;
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private String qualify(PortType p) {
		String qualifiedName = "";
		if (p != null && this.getParent() != null && p.getType() != null) {
			qualifiedName = this.getParent().getName() + "." + p.getName();
		}
		return qualifiedName;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private String qualify(PortInstance p) {
		String qualifiedName = "";
		if (p != null && p.getParent() != null && p.getType() != null) {
			qualifiedName = p.getParent().getInstanceName() + "." + p.getType().getName();
		}
		return qualifiedName;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();
		
		String source = qualify(getSourcePortType());
		String target = qualify(getTargetPort());
		return source + " -> " + target;
	}

} //IncomingConnectorTypeImpl
