package io.modor.patterns.observer;

import static org.junit.Assert.*;
import io.modor.patterns.observer.ConcreteObserverA;
import io.modor.patterns.observer.ConcreteObserverB;
import io.modor.patterns.observer.ConcreteObserverC;
import io.modor.patterns.observer.Subject;

import org.junit.Test;

public class SubjectTest {

	@Test
	public void test() {
		Subject subject = new Subject();
		ConcreteObserverA concreteObserverA = new ConcreteObserverA();
		ConcreteObserverB concreteObserverB = new ConcreteObserverB();
		ConcreteObserverC concreteObserverC = new ConcreteObserverC();
		subject.addObserver(concreteObserverA);
		subject.addObserver(concreteObserverB);
		subject.addObserver(concreteObserverC);
		subject.setChange("change");
		subject.notifyObservers();
		assertEquals("change", concreteObserverA.getState());
		assertEquals("change", concreteObserverB.getState());
		assertEquals("change", concreteObserverC.getState());
	}

}
