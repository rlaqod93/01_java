package com.pwck.loop;

import java.util.Scanner;

public class Q05_3 {

	public static void main(String[] args) {
		//Q3. 구구단의 짝수답만 출력 하도록 프로그램을 작성하세요.
	    //for(){//2-9
		//	for(){//1-9
		//
		//	}
		//}
			
			for(int i=2;i<=9;i++){
				if(i % 2 !=0) {//홀수 걸러내기! 짝수를 걸러낼려면 ==만 쓰면됨
					continue;
				}
				for(int j=1;j<=9;j++) {
					System.out.println(i +"*"+j+"="+(i*j));
				}
				System.out.println();
			}
			
		}

}
