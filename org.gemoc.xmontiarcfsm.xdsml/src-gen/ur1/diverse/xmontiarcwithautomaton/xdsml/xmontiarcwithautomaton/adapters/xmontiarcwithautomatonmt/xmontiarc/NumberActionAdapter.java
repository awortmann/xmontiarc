package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.XMontiArcWithAutomatonMTAdaptersFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.xmontiarc.NumberAction;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.NumberVariable;

@SuppressWarnings("all")
public class NumberActionAdapter extends EObjectAdapter<NumberAction> implements ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.NumberAction {
  private XMontiArcWithAutomatonMTAdaptersFactory adaptersFactory;
  
  public NumberActionAdapter() {
    super(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.XMontiArcWithAutomatonMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.XMontiArcWithAutomatonMTAdaptersFactory.getInstance();
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
  public String getExpression() {
    return adaptee.getExpression();
  }
  
  @Override
  public void setExpression(final String o) {
    adaptee.setExpression(o);
  }
  
  @Override
  public NumberVariable getTarget() {
    return (NumberVariable) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final NumberVariable o) {
    if (o != null)
    	adaptee.setTarget(((ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.xmontiarc.NumberVariableAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public void execute() {
    ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.aspects.NumberActionAspect.execute(adaptee);
  }
  
  protected final static long VALUE_EDEFAULT = 0L;
  
  protected final static String EXPRESSION_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.eINSTANCE.getNumberAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.NUMBER_ACTION__VALUE:
    		return new java.lang.Long(getValue());
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.NUMBER_ACTION__TARGET:
    		return getTarget();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.NUMBER_ACTION__EXPRESSION:
    		return getExpression();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.NUMBER_ACTION__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.NUMBER_ACTION__TARGET:
    		return getTarget() != null;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.NUMBER_ACTION__EXPRESSION:
    		return getExpression() != EXPRESSION_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.NUMBER_ACTION__VALUE:
    		setValue(((java.lang.Long) newValue).longValue());
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.NUMBER_ACTION__TARGET:
    		setTarget(
    		(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.NumberVariable)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomatonmt.xmontiarc.XmontiarcPackage.NUMBER_ACTION__EXPRESSION:
    		setExpression(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
