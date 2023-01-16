package cma.yedam.java.ch02_1;

public class Car {
	Tire FLtire=new Tire("FL",20);
	Tire FRtire=new Tire("FR",10);
	Tire BLtire=new Tire("BL",5);
	Tire BRtire=new Tire("BR",7);
	
	int run() {
		System.out.println("차량 운행중");
		if(FLtire.roll()==false) 
			{stop(); return 1;}
		if(FRtire.roll()==false) 
		{stop(); return 2;}
		if(BLtire.roll()==false) 
		{stop(); return 3;}
		if(BRtire.roll()==false) 
		{stop(); return 4;}
		return 0;
	}
	void stop() {
		System.out.println("차량 멈춤");
	}
}
