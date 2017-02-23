/**
 */
package cd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CD Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cd.CDEnumeration#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @see cd.CdPackage#getCDEnumeration()
 * @model
 * @generated
 */
public interface CDEnumeration extends CDClass {
	/**
	 * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
	 * The list contents are of type {@link cd.CDConstant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constants</em>' containment reference list.
	 * @see cd.CdPackage#getCDEnumeration_Constants()
	 * @model containment="true"
	 * @generated
	 */
	EList<CDConstant> getConstants();

} // CDEnumeration
