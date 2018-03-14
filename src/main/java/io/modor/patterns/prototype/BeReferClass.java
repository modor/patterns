package io.modor.patterns.prototype;

public class BeReferClass implements Cloneable{

	private String attr1;
	private String attr2;
	/**
	 * @return the attr1
	 */
	public String getAttr1() {
		return attr1;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	/**
	 * @param attr1 the attr1 to set
	 */
	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}
	/**
	 * @return the attr2
	 */
	public String getAttr2() {
		return attr2;
	}
	/**
	 * @param attr2 the attr2 to set
	 */
	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}
}
