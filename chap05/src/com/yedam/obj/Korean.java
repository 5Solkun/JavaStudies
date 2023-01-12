package com.yedam.obj;

public class Korean {

	String nation = "KR";
	String name;
	String ssn;
	
	Korean(String n , String s){
		this.name = n;
		this.ssn = s;
		
	}
	
	void info(){
		System.out.println(nation + name + ssn);
	}
}
