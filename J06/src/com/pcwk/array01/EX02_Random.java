package com.pcwk.array01;

public class EX02_Random {

	public static void main(String[] args) {
//		난수발생
//		난수는 실수로 나옴
//		0~9사이 난수
//		Math.random()
//		0.0<=x<1
//10*	0.0<=x<10.0
//(int)	0<=x<10
		
		//System.out.println("난수:"+Math.random());
		//System.out.println("난수:"+(Math.random()*10));
		
		//실수를 정수로 바꿈
		System.out.println("난수:"+(int)(Math.random()*10));
	}

}
