package com.modor.factoryAbstract;

public class ConcreteProduct2 implements AssembleProduct {

	@Override
	public BasicProductA factoryA() {
		// TODO Auto-generated method stub
		return new ProductA2();
	}

	@Override
	public BasicProductB factoryB() {
		// TODO Auto-generated method stub
		return new ProductB2();
	}

}
