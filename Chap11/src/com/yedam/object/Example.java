package com.yedam.object;

import java.util.HashMap;
import java.util.Map;

public class Example {
	public static void main(String[] args) {
		Member m1= new Member("홍길동");
		Member m2= new Member("신동");
		Member m3= new Member("신동");
		
		if(m1==m2) {
			System.out.println("m1m2같다");
		}
		else {
			System.out.println("다름");
		}
		if(m3==m2) {
			System.out.println("m3m2같다");
		}
		else {
			System.out.println("다름");
		}
		
		
		if(m1.equals(m2)) {
			System.out.println("m1m2같다");
		}
		else {
			System.out.println("다름");
		}
		if(m3.equals(m2)) {
			System.out.println("m3m2같다");
		}
		else {
			System.out.println("다름");
		}
		
		Map<Key, String> hashMap = new HashMap<Key, String>();
		hashMap.put(new Key(1), "홍길동");
		
		String name = hashMap.get(new Key(1));
		System.out.println(name);
	}
}
