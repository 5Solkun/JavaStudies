package com.yedam.java.ch01_01;

public class Cellphone {
	String model;
	String color;
	public Cellphone(String model) {
		
	}
	void powerOn() {
		System.out.println("전원킴");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void sendVoice(String message) {
		System.out.println("발신자 : "+message);
	}
	void receiveVoice(String message) {
		System.out.println("수신자 : " + message);
	}
}
