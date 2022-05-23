package com.pcwk.obj08.hashCode;

public class HashCodeMain {

	public static void main(String[] args) {
		String str01 = new String("KOERA IT");
		String str02 = new String("KOERA IT");

		// equals 오버라이딩해서 데이터를 비교한다.
		// equals,hashcode로 객체 동일성 비교
		System.out.println(str01.equals(str02));// true
		System.out.println(str01.hashCode());// 1013212667
		System.out.println(str02.hashCode());// 1013212667

		// 객체의 주소값으로 해시코드를 생성하므로 객채마다 모두 다르다.
		System.out.println(System.identityHashCode(str01));// 604107971
		System.out.println(System.identityHashCode(str02));// 123961122
		
	}

}
