package test01;

import java.util.Arrays;

public class test33 {

	public static void main(String[] args) {
		// 시험점수의 평균 구하기
		
		int[] student = {100,95,90,88,93};
		int sum = 0;//합계
		
		for(int i=0;i<student.length;i++) {
			sum+=student[i];
		}
		//배열에 있는 내용 출력하기
		System.out.println(Arrays.toString(student));//[100, 95, 90, 88, 93]
		
		System.out.println("합계:"+sum);//합계:466
		System.out.println("평균:"+sum/(float)student.length);//평균:93.2
	}

}