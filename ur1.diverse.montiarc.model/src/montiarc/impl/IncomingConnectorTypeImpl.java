/**
 */
package montiarc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import montiarc.IncomingConnectorType;
import montiarc.MontiarcPackage;
import montiarc.PortInstance;
import montiarc.PortType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incoming Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link montiarc.impl.IncomingConnectorTypeImpl#getTargetPortInstance <em>Target Port Instance</em>}</li>
 *   <li>{@link montiarc.impl.IncomingConnectorTypeImpl#getSourcePortType <em>Source Port Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncomingConnectorTypeImpl extends ConnectorTypeImpl implements IncomingConnectorType {
	/**
	 * The cached value of the '{@link #getTargetPortInstance() <em>Target Port Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPortInstance()
	 * @generated
	 * @ordered
	 */
	protected PortInstance targetPortInstance;

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
	public PortInstance getTargetPortInstance() {
		if (targetPortInstance != null && targetPortInstance.eIsProxy()) {
			InternalEObject oldTargetPortInstance = (InternalEObject)targetPortInstance;
			targetPortInstance = (PortInstance)eResolveProxy(oldTargetPortInstance);
			if (targetPortInstance != oldTargetPortInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MontiarcPackage.INCOMING_CONNECTOR_TYPE__TARGET_PORT_INSTANCE, oldTargetPortInstance, targetPortInstance));
			}
		}
		return targetPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance basicGetTargetPortInstance() {
		return targetPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPortInstance(PortInstance newTargetPortInstance) {
		PortInstance oldTargetPortInstance = targetPortInstance;
		targetPortInstance = newTargetPortInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.INCOMING_CONNECTOR_TYPE__TARGET_PORT_INSTANCE, oldTargetPortInstance, targetPortInstance));
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
			case MontiarcPackage.INCOMING_CONNECTOR_TYPE__TARGET_PORT_INSTANCE:
				if (resolve) return getTargetPortInstance();
				return basicGetTargetPortInstance();
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
			case MontiarcPackage.INCOMING_CONNECTOR_TYPE__TARGET_PORT_INSTANCE:
				setTargetPortInstance((PortInstance)newValue);
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
			case MontiarcPackage.INCOMING_CONNECTOR_TYPE__TARGET_PORT_INSTANCE:
				setTargetPortInstance((PortInstance)null);
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
			case MontiarcPackage.INCOMING_CONNECTOR_TYPE__TARGET_PORT_INSTANCE:
				return targetPortInstance != null;
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
		
		String source = qualify(getSourcePortType());
		String target = qualify(getTargetPortInstance());
		return source + " -> " + target;
	}

} //IncomingConnectorTypeImpl
