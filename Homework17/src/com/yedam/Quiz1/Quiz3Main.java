package com.yedam.Quiz1;

import java.util.Scanner;

public class Quiz3Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력>");
		int sel;
		Keypad game;
		if((int)(Math.random()*2)==0) {
			game = new RPGame();
		}
		else
			game = new ArcadeGame();
		while(true) {
			System.out.println("===============================================================================================");
			System.out.println("<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
			System.out.println("==============================================================================================");
			System.out.println("select>>");
			sel = Integer.parseInt(sc.nextLine());
			if(sel==1)
				game.leftUpButton();
			else if(sel==2)
				game.leftDownButton();
			else if(sel==3)
				game.rightUpButton();
			else if(sel==4)
				game.rightDownButton();
			else if(sel==5)
				game.changeMode();
			else if(sel==0)
				game = new ArcadeGame();
			else if(sel==9) {
				System.out.println("EXIT");
				break;
			}
			else
				System.out.println("똑띠입력하시오!");
		}
	}
}
