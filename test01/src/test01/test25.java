package test01;

import java.util.Scanner;

public class test25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력(1 ~ 100):");
		
		int score = sc.nextInt();
		char grade = ' ';//학점
		
		switch (score/10) {
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
		break;
		}
		System.out.println("점수는: "+score);
		System.out.println("학점은: "+grade);
	}

}
//점수 입력(1 ~ 100):88
//점수는: 88
//학점은: B