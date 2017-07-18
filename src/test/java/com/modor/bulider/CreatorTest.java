package com.modor.bulider;

import org.junit.Test;

public class CreatorTest {

	@Test
	public void test() {
		Builder builderA = new BuilderASpec();
		Creator creatorA = new Creator(builderA);
		creatorA.construct();
		assert (builderA.retrieveResult().getPart1() =="ASPEC1");
		assert (builderA.retrieveResult().getPart2() =="ASPEC2");
		assert (builderA.retrieveResult().getPart3() =="ASPEC3");
		
		Builder builderB = new BuilderBSpec();
		Creator creatorB = new Creator(builderB);
		creatorB.construct();
		assert (builderB.retrieveResult().getPart1() =="BSPEC1");
		assert (builderB.retrieveResult().getPart2() =="BSPEC2");
		assert (builderB.retrieveResult().getPart3() =="BSPEC3");
	}

}
