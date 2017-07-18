package com.modor.bulider;

public class BuilderASpec implements Builder {

	private Product product = new Product();

	@Override
	public void buildPart1() {
		// TODO Auto-generated method stub
		product.setPart1("ASPEC1");
	}

	@Override
	public void buildPart2() {
		// TODO Auto-generated method stub
		product.setPart2("ASPEC2");
	}

	@Override
	public void buildPart3() {
		// TODO Auto-generated method stub
		product.setPart3("ASPEC3");
	}

	@Override
	public Product retrieveResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
