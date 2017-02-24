/**
 */
package cd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CD Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cd.CDAttribute#getName <em>Name</em>}</li>
 *   <li>{@link cd.CDAttribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see cd.CdPackage#getCDAttribute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AttributeNameBeginsLowerCase'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot AttributeNameBeginsLowerCase='Tuple {\n\tmessage : String = \'The name of class \"\' + name + \'\" must begin lowercase.\',\n\tstatus : Boolean = \n\t\t\tlet firstLetter: String = (name).substring(1,1)\n\t\t\t\tin firstLetter.toLowerCase() = firstLetter\n}.status'"
 * @generated
 */
public interface CDAttribute extends EObject {
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
	 * @see cd.CdPackage#getCDAttribute_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cd.CDAttribute#getName <em>Name</em>}' attribute.
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
	 * @see cd.CdPackage#getCDAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	CDClass getType();

	/**
	 * Sets the value of the '{@link cd.CDAttribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CDClass value);

} // CDAttribute
