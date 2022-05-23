/**
 * 
 */
package com.pcwk.ex01.arraylist;

import java.util.*;

public class ArrayListEx03_PrintAll {

	public static void main(String[] args) {
		ArrayList<String> lectureList = new ArrayList<>(Arrays.asList("C", "JACA", "ORACLE", "WEB", "SPRING", "C"));

		// for-each: 향상된 for
		for (String lec : lectureList) {
			System.out.print(lec + ",");
				
		}
		System.out.println("");
		
		
		//for 반복문
		for(int i = 0;i<lectureList.size();i++) {
			String delim = ", ";//마지막 ,를 삭제
			if(i==lectureList.size() -1) {
				delim = "";
			}
			System.out.print(lectureList.get(i)+delim);
		}
		System.out.println("");
		System.out.println("=============================");
		//iterator : 앞에서 부터 뒤로 반복 출력
		//while
		Iterator<String> iterator = lectureList.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+", ");
		}
		System.out.println("");
		
		//ListIterator: 뒤에서 부터 앞으로 출력
		ListIterator<String> listIterator = lectureList.listIterator(lectureList.size());//start index
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous()+", ");
		}
		
		
	}

}
