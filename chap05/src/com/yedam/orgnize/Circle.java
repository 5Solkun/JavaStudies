package com.yedam.orgnize;


public class Circle {
	static final double pi = 3.141592 ;
	//static =정적 공육
	//클래스파일 로딩시 정해짐
	//객체생성없이 클래스이름으로 접근가능
	double r;
	
	public Circle(){
		
	}
	
	Circle(double r){
		this.r = r;
	}
	
	public void setR(double r) {
		this.r = r;
	}

	public double area() {
		double result = pi*r*r;
		return result;
	}

}
