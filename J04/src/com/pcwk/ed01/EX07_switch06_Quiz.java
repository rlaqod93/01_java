package com.pcwk.ed01;

import java.util.Scanner;

public class EX07_switch06_Quiz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요:");
		//95점 이상이면 
		//+
		
		int score  = scanner.nextInt();//점수	
		//System.out.println(score/10);
		char grade = ' ';//학점
		char plus = ' ';
		
		//int/int -> int
		// 91/10 -> 9
		
		switch(score/10) {
		case 10:
		case 9:
			if(score>=95) {
				plus = '+';
			}
				grade = 'A';
			break;
		case 8:
			if(score>=85) {
				plus = '+';
			}
				grade = 'B';
		break;
		case 7:
			if(score>=75) {
				plus = '+';
			}
				grade = 'C';
		break;
		case 6:
			if(score>=65) {
				plus = '+';
			}
				grade = 'D';
	    break;
		default:
				grade = 'F';
		}//--swith
		
		System.out.println("점수는:"+score);
		System.out.println("학점:"+grade+plus);
	}//--main

}//--class
