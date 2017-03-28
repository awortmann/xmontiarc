package ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory;
import ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.xmontiarc.ComponentBehavior;

@SuppressWarnings("all")
public class ComponentBehaviorAdapter extends EObjectAdapter<ComponentBehavior> implements xmontiarc.ComponentBehavior {
  private MontiArcMTAdaptersFactory adaptersFactory;
  
  public ComponentBehaviorAdapter() {
    super(ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarcwithautomaton.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return xmontiarc.XmontiarcPackage.eINSTANCE.getComponentBehavior();
  }
}
