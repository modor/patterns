package io.modor.patterns.prototype;

import static org.junit.Assert.*;
import io.modor.patterns.prototype.BeReferClass;
import io.modor.patterns.prototype.DeepCopy;

import org.junit.Test;

public class DeepCopyTest {

	@Test
	public void test() throws CloneNotSupportedException {
		DeepCopy deep = new DeepCopy();
		BeReferClass beReferClass = new BeReferClass();
		beReferClass.setAttr1("attr1");
		beReferClass.setAttr2("attr2");
		deep.setStr1("str1");
		deep.setStr2("str2");
		deep.setBeRefer(beReferClass);
		DeepCopy deepCopy = (DeepCopy)deep.clone();
		assertNotSame(deep, deepCopy);
		assertNotSame(deep.getBeRefer(), deepCopy.getBeRefer());
	}

}
