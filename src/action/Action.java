package action;

import exception.ActionFinishedException;

public abstract class Action{
	protected boolean isReady;
	protected int totalTime;
	
	public abstract boolean isReady();
	public abstract boolean isInProgess() ;
	public abstract boolean isFinished();
	public abstract void reallyDoOneStep() ;
	public abstract boolean equals(Object o);

	public Action(int timeToEnd) {
		this.totalTime= timeToEnd;	
		isReady =true;
	}
	
	public final void doStep() throws ActionFinishedException{
			if (this.isFinished()) {
				throw new ActionFinishedException();
			}
			reallyDoOneStep();
	}
	
	public int getTotalTime() {
		return this.totalTime;
	}
	
}

