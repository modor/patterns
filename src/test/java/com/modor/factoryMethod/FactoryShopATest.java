package com.modor.factoryMethod;

import org.junit.Test;

public class FactoryShopATest {

	@Test
	public void test() {
		assert (new FactoryShopA().createProduct("A1").equals("productA1"));
		assert (new FactoryShopA().createProduct("A2").equals("productA2"));
	}

}
