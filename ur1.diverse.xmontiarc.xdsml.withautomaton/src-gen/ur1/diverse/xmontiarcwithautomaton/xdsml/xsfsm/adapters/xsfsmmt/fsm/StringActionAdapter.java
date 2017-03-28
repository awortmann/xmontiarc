package ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.xsfsmmt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.fsm.StringAction;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.StringVariable;

@SuppressWarnings("all")
public class StringActionAdapter extends EObjectAdapter<StringAction> implements ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.StringAction {
  private XSFSMMTAdaptersFactory adaptersFactory;
  
  public StringActionAdapter() {
    super(ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.xsfsmmt.XSFSMMTAdaptersFactory.getInstance();
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
  public StringVariable getTarget() {
    return (StringVariable) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final StringVariable o) {
    if (o != null)
    	adaptee.setTarget(((ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.xsfsmmt.fsm.StringVariableAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public void execute() {
    ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.aspects.StringActionAspect.execute(adaptee);
  }
  
  protected final static String VALUE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.eINSTANCE.getStringAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.STRING_ACTION__VALUE:
    		return getValue();
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.STRING_ACTION__TARGET:
    		return getTarget();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.STRING_ACTION__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.STRING_ACTION__TARGET:
    		return getTarget() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.STRING_ACTION__VALUE:
    		setValue(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.FsmPackage.STRING_ACTION__TARGET:
    		setTarget(
    		(ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsmmt.fsm.StringVariable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
