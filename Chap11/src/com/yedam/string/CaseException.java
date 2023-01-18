package com.yedam.string;

public class CaseException {
	public static final String DATA = "HELLO WORLD!";
	public static void main(String[] args) {
		String inputData = "Hello World!";
		String newInputDataL = inputData.toLowerCase();
		String newInputDataU = inputData.toUpperCase();
		if(newInputDataU.equals(DATA)) {
			System.out.println("있는데이터");
		}
		else {
			System.out.println("없는데이터");
		}
		if(inputData.equalsIgnoreCase(DATA)) {
			System.out.println("있는데이터");
		}
		else {
			System.out.println("없는데이터");
		}
	}
}
