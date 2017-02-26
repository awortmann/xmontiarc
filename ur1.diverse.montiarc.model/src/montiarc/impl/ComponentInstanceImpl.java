/**
 */
package montiarc.impl;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import montiarc.ComponentInstance;
import montiarc.ComponentType;
import montiarc.MontiarcFactory;
import montiarc.MontiarcPackage;
import montiarc.PortInstance;
import montiarc.PortType;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Component Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link montiarc.impl.ComponentInstanceImpl#getInstanceName <em>Instance
 * Name</em>}</li>
 * <li>{@link montiarc.impl.ComponentInstanceImpl#getType <em>Type</em>}</li>
 * <li>{@link montiarc.impl.ComponentInstanceImpl#getPorts <em>Ports</em>}</li>
 * <li>{@link montiarc.impl.ComponentInstanceImpl#getParent
 * <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentInstanceImpl extends MinimalEObjectImpl.Container implements ComponentInstance {
	/**
	 * The default value of the '{@link #getInstanceName() <em>Instance
	 * Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_NAME_EDEFAULT = "UnnamedComponentInstance";

	/**
	 * The cached value of the '{@link #getInstanceName() <em>Instance
	 * Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected String instanceName = INSTANCE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ComponentType type;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<PortInstance> ports;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MontiarcPackage.Literals.COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getInstanceName() {
		return instanceName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setInstanceName(String newInstanceName) {
		String oldInstanceName = instanceName;
		instanceName = newInstanceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.COMPONENT_INSTANCE__INSTANCE_NAME,
					oldInstanceName, instanceName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComponentType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (ComponentType) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MontiarcPackage.COMPONENT_INSTANCE__TYPE,
							oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComponentType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setType(ComponentType newType) {
		System.out.println(this.toString() + ".setType(" + newType.toString() + "):");
		ComponentType oldType = type;
		type = newType;
		// this.derivePorts();
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.COMPONENT_INSTANCE__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<PortInstance> getPorts() {
		if (ports == null) {
			System.out.println(this.toString() + ".getPorts(): Creating new ports list");
			ports = new EObjectContainmentWithInverseEList<PortInstance>(PortInstance.class, this,
					MontiarcPackage.COMPONENT_INSTANCE__PORTS, MontiarcPackage.PORT_INSTANCE__PARENT);
		} else {
			try {
				this.setDerivedPorts();
			} catch (IOException e) {
				e.printStackTrace();
				throw new Error(e);
			}
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @throws IOException
	 * 
	 * @generated NOT
	 */
	private boolean derivedPortsRequireUpdate() {
		if (this.getType() != null) {
			System.out.println(this.instanceName + "' has port instances '" + ports + "'");
			// 1.) Check whether all ports defined by the port types of the
			// component type exist
			for (PortType pt : this.getType().getPorts()) {
				boolean portTypeFound = false;
				for (PortInstance pi : this.ports) {
					if (pt.getName().equals(pi.getType().getName())) {
						portTypeFound = true;
					}
				}
				if (!portTypeFound) {
					System.out.println("Component instance '" + this.instanceName + "' is missing a port of type '" + pt.getName() + "'!");
					return true;
				}
			}
			// 2.) Check whether no port or a type not defined by the component
			// type exists
			for (PortInstance pi : this.ports) {
				boolean portOfComponentType = false;
				for (PortType pt : this.getType().getPorts()) {
					if (pi.getType().getName().equals(pt.getName())) {
						portOfComponentType = true;
					}
				}
				if (!portOfComponentType) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @throws IOException
	 * 
	 * @generated NOT
	 */
	private void setDerivedPorts() throws IOException {
		if (this.getType() != null && derivedPortsRequireUpdate()) {
			// 1.) Cleanup existing ports in model and its resource
			this.ports.clear();
			Set<EObject> existingPortInstances = new HashSet<EObject>();
			for (EObject item : this.eResource().getContents()) {
				System.out.println("item = " + item.toString());
				if (item instanceof PortInstance) {
					existingPortInstances.add(item);
				}
			}
			this.eResource().getContents().removeAll(existingPortInstances);

			// 2.) Calculate ports derived from component type
			Set<PortInstance> newPortInstances = new HashSet<PortInstance>();
			ComponentType type = this.getType();
			for (PortType pt : type.getPorts()) {
				if (!containsPortInstanceOfType(pt)) {
					PortInstance pi = MontiarcFactory.eINSTANCE.createPortInstance();
					pi.setType(pt);
					newPortInstances.add(pi);
				}
			}

			// 3.) Add
			System.out.println("newPortInstances = " + newPortInstances.toString());
			this.ports.addAll(newPortInstances);
			this.eResource().getContents().addAll(newPortInstances);
			this.eResource().save(null);

		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	private boolean containsPortInstanceOfType(PortType pt) {
		for (PortInstance pi : this.ports) {
			if (pi.getType().getName().equals(pt.getName())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComponentType getParent() {
		if (eContainerFeatureID() != MontiarcPackage.COMPONENT_INSTANCE__PARENT)
			return null;
		return (ComponentType) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetParent(ComponentType newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParent, MontiarcPackage.COMPONENT_INSTANCE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParent(ComponentType newParent) {
		if (newParent != eInternalContainer()
				|| (eContainerFeatureID() != MontiarcPackage.COMPONENT_INSTANCE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject) newParent).eInverseAdd(this, MontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS,
						ComponentType.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.COMPONENT_INSTANCE__PARENT, newParent,
					newParent));
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
		case MontiarcPackage.COMPONENT_INSTANCE__PORTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPorts()).basicAdd(otherEnd, msgs);
		case MontiarcPackage.COMPONENT_INSTANCE__PARENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParent((ComponentType) otherEnd, msgs);
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
		case MontiarcPackage.COMPONENT_INSTANCE__PORTS:
			return ((InternalEList<?>) getPorts()).basicRemove(otherEnd, msgs);
		case MontiarcPackage.COMPONENT_INSTANCE__PARENT:
			return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case MontiarcPackage.COMPONENT_INSTANCE__PARENT:
			return eInternalContainer().eInverseRemove(this, MontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS,
					ComponentType.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MontiarcPackage.COMPONENT_INSTANCE__INSTANCE_NAME:
			return getInstanceName();
		case MontiarcPackage.COMPONENT_INSTANCE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case MontiarcPackage.COMPONENT_INSTANCE__PORTS:
			return getPorts();
		case MontiarcPackage.COMPONENT_INSTANCE__PARENT:
			return getParent();
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
		case MontiarcPackage.COMPONENT_INSTANCE__INSTANCE_NAME:
			setInstanceName((String) newValue);
			return;
		case MontiarcPackage.COMPONENT_INSTANCE__TYPE:
			setType((ComponentType) newValue);
			return;
		case MontiarcPackage.COMPONENT_INSTANCE__PORTS:
			getPorts().clear();
			getPorts().addAll((Collection<? extends PortInstance>) newValue);
			return;
		case MontiarcPackage.COMPONENT_INSTANCE__PARENT:
			setParent((ComponentType) newValue);
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
		case MontiarcPackage.COMPONENT_INSTANCE__INSTANCE_NAME:
			setInstanceName(INSTANCE_NAME_EDEFAULT);
			return;
		case MontiarcPackage.COMPONENT_INSTANCE__TYPE:
			setType((ComponentType) null);
			return;
		case MontiarcPackage.COMPONENT_INSTANCE__PORTS:
			getPorts().clear();
			return;
		case MontiarcPackage.COMPONENT_INSTANCE__PARENT:
			setParent((ComponentType) null);
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
		case MontiarcPackage.COMPONENT_INSTANCE__INSTANCE_NAME:
			return INSTANCE_NAME_EDEFAULT == null ? instanceName != null : !INSTANCE_NAME_EDEFAULT.equals(instanceName);
		case MontiarcPackage.COMPONENT_INSTANCE__TYPE:
			return type != null;
		case MontiarcPackage.COMPONENT_INSTANCE__PORTS:
			return ports != null && !ports.isEmpty();
		case MontiarcPackage.COMPONENT_INSTANCE__PARENT:
			return getParent() != null;
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
		String result = "";
		result += (this.getType() != null) ? this.getType().getName() + " " : "";
		return result + this.getInstanceName();
	}

} // ComponentInstanceImpl
