package com.pcwk.collection.ex03.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MemberHashMain {
	// 순서 보장되지 않음
	public static void main(String[] args) {
		// Map map = new HashMap<>();//Map인터페이스 통한 객체 생성
		HashMap map = new HashMap<>();

		// 추가
		map.put("김자바", new Member(100, "김자바"));
		map.put("이자바", new Member(200, "이자바"));
		map.put("박자바", new Member(300, "박자바"));
		map.put("김자바", new Member(400, "김자바"));// Key중복 없음

		// 데이터 가져오기
		// System.out.println(map.get("김자바"));

		Set set = map.keySet();// Key값을 set형태로 return
		Iterator iter = set.iterator();

		// Key에 해당되는 value() 추출
		while (iter.hasNext()) {
			System.out.println(map.get(iter.next()));
		}

		// System.out.println(map);

	}
}

//Member [memberId=400, memberName=김자바]
//Member [memberId=300, memberName=박자바]
//Member [memberId=200, memberName=이자바]