package com.yedam.chap2;

import java.util.Scanner;

//Scanner scanner = new Scanner(System.in);
//int x = Integer.parseInt(scanner.nextLine());
public class Loopwhile {
	public static void main(String[] args) {
		int i = 1;
		while (i < 100) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}

		// 계산기

		Scanner scanner = new Scanner(System.in);

		int x = Integer.parseInt(scanner.nextLine());
		int y = Integer.parseInt(scanner.nextLine());
		boolean run = true;
		while (run) {
			System.out.println("1 + , 2 - , 3 * , 4 exit \n 입력>");
			int sel = Integer.parseInt(scanner.nextLine());
			switch (sel) {
			case 1:
				System.out.println(x + y);
				break;
			case 2:
				System.out.println(x - y);
				break;
			case 3:
				System.out.println(x * y);
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("1~4중 입력하시오");
				break;
			}

		}

	}
}
