package com.yedam.ch02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("JDBC");
		set.add("server/jsp");
		set.add("DB");
		set.add("iBATIS");
		set.add("java");
		
		int size = set.size();
		System.out.println(size);
		System.out.println();
		
		Iterator<String> iterator =set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		System.out.println();
		
		set.remove("JDBC");
		set.remove("iBATIS");
		for(String skill : set) {
			System.out.println("\t"+skill);
		}
		System.out.println();
		set.clear();
		if(set.isEmpty())
			System.out.println("비어있음");
	}
}
