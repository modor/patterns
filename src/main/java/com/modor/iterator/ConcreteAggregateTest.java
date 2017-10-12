package com.modor.iterator;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcreteAggregateTest {

	@Test
	public void test() {
		 Object[] objArray = {"One","Two","Three","Four","Five","Six"};
		 Aggregate agg = new ConcreteAggregate(objArray);
		 Iterator it = agg.iterator();
		 int size = 0;
		 while(it.hasNext()){
			size++;
		 }
		 assertEquals(6, size);
		 it.first();
		 assertEquals("One", it.next());
		 it.hasNext();
		 assertEquals("Two", it.next());
		 it.hasNext();
		 assertEquals("Three", it.next());
		 it.hasNext();
		 assertEquals("Four", it.next());
		 it.hasNext();
		 assertEquals("Five", it.next());
		 it.hasNext();
		 assertEquals("Six", it.next());
		 
	}

}
