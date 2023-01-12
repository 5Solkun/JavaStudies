package com.yedam.reference;

import java.util.Scanner;

public class Arry03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int[] ary;
	int no;
	
	System.out.println("배열의 크기>");
	no = Integer.parseInt(sc.nextLine());
	ary= new int[no];
	
	System.out.println(ary.length);
	for(int i = 0; i<ary.length;i++) {
		System.out.println("입력>");
		ary[i]=Integer.parseInt(sc.nextLine());
	}
//	for(int i = 0; i<ary.length;i++) {
//		System.out.println(ary[i]);
//	}
//	
	
	
	int max=0;
	int min=0;
	for(int i = 0; i<ary.length;i++) {
		if(i==0) {
			min=ary[i];
			max=ary[i];
		}
		else
		{
			if(ary[i]>max)
				max=ary[i];
			else if(ary[i]<min)
				min=ary[i];
		}
		

	}
	System.out.printf("최대:%d 최소:%d",max,min);
}
}
