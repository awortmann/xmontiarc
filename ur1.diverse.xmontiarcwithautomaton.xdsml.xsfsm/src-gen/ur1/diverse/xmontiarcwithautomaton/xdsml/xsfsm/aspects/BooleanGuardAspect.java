package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.BooleanVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.BooleanGuardAspectBooleanGuardAspectProperties;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.BooleanVariableAspect;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.GuardAspect;

@Aspect(className = BooleanGuard.class)
@SuppressWarnings("all")
public class BooleanGuardAspect extends GuardAspect {
  public static boolean holds(final BooleanGuard _self) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.BooleanGuardAspectBooleanGuardAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.BooleanGuardAspectBooleanGuardAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_holds(_self_, _self);
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_holds(final BooleanGuardAspectBooleanGuardAspectProperties _self_, final BooleanGuard _self) {
    final BooleanVariable source = _self.getSource();
    final boolean value = _self.isValue();
    boolean _isNot = _self.isNot();
    if (_isNot) {
      Boolean _value = BooleanVariableAspect.value(source);
      return (value != (_value).booleanValue());
    } else {
      Boolean _value_1 = BooleanVariableAspect.value(source);
      return (value == (_value_1).booleanValue());
    }
  }
}
