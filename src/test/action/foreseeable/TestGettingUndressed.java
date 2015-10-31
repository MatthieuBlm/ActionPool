package src.test.action.foreseeable;


import src.action.Action;
import src.action.foreseeable.Foreseeable;
import src.action.foreseeable.GettingUndressed;

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
