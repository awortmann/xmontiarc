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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import xmontiarc.ComponentType;
import xmontiarc.Port;
import xmontiarc.Subcomponent;
import xmontiarc.XmontiarcPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Subcomponent</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xmontiarc.impl.SubcomponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link xmontiarc.impl.SubcomponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link xmontiarc.impl.SubcomponentImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link xmontiarc.impl.SubcomponentImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubcomponentImpl extends MinimalEObjectImpl.Container implements Subcomponent {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "UnnamedSubcomponent";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ComponentType type;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SubcomponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmontiarcPackage.Literals.SUBCOMPONENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmontiarcPackage.SUBCOMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ComponentType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmontiarcPackage.SUBCOMPONENT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		ComponentType oldType = type;
		type = newType;
//		System.out.println("SubcomponentImpl.setType(" + newType.toString() + "): Clearing derived ports list.");
//		this.getDerivedPorts().clear();
//		List<Port> derivedPorts = SubcomponentDerivedPortsHelper.setDerivedPorts(this);
//		System.out.println("SubcomponentImpl.setType(" + newType.toString() + "): Adding derived ports '" + derivedPorts + "'.");
//		this.getDerivedPorts().addAll(derivedPorts);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmontiarcPackage.SUBCOMPONENT__TYPE, oldType, type));
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, XmontiarcPackage.SUBCOMPONENT__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getParent() {
		if (eContainerFeatureID() != XmontiarcPackage.SUBCOMPONENT__PARENT) return null;
		return (ComponentType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ComponentType newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, XmontiarcPackage.SUBCOMPONENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ComponentType newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != XmontiarcPackage.SUBCOMPONENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS, ComponentType.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmontiarcPackage.SUBCOMPONENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmontiarcPackage.SUBCOMPONENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ComponentType)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	private EList<Port> getDerivedPorts() {
		if (ports == null) {
			ports = new EObjectResolvingEList<Port>(Port.class, this,
					XmontiarcPackage.SUBCOMPONENT__PORTS);
//			List<Port> derivedPorts = SubcomponentDerivedPortsHelper.setDerivedPorts(this);
//			System.out.println("SubcomponentImpl.getDerivedPorts(" + this.toString() + "): Adding derived ports '" + derivedPorts + "'.");
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmontiarcPackage.SUBCOMPONENT__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case XmontiarcPackage.SUBCOMPONENT__PARENT:
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
			case XmontiarcPackage.SUBCOMPONENT__PARENT:
				return eInternalContainer().eInverseRemove(this, XmontiarcPackage.COMPONENT_TYPE__SUBCOMPONENTS, ComponentType.class, msgs);
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
			case XmontiarcPackage.SUBCOMPONENT__NAME:
				return getName();
			case XmontiarcPackage.SUBCOMPONENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case XmontiarcPackage.SUBCOMPONENT__PORTS:
				return getPorts();
			case XmontiarcPackage.SUBCOMPONENT__PARENT:
				return getParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmontiarcPackage.SUBCOMPONENT__NAME:
				setName((String)newValue);
				return;
			case XmontiarcPackage.SUBCOMPONENT__TYPE:
				setType((ComponentType)newValue);
				return;
			case XmontiarcPackage.SUBCOMPONENT__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case XmontiarcPackage.SUBCOMPONENT__PARENT:
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
			case XmontiarcPackage.SUBCOMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmontiarcPackage.SUBCOMPONENT__TYPE:
				setType((ComponentType)null);
				return;
			case XmontiarcPackage.SUBCOMPONENT__PORTS:
				getPorts().clear();
				return;
			case XmontiarcPackage.SUBCOMPONENT__PARENT:
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
			case XmontiarcPackage.SUBCOMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmontiarcPackage.SUBCOMPONENT__TYPE:
				return type != null;
			case XmontiarcPackage.SUBCOMPONENT__PORTS:
				return ports != null && !ports.isEmpty();
			case XmontiarcPackage.SUBCOMPONENT__PARENT:
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

		StringBuffer result = new StringBuffer();
		if (this.getType() != null) {
			result.append(this.getType().getName());
		} else {
			result.append("<undefined type>");
		}
		result.append(" " + this.getName());
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public List<Port> getIncomingPorts() {
		return this.getDirectedPorts(true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public List<Port> getOutgoingPorts() {
		return this.getDirectedPorts(false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	private List<Port> getDirectedPorts(boolean collectIncomingPorts) {
		List<Port> ports = new ArrayList<Port>();
		for (Port p : this.getPorts()) {
			if (p.isIncoming() == collectIncomingPorts) {
				ports.add(p);
			}
		}
		return ports;
	}

} // SubcomponentImpl
