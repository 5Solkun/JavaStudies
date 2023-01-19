package com.yedam.ch02_01;

public class PromotionExample {
	public static void main(String[] args) {
		D d = new D();
		d.mathod1();
		d.mathod2();
		d.mathod3();
		
		B b = new B();
		b.mathod1();
		b.mathod2();
		System.out.println();
		
		A a1= b;
		a1.mathod1();
		System.out.println();
		
		A a2 =d;
		a2.mathod1();
		
	}
}
