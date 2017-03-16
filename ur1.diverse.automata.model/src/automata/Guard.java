/**
 */
package automata;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link automata.Guard#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see automata.AutomataPackage#getGuard()
 * @model
 * @generated
 */
public interface Guard extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Variable)
	 * @see automata.AutomataPackage#getGuard_Source()
	 * @model required="true"
	 * @generated
	 */
	Variable getSource();

	/**
	 * Sets the value of the '{@link automata.Guard#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Variable value);

} // Guard
