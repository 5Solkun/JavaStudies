package com.yedam.generic;

public interface Rentable<P,I> {
	P rent();
	I getCount();	
	

}
