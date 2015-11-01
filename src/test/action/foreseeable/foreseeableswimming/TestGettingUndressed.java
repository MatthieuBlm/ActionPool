package src.test.action.foreseeable.foreseeableswimming;


import src.action.Action;
import src.action.foreseeable.Foreseeable;
import src.action.foreseeable.foreseeableswimming.GettingUndressed;
import src.test.action.foreseeable.TestForeseeable;
/**
 * test the getting undressed
 * @author meyer bellamy
 *
 */
public class TestGettingUndressed extends TestForeseeable {

	@Override
	protected Foreseeable createActionForeseeable(int n) {
		return new GettingUndressed(n);
	}

	@Override
	protected Action createAction() {
		return new GettingUndressed(2);
	}

}
