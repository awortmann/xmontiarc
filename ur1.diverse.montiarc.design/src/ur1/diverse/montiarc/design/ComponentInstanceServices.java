package ur1.diverse.montiarc.design;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import montiarc.Component;
import montiarc.Port;

/**
 * Services for component aspects of montiarc diagrams.
 * @author Andreas Wortmann <wortmann@se-rwth.de>
 */
public class ComponentInstanceServices {
	
	private ComponentTypeServices typeServices = new ComponentTypeServices();

	/**
	 * A nice label for {@link SubcomponentDeclaration}s
	 * @param self A {@link SubcomponentDeclaration}
	 * @return 
	 */
	public String getComponentLabel(EObject self) {
		Component s = (Component)self;
		return s.getType().getName() + " "  + s.getInstanceName();
	}
	
	/**
	 * Returns the incoming {@link Port}s of the subcomponent's component type
	 * @param self A {@link SubcomponentDeclaration}
	 * @return A set of its incoming {@link Port}s
	 */
	public Collection<EObject> getComponentIncomingPorts(EObject self) {
		Component s = (Component)self;
		return typeServices.getComponentTypeIncomingPorts(s.getType());
	}
	
	/**
	 * Returns the outgoing {@link Port}s of the subcomponent's component type
	 * @param self A {@link SubcomponentDeclaration}
	 * @return A set of its outgoing {@link Port}s
	 */
	public Collection<EObject> getComponentOutgoingPorts(EObject self) {
		Component s = (Component)self;
		return typeServices.getComponentTypeOutgoingPorts(s.getType());
	}
	
}
