package com.yedam.list;


import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("JDBC");
		list.add("server/jsp");
		list.add(2,"DB");
		list.add("iBATIS");
		
		
		//Java JDBC Servlet/JSP
		list.add("java");
		int size = list.size();
		System.out.println(size);
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i = 0; i< list.size();i++) {
			System.out.printf("%d : %s\n" ,i, list.get(i));
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		
		for(int i = 0; i< list.size();i++) {
			System.out.printf("%d : %s\n" ,i, list.get(i));
		}
		System.out.println();
	}
}