package com.yedam.obj;

public class Score {
	int kor;
	int math;
	int eng;
	
	Score(int kor,int math, int eng) {
		this.kor =kor;
		this.math = math;
		this.eng=eng;
	}
	//메소드
	
	int getSum() {
		return kor+math+eng;
	}
	double getAvg() {
		int sum=getSum();
		return sum/3.0;
	}
	
	void getInfo() {
		int sum = getSum();
		double avg = getAvg();
		System.out.println(sum);
		System.out.println(avg);
	}
}
