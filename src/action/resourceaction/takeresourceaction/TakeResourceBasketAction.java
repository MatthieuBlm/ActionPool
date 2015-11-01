package src.action.resourceaction.takeresourceaction;

import src.resource.Basket;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;
/**
 * Take resource in resource pool Basket to give it at the resource of the user
 * @author Meyer Bellamy
 *
 */
public class TakeResourceBasketAction extends TakeResourceAction<Basket>{

	/**
	 * Constructor TakeResourceBasketAction
	 * @param resPool the resource basket
	 * @param resfulUser the Basket's resource of the user
	 */
	public TakeResourceBasketAction(ResourcePool<Basket> resPool,
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
