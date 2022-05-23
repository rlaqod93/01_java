/**
 * 패키지: com.pcwk.var01
 * 파일:  variablePlicitConversion.java
 * 작성자: ITSC
 */
package com.pcwk.var01;

/**
 * @author ITSC
 *
 */
public class variablePlicitConversion {
//	묵시적 형변환
//	작은 수에서 큰 수로 , 덜 정밀한 수에서 더 정밀한 수로 대입 되는 경우
	public static void main(String[] args) {
		byte dNum = 11;
		int iNum = dNum;//byte형 가비 int형으로 자동 변환됨
		System.out.println("dNum:" +dNum);
		System.out.println("iNum:" +iNum);
		
		//덜 정밀한 수에서 더 정밀한 수로 대입
		int iNum02 = 14;
		float fNum = iNum02;
		System.out.println("iNum02:"+iNum02);//14
		System.out.println("fNum:"+fNum);//14.0
		
		
		double dNum02;
		//		14.0 + 11 - > 14.0 + 11.0
		dNum02 = fNum + iNum; 
		System.out.println("fNum + iNum ="+dNum02);//25.0
		
	}

}
