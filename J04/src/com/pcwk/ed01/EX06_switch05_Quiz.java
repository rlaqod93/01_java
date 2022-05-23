package com.pcwk.ed01;

import java.util.Scanner;

public class EX06_switch05_Quiz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요:");
		
		int score  = scanner.nextInt();//점수	
		//System.out.println(score/10);
		char grade = ' ';//학점
		//int/int -> int
		// 91/10 -> 9
		switch(score/10) {
		case 10:
		case 9:
				grade = 'A';
			break;
		case 8:
				grade = 'B';
		break;
		case 7:
				grade = 'C';
		break;
		case 6:
				grade = 'D';
	    break;
		default:
				grade = 'F';
		}//--swith
		
		System.out.println("점수는:"+score);
		System.out.println("학점:"+grade);
	}//--main

}//--class
