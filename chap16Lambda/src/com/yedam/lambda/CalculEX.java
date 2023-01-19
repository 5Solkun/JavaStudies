package com.yedam.lambda;

public class CalculEX {
	public static void main(String[] args) {
		Calculator cal = new Calculator() {
			@Override
			public double plus(double x, double y) {
				return x + y;
			}
		};
		Calculator lambda = (x, y) -> x + y ;
		System.out.println(cal.plus(10.5, 15.8));
		System.out.println(lambda.plus(10.5, 15.8));
	}
}
