package com.yedam.string;

public class TrimExam {
	public static void main(String[] args) {
		String data1 = "                  1234";
		String data2 = "      123     45123";
		String data3 = "1234      1353       ";
		
		System.out.println(data1.trim());
		System.out.println(data2.trim());
		System.out.println(data3.trim());
	}
}
