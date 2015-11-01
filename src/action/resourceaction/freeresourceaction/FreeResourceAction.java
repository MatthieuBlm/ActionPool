package src.action.resourceaction.freeresourceaction;


import src.action.resourceaction.ResourceAction;
import src.resource.Resource;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;

/**
 * Free the object of the user
 * @author Meyer Bellamy
 *
 * @param <R> an object extends Resource which can be free
 */
public abstract class FreeResourceAction<R extends Resource> extends ResourceAction<R>{
	
	/**
	 * Constructor for the FreeResourceAction
	 * @param resPool the resource pool of the object
	 * @param resfulUser the resource which can be free
	 */
	public FreeResourceAction(ResourcePool<R> resPool, ResourcefulUser<R> resfulUser) {
		super(resPool, resfulUser);
	}

	/* (non-Javadoc)
	 * @see src.action.Action#isFinished()
	 */
	@Override
	public boolean isFinished() {
		if ((this.resfulUser.getResource() == null)&& !isReady()) return true;
		return false;
	}

	/* (non-Javadoc)
	 * @see src.action.resourceaction.ResourceAction#getDescription()
	 */
	protected String getDescription() {
		return " freeing resource from pool ";
	}
	
	/* (non-Javadoc)
	 * @see src.action.resourceaction.ResourceAction#reallyDoOneStep()
	 */
	@Override
	public void reallyDoOneStep() {
		super.reallyDoOneStep();
		try {
			this.resourcePool.freeResource(this.resfulUser.getResource());
			this.resfulUser.resetResource();
			printDescription();
		} catch (IllegalArgumentException e) {
			System.out.println("failed");
		}
	}
	
	/* (non-Javadoc)
	 * @see src.action.resourceaction.ResourceAction#printDescription()
	 */
	public void printDescription() {
		super.printDescription();
		System.out.print("\n");
	}

}
