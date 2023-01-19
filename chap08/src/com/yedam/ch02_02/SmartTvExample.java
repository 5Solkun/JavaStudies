package com.yedam.ch02_02;

public class SmartTvExample {
public static void main(String[] args) {
	SmartTV tv = new SmartTV();
	RemoteControl rc = tv;
	rc.TurnOff();
	
	Searchable searchable = tv;
	searchable.search("다음");
	
	SmartTV smartTV = tv;
	smartTV.search("구글");
}
}
