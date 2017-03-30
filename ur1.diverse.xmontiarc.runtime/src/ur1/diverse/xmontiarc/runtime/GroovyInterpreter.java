package ur1.diverse.xmontiarc.runtime;

import java.util.Random;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;

/**
 * @generated NOT
 */
public class GroovyInterpreter {
	
	private static Random rand = new Random();
	
	public static EObject interpret(String groovyScript) {
		EDataType data =  EcorePackage.eINSTANCE.getEString();				
		Binding binding = new Binding();

		//Binding setVariable allow to pass a variable from the moonti arc model to the groovy interpreter
		//binding.setVariable(name, value);
		
		 GroovyShell shell = new GroovyShell(binding);		    
		    Object result = shell.evaluate(groovyScript);
		    
		    //Binding.getVariable get the new value of this variable. 
//		    binding.getVariable(name)

		    
		    //		data.setName(""+(rand.nextInt(100)+1));
		data.setName(""+result);
		return data;
	}
}
