package com.yedam.operator;

public class Loopfore2 {
public static void main(String[] args) {
	//구구단
//	for(int i=2;i<10;i++) {
//		System.out.println("\n");
//		for(int j=1;j<10;j++)
//		{
//			System.out.printf("%d x %d = %d\t",i,j,i*j);
//		}
//	}
	for(int i=0;i<10;i++) {
		System.out.printf("\n//");
		for(int j=10;j>i;j--)
		{
			System.out.printf("*");
		}
	}
}
}

