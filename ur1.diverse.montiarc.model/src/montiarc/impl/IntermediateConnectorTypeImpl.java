/**
 */
package montiarc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import montiarc.IntermediateConnectorType;
import montiarc.MontiarcPackage;
import montiarc.PortInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intermediate Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link montiarc.impl.IntermediateConnectorTypeImpl#getSourcePortInstance <em>Source Port Instance</em>}</li>
 *   <li>{@link montiarc.impl.IntermediateConnectorTypeImpl#getTargetPortInstance <em>Target Port Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntermediateConnectorTypeImpl extends ConnectorTypeImpl implements IntermediateConnectorType {
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
	 * The cached value of the '{@link #getTargetPortInstance() <em>Target Port Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPortInstance()
	 * @generated
	 * @ordered
	 */
	protected PortInstance targetPortInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermediateConnectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MontiarcPackage.Literals.INTERMEDIATE_CONNECTOR_TYPE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MontiarcPackage.INTERMEDIATE_CONNECTOR_TYPE__SOURCE_PORT_INSTANCE, oldSourcePortInstance, sourcePortInstance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.INTERMEDIATE_CONNECTOR_TYPE__SOURCE_PORT_INSTANCE, oldSourcePortInstance, sourcePortInstance));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MontiarcPackage.INTERMEDIATE_CONNECTOR_TYPE__TARGET_PORT_INSTANCE, oldTargetPortInstance, targetPortInstance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.INTERMEDIATE_CONNECTOR_TYPE__TARGET_PORT_INSTANCE, oldTargetPortInstance, targetPortInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MontiarcPackage.INTERMEDIATE_CONNECTOR_TYPE__SOURCE_PORT_INSTANCE:
				if (resolve) return getSourcePortInstance();
				return basicGetSourcePortInstance();
			case MontiarcPackage.INTERMEDIATE_CONNECTOR_TYPE__TARGET_PORT_INSTANCE:
				if (resolve) return getTargetPortInstance();
				return basicGetTargetPortInstance();
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
			case MontiarcPackage.INTERMEDIATE_CONNECTOR_TYPE__SOURCE_PORT_INSTANCE:
				setSourcePortInstance((PortInstance)newValue);
				return;
			case MontiarcPackage.INTERMEDIATE_CONNECTOR_TYPE__TARGET_PORT_INSTANCE:
				setTargetPortInstance((PortInstance)newValue);
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
			case MontiarcPackage.INTERMEDIATE_CONNECTOR_TYPE__SOURCE_PORT_INSTANCE:
				setSourcePortInstance((PortInstance)null);
				return;
			case MontiarcPackage.INTERMEDIATE_CONNECTOR_TYPE__TARGET_PORT_INSTANCE:
				setTargetPortInstance((PortInstance)null);
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
			case MontiarcPackage.INTERMEDIATE_CONNECTOR_TYPE__SOURCE_PORT_INSTANCE:
				return sourcePortInstance != null;
			case MontiarcPackage.INTERMEDIATE_CONNECTOR_TYPE__TARGET_PORT_INSTANCE:
				return targetPortInstance != null;
		}
		return super.eIsSet(featureID);
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
		String target = qualify(getTargetPortInstance());
		return source + " -> " + target;
	}

} //IntermediateConnectorTypeImpl
