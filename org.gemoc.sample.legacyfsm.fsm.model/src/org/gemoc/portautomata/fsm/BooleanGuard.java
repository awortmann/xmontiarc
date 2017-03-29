/**
 */
package org.gemoc.portautomata.fsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.portautomata.fsm.BooleanGuard#isValue <em>Value</em>}</li>
 *   <li>{@link org.gemoc.portautomata.fsm.BooleanGuard#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.gemoc.portautomata.fsm.fsmPackage#getBooleanGuard()
 * @model
 * @generated
 */
public interface BooleanGuard extends Guard {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see org.gemoc.portautomata.fsm.fsmPackage#getBooleanGuard_Value()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link org.gemoc.portautomata.fsm.BooleanGuard#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(BooleanVariable)
	 * @see org.gemoc.portautomata.fsm.fsmPackage#getBooleanGuard_Source()
	 * @model required="true"
	 * @generated
	 */
	BooleanVariable getSource();

	/**
	 * Sets the value of the '{@link org.gemoc.portautomata.fsm.BooleanGuard#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(BooleanVariable value);

} // BooleanGuard
