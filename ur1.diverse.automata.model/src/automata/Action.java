/**
 */
package automata;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link automata.Action#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see automata.AutomataPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Variable)
	 * @see automata.AutomataPackage#getAction_Target()
	 * @model required="true"
	 * @generated
	 */
	Variable getTarget();

	/**
	 * Sets the value of the '{@link automata.Action#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Variable value);

} // Action
