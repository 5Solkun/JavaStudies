package com.yedam.homework;

public class ObesityInfo extends StandardWeightInfo {
	private double obesity = getObesity();
	public ObesityInfo(String name, double tall, double weight) {
		super(name, tall, weight);
	}
	public void getInformation() {
		if (obesity > 40) {
			System.out.printf("%s님의 신장 %.0f, 몸무게 %.0f, 비만입니다.\n", name, tall, weight);
		} else if(obesity>20) {
			System.out.printf("%s님의 신장 %.0f, 몸무게 %.0f, 과체중입니다.\n", name, tall, weight);
		} else if(obesity>0) {
			System.out.printf("%s님의 신장 %.0f, 몸무게 %.0f, 표준체중입니다.\n", name, tall, weight);
		} else {
			System.out.printf("%s님의 신장 %.0f, 몸무게 %.0f, 저체중입니다.\n", name, tall, weight);
		}
	}
	public double getObesity() {
		double obesity = (weight - stdWeight) / stdWeight * 100;
		return obesity;
	}
}
