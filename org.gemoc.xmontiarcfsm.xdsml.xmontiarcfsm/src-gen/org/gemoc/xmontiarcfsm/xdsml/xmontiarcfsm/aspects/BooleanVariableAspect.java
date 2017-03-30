package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.BooleanVariable;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.BooleanVariableAspectBooleanVariableAspectProperties;

@Aspect(className = BooleanVariable.class)
@SuppressWarnings("all")
public class BooleanVariableAspect {
  public static Boolean value(final BooleanVariable _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.BooleanVariableAspectBooleanVariableAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.BooleanVariableAspectBooleanVariableAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_value(_self_, _self);
	;
	return (java.lang.Boolean) result;
}
  
  public static void value(final BooleanVariable _self, final Boolean value) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.BooleanVariableAspectBooleanVariableAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.BooleanVariableAspectBooleanVariableAspectContext
			.getSelf(_self);
	_privk3_value(_self_, _self, value);
	;
}
  
  protected static Boolean _privk3_value(final BooleanVariableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Boolean) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.value;
  }
  
  protected static void _privk3_value(final BooleanVariableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self, final Boolean value) {
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
