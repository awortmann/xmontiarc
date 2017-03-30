package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.StringVariable;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringVariableAspectStringVariableAspectProperties;

@Aspect(className = StringVariable.class)
@SuppressWarnings("all")
public class StringVariableAspect {
  public static String value(final StringVariable _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringVariableAspectStringVariableAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringVariableAspectStringVariableAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_value(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  public static void value(final StringVariable _self, final String value) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringVariableAspectStringVariableAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.StringVariableAspectStringVariableAspectContext
			.getSelf(_self);
	_privk3_value(_self_, _self, value);
	;
}
  
  protected static String _privk3_value(final StringVariableAspectStringVariableAspectProperties _self_, final StringVariable _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.value;
  }
  
  protected static void _privk3_value(final StringVariableAspectStringVariableAspectProperties _self_, final StringVariable _self, final String value) {
    _self_.value = value; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, value);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
