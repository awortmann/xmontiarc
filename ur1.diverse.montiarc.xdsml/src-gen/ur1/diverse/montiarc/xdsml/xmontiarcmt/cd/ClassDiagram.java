/**
 */
package ur1.diverse.montiarc.xdsml.xmontiarcmt.cd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ur1.diverse.montiarc.xdsml.xmontiarcmt.cd.ClassDiagram#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.cd.CdPackage#getClassDiagram()
 * @model
 * @generated
 */
public interface ClassDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link ur1.diverse.montiarc.xdsml.xmontiarcmt.cd.CDClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see ur1.diverse.montiarc.xdsml.xmontiarcmt.cd.CdPackage#getClassDiagram_Classes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CDClass> getClasses();

} // ClassDiagram
