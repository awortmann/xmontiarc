/**
 */
package montiarc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import montiarc.MontiarcPackage;
import montiarc.OutgoingConnectorType;
import montiarc.PortInstance;
import montiarc.PortType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outgoing Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link montiarc.impl.OutgoingConnectorTypeImpl#getSourcePortInstance <em>Source Port Instance</em>}</li>
 *   <li>{@link montiarc.impl.OutgoingConnectorTypeImpl#getTargetPortType <em>Target Port Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutgoingConnectorTypeImpl extends ConnectorTypeImpl implements OutgoingConnectorType {
	/**
	 * The cached value of the '{@link #getSourcePortInstance() <em>Source Port Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePortInstance()
	 * @generated
	 * @ordered
	 */
	protected PortInstance sourcePortInstance;

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
	public PortInstance getSourcePortInstance() {
		if (sourcePortInstance != null && sourcePortInstance.eIsProxy()) {
			InternalEObject oldSourcePortInstance = (InternalEObject)sourcePortInstance;
			sourcePortInstance = (PortInstance)eResolveProxy(oldSourcePortInstance);
			if (sourcePortInstance != oldSourcePortInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MontiarcPackage.OUTGOING_CONNECTOR_TYPE__SOURCE_PORT_INSTANCE, oldSourcePortInstance, sourcePortInstance));
			}
		}
		return sourcePortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance basicGetSourcePortInstance() {
		return sourcePortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePortInstance(PortInstance newSourcePortInstance) {
		PortInstance oldSourcePortInstance = sourcePortInstance;
		sourcePortInstance = newSourcePortInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.OUTGOING_CONNECTOR_TYPE__SOURCE_PORT_INSTANCE, oldSourcePortInstance, sourcePortInstance));
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
			case MontiarcPackage.OUTGOING_CONNECTOR_TYPE__SOURCE_PORT_INSTANCE:
				if (resolve) return getSourcePortInstance();
				return basicGetSourcePortInstance();
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
			case MontiarcPackage.OUTGOING_CONNECTOR_TYPE__SOURCE_PORT_INSTANCE:
				setSourcePortInstance((PortInstance)newValue);
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
			case MontiarcPackage.OUTGOING_CONNECTOR_TYPE__SOURCE_PORT_INSTANCE:
				setSourcePortInstance((PortInstance)null);
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
			case MontiarcPackage.OUTGOING_CONNECTOR_TYPE__SOURCE_PORT_INSTANCE:
				return sourcePortInstance != null;
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
		if (p != null && this.getParent() != null && p.getDataType() != null) {
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
		
		String source = qualify(getSourcePortInstance());
		String target = qualify(getTargetPortType());
		return source + " -> " + target;
	}

} //OutgoingConnectorTypeImpl
