package constraints;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;

import xmontiarc.ComponentType;
import xmontiarc.Connector;
import xmontiarc.Port;
import xmontiarc.Subcomponent;
import xmontiarc.impl.ComponentTypeImpl;

public class AllPortsConnected extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
//		System.out.println("AllPortsConnected.validate(): Checking EObject '" + ctx.getTarget().eClass().getName() + "'.");
		EObject obj = ctx.getTarget();
		if (obj instanceof ComponentType) {
			ComponentType type = (ComponentType) obj;
			Optional<ConstraintStatus> optError = this.checkPortConnected(ctx, type);
			if (optError.isPresent()) {
				return optError.get();
			}
		}
		return ctx.createSuccessStatus();
	}
	
	private Optional<ConstraintStatus> checkPortConnected(IValidationContext ctx, ComponentType type) {
		Optional<ConstraintStatus> error = Optional.empty();
		Set<EObject> problemElements = new HashSet<>();
		List<Port> unconnectedPorts = allPortsConnected(type);
		if (!unconnectedPorts.isEmpty()) {
			problemElements.add(type);
			error = Optional.of(ConstraintStatus.createStatus(
	                ctx,
	                problemElements,
	                "The ports {0} are unconnected.",
	                new Object[] {unconnectedPorts}));
		}
        return error;
    }

	private List<Port> allPortsConnected(ComponentType type) {
//		System.out.println("AllPortsConnected.allPortsConnected(): Checking connectors of component type '" + type.getName() + "'.");
		List<Port> potentialSourcePorts = new ArrayList<>();
		List<Port> potentialTargetPorts = new ArrayList<>();
		List<Port> unconnectedPorts = new ArrayList<>();
		ComponentTypeImpl cti = (ComponentTypeImpl) type;
		potentialSourcePorts.addAll(cti.getIncomingPorts());
		potentialTargetPorts.addAll(cti.getOutgoingPorts());
		
		for (Subcomponent sc : type.getSubcomponents()) {
			for (Port p: sc.getPorts()) {
				if (p.isIncoming()) {
					potentialTargetPorts.add(p);
				}
				else {
					potentialSourcePorts.add(p);
				}
			}
		}
		
//		System.out.println("potentialTargetPorts '" + potentialTargetPorts + "'.");
//		System.out.println("potentialSourcePorts '" + potentialSourcePorts + "'.");
		
		for (Connector con : type.getConnectors()) {
//			System.out.println("checking connector '" + con.toString() + "'.");
			potentialSourcePorts.remove(con.getSource());
			potentialTargetPorts.remove(con.getTarget());
		}
		
//		System.out.println("potentialTargetPorts@post '" + potentialTargetPorts + "'.");
//		System.out.println("potentialSourcePorts@post '" + potentialSourcePorts + "'.");
		
		unconnectedPorts.addAll(potentialSourcePorts);
		unconnectedPorts.addAll(potentialTargetPorts);
		
		return unconnectedPorts;
	}

}
