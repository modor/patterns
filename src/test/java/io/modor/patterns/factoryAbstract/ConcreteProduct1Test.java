package io.modor.patterns.factoryAbstract;

import static org.junit.Assert.assertEquals;
import io.modor.patterns.factoryAbstract.ConcreteProduct1;

import org.junit.Test;

public class ConcreteProduct1Test {

	@Test
	public void test() {
		assertEquals(new ConcreteProduct1().factoryA().produceProduct(),
				"productA1");
		assertEquals(new ConcreteProduct1().factoryB().produceProduct(),
				"productB1");
	}

}
