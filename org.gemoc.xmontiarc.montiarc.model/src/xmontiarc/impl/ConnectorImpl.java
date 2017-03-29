/**
 */
package xmontiarc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import xmontiarc.ComponentType;
import xmontiarc.Connector;
import xmontiarc.Port;
import xmontiarc.XmontiarcPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xmontiarc.impl.ConnectorImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmontiarcPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getParent() {
		if (eContainerFeatureID() != XmontiarcPackage.CONNECTOR__PARENT) return null;
		return (ComponentType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ComponentType newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, XmontiarcPackage.CONNECTOR__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ComponentType newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != XmontiarcPackage.CONNECTOR__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, XmontiarcPackage.COMPONENT_TYPE__CONNECTORS, ComponentType.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmontiarcPackage.CONNECTOR__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract Port getSource();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract Port getTarget();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmontiarcPackage.CONNECTOR__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ComponentType)otherEnd, msgs);
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
			case XmontiarcPackage.CONNECTOR__PARENT:
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
			case XmontiarcPackage.CONNECTOR__PARENT:
				return eInternalContainer().eInverseRemove(this, XmontiarcPackage.COMPONENT_TYPE__CONNECTORS, ComponentType.class, msgs);
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
			case XmontiarcPackage.CONNECTOR__PARENT:
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
			case XmontiarcPackage.CONNECTOR__PARENT:
				setParent((ComponentType)newValue);
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
			case XmontiarcPackage.CONNECTOR__PARENT:
				setParent((ComponentType)null);
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
			case XmontiarcPackage.CONNECTOR__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
//		StringBuffer result = new StringBuffer();
//		ComponentType parent = this.getParent();
//		
//		if (this.getSource() != null) {
//			Port source = this.getSource();
//			boolean sourcePortOfSurroundingComponent = parent.getPorts().contains(source);
//			if (sourcePortOfSurroundingComponent) {
//				result.append(parent.getName() + "." + source.getName());
//			}
//			else { // port must be of some subcomponent of the surrounding component
//				for (Subcomponent sc: parent.getSubcomponents()) {
//					if (sc.getPorts().contains(source)) {
//						result.append(sc.getName() + "." + source.getName());
//					}
//				}
//			}
//			
//		}
//		else {
//			result.append("<undefined>");
//		}
//		
//		result.append(" -> ");
//		
//		if (this.getTarget() != null) {
//			Port target = this.getTarget();
//			boolean targetPortOfSurroundingComponent = parent.getPorts().contains(target);
//			if (targetPortOfSurroundingComponent) {
//				result.append(parent.getName() + "." + target.getName());
//			}
//			else { // port must be of some subcomponent of the surrounding component
//				for (Subcomponent sc: parent.getSubcomponents()) {
//					if (sc.getPorts().contains(target)) {
//						result.append(sc.getName() + "." + target.getName());
//					}
//				}
//			}
//			
//		}
//		else {
//			result.append("<undefined>");
//		}
//		
//		return result.toString();
		return super.toString();
	}

} //ConnectorImpl
