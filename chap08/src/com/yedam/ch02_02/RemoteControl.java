package com.yedam.ch02_02;

public interface RemoteControl {
	//상수
	public int MAX_VALUE =10;
	public int MIN_VALUE=0; //상수값이라 초기값 필수
	//추상 메소드
	public void TurnOn();//인터페이스에서 아무것도 안적으면 추상메소드래
	public void TurnOff();
	public void Volume(int x);
	public default void method() {
		System.out.println("일반메소드입니다");//일반메소드는 default로 명시해줘야함
	}
	//
}
