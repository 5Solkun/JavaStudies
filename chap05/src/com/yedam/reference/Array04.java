package com.yedam.reference;

import java.util.Arrays;

public class Array04 {
public static void main(String[] args) {
	int[][] intary = {{1,2},{1,2,3}};

	int[][]mathScore = new int[2][3];
	for(int i = 0; i<mathScore.length;i++) {
		System.out.println(mathScore.length);
		for(int k = 0 ; k<mathScore[i].length; k++) {
			System.out.println("mathScore["+i+"] ["+k+"]=" + mathScore[i][k]);
		}
	}

	for(int i = 0; i<intary.length;i++) {
		System.out.println(intary.length);
		for(int k = 0 ; k<intary[i].length; k++) {
			System.out.println("intary["+i+"] ["+k+"]=" + intary[i][k]);
		}
	}
	
	int[][] gugu = new int[8][9];
	
	for(int i=2;i<10;i++) {
		for(int j =1;j<10;j++) {
			gugu[i-2][j-1]=i*j;
		}
	}
	for(int i = 0; i<gugu.length;i++) {
		System.out.println((i+2)+":단");
		System.out.println(Arrays.toString(gugu[i]));
		for(int k = 0 ; k<gugu[i].length; k++) {
			System.out.print("gugu"+(i*1+2)+"X"+(k*1+1)+"=" + gugu[i][k]+"\t");
			
		}
	}
	String[] strary = new String[3];
	
	
	
	int[] oldary= {1,2,3};
	int[] newary= new int[5];
	
	for(int i = 0; i<oldary.length; i++) {
		newary[i] = oldary[i];		
	}
	int[]oldary2= {1,2,3};
	int[]newary2=new int [10];
	System.arraycopy(oldary2, 0, newary2, 0, oldary2.length);
	for(int temp: newary2) {
		System.out.println(temp+"\t");
	}
	














}
}
