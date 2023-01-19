package com.yedam.homework;

public class Human {
	protected String name;
	protected double tall;
	protected double weight;

	public Human(String name, double tall, double weight) {
		this.name =name;
		this.tall = tall;
		this.weight = weight;
	}
	public void getInformation() {
		System.out.printf( "이름: %s 신장 : %f 뭄무게 : %f" + weight,name,tall,weight);
	}
}
