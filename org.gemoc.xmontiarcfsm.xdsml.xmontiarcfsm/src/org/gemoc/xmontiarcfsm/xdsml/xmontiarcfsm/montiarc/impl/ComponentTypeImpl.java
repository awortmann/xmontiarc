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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.ComponentBehavior;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.ComponentType;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Connector;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.IncomingPort;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.MontiarcPackage;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.OutgoingPort;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Port;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.Subcomponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.impl.ComponentTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.impl.ComponentTypeImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.impl.ComponentTypeImpl#getSubcomponents <em>Subcomponents</em>}</li>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.impl.ComponentTypeImpl#getIncomingPorts <em>Incoming Ports</em>}</li>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.impl.ComponentTypeImpl#getOutgoingPorts <em>Outgoing Ports</em>}</li>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.montiarc.impl.ComponentTypeImpl#getBehavior <em>Behavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentTypeImpl extends EObjectImpl implements ComponentType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "UnnamedComponentType";

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
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

	/**
	 * The cached value of the '{@link #getSubcomponents() <em>Subcomponents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcomponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Subcomponent> subcomponents;

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
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected ComponentBehavior behavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MontiarcPackage.Literals.COMPONENT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.COMPONENT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentWithInverseEList<Connector>(Connector.class, this, MontiarcPackage.COMPONENT_TYPE__CONNECTORS, MontiarcPackage.CONNECTOR__PARENT);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subcomponent> getSubcomponents() {
		if (subcomponents == null) {
			subcomponents = new EObjectContainmentWithInverseEList<Subcomponent>(Subcomponent.class, this, MontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS, MontiarcPackage.SUBCOMPONENT__PARENT);
		}
		return subcomponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncomingPort> getIncomingPorts() {
		if (incomingPorts == null) {
			incomingPorts = new EObjectContainmentEList<IncomingPort>(IncomingPort.class, this, MontiarcPackage.COMPONENT_TYPE__INCOMING_PORTS);
		}
		return incomingPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutgoingPort> getOutgoingPorts() {
		if (outgoingPorts == null) {
			outgoingPorts = new EObjectContainmentEList<OutgoingPort>(OutgoingPort.class, this, MontiarcPackage.COMPONENT_TYPE__OUTGOING_PORTS);
		}
		return outgoingPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentBehavior getBehavior() {
		if (behavior != null && behavior.eIsProxy()) {
			InternalEObject oldBehavior = (InternalEObject)behavior;
			behavior = (ComponentBehavior)eResolveProxy(oldBehavior);
			if (behavior != oldBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MontiarcPackage.COMPONENT_TYPE__BEHAVIOR, oldBehavior, behavior));
			}
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentBehavior basicGetBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(ComponentBehavior newBehavior) {
		ComponentBehavior oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.COMPONENT_TYPE__BEHAVIOR, oldBehavior, behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializeModel(EList<String> args) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main() {
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
	public void update() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subcomponent findOwnerOf(Port p) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getOutgoingPortsOfSubcomponents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getIncomingPortsOfSubcomponents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getDirectedPortsOfSubcomponents(boolean collectIncoming) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MontiarcPackage.COMPONENT_TYPE__CONNECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectors()).basicAdd(otherEnd, msgs);
			case MontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubcomponents()).basicAdd(otherEnd, msgs);
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
			case MontiarcPackage.COMPONENT_TYPE__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
			case MontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
				return ((InternalEList<?>)getSubcomponents()).basicRemove(otherEnd, msgs);
			case MontiarcPackage.COMPONENT_TYPE__INCOMING_PORTS:
				return ((InternalEList<?>)getIncomingPorts()).basicRemove(otherEnd, msgs);
			case MontiarcPackage.COMPONENT_TYPE__OUTGOING_PORTS:
				return ((InternalEList<?>)getOutgoingPorts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MontiarcPackage.COMPONENT_TYPE__NAME:
				return getName();
			case MontiarcPackage.COMPONENT_TYPE__CONNECTORS:
				return getConnectors();
			case MontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
				return getSubcomponents();
			case MontiarcPackage.COMPONENT_TYPE__INCOMING_PORTS:
				return getIncomingPorts();
			case MontiarcPackage.COMPONENT_TYPE__OUTGOING_PORTS:
				return getOutgoingPorts();
			case MontiarcPackage.COMPONENT_TYPE__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
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
			case MontiarcPackage.COMPONENT_TYPE__NAME:
				setName((String)newValue);
				return;
			case MontiarcPackage.COMPONENT_TYPE__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case MontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
				getSubcomponents().clear();
				getSubcomponents().addAll((Collection<? extends Subcomponent>)newValue);
				return;
			case MontiarcPackage.COMPONENT_TYPE__INCOMING_PORTS:
				getIncomingPorts().clear();
				getIncomingPorts().addAll((Collection<? extends IncomingPort>)newValue);
				return;
			case MontiarcPackage.COMPONENT_TYPE__OUTGOING_PORTS:
				getOutgoingPorts().clear();
				getOutgoingPorts().addAll((Collection<? extends OutgoingPort>)newValue);
				return;
			case MontiarcPackage.COMPONENT_TYPE__BEHAVIOR:
				setBehavior((ComponentBehavior)newValue);
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
			case MontiarcPackage.COMPONENT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MontiarcPackage.COMPONENT_TYPE__CONNECTORS:
				getConnectors().clear();
				return;
			case MontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
				getSubcomponents().clear();
				return;
			case MontiarcPackage.COMPONENT_TYPE__INCOMING_PORTS:
				getIncomingPorts().clear();
				return;
			case MontiarcPackage.COMPONENT_TYPE__OUTGOING_PORTS:
				getOutgoingPorts().clear();
				return;
			case MontiarcPackage.COMPONENT_TYPE__BEHAVIOR:
				setBehavior((ComponentBehavior)null);
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
			case MontiarcPackage.COMPONENT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MontiarcPackage.COMPONENT_TYPE__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case MontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
				return subcomponents != null && !subcomponents.isEmpty();
			case MontiarcPackage.COMPONENT_TYPE__INCOMING_PORTS:
				return incomingPorts != null && !incomingPorts.isEmpty();
			case MontiarcPackage.COMPONENT_TYPE__OUTGOING_PORTS:
				return outgoingPorts != null && !outgoingPorts.isEmpty();
			case MontiarcPackage.COMPONENT_TYPE__BEHAVIOR:
				return behavior != null;
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

} //ComponentTypeImpl
