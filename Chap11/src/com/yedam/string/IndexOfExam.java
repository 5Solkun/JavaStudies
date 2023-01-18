package com.yedam.string;

public class IndexOfExam {

		public static void main(String[] args) {
			String subject = "혼자 공부하는자바";
			int location = subject.indexOf("공부");
			System.out.println(location);
			if(subject.indexOf("자바")==-1){
				System.out.println("자바와 노상관");
			}
			else
				System.out.println("자바와 관련있음");
		}
	
}
