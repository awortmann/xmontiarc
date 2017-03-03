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
		EObject obj = ctx.getTarget();
		System.out.println("AllPortsConnected:obj='"+obj+"'");
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
		if (!allPortsConnected(type)) {
			problemElements.add(type);
			error = Optional.of(ConstraintStatus.createStatus(
	                ctx,
	                problemElements,
	                "The name of {0} should start upper case.",
	                new Object[] {type}));
		}
        return error;
    }

	private boolean allPortsConnected(ComponentType type) {
		List<Port> potentialSourcePorts = new ArrayList<>();
		List<Port> potentialTargetPorts = new ArrayList<>();
		ComponentTypeImpl cti = (ComponentTypeImpl) type;
		potentialSourcePorts.addAll(cti.getIncomingPorts());
		potentialTargetPorts.addAll(cti.getOutgoingPorts());
		
		for (Subcomponent sc : type.getSubcomponents()) {
			for (Port p: sc.getPorts()) {
				if (p.isIncoming()) {
					potentialTargetPorts.add(p);
				}
				else {
					potentialTargetPorts.add(p);
				}
			}
		}
		
		List<Port> unconnectedSourcePorts = new ArrayList<>();
		for (Port sourcePort : potentialSourcePorts) {
			boolean foundUsage = false;
			for (Connector con : type.getConnectors()) {
				if (con.getSource().equals(sourcePort)) {
					foundUsage = true;
				}
				if (!foundUsage) {
					unconnectedSourcePorts.add(sourcePort);
				}
			}
		}
		
		List<Port> unconnectedTargetPorts = new ArrayList<>();
		for (Port targetPort : potentialTargetPorts) {
			boolean foundUsage = false;
			for (Connector con : type.getConnectors()) {
				if (con.getTarget().equals(targetPort)) {
					foundUsage = true;
				}
				if (!foundUsage) {
					unconnectedTargetPorts.add(targetPort);
				}
			}
		}
		
		// TODO Continue reporting unconnected ports
		
		return false;
	}

}
