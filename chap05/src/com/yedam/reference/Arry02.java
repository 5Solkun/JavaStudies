package com.yedam.reference;

import java.util.Scanner;

public class Arry02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] point = new int[3];
	System.out.println("국어점수>");
	point[0]=Integer.parseInt(sc.nextLine());
	
	System.out.println("영어점수>");
	point[1]= Integer.parseInt(sc.nextLine());
	System.out.println("수학점수>");
	point[2]= Integer.parseInt(sc.nextLine());
	int sum=0;
	for(int i = 0; i<point.length;i++) {
		sum+=point[i];
	}
	System.out.println(sum);
	double avg= (float)sum/point.length;
	System.out.println("평균"+ avg);
}
}
