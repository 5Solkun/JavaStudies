package com.yedam.operator;

import java.util.Scanner;

public class Loopfor {
	public static void main(String[] args) {
//		int result=0;
//		for(int i=0; i<=100; i++){
//			result +=i;	
//			System.out.println(result);
//		}
//		for(int i=0; i<=100; i++){
//			if((i%2)==0){
//				System.out.println(i);
//			}
//		}
//				}
		
//	}
//}

		
		
		Scanner inp = new Scanner(System.in);
		System.out.println("받을갯수>");
		int input = Integer.parseInt(inp.nextLine());
		int sum=0;
		int max=0;
		int min=0;
		int input2=0;
		
		for(int i = 1 ; i<=input;i++) {
			System.out.println("값입력>");
			input2 = Integer.parseInt(inp.nextLine());
			if(i==1) {
				sum+=input2;
				max=input2;
				min=input2;
			}
			else {
				sum+=input2;
				if(input2>max) {
					max=input2;
				}
				else if(input2<min)
				{
					min=input2;
				}
			}
		}

		System.out.printf("합계%d 평균%f 최대%d 최소%d",sum,(float)sum/input,max,min);
;
		
		int answer= (int)(Math.random()*100);
		
		for(int i=1; i<10;i++) {
			
			System.out.println("\n값입력>");
			int input3 = Integer.parseInt(inp.nextLine());
			
			if(input3==answer) {
				System.out.println("정답입니다");
				break;
			}
			else if(input3>answer) {
				System.out.println("작은값을 입력하세요");
			}
			else if(input3<answer) {
				System.out.println("큰값을 입력하세요");
			}
			
			if(i>4){
				System.out.printf("\n게임오바 ,정답은 : %d",answer);
				break;
			}
		
		}
	}}




