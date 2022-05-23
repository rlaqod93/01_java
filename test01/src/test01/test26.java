package test01;

import java.util.Scanner;

public class test26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력(1 ~ 100):");
		//95점 이상이면 +
		int score = sc.nextInt();
		char grade = ' ';//학점
		char plus = ' ';
		
		switch (score/10) {
		case 10:
		case 9:
			if(score >= 95) {
				plus = '+';
			}
			grade = 'A';
		break;
		case 8:
			if(score >= 85) {
				plus = '+';
			}
			grade = 'B';
		break;
		case 7:
			if(score >= 75) {
				plus = '+';
			}
			grade = 'C';
		break;
		case 6:
			if(score >= 65) {
				plus = '+';
			}
			grade = 'D';
		break;
		default:
			grade = 'F';
		break;
		}
		System.out.println("점수는: "+score);
		System.out.println("학점은: "+grade+plus);
	}

}
//점수 입력(1 ~ 100):76
//점수는: 76
//학점은: C+
//=====================
//점수 입력(1 ~ 100):84
//점수는: 84
//학점은: B 