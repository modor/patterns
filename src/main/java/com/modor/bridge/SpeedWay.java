package com.modor.bridge;

public class SpeedWay extends AbstractRoad {

	public SpeedWay(AbstractCar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	@Override
	String speeding() {
		// TODO Auto-generated method stub
		return car.drive() + "on the speedway";
	}

}
