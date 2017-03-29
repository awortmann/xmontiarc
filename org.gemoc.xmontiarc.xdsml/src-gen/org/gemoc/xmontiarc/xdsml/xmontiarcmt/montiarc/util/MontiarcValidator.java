/**
 */
package org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc.MontiarcPackage
 * @generated
 */
public class MontiarcValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MontiarcValidator INSTANCE = new MontiarcValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.gemoc.xmontiarc.xdsml.xmontiarcmt.montiarc";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MontiarcValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return MontiarcPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case MontiarcPackage.COMPONENT_TYPE:
				return validateComponentType((ComponentType)value, diagnostics, context);
			case MontiarcPackage.PORT:
				return validatePort((Port)value, diagnostics, context);
			case MontiarcPackage.INCOMING_PORT:
				return validateIncomingPort((IncomingPort)value, diagnostics, context);
			case MontiarcPackage.OUTGOING_PORT:
				return validateOutgoingPort((OutgoingPort)value, diagnostics, context);
			case MontiarcPackage.CONNECTOR:
				return validateConnector((Connector)value, diagnostics, context);
			case MontiarcPackage.INTERMEDIATE_CONNECTOR:
				return validateIntermediateConnector((IntermediateConnector)value, diagnostics, context);
			case MontiarcPackage.INCOMING_CONNECTOR:
				return validateIncomingConnector((IncomingConnector)value, diagnostics, context);
			case MontiarcPackage.OUTGOING_CONNECTOR:
				return validateOutgoingConnector((OutgoingConnector)value, diagnostics, context);
			case MontiarcPackage.SUBCOMPONENT:
				return validateSubcomponent((Subcomponent)value, diagnostics, context);
			case MontiarcPackage.COMPONENT_BEHAVIOR:
				return validateComponentBehavior((ComponentBehavior)value, diagnostics, context);
			case MontiarcPackage.GROOVY_COMPONENT_BEHAVIOR:
				return validateGroovyComponentBehavior((GroovyComponentBehavior)value, diagnostics, context);
			case MontiarcPackage.AUTOMATON_COMPONENT_BEHAVIOR:
				return validateAutomatonComponentBehavior((AutomatonComponentBehavior)value, diagnostics, context);
			case MontiarcPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case MontiarcPackage.EDATA_TYPE:
				return validateEDataType((EDataType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentType(ComponentType componentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(componentType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentType, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponentType_AtomicOrComposed(componentType, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AtomicOrComposed constraint of '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT_TYPE__ATOMIC_OR_COMPOSED__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Component type \\'' + name + '\\' cannot have connectors and behavior',\n" +
		"\tstatus : Boolean = \n" +
		"            behavior.equalsIgnoreCase('') or self.connectors->isEmpty()\n" +
		"}.status";

	/**
	 * Validates the AtomicOrComposed constraint of '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentType_AtomicOrComposed(ComponentType componentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MontiarcPackage.Literals.COMPONENT_TYPE,
				 componentType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AtomicOrComposed",
				 COMPONENT_TYPE__ATOMIC_OR_COMPOSED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(port, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(port, diagnostics, context);
		if (result || diagnostics != null) result &= validatePort_NameIsLowerCase(port, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NameIsLowerCase constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PORT__NAME_IS_LOWER_CASE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Port \\'' + name + '\\' must be lowercase',\n" +
		"\tstatus : Boolean = \n" +
		"            let firstLetter : String = (name).substring(0,1)\n" +
		"                in firstLetter.toLowerCase() = firstLetter\n" +
		"}.status";

	/**
	 * Validates the NameIsLowerCase constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort_NameIsLowerCase(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MontiarcPackage.Literals.PORT,
				 port,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NameIsLowerCase",
				 PORT__NAME_IS_LOWER_CASE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncomingPort(IncomingPort incomingPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(incomingPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(incomingPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(incomingPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(incomingPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(incomingPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(incomingPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(incomingPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(incomingPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(incomingPort, diagnostics, context);
		if (result || diagnostics != null) result &= validatePort_NameIsLowerCase(incomingPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutgoingPort(OutgoingPort outgoingPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(outgoingPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(outgoingPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(outgoingPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(outgoingPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(outgoingPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(outgoingPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(outgoingPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(outgoingPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(outgoingPort, diagnostics, context);
		if (result || diagnostics != null) result &= validatePort_NameIsLowerCase(outgoingPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_DifferentSourceAndTarget(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_MatchingPortTypes(connector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the DifferentSourceAndTarget constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR__DIFFERENT_SOURCE_AND_TARGET__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Connectors cannot have the same source and target.',\n" +
		"\tstatus : Boolean = \n" +
		"            source <> target\n" +
		"}.status";

	/**
	 * Validates the DifferentSourceAndTarget constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector_DifferentSourceAndTarget(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MontiarcPackage.Literals.CONNECTOR,
				 connector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DifferentSourceAndTarget",
				 CONNECTOR__DIFFERENT_SOURCE_AND_TARGET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the MatchingPortTypes constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR__MATCHING_PORT_TYPES__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The data types of source and target ports must match.',\n" +
		"\tstatus : Boolean = \n" +
		"            source <> target\n" +
		"}.status";

	/**
	 * Validates the MatchingPortTypes constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector_MatchingPortTypes(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MontiarcPackage.Literals.CONNECTOR,
				 connector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "MatchingPortTypes",
				 CONNECTOR__MATCHING_PORT_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntermediateConnector(IntermediateConnector intermediateConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(intermediateConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(intermediateConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(intermediateConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(intermediateConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(intermediateConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(intermediateConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(intermediateConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(intermediateConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(intermediateConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_DifferentSourceAndTarget(intermediateConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_MatchingPortTypes(intermediateConnector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncomingConnector(IncomingConnector incomingConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(incomingConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(incomingConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(incomingConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(incomingConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(incomingConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(incomingConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(incomingConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(incomingConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(incomingConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_DifferentSourceAndTarget(incomingConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_MatchingPortTypes(incomingConnector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutgoingConnector(OutgoingConnector outgoingConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(outgoingConnector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(outgoingConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(outgoingConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(outgoingConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(outgoingConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(outgoingConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(outgoingConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(outgoingConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(outgoingConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_DifferentSourceAndTarget(outgoingConnector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_MatchingPortTypes(outgoingConnector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubcomponent(Subcomponent subcomponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subcomponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subcomponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubcomponent_NameIsLowerCase(subcomponent, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NameIsLowerCase constraint of '<em>Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUBCOMPONENT__NAME_IS_LOWER_CASE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = '\\'' + name + '\\' must be lowercase',\n" +
		"\tstatus : Boolean = \n" +
		"            let firstLetter : String = (name).substring(0,1) \n" +
		"                in firstLetter.toLowerCase() = firstLetter\n" +
		"}.status";

	/**
	 * Validates the NameIsLowerCase constraint of '<em>Subcomponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubcomponent_NameIsLowerCase(Subcomponent subcomponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MontiarcPackage.Literals.SUBCOMPONENT,
				 subcomponent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NameIsLowerCase",
				 SUBCOMPONENT__NAME_IS_LOWER_CASE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentBehavior(ComponentBehavior componentBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentBehavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroovyComponentBehavior(GroovyComponentBehavior groovyComponentBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groovyComponentBehavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutomatonComponentBehavior(AutomatonComponentBehavior automatonComponentBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(automatonComponentBehavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEDataType(EDataType eDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MontiarcValidator
