package com.modor.factorySimple;

import junit.framework.Assert;

import org.junit.Test;

public class FactoryTest {

	@Test
	public void testGetProduct() {
		BasicProduct productA = Factory.getProduct("productA");
		BasicProduct productB = Factory.getProduct("productB");
		// BasicClass productC = Factory.getProduct("productC");
		assert (productA.methodA().equals("AA"));
		assert (productA.methodB().equals("AB"));
		assert (productB.methodA().equals("BA"));
		assert (productB.methodB().equals("BB"));
	}

}
