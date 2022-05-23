package com.pcwk.time.ex02.timetask;

import java.util.Timer;
import java.util.TimerTask;

public class TimerMain {
//	데몬-
//	멀티태스킹 운영체제에서 데몬은 사용자가 직접적으로 제어하지 않고, 
//	백그라운드에서 돌면서 여러 작업을 하는 프로그램을 말한다.
//	라고 설명이 나와있습니다.
	public static void main(String[] args){
		Timer t = new Timer(true);
		
		TimerTask w1 = new Wock01();
		TimerTask w2 = new Wock02();
		
		//timer에 등록
		t.schedule(w1, 2000);//2초 뒤에 실행
		t.schedule(w2, 7000);//5초 뒤에 실행
		
		try {
			Thread.sleep(36000);//10초 뒤에 종료
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("모든 프로그램 종료");
		
		
	}

}
