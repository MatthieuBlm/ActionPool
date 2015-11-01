package src.action.scheduler;

import java.util.ArrayList;
import java.util.List;

import src.exception.ActionFinishedException;

import src.action.Action;
/**
 * Scheduler contains a lot of actions 
 * @author Meyer Bellamy
 *
 */
public abstract class Scheduler extends Action{
	/**
	 * attribute actions with a list of all the actions
	 */
	protected List<Action> actions;
	/**
	 * attribute isInitialized is true if there are at least one action
	 */
	protected boolean isInitialized;
	
	/**
	 * return the next action
	 * @return the next action
	 */
	protected abstract Action nextAction();
	
	/**
	 * Constructor Scheduler
	 * initialize an empty list
	 */
	public Scheduler() {
		super();
		this.actions = new ArrayList<Action>();
	}
	
	/**
	 * add an action to the scheduler
	 * @param a an action which you can add
	 */
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

	/* (non-Javadoc)
	 * @see src.action.Action#isReady()
	 */
	public boolean isReady() {
		return (isInitialized && isReady);	
	}
	
	/* (non-Javadoc)
	 * @see src.action.Action#isFinished()
	 */
	@Override
	public boolean isFinished() {
		return (isInitialized && !isReady() && actions.isEmpty());
	}
	
	/* (non-Javadoc)
	 * @see src.action.Action#reallyDoOneStep()
	 */
	public void reallyDoOneStep() {
		isReady= false;
		if (!isFinished()) {
			Action nextAction = nextAction();
			try {
				if (toString() != "") System.out.println(toString()+ "'s turn");
				nextAction.doStep();		
			} catch (ActionFinishedException e) {}
			if (nextAction.isFinished()) {
				actions.remove(nextAction);
			}
		} 
	}

	/**
	 * return a list with all the actions
	 * @return a list with all the actions
	 */
	public List<Action> getListAction() {
		return actions;
	}
	
	/* (non-Javadoc)
	 * @see src.action.Action#isInProgess()
	 */
	@Override
	public boolean isInProgess() {
		return (isInitialized && !isFinished() && !isReady());
	}
	
}

