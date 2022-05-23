package test01;

import java.util.Arrays;

public class test43 {

	public static void main(String[] args) {
		int[] ball = new int[45];
		//1.숫자 1 ~ 45를 할당
		//2.shuffle 6개 추출
		
		//1.
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		System.out.println(Arrays.toString(ball));
		//45개의 숫자 할당
		
		//2.
		for(int i=0;i<6;i++) {
			int n = (int)(Math.random()*45);
			System.out.println(n);//6개 숫자 랜덤으로 추출
			
			int tmp = ball[i];//ball[i],ball[n] 자리교환
			ball[i] = ball[n];
			ball[n] = tmp;
		}
		
		//중복되지 않는 6개 숫자
		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+",");
		}
	}
}
//23,17,38,2,27,8,