package com.yedam.homework;

public class Culture {
	String title;
	int directorNum;
	int actorNum;
	int audienceNum;
	int total;
	public Culture (String title, int directorNum, int actorNum) {
		this.title = title;
		this.directorNum = directorNum;
		this.actorNum = actorNum;
	}
	public void setTotalScore(int score) {
		audienceNum++;
		total += score;
	}
}
