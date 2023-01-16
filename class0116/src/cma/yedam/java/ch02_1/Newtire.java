package cma.yedam.java.ch02_1;

public class Newtire extends Tire {

	public Newtire(String location, int maxRotation) {
		super(location, maxRotation);
		}
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "New타이어수명 " + (maxRotation-accumulatedRotation)+"회");
			return true;
		}
		else {
			System.out.println("***"+location+"New타이어펑크**");
			return false;
		}
	}
	
}
