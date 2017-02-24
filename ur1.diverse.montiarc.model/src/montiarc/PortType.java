/**
 */
package montiarc;

import cd.CDClass;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link montiarc.PortType#isIsIncoming <em>Is Incoming</em>}</li>
 *   <li>{@link montiarc.PortType#getName <em>Name</em>}</li>
 *   <li>{@link montiarc.PortType#getType <em>Type</em>}</li>
 *   <li>{@link montiarc.PortType#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see montiarc.MontiarcPackage#getPortType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NameIsLeadingUpperCase'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NameIsLeadingUpperCase='Tuple {\n\tmessage : String = \'The name of port \"\' + name + \'\" must begin lowercase.\',\n\tstatus : Boolean = let firstLetter : String =\n\t\t\t(name).substring(1, 1)\n\t\tin firstLetter.toLowerCase() = firstLetter\n}.status'"
 * @generated
 */
public interface PortType extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Incoming</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Incoming</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Incoming</em>' attribute.
	 * @see #setIsIncoming(boolean)
	 * @see montiarc.MontiarcPackage#getPortType_IsIncoming()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsIncoming();

	/**
	 * Sets the value of the '{@link montiarc.PortType#isIsIncoming <em>Is Incoming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Incoming</em>' attribute.
	 * @see #isIsIncoming()
	 * @generated
	 */
	void setIsIncoming(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see montiarc.MontiarcPackage#getPortType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link montiarc.PortType#getName <em>Name</em>}' attribute.
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
	 * @see #setType(CDClass)
	 * @see montiarc.MontiarcPackage#getPortType_Type()
	 * @model required="true"
	 * @generated
	 */
	CDClass getType();

	/**
	 * Sets the value of the '{@link montiarc.PortType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CDClass value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link montiarc.ComponentType#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ComponentType)
	 * @see montiarc.MontiarcPackage#getPortType_Parent()
	 * @see montiarc.ComponentType#getPorts
	 * @model opposite="ports" required="true" transient="false"
	 * @generated
	 */
	ComponentType getParent();

	/**
	 * Sets the value of the '{@link montiarc.PortType#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ComponentType value);

} // PortType
