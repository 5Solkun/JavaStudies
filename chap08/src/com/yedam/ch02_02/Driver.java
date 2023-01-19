package com.yedam.ch02_02;

public class Driver {
	public void drive(Vehicle vehicle) {
		Bus bus = (Bus)vehicle;
		if(vehicle instanceof Bus) {
		bus.checkFare();
		vehicle.run();
		}
	}
	vehicle.run();
}
