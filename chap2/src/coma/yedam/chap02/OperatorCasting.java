package coma.yedam.chap02;

public class OperatorCasting {
	public static void main(String[] args) {
		byte v1 =10;
		int v2=100;
		long v3=1000;
		
		long r = v1+v2+v3;
		System.out.println(r);
		
		//실수와 정수 타입변환(연산)
		
		int iv1 = 10;
		int iv4 = iv1/4;
		System.out.println(iv4);
		
		
		int iv2=10;
		double iv3 = iv2/4.0;
		System.out.println(iv3);
		
		int x =1 ;
		int y=2;
		double r2=x/(double)y;
		System.out.println(r2);
		
		//+연산
		//숫자연산
		
		int v = 10+2+8;
		System.out.println(v);
		
		//문자열결합
		String str1= 10+2+"8";
		System.out.println(str1);
		
		String str2=1+"2"+8; 
		System.out.println(str2);
		
		String str3="10"+2+8;
		System.out.println(str3);
		
		String str4="10"+(2+8);
		System.out.println(str4);
		
		//string <> int float convert
		int vstr= Integer.parseInt(str4);
		System.out.println(vstr);
//		byte bytev=Byte.parseByte(str4);
		short sv = Short.parseShort(str4);
		long lv = Long.parseLong(str4);
		double dv= Double.parseDouble(str4);
//		boolean boolv = Boolean.parseBoolean(str4);
		
		String str5 = String.valueOf(vstr);
		String str6 = String.valueOf(lv);
		String str7 = String.valueOf(dv);
		System.out.printf("%s %s %s ", str5,str6,str7);
	}
}
