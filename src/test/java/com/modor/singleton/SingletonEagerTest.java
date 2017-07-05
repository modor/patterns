package com.modor.singleton;

import org.junit.Test;

public class SingletonEagerTest {

	@Test
	public void testGetInstance() {
		SingletonLazy s0 = SingletonLazy.getInstance();
		s0.setTestData(100);
		SingletonLazy s1 = SingletonLazy.getInstance();
		assert (s0.getTestData() == s1.getTestData());
	}
}
