package com.modor.bulider;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CreatorTest {

	@Test
	public void test() {
		Builder builderA = new BuilderASpec();
		Creator creatorA = new Creator(builderA);
		creatorA.construct();
		assertEquals(builderA.retrieveResult().getPart1(), "ASPEC1");
		assertEquals(builderA.retrieveResult().getPart2(), "ASPEC2");
		assertEquals(builderA.retrieveResult().getPart3(), "ASPEC3");

		Builder builderB = new BuilderBSpec();
		Creator creatorB = new Creator(builderB);
		creatorB.construct();
		assertEquals(builderB.retrieveResult().getPart1(), "BSPEC1");
		assertEquals(builderB.retrieveResult().getPart2(), "BSPEC2");
		assertEquals(builderB.retrieveResult().getPart3(), "BSPEC3");
	}

}
