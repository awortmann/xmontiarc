package ur1.diverse.xmontiarcwithautomaton.xdsml;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import ur1.diverse.xmontiarcwithautomaton.xdsml.FSMMT;
import ur1.diverse.xmontiarcwithautomaton.xdsml.XSFSMMT;

@SuppressWarnings("all")
public class XSFSM implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static XSFSM load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    XSFSM mm = new XSFSM();
    mm.setResource(res);
    return mm ;
  }
  
  public FSMMT toFSMMT() {
    ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.XSFSMAdapter adaptee = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.fsmmt.XSFSMAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public XSFSMMT toXSFSMMT() {
    ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.xsfsmmt.XSFSMAdapter adaptee = new ur1.diverse.xmontiarcwithautomaton.xdsml.xsfsm.adapters.xsfsmmt.XSFSMAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
