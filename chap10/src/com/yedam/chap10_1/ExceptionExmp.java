package com.yedam.chap10_1;

public class ExceptionExmp {
	public static void main(String[] args) {

		// ==nullpointer==//
//		String data = null;
//		System.out.println(data.toCharArray());
		if (args.length > 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println(data1);
			System.out.println(data2);
		} else
			System.out.println("인수없음");

		// ==Numberformat==//

//		String data3 = "100";
//		String data4 = "a200";
//		
//		int value3 = Integer.parseInt(data3);
//		int value4 = Integer.parseInt(data4);
//		
//		int result = value3 +value4;
//		System.out.println(result);

		changeDog(new Dog());
		changeDog(new Cat());

	}

	// classcastexeption
	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
	}
}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}
