package xmontiarc.helpers;

import java.util.Optional;

import xmontiarc.Connector;
import xmontiarc.Subcomponent;

public class ConnectorHelper {
	
	public static String getSourceRepresentation(Connector con) {
		if (con.getParent() != null) {
			Optional<Subcomponent> scOpt = ComponentTypeHelper.findOwnerOf(con.getParent(), con.getSource());
			if (scOpt.isPresent()) {
				return scOpt.get().getName();
			}
		}
		return "N/A";
	}

	public static String getTargetRepresentation(Connector con) {
		if (con.getParent() != null) {
			Optional<Subcomponent> scOpt = ComponentTypeHelper.findOwnerOf(con.getParent(), con.getTarget());
			if (scOpt.isPresent()) {
				return scOpt.get().getName();
			}
		}
		return "N/A";
	}

	public static String getRepresentation(Connector con) {
		return getSourceRepresentation(con) + " -> " + getTargetRepresentation(con);
	}

}