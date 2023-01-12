package com.yedam.reference;

public class Arry01 {
public static void main(String[] args) {
	int[] intAry = {1,2,3,4,5,6};
	int[] intAry2 = new int[6];

	
	String[] strAry = new String[10];
	System.out.println(intAry[0]);
	System.out.println(intAry2[5]);
	System.out.println(strAry[0]);
	
	int sum=0;
	int[] score = {12,34,56};
	for(int i=0 ; i<3; i++) {
		System.out.println(score[i]);
		sum += score[i];
	}
	System.out.println(sum);
	
	int[] point;
	point= new int[] {83,90,87};
	for(int i=0 ; i<3; i++) {
		System.out.println(point[i]);
		sum += point[i];
	}
	System.out.println(sum);
	
	int[] arr1= new int[3];
	arr1[0]=10;
	arr1[1]=20;
	arr1[2]=30;
	
	for(int i=0; i<3; i++) {
		System.out.println("arr1["+i+"]="+arr1[i]);
	}
	
	String[] arr3 = new String[3];
	arr3[0]="ar1";
	arr3[1]="222s";
	arr3[2]="33333s";
	
	for(int i=0; i<3; i++) {
		System.out.println("arr3["+i+"]="+arr3[i]);
	}
}
}
