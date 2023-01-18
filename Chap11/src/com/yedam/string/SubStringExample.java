package com.yedam.string;

public class SubStringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum=ssn.substring(0,6);
		System.out.println("생년월일 : " + firstNum);
		
		String secondnum = ssn.substring(7);
		System.out.println("개인정보 : " + secondnum);
		
		String[] numList = ssn.split("-");
		for(String num: numList) {
			System.out.println(num);
		}
		
	}
}
