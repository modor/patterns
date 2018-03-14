package io.modor.patterns.factoryMethod;

public class FactoryShopB implements BasicFactoryShop {

	@Override
	public BasicProduct createProduct(String serial) {
		// TODO Auto-generated method stub
		if(serial.equals("B1")){
			return new ProductB1();
		}else if(serial.equals("B2")){
			return new ProductB2();
		}else{
			throw new RuntimeException("没有找到对象");
		}
	}

}
