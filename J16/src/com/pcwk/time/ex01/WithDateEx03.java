package com.pcwk.time.ex01;

import java.time.LocalDate;
import java.util.*;

public class WithDateEx03 {
	//윤년: 1988 ~ 2030까지 윤년 구하기 
	public static void main(String[] args) {
		LocalDate localD = LocalDate.now();
		
		LocalDate newDate =null;
		
		int cnt = 0;//윤달 건수
		
		for(int i=1988;i<=2030;i++) {
			newDate = localD.withYear(i);//1988~
			if(newDate.isLeapYear()) {
				System.out.println(i+"은 윤년 입니다.");
			}
		}//--for
	}//--main

}
