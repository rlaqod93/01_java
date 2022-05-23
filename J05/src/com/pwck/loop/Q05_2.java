package com.pwck.loop;

import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;

public class Q05_2 {

	public static void main(String[] args) {
//		Q1 . 두수를 입력받아 사칙 연산을 수행하는 프로그램을 작성 하세요.
//		(입력은 int로 받으세요 , switch문으로 작성하세요.)
			System.out.println("num1을 입력 하세요:");
			Scanner scanner = new Scanner(System.in);
			
			int num1 = scanner.nextInt();
			System.out.println("num2를 입력하세요:");
			int num2 = scanner.nextInt();
			
			String operator = " ";//연산자
			//정수 int도 가능 하지만 소수점이 안나옴
			double result = 0;//연산결과
			System.out.println("연사기호를 입력하세요:");
			//nextLine() : 위쪽 Enter에 영향을 받음.
			//-->next()로 변경.
			operator = scanner.next();
				
				switch(operator) {
				case"+":
					result = num1 + num2;
					break;
				case"-":
					result = num1 - num2;
					break;
				case"*":
					result = num1 * num2;
					break;
				case"/":
					result = num1 / (double) num2;
					break;
				default:
					System.out.println("연산자를 확인 하세요.");
					return;
				}//					char일때는 "" 사용해줘야 실행이됨 string일때는 안써두됨 
			System.out.println(num1+(""+operator)+num2+"="+result);							
	}
}
