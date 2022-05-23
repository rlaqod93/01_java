package com.pwck.loop;

public class Q05_4 {

	public static void main(String[] args) {
//	Q04. 구구단중 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는프로그램을 만들어 보세요.

		for (int i = 2; i <= 9; i++) {// 단

			for (int j = 1; j <= 9; j++) {// 곱하는수

				if (i < j)
					break;// 반복문을 벚어 난다.

				System.out.println(i + "*" + j + "=" + (i * j));
			}
			System.out.println();
		}
	}
}
