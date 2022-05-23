package com.pcwk.oop03;

public class CallPhone {

	String model;//모델
	String color;//색상
	int capacity;//용량
	
	//default 생성자
	public CallPhone() {}
	
	//생성자의 역활
	//멤버변수 최기화
	//생성자 오버로딩
	public CallPhone(String parModel, String parColor, int parCapacity) {
		model = parModel;
		color = parColor;
		capacity = parCapacity;
	}
	

}
