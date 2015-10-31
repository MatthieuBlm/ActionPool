package src.action;


import src.resource.Resource;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;

public class FreeResourceAction<R extends Resource> extends ResourceAction<R>{
	
	public FreeResourceAction(ResourcePool<R> resPool, ResourcefulUser<R> resfulUser) {
		super(resPool, resfulUser);
	}

	@Override
	public boolean isFinished() {
		if (this.resfulUser.getResource() == null) return true;
		return false;
	}

	@Override
	public void reallyDoOneStep() {
		super.reallyDoOneStep();
		try {
			this.resourcePool.freeResource(this.resfulUser.getResource());
			this.resfulUser.resetResource();
		} catch (IllegalArgumentException e) {
			System.out.println("This resource can't go in this pool\n");
		}
	}


}
