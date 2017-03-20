package ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.xmontiarc;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory;
import ur1.diverse.xmontiarc.xdsml.xmontiarc.xmontiarc.AutomatonComponentBehavior;

@SuppressWarnings("all")
public class AutomatonComponentBehaviorAdapter extends EObjectAdapter<AutomatonComponentBehavior> implements xmontiarc.AutomatonComponentBehavior {
  private MontiArcMTAdaptersFactory adaptersFactory;
  
  public AutomatonComponentBehaviorAdapter() {
    super(ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance());
    adaptersFactory = ur1.diverse.xmontiarc.xdsml.xmontiarc.adapters.montiarcmt.MontiArcMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return xmontiarc.XmontiarcPackage.eINSTANCE.getAutomatonComponentBehavior();
  }
}
