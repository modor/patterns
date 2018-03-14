package io.modor.patterns.observer;

public class ConcreteObserverC implements Observer {

	private String state;

	@Override
	public void update(String state) {
		// TODO Auto-generated method stub
		this.state = state;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

}
