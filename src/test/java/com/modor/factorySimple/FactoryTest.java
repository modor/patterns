package com.modor.factorySimple;

import junit.framework.Assert;

import org.junit.Test;

public class FactoryTest {

	@Test
	public void testGetProduct() {
		BasicClass productA = Factory.getProduct("productA");
		BasicClass productB = Factory.getProduct("productB");
		// BasicClass productC = Factory.getProduct("productC");
		assert (productA.methodA().equals("AA"));
		assert (productA.methodB().equals("AB"));
		assert (productB.methodA().equals("BA"));
		assert (productB.methodB().equals("BB"));
	}

}
