package ur1.diverse.xmontiarc.design;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.ComponentType;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.IncomingPort;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.IntermediateConnector;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.OutgoingPort;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Subcomponent;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.XmontiarcFactory;

public class CreateIntermediateConnectorAction extends AbstractExternalJavaAction implements IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> args, Map<String, Object> options) {
		OutgoingPort subcomponentOut = (OutgoingPort) options.get("source");
		IncomingPort subcomponentIn = (IncomingPort) options.get("target");
		
		Subcomponent sourceSubcomponent = (Subcomponent) options.get("sourceSubcomponent");
		ComponentType type = sourceSubcomponent.getParent();
		System.out.println("CreateIntermediateConnectorAction.execute(): Containing component type is '" + type.toString() + "'.");
		IntermediateConnector con = XmontiarcFactory.eINSTANCE.createIntermediateConnector();
		con.setSource(subcomponentOut);
		con.setTarget(subcomponentIn);
		con.setParent(type);
		System.out.println("CreateIntermediateConnectorAction.execute(): Created connector '" + con.toString() + "'.");
		type.getConnectors().add(con);
		try {
			type.eResource().save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("CreateIntermediateConnectorAction.execute(): Connectors now is '" + type.getConnectors() + "'.");
	}
		
}
