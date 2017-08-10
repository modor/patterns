package com.modor.bridge;

public abstract class AbstractRoad {
	AbstractCar car;
	public AbstractRoad(AbstractCar car){
		this.car = car;
	}
	abstract String speeding();  
}
