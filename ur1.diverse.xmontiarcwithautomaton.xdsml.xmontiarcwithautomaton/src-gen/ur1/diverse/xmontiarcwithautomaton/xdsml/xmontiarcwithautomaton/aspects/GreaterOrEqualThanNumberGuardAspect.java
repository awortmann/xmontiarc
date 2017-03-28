package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.GreaterOrEqualThanNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.NumberVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.NumberGuardAspect;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.NumberVariableAspect;

@Aspect(className = GreaterOrEqualThanNumberGuard.class)
@SuppressWarnings("all")
public class GreaterOrEqualThanNumberGuardAspect extends NumberGuardAspect {
  public static boolean holds(final GreaterOrEqualThanNumberGuard _self) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_holds(_self_, _self);
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_holds(final GreaterOrEqualThanNumberGuardAspectGreaterOrEqualThanNumberGuardAspectProperties _self_, final GreaterOrEqualThanNumberGuard _self) {
    final NumberVariable source = _self.getSource();
    final Long value = Long.valueOf(_self.getValue());
    Long _value = NumberVariableAspect.value(source);
    return (value.compareTo(_value) >= 0);
  }
}
