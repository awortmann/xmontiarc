package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.XMontiArcWithAutomatonMTAdaptersFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.BooleanVariable;

@SuppressWarnings("all")
public class BooleanVariableAdapter extends EObjectAdapter<BooleanVariable> implements ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.BooleanVariable {
  private XMontiArcWithAutomatonMTAdaptersFactory adaptersFactory;
  
  public BooleanVariableAdapter() {
    super(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.XMontiArcWithAutomatonMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.XMontiArcWithAutomatonMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public boolean isInitialValue() {
    return adaptee.isInitialValue();
  }
  
  @Override
  public void setInitialValue(final boolean o) {
    adaptee.setInitialValue(o);
  }
  
  @Override
  public Boolean getValue() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.BooleanVariableAspect.value(adaptee);
  }
  
  @Override
  public void setValue(final Boolean value) {
    ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.BooleanVariableAspect.value(adaptee, value
    );
  }
  
  protected final static String NAME_EDEFAULT = "UnnamedVariable";
  
  protected final static boolean INITIAL_VALUE_EDEFAULT = false;
  
  protected final static Boolean VALUE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.eINSTANCE.getBooleanVariable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.BOOLEAN_VARIABLE__NAME:
    		return getName();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.BOOLEAN_VARIABLE__INITIAL_VALUE:
    		return isInitialValue() ? Boolean.TRUE : Boolean.FALSE;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.BOOLEAN_VARIABLE__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.BOOLEAN_VARIABLE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.BOOLEAN_VARIABLE__INITIAL_VALUE:
    		return isInitialValue() != INITIAL_VALUE_EDEFAULT;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.BOOLEAN_VARIABLE__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.BOOLEAN_VARIABLE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.BOOLEAN_VARIABLE__INITIAL_VALUE:
    		setInitialValue(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.BOOLEAN_VARIABLE__VALUE:
    		setValue(
    		(java.lang.Boolean)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
