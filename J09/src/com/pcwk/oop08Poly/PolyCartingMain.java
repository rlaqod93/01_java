package com.pcwk.oop08Poly;

public class PolyCartingMain {

	public static void main(String[] args) {
		// 형제관에 관계
		//Type mismatch: cannot convert from Ambulance to FireEngine
		//형변환 불가
		//FireEngine f = new FireEngine();
		//f = a;
		
		
		Car car = null;
		FireEngine fe01 = new FireEngine();
		FireEngine fe02 = new FireEngine();
		//자손타입 -> 조상타입(UP-casting) : 형변환 가능
		car = fe01;//OK
		car.drive();
		//car.warter(); 컴파일 오류
		
		//조상타입 -> 자손타입(Down-casting) : 형변환 생략 불가
		fe02 = (FireEngine) car;
		fe02.water();//water!
	}

}
