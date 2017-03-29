/**
 */
package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc;

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
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Variable#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage#getVariable()
 * @model abstract="true"
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
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage#getVariable_Name()
	 * @model default="UnnamedVariable" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Variable
