/**
 * 
 */
package com.pcwk.ex01.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx02_Remove {
	
	// 데이터 삭제
	//다건 삭제시 뒤에서 부터 삭제해야 한다.
	public static void main(String[] args) {
		// JACA,ORACLE,WEB,SPRING,C
		//데이터 중복 허용
		ArrayList<String> lectureList = new ArrayList<>(Arrays.asList("C","JACA", "ORACLE", "WEB", "SPRING", "C"));

		//lectureList:[C, JACA, ORACLE, WEB, SPRING, C]
		System.out.println("lectureList:"+lectureList);
		
		//데이터삭제:index
		String removeLecture = lectureList.remove(0);
		System.out.println("removeLecture:"+removeLecture);
		
		//데이터 삭제
		lectureList.remove("C");
		System.out.println("lectureList:"+lectureList);
		
		
		//데이터 모두 삭제
		lectureList.clear();
		System.out.println("lectureList:"+lectureList);
		
	}

}

//lectureList:[C, JACA, ORACLE, WEB, SPRING, C]
//removeLecture:C
//lectureList:[JACA, ORACLE, WEB, SPRING]
//lectureList:[]