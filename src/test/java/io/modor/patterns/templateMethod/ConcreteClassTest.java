package io.modor.patterns.templateMethod;

import static org.junit.Assert.*;
import io.modor.patterns.templateMethod.ConcreteClass;

import org.junit.Test;

public class ConcreteClassTest {

	@Test
	public void test() {
		assertEquals("operaion1operaion2operaion3",
				new ConcreteClass().operation());
	}

}
