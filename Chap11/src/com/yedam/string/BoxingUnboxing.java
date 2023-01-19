package com.yedam.string;

public class BoxingUnboxing {
	public static void main(String[] args) {
		Integer obj1 = Integer.valueOf(100);
		Integer obj2 = Integer.valueOf("200");
		//Integer obj3 = new Integer(1000);
		
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		
		Integer newobj1 = value1;
		Integer newobj2 = value2;
		
		int result =newobj1 + newobj2;
		System.out.println(result);
		
		Integer data1 = 300;
		Integer data2 = 300;
		System.out.println(data1==data2);
		System.out.println(data1.intValue()==data2.intValue() );
		System.out.println(data1.equals(data2));
		
		Integer data3 = 30;
		Integer data4 = 30;
		System.out.println(data3==data4);
		System.out.println(data1.intValue()==data2.intValue() );
		System.out.println(data1.equals(data2));
	}
}
