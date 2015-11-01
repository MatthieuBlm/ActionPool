package src.test.action.foreseeable.foreseeableswimming;


import src.action.Action;
import src.action.foreseeable.Foreseeable;
import src.action.foreseeable.foreseeableswimming.Swim;
import src.test.action.foreseeable.TestForeseeable;
/**
 * test swim
 * @author meyer bellamy
 *
 */
public class TestSwim extends TestForeseeable {

	@Override
	protected Foreseeable createActionForeseeable(int n) {
		return new Swim(n);
	}

	@Override
	protected Action createAction() {
		return new Swim(2);
	}

}
