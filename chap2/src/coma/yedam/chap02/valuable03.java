package coma.yedam.chap02;

public class valuable03 {
	public static void main(String[] args) {
		int var1 = 0b1011; //2진수
		int var2 = 0206; //8진수
		int var3= 365;//10진수
		int var4 = 0xB3;//16진수
		
		System.out.println("var1:" + var1 +"\n"+"var2:" + var2 +"\n"+"var3:" + var3 +"\n"+"var4:" + var4 +"\n");
	
		byte bVar1=-128;
		byte bVar2=127;
		System.out.println("bvar1:" + bVar1 +"\n"+"bvar2:" + bVar2 );
		
		
		//long
		long lVar1= 2000000;
		long lVar2 = 200000000000L;
		System.out.println("lavr:" + lVar1 +"\n"+"lvar2:" + lVar2 );
		
		//char
		char c1='A';
		char c2=65;
		char c3='\u0041';
		char c4 = '가';
		char c5 = 44032;
		char c6='\uac00';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	}
}
