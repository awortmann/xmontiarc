/**
 */
package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.ComponentBehavior;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.ComponentType;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.FsmPackage;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IncomingPort;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.MontiarcPackage;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.OutgoingPort;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Subcomponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.impl.SubcomponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.impl.SubcomponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.impl.SubcomponentImpl#getIncomingPorts <em>Incoming Ports</em>}</li>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.impl.SubcomponentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.impl.SubcomponentImpl#getOutgoingPorts <em>Outgoing Ports</em>}</li>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.impl.SubcomponentImpl#getLocalBehavior <em>Local Behavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubcomponentImpl extends EObjectImpl implements Subcomponent {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "UnnamedSubcomponent";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ComponentType type;

	/**
	 * The cached value of the '{@link #getIncomingPorts() <em>Incoming Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<IncomingPort> incomingPorts;

	/**
	 * The cached value of the '{@link #getOutgoingPorts() <em>Outgoing Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<OutgoingPort> outgoingPorts;

	/**
	 * The cached value of the '{@link #getLocalBehavior() <em>Local Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalBehavior()
	 * @generated
	 * @ordered
	 */
	protected ComponentBehavior localBehavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MontiarcPackage.Literals.SUBCOMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.SUBCOMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ComponentType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MontiarcPackage.SUBCOMPONENT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ComponentType newType) {
		ComponentType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.SUBCOMPONENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncomingPort> getIncomingPorts() {
		if (incomingPorts == null) {
			incomingPorts = new EObjectContainmentEList<IncomingPort>(IncomingPort.class, this, MontiarcPackage.SUBCOMPONENT__INCOMING_PORTS);
		}
		return incomingPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getParent() {
		if (eContainerFeatureID() != MontiarcPackage.SUBCOMPONENT__PARENT) return null;
		return (ComponentType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ComponentType newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, MontiarcPackage.SUBCOMPONENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ComponentType newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != MontiarcPackage.SUBCOMPONENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, MontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS, ComponentType.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.SUBCOMPONENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutgoingPort> getOutgoingPorts() {
		if (outgoingPorts == null) {
			outgoingPorts = new EObjectContainmentEList<OutgoingPort>(OutgoingPort.class, this, MontiarcPackage.SUBCOMPONENT__OUTGOING_PORTS);
		}
		return outgoingPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentBehavior getLocalBehavior() {
		return localBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalBehavior(ComponentBehavior newLocalBehavior, NotificationChain msgs) {
		ComponentBehavior oldLocalBehavior = localBehavior;
		localBehavior = newLocalBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MontiarcPackage.SUBCOMPONENT__LOCAL_BEHAVIOR, oldLocalBehavior, newLocalBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalBehavior(ComponentBehavior newLocalBehavior) {
		if (newLocalBehavior != localBehavior) {
			NotificationChain msgs = null;
			if (localBehavior != null)
				msgs = ((InternalEObject)localBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MontiarcPackage.SUBCOMPONENT__LOCAL_BEHAVIOR, null, msgs);
			if (newLocalBehavior != null)
				msgs = ((InternalEObject)newLocalBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MontiarcPackage.SUBCOMPONENT__LOCAL_BEHAVIOR, null, msgs);
			msgs = basicSetLocalBehavior(newLocalBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.SUBCOMPONENT__LOCAL_BEHAVIOR, newLocalBehavior, newLocalBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createDefaultBehavior() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void compute() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MontiarcPackage.SUBCOMPONENT__PARENT:
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
			case MontiarcPackage.SUBCOMPONENT__INCOMING_PORTS:
				return ((InternalEList<?>)getIncomingPorts()).basicRemove(otherEnd, msgs);
			case MontiarcPackage.SUBCOMPONENT__PARENT:
				return basicSetParent(null, msgs);
			case MontiarcPackage.SUBCOMPONENT__OUTGOING_PORTS:
				return ((InternalEList<?>)getOutgoingPorts()).basicRemove(otherEnd, msgs);
			case MontiarcPackage.SUBCOMPONENT__LOCAL_BEHAVIOR:
				return basicSetLocalBehavior(null, msgs);
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
			case MontiarcPackage.SUBCOMPONENT__PARENT:
				return eInternalContainer().eInverseRemove(this, MontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS, ComponentType.class, msgs);
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
			case MontiarcPackage.SUBCOMPONENT__NAME:
				return getName();
			case MontiarcPackage.SUBCOMPONENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case MontiarcPackage.SUBCOMPONENT__INCOMING_PORTS:
				return getIncomingPorts();
			case MontiarcPackage.SUBCOMPONENT__PARENT:
				return getParent();
			case MontiarcPackage.SUBCOMPONENT__OUTGOING_PORTS:
				return getOutgoingPorts();
			case MontiarcPackage.SUBCOMPONENT__LOCAL_BEHAVIOR:
				return getLocalBehavior();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MontiarcPackage.SUBCOMPONENT__NAME:
				setName((String)newValue);
				return;
			case MontiarcPackage.SUBCOMPONENT__TYPE:
				setType((ComponentType)newValue);
				return;
			case MontiarcPackage.SUBCOMPONENT__INCOMING_PORTS:
				getIncomingPorts().clear();
				getIncomingPorts().addAll((Collection<? extends IncomingPort>)newValue);
				return;
			case MontiarcPackage.SUBCOMPONENT__PARENT:
				setParent((ComponentType)newValue);
				return;
			case MontiarcPackage.SUBCOMPONENT__OUTGOING_PORTS:
				getOutgoingPorts().clear();
				getOutgoingPorts().addAll((Collection<? extends OutgoingPort>)newValue);
				return;
			case MontiarcPackage.SUBCOMPONENT__LOCAL_BEHAVIOR:
				setLocalBehavior((ComponentBehavior)newValue);
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
			case MontiarcPackage.SUBCOMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MontiarcPackage.SUBCOMPONENT__TYPE:
				setType((ComponentType)null);
				return;
			case MontiarcPackage.SUBCOMPONENT__INCOMING_PORTS:
				getIncomingPorts().clear();
				return;
			case MontiarcPackage.SUBCOMPONENT__PARENT:
				setParent((ComponentType)null);
				return;
			case MontiarcPackage.SUBCOMPONENT__OUTGOING_PORTS:
				getOutgoingPorts().clear();
				return;
			case MontiarcPackage.SUBCOMPONENT__LOCAL_BEHAVIOR:
				setLocalBehavior((ComponentBehavior)null);
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
			case MontiarcPackage.SUBCOMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MontiarcPackage.SUBCOMPONENT__TYPE:
				return type != null;
			case MontiarcPackage.SUBCOMPONENT__INCOMING_PORTS:
				return incomingPorts != null && !incomingPorts.isEmpty();
			case MontiarcPackage.SUBCOMPONENT__PARENT:
				return getParent() != null;
			case MontiarcPackage.SUBCOMPONENT__OUTGOING_PORTS:
				return outgoingPorts != null && !outgoingPorts.isEmpty();
			case MontiarcPackage.SUBCOMPONENT__LOCAL_BEHAVIOR:
				return localBehavior != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SubcomponentImpl
