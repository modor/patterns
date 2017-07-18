package com.modor.prototype;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShallowCopyTest {

	@Test
	public void test() throws CloneNotSupportedException {
		ShallowCopy shallow = new ShallowCopy();
		BeReferClass beReferClass = new BeReferClass();
		beReferClass.setAttr1("attr1");
		beReferClass.setAttr2("attr2");
		shallow.setStr1("str1");
		shallow.setStr2("str2");
		shallow.setBeRefer(beReferClass);
		ShallowCopy shallowCopy = (ShallowCopy)shallow.clone();
		assertNotSame(shallow, shallowCopy);
		assertEquals(shallow.getBeRefer(), shallowCopy.getBeRefer());
	}

}
