package com.yedam.orgnize;

import java.util.Calendar;

import com.yedam.block.Circle;

public class MethodTest {
	public static void main(String[] args) {
//		StringUtil su=new StringUtil();
//		su.Greet();
//		su.greet("hihihihihi");
//		System.out.println(su.greetlength("hihihi"));
//		long length = su.greetlength("hihkkihi");
//		System.out.println(length);
//		System.out.println(Circle.pi);
		Circle c =new Circle(5);
//		System.out.println(c.area());
//		System.out.println(StringUtil.greetlength("it's length is 17"));
		Calculator_Single calcSingle = Calculator_Single.getInstance();
		Calculator_Single calcSingle2 = Calculator_Single.getInstance();
		System.out.println(calcSingle==calcSingle2);
		Calendar today = Calendar.getInstance();
		today.set(2023,5,1);
		System.out.println(today.DAY_OF_YEAR);
		
		Circle_single cir = Circle_single.getInstance();
		Circle_single cir1 = Circle_single.getInstance();
		cir.r=5;
		System.out.println(cir1.area());
		
		Circle ct = new Circle();
		ct.r=5;

		
		
	}
}
