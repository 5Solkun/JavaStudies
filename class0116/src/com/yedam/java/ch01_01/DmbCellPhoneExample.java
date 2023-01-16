package com.yedam.java.ch01_01;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//DmbCellphone 인스턴스
		DmbCellphone dmbCellphone = new DmbCellphone("아이폰","로즈골드",77);
		System.out.println("모델 : " + dmbCellphone.model);
		System.out.println("색깔 : " + dmbCellphone.color);
		
		System.out.println("채널"+dmbCellphone.channel);
		
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("여보세요.");
		dmbCellphone.receiveVoice("안녕하세요! 저는 뭐시깽이 입니다.");
		
		
	}
}
