package com.yedam.java.ch01_01;

public class SportsCar extends Car{
	public int speed;
	public final int maxSpeed=300;
	@Override
	public void speedUp() {
		speed+=10;
	}
	public final void carStop(){
		super.stop();
		System.out.println("스포츠카를멈춤");
		speed=0;
	}
}
