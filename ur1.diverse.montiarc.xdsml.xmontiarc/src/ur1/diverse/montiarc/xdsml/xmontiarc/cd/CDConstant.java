/**
 */
package ur1.diverse.montiarc.xdsml.xmontiarc.cd;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDConstant#getName <em>Name</em>}</li>
 *   <li>{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDConstant#getValue <em>Value</em>}</li>
 *   <li>{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDConstant#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.CdPackage#getCDConstant()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NameIsLeadingUpperCase'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NameIsLeadingUpperCase='Tuple {\n\tmessage : String = \'The name of constant \"\' + name + \'\" must be all uppercase.\',\n\tstatus : Boolean = \n\t\t\tname.toUpperCase() = name\n}.status'"
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
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.CdPackage#getCDConstant_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDConstant#getName <em>Name</em>}' attribute.
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
	 * @see #setValue(int)
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.CdPackage#getCDConstant_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDConstant#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link ur1.diverse.montiarc.xdsml.xmontiarc.cd.CDClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarc.cd.CdPackage#getCDConstant_Classes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CDClass> getClasses();

} // CDConstant
