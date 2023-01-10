package com.yedam.operator;

public class Operator {
	public static void main(String[] args) {
		int num=0;
		System.out.println(num++);
		System.out.println(++num);
		System.out.println(num--);
		System.out.println(--num);
		boolean play = true;
		
		System.out.println(play);
		play=!play;
		System.out.println(play);
		
		int n1= 10;
		int n2= 10;
		System.out.println(n1==n2);
		System.out.println(n1!=n2);
		System.out.println(n1<=n2);
		
		char c1 = 'A';
		char c2 = 'B';
		
		System.out.println(c1<c2);
	}
}
