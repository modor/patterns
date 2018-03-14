package io.modor.patterns.observer;

public class ConcreteObserverA implements Observer {
	
	private String state;

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	@Override
	public void update(String state) {
		// TODO Auto-generated method stub
		this.state = state;
	}

}
