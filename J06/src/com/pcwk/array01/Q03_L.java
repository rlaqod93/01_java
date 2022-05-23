package com.pcwk.array01;

import java.util.Arrays;

public class Q03_L {

	public static void main(String[] args) {
		int ball[]=new int[45];
		
		for(int i=0; i<ball.length;i++) {
			ball[i]=i+1;
		}
		//System.out.println(Arrays.toString(ball));
		
		
		for(int i =0; i<6; i++ ) {
			//0.0<=x<1.0
			//0.0<=x<45.0 * 45
			//0<=x<45 (int)		
			int b =(int)(Math.random()*45);
			int tmp = ball[i];//ball[i] 과 ball[n] 자리교환
			ball[i] = ball[b];
			ball[b] = tmp;	
			
		}
		//중복되지 않는 6개 숫자
		//System.out.println(Arrays.toString(ball));
		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+".");

	}
}
}