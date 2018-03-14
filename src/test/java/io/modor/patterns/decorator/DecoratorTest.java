package io.modor.patterns.decorator;

import static org.junit.Assert.*;
import io.modor.patterns.decorator.Component;
import io.modor.patterns.decorator.Decorator;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void testOperation() {
		assertEquals("DecoratorComponent",
				new Decorator(new Component()).operation());
	}

}
