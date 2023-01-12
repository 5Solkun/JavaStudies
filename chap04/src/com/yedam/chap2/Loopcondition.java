package com.yedam.chap2;

import java.util.Scanner;

public class Loopcondition{
	public static void main(String[] args) {
	
		while(true) {
			int num = (int)(Math.random()*6+1);
			System.out.println(num);
			if(num==6) {
				break;
			}
		}
		for(int i=0; i<10; i++) {
			for(int j=0;j<=10;j++) {
				System.out.println("i+j="+(i+j));
				if(i+j==5) {
					System.out.println("탈출!");
					break;
				}
			}
		}
		Outter: for(char upper='A'; upper<'z'; upper++) {
			for(char lower='a';lower<='z';lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}
		
		for(int i =0; i<=10 ;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
