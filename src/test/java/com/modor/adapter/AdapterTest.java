package com.modor.adapter;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdapterTest {

	@Test
	public void teststandardOperation() {
		assertEquals("ownInterface", new Adapter().standardOperation());
	}

}
