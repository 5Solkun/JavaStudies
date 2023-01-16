package com.yedam.java;

public class Product {

	//상품정보를 담는 클래스
	//필드 해당클래스가 가지는 모든정보
	private  String proName;
	private int proPrice;
	//생성자 인스턴스를 생성할때 필요한 프로세스를 담은 메소드
	public Product(String proName, int proPrice) {
		this.proName = proName; //this: 인스턴스를 가르킴
		this.proPrice = proPrice;
	}
	//메소드 - 해당클래스가 가지는 모든기능
	public void setProName(String proname) {
		this.proName = proname;
	}
	public String getProName() {
		return this.proName;
	}
	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	public int getProPrice() {
		return this.proPrice;
	}

}
