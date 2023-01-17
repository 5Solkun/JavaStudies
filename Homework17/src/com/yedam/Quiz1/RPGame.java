package com.yedam.Quiz1;

public class RPGame implements Keypad {
	boolean Mode = false; //false는 노말모드 true는 하드모드
	@Override
	public void leftUpButton() {
		// TODO Auto-generated method stub
		System.out.println("캐릭터가 위쪽으로 이동한다");
	}

	@Override
	public void leftDownButton() {
		// TODO Auto-generated method stub
		System.out.println("캐릭터가 아래쪽으로 이동한다");
	}

	@Override
	public void rightDownButton() {
		// TODO Auto-generated method stub
		if(Mode = false)
			System.out.println("캐릭터가 일반공격");
		else
			System.out.println("캐릭터가 HIT공격");
	}

	@Override
	public void changeMode() {
		// TODO Auto-generated method stub
		if(Mode = false)
			Mode=true;
		else
			Mode=false;
	}

	@Override
	public void rightUpButton() {
		// TODO Auto-generated method stub
		if(Mode = false)
			System.out.println("캐릭터가 한칸단위로 점프한다");
		else
			System.out.println("캐릭터가 두칸단위로 점프한다");
	}

}
