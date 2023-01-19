package com.yedam.generic;

public class MainPerson {
	public static void main(String[] args) {
		Person person = new Person();
		Applicant<Person> applicant = new Applicant<>(person);
		Course.registerCourse1(applicant);
		
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		Course.registerCourse2(new Applicant<Person>(new Person()));
		Course.registerCourse2(new Applicant<Worker>(new Worker()));
//		Course.registerCourse2(new Applicant<Student>(new Student()));
//		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
//		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
	}
}
