/**
 * 
 */
package test.action.foreseeable;

import action.Action;
import action.foreseeable.NStepAction;

/**
 * @author meyer
 *
 */
public class TestNStepAction extends TestForeseeable {


	@Override
	protected Action createAction(int nb) {
		return new NStepAction(nb);
	}

}
