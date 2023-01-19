package com.yedam.test;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("대기열에서 상담전화를가져옵니다");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("우선순위가 높은 고객 먼저 할당 ");
	}

}
