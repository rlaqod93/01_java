package com.pcwk.oop03;

public class CallPhoneMain {

	public static void main(String[] args) {
		//Default생성자
		CallPhone celPhone=new CallPhone();
		
		//인자 3개 생성자
		CallPhone cel02 = new CallPhone("iPhone13","Silver",512);
		
		System.out.println(cel02.model);
		System.out.println(cel02.color);
		System.out.println(cel02.capacity);

	}

}
