/**
 */
package org.gemoc.montiarc.montiarc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.montiarc.montiarc.Connector#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see org.gemoc.montiarc.montiarc.MontiarcPackage#getConnector()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DifferentSourceAndTarget MatchingPortTypes'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot DifferentSourceAndTarget='Tuple {\n\tmessage : String = \'Connectors cannot have the same source and target.\',\n\tstatus : Boolean = \n            source <> target\n}.status' MatchingPortTypes='Tuple {\n\tmessage : String = \'The data types of source and target ports must match.\',\n\tstatus : Boolean = \n            source <> target\n}.status'"
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.montiarc.montiarc.ComponentType#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ComponentType)
	 * @see org.gemoc.montiarc.montiarc.MontiarcPackage#getConnector_Parent()
	 * @see org.gemoc.montiarc.montiarc.ComponentType#getConnectors
	 * @model opposite="connectors" transient="false"
	 * @generated
	 */
	ComponentType getParent();

	/**
	 * Sets the value of the '{@link org.gemoc.montiarc.montiarc.Connector#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ComponentType value);

} // Connector
