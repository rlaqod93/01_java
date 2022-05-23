package com.pcwk.oop03;

public class StaticPratice {

	public static int num = 11;

	static {// 클래스 초기화 블럭
		// static 변수의 복잡한 초기화
		// 실제로는 많이 안씀 문법정도만 알고 있으면됨
		System.out.println("클래스 초기화 블럭");
	}

	public StaticPratice() {
		super();
		System.out.println("default생성자");
	}

	public static void say() {
		System.out.println("인스턴스를 생성하지 않고도 사용 가능.");
	}
}
