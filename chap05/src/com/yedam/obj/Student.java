package com.yedam.obj;

public class Student {
	//필드, 객체의 속성(정보,데이터)가 저장되는 부분
	//이름
	String name;
	int age;
	String schoolName;
	int kor;
	int eng;
	int math;
	//생성자, 객체 초기화(생성)할 때 사용하는 부분
	//기본생성자 -> 생성하지 않아도 컴파일(실행) 자바에서 알아서 생성.
	Student(){
//		System.out.println("객체생성중");
	}
	//메소드, 객체를 생성 후 기능을 사용할때 정의하는 부분
	void getInfo() {
		System.out.println("학생의 이름: " +name);
		System.out.println("학생의 나이: " +age);
		System.out.println("학생의 학교: " +schoolName);
		System.out.println("국어: " +kor);
		System.out.println("영어: " +eng);
		System.out.println("수학: " +math);
	}
} 
