/**
 */
package montiarc.impl;

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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import montiarc.ComponentInstance;
import montiarc.ComponentType;
import montiarc.ConnectorType;
import montiarc.MontiarcPackage;
import montiarc.PortInstance;
import montiarc.PortType;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Component Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link montiarc.impl.ComponentTypeImpl#getName <em>Name</em>}</li>
 * <li>{@link montiarc.impl.ComponentTypeImpl#getSuperComponentType <em>Super
 * Component Type</em>}</li>
 * <li>{@link montiarc.impl.ComponentTypeImpl#getPortTypes <em>Port
 * Types</em>}</li>
 * <li>{@link montiarc.impl.ComponentTypeImpl#getConnectorTypes <em>Connector
 * Types</em>}</li>
 * <li>{@link montiarc.impl.ComponentTypeImpl#getComponentInstances
 * <em>Component Instances</em>}</li>
 * <li>{@link montiarc.impl.ComponentTypeImpl#getGroovyBehavior <em>Groovy
 * Behavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentTypeImpl extends MinimalEObjectImpl.Container implements ComponentType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "UnnamedComponentType";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuperComponentType() <em>Super
	 * Component Type</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSuperComponentType()
	 * @generated
	 * @ordered
	 */
	protected ComponentType superComponentType;

	/**
	 * The cached value of the '{@link #getPortTypes() <em>Port Types</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPortTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PortType> portTypes;

	/**
	 * The cached value of the '{@link #getConnectorTypes() <em>Connector
	 * Types</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getConnectorTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorType> connectorTypes;

	/**
	 * The cached value of the '{@link #getComponentInstances() <em>Component
	 * Instances</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getComponentInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> componentInstances;

	/**
	 * The default value of the '{@link #getGroovyBehavior() <em>Groovy
	 * Behavior</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGroovyBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final String GROOVY_BEHAVIOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroovyBehavior() <em>Groovy
	 * Behavior</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGroovyBehavior()
	 * @generated
	 * @ordered
	 */
	protected String groovyBehavior = GROOVY_BEHAVIOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MontiarcPackage.Literals.COMPONENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.COMPONENT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComponentType getSuperComponentType() {
		if (superComponentType != null && superComponentType.eIsProxy()) {
			InternalEObject oldSuperComponentType = (InternalEObject) superComponentType;
			superComponentType = (ComponentType) eResolveProxy(oldSuperComponentType);
			if (superComponentType != oldSuperComponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MontiarcPackage.COMPONENT_TYPE__SUPER_COMPONENT_TYPE, oldSuperComponentType,
							superComponentType));
			}
		}
		return superComponentType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComponentType basicGetSuperComponentType() {
		return superComponentType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSuperComponentType(ComponentType newSuperComponentType) {
		ComponentType oldSuperComponentType = superComponentType;
		superComponentType = newSuperComponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.COMPONENT_TYPE__SUPER_COMPONENT_TYPE,
					oldSuperComponentType, superComponentType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<PortType> getPortTypes() {
		if (portTypes == null) {
			portTypes = new EObjectContainmentWithInverseEList<PortType>(PortType.class, this,
					MontiarcPackage.COMPONENT_TYPE__PORT_TYPES, MontiarcPackage.PORT_TYPE__PARENT);
		}
		return portTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ConnectorType> getConnectorTypes() {
		if (connectorTypes == null) {
			connectorTypes = new EObjectContainmentWithInverseEList<ConnectorType>(ConnectorType.class, this,
					MontiarcPackage.COMPONENT_TYPE__CONNECTOR_TYPES, MontiarcPackage.CONNECTOR_TYPE__PARENT);
		}
		return connectorTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ComponentInstance> getComponentInstances() {
		if (componentInstances == null) {
			componentInstances = new EObjectContainmentWithInverseEList<ComponentInstance>(ComponentInstance.class,
					this, MontiarcPackage.COMPONENT_TYPE__COMPONENT_INSTANCES,
					MontiarcPackage.COMPONENT_INSTANCE__PARENT);
		}
		return componentInstances;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getGroovyBehavior() {
		return groovyBehavior;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setGroovyBehavior(String newGroovyBehavior) {
		String oldGroovyBehavior = groovyBehavior;
		groovyBehavior = newGroovyBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.COMPONENT_TYPE__GROOVY_BEHAVIOR,
					oldGroovyBehavior, groovyBehavior));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MontiarcPackage.COMPONENT_TYPE__PORT_TYPES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPortTypes()).basicAdd(otherEnd, msgs);
		case MontiarcPackage.COMPONENT_TYPE__CONNECTOR_TYPES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConnectorTypes()).basicAdd(otherEnd, msgs);
		case MontiarcPackage.COMPONENT_TYPE__COMPONENT_INSTANCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getComponentInstances()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MontiarcPackage.COMPONENT_TYPE__PORT_TYPES:
			return ((InternalEList<?>) getPortTypes()).basicRemove(otherEnd, msgs);
		case MontiarcPackage.COMPONENT_TYPE__CONNECTOR_TYPES:
			return ((InternalEList<?>) getConnectorTypes()).basicRemove(otherEnd, msgs);
		case MontiarcPackage.COMPONENT_TYPE__COMPONENT_INSTANCES:
			return ((InternalEList<?>) getComponentInstances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MontiarcPackage.COMPONENT_TYPE__NAME:
			return getName();
		case MontiarcPackage.COMPONENT_TYPE__SUPER_COMPONENT_TYPE:
			if (resolve)
				return getSuperComponentType();
			return basicGetSuperComponentType();
		case MontiarcPackage.COMPONENT_TYPE__PORT_TYPES:
			return getPortTypes();
		case MontiarcPackage.COMPONENT_TYPE__CONNECTOR_TYPES:
			return getConnectorTypes();
		case MontiarcPackage.COMPONENT_TYPE__COMPONENT_INSTANCES:
			return getComponentInstances();
		case MontiarcPackage.COMPONENT_TYPE__GROOVY_BEHAVIOR:
			return getGroovyBehavior();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MontiarcPackage.COMPONENT_TYPE__NAME:
			setName((String) newValue);
			return;
		case MontiarcPackage.COMPONENT_TYPE__SUPER_COMPONENT_TYPE:
			setSuperComponentType((ComponentType) newValue);
			return;
		case MontiarcPackage.COMPONENT_TYPE__PORT_TYPES:
			getPortTypes().clear();
			getPortTypes().addAll((Collection<? extends PortType>) newValue);
			return;
		case MontiarcPackage.COMPONENT_TYPE__CONNECTOR_TYPES:
			getConnectorTypes().clear();
			getConnectorTypes().addAll((Collection<? extends ConnectorType>) newValue);
			return;
		case MontiarcPackage.COMPONENT_TYPE__COMPONENT_INSTANCES:
			getComponentInstances().clear();
			getComponentInstances().addAll((Collection<? extends ComponentInstance>) newValue);
			return;
		case MontiarcPackage.COMPONENT_TYPE__GROOVY_BEHAVIOR:
			setGroovyBehavior((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MontiarcPackage.COMPONENT_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MontiarcPackage.COMPONENT_TYPE__SUPER_COMPONENT_TYPE:
			setSuperComponentType((ComponentType) null);
			return;
		case MontiarcPackage.COMPONENT_TYPE__PORT_TYPES:
			getPortTypes().clear();
			return;
		case MontiarcPackage.COMPONENT_TYPE__CONNECTOR_TYPES:
			getConnectorTypes().clear();
			return;
		case MontiarcPackage.COMPONENT_TYPE__COMPONENT_INSTANCES:
			getComponentInstances().clear();
			return;
		case MontiarcPackage.COMPONENT_TYPE__GROOVY_BEHAVIOR:
			setGroovyBehavior(GROOVY_BEHAVIOR_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MontiarcPackage.COMPONENT_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MontiarcPackage.COMPONENT_TYPE__SUPER_COMPONENT_TYPE:
			return superComponentType != null;
		case MontiarcPackage.COMPONENT_TYPE__PORT_TYPES:
			return portTypes != null && !portTypes.isEmpty();
		case MontiarcPackage.COMPONENT_TYPE__CONNECTOR_TYPES:
			return connectorTypes != null && !connectorTypes.isEmpty();
		case MontiarcPackage.COMPONENT_TYPE__COMPONENT_INSTANCES:
			return componentInstances != null && !componentInstances.isEmpty();
		case MontiarcPackage.COMPONENT_TYPE__GROOVY_BEHAVIOR:
			return GROOVY_BEHAVIOR_EDEFAULT == null ? groovyBehavior != null
					: !GROOVY_BEHAVIOR_EDEFAULT.equals(groovyBehavior);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		String result = this.getName();
		return result;
	}

	public List<PortInstance> getOutgoingPortsOfSubcomponents() {
		List<PortInstance> outgoingPortInstances = new ArrayList<>();
		for (ComponentInstance sc: this.getComponentInstances()) {
			for (PortInstance p : sc.getPortInstances()) {
				if (!p.getType().isIsIncoming()) {
					outgoingPortInstances.add(p);
				}
			}
		}
		return outgoingPortInstances;
	}
	
	public List<PortInstance> getIncomingPortsOfSubcomponents() {
		List<PortInstance> incomingPortInstance = new ArrayList<>();
		for (ComponentInstance sc: this.getComponentInstances()) {
			for (PortInstance p : sc.getPortInstances()) {
				if (p.getType().isIsIncoming()) {
					incomingPortInstance.add(p);
				}
			}
		}
		return incomingPortInstance;
	}


} // ComponentTypeImpl
