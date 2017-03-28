package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.GuardAspect;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.NumberGuardAspectNumberGuardAspectProperties;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.NumberVariableAspect;

@Aspect(className = NumberGuard.class)
@SuppressWarnings("all")
public class NumberGuardAspect extends GuardAspect {
  public static boolean holds(final NumberGuard _self) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.NumberGuardAspectNumberGuardAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.NumberGuardAspectNumberGuardAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessOrEqualThanNumberGuard) {
		result = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.LessOrEqualThanNumberGuardAspect
				.holds((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessOrEqualThanNumberGuard) _self);
	} else if (_self instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.GreaterThanNumberGuard) {
		result = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.GreaterThanNumberGuardAspect
				.holds((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.GreaterThanNumberGuard) _self);
	} else if (_self instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessThanNumberGuard) {
		result = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.LessThanNumberGuardAspect
				.holds((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.LessThanNumberGuard) _self);
	} else if (_self instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.EqualNumberGuard) {
		result = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.EqualNumberGuardAspect
				.holds((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.EqualNumberGuard) _self);
	} else if (_self instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.GreaterOrEqualThanNumberGuard) {
		result = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.GreaterOrEqualThanNumberGuardAspect
				.holds((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.GreaterOrEqualThanNumberGuard) _self);
	} else if (_self instanceof ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberGuard) {
		result = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.NumberGuardAspect._privk3_holds(_self_,
				(ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.NumberGuard) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_holds(final NumberGuardAspectNumberGuardAspectProperties _self_, final NumberGuard _self) {
    final NumberVariable source = _self.getSource();
    final Long value = Long.valueOf(_self.getValue());
    Long _value = NumberVariableAspect.value(source);
    return Objects.equal(value, _value);
  }
}
