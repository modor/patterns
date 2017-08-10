package com.modor.bridge;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BridgeTest {
	
	@Test
	public void test(){
		assertEquals("drive bus on the street", new Street(new Bus()).speeding());
		assertEquals("drive truck on the street", new Street(new Truck()).speeding());
		assertEquals("drive bus on the speedway", new SpeedWay(new Bus()).speeding());
		assertEquals("drive truck on the speedway", new SpeedWay(new Truck()).speeding());
	}
}
