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
	protected R instance;
	
	public ResourceAction(ResourcePool<R> resPool, ResourcefulUser<R> resfulUser) {
		super();
		this.resourcePool = resPool;
		this.resfulUser = resfulUser;
		this.instance = getInstance();
	}
	
	protected abstract R getInstance();
	
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

	protected abstract String getDescription();
	
	public void printDescription() {
		System.out.print( getDescription() + getInstance().description());
	}

}
