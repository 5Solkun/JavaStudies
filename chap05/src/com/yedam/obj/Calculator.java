package com.yedam.obj;

public class Calculator {

	
	int sum(int a, int b) {
		return a+b;
	}
	
	double sub(int a, int b) {
		return a-b;
	}
	String result(String value) {
		String temp = "value 테스트" +value;
		return temp;
	}
	void poweron() {
		System.out.println("전원켜짐");
	}
	void poweroff() {
		System.out.println("전원꺼짐");
	}
	//매개변수 정확한갯수 모를때
	int sum2(int ...values) {
		int total=0;
		for(int a : values) {
		total += a;
		}
		return total;
	}
	
	
	
}
