package com.yedam.generic;

public class mainEx {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		String name = (String)box.get();
		box.set(1000);
		int price = (Integer)box.get();
		box.set(new Apple());
		
		System.out.println(name);
		System.out.println(price);
		
		genericBox<String> nameBox = new genericBox<>();
		nameBox.set("string");
		System.out.println(nameBox.get());
		genericBox<Integer> priceBox = new genericBox<>();
		priceBox.set(1000);
		System.out.println(priceBox.get());
		genericBox<Apple> appleBox = new genericBox<Apple>();
		appleBox.set(new Apple());
		System.out.println(priceBox.get());
		
		
		
	}
}

class Apple{}
