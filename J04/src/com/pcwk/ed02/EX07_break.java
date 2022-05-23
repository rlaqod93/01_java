package com.pcwk.ed02;

public class EX07_break {

	public static void main(String[] args) {
//	반복문에서 break문을 만나면 더 이상 반복을 수행하지 않고
//	반복문을 빠져 나온다.(반복문 1개를 벚어 난다.)
//		
//	0부터 시작해서 1씩 늘리면서 합을 계산할 떄 숫자를 몇까지 더하면
//	100이 넘는지 알고 싶습니다.
		
		int sum = 0;//합계
		int i = 0;//증가
//			true를 사용해서 가능 없어도 true
		for(i=0;true;i++) {
			sum+=i;
			if(sum>=100) {
				break;
			}
		}
		System.out.println("sum: "+sum);
		System.out.println("i: "+i);

	}

}
