/**
 */
package montiarc.impl;

import java.util.Collection;
import montiarc.ComponentInstance;
import montiarc.ComponentType;
import montiarc.ConnectorType;
import montiarc.MontiarcPackage;
import montiarc.PortType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link montiarc.impl.ComponentTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link montiarc.impl.ComponentTypeImpl#getSuperComponentType <em>Super Component Type</em>}</li>
 *   <li>{@link montiarc.impl.ComponentTypeImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link montiarc.impl.ComponentTypeImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link montiarc.impl.ComponentTypeImpl#getSubcomponents <em>Subcomponents</em>}</li>
 *   <li>{@link montiarc.impl.ComponentTypeImpl#getGroovyBehavior <em>Groovy Behavior</em>}</li>
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
	 * The cached value of the '{@link #getSuperComponentType() <em>Super Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperComponentType()
	 * @generated
	 * @ordered
	 */
	protected ComponentType superComponentType;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<PortType> ports;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorType> connectors;

	/**
	 * The cached value of the '{@link #getSubcomponents() <em>Subcomponents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcomponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> subcomponents;

	/**
	 * The default value of the '{@link #getGroovyBehavior() <em>Groovy Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroovyBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final String GROOVY_BEHAVIOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroovyBehavior() <em>Groovy Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroovyBehavior()
	 * @generated
	 * @ordered
	 */
	protected String groovyBehavior = GROOVY_BEHAVIOR_EDEFAULT;

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
	public ComponentType getSuperComponentType() {
		if (superComponentType != null && superComponentType.eIsProxy()) {
			InternalEObject oldSuperComponentType = (InternalEObject)superComponentType;
			superComponentType = (ComponentType)eResolveProxy(oldSuperComponentType);
			if (superComponentType != oldSuperComponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MontiarcPackage.COMPONENT_TYPE__SUPER_COMPONENT_TYPE, oldSuperComponentType, superComponentType));
			}
		}
		return superComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType basicGetSuperComponentType() {
		return superComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperComponentType(ComponentType newSuperComponentType) {
		ComponentType oldSuperComponentType = superComponentType;
		superComponentType = newSuperComponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.COMPONENT_TYPE__SUPER_COMPONENT_TYPE, oldSuperComponentType, superComponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortType> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentWithInverseEList<PortType>(PortType.class, this, MontiarcPackage.COMPONENT_TYPE__PORTS, MontiarcPackage.PORT_TYPE__PARENT);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentWithInverseEList<ConnectorType>(ConnectorType.class, this, MontiarcPackage.COMPONENT_TYPE__CONNECTORS, MontiarcPackage.CONNECTOR_TYPE__PARENT);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getSubcomponents() {
		if (subcomponents == null) {
			subcomponents = new EObjectContainmentWithInverseEList<ComponentInstance>(ComponentInstance.class, this, MontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS, MontiarcPackage.COMPONENT_INSTANCE__PARENT);
		}
		return subcomponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroovyBehavior() {
		return groovyBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroovyBehavior(String newGroovyBehavior) {
		String oldGroovyBehavior = groovyBehavior;
		groovyBehavior = newGroovyBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.COMPONENT_TYPE__GROOVY_BEHAVIOR, oldGroovyBehavior, groovyBehavior));
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
			case MontiarcPackage.COMPONENT_TYPE__PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPorts()).basicAdd(otherEnd, msgs);
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
			case MontiarcPackage.COMPONENT_TYPE__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case MontiarcPackage.COMPONENT_TYPE__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
			case MontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
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
			case MontiarcPackage.COMPONENT_TYPE__NAME:
				return getName();
			case MontiarcPackage.COMPONENT_TYPE__SUPER_COMPONENT_TYPE:
				if (resolve) return getSuperComponentType();
				return basicGetSuperComponentType();
			case MontiarcPackage.COMPONENT_TYPE__PORTS:
				return getPorts();
			case MontiarcPackage.COMPONENT_TYPE__CONNECTORS:
				return getConnectors();
			case MontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
				return getSubcomponents();
			case MontiarcPackage.COMPONENT_TYPE__GROOVY_BEHAVIOR:
				return getGroovyBehavior();
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
			case MontiarcPackage.COMPONENT_TYPE__SUPER_COMPONENT_TYPE:
				setSuperComponentType((ComponentType)newValue);
				return;
			case MontiarcPackage.COMPONENT_TYPE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends PortType>)newValue);
				return;
			case MontiarcPackage.COMPONENT_TYPE__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case MontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
				getSubcomponents().clear();
				getSubcomponents().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
			case MontiarcPackage.COMPONENT_TYPE__GROOVY_BEHAVIOR:
				setGroovyBehavior((String)newValue);
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
			case MontiarcPackage.COMPONENT_TYPE__SUPER_COMPONENT_TYPE:
				setSuperComponentType((ComponentType)null);
				return;
			case MontiarcPackage.COMPONENT_TYPE__PORTS:
				getPorts().clear();
				return;
			case MontiarcPackage.COMPONENT_TYPE__CONNECTORS:
				getConnectors().clear();
				return;
			case MontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
				getSubcomponents().clear();
				return;
			case MontiarcPackage.COMPONENT_TYPE__GROOVY_BEHAVIOR:
				setGroovyBehavior(GROOVY_BEHAVIOR_EDEFAULT);
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
			case MontiarcPackage.COMPONENT_TYPE__SUPER_COMPONENT_TYPE:
				return superComponentType != null;
			case MontiarcPackage.COMPONENT_TYPE__PORTS:
				return ports != null && !ports.isEmpty();
			case MontiarcPackage.COMPONENT_TYPE__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case MontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS:
				return subcomponents != null && !subcomponents.isEmpty();
			case MontiarcPackage.COMPONENT_TYPE__GROOVY_BEHAVIOR:
				return GROOVY_BEHAVIOR_EDEFAULT == null ? groovyBehavior != null : !GROOVY_BEHAVIOR_EDEFAULT.equals(groovyBehavior);
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

		String result = this.getName();
		return result;
	}

} //ComponentTypeImpl
