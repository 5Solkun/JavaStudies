package com.yedam.obj;

import java.util.Scanner;





public class Homework5 {


	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Product[] PrdAry = null;
		int Prdnum = 0;

		while(true) {
			int sel= HomeworkParts.menu();
			if(sel==1) {
				Prdnum = HomeworkParts.Prdnum();
			}
			else if(sel==2) {
				PrdAry=HomeworkParts.PrdListWrite(PrdAry,Prdnum);
				
			}
			else if(sel==3) {
				HomeworkParts.PrdListRead(PrdAry);
			}
			else if(sel==4) {
				HomeworkParts.PrdAnalize(PrdAry);
			}
			else if(sel==5) {
				System.out.println("종료합니다");
				break;
			}
			
		}
			
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		//	출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		

	}
}

