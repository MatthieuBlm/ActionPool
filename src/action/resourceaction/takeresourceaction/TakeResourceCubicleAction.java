package src.action.resourceaction.takeresourceaction;

import src.resource.Cubicle;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;
/**
 * Take a cubicle resource in a resource cubicle to give at the user
 * @author Meyer Bellamy
 *
 */
public class TakeResourceCubicleAction extends TakeResourceAction<Cubicle> {

	/**
	 * Constructor TakeResourceCubicleAction
	 * @param resPool the Cubicle's resource
	 * @param resfulUser the Cubicle's resource of the user
	 */
	public TakeResourceCubicleAction(ResourcePool<Cubicle> resPool,
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
