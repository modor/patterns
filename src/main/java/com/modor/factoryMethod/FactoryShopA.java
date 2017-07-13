package com.modor.factoryMethod;

public class FactoryShopA implements BasicFactoryShop {

	@Override
	public BasicProduct createProduct(String serial) {
		// TODO Auto-generated method stub
		if(serial.equals("A1")){
			return new ProductA1();
		}else if(serial.equals("A2")){
			return new ProductA2();
		}else{
			throw new RuntimeException("没有找到对象");
		}
	}

}
