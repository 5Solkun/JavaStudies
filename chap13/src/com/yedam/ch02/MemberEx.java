package com.yedam.ch02;

import java.util.HashSet;
import java.util.Set;

public class MemberEx {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member(1000, "홍길동"));
		set.add(new Member(1000, "홍길동"));
		System.out.println("총 객체수 :" + set.size());
	}
}
