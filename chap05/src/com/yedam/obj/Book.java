package com.yedam.obj;

public class Book {

	
	//제목
	//#내용
	//종류
	//가격
	//출판사
	//도서번호
	String title;
	String category;
	int price;
	String publisher;
	String ISBN;
	
	Book(String title , String category,int price,String publisher,String ISBN){
		this.title=title;
		this.category=category;
		this.price=price;
		this.publisher=publisher;
		this.ISBN=ISBN;
	}
	Book(String title , String category,int price,String publisher){
		this.title=title;
		this.category=category;
		this.price=price;
		this.publisher=publisher;
	}
	
	Book(String category,int price){
		this.category=category;
		this.price=price;
	}
	Book(int price,String category){
		this.category=category;
		this.price=price;
	}
	
	void info(){
		System.out.println("제목 : " + title);
		System.out.println("제목 : " + category);
		System.out.println("제목 : " + price + "원");
		System.out.println("제목 : " + publisher);
		System.out.println("제목 : " + ISBN+"\n");
	}
}
