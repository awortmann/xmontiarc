package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessThanNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.NumberGuardAspect;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.NumberVariableAspect;

@Aspect(className = LessThanNumberGuard.class)
@SuppressWarnings("all")
public class LessThanNumberGuardAspect extends NumberGuardAspect {
  public static boolean holds(final LessThanNumberGuard _self) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.LessThanNumberGuardAspectLessThanNumberGuardAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.LessThanNumberGuardAspectLessThanNumberGuardAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_holds(_self_, _self);
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_holds(final LessThanNumberGuardAspectLessThanNumberGuardAspectProperties _self_, final LessThanNumberGuard _self) {
    final NumberVariable source = _self.getSource();
    final Long value = Long.valueOf(_self.getValue());
    Long _value = NumberVariableAspect.value(source);
    return (value.compareTo(_value) > 0);
  }
}
