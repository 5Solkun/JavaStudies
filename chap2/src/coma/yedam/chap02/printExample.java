package coma.yedam.chap02;

public class printExample {
public static void main(String[] args) {
	System.out.println("출력과 동시에 행을변경");
	System.out.print("출력만함");
	System.out.printf("이름 : %s , 나이 :%d 온도: %f\n","홍길동",20,0.9);
	
	//printf 
	int val=123;
	System.out.printf("상품의가격: %d원\n", val);
	System.out.printf("상품의가격: %6d원\n", val);
	System.out.printf("상품의가격: %-6d원\n", val);
	System.out.printf("상품의가격: %06d원\n", val);
	
	
	double area = 3.14*10*10;
	System.out.printf("반지름이 %d인 원의 넓이:%6.2f",10,area);
	System.out.printf("%6d | %-10s | %10s\n",1,"홍길동","도적");
}
}
