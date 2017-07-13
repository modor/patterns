package com.modor.factoryMethod;

public class FactoryA implements BasicFactory {

	@Override
	public BasicProduct createProduct() {
		// TODO Auto-generated method stub
		return new ProductA();
	}

}
