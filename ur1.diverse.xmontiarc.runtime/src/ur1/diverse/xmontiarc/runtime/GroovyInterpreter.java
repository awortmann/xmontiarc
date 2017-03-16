package ur1.diverse.xmontiarc.runtime;

import java.util.Random;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * @generated NOT
 */
public class GroovyInterpreter {
	
	private static Random rand = new Random();
	
	public static EObject interpret(String groovyScript) {
		EDataType data =  EcorePackage.eINSTANCE.getEString();
		data.setName(""+(rand.nextInt(100)+1));
		return data;
	}
}
