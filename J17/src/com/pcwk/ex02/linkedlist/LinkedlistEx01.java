/**
 * 
 */
package com.pcwk.ex02.linkedlist;

import java.util.LinkedList;

public class LinkedlistEx01 {

	// LinkedLinst나 ArrayList사용 방법은 통일
	// 추가 변경
	public static void main(String[] args) {
		LinkedList<String> linkedList01 = new LinkedList<>();

		// 객체 추가 : 리스트에 끝에 추가
		linkedList01.add("JAVA");
		linkedList01.add("ORACLE");
		linkedList01.add("WEB");

		// 특정위치에 추가
		linkedList01.add(0, "C");

		System.out.println("linkedList01: " + linkedList01);

		// 값 변경:set
		linkedList01.set(0, "B");
		System.out.println("linkedList01: " + linkedList01);

	}

}
//linkedList01: [C, JAVA, ORACLE, WEB]
//linkedList01: [B, JAVA, ORACLE, WEB]