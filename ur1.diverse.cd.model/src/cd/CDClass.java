/**
 */
package cd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CD Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cd.CDClass#getName <em>Name</em>}</li>
 *   <li>{@link cd.CDClass#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link cd.CDClass#getSuperType <em>Super Type</em>}</li>
 * </ul>
 *
 * @see cd.CdPackage#getCDClass()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NameIsLeadingUpperCase'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NameIsLeadingUpperCase='Tuple {\n\tmessage : String = \'The name of class \"\' + name + \'\" must begin uppercase.\',\n\tstatus : Boolean = \n\t\t\tlet firstLetter: String = (name).substring(1,1)\n\t\t\t\tin firstLetter.toUpperCase() = firstLetter\n}.status'"
 * @generated
 */
public interface CDClass extends EObject {
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
	 * @see cd.CdPackage#getCDClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cd.CDClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link cd.CDAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see cd.CdPackage#getCDClass_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<CDAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(CDClass)
	 * @see cd.CdPackage#getCDClass_SuperType()
	 * @model
	 * @generated
	 */
	CDClass getSuperType();

	/**
	 * Sets the value of the '{@link cd.CDClass#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(CDClass value);

} // CDClass
