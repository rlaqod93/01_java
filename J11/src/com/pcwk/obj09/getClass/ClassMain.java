package com.pcwk.obj09.getClass;

public class ClassMain {

	public static void main(String[] args) {
		Card c01 = new Card("HEART", 3);
		System.out.println(c01);
		
		
		//Class cobj = card.class
		try {
			Card c02=Card.class.newInstance();//default 생성자를 통해 객체 생성!
			
			System.out.println(c02);
		} catch (InstantiationException e) {
			
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
		}
				
		Class cobj = c01.getClass();
		//클래스 이름
		System.out.println(cobj.getName());//com.pcwk.obj09.getClass.Card
		System.out.println(cobj.toString());//class com.pcwk.obj09.getClass.Card
		
		
	}

}
