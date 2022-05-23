package test01;

import java.util.Arrays;

public class test44 {

	public static void main(String[] args) {
		//sort
		int[] numArr = {7,4,5,1,3};
		
		//sort전 데이터
		for(int n : numArr) {
			System.out.print(n+",");
			
		}
		System.out.println();
		
		for(int i=0;i<numArr.length-1;i++) {
			
			for(int j=0;j<numArr.length-1;j++) {
				 if(numArr[j] > numArr[j+1]) {
					int tmp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tmp;
				}
			}
			
			System.out.println((i+1)+","+Arrays.toString(numArr));
		}

	}

}
//7,4,5,1,3,
//1,[4, 5, 1, 3, 7]
//2,[4, 1, 3, 5, 7]
//3,[1, 3, 4, 5, 7]
//4,[1, 3, 4, 5, 7]