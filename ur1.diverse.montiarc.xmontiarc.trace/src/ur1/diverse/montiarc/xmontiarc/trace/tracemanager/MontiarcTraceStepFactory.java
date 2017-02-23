
package ur1.diverse.montiarc.xmontiarc.trace.tracemanager;

import java.util.List;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

public class MontiarcTraceStepFactory implements IStepFactory {

	@Override
	public fr.inria.diverse.trace.commons.model.trace.Step createStep(
			fr.inria.diverse.trace.commons.model.trace.MSE mse, List<Object> parameters, List<Object> result) {

		fr.inria.diverse.trace.commons.model.trace.Step step = null;
		org.eclipse.emf.ecore.EClass ec = mse.getCaller().eClass();
		String stepRule = fr.inria.diverse.trace.commons.EcoreCraftingUtil.getFQN(ec, ".") + "."
				+ mse.getAction().getName();

		if (mse.getAction().getName().equalsIgnoreCase("compute")
				&& (ec.getClassifierID() == ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.MontiarcPackage.eINSTANCE
						.getComponentType().getClassifierID()))

		{
			step = montiarcTrace.Steps.StepsFactory.eINSTANCE.createMontiarc_ComponentType_Compute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("update")
				&& (ec.getClassifierID() == ur1.diverse.montiarc.xdsml.xmontiarc.montiarc.MontiarcPackage.eINSTANCE
						.getComponentType().getClassifierID()))

		{
			step = montiarcTrace.Steps.StepsFactory.eINSTANCE.createMontiarc_ComponentType_Update();
		}

		else {
			step = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createGenericSequentialStep();
		}

		fr.inria.diverse.trace.commons.model.trace.MSEOccurrence mseocc = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
				.createMSEOccurrence();
		mseocc.setMse(mse);
		mseocc.getParameters().addAll(parameters);
		mseocc.getResult().addAll(result);
		step.setMseoccurrence(mseocc);

		return step;
	}
}
