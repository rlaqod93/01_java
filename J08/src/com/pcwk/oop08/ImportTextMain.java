package com.pcwk.oop08;

import java.text.SimpleDateFormat;
import java.util.Date;

//Ctrl+Shift+O import 정리
//Ctrl+Shift+F 소스 정리
//import문 정리 명령어
public class ImportTextMain {

	public static void main(String[] args) {

		Date today = new Date();

		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");// 년-월-일
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");// 시:분:초 오전/오후

		System.out.println("today:" + today);
		System.out.println("오늘 날짜:" + date.format(today));
		System.out.println("현재 시간:" + time.format(today));

	}

}
//Local PC시간
//today:Mon Feb 14 14:31:56 KST 2022
//오늘 날짜:2022/02/14
//현재 시간:02:31:56 오후