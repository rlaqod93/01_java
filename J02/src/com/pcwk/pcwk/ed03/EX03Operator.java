/**
 * 패키지: com.pcwk.pcwk.ed03
 * 파일:  EX003Operator.java
 * 작성자: ITSC
 */
package com.pcwk.pcwk.ed03;

/**
 * @author ITSC
 *
 */
public class EX03Operator {
//논리 부정 연산자(!)
//참(true)을 거짓으로 거짓(false)을 참으로 바꾸는 연산자

	public static void main(String[] args) {
		boolean a = true;

		System.out.println("a=" + a);
		System.out.println("!a=" + !a);// !a=false

		boolean b = false;
		System.out.println("b=" + b);
		System.out.println("b=" + !b);// !b=true

	}

}
