package src.action.foreseeable.foreseeableswimming;

/**
 * Swim action for the swimmer
 * @author Meyer Bellamy
 *
 */
public class Swim extends ForeseeableSwimming {

	/**
	 * Constructor Swim 
	 * @param totalTime all the time to execute
	 */
	public Swim(int totalTime) {
		super(totalTime);
	}

	/* (non-Javadoc)
	 * @see src.action.foreseeable.foreseeableswimming.ForeseeableSwimming#getDescription()
	 */
	@Override
	protected String getDescription() {
		return " swim";
	}

}
