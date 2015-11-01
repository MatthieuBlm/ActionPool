package src.resource;

/**
 * Resource Cubicle for the Cubicle pool
 * @author Meyer Bellamy
 *
 */

public class Cubicle implements Resource
{
	
	/**
	 * Constructor Cubicle
	 */
	public Cubicle(){
		super();
	}

	
	
	/* (non-Javadoc)
	 * @see src.resource.Resource#description()
	 */
	public String description() {
		return "Cubicle";	
	}
	
}

