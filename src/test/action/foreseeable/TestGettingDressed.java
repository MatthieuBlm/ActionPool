package src.test.action.foreseeable;


import src.action.Action;
import src.action.foreseeable.Foreseeable;
import src.action.foreseeable.GettingDressed;

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
