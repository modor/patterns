package com.modor.factoryAbstract;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConcreteProduct1Test {

	@Test
	public void test() {
		assertEquals(new ConcreteProduct1().factoryA().produceProduct(),
				"productA1");
		assertEquals(new ConcreteProduct1().factoryB().produceProduct(),
				"productB1");
	}

}
