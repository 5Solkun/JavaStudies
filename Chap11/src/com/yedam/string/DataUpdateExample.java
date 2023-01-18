package com.yedam.string;

public class DataUpdateExample {
	public static void main(String[] args) {
		String oldstr = " 자바는 어쩌구저쩌구 뭐시라뭣시라";
		String newstr = oldstr.replace("자바","JAVA");
		
		System.out.println(oldstr);
		System.out.println(newstr);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java");
		sb.append("프로그램 스터디");
		System.out.println(sb.toString());
		
		sb.insert(4, "24");
		System.out.println(sb.toString());
		
		sb.replace(7,14, "book");
		System.out.println(sb.toString());
		
		String result = sb.toString();
		sb.delete(0, 4);
		System.out.println(result);
		System.out.println(sb);
	}
}
