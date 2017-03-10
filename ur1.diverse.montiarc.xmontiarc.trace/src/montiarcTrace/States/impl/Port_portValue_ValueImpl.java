/**
 */
package montiarcTrace.States.impl;

import java.util.Collection;

import montiarcTrace.States.Port_portValue_Value;
import montiarcTrace.States.State;
import montiarcTrace.States.StatesPackage;

import montiarcTrace.States.montiarc.MontiarcPackage;
import montiarcTrace.States.montiarc.TracedPort;
import montiarcTrace.States.montiarc.TracedPortValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port port Value Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link montiarcTrace.States.impl.Port_portValue_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link montiarcTrace.States.impl.Port_portValue_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link montiarcTrace.States.impl.Port_portValue_ValueImpl#getPortValue <em>Port Value</em>}</li>
 *   <li>{@link montiarcTrace.States.impl.Port_portValue_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Port_portValue_ValueImpl extends MinimalEObjectImpl.Container implements Port_portValue_Value {
	/**
	 * The cached value of the '{@link #getPortValue() <em>Port Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortValue()
	 * @generated
	 * @ordered
	 */
	protected TracedPortValue portValue;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Port_portValue_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.PORT_PORT_VALUE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesNoOpposite() {
		return this.getStates();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedPort getParent() {
		if (eContainerFeatureID() != StatesPackage.PORT_PORT_VALUE_VALUE__PARENT) return null;
		return (TracedPort)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedPort newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.PORT_PORT_VALUE_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedPort newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.PORT_PORT_VALUE_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, MontiarcPackage.TRACED_PORT__PORT_VALUE_SEQUENCE, TracedPort.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.PORT_PORT_VALUE_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedPortValue getPortValue() {
		if (portValue != null && portValue.eIsProxy()) {
			InternalEObject oldPortValue = (InternalEObject)portValue;
			portValue = (TracedPortValue)eResolveProxy(oldPortValue);
			if (portValue != oldPortValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesPackage.PORT_PORT_VALUE_VALUE__PORT_VALUE, oldPortValue, portValue));
			}
		}
		return portValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedPortValue basicGetPortValue() {
		return portValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortValue(TracedPortValue newPortValue) {
		TracedPortValue oldPortValue = portValue;
		portValue = newPortValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.PORT_PORT_VALUE_VALUE__PORT_VALUE, oldPortValue, portValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.PORT_PORT_VALUE_VALUE__STATES, StatesPackage.STATE__PORT_PORT_VALUE_VALUES);
		}
		return states;
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
			case StatesPackage.PORT_PORT_VALUE_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedPort)otherEnd, msgs);
			case StatesPackage.PORT_PORT_VALUE_VALUE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
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
			case StatesPackage.PORT_PORT_VALUE_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.PORT_PORT_VALUE_VALUE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
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
			case StatesPackage.PORT_PORT_VALUE_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, MontiarcPackage.TRACED_PORT__PORT_VALUE_SEQUENCE, TracedPort.class, msgs);
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
			case StatesPackage.PORT_PORT_VALUE_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.PORT_PORT_VALUE_VALUE__PARENT:
				return getParent();
			case StatesPackage.PORT_PORT_VALUE_VALUE__PORT_VALUE:
				if (resolve) return getPortValue();
				return basicGetPortValue();
			case StatesPackage.PORT_PORT_VALUE_VALUE__STATES:
				return getStates();
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
			case StatesPackage.PORT_PORT_VALUE_VALUE__PARENT:
				setParent((TracedPort)newValue);
				return;
			case StatesPackage.PORT_PORT_VALUE_VALUE__PORT_VALUE:
				setPortValue((TracedPortValue)newValue);
				return;
			case StatesPackage.PORT_PORT_VALUE_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
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
			case StatesPackage.PORT_PORT_VALUE_VALUE__PARENT:
				setParent((TracedPort)null);
				return;
			case StatesPackage.PORT_PORT_VALUE_VALUE__PORT_VALUE:
				setPortValue((TracedPortValue)null);
				return;
			case StatesPackage.PORT_PORT_VALUE_VALUE__STATES:
				getStates().clear();
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
			case StatesPackage.PORT_PORT_VALUE_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.PORT_PORT_VALUE_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.PORT_PORT_VALUE_VALUE__PORT_VALUE:
				return portValue != null;
			case StatesPackage.PORT_PORT_VALUE_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Port_portValue_ValueImpl
