/**
 */
package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringGuard#getValue <em>Value</em>}</li>
 *   <li>{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringGuard#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage#getStringGuard()
 * @model
 * @generated
 */
public interface StringGuard extends Guard {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"UnnamedVariable"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage#getStringGuard_Value()
	 * @model default="UnnamedVariable" required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringGuard#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(StringVariable)
	 * @see org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.XmontiarcPackage#getStringGuard_Source()
	 * @model required="true"
	 * @generated
	 */
	StringVariable getSource();

	/**
	 * Sets the value of the '{@link org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsmmt.xmontiarc.StringGuard#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(StringVariable value);

} // StringGuard
