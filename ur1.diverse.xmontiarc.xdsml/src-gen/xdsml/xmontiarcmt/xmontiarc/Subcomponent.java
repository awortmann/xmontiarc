/**
 */
package xdsml.xmontiarcmt.xmontiarc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subcomponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xdsml.xmontiarcmt.xmontiarc.Subcomponent#getName <em>Name</em>}</li>
 *   <li>{@link xdsml.xmontiarcmt.xmontiarc.Subcomponent#getType <em>Type</em>}</li>
 *   <li>{@link xdsml.xmontiarcmt.xmontiarc.Subcomponent#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage#getSubcomponent()
 * @model
 * @generated
 */
public interface Subcomponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"UnnamedSubcomponent"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage#getSubcomponent_Name()
	 * @model default="UnnamedSubcomponent" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link xdsml.xmontiarcmt.xmontiarc.Subcomponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ComponentType)
	 * @see xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage#getSubcomponent_Type()
	 * @model required="true"
	 * @generated
	 */
	ComponentType getType();

	/**
	 * Sets the value of the '{@link xdsml.xmontiarcmt.xmontiarc.Subcomponent#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link xdsml.xmontiarcmt.xmontiarc.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see xdsml.xmontiarcmt.xmontiarc.XmontiarcPackage#getSubcomponent_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void compute();

} // Subcomponent
