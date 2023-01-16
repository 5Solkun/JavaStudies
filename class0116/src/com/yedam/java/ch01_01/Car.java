package com.yedam.java.ch01_01;

public class Car {
	public int speed;
	public final int maxSpeed=300;
	
	public void speedUp() {
		speed+=1;
	}
	public final void stop(){
		System.out.println("차를멈춤");
		speed=0;
	}
}
