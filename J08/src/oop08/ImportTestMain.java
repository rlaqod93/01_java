package oop08;

import java.text.SimpleDateFormat;
import java.util.Date;
//Ctrl+Shift+O
//Ctrl+Shift+F
//import문 정리
public class ImportTestMain {

	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");//년-월-일
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");//시:분:초 오전/오후
		
		System.out.println("today:"+today);
		System.out.println("오늘 날짜:"+date.format(today));
		System.out.println("현재 시간:"+time.format(today));

	}

}
