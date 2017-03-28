package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.EqualNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.NumberVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.EqualNumberGuardAspectEqualNumberGuardAspectProperties;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.NumberGuardAspect;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.NumberVariableAspect;

@Aspect(className = EqualNumberGuard.class)
@SuppressWarnings("all")
public class EqualNumberGuardAspect extends NumberGuardAspect {
  public static boolean holds(final EqualNumberGuard _self) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.EqualNumberGuardAspectEqualNumberGuardAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.EqualNumberGuardAspectEqualNumberGuardAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_holds(_self_, _self);
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_holds(final EqualNumberGuardAspectEqualNumberGuardAspectProperties _self_, final EqualNumberGuard _self) {
    final NumberVariable source = _self.getSource();
    final Long value = Long.valueOf(_self.getValue());
    Long _value = NumberVariableAspect.value(source);
    return Objects.equal(value, _value);
  }
}
