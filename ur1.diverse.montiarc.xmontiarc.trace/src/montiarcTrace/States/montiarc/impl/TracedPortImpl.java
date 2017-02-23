/**
 */
package montiarcTrace.States.montiarc.impl;

import java.util.Collection;

import montiarcTrace.States.Port_portValue_Value;
import montiarcTrace.States.StatesPackage;

import montiarcTrace.States.montiarc.MontiarcPackage;
import montiarcTrace.States.montiarc.TracedPort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link montiarcTrace.States.montiarc.impl.TracedPortImpl#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link montiarcTrace.States.montiarc.impl.TracedPortImpl#getPortValueSequence <em>Port Value Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedPortImpl extends MinimalEObjectImpl.Container implements TracedPort {
	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected Port originalObject;

	/**
	 * The cached value of the '{@link #getPortValueSequence() <em>Port Value Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortValueSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Port_portValue_Value> portValueSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MontiarcPackage.Literals.TRACED_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (Port)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MontiarcPackage.TRACED_PORT__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(Port newOriginalObject) {
		Port oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MontiarcPackage.TRACED_PORT__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port_portValue_Value> getPortValueSequence() {
		if (portValueSequence == null) {
			portValueSequence = new EObjectContainmentWithInverseEList<Port_portValue_Value>(Port_portValue_Value.class, this, MontiarcPackage.TRACED_PORT__PORT_VALUE_SEQUENCE, StatesPackage.PORT_PORT_VALUE_VALUE__PARENT);
		}
		return portValueSequence;
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
			case MontiarcPackage.TRACED_PORT__PORT_VALUE_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPortValueSequence()).basicAdd(otherEnd, msgs);
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
			case MontiarcPackage.TRACED_PORT__PORT_VALUE_SEQUENCE:
				return ((InternalEList<?>)getPortValueSequence()).basicRemove(otherEnd, msgs);
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
			case MontiarcPackage.TRACED_PORT__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
			case MontiarcPackage.TRACED_PORT__PORT_VALUE_SEQUENCE:
				return getPortValueSequence();
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
			case MontiarcPackage.TRACED_PORT__ORIGINAL_OBJECT:
				setOriginalObject((Port)newValue);
				return;
			case MontiarcPackage.TRACED_PORT__PORT_VALUE_SEQUENCE:
				getPortValueSequence().clear();
				getPortValueSequence().addAll((Collection<? extends Port_portValue_Value>)newValue);
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
			case MontiarcPackage.TRACED_PORT__ORIGINAL_OBJECT:
				setOriginalObject((Port)null);
				return;
			case MontiarcPackage.TRACED_PORT__PORT_VALUE_SEQUENCE:
				getPortValueSequence().clear();
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
			case MontiarcPackage.TRACED_PORT__ORIGINAL_OBJECT:
				return originalObject != null;
			case MontiarcPackage.TRACED_PORT__PORT_VALUE_SEQUENCE:
				return portValueSequence != null && !portValueSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedPortImpl
