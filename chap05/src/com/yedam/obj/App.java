package com.yedam.obj;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
//	Student s1 = new Student();
//	Student s2 = new Student();
//	Student s3 = new Student();
//	Korean2 k1 = new Korean2("kim","20315");
//	//dot 연산자
//	
//	System.out.println(s1);
//	System.out.println(s2);
//	
//	s1.age=20;
//	s1.name="예담";
//	s1.schoolName="예담대";
//	
//	s1.getInfo();
//	s2.getInfo();
//	
//	s1.age=20;
//	s1.name="대학생";
//	
//	System.out.println(s1.age);
//	System.out.println(s1.name);
//	k1.info();
//	System.out.println(k1.name);
	
	//학생정보 보관하는 배열
	Student[] stdAry = null;
	int stdNum = 0;
	Scanner sc =new Scanner(System.in);
	//while문으로 학생관리프로그램 ㄱ
	while(true) {
		System.out.println("===================================");
		System.out.println("1.학생수 | 2.정보입력 | 3.정보확인 | 4.성적확인 | 5.종료" );
		System.out.println("===================================");
		
		int sel = Integer.parseInt(sc.nextLine());
		if(sel ==1) {
			System.out.println("학생수>>");
			stdNum=Integer.parseInt(sc.nextLine());
		}
		else if(sel ==2) {
			stdAry = new Student[stdNum];
			for(int i =0; i<stdAry.length;i++) {
				//객체 배열에 각 인덱스에 존재하는 student객체에게
				//데이터를 제공하기위해 임시객체 생성
//				Student std = new Student();
//				std.name = "김또치";
//				std.age=10;
//				stdAry[i]=std;
				stdAry[i]=new Student();
				System.out.println("이름>");
				stdAry[i].name=sc.nextLine();
				System.out.println("나이>");
				stdAry[i].age=Integer.parseInt(sc.nextLine());
				System.out.println("학교>");
				stdAry[i].schoolName=sc.nextLine();
				System.out.println("국어:");
				stdAry[i].kor=Integer.parseInt(sc.nextLine());
				System.out.println("영어:");
				stdAry[i].eng=Integer.parseInt(sc.nextLine());
				System.out.println("수학:");
				stdAry[i].math=Integer.parseInt(sc.nextLine());
				
			}
		}
		else if(sel ==3) {
			for(Student std : stdAry) {
				std.getInfo();
			}
		}
		else if(sel ==4) {
			int total = 0;
			double avg = 0;
			System.out.println("전체학생 총합/ 평균");
			for(int i=0; i<stdAry.length;i++) {
				total = stdAry[i].kor+stdAry[i].eng+stdAry[i].math;
				avg = total/3.0;
				System.out.println(stdAry[i].name + "학생");
				System.out.printf("총점:%d 평균%f\n",total,avg);
			}
			
			//시험 제일 잘친과목 못친과목
			
			int max = 0;
			int min = 0;
			for(int i = 0; i<stdAry.length;i++ ) {
				min = stdAry[i].kor;
				max = stdAry[i].kor;
				if(min>stdAry[i].eng){
					min=stdAry[i].eng;
				}
				if(min>stdAry[i].math){
					min=stdAry[i].math;
				}
				
				if(max<stdAry[i].eng){
					max=stdAry[i].eng;
				}
				if(max<stdAry[i].math){
					max=stdAry[i].math;
				}
				System.out.println("최대"+max+"최소"+min);
			}
		}

		else if(sel ==5) {
			
		}
	}
	
}
}
