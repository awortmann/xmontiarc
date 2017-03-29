/**
 */
package org.gemoc.xportautomata.xfsm.xportautomata.fsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xportautomata.xfsm.xportautomata.fsm.StringAction#getValue <em>Value</em>}</li>
 *   <li>{@link org.gemoc.xportautomata.xfsm.xportautomata.fsm.StringAction#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xportautomata.xfsm.xportautomata.fsm.FsmPackage#getStringAction()
 * @model
 * @generated
 */
public interface StringAction extends Action {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.gemoc.xportautomata.xfsm.xportautomata.fsm.FsmPackage#getStringAction_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.gemoc.xportautomata.xfsm.xportautomata.fsm.StringAction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(StringVariable)
	 * @see org.gemoc.xportautomata.xfsm.xportautomata.fsm.FsmPackage#getStringAction_Target()
	 * @model required="true"
	 * @generated
	 */
	StringVariable getTarget();

	/**
	 * Sets the value of the '{@link org.gemoc.xportautomata.xfsm.xportautomata.fsm.StringAction#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(StringVariable value);

} // StringAction
