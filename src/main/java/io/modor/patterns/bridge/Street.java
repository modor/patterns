package io.modor.patterns.bridge;

public class Street extends AbstractRoad {

	public Street(AbstractCar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	@Override
	String speeding() {
		// TODO Auto-generated method stub
		return car.drive() + "on the street";
	}

}
