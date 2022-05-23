package com.pwck.array;

public class EX09_Q01 {

	public static void main(String[] args) {
		// Q1. int[] score = {100,88,100,100,90}에 종합과 평균을 구하세요.

		int[] score = { 100, 88, 100, 100, 90 };
		
		int sum = 0;//총점
		float avg = 0.0f;//평균
		
		for(int num :score) {
			sum+=num;
		}
		System.out.println("합계:"+sum);
		avg = sum/(float)score.length;
		
		System.out.println("평균:"+avg);
//		밑 보기는 정수 실수를 표현할려면 float를 추가해줘야됨!
//		for (int i = 0; i < score.length; i++) {
//			sum += score[i];
//		}
//
//		System.out.println("총합" + sum);
//		System.out.println("평균" + (sum / score.length));

	}

}
//합계:478
//평균:95.6