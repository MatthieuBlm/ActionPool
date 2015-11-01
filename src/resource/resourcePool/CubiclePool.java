package src.resource.resourcePool;
import src.resource.Cubicle;

/**
 * Cubicle Pool keep all the cubicle for the swimming pool
 * @author Meyer Bellamy
 *
 */

public class CubiclePool extends ResourcePool<Cubicle>
{


	
	/**
	 * Constructor Cubicle pool
	 * @param length the number of the cubicle
	 */
	public CubiclePool(int length) {
		super(length);	
	}
	
	
	/* (non-Javadoc)
	 * @see src.resource.resourcePool.ResourcePool#getType()
	 */
	public Cubicle getType() {
		return new Cubicle();	
	}
	
}

