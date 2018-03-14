package io.modor.patterns.factoryAbstract;

import static org.junit.Assert.assertEquals;
import io.modor.patterns.factoryAbstract.ConcreteProduct2;

import org.junit.Test;

public class ConcreteProduct2Test {

	@Test
	public void test() {
		assertEquals(new ConcreteProduct2().factoryA().produceProduct(),
				"productA2");
		assertEquals(new ConcreteProduct2().factoryB().produceProduct(),
				"productB2");
	}

}
