package com.yedam.ch01_01;

public class TV implements RemoteControl {
	private int volume;
	@Override
	public void TurnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV켬");
	}

	@Override
	public void TurnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV끔");
	}

	@Override
	public void Volume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VALUE) {
			this.volume=RemoteControl.MAX_VALUE;
		}
		else if(volume<RemoteControl.MIN_VALUE) {
			this.volume = RemoteControl.MIN_VALUE;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 :" + volume);
	}

}
