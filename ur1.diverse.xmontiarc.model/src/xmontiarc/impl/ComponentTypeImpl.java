/**
 */
package xmontiarc.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
import xmontiarc.Port;
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
 *   <li>{@link xmontiarc.impl.ComponentTypeImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link xmontiarc.impl.ComponentTypeImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link xmontiarc.impl.ComponentTypeImpl#getSubcomponents <em>Subcomponents</em>}</li>
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
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

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
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, XmontiarcPackage.COMPONENT_TYPE__PORTS);
		}
		return ports;
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
			subcomponents = new EObjectContainmentEList<Subcomponent>(Subcomponent.class, this, XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS);
		}
		return subcomponents;
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
			case XmontiarcPackage.COMPONENT_TYPE__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
			case XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
				return ((InternalEList<?>)getSubcomponents()).basicRemove(otherEnd, msgs);
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
			case XmontiarcPackage.COMPONENT_TYPE__PORTS:
				return getPorts();
			case XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
				return getConnectors();
			case XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
				return getSubcomponents();
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
			case XmontiarcPackage.COMPONENT_TYPE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
				getSubcomponents().clear();
				getSubcomponents().addAll((Collection<? extends Subcomponent>)newValue);
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
			case XmontiarcPackage.COMPONENT_TYPE__PORTS:
				getPorts().clear();
				return;
			case XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
				getConnectors().clear();
				return;
			case XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
				getSubcomponents().clear();
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
			case XmontiarcPackage.COMPONENT_TYPE__PORTS:
				return ports != null && !ports.isEmpty();
			case XmontiarcPackage.COMPONENT_TYPE__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
				return subcomponents != null && !subcomponents.isEmpty();
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<Port> getOutgoingPortsOfSubcomponents() {
		return this.getDirectedPortsOfSubcomponents(false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<Port> getIncomingPortsOfSubcomponents() {
		return this.getDirectedPortsOfSubcomponents(true);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<Port> getDirectedPortsOfSubcomponents(boolean collectIncoming) {
		List<Port> incomingPorts = new ArrayList<>();
		for (Subcomponent sc: this.getSubcomponents()) {
			for (Port p : sc.getDerivedPorts()) {
				if (p.isIncoming()==collectIncoming) {
					incomingPorts.add(p);
				}
			}
		}
		return incomingPorts;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<Port> getIncomingPorts() {
		return this.getDirectedPorts(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<Port> getOutgoingPorts() {
		return this.getDirectedPorts(false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private List<Port> getDirectedPorts(boolean collectIncomingPorts) {
		List<Port> ports = new ArrayList<Port>();
		for (Port p : this.getPorts()) {
			if (p.isIncoming()==collectIncomingPorts) {
				ports.add(p);
			}
		}
		return ports;
	}

} //ComponentTypeImpl
