package com.pcwk.exception.ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.pcwk.comn.LoggerManager;

//LoggerManager LOG위해 implements
public class CheckedExceptionMain implements LoggerManager {

	public static void main(String[] args) {
		LOG.debug("=============================");
		// checked예외
		// 예외 처리를 하지 않으면 Compile 오류

		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// printStackTrace() : 예외 당시 호출스택(call Stack)에 있었던 메서드의
			// 정보와 예외 메세지를 화면에 출력 한다.

			// getMessage() : 발생한 예외클래스의 인스턴스에 저장된 메세지를 얻을 수 있다.
			LOG.debug("getMessage:" + e.getMessage());
			// e.printStackTrace();
		}

	}

}
