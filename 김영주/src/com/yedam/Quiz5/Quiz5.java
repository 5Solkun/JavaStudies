package com.yedam.Quiz5;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int dicesize=-1;
		int[] dice=null;
		while(true) {
			
			System.out.println("=================================================================");
			System.out.println("1. 주사위크기 | 2. 주사위 굴리기 | 3. 결과 보기 | 4. 가장많이 나온수 | 5. 종료");
			System.out.println("=================================================================");			
			System.out.println("메뉴>");
			
			int sel = Integer.parseInt(sc.nextLine());
			if (sel==1) {
				System.out.println("주사위크기>");
				int buffer = Integer.parseInt(sc.nextLine());
				if(buffer<=10&&buffer>=5) {
					dicesize=buffer;
				}
				else {
					System.out.println(" 5 ~ 10 사이의 값을 입력해주세요");
				}
				
			}
			else if(sel==2) {
				if(dicesize==-1) {
					System.out.println("먼저 주사위의 크기를 정해주세요");
				}
				else {
					int counter = 0;
					dice= new int[dicesize];
					while(true){
						counter++;
						int num=((int)(Math.random()*dicesize+1));
						System.out.println(num);
						if(num==5) {
							dice[num-1]++;
							break;
						}
						else
							dice[num-1]++;			
					}
					System.out.printf("5가 나올때까지 주사위를 %d 번 굴렸습니다\n",counter);
				}

			}
			else if(sel==3) {
				if(dice==null) {
					System.out.println("먼저 주사위를 굴려주세요");
				}
				else {
					for(int i=0;i<dice.length;i++) {
						System.out.printf("%d는 %d번 나왔습니다.\n",i+1,dice[i]);
						
					}
				}
				
			}
			else if(sel==4) {
				if(dice==null){
					System.out.println("먼저 주사위를 굴려주세요");
				}else {
					int max=dice[0];
					int maxnum=1;
					for(int i=0;i<dice.length;i++) {
						if(dice[i]>max) {
							maxnum=i+1;
							max=dice[i];
						}
					}
					System.out.printf("가장많이 나온 수는 %d입니다\n " ,maxnum);
				}		
			}
			else if(sel==5) {
				System.out.println("종료합니다");
				break;
			}
			
		}
	}
}
