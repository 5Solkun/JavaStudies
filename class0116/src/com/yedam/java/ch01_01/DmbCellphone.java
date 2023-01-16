package com.yedam.java.ch01_01;

public class DmbCellphone extends Cellphone{
	//필드
	int channel;
	String model;
	//생성자
	public DmbCellphone(String model, String color, int channel) {
		super(model);
		//this.model = model;
		this.color = color;
		this.channel =channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널"+channel+"번DMB 방송수신");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널"+channel+"번으로 변경");
	}
	void turnOffDmb() {
		System.out.println("DMB방송 수신을 멈춥니다");
	}
}
