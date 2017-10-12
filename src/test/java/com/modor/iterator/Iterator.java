package com.modor.iterator;

public interface Iterator {
	/**
	 * 迭代方法：移动到第一个元素
	 */
	public void first();

	/**
	 * 迭代方法：移动到下一个元素
	 */
	public Object next();

	/**
	 * 迭代方法：是否为最后一个元素
	 */
	public boolean hasNext();

}
