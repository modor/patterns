package com.modor.memento;

public class MementoManager {

	private int value1;
	private int value2;

	/**
	 * @return the value1
	 */
	public int getValue1() {
		return value1;
	}

	/**
	 * @return the value2
	 */
	public int getValue2() {
		return value2;
	}

	public void setValue(int value1, int value2) {
		// TODO Auto-generated constructor stub
		this.value1 = value1;
		this.value2 = value2;
	}

	public Memento createMemento() {
		return (new Memento(value1, value2));
	}

	public void recoverMemento(Memento memento) {
		this.value1 = memento.getValue1();
		this.value2 = memento.getValue2();
	}
}
