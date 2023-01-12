package com.yedam.obj;

import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {
		
		Product[] PrdAry = null;
		int Prdnum = 0;

		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.println("\n==============================================");
			System.out.println("1.제품수 | 2.제품입력 | 3.제품목록 확인 | 4.제품분석 | 5.종료" );
			System.out.println("==============================================");
			int sel = Integer.parseInt(sc.nextLine());
			if(sel==1) {
				System.out.println("제품수>");
				Prdnum=Integer.parseInt(sc.nextLine());
			}
			else if(sel==2) {
				PrdAry=new Product[Prdnum];
				for(int i=0;i<PrdAry.length;i++) {
					PrdAry[i]=new Product();
					System.out.printf("남은 입력수:%d \n",Prdnum-i);
					System.out.print("제품명>");
					PrdAry[i].name=sc.nextLine();
					System.out.print("가격>");
					PrdAry[i].price=Integer.parseInt(sc.nextLine());
				}
				
			}
			else if(sel==3) {
				System.out.println("|제품명     |가격      |");
				for(int i=0;i<PrdAry.length;i++) {
					PrdAry[i].info();
				}
			}
			else if(sel==4) {
				String maxPrd=" ";
				int max=0;
				int total=0;
				for(int i=0;i<PrdAry.length;i++) {
					if(max<PrdAry[i].price) {
						max=PrdAry[i].price;
						maxPrd=PrdAry[i].name;
					}
					total+=PrdAry[i].price;
				}
				System.out.printf("\n가장비싼제품은 %d원인 %s이고 %s를 제외한 모든 제품의 합은 %d원 입니다\n",max,maxPrd,maxPrd,total-max);
				
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

