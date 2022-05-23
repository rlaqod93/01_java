package com.pcwk.oop04.Inter;

import java.util.Arrays;

public class CalculatorMain {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;

		// 약한 결함
		Calc cal = new Calculator();

		System.out.println("add:" + cal.add(num1, num2));
		System.out.println("substract:" + cal.substract(num1, num2));
		System.out.println("times:" + cal.times(num1, num2));
		System.out.println("divid:" + cal.divive(num1, num2));
		System.out.println("============================================");

		// default method call
		cal.description();

		// static method call
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));
		System.out.println(Calc.total(arr));

	}

}
