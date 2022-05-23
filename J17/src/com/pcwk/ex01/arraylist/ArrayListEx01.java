/**
 * 
 */
package com.pcwk.ex01.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx01 {

	public static void main(String[] args) {
//		ArrayList<Integer> integer1 = new ArrayList<Integer>();//타입지정
//		ArrayList<Integer> integer2 = new ArrayList<>();//타입 생략 가능
//		ArrayList<Integer> integer3 = new ArrayList<>(10);// 초기 용량(Capacity) 설정
//		ArrayList<Integer> integer4 = new ArrayList<>(integer1);// 다른 Collectioc값으로 초기화
//		ArrayList<Integer> integer5 = new ArrayList<>(Array.asList(1,2,3,4,5));//Array.asList()
//		순서보장.

		List<String> list01 = new ArrayList<>();
		// 객체 추가: 리스트의 끝에 추가
		list01.add("JAVA");
		list01.add("ORACLE");

		// 특징 index에 추가 : 그 인덱스 부터의 값들이 1칸씩 밀린다.
		list01.add(0, "C");

		// 값 변경 : set
		list01.set(0, "B");

		System.out.println("list01:" + list01.toString());// list:[JAVA, ORACLE]
	}

}
