package io.modor.patterns.factoryMethod;

import static org.junit.Assert.assertEquals;
import io.modor.patterns.factoryMethod.FactoryShopA;

import org.junit.Test;

public class FactoryShopATest {

	@Test
	public void test() {
		assertEquals(new FactoryShopA().createProduct("A1").produceProduct(),
				"productA1");
		assertEquals(new FactoryShopA().createProduct("A2").produceProduct(),
				"productA2");
	}

}
