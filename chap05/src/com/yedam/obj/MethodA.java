package com.yedam.obj;

public class MethodA {
	int methodA() {
		return 0;
	}
	int methodA(int a) {
		return a;
	}
	int methodA(String a) {
		return 0;
	}
	int methodA(String a,int b) {
		return b;
	}
	// 정사각형의 넓이
	double areaSqare(double width) {
		return width*width;
	}
	//직사각형의 넓이
	double areaSqare(double width, double height) {
		return width*height;
	}
}

