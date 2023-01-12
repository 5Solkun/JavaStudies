package com.yedam.obj;

public class Student {
	//필드, 객체의 속성(정보,데이터)가 저장되는 부분
	//이름
	String name;
	int age;
	String schoolName;
	//생성자, 객체 초기화(생성)할 때 사용하는 부분
	Student(){

	}
	//메소드, 객체를 생성 후 기능을 사용할때 정의하는 부분
	void getInfo() {
		System.out.println("학생의 이름: " +name);
		System.out.println("학생의 나이: " +age);
		System.out.println("학생의 학교: " +schoolName);
	}
}
