package org.gemoc.montiarc.montiarc.constraints;

import org.eclipse.emf.validation.AbstractModelConstraint;

public abstract class MontiArcModelConstraint extends AbstractModelConstraint {
	
	protected String format(String message) {
		return this.getClass().getSimpleName() + ": " + message; 
	}
	
	protected void log(String method, Object...objects) {
		String objectsString = "";
		String sep = "";
		for (Object o : objects) {
			objectsString += sep + o.toString();
			sep = ", ";
		}
		System.out.println(this.getClass().getSimpleName() + "." + method + "(" + objectsString + " )");
	}

}
