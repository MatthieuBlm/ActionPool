package src.resource;

/**
 * Resource Basket for the basket pool
 * @author Meyer Bellamy
 *
 */

public class Basket implements Resource
{

	/**
	 * Constructor Basket
	 */
	public Basket(){
		super();
	}

	
	/* (non-Javadoc)
	 * @see src.resource.Resource#description()
	 */
	public String description() {
		return "Basket";	
	}
	
}

