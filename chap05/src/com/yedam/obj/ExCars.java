package com.yedam.obj;

public class ExCars {
public static void main(String[] args) {
	Car car1= new Car();
	System.out.println("car1.company:" + car1.company);
	
	Car car2= new Car("자가용");
	System.out.println("car2.company:" +car2.company);
	System.out.println("car2.model:" +car2.model);
	
	Car car3= new Car("자가용","빨강");
	System.out.println("car3.company:" +car3.company);
	System.out.println("car3.model:" +car3.model);
	System.out.println("car3.color:" +car3.color);
	System.out.println("car3.maxSpeed:" +car3.maxSpeed);
	
	Calculator ca = new Calculator();
	double result = ca.sub(1, 1);
	System.out.println(result);
	ca.poweroff();
	int result2=ca.sum2(1,2,3,4,5,6,7,8,9);
	System.out.println(result2);
	
	Score scr = new Score(100,40,30);
	
	scr.getInfo();
	
}
}
