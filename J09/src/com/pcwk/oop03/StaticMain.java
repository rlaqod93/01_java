package com.pcwk.oop03;

public class StaticMain {

	public static void main(String[] args) {
		StaticPratice.say();
		System.out.println("num:" + StaticPratice.num);
		System.out.println("==========================");
		StaticPratice sp = new StaticPratice();
		
		
	}

}
//클래스 초기화 블럭
//인스턴스를 생성하지 않고도 사용 가능.
//num:11
//==========================
//default생성자
