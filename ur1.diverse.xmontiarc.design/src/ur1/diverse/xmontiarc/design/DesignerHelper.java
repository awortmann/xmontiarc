package ur1.diverse.xmontiarc.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.ComponentType;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Subcomponent;

public class DesignerHelper {

	private static Random r = new Random();

	public static String getRandomInstanceName(String typeName) {
		return typeName.substring(0, 1).toLowerCase() + typeName.substring(1) + r.nextInt(100);
	}

	public static ComponentType loadComponentType(String filename) {
		return (ComponentType) loadModel(filename).getContents().get(0);
	}

	public static Resource loadModel(String filename) {
		String path = "platform:/resource" + filename;
		System.out.println("Loading type from URI '" + path + "'.");
		URI uri = URI.createURI(path);
		System.out.println("URI is '" + uri.toString() + "'.");
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource mainResource = resourceSet.getResource(uri, true);
		return mainResource;
	}

	public static Subcomponent getSubcomponentFromOptions(Map<String, Object> options) {
		System.out.println("Loading subcomponent from options '" + options + "'.");
		for (Map.Entry<String, Object> option : options.entrySet()) {
			System.out.println(option.getKey() + " -> " + option.getValue());
			if (option.getKey().equals("subcomponent")) {
				return (Subcomponent) option.getValue();
			}
		}
		return null;
	}

	private static List<String> loadAllComponentTypes() throws CoreException {
		List<String> files = new ArrayList<String>();
		for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			if (project.isAccessible() && project.isOpen()) {
				files.addAll(loadModels(project));
			}
		}
		return files;
	}

	private static List<String> loadModels(IContainer container) throws CoreException {
		List<String> files = new ArrayList<String>();
		IResource[] members = container.members();
		for (IResource member : members) {
			if (member instanceof IContainer) {
				files.addAll(loadModels((IContainer) member));
			} else if (member instanceof IFile) {
				if (member.getFileExtension() != null && member.getFileExtension().equals("xmontiarc")) {
					String path = member.getFullPath().toOSString();
					files.add(path);
				}
			}
		}
		return files;
	}

	public static Optional<ComponentType> showComponentTypeSelectionDialog(Shell parentShell) throws CoreException {
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(parentShell, new LabelProvider());
		dialog.setElements(loadAllComponentTypes().toArray(new String[0]));
		dialog.setTitle("Select subcomponent's type");
		// user pressed cancel
		if (dialog.open() == Window.OK) {
			Object[] objects = dialog.getResult();
			for (Object result : objects) {
				System.out.println("result = " + result);
			}
			String typeName = objects[0].toString();
			ComponentType type = loadComponentType(typeName);
			return Optional.of(type);
		}

		return Optional.empty();
	}

	public static Optional<ComponentType> getComponentTypeFromArgs(Collection<? extends EObject> args) {
		for (EObject item : args) {
			System.out.println("Designerhelper.getComponentTypeFromArgs(): item = " + item);
			if (item instanceof ComponentType) {
				return Optional.of((ComponentType) args);
			}
		}
		return Optional.empty();

	}
}
