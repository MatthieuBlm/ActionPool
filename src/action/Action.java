package action;

public abstract class Action {
	protected boolean isReady;
	protected boolean isInitialized;
	protected int totalStep;
	
	public Action(int stepToEnd) {
		this.totalStep = stepToEnd;
	}
	
	public boolean isReady(){
		return isReady;
	}
	
	public abstract boolean isInProgress();
	public abstract boolean isFinished();
	public abstract void doStep();
}
