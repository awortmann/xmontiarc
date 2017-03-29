package org.gemoc.montiarc.constraints;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.gemoc.montiarc.ComponentType;
import org.gemoc.montiarc.Port;

public class AllPortsConnected extends MontiArcModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		EObject obj = ctx.getTarget();
		if (obj instanceof ComponentType) {
			ComponentType type = (ComponentType) obj;
			Optional<ConstraintStatus> optError = this.checkForUnconnectedPorts(ctx, type);
			if (optError.isPresent()) {
				return optError.get();
			}
		}
		return ctx.createSuccessStatus();
	}
	
	private Optional<ConstraintStatus> checkForUnconnectedPorts(IValidationContext ctx, ComponentType type) {
		this.log("checkForUnconnectedPorts", type);
		Optional<ConstraintStatus> error = Optional.empty();
		Set<EObject> problemElements = new HashSet<>();
		List<Port> unconnectedPorts = calcUnconnectedPorts(type);
		if (!unconnectedPorts.isEmpty()) {
			problemElements.add(type);
			error = Optional.of(ConstraintStatus.createStatus(
	                ctx,
	                problemElements,
	                format("The ports {0} are unconnected."),
	                new Object[] {unconnectedPorts}));
		}
        return error;
    }

	private List<Port> calcUnconnectedPorts(ComponentType type) {
		List<Port> unconnectedPorts = new ArrayList<>();
		
//		List<Port> potentialSourcePorts = new ArrayList<>();
//		List<Port> potentialTargetPorts = new ArrayList<>();
//		
//		ComponentTypeImpl cti = (ComponentTypeImpl) type;
//		ComponentTypeHelper.getString();
//		potentialSourcePorts.addAll(cti.getIncomingPorts());
//		potentialTargetPorts.addAll(cti.getOutgoingPorts());
//		
//		for (Subcomponent sc : type.getSubcomponents()) {
//			for (Port p: sc.getPorts()) {
//				if (p.isIncoming()) {
//					potentialTargetPorts.add(p);
//				}
//				else {
//					potentialSourcePorts.add(p);
//				}
//			}
//		}
//		
//		for (Connector con : type.getConnectors()) {
//			potentialSourcePorts.remove(con.getSource());
//			potentialTargetPorts.remove(con.getTarget());
//		}
//		unconnectedPorts.addAll(potentialSourcePorts);
//		unconnectedPorts.addAll(potentialTargetPorts);
		
		return unconnectedPorts;
	}
}