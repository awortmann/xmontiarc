package ur1.diverse.xmontiarc.runtime;

import java.util.Random;

/**
 * @generated NOT
 */
public class GroovyInterpreter {
	
	private static Random rand = new Random();
	
	public static String interpret(String groovyScript) {
		return ""+rand.nextInt();
	}
}
