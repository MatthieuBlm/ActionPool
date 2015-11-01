package src.action.resourceaction.freeresourceaction;

import src.resource.Cubicle;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;
/**
 * Class to free cubicle
 * @author Meyer Bellamy
 *
 */
public class FreeResourceCubicleAction extends FreeResourceAction<Cubicle> {

	/**
	 * Constructor FreeResourceCubicleAction
	 * @param resPool the Cubicle's resource
	 * @param resfulUser the Cubicle's resource of the user
	 */
	public FreeResourceCubicleAction(ResourcePool<Cubicle> resPool,
			ResourcefulUser<Cubicle> resfulUser) {
		super(resPool, resfulUser);
	}

	/* (non-Javadoc)
	 * @see src.action.resourceaction.ResourceAction#getInstance()
	 */
	@Override
	protected Cubicle getInstance() {
		return new Cubicle();
	}

}
