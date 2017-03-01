package ur1.diverse.xmontiarc.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import xmontiarc.ComponentType;
import xmontiarc.Subcomponent;

public class CreateNumberGeneratorAction extends AbstractExternalJavaAction implements IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> args) {
		System.out.println("can args = " + args.toString());
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> args, Map<String, Object> options) {
		String typeName = "NumberGenerator";
		Subcomponent sc = DesignerHelper.getSubcomponentFromOptions(options);
		ComponentType type = DesignerHelper.loadComponentType("NumberGenerator");
		sc.setName(DesignerHelper.getRandomInstanceName(typeName));
		sc.setType(type);
	}
}