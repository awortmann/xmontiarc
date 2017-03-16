/**
 */
package automata;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link automata.Variable#getName <em>Name</em>}</li>
 *   <li>{@link automata.Variable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see automata.AutomataPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"UnnamedVariable"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see automata.AutomataPackage#getVariable_Name()
	 * @model default="UnnamedVariable" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link automata.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Number"</code>.
	 * The literals are from the enumeration {@link automata.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see automata.DataType
	 * @see #setType(DataType)
	 * @see automata.AutomataPackage#getVariable_Type()
	 * @model default="Number" required="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link automata.Variable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see automata.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // Variable
