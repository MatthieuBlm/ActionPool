/**
 * 
 */
package src.action.resourceaction;

import src.action.Action;
import src.resource.Resource;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;

/**
 * ResourceAction is an abstract class for TakeResourceAction and FreeResourceAction
 * associates a resource pool with a resource user
 * @author Meyer Bellamy
 *
 * @param <R> an object extends Resource
 */

public abstract class ResourceAction<R extends Resource> extends Action {

	/**
	 * attribute resourcePool to keep the resource pool
	 */
	protected ResourcePool<R> resourcePool;
	/**
	 * attribute resfulUser to keep the user's resource
	 */
	protected ResourcefulUser<R> resfulUser;
	
	/**
	 * Constructor ResourceAction associate objects resources with object resource of the user
	 * @param resPool the resource pool
	 * @param resfulUser the resource of the user
	 */
	public ResourceAction(ResourcePool<R> resPool, ResourcefulUser<R> resfulUser) {
		super();
		this.resourcePool = resPool;
		this.resfulUser = resfulUser;
	}
	
	/**
	 * return an instance of the object R
	 * @return an instance of the object R
	 */
	protected abstract R getInstance();
	
	/* (non-Javadoc)
	 * @see src.action.Action#isReady()
	 */
	@Override
	public boolean isReady() {
		return isReady;
	}

	/* (non-Javadoc)
	 * @see src.action.Action#isInProgess()
	 */
	@Override
	public boolean isInProgess() {
		return (!isReady() && !isFinished());
	}
	
	/* (non-Javadoc)
	 * @see src.action.Action#reallyDoOneStep()
	 */
	@Override
	public void reallyDoOneStep() {
		isReady = false;
	}

	/**
	 * return a description about the action
	 * @return a description about the action
	 */
	protected abstract String getDescription();
	
	/**
	 * print the description
	 */
	public void printDescription() {
		System.out.print( getDescription() + getInstance().description());
	}

}
