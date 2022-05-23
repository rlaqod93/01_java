package com.pcwk.time.ex08.ganrics.extendss;

public class Plastic extends Material{
		
	public void doPrinting() {
		System.out.println("plastic 재료로 출력 합니다.");
	}
	@Override
	public String toString() {
		return "재료는 Plastic 입니다.";
	}
}
