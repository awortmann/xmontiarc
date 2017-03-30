package org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.fsm.NumberVariable;
import org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberVariableAspectNumberVariableAspectProperties;

@Aspect(className = NumberVariable.class)
@SuppressWarnings("all")
public class NumberVariableAspect {
  public static Long value(final NumberVariable _self) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberVariableAspectNumberVariableAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberVariableAspectNumberVariableAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_value(_self_, _self);
	;
	return (java.lang.Long) result;
}
  
  public static void value(final NumberVariable _self, final Long value) {
	final org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberVariableAspectNumberVariableAspectProperties _self_ = org.gemoc.xmontiarcfsm.xdsml.xmontiarcfsm.aspects.NumberVariableAspectNumberVariableAspectContext
			.getSelf(_self);
	_privk3_value(_self_, _self, value);
	;
}
  
  protected static Long _privk3_value(final NumberVariableAspectNumberVariableAspectProperties _self_, final NumberVariable _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Long) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.value;
  }
  
  protected static void _privk3_value(final NumberVariableAspectNumberVariableAspectProperties _self_, final NumberVariable _self, final Long value) {
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
