package io.modor.patterns.flyweight;

import java.util.HashMap;

public class ObjectFactory {
	private static final HashMap<String, BaseObject> objectMap = new HashMap<String, BaseObject>();

	public static BaseObject getCircle(String id) {
		BaseObject object = (ImplObject) objectMap.get(id);

		if (object == null) {
			object = new ImplObject(id);
			objectMap.put(id, object);
		}
		return object;
	}
}
