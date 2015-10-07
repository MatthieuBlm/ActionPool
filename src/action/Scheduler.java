package action;

import java.util.ArrayList;
import java.util.List;


public abstract class Scheduler extends Action{
	protected List<Action> actionList;
	protected int remainingStep;
	
	public Scheduler(int stepToEnd) {
		super(stepToEnd);
		actionList = new ArrayList<>();
	}

	public void addAction(Action a){
		actionList.add(a);
	}
	
	public boolean isReady(){
		for(Action a : actionList){
			if(!a.isReady()){
				return false;
			}
		}
		return true;
	}
	
	public abstract boolean isInProgress();
	public abstract boolean isFinished();
	public abstract void doStep();
}
