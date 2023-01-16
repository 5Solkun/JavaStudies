package cma.yedam.java.ch02_1;

public class CarExample {
	public static void main(String[] args) {
		Car car= new Car();
		for(int i=1; i<20;i++) {
			int problemLocation =car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("FL교체");
				car.FLtire=new Newtire("FL",15);
				break;
			case 2:
				System.out.println("FR교체");
				car.FRtire=new Newtire("FR",15);
				break;
			case 3:
				System.out.println("BL교체");
				car.BLtire=new Newtire("BL",15);
				break;
			case 4:
				System.out.println("FL교체");
				car.BRtire=new NormTire("BR",15);
				break;
			}
		}
		System.out.println("=====================");
	}
}
