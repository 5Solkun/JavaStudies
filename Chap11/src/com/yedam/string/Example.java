package com.yedam.string;

import java.io.UnsupportedEncodingException;

public class Example {
public static void main(String[] args) {
	//byte[] -> String
	byte[] bytes1 = { 72 ,101, 108,108,111,32,74,97,118,97};
	String str1 = new String(bytes1);
	System.out.println(str1);
	
	//
	String str2 = "안녕하세요";
	byte[] bytes2 = str2.getBytes();
	System.out.println(bytes2.length);
	System.out.println("bytes2 - > str"+str2);
	
	try {
		byte[] byte3 = str2.getBytes("UTF-8");
		System.out.println(byte3.length);
		String str3 = new String(byte3,"EUC-KR");
		System.out.println(str3);
				
	}catch(UnsupportedEncodingException e) {
		e.printStackTrace();
	}
	
}
}
