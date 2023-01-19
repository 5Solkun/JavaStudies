package com.yedam.homework;

public class EmpDept extends Employee {
	private String depart;
	public EmpDept(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}
	public String getDepartment() {
		return depart;
	}
	public void getInformation() {
		System.out.printf("이름 : %s  연봉 : %d  부서 : %s\n",getName(),getSalary(),depart);
	}
	public void print() {
		System.out.println("수퍼클래스");
		System.out.println("서브클래스");
	}
}
