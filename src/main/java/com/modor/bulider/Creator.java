package com.modor.bulider;

public class Creator {

	private Builder builder;

	public Creator(Builder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.buildPart1();
		builder.buildPart2();
		builder.buildPart3();
	}
}
