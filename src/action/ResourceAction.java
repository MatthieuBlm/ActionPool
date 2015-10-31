/**
 * 
 */
package src.action;

import src.resource.Resource;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;

/**
 * @author meyer
 *
 */
public abstract class ResourceAction<R extends Resource> extends Action {

	protected ResourcePool<R> resourcePool;
	protected ResourcefulUser<R> resfulUser;
	
	public ResourceAction(ResourcePool<R> resPool, ResourcefulUser<R> resfulUser) {
		super();
		this.resourcePool = resPool;
		this.resfulUser = resfulUser;
	}
	
	@Override
	public boolean isReady() {
		return isReady;
	}

	@Override
	public boolean isInProgess() {
		return (!isReady() && !isFinished());
	}
	
	@Override
	public void reallyDoOneStep() {
		isReady = false;
	}

}
