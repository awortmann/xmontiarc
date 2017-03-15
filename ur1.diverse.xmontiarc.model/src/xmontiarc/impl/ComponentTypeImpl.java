/**
 */
package xmontiarc.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xmontiarc.ComponentType;
import xmontiarc.Connector;
import xmontiarc.IncomingPort;
import xmontiarc.OutgoingPort;
import xmontiarc.Subcomponent;
import xmontiarc.XmontiarcPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xmontiarc.impl.ComponentTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link xmontiarc.impl.ComponentTypeImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link xmontiarc.impl.ComponentTypeImpl#getSubcomponents <em>Subcomponents</em>}</li>
 *   <li>{@link xmontiarc.impl.ComponentTypeImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link xmontiarc.impl.ComponentTypeImpl#getIncomingPorts <em>Incoming Ports</em>}</li>
 *   <li>{@link xmontiarc.impl.ComponentTypeImpl#getOutgoingPorts <em>Outgoing Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentTypeImpl extends MinimalEObjectImpl.Container implements ComponentType {
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
	 * The default value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final String BEHAVIOR_EDEFAULT = "\"\"";

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected String behavior = BEHAVIOR_EDEFAULT;

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
		return XmontiarcPackage.Literals.COMPONENT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmontiarcPackage.COMPONENT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentWithInverseEList<Connector>(Connector.class, this, XmontiarcPackage.COMPONENT_TYPE__CONNECTORS, XmontiarcPackage.CONNECTOR__PARENT);
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
			subcomponents = new EObjectContainmentWithInverseEList<Subcomponent>(Subcomponent.class, this, XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS, XmontiarcPackage.SUBCOMPONENT__PARENT);
		}
		return subcomponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(String newBehavior) {
		String oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmontiarcPackage.COMPONENT_TYPE__BEHAVIOR, oldBehavior, behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncomingPort> getIncomingPorts() {
		if (incomingPorts == null) {
			incomingPorts = new EObjectContainmentEList<IncomingPort>(IncomingPort.class, this, XmontiarcPackage.COMPONENT_TYPE__INCOMING_PORTS);
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
			outgoingPorts = new EObjectContainmentEList<OutgoingPort>(OutgoingPort.class, this, XmontiarcPackage.COMPONENT_TYPE__OUTGOING_PORTS);
		}
		return outgoingPorts;
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
			case XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectors()).basicAdd(otherEnd, msgs);
			case XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
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
			case XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
			case XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
				return ((InternalEList<?>)getSubcomponents()).basicRemove(otherEnd, msgs);
			case XmontiarcPackage.COMPONENT_TYPE__INCOMING_PORTS:
				return ((InternalEList<?>)getIncomingPorts()).basicRemove(otherEnd, msgs);
			case XmontiarcPackage.COMPONENT_TYPE__OUTGOING_PORTS:
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
			case XmontiarcPackage.COMPONENT_TYPE__NAME:
				return getName();
			case XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
				return getConnectors();
			case XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
				return getSubcomponents();
			case XmontiarcPackage.COMPONENT_TYPE__BEHAVIOR:
				return getBehavior();
			case XmontiarcPackage.COMPONENT_TYPE__INCOMING_PORTS:
				return getIncomingPorts();
			case XmontiarcPackage.COMPONENT_TYPE__OUTGOING_PORTS:
				return getOutgoingPorts();
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
			case XmontiarcPackage.COMPONENT_TYPE__NAME:
				setName((String)newValue);
				return;
			case XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
				getSubcomponents().clear();
				getSubcomponents().addAll((Collection<? extends Subcomponent>)newValue);
				return;
			case XmontiarcPackage.COMPONENT_TYPE__BEHAVIOR:
				setBehavior((String)newValue);
				return;
			case XmontiarcPackage.COMPONENT_TYPE__INCOMING_PORTS:
				getIncomingPorts().clear();
				getIncomingPorts().addAll((Collection<? extends IncomingPort>)newValue);
				return;
			case XmontiarcPackage.COMPONENT_TYPE__OUTGOING_PORTS:
				getOutgoingPorts().clear();
				getOutgoingPorts().addAll((Collection<? extends OutgoingPort>)newValue);
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
			case XmontiarcPackage.COMPONENT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
				getConnectors().clear();
				return;
			case XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
				getSubcomponents().clear();
				return;
			case XmontiarcPackage.COMPONENT_TYPE__BEHAVIOR:
				setBehavior(BEHAVIOR_EDEFAULT);
				return;
			case XmontiarcPackage.COMPONENT_TYPE__INCOMING_PORTS:
				getIncomingPorts().clear();
				return;
			case XmontiarcPackage.COMPONENT_TYPE__OUTGOING_PORTS:
				getOutgoingPorts().clear();
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
			case XmontiarcPackage.COMPONENT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
				return subcomponents != null && !subcomponents.isEmpty();
			case XmontiarcPackage.COMPONENT_TYPE__BEHAVIOR:
				return BEHAVIOR_EDEFAULT == null ? behavior != null : !BEHAVIOR_EDEFAULT.equals(behavior);
			case XmontiarcPackage.COMPONENT_TYPE__INCOMING_PORTS:
				return incomingPorts != null && !incomingPorts.isEmpty();
			case XmontiarcPackage.COMPONENT_TYPE__OUTGOING_PORTS:
				return outgoingPorts != null && !outgoingPorts.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer();
		result.append(name);
		return result.toString();
	}
	
} //ComponentTypeImpl
