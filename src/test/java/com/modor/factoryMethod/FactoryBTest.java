package com.modor.factoryMethod;

import org.junit.Test;

public class FactoryBTest {

	@Test
	public void test() {
		assert (new FactoryB().createProduct().equals("productB"));
	}

}
