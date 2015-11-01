/**
 * 
 */
package src.test.action.foreseeable;

import src.action.Action;
import src.action.foreseeable.Foreseeable;
import src.action.foreseeable.NStepAction;

/**
 * Test the Foreseaable action
 * @author Meyer Bellamy
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
