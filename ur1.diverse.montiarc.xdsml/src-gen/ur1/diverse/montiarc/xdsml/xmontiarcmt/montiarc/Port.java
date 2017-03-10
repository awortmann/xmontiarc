/**
 */
package ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc;

import org.eclipse.emf.ecore.EObject;

import ur1.diverse.montiarc.xdsml.xmontiarcmt.cd.CDClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Port#isIsIncoming <em>Is Incoming</em>}</li>
 *   <li>{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Port#getName <em>Name</em>}</li>
 *   <li>{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Port#getType <em>Type</em>}</li>
 *   <li>{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Port#getPortValue <em>Port Value</em>}</li>
 * </ul>
 *
 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage#getPort()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NameIsLeadingUpperCase'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NameIsLeadingUpperCase='Tuple {\n\tmessage : String = \'The name of port \"\' + name + \'\" must begin lowercase.\',\n\tstatus : Boolean = let firstLetter : String =\n\t\t\t(name).substring(1, 1)\n\t\tin firstLetter.toLowerCase() = firstLetter\n}.status'"
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Incoming</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Incoming</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Incoming</em>' attribute.
	 * @see #setIsIncoming(boolean)
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage#getPort_IsIncoming()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsIncoming();

	/**
	 * Sets the value of the '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Port#isIsIncoming <em>Is Incoming</em>}' attribute.
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
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage#getPort_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Port#getName <em>Name</em>}' attribute.
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
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage#getPort_Type()
	 * @model
	 * @generated
	 */
	CDClass getType();

	/**
	 * Sets the value of the '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Port#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CDClass value);

	/**
	 * Returns the value of the '<em><b>Port Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Value</em>' reference.
	 * @see #setPortValue(PortValue)
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage#getPort_PortValue()
	 * @model
	 * @generated
	 */
	PortValue getPortValue();

	/**
	 * Sets the value of the '{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.montiarc.Port#getPortValue <em>Port Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Value</em>' reference.
	 * @see #getPortValue()
	 * @generated
	 */
	void setPortValue(PortValue value);

} // Port
