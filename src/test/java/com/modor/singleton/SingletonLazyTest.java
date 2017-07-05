package com.modor.singleton;

import org.junit.Test;

public class SingletonLazyTest {

	@Test
	public void testGetInstance() {
		SingletonEager s2 = SingletonEager.getInstance();
		s2.setTestData(101);
		SingletonEager s3 = SingletonEager.getInstance();
		assert (s2.getTestData() == s3.getTestData());
	}
}
