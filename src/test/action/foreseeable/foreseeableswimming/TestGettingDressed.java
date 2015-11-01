package src.test.action.foreseeable.foreseeableswimming;


import src.action.Action;
import src.action.foreseeable.Foreseeable;
import src.action.foreseeable.foreseeableswimming.GettingDressed;
import src.test.action.foreseeable.TestForeseeable;

/**
 * Test the getting dressed
 * @author meyer bellamy
 *
 */
public class TestGettingDressed extends TestForeseeable {

	@Override
	protected Foreseeable createActionForeseeable(int n) {
		return new GettingDressed(n);
	}

	@Override
	protected Action createAction() {
		return new GettingDressed(2);
	}

}
