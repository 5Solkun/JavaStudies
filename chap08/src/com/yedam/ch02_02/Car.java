package com.yedam.ch02_02;

public class Car {
	Tire FLT = new HankookTire();
	Tire FRT = new HankookTire();
	Tire BLT = new HankookTire();
	Tire BRT = new HankookTire();
	
	public void run() {
		FLT.roll();
		FRT.roll();
		BLT.roll();
		BRT.roll();
		
	}
}
