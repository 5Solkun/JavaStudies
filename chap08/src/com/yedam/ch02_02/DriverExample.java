package com.yedam.ch02_02;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Taxi());
		driver.drive(new Bus());
	}
}
