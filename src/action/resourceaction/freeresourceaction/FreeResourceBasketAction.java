package src.action.resourceaction.freeresourceaction;

import src.resource.Basket;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;
/**
 * Class for free basket
 * @author Meyer Bellamy
 *
 */
public class FreeResourceBasketAction extends FreeResourceAction<Basket> {

	/**
	 * Constructor FreeResourceBasketAction
	 * @param resPool the resource of Basket
	 * @param resfulUser the Basket's resource of the user
	 */
	public FreeResourceBasketAction(ResourcePool<Basket> resPool,
			ResourcefulUser<Basket> resfulUser) {
		super(resPool, resfulUser);
	}

	/* (non-Javadoc)
	 * @see src.action.resourceaction.ResourceAction#getInstance()
	 */
	@Override
	protected Basket getInstance() {
		return new Basket();
	}

}
