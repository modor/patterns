package com.modor.prototype;

public class ShallowCopy implements Cloneable{

	private String str1;
	private String str2;
	private BeReferClass beRefer;
	/**
	 * @return the beRefer
	 */
	public BeReferClass getBeRefer() {
		return beRefer;
	}
	/**
	 * @param beRefer the beRefer to set
	 */
	public void setBeRefer(BeReferClass beRefer) {
		this.beRefer = beRefer;
	}
	/**
	 * @return the str1
	 */
	public String getStr1() {
		return str1;
	}
	/**
	 * @param str1 the str1 to set
	 */
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	/**
	 * @return the str2
	 */
	public String getStr2() {
		return str2;
	}
	/**
	 * @param str2 the str2 to set
	 */
	public void setStr2(String str2) {
		this.str2 = str2;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
