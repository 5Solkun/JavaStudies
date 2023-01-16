package com.yedam.block;

public class Circle2 {
	static  double pi ;
	//static =정적 공육
	//클래스파일 로딩시 정해짐
	//객체생성없이 클래스이름으로 접근가능
	double r;
	
	Circle2(){
		
	}
	
	Circle2(double r){
		this.r = r;
	}
	
	double area() {
		double result = pi*r*r;
		return result;
	}
	double test() {
		double result = pi;
		return result;
	}
}
