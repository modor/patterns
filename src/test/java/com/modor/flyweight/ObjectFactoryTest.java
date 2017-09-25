package com.modor.flyweight;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Test;

public class ObjectFactoryTest {

	@Test
	public void test() {
		String id = UUID.randomUUID().toString().replace("-", "");
		ImplObject baseObject = (ImplObject) ObjectFactory.getCircle(id);
		baseObject.setData(456);
		ImplObject baseObject2 = (ImplObject) ObjectFactory.getCircle(id);
		assertEquals(baseObject.getData(), baseObject2.getData());
	}

}
