package ur1.diverse.montiarc.design;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import montiarc.ComponentType;
import montiarc.Port;
import montiarc.SubcomponentDeclaration;

/**
 * The services class used by montiarc diagrams
 * @author Andreas Wortmann <wortmann@se-rwth.de>
 */
public class Services {

	/**
	 * Returns the incoming {@link Port}s of passed component type
	 * @param self A {@link ComponentType}
	 * @return A set of its incoming {@link Port}s
	 */
	public Collection<EObject> getIncomingPorts(EObject self) {
		Set<EObject> ports = new HashSet<>();
		ports.addAll(this.getDirectedPorts((ComponentType)self, true));
		return ports;
	}
	
	
	/**
	 * Returns the outgoing {@link Port}s of passed component type
	 * @param self A {@link ComponentType}
	 * @return A set of its outgoing {@link Port}s
	 */
	public Collection<EObject> getOutgoingPorts(EObject self) {
		Set<EObject> ports = new HashSet<>();
		ports.addAll(this.getDirectedPorts((ComponentType)self, false));
		return ports;
	}
	
	/**
	 * A nice label for {@link Port}s
	 * @param self A {@link Port}
	 * @return 
	 */
	public String getPortLabel(EObject self) {
		Port p = (Port)self;
		return p.getType().getName() + " " + p.getName();
	}
	
	/**
	 * A nice label for {@link SubcomponentDeclaration}s
	 * @param self A {@link SubcomponentDeclaration}
	 * @return 
	 */
	public String getSubComponentDeclarationLabel(EObject self) {
		SubcomponentDeclaration s = (SubcomponentDeclaration)self;
		return s.getComponentType().getName() + " "  + s.getInstanceName();
	}
	
	/**
	 * Returns the incoming {@link Port}s of the subcomponent's component type
	 * @param self A {@link SubcomponentDeclaration}
	 * @return A set of its incoming {@link Port}s
	 */
	public Collection<EObject> getSubcomponentTypesIncomingPorts(EObject self) {
		SubcomponentDeclaration s = (SubcomponentDeclaration)self;
		return getIncomingPorts(s.getComponentType());
	}
	
	/**
	 * Returns the outgoing {@link Port}s of the subcomponent's component type
	 * @param self A {@link SubcomponentDeclaration}
	 * @return A set of its outgoing {@link Port}s
	 */
	public Collection<EObject> getSubcomponentTypesOutgoingPorts(EObject self) {
		SubcomponentDeclaration s = (SubcomponentDeclaration)self;
		return getOutgoingPorts(s.getComponentType());
	}
	
	/**
	 * Collects either the incoming or outgoing {@link Port}s of the passed component type.
	 * @param comp {@link ComponentType} to process
	 * @param collectIncomingPorts True, iff the incoming ports should be collected
	 * @return A collection containing only incoming or outgoing {@link Port}s
	 */
	public Collection<Port> getDirectedPorts(ComponentType comp, boolean collectIncomingPorts) {
		Set<Port> ports = new HashSet<>();
		for (Port p : comp.getPorts()) {
			if (collectIncomingPorts && p.isIsIncoming()) {
				ports.add(p);
			} else if (!collectIncomingPorts && !p.isIsIncoming()) {
				ports.add(p);
			}
				
		}
		return ports;
	}
}
