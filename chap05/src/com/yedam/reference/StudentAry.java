package com.yedam.reference;

import java.util.Scanner;

public class StudentAry {
public static void main(String[] args) {
	//학생의 성적을 입력
	//과목수 
	int subj=0;
	int[] score = null;
	Scanner sc =new Scanner(System.in);
	
	
	while(true) {
		System.out.println("==============================================");
		System.out.println(" 1.과목수 | 2.점수입력 | 3.점수리스트 | 4. 분석 | 5.종료");
		System.out.println("=============================================");
		System.out.println("메뉴 입력>");
		
		int sel = Integer.parseInt(sc.nextLine());
		if (sel == 1) {
			System.out.println("과목수 입력>");
			subj = Integer.parseInt(sc.nextLine());
		}
		if (sel == 2) {
			score=new int[subj];
			for(int i=0;i<score.length;i++) 
			{
			System.out.printf("\n남은과목수 %d 점수입력>",score.length-i);
			score[i]=Integer.parseInt(sc.nextLine());
			}
		}
		if (sel == 3) {
			for(int i=0;i<score.length;i++)
			{
				System.out.println(score[i]);
			}
		}
		if (sel == 4) {
			int sum=0;
			for(int i=0;i<score.length;i++)
			{
				sum+=score[i];
			}
			System.out.printf("총점 : %d | 평균 : %f\n",sum,(float)sum/subj);
		}
		if (sel == 5) {
			System.out.println("종료합니다");
			break;
		}
	}
}
}
