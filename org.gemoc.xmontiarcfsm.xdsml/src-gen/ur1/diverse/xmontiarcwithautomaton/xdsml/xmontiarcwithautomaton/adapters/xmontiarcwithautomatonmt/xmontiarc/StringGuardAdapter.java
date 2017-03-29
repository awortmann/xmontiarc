package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.XMontiArcWithAutomatonMTAdaptersFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.StringGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.StringVariable;

@SuppressWarnings("all")
public class StringGuardAdapter extends EObjectAdapter<StringGuard> implements ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.StringGuard {
  private XMontiArcWithAutomatonMTAdaptersFactory adaptersFactory;
  
  public StringGuardAdapter() {
    super(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.XMontiArcWithAutomatonMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.XMontiArcWithAutomatonMTAdaptersFactory.getInstance();
  }
  
  @Override
  public boolean isNot() {
    return adaptee.isNot();
  }
  
  @Override
  public void setNot(final boolean o) {
    adaptee.setNot(o);
  }
  
  @Override
  public String getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final String o) {
    adaptee.setValue(o);
  }
  
  @Override
  public StringVariable getSource() {
    return (StringVariable) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final StringVariable o) {
    if (o != null)
    	adaptee.setSource(((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.xmontiarc.StringVariableAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public boolean holds() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.StringGuardAspect.holds(adaptee);
  }
  
  protected final static boolean NOT_EDEFAULT = false;
  
  protected final static String VALUE_EDEFAULT = "UnnamedVariable";
  
  @Override
  public EClass eClass() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.eINSTANCE.getStringGuard();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.STRING_GUARD__NOT:
    		return isNot() ? Boolean.TRUE : Boolean.FALSE;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.STRING_GUARD__VALUE:
    		return getValue();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.STRING_GUARD__SOURCE:
    		return getSource();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.STRING_GUARD__NOT:
    		return isNot() != NOT_EDEFAULT;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.STRING_GUARD__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.STRING_GUARD__SOURCE:
    		return getSource() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.STRING_GUARD__NOT:
    		setNot(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.STRING_GUARD__VALUE:
    		setValue(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.STRING_GUARD__SOURCE:
    		setSource(
    		(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.StringVariable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
