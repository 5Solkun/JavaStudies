package com.yedam.obj;

public class Exbooks {
public static void main(String[] args) {

	Book 혼공자= new Book("혼공자","학습서",24000,"한빛미디어","yedam-001");
	Book book2= new Book("이것이 리눅스다","학습서",32000,"한빛미디어","yedam-002");
	Book book3= new Book("이것이 클래스다","소설",14000,"빛한미디어","yedam-003");

	
	혼공자.info();
	book2.info();
	book3.info();
}
}
