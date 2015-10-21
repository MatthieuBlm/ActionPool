package action.scheduler;

import java.util.ArrayList;
import java.util.List;

import exception.ActionFinishedException;

import action.Action;

public abstract class Scheduler extends Action{
	protected List<Action> actions;
	protected boolean isInitialized;
	
	protected abstract Action nextAction();
	
	public Scheduler() {
		super(0);
		this.actions = new ArrayList<Action>();
	}
	
	public void addAction(Action a) {
		isInitialized = true;
		if (a.isFinished()) {
			throw new IllegalArgumentException("Can't add an already finished action");
		}
		if (isFinished()) {
			throw new IllegalArgumentException("ou can't add an action to a finished scheduler");
		} else {
			actions.add(a);
		}
	}

	public boolean isReady() {
		return (isInitialized && isReady);	
	}
	
	@Override
	public boolean isFinished() {
		return (isInitialized && !isReady() && actions.isEmpty());
	}
	
	public void reallyDoOneStep() {
		isReady= false;
		Action nextAction = nextAction();
		try {
			nextAction.doStep();
		} catch (ActionFinishedException e) {
			System.out.println(e.getMessage());
		}
		if (nextAction.isFinished()) {
			actions.remove(0);
		}
	}

	public List<Action> getListAction() {
		return actions;
	}
	
	@Override
	public boolean isInProgess() {
		return (isInitialized && !isFinished() && !isReady());
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Scheduler) {
			Scheduler other = (Scheduler) o;
			return ((other.getTotalTime() == this.totalTime) && (this.getListAction().size() == other.getListAction().size()));
		}
		return false;
	}
	
}

