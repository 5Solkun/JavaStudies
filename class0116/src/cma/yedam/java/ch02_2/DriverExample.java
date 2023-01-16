package cma.yedam.java.ch02_2;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Bus());
		driver.drive(new Vehicle());
		driver.drive(new Taxi());
	}
}
