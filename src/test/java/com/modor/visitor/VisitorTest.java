package com.modor.visitor;

import static org.junit.Assert.*;

import org.junit.Test;

public class VisitorTest {

	@Test
	public void test() {
		Service service0 = new Service0();
		Service service1 = new Service1();
		Service service2 = new Service2();
		Visitor visitor = new Visitor();
		assertEquals("service0", service0.accept(visitor));
		assertEquals("service1", service1.accept(visitor));
		assertEquals("service2", service2.accept(visitor));

	}

}
