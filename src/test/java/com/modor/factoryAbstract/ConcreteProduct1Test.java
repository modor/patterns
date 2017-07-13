package com.modor.factoryAbstract;

import org.junit.Test;

public class ConcreteProduct1Test {

	@Test
	public void test() {
		assert (new ConcreteProduct1().factoryA().equals("A1"));
		assert (new ConcreteProduct1().factoryB().equals("B1"));
	}

}
