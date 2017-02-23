/**
 */
package montiarcTrace;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.Trace;

import montiarcTrace.States.State;

import montiarcTrace.States.montiarc.TracedPort;
import montiarcTrace.States.montiarc.TracedPortValue;

import montiarcTrace.Steps.Montiarc_ComponentType_Compute;
import montiarcTrace.Steps.Montiarc_ComponentType_Update;
import montiarcTrace.Steps.SpecificStep;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link montiarcTrace.SpecificTrace#getMontiarc_ComponentType_Compute_Sequence <em>Montiarc Component Type Compute Sequence</em>}</li>
 *   <li>{@link montiarcTrace.SpecificTrace#getMontiarc_ComponentType_Update_Sequence <em>Montiarc Component Type Update Sequence</em>}</li>
 *   <li>{@link montiarcTrace.SpecificTrace#getMontiarc_tracedPortValues <em>Montiarc traced Port Values</em>}</li>
 *   <li>{@link montiarcTrace.SpecificTrace#getMontiarc_tracedPorts <em>Montiarc traced Ports</em>}</li>
 *   <li>{@link montiarcTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @see montiarcTrace.MontiarcTracePackage#getSpecificTrace()
 * @model
 * @generated
 */
public interface SpecificTrace extends Trace<SequentialStep<SpecificStep>> {
	/**
	 * Returns the value of the '<em><b>Montiarc Component Type Compute Sequence</b></em>' reference list.
	 * The list contents are of type {@link montiarcTrace.Steps.Montiarc_ComponentType_Compute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Montiarc Component Type Compute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Montiarc Component Type Compute Sequence</em>' reference list.
	 * @see montiarcTrace.MontiarcTracePackage#getSpecificTrace_Montiarc_ComponentType_Compute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Montiarc_ComponentType_Compute> getMontiarc_ComponentType_Compute_Sequence();

	/**
	 * Returns the value of the '<em><b>Montiarc Component Type Update Sequence</b></em>' reference list.
	 * The list contents are of type {@link montiarcTrace.Steps.Montiarc_ComponentType_Update}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Montiarc Component Type Update Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Montiarc Component Type Update Sequence</em>' reference list.
	 * @see montiarcTrace.MontiarcTracePackage#getSpecificTrace_Montiarc_ComponentType_Update_Sequence()
	 * @model
	 * @generated
	 */
	EList<Montiarc_ComponentType_Update> getMontiarc_ComponentType_Update_Sequence();

	/**
	 * Returns the value of the '<em><b>Montiarc traced Port Values</b></em>' containment reference list.
	 * The list contents are of type {@link montiarcTrace.States.montiarc.TracedPortValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Montiarc traced Port Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Montiarc traced Port Values</em>' containment reference list.
	 * @see montiarcTrace.MontiarcTracePackage#getSpecificTrace_Montiarc_tracedPortValues()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedPortValue> getMontiarc_tracedPortValues();

	/**
	 * Returns the value of the '<em><b>Montiarc traced Ports</b></em>' containment reference list.
	 * The list contents are of type {@link montiarcTrace.States.montiarc.TracedPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Montiarc traced Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Montiarc traced Ports</em>' containment reference list.
	 * @see montiarcTrace.MontiarcTracePackage#getSpecificTrace_Montiarc_tracedPorts()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedPort> getMontiarc_tracedPorts();

	/**
	 * Returns the value of the '<em><b>States Trace</b></em>' containment reference list.
	 * The list contents are of type {@link montiarcTrace.States.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Trace</em>' containment reference list.
	 * @see montiarcTrace.MontiarcTracePackage#getSpecificTrace_StatesTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStatesTrace();

} // SpecificTrace
