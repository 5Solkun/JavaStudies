package com.yedam.ch02_02;

public class SmartTV implements RemoteControl, Searchable {
	private int volume;

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "검색");
	}

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
		if (volume > RemoteControl.MAX_VALUE) {
			this.volume = RemoteControl.MAX_VALUE;
		} else if (volume < RemoteControl.MIN_VALUE) {
			this.volume = RemoteControl.MIN_VALUE;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 :" + this.volume);
	}

}
