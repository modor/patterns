package com.modor.decorator;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void testOperation() {
		assertEquals("DecoratorComponent",
				new Decorator(new Component()).operation());
	}

}
