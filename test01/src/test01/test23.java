package test01;

import java.util.Scanner;

public class test23 {

	public static void main(String[] args) {
		//console입력
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력:");
		
		int year = 2000;//년도
		int month = 1;//월
		
		month = sc.nextInt();
		
		int day = 0;//일수
		
		switch(month) {
			case 4:
			case 6:
			case 9:
			case 11:
				day = 30;
			break;
			case 2:
//				4로 나누어 떨어지면 윤년 100으로 나누어 떨어지지 않으면 윤년
//				400으로 나누어 떨어지면 윤년
//				year % 4 == 0 && year % 100 != 0 || year % 400 == 0
				if((year%4==0 && year%100 !=0) || (year%400 == 0)) {//윤달
					day = 29;
				}else {//평달
					day = 28;
				}
				break;
			default:
				day = 31;
			break;
		}
		System.out.println("월:"+month);
		System.out.println("일수:"+day);
	}
}
//월 입력:2
//월:2
//일수:29
//년도를 바꾸면 데이타가 달라짐