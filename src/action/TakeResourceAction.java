package src.action;

import java.util.NoSuchElementException;

import src.resource.Resource;
import src.resource.resourcePool.ResourcePool;
import src.resource.resourcefuluser.ResourcefulUser;

public abstract class TakeResourceAction<R extends Resource> extends ResourceAction<R>{
	
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

	private String printResult() {
		if (isFinished()) {
			return "success";
		} else {
			return "failed";
		}
	}
	
	@Override
	public void reallyDoOneStep() {
		try {
			isReady = false;
			R res = this.resourcePool.provideResource();
			this.resfulUser.setResource(res);
			printDescription();
		} catch (NoSuchElementException e) {
			System.out.println("failed");
		}	
	}
	
	protected String getDescription() {
		return " trying to take resource from pool ";
	}

	public void printDescription() {
		super.printDescription();
		System.out.print("... " + printResult()+"\n");
	}

}
