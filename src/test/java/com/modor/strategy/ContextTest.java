package com.modor.strategy;

import static org.junit.Assert.*;

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
