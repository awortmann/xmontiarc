/**
 */
package montiarc.impl;

import cd.CDClass;

import montiarc.ComponentType;
import montiarc.MontiarcPackage;
import montiarc.PortType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link montiarc.impl.PortTypeImpl#isIsIncoming <em>Is Incoming</em>}</li>
 *   <li>{@link montiarc.impl.PortTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link montiarc.impl.PortTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link montiarc.impl.PortTypeImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortTypeImpl extends MinimalEObjectImpl.Container implements PortType {
	/**
	 * The default value of the '{@link #isIsIncoming() <em>Is Incoming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIncoming()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INCOMING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsIncoming() <em>Is Incoming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIncoming()
	 * @generated
	 * @ordered
	 */
	protected boolean isIncoming = IS_INCOMING_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "UnnamedPortType";

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
	protected CDClass type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MontiarcPackage.Literals.PORT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsIncoming() {
		return isIncoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIncoming(boolean newIsIncoming) {
		boolean oldIsIncoming = isIncoming;
		isIncoming = newIsIncoming;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.PORT_TYPE__IS_INCOMING, oldIsIncoming, isIncoming));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.PORT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDClass getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (CDClass)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MontiarcPackage.PORT_TYPE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDClass basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CDClass newType) {
		CDClass oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.PORT_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getParent() {
		if (eContainerFeatureID() != MontiarcPackage.PORT_TYPE__PARENT) return null;
		return (ComponentType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ComponentType newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, MontiarcPackage.PORT_TYPE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ComponentType newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != MontiarcPackage.PORT_TYPE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, MontiarcPackage.COMPONENT_TYPE__PORTS, ComponentType.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.PORT_TYPE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MontiarcPackage.PORT_TYPE__PARENT:
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
			case MontiarcPackage.PORT_TYPE__PARENT:
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
			case MontiarcPackage.PORT_TYPE__PARENT:
				return eInternalContainer().eInverseRemove(this, MontiarcPackage.COMPONENT_TYPE__PORTS, ComponentType.class, msgs);
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
			case MontiarcPackage.PORT_TYPE__IS_INCOMING:
				return isIsIncoming();
			case MontiarcPackage.PORT_TYPE__NAME:
				return getName();
			case MontiarcPackage.PORT_TYPE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case MontiarcPackage.PORT_TYPE__PARENT:
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
			case MontiarcPackage.PORT_TYPE__IS_INCOMING:
				setIsIncoming((Boolean)newValue);
				return;
			case MontiarcPackage.PORT_TYPE__NAME:
				setName((String)newValue);
				return;
			case MontiarcPackage.PORT_TYPE__TYPE:
				setType((CDClass)newValue);
				return;
			case MontiarcPackage.PORT_TYPE__PARENT:
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
			case MontiarcPackage.PORT_TYPE__IS_INCOMING:
				setIsIncoming(IS_INCOMING_EDEFAULT);
				return;
			case MontiarcPackage.PORT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MontiarcPackage.PORT_TYPE__TYPE:
				setType((CDClass)null);
				return;
			case MontiarcPackage.PORT_TYPE__PARENT:
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
			case MontiarcPackage.PORT_TYPE__IS_INCOMING:
				return isIncoming != IS_INCOMING_EDEFAULT;
			case MontiarcPackage.PORT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MontiarcPackage.PORT_TYPE__TYPE:
				return type != null;
			case MontiarcPackage.PORT_TYPE__PARENT:
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
		if (eIsProxy()) return super.toString();

		String result = "";
		result += (this.getType()!=null) ? this.getType().getName() + " " : "";
		result += this.getName();
		return result;
	}

} //PortTypeImpl
