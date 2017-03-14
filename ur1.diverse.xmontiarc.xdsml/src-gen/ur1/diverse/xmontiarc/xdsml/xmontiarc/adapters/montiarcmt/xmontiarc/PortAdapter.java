package ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.Port;

@SuppressWarnings("all")
public class PortAdapter extends EObjectAdapter<Port> implements xmontiarc.Port {
  private MontiArcMTAdaptersFactory adaptersFactory;
  
  public PortAdapter() {
    super(ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getType() {
    return adaptee.getType();
  }
  
  @Override
  public void setType(final String o) {
    adaptee.setType(o);
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
  public boolean isIncoming() {
    return adaptee.isIncoming();
  }
  
  @Override
  public void setIncoming(final boolean o) {
    adaptee.setIncoming(o);
  }
  
  @Override
  public String getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final String o) {
    adaptee.setValue(o);
  }
  
  protected final static String TYPE_EDEFAULT = "java.lang.Object";
  
  protected final static String NAME_EDEFAULT = "UnnamedPort";
  
  protected final static boolean INCOMING_EDEFAULT = true;
  
  protected final static String VALUE_EDEFAULT = "UnnamedPort";
  
  @Override
  public EClass eClass() {
    return xmontiarc.XmontiarcPackage.eINSTANCE.getPort();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.PORT__TYPE:
    		return getType();
    	case xmontiarc.XmontiarcPackage.PORT__NAME:
    		return getName();
    	case xmontiarc.XmontiarcPackage.PORT__INCOMING:
    		return isIncoming() ? Boolean.TRUE : Boolean.FALSE;
    	case xmontiarc.XmontiarcPackage.PORT__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.PORT__TYPE:
    		return getType() != TYPE_EDEFAULT;
    	case xmontiarc.XmontiarcPackage.PORT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case xmontiarc.XmontiarcPackage.PORT__INCOMING:
    		return isIncoming() != INCOMING_EDEFAULT;
    	case xmontiarc.XmontiarcPackage.PORT__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case xmontiarc.XmontiarcPackage.PORT__TYPE:
    		setType(
    		(java.lang.String)
    		 newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.PORT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case xmontiarc.XmontiarcPackage.PORT__INCOMING:
    		setIncoming(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case xmontiarc.XmontiarcPackage.PORT__VALUE:
    		setValue(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
