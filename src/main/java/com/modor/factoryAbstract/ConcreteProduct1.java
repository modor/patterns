package com.modor.factoryAbstract;

public class ConcreteProduct1 implements AssembleProduct {

	@Override
	public BasicProductA factoryA() {
		// TODO Auto-generated method stub
		return new ProductA1();
	}

	@Override
	public BasicProductB factoryB() {
		// TODO Auto-generated method stub
		return new ProductB1();
	}

}
