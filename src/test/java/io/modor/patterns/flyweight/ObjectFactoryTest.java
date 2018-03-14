package io.modor.patterns.flyweight;

import static org.junit.Assert.*;

import io.modor.patterns.flyweight.ImplObject;
import io.modor.patterns.flyweight.ObjectFactory;

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
