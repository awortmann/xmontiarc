/**
 */
package ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc;

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
 *   <li>{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Connector#getSource <em>Source</em>}</li>
 *   <li>{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Connector#getTarget <em>Target</em>}</li>
 *   <li>{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Connector#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Port)
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage#getConnector_Source()
	 * @model required="true"
	 * @generated
	 */
	Port getSource();

	/**
	 * Sets the value of the '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Connector#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Port value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Port)
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage#getConnector_Target()
	 * @model required="true"
	 * @generated
	 */
	Port getTarget();

	/**
	 * Sets the value of the '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Connector#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Port value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ComponentType)
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage#getConnector_Parent()
	 * @see ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.ComponentType#getConnectors
	 * @model opposite="connectors" transient="false"
	 * @generated
	 */
	ComponentType getParent();

	/**
	 * Sets the value of the '{@link ur1.diverse.xmontiarc.xdsml.xmontiarcmt.xmontiarc.Connector#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ComponentType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void update();

} // Connector
