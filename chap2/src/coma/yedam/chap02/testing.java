package coma.yedam.chap02;

public class testing {
	public static void main(String[] args) {
		//자동타입변환
		byte byteValue = 10;
		int intValue = byteValue;
		
		System.out.println("intValue : " + intValue);
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		double doubleValue = intValue;
		System.out.println("doubleValue : " + doubleValue);
		
		int intVar =200;
		byte byteVar = (byte)intVar;
		System.out.println("byteVar : " + byteVar);
		
		int intVar2 = 44032;
		char charVar = (char)intVar2;
		
		System.out.println("charVar" + charVar);
		// 실수<=> 정수 강제 타입 변환
		double dbv = 3.14;
		int inv2=(int)dbv;
		System.out.println(inv2);
	}
}
