package com.modor.factoryAbstract;

import org.junit.Test;

public class ConcreteProduct2Test {

	@Test
	public void test() {
		assert (new ConcreteProduct2().factoryA().equals("A2"));
		assert (new ConcreteProduct2().factoryB().equals("B2"));
	}

}
