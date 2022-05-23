/**
* <pre>
* com.pcwk.ex03.set
* Class Name : HashSetEx03_Contains.java
* Description:
* Author: ITSC
* Since: 2022/02/25
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/25 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.ex03.set;

import java.util.HashSet;

public class HashSetEx03_Contains {

	/**
	 * 데이터 존재 유무가 중요한 경우 사용
	 */
	public static void main(String[] args) {
		HashSet<String> lectureSet = new HashSet<>();
		// 추가
		lectureSet.add("C");
		lectureSet.add("JAVA");
		lectureSet.add("WEB");
		lectureSet.add("SPRING");

		// 있으면 : true, 그렇지 않으면 : false
		lectureSet.contains("JAVA");
		System.out.println("JAVA있나요? " + lectureSet.contains("JAVA"));// true
		System.out.println("B있나요? " + lectureSet.contains("B"));// false
		
	}

}
