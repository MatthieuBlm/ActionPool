package src.action.foreseeable.foreseeableswimming;

/**
 * Getting dressed action for the swimmer
 * @author Meyer Bellamy
 *
 */
public class GettingDressed extends ForeseeableSwimming {

	/**
	 * Constructor getting dressed
	 * @param totalTime all the time to execute the action
	 */
	public GettingDressed(int totalTime) {
		super(totalTime);
	}

	/* (non-Javadoc)
	 * @see src.action.foreseeable.foreseeableswimming.ForeseeableSwimming#getDescription()
	 */
	@Override
	protected String getDescription() {
		return " dressing";
	}


}
