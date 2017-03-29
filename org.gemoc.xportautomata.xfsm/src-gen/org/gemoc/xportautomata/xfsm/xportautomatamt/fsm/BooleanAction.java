/**
 */
package org.gemoc.xportautomata.xfsm.xportautomatamt.fsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.BooleanAction#isValue <em>Value</em>}</li>
 *   <li>{@link org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.BooleanAction#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.FsmPackage#getBooleanAction()
 * @model
 * @generated
 */
public interface BooleanAction extends Action {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.FsmPackage#getBooleanAction_Value()
	 * @model required="true"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.BooleanAction#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(BooleanVariable)
	 * @see org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.FsmPackage#getBooleanAction_Target()
	 * @model required="true"
	 * @generated
	 */
	BooleanVariable getTarget();

	/**
	 * Sets the value of the '{@link org.gemoc.xportautomata.xfsm.xportautomatamt.fsm.BooleanAction#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(BooleanVariable value);

} // BooleanAction
