/**
 * 
 */
package com.pcwk.ed01;

/**
 * @author ITSC
 *
 */
public class EX01_Operator {

	// � �� ������,==,!=
	public static void main(String[] args) {
		double a = 3.14;
		double b = 5.14;

		System.out.println(a == b);// false
		System.out.println(a != b);// true

		String c01 = "Hello JAVA";
		// ���ڿ��� �� : ��ҹ��� ����
		System.out.println(c01.equals("Hello JAVA"));// true

		System.out.println(c01.equals("Hello jAVA"));// false

	}

}
