package src.action;

import java.util.NoSuchElementException;

import src.resource.Resource;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;

public class TakeResourceAction<R extends Resource> extends ResourceAction<R>{
	
	public TakeResourceAction (ResourcePool<R> resPool, ResourcefulUser<R> resfulUser) {
		super(resPool, resfulUser);
	}

	@Override
	public boolean isFinished() {
		if (this.resfulUser.getResource() == null) {
			return false;
		}
		return true;
	}

	@Override
	public void reallyDoOneStep() {
		try {
			isReady = false;
			R res = this.resourcePool.provideResource();
			this.resfulUser.setResource(res);
		} catch (NoSuchElementException e) {
			System.out.println("There aren't any resources\n");
		}	
	}

}
