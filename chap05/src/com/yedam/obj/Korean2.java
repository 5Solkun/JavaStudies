package com.yedam.obj;

public class Korean2 {

	String nation = "KR";
	String name;
	String ssn;
	
	Korean2(String name , String ssn){
		this.name  = name;
		this.ssn = ssn;
		
	}
	
	void info(){
		System.out.println(nation + name + ssn);
	}
}
