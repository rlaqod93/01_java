package com.pcwk.oop05.Inner;

public class A {
	
	class InstanceInner{}//인스턴스 클래스
	static class StaticInnr{}//스태틱 클래스
	
	InstanceInner iInner = new InstanceInner();//인스턴스 클래스 생성
	
	StaticInnr sInner = new StaticInnr();//스태틱 클래스 생성
	
	void instanceMethod() {
		
		InstanceInner iInner = new InstanceInner();//인스턴스 클래스 생성
		
		StaticInnr sInner = new StaticInnr();//스태틱 클래스 생성
		
	}
	
	static void staticMethod() {
		//인스턴스 멤버에 접근 불가
		//InstanceInner iInner = new InstanceInner();//인스턴스 클래스 생성
		
		StaticInnr sInner = new StaticInnr();//스태틱 클래스 생성
		
	}
	
	
}
