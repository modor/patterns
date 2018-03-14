package io.modor.patterns.factorySimple;

public class Factory {
	public static BasicProduct getProduct(String type) {
		if (type.equals("productA")) {
			return new ProductA();
		} else if (type.equals("productB")) {
			return new ProductB();
		} else {
			throw new RuntimeException("没有该产品！");
		}
	}
}
