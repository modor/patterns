package io.modor.patterns.bulider;

public class BuilderBSpec implements Builder {

	private Product product = new Product();

	@Override
	public void buildPart1() {
		// TODO Auto-generated method stub
		product.setPart1("BSPEC1");
	}

	@Override
	public void buildPart2() {
		// TODO Auto-generated method stub
		product.setPart2("BSPEC2");
	}

	@Override
	public void buildPart3() {
		// TODO Auto-generated method stub
		product.setPart3("BSPEC3");
	}

	@Override
	public Product retrieveResult() {
		// TODO Auto-generated method stub
		return product;
	}
	

}
