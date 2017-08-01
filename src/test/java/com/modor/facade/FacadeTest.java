package com.modor.facade;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FacadeTest {

	private Facade facade;

	@Before
	public void initFacade() {
		facade = new Facade();
	}

	@Test
	public void testOperation1() {
		assertEquals("Department1-operation1Department2-operation1",
				facade.operation1());
	}

	@Test
	public void testOperation2() {
		assertEquals("Department1-operation2Department2-operation2",
				facade.operation2());
	}
}
