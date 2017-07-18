package com.modor.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingletonEagerTest {

	@Test
	public void testGetInstance() {
		SingletonLazy s0 = SingletonLazy.getInstance();
		s0.setTestData(100);
		SingletonLazy s1 = SingletonLazy.getInstance();
		assertEquals(s0.getTestData(), s1.getTestData());
	}
}
