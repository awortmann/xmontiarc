/**
 */
package montiarcTrace.impl;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import fr.inria.diverse.trace.commons.model.trace.impl.TraceImpl;

import java.util.Collection;

import montiarcTrace.MontiarcTracePackage;
import montiarcTrace.SpecificTrace;

import montiarcTrace.States.State;

import montiarcTrace.States.montiarc.TracedPort;
import montiarcTrace.States.montiarc.TracedPortValue;

import montiarcTrace.Steps.Montiarc_ComponentType_Compute;
import montiarcTrace.Steps.Montiarc_ComponentType_Update;
import montiarcTrace.Steps.SpecificStep;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link montiarcTrace.impl.SpecificTraceImpl#getMontiarc_ComponentType_Compute_Sequence <em>Montiarc Component Type Compute Sequence</em>}</li>
 *   <li>{@link montiarcTrace.impl.SpecificTraceImpl#getMontiarc_ComponentType_Update_Sequence <em>Montiarc Component Type Update Sequence</em>}</li>
 *   <li>{@link montiarcTrace.impl.SpecificTraceImpl#getMontiarc_tracedPortValues <em>Montiarc traced Port Values</em>}</li>
 *   <li>{@link montiarcTrace.impl.SpecificTraceImpl#getMontiarc_tracedPorts <em>Montiarc traced Ports</em>}</li>
 *   <li>{@link montiarcTrace.impl.SpecificTraceImpl#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificTraceImpl extends TraceImpl<SequentialStep<SpecificStep>> implements SpecificTrace {
	/**
	 * The cached value of the '{@link #getMontiarc_ComponentType_Compute_Sequence() <em>Montiarc Component Type Compute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMontiarc_ComponentType_Compute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Montiarc_ComponentType_Compute> montiarc_ComponentType_Compute_Sequence;

	/**
	 * The cached value of the '{@link #getMontiarc_ComponentType_Update_Sequence() <em>Montiarc Component Type Update Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMontiarc_ComponentType_Update_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Montiarc_ComponentType_Update> montiarc_ComponentType_Update_Sequence;

	/**
	 * The cached value of the '{@link #getMontiarc_tracedPortValues() <em>Montiarc traced Port Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMontiarc_tracedPortValues()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedPortValue> montiarc_tracedPortValues;

	/**
	 * The cached value of the '{@link #getMontiarc_tracedPorts() <em>Montiarc traced Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMontiarc_tracedPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedPort> montiarc_tracedPorts;

	/**
	 * The cached value of the '{@link #getStatesTrace() <em>States Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatesTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<State> statesTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MontiarcTracePackage.Literals.SPECIFIC_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetRootStep(SequentialStep<SpecificStep> newRootStep, NotificationChain msgs) {
		return super.basicSetRootStep(newRootStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Montiarc_ComponentType_Compute> getMontiarc_ComponentType_Compute_Sequence() {
		if (montiarc_ComponentType_Compute_Sequence == null) {
			montiarc_ComponentType_Compute_Sequence = new EObjectResolvingEList<Montiarc_ComponentType_Compute>(Montiarc_ComponentType_Compute.class, this, MontiarcTracePackage.SPECIFIC_TRACE__MONTIARC_COMPONENT_TYPE_COMPUTE_SEQUENCE);
		}
		return montiarc_ComponentType_Compute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Montiarc_ComponentType_Update> getMontiarc_ComponentType_Update_Sequence() {
		if (montiarc_ComponentType_Update_Sequence == null) {
			montiarc_ComponentType_Update_Sequence = new EObjectResolvingEList<Montiarc_ComponentType_Update>(Montiarc_ComponentType_Update.class, this, MontiarcTracePackage.SPECIFIC_TRACE__MONTIARC_COMPONENT_TYPE_UPDATE_SEQUENCE);
		}
		return montiarc_ComponentType_Update_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedPortValue> getMontiarc_tracedPortValues() {
		if (montiarc_tracedPortValues == null) {
			montiarc_tracedPortValues = new EObjectContainmentEList<TracedPortValue>(TracedPortValue.class, this, MontiarcTracePackage.SPECIFIC_TRACE__MONTIARC_TRACED_PORT_VALUES);
		}
		return montiarc_tracedPortValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedPort> getMontiarc_tracedPorts() {
		if (montiarc_tracedPorts == null) {
			montiarc_tracedPorts = new EObjectContainmentEList<TracedPort>(TracedPort.class, this, MontiarcTracePackage.SPECIFIC_TRACE__MONTIARC_TRACED_PORTS);
		}
		return montiarc_tracedPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesTrace() {
		if (statesTrace == null) {
			statesTrace = new EObjectContainmentEList<State>(State.class, this, MontiarcTracePackage.SPECIFIC_TRACE__STATES_TRACE);
		}
		return statesTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MontiarcTracePackage.SPECIFIC_TRACE__MONTIARC_TRACED_PORT_VALUES:
				return ((InternalEList<?>)getMontiarc_tracedPortValues()).basicRemove(otherEnd, msgs);
			case MontiarcTracePackage.SPECIFIC_TRACE__MONTIARC_TRACED_PORTS:
				return ((InternalEList<?>)getMontiarc_tracedPorts()).basicRemove(otherEnd, msgs);
			case MontiarcTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return ((InternalEList<?>)getStatesTrace()).basicRemove(otherEnd, msgs);
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
			case MontiarcTracePackage.SPECIFIC_TRACE__MONTIARC_COMPONENT_TYPE_COMPUTE_SEQUENCE:
				return getMontiarc_ComponentType_Compute_Sequence();
			case MontiarcTracePackage.SPECIFIC_TRACE__MONTIARC_COMPONENT_TYPE_UPDATE_SEQUENCE:
				return getMontiarc_ComponentType_Update_Sequence();
			case MontiarcTracePackage.SPECIFIC_TRACE__MONTIARC_TRACED_PORT_VALUES:
				return getMontiarc_tracedPortValues();
			case MontiarcTracePackage.SPECIFIC_TRACE__MONTIARC_TRACED_PORTS:
				return getMontiarc_tracedPorts();
			case MontiarcTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return getStatesTrace();
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
			case MontiarcTracePackage.SPECIFIC_TRACE__MONTIARC_COMPONENT_TYPE_COMPUTE_SEQUENCE:
				getMontiarc_ComponentType_Compute_Sequence().clear();
				getMontiarc_ComponentType_Compute_Sequence().addAll((Collection<? extends Montiarc_ComponentType_Compute>)newValue);
				return;
			case MontiarcTracePackage.SPECIFIC_TRACE__MONTIARC_COMPONENT_TYPE_UPDATE_SEQUENCE:
				getMontiarc_ComponentType_Update_Sequence().clear();
				getMontiarc_ComponentType_Update_Sequence().addAll((Collection<? extends Montiarc_ComponentType_Update>)newValue);
				return;
			case MontiarcTracePackage.SPECIFIC_TRACE__MONTIARC_TRACED_PORT_VALUES:
				getMontiarc_tracedPortValues().clear();
				getMontiarc_tracedPortValues().addAll((Collection<? extends TracedPortValue>)newValue);
				return;
			case MontiarcTracePackage.SPECIFIC_TRACE__MONTIARC_TRACED_PORTS:
				getMontiarc_tracedPorts().clear();
				getMontiarc_tracedPorts().addAll((Collection<? extends TracedPort>)newValue);
				return;
			case MontiarcTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				getStatesTrace().addAll((Collection<? extends State>)newValue);
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
			case MontiarcTracePackage.SPECIFIC_TRACE__MONTIARC_COMPONENT_TYPE_COMPUTE_SEQUENCE:
				getMontiarc_ComponentType_Compute_Sequence().clear();
				return;
			case MontiarcTracePackage.SPECIFIC_TRACE__MONTIARC_COMPONENT_TYPE_UPDATE_SEQUENCE:
				getMontiarc_ComponentType_Update_Sequence().clear();
				return;
			case MontiarcTracePackage.SPECIFIC_TRACE__MONTIARC_TRACED_PORT_VALUES:
				getMontiarc_tracedPortValues().clear();
				return;
			case MontiarcTracePackage.SPECIFIC_TRACE__MONTIARC_TRACED_PORTS:
				getMontiarc_tracedPorts().clear();
				return;
			case MontiarcTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
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
			case MontiarcTracePackage.SPECIFIC_TRACE__MONTIARC_COMPONENT_TYPE_COMPUTE_SEQUENCE:
				return montiarc_ComponentType_Compute_Sequence != null && !montiarc_ComponentType_Compute_Sequence.isEmpty();
			case MontiarcTracePackage.SPECIFIC_TRACE__MONTIARC_COMPONENT_TYPE_UPDATE_SEQUENCE:
				return montiarc_ComponentType_Update_Sequence != null && !montiarc_ComponentType_Update_Sequence.isEmpty();
			case MontiarcTracePackage.SPECIFIC_TRACE__MONTIARC_TRACED_PORT_VALUES:
				return montiarc_tracedPortValues != null && !montiarc_tracedPortValues.isEmpty();
			case MontiarcTracePackage.SPECIFIC_TRACE__MONTIARC_TRACED_PORTS:
				return montiarc_tracedPorts != null && !montiarc_tracedPorts.isEmpty();
			case MontiarcTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return statesTrace != null && !statesTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificTraceImpl
