package com.modor.factorySimple;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactoryTest {

	@Test
	public void testGetProduct() {
		BasicProduct productA = Factory.getProduct("productA");
		BasicProduct productB = Factory.getProduct("productB");
		// BasicClass productC = Factory.getProduct("productC");
		assertEquals(productA.methodA(), "AA");
		assertEquals(productA.methodB(), "AB");
		assertEquals(productB.methodA(), "BA");
		assertEquals(productB.methodB(), "BB");
	}

}
