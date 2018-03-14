package io.modor.patterns.bulider;

public interface Builder {
	public void buildPart1();

	public void buildPart2();

	public void buildPart3();

	public Product retrieveResult();
}
