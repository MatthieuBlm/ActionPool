package src.action.resourceaction.takeresourceaction;

import java.util.NoSuchElementException;

import src.action.resourceaction.ResourceAction;
import src.resource.Resource;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;
/**
 * Take an object in the resource to give at the user
 * @author Meyer Bellamy
 *
 * @param <R> all the object extends Resource
 */
public abstract class TakeResourceAction<R extends Resource> extends ResourceAction<R>{
	
	/**
	 * Constructor TakeResourceAction 
	 * @param resPool the resource pool
	 * @param resfulUser the resource pool of the user
	 */
	public TakeResourceAction (ResourcePool<R> resPool, ResourcefulUser<R> resfulUser) {
		super(resPool, resfulUser);
	}

	/* (non-Javadoc)
	 * @see src.action.Action#isFinished()
	 */
	@Override
	public boolean isFinished() {
		if (this.resfulUser.getResource() == null) {
			return false;
		}
		return true;
	}

	/**
	 * return a result of the action
	 * @return a result of the action
	 */
	private String printResult() {
		if (isFinished()) {
			return "success";
		} else {
			return "failed";
		}
	}
	
	/* (non-Javadoc)
	 * @see src.action.resourceaction.ResourceAction#reallyDoOneStep()
	 */
	@Override
	public void reallyDoOneStep() {
		try {
			isReady = false;
			R res = this.resourcePool.provideResource();
			this.resfulUser.setResource(res);
			printDescription();
		} catch (NoSuchElementException e) {
			printDescription();
		}	
	}
	
	/* (non-Javadoc)
	 * @see src.action.resourceaction.ResourceAction#getDescription()
	 */
	protected String getDescription() {
		return " trying to take resource from pool ";
	}

	/* (non-Javadoc)
	 * @see src.action.resourceaction.ResourceAction#printDescription()
	 */
	public void printDescription() {
		super.printDescription();
		System.out.print("... " + printResult()+"\n");
	}

}
