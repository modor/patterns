package io.modor.patterns.bridge;

public abstract class AbstractRoad {
	AbstractCar car;
	public AbstractRoad(AbstractCar car){
		this.car = car;
	}
	abstract String speeding();  
}
