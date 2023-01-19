package com.yedam.test;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("대기열에서 상담전화를가져옵니다");

	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("쉬고 있거나 대기가 가장 적은 상담원에게 할당");
	}

}
