package com.pcwk.obj04.cloce;

public class PointMain {

	public static void main(String[] args) {
		Point orgPonit=new Point(11, 13);
		
		
		Point copyPoint = (Point) orgPonit.clone();
		
		//Point toString() 오버라이드
		System.out.println(orgPonit);
		
		//clone()이후 멤버값
		System.out.println(copyPoint);

	}

}
