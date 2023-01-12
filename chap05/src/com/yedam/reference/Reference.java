package com.yedam.reference;

public class Reference {
	
	public static void main(String[] args) {
		int intVal =10;
		int[] array = {1,2,3,4,5,6};
		int[] array2 = {1,2,3,4,5,6};
		
		int[] array3=null;
		
		System.out.println(array);
		System.out.println(array2);
		System.out.println(array==array2);
		System.out.println(intVal);
		System.out.println(array3);	
		
		
		String n1 = new String("ㅇㅈ");
		String n2 = new String("ㅇㅈ");
		String n3 = "ㅇㅈ";
		String n4 = "ㅇㅈ";
		System.out.println(n1==n2);
		System.out.println(n2==n3);
		System.out.println(n3==n4?"같다":"다르다");
		System.out.println(n1.equals(n4)?"같다":"다르다");
		n3="ww";
		System.out.println(n4);
		System.out.println(n3);
		System.out.println(n3==n4?"같다":"다르다");
		n3="ㅇㅈ";
		System.out.println(n3==n4?"같다":"다르다");
	}
}
