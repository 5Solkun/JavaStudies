package com.yedam.Quiz1;

public class RPGame implements Keypad {
	boolean Mode = false;
	public RPGame() {
		System.out.println("RPG게임실행");
	}
	 // false�뒗 �끂留먮え�뱶 true�뒗 �븯�뱶紐⑤뱶
	
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
	public void rightUpButton() {
		if (Mode = false)
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		else
			System.out.println("캐릭터가 두칸단위로 점프한다.");
	}

	@Override
	public void rightDownButton() {
		// TODO Auto-generated method stub
		if (Mode = false)
			System.out.println("캐릭터가 일반 공격.");
		else
			System.out.println("캐릭터가 HIT 공격.");
	}

	@Override
	public void changeMode() {
		if (this.Mode == false) {
			this.Mode = true;
			System.out.println("하드모드");
		} else {
			this.Mode = false;
			System.out.println("노말모드");
		}
	}

}
