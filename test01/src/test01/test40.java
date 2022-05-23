package test01;

public class test40 {

	public static void main(String[] args) {
//		int[] score = {79,88,91,33,100,55,95};
//		1. 최대값 변수 , 최소값 변수
//		2. 배열요소를 1개씩 , 최대값과 비교
//		   배열이 최대값 보다 더크면 max=비교한 배열을 할당.
		int[]score = {79,88,91,33,100,55,95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i=1;i<score.length;i++) {
			//최대값
			if(max<score[i]) {
				max = score[i];
			}
			//최소값
			if(min>score[i]) {
				min = score[i];
			}
		}
		System.out.println("최대갑:"+max);
		System.out.println("최소값:"+min);
	}

}
//최대갑:100
//최소값:33