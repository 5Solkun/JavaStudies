package com.yedam.obj;

import java.util.Scanner;

public class HomeworkParts {
	static Scanner sc =new Scanner(System.in);
	public static int menu() {
		
		System.out.println("\n==============================================");
		System.out.println("1.제품수 | 2.제품입력 | 3.제품목록 확인 | 4.제품분석 | 5.종료" );
		System.out.println("==============================================");
		int sel = Integer.parseInt(sc.nextLine());
		return sel;
	}
	
	public static int Prdnum() {
		int Prdnum = 0;
		System.out.println("제품수>");
		return Integer.parseInt(sc.nextLine());
	}
	
	public static Product[] PrdListWrite(Product[] PrdAry,int Prdnum){
		PrdAry=new Product[Prdnum];
		for(int i=0;i<PrdAry.length;i++) {
			PrdAry[i]=new Product();
			System.out.printf("남은 입력수:%d \n",Prdnum-i);
			System.out.print("제품명>");
			PrdAry[i].name=sc.nextLine();
			System.out.print("가격>");
			PrdAry[i].price=Integer.parseInt(sc.nextLine());
			
		}
		return PrdAry;
	}
	public static void PrdListRead(Product[] PrdAry) {
		System.out.println("|제품명     |가격      |");
		for(int i=0;i<PrdAry.length;i++) {
			PrdAry[i].info();
		}
	}
	public static void PrdAnalize(Product[] PrdAry) {
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
}
