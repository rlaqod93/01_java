package com.pcwk.obj01;

public class CardMain {

	public static void main(String[] args) {
		Card c01 = new Card();
		Card c02 = new Card();
		
		
		//c01 == c02.toString()
		//컴파일러가 c02.String을 호출한다.
		
		//toSting 재정의 하지않은 값
		System.out.println(c01.toString());//com.pcwk.obj01.Card@26f0a63f
		System.out.println(c02.toString());//com.pcwk.obj01.Card@4926097b
	}

}
