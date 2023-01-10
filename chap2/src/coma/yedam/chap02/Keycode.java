package coma.yedam.chap02;

import java.io.IOException;
import java.util.Scanner;

public class Keycode {
	public static void main(String[] args) throws IOException {
		int keyCode=0;
		
//		System.out.println("입력>");
//		keyCode= System.in.read();
//		System.out.println("Keycode:" + keyCode);
//		
//		keyCode= System.in.read();
//		System.out.println("Keycode:" + keyCode);
//
//		keyCode= System.in.read();
//		System.out.println("Keycode:" + keyCode);
//		
//		keyCode= System.in.read();
//		System.out.println("Keycode:" + keyCode);
		
		//scanner
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("입력>");
		String inputDate = scanner.nextLine();
		System.out.println("scanner:" + inputDate);
		if(inputDate.equals("yedam")) {
			System.out.println("yedam과 일치합니다.");
		}
	}
	
}
