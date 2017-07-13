package com.modor.factoryMethod;

import org.junit.Test;

public class FactoryShopBTest {

	@Test
	public void test() {
		assert (new FactoryShopB().createProduct("B1").equals("productB1"));
		assert (new FactoryShopB().createProduct("B2").equals("productB2"));
	}

}
