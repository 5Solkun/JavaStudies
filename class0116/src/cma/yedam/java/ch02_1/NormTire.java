package cma.yedam.java.ch02_1;

public class NormTire extends Tire {
	public NormTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "Norm타이어수명 " + (maxRotation-accumulatedRotation)+"회");
			return true;
		}
		else {
			System.out.println("***"+location+"Norm타이어펑크**");
			return false;
		}
	}
}
