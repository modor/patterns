package io.modor.patterns.facade;

public class Facade {

	private Department1 department1 = new Department1();
	private Department2 department2 = new Department2();

	public String operation1() {
		return department1.operation1() + department2.operation1();
	}

	public String operation2() {
		return department1.operation2() + department2.operation2();
	}
}
