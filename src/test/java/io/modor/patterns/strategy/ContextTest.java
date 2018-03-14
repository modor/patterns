package io.modor.patterns.strategy;

import static org.junit.Assert.*;
import io.modor.patterns.strategy.ConcreteStrategyA;
import io.modor.patterns.strategy.ConcreteStrategyB;
import io.modor.patterns.strategy.ConcreteStrategyC;
import io.modor.patterns.strategy.Context;

import org.junit.Test;

public class ContextTest {

	@Test
	public void test() {
		assertEquals("StrategyA",
				new Context(new ConcreteStrategyA()).operation());
		assertEquals("StrategyB",
				new Context(new ConcreteStrategyB()).operation());
		assertEquals("StrategyC",
				new Context(new ConcreteStrategyC()).operation());
	}

}
