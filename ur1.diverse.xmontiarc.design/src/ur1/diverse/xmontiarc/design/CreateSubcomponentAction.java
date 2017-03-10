package ur1.diverse.xmontiarc.design;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.ui.PlatformUI;

import xmontiarc.ComponentType;
import xmontiarc.Port;
import xmontiarc.Subcomponent;

public class CreateSubcomponentAction extends AbstractExternalJavaAction implements IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> args) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> args, Map<String, Object> options) {
		System.out.println("CreateSubcomponentAction.execute()");
		Subcomponent sc = DesignerHelper.getSubcomponentFromOptions(options);
		try {
			Optional<ComponentType> selectedTypeOpt = DesignerHelper.showComponentTypeSelectionDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
			if (selectedTypeOpt.isPresent()) {
				ComponentType selectedType = selectedTypeOpt.get();
				sc.setName(DesignerHelper.getRandomInstanceName(selectedType.getName()));
				sc.setType(selectedType);
				sc.getPorts().clear();
				for (Port p : selectedType.getPorts()) {
					Port copy = EcoreUtil.copy(p);
					sc.getPorts().add(copy);
				}
				sc.getParent().eResource().save(null);
			}
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}