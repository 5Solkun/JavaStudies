package coma.yedam.chap02;

public class valuable04 {
	public static void main(String[] args) {
		String name="홍길동";
		String job="프로그래머";
		System.out.println(name);       
		System.out.println(job);
		
		//이스케이프 문자
		// string 사용
		//\t : tab
		//\n : enter
		//\r : 맨앞줄로 이동,
		System.out.println("번호\t이름\t직업");
		System.out.println("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다");
		System.out.println("봄\\여름\\가을\\겨울");
		
		//실수
		//float, double
		float var1 = 3.141592f;
		double var2 = 3.14;
		
		float var3= 0.123456789012345678901234567890123456789f;
		double var4= 0.123456789012345678901234567890123456789;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		double var6=3e6;
		float var7 = 3e-3F;
		System.out.println(var6);
		System.out.println(var7);
		
		//논리타입(boolean)
		boolean stop = false;
		if(stop) {
			System.out.println("중지합니다.");
		}
		else {
			System.out.println("시작핮니다");
		}
		
	}
}
