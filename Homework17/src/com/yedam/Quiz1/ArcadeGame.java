package com.yedam.Quiz1;

public class ArcadeGame implements Keypad {
	public ArcadeGame() {
		System.out.println("아케이드 게임실행");
	}
	boolean Mode = false; // false�뒗 �끂留먮え�뱶 true�뒗 �븯�뱶紐⑤뱶

	@Override
	public void leftUpButton() {
		// TODO Auto-generated method stub
		System.out.println("캐릭터가 앞쪽으로 이동한다");
	}

	@Override
	public void leftDownButton() {
		// TODO Auto-generated method stub
		System.out.println("캐릭터가 뒤쪽으로 이동한다");
	}

	@Override
	public void rightUpButton() {
		if (Mode = false)
			System.out.println("캐릭터가 일반 공격");
		else
			System.out.println("캐릭터가 연속 공격");
	}

	@Override
	public void rightDownButton() {
		// TODO Auto-generated method stub
		if (Mode = false)
			System.out.println("캐릭터가 HIT 공격.");
		else
			System.out.println("캐릭터가 Double HIT 공격.");
	}

	@Override
	public void changeMode() {
		// TODO Auto-generated method stub
		if (this.Mode == false) {
			this.Mode = true;
			System.out.println("하드모드");
		} else {
			this.Mode = false;
			System.out.println("노말모드");
		}
	}

}
