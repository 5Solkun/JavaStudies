package cma.yedam.java.ch02_1;

public class CastingExample {
public static void main(String[] args) {
	Parent parent =new Child();
	parent.method1();
	parent.method2();
	
	System.out.println();
	
	Child child = (Child)parent;
	
	child.method1();
	child.method2();
	child.method3();
	Parent ch = new Parent();
	
	if(ch instanceof Child) {
		Parent pa =new Parent();
		ch.method1();
		ch.method2();
		ch.method3();
	}
	else {
		System.out.println("옳은 메서드가 아닙니다");
	}
}
}
