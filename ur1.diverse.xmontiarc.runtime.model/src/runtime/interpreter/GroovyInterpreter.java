package runtime.interpreter;

import java.util.Random;

/**
 * @generated NOT
 */
public class GroovyInterpreter {
	
	private static Random rand;
	
	public static String interpret(String groovyScript) {
		return ""+rand.nextInt();
	}
}
