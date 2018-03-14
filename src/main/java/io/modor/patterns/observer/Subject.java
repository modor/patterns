package io.modor.patterns.observer;

import java.util.Vector;

public class Subject {

	private Vector<Observer> observers = new Vector<Observer>();
	private String state;

	public void setChange(String state) {
		this.state = state;
	}

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(state);
		}
	}
}
