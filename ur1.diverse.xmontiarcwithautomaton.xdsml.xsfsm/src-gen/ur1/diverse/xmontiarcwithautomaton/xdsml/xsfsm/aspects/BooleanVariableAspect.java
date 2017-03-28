package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.BooleanVariableAspectBooleanVariableAspectProperties;

@Aspect(className = BooleanVariable.class)
@SuppressWarnings("all")
public class BooleanVariableAspect {
  public static Boolean value(final BooleanVariable _self) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.BooleanVariableAspectBooleanVariableAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.BooleanVariableAspectBooleanVariableAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_value(_self_, _self);
	;
	return (java.lang.Boolean) result;
}
  
  public static void value(final BooleanVariable _self, final Boolean value) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.BooleanVariableAspectBooleanVariableAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.BooleanVariableAspectBooleanVariableAspectContext
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
