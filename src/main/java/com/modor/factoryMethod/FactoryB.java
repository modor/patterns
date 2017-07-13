package com.modor.factoryMethod;

public class FactoryB implements BasicFactory {

	@Override
	public BasicProduct createProduct() {
		// TODO Auto-generated method stub
		return new ProductB();
	}

}
