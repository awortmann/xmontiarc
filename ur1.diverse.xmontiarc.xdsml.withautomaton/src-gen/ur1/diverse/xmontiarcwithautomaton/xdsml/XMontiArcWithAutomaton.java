package ur1.diverse.xmontiarcwithautomaton.xdsml;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import ur1.diverse.xmontiarcwithautomaton.xdsml.MontiArcMT;
import ur1.diverse.xmontiarcwithautomaton.xdsml.XMontiArcMT;
import ur1.diverse.xmontiarcwithautomaton.xdsml.XMontiArcWithAutomatonMT;

@SuppressWarnings("all")
public class XMontiArcWithAutomaton implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static XMontiArcWithAutomaton load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    XMontiArcWithAutomaton mm = new XMontiArcWithAutomaton();
    mm.setResource(res);
    return mm ;
  }
  
  public MontiArcMT toMontiArcMT() {
    ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.XMontiArcWithAutomatonAdapter adaptee = new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.montiarcmt.XMontiArcWithAutomatonAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public XMontiArcMT toXMontiArcMT() {
    ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcmt.XMontiArcWithAutomatonAdapter adaptee = new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcmt.XMontiArcWithAutomatonAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public XMontiArcWithAutomatonMT toXMontiArcWithAutomatonMT() {
    ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.XMontiArcWithAutomatonAdapter adaptee = new ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarcwithautomaton.adapters.xmontiarcwithautomatonmt.XMontiArcWithAutomatonAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
