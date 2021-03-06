package com.pcwk.oop04;

public class Card {
	//final을 클래스에 붙히면 상속 받을 수 없다.
	final int NUMBER ; //상수
	final String KIND; //상수
	
	static int width = 100;
	static int heigth = 250;
	
	
	public Card() {
		this("Heart",1);
	}
	
	public Card(String kind,int number) {
		NUMBER = number;
		KIND = kind;
	}

	@Override
	public String toString() {
		return "Card [NUMBER=" + NUMBER + ", KIND=" + KIND + "]";
	}
	
	final public void disp() {
		System.out.println("final 오버라이딩 않됨");
	}
	
}
