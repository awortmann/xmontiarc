package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.GreaterThanNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.NumberVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.NumberGuardAspect;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.NumberVariableAspect;

@Aspect(className = GreaterThanNumberGuard.class)
@SuppressWarnings("all")
public class GreaterThanNumberGuardAspect extends NumberGuardAspect {
  public static boolean holds(final GreaterThanNumberGuard _self) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_holds(_self_, _self);
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_holds(final GreaterThanNumberGuardAspectGreaterThanNumberGuardAspectProperties _self_, final GreaterThanNumberGuard _self) {
    final NumberVariable source = _self.getSource();
    final Long value = Long.valueOf(_self.getValue());
    Long _value = NumberVariableAspect.value(source);
    return (value.compareTo(_value) > 0);
  }
}