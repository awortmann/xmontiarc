package org.gemoc.montiarc.helpers;

import java.util.Optional;

import org.gemoc.montiarc.Connector;
import org.gemoc.montiarc.IncomingConnector;
import org.gemoc.montiarc.IntermediateConnector;
import org.gemoc.montiarc.OutgoingConnector;
import org.gemoc.montiarc.Port;
import org.gemoc.montiarc.Subcomponent;

public class ConnectorHelper {
	
	public static Port getSource(Connector con) {
		Port source;
		if (con instanceof IntermediateConnector) {
			IntermediateConnector c = (IntermediateConnector)con;
			source = c.getSource();
		}
		else if (con instanceof IncomingConnector) {
			IncomingConnector c = (IncomingConnector)con;
			source = c.getSource();
		}
		else if (con instanceof OutgoingConnector) {
			OutgoingConnector c = (OutgoingConnector)con;
			source = c.getSource();
		}
		else {
			throw new Error("Found instance of abstract class Connector.");
		}
		return source;
	}
	
	public static Port getTarget(Connector con) {
		Port target;
		if (con instanceof IntermediateConnector) {
			IntermediateConnector c = (IntermediateConnector)con;
			target = c.getTarget();
		}
		else if (con instanceof IncomingConnector) {
			IncomingConnector c = (IncomingConnector)con;
			target = c.getTarget();
		}
		else if (con instanceof OutgoingConnector) {
			OutgoingConnector c = (OutgoingConnector)con;
			target = c.getTarget();
		}
		else {
			throw new Error("Found instance of abstract class Connector.");
		}
		return target;
	}
	
	public static String getSourceRepresentation(Connector con) {
		if (con.getParent() != null) {
			Optional<Subcomponent> scOpt = ComponentTypeHelper.findOwnerOf(con.getParent(), getSource(con));
			if (scOpt.isPresent()) {
				return scOpt.get().getName();
			}
		}
		return "N/A";
	}

	public static String getTargetRepresentation(Connector con) {
		if (con.getParent() != null) {
			Optional<Subcomponent> scOpt = ComponentTypeHelper.findOwnerOf(con.getParent(), getTarget(con));
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