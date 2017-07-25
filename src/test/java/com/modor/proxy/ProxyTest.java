package com.modor.proxy;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProxyTest {

	@Test
	public void testOperation() {
		assertEquals("HidedObject", new Proxy().operation());
	}

}
