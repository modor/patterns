package io.modor.patterns.memento;

public class Memento {

	private int value1;
	private int value2;

	public Memento(int value1, int value2) {
		// TODO Auto-generated constructor stub
		this.value1 = value1;
		this.value2 = value2;
	}

	/**
	 * @return the value1
	 */
	public int getValue1() {
		return value1;
	}

	/**
	 * @param value1
	 *            the value1 to set
	 */
	public void setValue1(int value1) {
		this.value1 = value1;
	}

	/**
	 * @return the value2
	 */
	public int getValue2() {
		return value2;
	}

	/**
	 * @param value2
	 *            the value2 to set
	 */
	public void setValue2(int value2) {
		this.value2 = value2;
	}
}
