/**
 */
package montiarc.impl;

import montiarc.MontiarcPackage;
import montiarc.OutgoingConnectorType;
import montiarc.PortInstance;
import montiarc.PortType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outgoing Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link montiarc.impl.OutgoingConnectorTypeImpl#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link montiarc.impl.OutgoingConnectorTypeImpl#getTargetPortType <em>Target Port Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutgoingConnectorTypeImpl extends ConnectorTypeImpl implements OutgoingConnectorType {
	/**
	 * The cached value of the '{@link #getSourcePort() <em>Source Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePort()
	 * @generated
	 * @ordered
	 */
	protected PortInstance sourcePort;

	/**
	 * The cached value of the '{@link #getTargetPortType() <em>Target Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPortType()
	 * @generated
	 * @ordered
	 */
	protected PortType targetPortType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutgoingConnectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MontiarcPackage.Literals.OUTGOING_CONNECTOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance getSourcePort() {
		if (sourcePort != null && sourcePort.eIsProxy()) {
			InternalEObject oldSourcePort = (InternalEObject)sourcePort;
			sourcePort = (PortInstance)eResolveProxy(oldSourcePort);
			if (sourcePort != oldSourcePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MontiarcPackage.OUTGOING_CONNECTOR_TYPE__SOURCE_PORT, oldSourcePort, sourcePort));
			}
		}
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance basicGetSourcePort() {
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePort(PortInstance newSourcePort) {
		PortInstance oldSourcePort = sourcePort;
		sourcePort = newSourcePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.OUTGOING_CONNECTOR_TYPE__SOURCE_PORT, oldSourcePort, sourcePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType getTargetPortType() {
		if (targetPortType != null && targetPortType.eIsProxy()) {
			InternalEObject oldTargetPortType = (InternalEObject)targetPortType;
			targetPortType = (PortType)eResolveProxy(oldTargetPortType);
			if (targetPortType != oldTargetPortType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MontiarcPackage.OUTGOING_CONNECTOR_TYPE__TARGET_PORT_TYPE, oldTargetPortType, targetPortType));
			}
		}
		return targetPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType basicGetTargetPortType() {
		return targetPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPortType(PortType newTargetPortType) {
		PortType oldTargetPortType = targetPortType;
		targetPortType = newTargetPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.OUTGOING_CONNECTOR_TYPE__TARGET_PORT_TYPE, oldTargetPortType, targetPortType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MontiarcPackage.OUTGOING_CONNECTOR_TYPE__SOURCE_PORT:
				if (resolve) return getSourcePort();
				return basicGetSourcePort();
			case MontiarcPackage.OUTGOING_CONNECTOR_TYPE__TARGET_PORT_TYPE:
				if (resolve) return getTargetPortType();
				return basicGetTargetPortType();
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
			case MontiarcPackage.OUTGOING_CONNECTOR_TYPE__SOURCE_PORT:
				setSourcePort((PortInstance)newValue);
				return;
			case MontiarcPackage.OUTGOING_CONNECTOR_TYPE__TARGET_PORT_TYPE:
				setTargetPortType((PortType)newValue);
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
			case MontiarcPackage.OUTGOING_CONNECTOR_TYPE__SOURCE_PORT:
				setSourcePort((PortInstance)null);
				return;
			case MontiarcPackage.OUTGOING_CONNECTOR_TYPE__TARGET_PORT_TYPE:
				setTargetPortType((PortType)null);
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
			case MontiarcPackage.OUTGOING_CONNECTOR_TYPE__SOURCE_PORT:
				return sourcePort != null;
			case MontiarcPackage.OUTGOING_CONNECTOR_TYPE__TARGET_PORT_TYPE:
				return targetPortType != null;
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
		
		String source = qualify(getSourcePort());
		String target = qualify(getTargetPortType());
		return source + " -> " + target;
	}

} //OutgoingConnectorTypeImpl
