/**
 */
package montiarcTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.ComponentType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Montiarc Component Type Update</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see montiarcTrace.Steps.StepsPackage#getMontiarc_ComponentType_Update()
 * @model
 * @generated
 */
public interface Montiarc_ComponentType_Update extends SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.ComponentType) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	ComponentType getCaller();

} // Montiarc_ComponentType_Update
