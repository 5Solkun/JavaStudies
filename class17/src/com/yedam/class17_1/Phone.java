package com.yedam.class17_1;

public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner =owner;
	}
	
	public void turnOn() {
		System.out.println("전원 킴");
	}
	public void turnOff() {
		System.out.println("전원 끔");
	}
}
