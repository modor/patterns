package io.modor.patterns.adapter;

import static org.junit.Assert.*;
import io.modor.patterns.adapter.Adapter;

import org.junit.Test;

public class AdapterTest {

	@Test
	public void teststandardOperation() {
		assertEquals("ownInterface", new Adapter().standardOperation());
	}

}
