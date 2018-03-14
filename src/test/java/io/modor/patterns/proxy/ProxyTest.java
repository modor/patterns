package io.modor.patterns.proxy;

import static org.junit.Assert.*;
import io.modor.patterns.proxy.Proxy;

import org.junit.Test;

public class ProxyTest {

	@Test
	public void testOperation() {
		assertEquals("HidedObject", new Proxy().operation());
	}

}
