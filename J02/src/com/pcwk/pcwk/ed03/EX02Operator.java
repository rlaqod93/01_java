/**
 * ��Ű��: com.pcwk.pcwk.ed03
 * ����:  EX02Operator.java
 * �ۼ���: ITSC
 */
package com.pcwk.pcwk.ed03;

//���� ������
//1��ŭ ���ϰų� , 1��ŭ �� �� ���
//���� ��/�� ��ġ�� ���� ������ ����� �޶����� ��.

public class EX02Operator {
	public static void main(String[] args) {
		int gameScore = 150;

		int lastScore01 = ++gameScore;
		// lastScore01:151
		System.out.println("lastScore01:" + lastScore01);

		int lastScore02 = --gameScore;
		// lastScore02:150
		System.out.println("lastScore02:" + lastScore02);

		int lastScore03 = gameScore++;
		// lastScore03:150,gameScore:151
		System.out.println("lastScore03:" + lastScore03);

		int lastScore04 = gameScore--;
		// lastScore04:151,gameScoe:150
		System.out.println("lastScore04:" + lastScore04);

	}
}
