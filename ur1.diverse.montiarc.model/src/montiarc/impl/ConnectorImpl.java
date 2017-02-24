/**
 */
package montiarc.impl;

import montiarc.ComponentType;
import montiarc.Connector;
import montiarc.MontiarcPackage;
import montiarc.Port;

import montiarc.SubcomponentDeclaration;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Connector</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link montiarc.impl.ConnectorImpl#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link montiarc.impl.ConnectorImpl#getTargetPort <em>Target Port</em>}</li>
 *   <li>{@link montiarc.impl.ConnectorImpl#getSourceSubcomponent <em>Source Subcomponent</em>}</li>
 *   <li>{@link montiarc.impl.ConnectorImpl#getTargetSubcomponent <em>Target Subcomponent</em>}</li>
 *   <li>{@link montiarc.impl.ConnectorImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
	/**
	 * The cached value of the '{@link #getSourcePort() <em>Source Port</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSourcePort()
	 * @generated
	 * @ordered
	 */
	protected Port sourcePort;

	/**
	 * The cached value of the '{@link #getTargetPort() <em>Target Port</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTargetPort()
	 * @generated
	 * @ordered
	 */
	protected Port targetPort;

	/**
	 * The cached value of the '{@link #getSourceSubcomponent() <em>Source
	 * Subcomponent</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getSourceSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected SubcomponentDeclaration sourceSubcomponent;

	/**
	 * The cached value of the '{@link #getTargetSubcomponent() <em>Target
	 * Subcomponent</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getTargetSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected SubcomponentDeclaration targetSubcomponent;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MontiarcPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Port getSourcePort() {
		if (sourcePort != null && sourcePort.eIsProxy()) {
			InternalEObject oldSourcePort = (InternalEObject)sourcePort;
			sourcePort = (Port)eResolveProxy(oldSourcePort);
			if (sourcePort != oldSourcePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MontiarcPackage.CONNECTOR__SOURCE_PORT, oldSourcePort, sourcePort));
			}
		}
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetSourcePort() {
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePort(Port newSourcePort) {
		Port oldSourcePort = sourcePort;
		sourcePort = newSourcePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.CONNECTOR__SOURCE_PORT, oldSourcePort, sourcePort));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Port getTargetPort() {
		if (targetPort != null && targetPort.eIsProxy()) {
			InternalEObject oldTargetPort = (InternalEObject)targetPort;
			targetPort = (Port)eResolveProxy(oldTargetPort);
			if (targetPort != oldTargetPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MontiarcPackage.CONNECTOR__TARGET_PORT, oldTargetPort, targetPort));
			}
		}
		return targetPort;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetTargetPort() {
		return targetPort;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPort(Port newTargetPort) {
		Port oldTargetPort = targetPort;
		targetPort = newTargetPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.CONNECTOR__TARGET_PORT, oldTargetPort, targetPort));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SubcomponentDeclaration getSourceSubcomponent() {
		if (sourceSubcomponent != null && sourceSubcomponent.eIsProxy()) {
			InternalEObject oldSourceSubcomponent = (InternalEObject)sourceSubcomponent;
			sourceSubcomponent = (SubcomponentDeclaration)eResolveProxy(oldSourceSubcomponent);
			if (sourceSubcomponent != oldSourceSubcomponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MontiarcPackage.CONNECTOR__SOURCE_SUBCOMPONENT, oldSourceSubcomponent, sourceSubcomponent));
			}
		}
		return sourceSubcomponent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SubcomponentDeclaration basicGetSourceSubcomponent() {
		return sourceSubcomponent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceSubcomponent(SubcomponentDeclaration newSourceSubcomponent) {
		SubcomponentDeclaration oldSourceSubcomponent = sourceSubcomponent;
		sourceSubcomponent = newSourceSubcomponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.CONNECTOR__SOURCE_SUBCOMPONENT, oldSourceSubcomponent, sourceSubcomponent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SubcomponentDeclaration getTargetSubcomponent() {
		if (targetSubcomponent != null && targetSubcomponent.eIsProxy()) {
			InternalEObject oldTargetSubcomponent = (InternalEObject)targetSubcomponent;
			targetSubcomponent = (SubcomponentDeclaration)eResolveProxy(oldTargetSubcomponent);
			if (targetSubcomponent != oldTargetSubcomponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MontiarcPackage.CONNECTOR__TARGET_SUBCOMPONENT, oldTargetSubcomponent, targetSubcomponent));
			}
		}
		return targetSubcomponent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SubcomponentDeclaration basicGetTargetSubcomponent() {
		return targetSubcomponent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSubcomponent(SubcomponentDeclaration newTargetSubcomponent) {
		SubcomponentDeclaration oldTargetSubcomponent = targetSubcomponent;
		targetSubcomponent = newTargetSubcomponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.CONNECTOR__TARGET_SUBCOMPONENT, oldTargetSubcomponent, targetSubcomponent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getParent() {
		if (eContainerFeatureID() != MontiarcPackage.CONNECTOR__PARENT) return null;
		return (ComponentType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ComponentType newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, MontiarcPackage.CONNECTOR__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ComponentType newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != MontiarcPackage.CONNECTOR__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, MontiarcPackage.COMPONENT_TYPE__CONNECTORS, ComponentType.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.CONNECTOR__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MontiarcPackage.CONNECTOR__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ComponentType)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MontiarcPackage.CONNECTOR__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MontiarcPackage.CONNECTOR__PARENT:
				return eInternalContainer().eInverseRemove(this, MontiarcPackage.COMPONENT_TYPE__CONNECTORS, ComponentType.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MontiarcPackage.CONNECTOR__SOURCE_PORT:
				if (resolve) return getSourcePort();
				return basicGetSourcePort();
			case MontiarcPackage.CONNECTOR__TARGET_PORT:
				if (resolve) return getTargetPort();
				return basicGetTargetPort();
			case MontiarcPackage.CONNECTOR__SOURCE_SUBCOMPONENT:
				if (resolve) return getSourceSubcomponent();
				return basicGetSourceSubcomponent();
			case MontiarcPackage.CONNECTOR__TARGET_SUBCOMPONENT:
				if (resolve) return getTargetSubcomponent();
				return basicGetTargetSubcomponent();
			case MontiarcPackage.CONNECTOR__PARENT:
				return getParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MontiarcPackage.CONNECTOR__SOURCE_PORT:
				setSourcePort((Port)newValue);
				return;
			case MontiarcPackage.CONNECTOR__TARGET_PORT:
				setTargetPort((Port)newValue);
				return;
			case MontiarcPackage.CONNECTOR__SOURCE_SUBCOMPONENT:
				setSourceSubcomponent((SubcomponentDeclaration)newValue);
				return;
			case MontiarcPackage.CONNECTOR__TARGET_SUBCOMPONENT:
				setTargetSubcomponent((SubcomponentDeclaration)newValue);
				return;
			case MontiarcPackage.CONNECTOR__PARENT:
				setParent((ComponentType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MontiarcPackage.CONNECTOR__SOURCE_PORT:
				setSourcePort((Port)null);
				return;
			case MontiarcPackage.CONNECTOR__TARGET_PORT:
				setTargetPort((Port)null);
				return;
			case MontiarcPackage.CONNECTOR__SOURCE_SUBCOMPONENT:
				setSourceSubcomponent((SubcomponentDeclaration)null);
				return;
			case MontiarcPackage.CONNECTOR__TARGET_SUBCOMPONENT:
				setTargetSubcomponent((SubcomponentDeclaration)null);
				return;
			case MontiarcPackage.CONNECTOR__PARENT:
				setParent((ComponentType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MontiarcPackage.CONNECTOR__SOURCE_PORT:
				return sourcePort != null;
			case MontiarcPackage.CONNECTOR__TARGET_PORT:
				return targetPort != null;
			case MontiarcPackage.CONNECTOR__SOURCE_SUBCOMPONENT:
				return sourceSubcomponent != null;
			case MontiarcPackage.CONNECTOR__TARGET_SUBCOMPONENT:
				return targetSubcomponent != null;
			case MontiarcPackage.CONNECTOR__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();
		
		return this.getSourceSubcomponent().toString() + "." + this.getSourcePort().toString()  + " -> " + this.getTargetSubcomponent().toString()  + "."
				+ this.basicGetTargetPort().toString() ;
	}

} // ConnectorImpl
