package com.modor.command;

import static org.junit.Assert.*;
import org.junit.Test;

public class InvokerTest {

	@Test
	public void test() {
		Invoker invoker = new Invoker();
		invoker.setCommand(new ConcreteCommand(new ConcreteReciverA()));
		assertEquals("ConcreteReciverA", invoker.runCommand());
		invoker.setCommand(new ConcreteCommand(new ConcreteReciverB()));
		assertEquals("ConcreteReciverB", invoker.runCommand());
	}

}
