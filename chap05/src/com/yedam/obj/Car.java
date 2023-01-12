package com.yedam.obj;

public class Car {
	String company = "현대";
	String model;
	String color;
	String maxSpeed;
	Car() {
		
	}

	Car(String model){
		this.model = model;
	}
	Car(String model,String color){
//		this.model = model;
//		this.color=color;
		this(model,color,"250");
		
	}
	Car(String model,String color,String maxSpeed){
		this.model = model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}

}
