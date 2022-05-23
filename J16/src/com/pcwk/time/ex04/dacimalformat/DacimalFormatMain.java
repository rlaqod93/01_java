package com.pcwk.time.ex04.dacimalformat;

import java.text.*;

public class DacimalFormatMain {

	public static void main(String[] args) {
//		DecimalFormat
//		숫자를 형식화 하는 클래스
		
		double number = 1234567.89;
		// 0 : 10진수(값이 없는 경우 0)
		// # : 10진수(있으면 출력)
		// . : 소수점
		// - : 음수
		// , : 천단위 구분자
		// E : 지수
		// % : 퍼센트
		// 통화 : \u00A4 -> W
		
		String[] pattern = {
				"0",
				"#",
				"0.0",
				"#.#",
				"000000000.0000",
				"#########.####",
				"###,###,###,####",
				"#.#%",
				"\u00A4 ###,###,###",
				
		};
		
		for(int i=0;i<pattern.length;i++) {
			DecimalFormat df = new DecimalFormat(pattern[i]);
			System.out.printf("%19s : %s \n",pattern[i],df.format(number));
		}
		
		
	}

}
