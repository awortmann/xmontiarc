package org.gemoc.montiarc.montiarc.helpers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.gemoc.montiarc.montiarc.ComponentType;
import org.gemoc.montiarc.montiarc.Port;
import org.gemoc.montiarc.montiarc.Subcomponent;

public class ComponentTypeHelper {
	

    public static Optional<Subcomponent> findOwnerOf(ComponentType ct, Port p) {
        for (Subcomponent sc: ct.getSubcomponents()) {
            for (Port scp : sc.getIncomingPorts()) {
                if (scp.equals(p)) {
                    return Optional.of(sc);
                }
            }
            for (Port scp : sc.getOutgoingPorts()) {
                if (scp.equals(p)) {
                    return Optional.of(sc);
                }
            }
        }
        return Optional.empty();
    }
	
	public static List<Port> getOutgoingPortsOfSubcomponents(ComponentType ct) {
		return getDirectedPortsOfSubcomponents(ct, false);
	}
	
	public static List<Port> getIncomingPortsOfSubcomponents(ComponentType ct) {
		return getDirectedPortsOfSubcomponents(ct, true);
	}
	
	public static List<Port> getDirectedPortsOfSubcomponents(ComponentType ct, boolean collectIncoming) {
		List<Port> incomingPorts = new ArrayList<>();
		for (Subcomponent sc: ct.getSubcomponents()) {
			if (collectIncoming) {
				incomingPorts.addAll(sc.getIncomingPorts());
			}
			else {
				incomingPorts.addAll(sc.getOutgoingPorts());
			}
		}
		return incomingPorts;
	}
	
//	public static List<Port> getIncomingPorts(ComponentType ct) {
//		return getDirectedPorts(ct, true);
//	}
//
//	public static List<Port> getOutgoingPorts(ComponentType ct) {
//		return getDirectedPorts(ct, false);
//	}
//	
//	public static List<Port> getDirectedPorts(ComponentType ct, boolean collectIncomingPorts) {
//		List<Port> ports = new ArrayList<Port>();
//		if (collectIncomingPorts) {
//			
//		}
//		for (Port p : ct.getPorts()) {
//			
//			if (p.isIncoming()==collectIncomingPorts) {
//				ports.add(p);
//			}
//		}
//		return ports;
//	}

}