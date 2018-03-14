package io.modor.patterns.factoryMethod;

import static org.junit.Assert.assertEquals;
import io.modor.patterns.factoryMethod.FactoryShopB;

import org.junit.Test;

public class FactoryShopBTest {

	@Test
	public void test() {
		assertEquals(new FactoryShopB().createProduct("B1").produceProduct(),
				"productB1");
		assertEquals(new FactoryShopB().createProduct("B2").produceProduct(),
				"productB2");
	}

}
