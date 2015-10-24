/**
 * 
 */
package test.action.foreseeable;

import action.Action;
import action.foreseeable.Foreseeable;
import action.foreseeable.NStepAction;

/**
 * @author meyer
 *
 */
public class TestNStepAction extends TestForeseeable {


	@Override
	protected Foreseeable createActionForeseeable(int n) {
		return new NStepAction(n);
	}

	@Override
	protected Action createAction() {
		return new NStepAction(4);
	}

}
