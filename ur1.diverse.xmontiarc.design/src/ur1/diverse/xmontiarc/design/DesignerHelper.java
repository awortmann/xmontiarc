package ur1.diverse.xmontiarc.design;

import java.util.Map;
import java.util.Random;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import xmontiarc.ComponentType;
import xmontiarc.Subcomponent;

public class DesignerHelper {
	
	private static Random r = new Random();
	
	public static String getRandomInstanceName(String typeName) {
		return typeName.substring(0, 1).toLowerCase() + typeName.substring(1) + r.nextInt(100);
	}
	
	public static ComponentType loadComponentType(String filename) {
		return (ComponentType) loadModel(filename).getContents().get(0);
	}
	
	public static Resource loadModel(String filename) {
		String path = "platform:/resource/Test/" + filename + ".xmontiarc";
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
				return (Subcomponent)option.getValue();
			}
		}
		return null;
	}
}
