package src.action.foreseeable.foreseeableswimming;

/**
 * getting undressed, action for the swimmer
 * @author Meyer Bellamy
 *
 */
public class GettingUndressed extends ForeseeableSwimming {

	/**
	 * Constructor for the class
	 * @param totalTime all the time to execute the action
	 */
	public GettingUndressed(int totalTime) {
		super(totalTime);
	}

	/* (non-Javadoc)
	 * @see src.action.foreseeable.foreseeableswimming.ForeseeableSwimming#getDescription()
	 */
	@Override
	protected String getDescription() {
		return " undressing";
	}
	

}
