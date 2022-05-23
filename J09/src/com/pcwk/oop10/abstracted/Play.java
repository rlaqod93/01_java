package com.pcwk.oop10.abstracted;

public abstract class Play {
//1. 상속받은 자식에서 추상메서드를 구현 강제!	
//2. 표준화(멈춤 -> stop)
	abstract void play(int pos); 
		// TODO Auto-generated method stub
		
		//추상 메서드
	
	abstract void stop(); 			//추상 메서드
	
	static void disp() {
		System.out.println("Play 일반 메서드");
	}
	
	
	
	
}
