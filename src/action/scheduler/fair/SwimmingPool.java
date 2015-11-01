package src.action.scheduler.fair;

import java.util.List;

import src.action.scheduler.sequential.Swimmer;

/**
 * SwimmingPool is a fair action with a name and a list of swimmers
 * @author Meyer Bellamy
 *
 */

public class SwimmingPool extends Fair{
	/**
	 * attribute name for the name of the swimming pool
	 */
	private String name;
	/**
	 * attribute swimmers for the list of the swimmers
	 */
	private List<Swimmer> swimmers;
	
	/**
	 * Constructor SwimmingPool
	 * add all the actions at the swimming pool
	 * @param name of the swimming pool
	 * @param swimmers all the swimmers
	 */
	public SwimmingPool(String name, List<Swimmer> swimmers){
		super();
		this.name = name;
		for (Swimmer sw : swimmers) {
			addAction(sw);
		}
	}
	
	/**
	 * return a list of swimmers
	 * @return a list of swimmers
	 */
	public List<Swimmer> getSwimmers() {
		return swimmers;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "";
	}
	
	/**
	 * return the name
	 * @return the name
	 */
	public String getName() {
		return name;	
	}
	
}

