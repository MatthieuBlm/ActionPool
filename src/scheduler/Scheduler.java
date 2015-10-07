package scheduler;

import java.util.ArrayList;
import java.util.List;

import action.Action;

public abstract class Scheduler {
	protected List<Action> actionList;
	protected int remainingStep;
	
	public Scheduler(int stepToEnd) {
		this.remainingStep = stepToEnd;
		actionList = new ArrayList<>();
	}

	public void addAction(Action a){
		actionList.add(a);
	}
	
	public abstract boolean isReady();
}
