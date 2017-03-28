package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringVariable;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.GuardAspect;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.StringGuardAspectStringGuardAspectProperties;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.StringVariableAspect;

@Aspect(className = StringGuard.class)
@SuppressWarnings("all")
public class StringGuardAspect extends GuardAspect {
  public static boolean holds(final StringGuard _self) {
	final ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.StringGuardAspectStringGuardAspectProperties _self_ = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.StringGuardAspectStringGuardAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_holds(_self_, _self);
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_holds(final StringGuardAspectStringGuardAspectProperties _self_, final StringGuard _self) {
    final StringVariable source = _self.getSource();
    final String value = _self.getValue();
    boolean _isNot = _self.isNot();
    if (_isNot) {
      String _value = StringVariableAspect.value(source);
      return (!Objects.equal(value, _value));
    } else {
      String _value_1 = StringVariableAspect.value(source);
      return Objects.equal(value, _value_1);
    }
  }
}
