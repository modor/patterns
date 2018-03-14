package io.modor.patterns.command;

import static org.junit.Assert.*;
import io.modor.patterns.command.ConcreteCommand;
import io.modor.patterns.command.ConcreteReciverA;
import io.modor.patterns.command.ConcreteReciverB;
import io.modor.patterns.command.Invoker;

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
