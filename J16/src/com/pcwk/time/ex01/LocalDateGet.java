package com.pcwk.time.ex01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateGet {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();// 현재날짜
		System.out.println("=============");
		System.out.println("today:" + today);
		// 년,월,일 : getXXX()
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();

		System.out.println("year:" + year);
		System.out.println("month:" + month);
		System.out.println("day:" + day);
		System.out.println("=============");

		LocalTime time = LocalTime.now();// 현재시간
		System.out.println("time:" + time.toString());
		// 시,분,초 : getXXX()

		int hour = time.getHour();
		int minutes = time.getMinute();
		int second = time.getSecond();
		System.out.println("hour:" + hour);
		System.out.println("minutes:" + minutes);
		System.out.println("second:" + second);
		System.out.println("=============");
		
		//zone
		ZoneId zid = ZoneId.of("Asia/Seoul");//+09:00 ->그리니치 차이
		ZonedDateTime zdt = ZonedDateTime.now().withZoneSameInstant(zid);
		System.out.println(zdt);
		
		//현재 시간대의 뉴욕
		ZoneId nyId = ZoneId.of("America/New_York");
		ZonedDateTime nyZdt = ZonedDateTime.now().withZoneSameInstant(nyId);
		System.out.println(nyZdt);
		
		
		
		
		
	}

}
