package com.yedam.operator;

import java.util.Scanner;

public class IfCondition {
	public static void main(String[] args) {
		int score=93;
		if(score>=90) {
			System.out.println("점수가 90이상이고 등급A");
		}
			
				System.out.printf("%3x \n",(int)(Math.random()*100)%255);
			
			int number = (int)(Math.random()*6+1);
			System.out.println(number);
			switch(number) {
			case 1:
				System.out.println("1번나옴");
				break;
			case 2:
				System.out.println("2번나옴");
				break;
			case 3:
				System.out.println("3번나옴");
				break;
			case 4:
				System.out.println("4번나옴");
				break;
			case 5:
				System.out.println("5번나옴");
				break;
			case 6:
				System.out.println("6번나옴");
				break;
			}
			
			Scanner sc = new Scanner(System.in);
			System.out.println("입력>");
			int scores = Integer.parseInt(sc.nextLine());
			switch(scores/10) {
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("E");
				break;
			}
			String grade = "";
			if(score >=90) {
				if(score>=95) {
					grade="A+";
				}
				else 
					grade="A";
			}
			}
		}

