package com.yedam.java;

import java.util.Scanner;

public class ProductProgram {
	public ProductProgram() {
		Scanner sc = new Scanner(System.in);
		boolean run =true;
		Product[] list = null;
		while(run) {
			System.out.println("=== 1.상품수 | 2. 상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료 ===");
			System.out.println("선택>");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				System.out.print("상품수>");
				int productNum = Integer.parseInt(sc.nextLine());
				list = new Product[productNum];
			}
			if(selectNo == 2) {
				for(int i = 0;i<list.length;i++) {
					System.out.print("상품명>");
					String name = sc.nextLine();
					System.out.print("상품가격>");
					int price = Integer.parseInt(sc.nextLine());
					Product product = new Product(name,price);
					list[i]=product;
				}
			}
			if(selectNo == 3) {
				for(Product temp : list) {
					System.out.printf("%s\t| %d\n",temp.getProName(),temp.getProPrice());
				}
			}
			if(selectNo == 4) {
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
			if(selectNo == 5) {
				run=false;
			}
		}
	}
}
