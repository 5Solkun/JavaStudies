package com.yedam.common;

import java.util.Scanner;

import com.yedam.java.Product;

public class ProductProgram {
	private Scanner sc = new Scanner(System.in);
	private Product[] list = null;
	private boolean run = true;
	public ProductProgram() {
		
		while(run) {
			//메뉴출력
			menuPrint();
			//메뉴선택
			int selectNo= menuSelect();
			if(selectNo ==1) {
				//상품수
				inputProudctNum();
			}
			else if(selectNo ==2) {
				//상품 및 가격 입력
				inputProductInfo();
			}
			else if(selectNo ==3) {
				//제품별 가격
				productInfoPrint();	
			}
			else if(selectNo ==4) {
				//분석
				productAnalize();
			}
			else if(selectNo ==5) {
				// 프로그램 종료
				exit();
			}else {
				//잘못된 메뉴를 선택할경우 안내메세지 출력
			}
			
		}	
	}
	private void menuPrint() {
		System.out.println("=== 1.상품수 | 2. 상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료 ===");
		System.out.println("선택>");
	}
	private int menuSelect() {
		Scanner sc = new Scanner(System.in);
		int selectNo = Integer.parseInt(sc.nextLine());
		return selectNo;
	}
	private void inputProudctNum() {
		System.out.print("상품수>");
		int productNum = Integer.parseInt(sc.nextLine());
		list = new Product[productNum];
	}
	private void inputProductInfo() {
		for(int i = 0;i<list.length;i++) {
			System.out.print("상품명>");
			String name = sc.nextLine();
			System.out.print("상품가격>");
			int price = Integer.parseInt(sc.nextLine());
			Product product = new Product(name,price);
			list[i]=product;
		}
	}
	private void productInfoPrint() {
		for(Product temp : list) {
			System.out.printf("%s\t| %d\n",temp.getProName(),temp.getProPrice());
		}
	}
	private void productAnalize() {
		int max =0;
		int productIndex=0;
		
		for(int i=0; i<list.length;i++) {
			Product product =list[i];
			if(max < product.getProPrice()) {
				max = product.getProPrice();
				productIndex=1;
			}
		}
		int sum = 0;
		for(int i=0; i < list.length ; i++) {
			if(i == productIndex) continue;
			Product product = list[i];
			sum += product.getProPrice();
		}
		
		System.out.println("최고가격을 가진 제품은" + list[productIndex].getProName()+"입니다");
		System.out.println("최고 가격을 제외한 제품들의 합은" +sum+"입니다");
	}
	private void exit() {
		System.out.println("종료합니다");
		run=false;
	}
}
