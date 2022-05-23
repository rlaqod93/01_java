/**
 * 
 */
package com.pcwk.ex02.linkedlist;

import java.util.*;

public class LinkedListEx03_PrintAll {

	// 모든 데이터 출력
	public static void main(String[] args) {
		LinkedList<String> lectureList = new LinkedList<>(
				Arrays.asList("C", "JACA", "ORACLE", "WEB", "SPRING", "C"));

		// for-each:향샹된 for반복문
		for (String str : lectureList) {
			System.out.print(str + ", ");
		}
		System.out.println();

		// for반복문
		for (int i = 0; i < lectureList.size(); i++) {
			String delim = ", ";
			// 마지막에 ","제거
			if (i == lectureList.size()-1) {
				delim = " ";
			}
			System.out.print(lectureList.get(i) + delim);
		}
		System.out.println();

		// iterator
		Iterator<String> iter = lectureList.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + ",");
		}
		System.out.println();

		// 뒤에서 부터 출력 : 생성자에 출력 위치 선정:lectureList.size()
		ListIterator<String> listIterator = lectureList.listIterator(lectureList.size());
		
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous()+",");
		}
		
	}

}
//	C, JACA, ORACLE, WEB, SPRING, C, 
//	C, JACA, ORACLE, WEB, SPRING, C 
//	C,JACA,ORACLE,WEB,SPRING,C,
//	C,SPRING,WEB,ORACLE,JACA,C,