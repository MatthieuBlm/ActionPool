package src.resource.resourcePool;
import src.resource.Basket;

/**
 * Basket Pool contains all the Basket for the swimming pool
 * @author Meyer Bellamy
 *
 */


public class BasketPool extends ResourcePool<Basket>
{

	
	/**
	 * Constructor BasketPool
	 * @param nb the number of Basket
	 */
	public BasketPool(int nb) {
		super(nb);	
	}
	
	
	/* (non-Javadoc)
	 * @see src.resource.resourcePool.ResourcePool#getType()
	 */
	public Basket getType() {
		return new Basket();	
	}
	
	
}

