package ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.PortAspectPortAspectProperties;
import xmontiarc.Port;

@Aspect(className = Port.class)
@SuppressWarnings("all")
public class PortAspect {
  public static String value(final Port _self) {
    final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.PortAspectPortAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.PortAspectPortAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_value(_self_, _self);;
    return (java.lang.String)result;
  }
  
  public static void value(final Port _self, final String value) {
    final ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.PortAspectPortAspectProperties _self_ = ur1.diverse.xmontiarc.k3dsa.xmontiarc.aspects.PortAspectPortAspectContext.getSelf(_self);
    _privk3_value(_self_, _self,value);;
  }
  
  protected static String _privk3_value(final PortAspectPortAspectProperties _self_, final Port _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.value;
  }
  
  protected static void _privk3_value(final PortAspectPortAspectProperties _self_, final Port _self, final String value) {
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
