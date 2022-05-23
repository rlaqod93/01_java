/**
 * 
 */
package com.pcwk.ex02.linkedlist;

import java.util.*;

public class LinkedListEx02 {
	
	//데이터 삭제
	public static void main(String[] args) {
		
		//데이터 중복 허용
		LinkedList<String> lectLinkedList = new LinkedList<>(Arrays.asList("C","JACA", "ORACLE", "WEB", "SPRING", "C"));
		
		System.out.println("lectLinkedList"+lectLinkedList);
		
		//데이터 삭제:index
		String removeLecture = lectLinkedList.remove(0);
		System.out.println("lectLinkedList"+lectLinkedList);
		System.out.println("removeLecture"+removeLecture);
		
		//데이터 삭제
		boolean flag = lectLinkedList.remove(removeLecture);
		System.out.println("삭제유무: "+flag);
		System.out.println("lectLinkedList"+lectLinkedList);
		
		//데이터 모두 삭제
		lectLinkedList.clear();
		System.out.println("lectLinkedList: "+lectLinkedList);
	}
}
//	lectLinkedList[C, JACA, ORACLE, WEB, SPRING, C]
//	lectLinkedList[JACA, ORACLE, WEB, SPRING, C]
//	removeLectureC
//	삭제유무: true
//	lectLinkedList[JACA, ORACLE, WEB, SPRING]
//	lectLinkedList: []