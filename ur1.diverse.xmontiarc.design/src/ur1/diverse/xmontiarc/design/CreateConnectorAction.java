package ur1.diverse.xmontiarc.design;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import xmontiarc.ComponentType;
import xmontiarc.Connector;
import xmontiarc.Port;
import xmontiarc.Subcomponent;
import xmontiarc.XmontiarcFactory;

public class CreateConnectorAction extends AbstractExternalJavaAction implements IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> args) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> args, Map<String, Object> options) {
		System.out.println("CreateConnectorAction.execute()");
		for (Map.Entry<String, Object> option : options.entrySet()) {
			System.out.println(option.getKey() + " = " + option.getValue());
		}
		for (EObject item : args) {
			System.out.println("arg = " + item);
		}
		
		Port source = (Port) options.get("source");
		Port target = (Port) options.get("target");
		Subcomponent sourceSubcomponent = (Subcomponent) options.get("sourceSubcomponent");
		ComponentType type = sourceSubcomponent.getParent();
		System.out.println("CreateConnectorAction.execute(): Containing component type is '" + type.toString() + "'.");
		Connector con = XmontiarcFactory.eINSTANCE.createConnector();
		con.setSource(source);
		con.setTarget(target);
		con.setParent(type);
		System.out.println("CreateConnectorAction.execute(): Created connector '" + con.toString() + "'.");
		type.getConnectors().add(con);
		try {
			type.eResource().save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("CreateConnectorAction.execute(): Connectors now is '" + type.getConnectors() + "'.");
	}
}