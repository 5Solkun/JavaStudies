package com.yedam.ch02;

import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int N= Integer.parseInt(sc.nextLine());
		int result=N;
		int count=0;
		int a;
		int b;
		count++;
		a=(N/10)+(N%10);
		N=(N%10)*10+a%10;
		while(true) {
			if(result==N) {
				break;
			}
			else {
				count++;
				a=(N/10)+(N%10);
				N=(N%10)*10+a%10;
			}
			
		}
		System.out.println(count);
	}
}
