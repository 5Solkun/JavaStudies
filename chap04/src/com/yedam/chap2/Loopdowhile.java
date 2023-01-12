package com.yedam.chap2;

import java.util.Scanner;

public class Loopdowhile {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int month;
	do {
		month = sc.nextInt();
	}while(month<1||month>12);
	System.out.println("사용자가 입력한 월은"+month);
}
}
