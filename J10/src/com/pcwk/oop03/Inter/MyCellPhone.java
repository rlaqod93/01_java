package com.pcwk.oop03.Inter;

public class MyCellPhone implements Call, Memo, Camera, Clock {

	@Override
	public void clock() {
		System.out.println("clock() 호풀");

	}

	@Override
	public void write() {
		System.out.println("wrire() 호출");
		
	}
	
	@Override
	public void calling() {
		System.out.println("calling() 호출");
		
	}
	
	@Override
	public void Photo() {
		System.out.println("photo() 호출");

	}



}
