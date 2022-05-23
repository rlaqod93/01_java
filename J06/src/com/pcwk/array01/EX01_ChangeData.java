package com.pcwk.array01;

public class EX01_ChangeData {

	public static void main(String[] args) {
		// x,y 갑 교환(자리 바꾸기 ,shuffle)

		int x = 10;
		int y = 20;
		int tmp;
		
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
		
		tmp = x;// tmp=10
		x = y;// x=20
		y = tmp;// y=10
		
		System.out.println("====================");
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}

}
