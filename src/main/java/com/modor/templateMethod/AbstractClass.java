package com.modor.templateMethod;

public abstract class AbstractClass {
	public String operation() {
		return operation1() + operation2() + operation3();
	}

	protected abstract String operation1();

	protected abstract String operation2();

	protected abstract String operation3();
}
