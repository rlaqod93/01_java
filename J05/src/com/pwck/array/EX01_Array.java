package com.pwck.array;

public class EX01_Array {

	public static void main(String[] args) {
		//배열 초기화시 배열의 개수를 명시하지 않음 error
		//int p[] studentId = new int[3] {101,102,103};
		
		int[] studentId = {100,101,102};
		
		System.out.println("studentId[0]:"+studentId[0]);
		System.out.println("studentId[1]:"+studentId[1]);
		System.out.println("studentId[2]:"+studentId[2]);
		
		int add = studentId[0] + studentId[1] + studentId[2];
		System.out.println("add="+add);
		
		//배열 길이 확인법
		System.out.println("배열길이:"+studentId.length);
		
		//배열에 있는 모든 값 출력 하기
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
		//
		//=를 추가하면 오류가 남
		//for(inti=0;i<=3;i++)
		for(int i=0;i<3;i++) {
			System.out.println(studentId[i]);
		}
		System.out.println("============================================================");
		
		studentId[0] = studentId[0] +100;
		studentId[1] = studentId[1] +100;
		System.out.println("studentId[0]:"+studentId[0]);//studentId[0]:200
		System.out.println("studentId[1]:"+studentId[1]);//studentId[0]:201
		
	}

}
