/**
* <pre>
* com.pcwk.util.ex01.calender
* Class Name : CalendarEx01Main.java
* Description:
* Author: ITSC
* Since: 2022/02/22
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/22 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.util.ex01.calender;

import java.util.*;

import com.pcwk.comn.LoggerManager;

public class CalendarEx01Main implements LoggerManager {

	/**
	 * Calendar
	 */
	public static void main(String[] args) {
		// Calender는 추상 클래스로 스스로 객체를 생성 할수 있다.
		// 메서드 통해서 생성한다.
		// 싱글톤으로 객체를 생성한다.
		// Calender cal = Calender();

		// 타임존은 동일한 로컬 시간을 따르는 지역을 의미하며 , 주로 해당 국가에 의해 법적으로 지정된다.

		Calendar cal01 = Calendar.getInstance();
		Calendar cal02 = Calendar.getInstance();
		// 싱글톤 여부
		LOG.debug("cal01:" + cal01.toString());
		LOG.debug("cal01:" + cal02.toString());

		// 객체동일성 확인.
		LOG.debug("cel01:" + System.identityHashCode(cal01));
		LOG.debug("cel02:" + System.identityHashCode(cal02));
		
	}

}
