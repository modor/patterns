package com.modor.factoryMethod;

import org.junit.Test;

public class FactoryATest {

	@Test
	public void test() {
		assert (new FactoryA().createProduct().equals("productA"));
	}

}
