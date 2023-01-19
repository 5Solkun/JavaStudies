package com.yedam.homework;

public class StandardWeightInfo extends Human {
	protected double stdWeight = getStdWeight();
	public StandardWeightInfo(String name, double tall, double weight) {
		super(name, tall, weight);
	}
	public void getInformation() {
		System.out.printf("이름: %s 신장: %.0f 몸무게 : %.0f 표준체중 : %.1f \n", name, tall, weight, stdWeight);
	}
	public double getStdWeight() {
		double standardWeight = ((tall - 100) * 0.9);
		return standardWeight;
	}
}
