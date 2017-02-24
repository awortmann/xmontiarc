/**
 */
package cd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CD Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cd.CDConstant#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see cd.CdPackage#getCDConstant()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConstantNameBeginsUpperCase'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ConstantNameBeginsUpperCase='Tuple {\n\tmessage : String = \'The name of constant \"\' + name + \'\" must be all uppercase.\',\n\tstatus : Boolean = \n\t\t\tname.toUpperCase() = name\n}.status'"
 * @generated
 */
public interface CDConstant extends EObject {
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
	 * @see cd.CdPackage#getCDConstant_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cd.CDConstant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CDConstant
