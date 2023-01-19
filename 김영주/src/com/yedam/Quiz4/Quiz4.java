package com.yedam.Quiz4;

public class Quiz4 {
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			System.out.println();
			for(int j = 1; j<=i; j++) {
				System.out.printf("%d X %d = %d \t",i,j,i*j);
			}
		}
	}
}
