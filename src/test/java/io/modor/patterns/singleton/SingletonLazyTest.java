package io.modor.patterns.singleton;

import static org.junit.Assert.assertEquals;
import io.modor.patterns.singleton.SingletonEager;

import org.junit.Test;

public class SingletonLazyTest {

	@Test
	public void testGetInstance() {
		SingletonEager s2 = SingletonEager.getInstance();
		s2.setTestData(101);
		SingletonEager s3 = SingletonEager.getInstance();
		assertEquals(s2.getTestData(), s3.getTestData());
	}
}
