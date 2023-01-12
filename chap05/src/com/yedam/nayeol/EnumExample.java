package com.yedam.nayeol;

import java.util.Calendar;

public class EnumExample {
public static void main(String[] args) {
	//Week 타입의 today변수
	//today는 Week가 가지고있는 데이터만 가질 수 있다.
	//today 데이터범위는 monday~sunday 총7개만
	Week today = null;
	//오늘의 요일이 어떤요일인가
	Calendar cal = Calendar.getInstance();
	//일요일=1 금요일=7
	int week = cal.get(Calendar.DAY_OF_WEEK);
	switch(week) {
	case 1:
		today = Week.SUNDAY;
		break;
	case 2:
		today = Week.MONDAY;
		break;
	case 3:
		today = Week.TUESDAY;
		break;
	case 4:
		today = Week.WEDNESDAY;
		break;
	case 5:
		today = Week.THURSDAY;
		break;
	case 6:
		today = Week.FRIDAY;
		break;
	case 7:
		today = Week.SATURDAY;
		break;
	
	}
}
}
