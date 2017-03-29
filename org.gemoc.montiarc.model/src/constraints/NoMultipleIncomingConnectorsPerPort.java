package constraints;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;

import montiarc.ComponentType;
import montiarc.Port;
import montiarc.Subcomponent;
import montiarc.impl.ComponentTypeImpl;
import montiarc.impl.SubcomponentImpl;

public class NoMultipleIncomingConnectorsPerPort extends MontiArcModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		EObject obj = ctx.getTarget();
		if (obj instanceof ComponentType) {
			ComponentType type = (ComponentType) obj;
			Optional<ConstraintStatus> optError = this.checkConnectors(ctx, type);
			if (optError.isPresent()) {
				return optError.get();
			}
		}
		return ctx.createSuccessStatus();
	}

	private Optional<ConstraintStatus> checkConnectors(IValidationContext ctx, ComponentType type) {
		this.log("checkConnectors", type);
		Optional<ConstraintStatus> error = Optional.empty();
		Set<Port> portsWithMultipleIncomingConnectors = getMultipleIncomingPorts(type);
		if (!portsWithMultipleIncomingConnectors.isEmpty()) {
			error = Optional.of(ConstraintStatus.createStatus(
													ctx, 
													portsWithMultipleIncomingConnectors,
													format("The ports {0} have multiple incoming connectors."), 
													new Object[] { portsWithMultipleIncomingConnectors }));
		}
		return error;
	}

	private Set<Port> getMultipleIncomingPorts(ComponentType type) {
		Set<Port> visitedPorts = new HashSet<>();
		
//		ComponentTypeImpl cti = (ComponentTypeImpl)type;
//		List<Port> portsWithMultipleIncomingConnectors = new ArrayList<>();
//		
//		
//		List<Port> allIncomingPorts = new ArrayList<>();
//		allIncomingPorts.addAll(cti.getOutgoingPorts());
//		for (Subcomponent sc : cti.getSubcomponents()) {
//			SubcomponentImpl sci = (SubcomponentImpl) sc;
//			allIncomingPorts.addAll(sci.getIncomingPorts());
//		}
//		
//		for (Port p : allIncomingPorts) {
//			if (visitedPorts.contains(p)) {
//				portsWithMultipleIncomingConnectors.add(p);
//			}
//			else {
//				visitedPorts.add(p);
//			}
//		}
		
		return visitedPorts;
	}

}