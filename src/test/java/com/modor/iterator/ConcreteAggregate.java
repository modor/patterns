package com.modor.iterator;

public class ConcreteAggregate extends Aggregate {

	private Object[] objArray = null;

	public ConcreteAggregate(Object[] objArray) {
		this.objArray = objArray;
	}

	@Override
	public Iterator iterator() {

		return new ConcreteIterator(this);
	}

	/**
	 * 取值方法：向外界提供聚集元素
	 */
	public Object getElement(int index) {

		if (index < objArray.length) {
			return objArray[index];
		} else {
			return null;
		}
	}

	/**
	 * 取值方法：向外界提供聚集的大小
	 */
	public int size() {
		return objArray.length;
	}
}
