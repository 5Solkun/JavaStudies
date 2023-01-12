package com.yedam.obj;

public class App {
public static void main(String[] args) {
	Student s1 = new Student();
	Student s2 = new Student();

	//dot 연산자
	
	System.out.println(s1);
	System.out.println(s2);
	
	s1.age=20;
	s1.name="예담";
	s1.schoolName="예담대";
	
	s1.getInfo();
	s2.getInfo();
}
}
