package oop04;

public class Card {
	final int NUMBER;//상수
	final String KIND;//상수
	
	static int width = 100;
	static int heigth = 250;
	
	public Card() {
		this(1,"Heart");
	}
	
	public Card(int number, String kind) {
		super();
		NUMBER = number;
		KIND = kind;
	}

	@Override
	public String toString() {
		return "Card [NUMBER=" + NUMBER + ", KIND=" + KIND + "]";
	}
	
	final public void disp() {
		System.out.println("fial 오버라이딩 않됨");
	}
	
	
}
