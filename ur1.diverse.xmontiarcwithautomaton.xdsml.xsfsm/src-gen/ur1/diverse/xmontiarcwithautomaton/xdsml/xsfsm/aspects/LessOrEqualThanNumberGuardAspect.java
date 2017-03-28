package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessOrEqualThanNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.NumberGuardAspect;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.NumberVariableAspect;

@Aspect(className = LessOrEqualThanNumberGuard.class)
@SuppressWarnings("all")
public class LessOrEqualThanNumberGuardAspect extends NumberGuardAspect {
  public static boolean holds(final LessOrEqualThanNumberGuard _self) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_holds(_self_, _self);
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_holds(final LessOrEqualThanNumberGuardAspectLessOrEqualThanNumberGuardAspectProperties _self_, final LessOrEqualThanNumberGuard _self) {
    final NumberVariable source = _self.getSource();
    final Long value = Long.valueOf(_self.getValue());
    Long _value = NumberVariableAspect.value(source);
    return (value.compareTo(_value) >= 0);
  }
}
