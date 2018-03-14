package io.modor.patterns.chain;

import static org.junit.Assert.*;
import io.modor.patterns.chain.ConcreteHandler1;
import io.modor.patterns.chain.ConcreteHandler2;
import io.modor.patterns.chain.Handler;

import org.junit.Test;

public class HandlerTest {

	@Test
	public void test() {
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		assertEquals("handler1", handler1.doHandler());
		handler1.setNextHandler(handler2);
		assertEquals("handler2", handler1.doHandler());
	}

}
