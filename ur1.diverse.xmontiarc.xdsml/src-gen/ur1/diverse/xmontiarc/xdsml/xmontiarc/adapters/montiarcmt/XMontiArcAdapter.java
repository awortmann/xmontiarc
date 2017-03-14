package ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import ur1.diverse.xmontiarc.xdsml.MontiArcMT;
import xmontiarc.XmontiarcFactory;

@SuppressWarnings("all")
public class XMontiArcAdapter extends ResourceAdapter implements MontiArcMT {
  public XMontiArcAdapter() {
    super(ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance());
  }
  
  @Override
  public XmontiarcFactory getXmontiarcFactory() {
    return new ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc.XmontiarcFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getXmontiarcFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
