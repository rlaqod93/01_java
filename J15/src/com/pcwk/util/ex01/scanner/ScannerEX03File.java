/**
* <pre>
* com.pcwk.util.ex01.scanner
* Class Name : ScannerEX03File.java
* Description:
* Author: ITSC
* Since: 2022/02/23
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/23 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.util.ex01.scanner;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEX03File {

//	100,100,100 한줄을 읽는다. 100,100,100 -> 100 100 100
//	200,200,200	
//	300,300,300
//	400,400,400
//	500,500,500

	public static void main(String[] args) {
		// "C:\\DCOM_20220127\\01_JAVA\\workspace\\J15\\src\\com\\pcwk\\util\\ex01\\scanner\\data00array.txt"
		try {
			Scanner scanner = new Scanner(new File(
					"C:\\DCOM_20220127\\01_JAVA\\workspace\\J15\\src\\com\\pcwk\\util\\ex01\\scanner\\data00array.txt"));
			int totalSum = 0;// 총합
			int cnt = 0;// 건수

			while (scanner.hasNextLine()) {// 데이터가 있는 라인이 있으면 true , 그렇지 않으면 false
				String line = scanner.nextLine();// 100,100,100
				//System.out.println(line);

				// 데이터를 "," 기준으로 자르기
				Scanner sc02 = new Scanner(line).useDelimiter(",");
				int sum = 0;
				while(sc02.hasNextInt() == true) {
					sum+=sc02.nextInt();
				}//--while inner
				System.out.println("sum(Line) :"+sum);
				totalSum +=sum;
				cnt++;//읽은 Line수
			}//while outer
			
			System.out.print("Line:"+cnt);
			System.out.println("  총합:"+totalSum);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("file read성공!");

	}

}
