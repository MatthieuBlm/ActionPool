package src.test.action.foreseeable;


import src.action.Action;
import src.action.foreseeable.Foreseeable;
import src.action.foreseeable.Swim;

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
