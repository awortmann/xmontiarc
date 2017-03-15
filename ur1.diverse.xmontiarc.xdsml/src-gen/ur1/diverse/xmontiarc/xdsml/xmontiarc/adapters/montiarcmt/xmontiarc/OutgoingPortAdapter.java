package ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.OutgoingPort;
import xmontiarc.DataType;

@SuppressWarnings("all")
public class OutgoingPortAdapter extends EObjectAdapter<OutgoingPort> implements xmontiarc.OutgoingPort {
  private MontiArcMTAdaptersFactory adaptersFactory;
  
  public OutgoingPortAdapter() {
    super(ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public DataType getType() {
    return xmontiarc.DataType.get(adaptee.getType().getValue());
  }
  
  @Override
  public void setType(final DataType o) {
    adaptee.setType(ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.DataType.get(o.getValue()));
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
  public String getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final String o) {
    adaptee.setValue(o);
  }
  
  @Override
  public String getInitialValue() {
    return adaptee.getInitialValue();
  }
  
  @Override
  public void setInitialValue(final String o) {
    adaptee.setInitialValue(o);
  }
  
  protected final static DataType TYPE_EDEFAULT = xmontiarc.DataType.NUMBER;
  
  protected final static String NAME_EDEFAULT = "UnnamedPort";
  
  protected final static String VALUE_EDEFAULT = "DefaultValue";
  
  protected final static String INITIAL_VALUE_EDEFAULT = "DefaultValue";
  
  @Override
  public EClass eClass() {
    return xmontiarc.XmontiarcPackage.eINSTANCE.getOutgoingPort();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.OUTGOING_PORT__TYPE:
    		return getType();
    	case xmontiarc.XmontiarcPackage.OUTGOING_PORT__NAME:
    		return getName();
    	case xmontiarc.XmontiarcPackage.OUTGOING_PORT__VALUE:
    		return getValue();
    	case xmontiarc.XmontiarcPackage.OUTGOING_PORT__INITIAL_VALUE:
    		return getInitialValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.OUTGOING_PORT__TYPE:
    		return getType() != TYPE_EDEFAULT;
    	case xmontiarc.XmontiarcPackage.OUTGOING_PORT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case xmontiarc.XmontiarcPackage.OUTGOING_PORT__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    	case xmontiarc.XmontiarcPackage.OUTGOING_PORT__INITIAL_VALUE:
    		return getInitialValue() != INITIAL_VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.OUTGOING_PORT__TYPE:
    		setType(
    		(xmontiarc.DataType)
    		 newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.OUTGOING_PORT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.OUTGOING_PORT__VALUE:
    		setValue(
    		(java.lang.String)
    		 newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.OUTGOING_PORT__INITIAL_VALUE:
    		setInitialValue(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
