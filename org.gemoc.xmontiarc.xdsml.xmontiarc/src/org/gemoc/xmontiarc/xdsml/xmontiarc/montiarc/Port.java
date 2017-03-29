/**
 */
package org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Port#getType <em>Type</em>}</li>
 *   <li>{@link org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Port#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Port#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.MontiarcPackage#getPort()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NameIsLowerCase'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NameIsLowerCase='Tuple {\n\tmessage : String = \'Port \\\'\' + name + \'\\\' must be lowercase\',\n\tstatus : Boolean = \n            let firstLetter : String = (name).substring(0,1)\n                in firstLetter.toLowerCase() = firstLetter\n}.status'"
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Number"</code>.
	 * The literals are from the enumeration {@link org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.DataType
	 * @see #setType(DataType)
	 * @see org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.MontiarcPackage#getPort_Type()
	 * @model default="Number"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Port#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"UnnamedPort"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.MontiarcPackage#getPort_Name()
	 * @model default="UnnamedPort" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Port#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(EDataType)
	 * @see org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.MontiarcPackage#getPort_Value()
	 * @model unique="false" dataType="org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.EDataType"
	 * @generated
	 */
	EDataType getValue();

	/**
	 * Sets the value of the '{@link org.gemoc.xmontiarc.xdsml.xmontiarc.montiarc.Port#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EDataType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toString();

} // Port
