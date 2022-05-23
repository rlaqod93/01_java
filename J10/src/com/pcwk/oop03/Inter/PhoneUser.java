package com.pcwk.oop03.Inter;

public class PhoneUser {
	
	public PhoneUser() {}
	void call(Call c) {
		System.out.println("전화를 겁니다.");
		c.calling();
	}
	
}
