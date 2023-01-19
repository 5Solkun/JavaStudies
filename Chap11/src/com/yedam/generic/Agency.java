package com.yedam.generic;

public class Agency implements Rentable<Home, RentalList> {
	@Override
	public Home rent() {
		return new Home();
	}
	
	@Override
	public RentalList getCount() {
		return new apple();
	}
}
