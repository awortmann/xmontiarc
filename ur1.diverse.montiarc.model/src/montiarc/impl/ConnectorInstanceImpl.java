/**
 */
package montiarc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import montiarc.ComponentInstance;
import montiarc.ConnectorInstance;
import montiarc.MontiarcPackage;
import montiarc.PortInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link montiarc.impl.ConnectorInstanceImpl#getSourcePortInstance <em>Source Port Instance</em>}</li>
 *   <li>{@link montiarc.impl.ConnectorInstanceImpl#getTargetPortInstance <em>Target Port Instance</em>}</li>
 *   <li>{@link montiarc.impl.ConnectorInstanceImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorInstanceImpl extends MinimalEObjectImpl.Container implements ConnectorInstance {
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
	protected ConnectorInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MontiarcPackage.Literals.CONNECTOR_INSTANCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MontiarcPackage.CONNECTOR_INSTANCE__SOURCE_PORT_INSTANCE, oldSourcePortInstance, sourcePortInstance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.CONNECTOR_INSTANCE__SOURCE_PORT_INSTANCE, oldSourcePortInstance, sourcePortInstance));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MontiarcPackage.CONNECTOR_INSTANCE__TARGET_PORT_INSTANCE, oldTargetPortInstance, targetPortInstance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.CONNECTOR_INSTANCE__TARGET_PORT_INSTANCE, oldTargetPortInstance, targetPortInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getParent() {
		if (eContainerFeatureID() != MontiarcPackage.CONNECTOR_INSTANCE__PARENT) return null;
		return (ComponentInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ComponentInstance newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, MontiarcPackage.CONNECTOR_INSTANCE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ComponentInstance newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != MontiarcPackage.CONNECTOR_INSTANCE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, MontiarcPackage.COMPONENT_INSTANCE__CONNECTOR_INSTANCES, ComponentInstance.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.CONNECTOR_INSTANCE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MontiarcPackage.CONNECTOR_INSTANCE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ComponentInstance)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MontiarcPackage.CONNECTOR_INSTANCE__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MontiarcPackage.CONNECTOR_INSTANCE__PARENT:
				return eInternalContainer().eInverseRemove(this, MontiarcPackage.COMPONENT_INSTANCE__CONNECTOR_INSTANCES, ComponentInstance.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MontiarcPackage.CONNECTOR_INSTANCE__SOURCE_PORT_INSTANCE:
				if (resolve) return getSourcePortInstance();
				return basicGetSourcePortInstance();
			case MontiarcPackage.CONNECTOR_INSTANCE__TARGET_PORT_INSTANCE:
				if (resolve) return getTargetPortInstance();
				return basicGetTargetPortInstance();
			case MontiarcPackage.CONNECTOR_INSTANCE__PARENT:
				return getParent();
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
			case MontiarcPackage.CONNECTOR_INSTANCE__SOURCE_PORT_INSTANCE:
				setSourcePortInstance((PortInstance)newValue);
				return;
			case MontiarcPackage.CONNECTOR_INSTANCE__TARGET_PORT_INSTANCE:
				setTargetPortInstance((PortInstance)newValue);
				return;
			case MontiarcPackage.CONNECTOR_INSTANCE__PARENT:
				setParent((ComponentInstance)newValue);
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
			case MontiarcPackage.CONNECTOR_INSTANCE__SOURCE_PORT_INSTANCE:
				setSourcePortInstance((PortInstance)null);
				return;
			case MontiarcPackage.CONNECTOR_INSTANCE__TARGET_PORT_INSTANCE:
				setTargetPortInstance((PortInstance)null);
				return;
			case MontiarcPackage.CONNECTOR_INSTANCE__PARENT:
				setParent((ComponentInstance)null);
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
			case MontiarcPackage.CONNECTOR_INSTANCE__SOURCE_PORT_INSTANCE:
				return sourcePortInstance != null;
			case MontiarcPackage.CONNECTOR_INSTANCE__TARGET_PORT_INSTANCE:
				return targetPortInstance != null;
			case MontiarcPackage.CONNECTOR_INSTANCE__PARENT:
				return getParent() != null;
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

} //ConnectorInstanceImpl
