package com.yedam.chap2;

import java.util.Scanner;

public class Simplegame {
	public static void main(String[] args) {
		int money;
		System.out.println("=======insert coin=====");
		Scanner sc= new Scanner(System.in);
		money = Integer.parseInt(sc.nextLine());
		boolean flag =true;
		while(money >500 && flag) {
			System.out.println("1.가위바위보 | 2. 홀짝 맞추기 | 3.나가기");
			int gameNo=Integer.parseInt(sc.nextLine());
			switch(gameNo){
				case 1:
					System.out.println("가위바위보중 하나골라주세요");
					String RSP = sc.nextLine();
					int comRSP=(int)(Math.random()*3+1);
					if(RSP.equals("가위")){
						if(comRSP==1)
							System.out.println("비김");
						else if(comRSP==2) {
							System.out.println("짐");
							money-=500;
							}
						else if(comRSP==2) {
							System.out.println("이김");
								money+=500;
							}
					}
					if(RSP.equals("바위")){
						if(comRSP==2)
							System.out.println("비김");
						else if(comRSP==3) {
							System.out.println("짐");
							money-=500;
							}
						else if(comRSP==1) {
							System.out.println("이김");
								money+=500;
							}
					}
					if(RSP.equals("보")){
						if(comRSP==3)
							System.out.println("비김");
						else if(comRSP==1) {
							System.out.println("짐");
							money-=500;
							}
						else if(comRSP==2) {
							System.out.println("이김");
								money+=500;
							}
					}
					else {
						System.out.println("똑띠골라라");
						break;
					}
					System.out.println("컴퓨터는");
					if(comRSP==1)
						System.out.println("가위");
					else if(comRSP==2) 
						System.out.println("바위");
					else if(comRSP==3) 
						System.out.println("보");
					
					break;
				case 2:
					System.out.println("홀짝중 하나골라주세요");
					String HZ = sc.nextLine();
					int comNum=(int)(Math.random()*100+1);
					if(HZ.equals("홀")){
						 if(comNum%2==0) {
							System.out.println("짐");
							money-=500;
							}
						else if(comNum%2==1) {
							System.out.println("이김");
								money+=500;
							}
						else
							System.out.println("똑띠골라라");
					}
					else if(HZ.equals("짝")){
						 if(comNum%2==1) {
							System.out.println("짐");
							money-=500;
							}
						else if(comNum%2==0) {
							System.out.println("이김");
								money+=500;
							}
						else
							System.out.println("똑띠골라라");
					}
					System.out.printf("값은 %d 였습니다 ",comNum);
					break;
				case 3:
					flag=false;
					
					break;
				default:
					System.out.println("똑띠골라라");
					

				
			}
			if(money<500) {
				System.out.println("돈이부족합니다");
			}
		}
	}
}
