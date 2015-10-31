package src.action;

import src.exception.ActionFinishedException;

public abstract class Action{
	protected boolean isReady;
	
	public abstract boolean isReady();
	public abstract boolean isInProgess() ;
	public abstract boolean isFinished();
	public abstract void reallyDoOneStep() ;

	public Action() {
		isReady = true;
	}
	
	public final void doStep() throws ActionFinishedException{
			if (this.isFinished()) {
				throw new ActionFinishedException();
			}
			reallyDoOneStep();
	}
	
}

