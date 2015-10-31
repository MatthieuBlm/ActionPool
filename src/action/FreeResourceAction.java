package src.action;


import src.resource.Resource;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;

public abstract class FreeResourceAction<R extends Resource> extends ResourceAction<R>{
	
	public FreeResourceAction(ResourcePool<R> resPool, ResourcefulUser<R> resfulUser) {
		super(resPool, resfulUser);
	}

	@Override
	public boolean isFinished() {
		if ((this.resfulUser.getResource() == null)&& !isReady()) return true;
		return false;
	}

	protected String getDescription() {
		return " freeing resource from pool ";
	}
	
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
	
	public void printDescription() {
		super.printDescription();
		System.out.print("\n");
	}

}
