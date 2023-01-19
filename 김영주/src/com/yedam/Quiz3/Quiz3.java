package com.yedam.Quiz3;

public class Quiz3 {
	public static void main(String[] args) {
		int[] coinUnit = new int[4];
		int money = 2680;
		System.out.println("money="+money);
		coinUnit[0] = 500;
		coinUnit[1] = 100;
		coinUnit[2] = 50;
		coinUnit[3] = 10;
		for(int i = 0; i<coinUnit.length;i++) {
			System.out.printf("%d원 : %d 개 |  ",coinUnit[i],money/coinUnit[i]);
			money%=coinUnit[i];	
	}
}}
