package com.yedam.chap10_1;

import java.util.Scanner;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
//		try {
//			Class clazz = Class.forName("java.lang.String2");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("ss");
//		}
		try {
			findClass();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		try{
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			System.out.println(value1+value2);
			
			throw new ClassCastException();
			}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("인수가 부족합니다");
			}
		catch(NumberFormatException e) {
			System.out.println("숫자가 아님니다");
			}
		catch(Exception e) {
			System.out.println("정상적으로 실행 x");
			return;
			}
		finally {
			System.out.println("프로그램이 종료됨");
		}
		
		
	}
	public static void findClass() throws NullPointerException{
		String className = null;
		Scanner sc= new Scanner(System.in);
		System.out.println("클래스입력>");
		className = sc.nextLine();
		
		if (className ==null || className.equals("")) {
			throw new NullPointerException();
		}
	}
}
