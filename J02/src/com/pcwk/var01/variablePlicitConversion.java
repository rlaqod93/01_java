/**
 * ��Ű��: com.pcwk.var01
 * ����:  variablePlicitConversion.java
 * �ۼ���: ITSC
 */
package com.pcwk.var01;

/**
 * @author ITSC
 *
 */
public class variablePlicitConversion {
//	������ ����ȯ
//	���� ������ ū ���� , �� ������ ������ �� ������ ���� ���� �Ǵ� ���
	public static void main(String[] args) {
		byte dNum = 11;
		int iNum = dNum;//byte�� ���� int������ �ڵ� ��ȯ��
		System.out.println("dNum:" +dNum);
		System.out.println("iNum:" +iNum);
		
		//�� ������ ������ �� ������ ���� ����
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
