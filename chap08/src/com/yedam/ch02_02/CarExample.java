package com.yedam.ch02_02;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		myCar.FLT =new KumhoTire();
		myCar.FRT =new KumhoTire();
		myCar.BLT =new KumhoTire();
		myCar.BRT =new KumhoTire();
		myCar.run();
		
	}
}
