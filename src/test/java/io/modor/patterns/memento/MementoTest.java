package io.modor.patterns.memento;

import static org.junit.Assert.*;
import io.modor.patterns.memento.MementoKeeper;
import io.modor.patterns.memento.MementoManager;

import org.junit.Test;

public class MementoTest {

	@Test
	public void test() {
		MementoManager mementoManager = new MementoManager();
		mementoManager.setValue(1, 2);
		MementoKeeper mementoKeeper = new MementoKeeper();
		mementoKeeper.setMemento(mementoManager.createMemento());

		mementoManager.setValue(3, 4);
		mementoManager.recoverMemento(mementoKeeper.getMemento());

		assertEquals(1, mementoManager.getValue1());
		assertEquals(2, mementoManager.getValue2());

	}

}
