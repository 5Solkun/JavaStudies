package com.yedam.ch01_01;

public class SmartTVExample {
public static void main(String[] args) {
	SmartTV tv =new SmartTV();
	
	tv.TurnOn();
	tv.TurnOff();
	tv.search("URLULRULR");
	tv.Volume(100);
	tv.Volume(5);
	tv.Volume(-1);

	RemoteControl rc =tv;
	Searchable searchable = tv;
}
}
