package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.XMontiArcWithAutomatonMTAdaptersFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.GreaterThanNumberGuard;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.NumberVariable;

@SuppressWarnings("all")
public class GreaterThanNumberGuardAdapter extends EObjectAdapter<GreaterThanNumberGuard> implements ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.GreaterThanNumberGuard {
  private XMontiArcWithAutomatonMTAdaptersFactory adaptersFactory;
  
  public GreaterThanNumberGuardAdapter() {
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
  public long getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final long o) {
    adaptee.setValue(o);
  }
  
  @Override
  public NumberVariable getSource() {
    return (NumberVariable) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final NumberVariable o) {
    if (o != null)
    	adaptee.setSource(((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.xmontiarc.NumberVariableAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public boolean holds() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.GreaterThanNumberGuardAspect.holds(adaptee);
  }
  
  protected final static boolean NOT_EDEFAULT = false;
  
  protected final static long VALUE_EDEFAULT = -1L;
  
  @Override
  public EClass eClass() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.eINSTANCE.getGreaterThanNumberGuard();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.GREATER_THAN_NUMBER_GUARD__NOT:
    		return isNot() ? Boolean.TRUE : Boolean.FALSE;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.GREATER_THAN_NUMBER_GUARD__VALUE:
    		return new java.lang.Long(getValue());
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.GREATER_THAN_NUMBER_GUARD__SOURCE:
    		return getSource();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.GREATER_THAN_NUMBER_GUARD__NOT:
    		return isNot() != NOT_EDEFAULT;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.GREATER_THAN_NUMBER_GUARD__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.GREATER_THAN_NUMBER_GUARD__SOURCE:
    		return getSource() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.GREATER_THAN_NUMBER_GUARD__NOT:
    		setNot(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.GREATER_THAN_NUMBER_GUARD__VALUE:
    		setValue(((java.lang.Long) newValue).longValue());
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.GREATER_THAN_NUMBER_GUARD__SOURCE:
    		setSource(
    		(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.NumberVariable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
