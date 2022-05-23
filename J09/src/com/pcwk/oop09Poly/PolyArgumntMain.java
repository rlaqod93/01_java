package com.pcwk.oop09Poly;

public class PolyArgumntMain {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		
		Tv t = new Tv();
		
		buyer.buy(t);
		buyer.buy(new Computer());
		
		buyer.sunmary();
	}

}
