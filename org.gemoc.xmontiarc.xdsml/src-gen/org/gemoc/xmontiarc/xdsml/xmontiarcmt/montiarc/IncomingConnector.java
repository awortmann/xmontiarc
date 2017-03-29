/**
 */
package org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incoming Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.IncomingConnector#getSource <em>Source</em>}</li>
 *   <li>{@link org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.IncomingConnector#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage#getIncomingConnector()
 * @model
 * @generated
 */
public interface IncomingConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(IncomingPort)
	 * @see org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage#getIncomingConnector_Source()
	 * @model required="true"
	 * @generated
	 */
	IncomingPort getSource();

	/**
	 * Sets the value of the '{@link org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.IncomingConnector#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(IncomingPort value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(IncomingPort)
	 * @see org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage#getIncomingConnector_Target()
	 * @model required="true"
	 * @generated
	 */
	IncomingPort getTarget();

	/**
	 * Sets the value of the '{@link org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.IncomingConnector#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(IncomingPort value);

} // IncomingConnector
