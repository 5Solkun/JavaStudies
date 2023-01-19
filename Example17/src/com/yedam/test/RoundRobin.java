package com.yedam.test;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("대기열에서 상담전화를가져옵니다");

	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("한명씩 차례로 할당");
	}

}
