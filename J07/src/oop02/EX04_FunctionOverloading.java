package oop02;

public class EX04_FunctionOverloading {

	public static void main(String[] args) {
		System.out.println(sum(1,3));
		System.out.println(sum(1, 2, 3));

	}
	/**
	 * 인자가 세개인 경우
	 * @param a
	 * @param b
	 * @param c
	 * @return a+b+c
	 */
	static int sum(int a, int b, int c ) {
		System.out.println("인자가 세개인 경우 호출");
		return a+b+c;
		
	}
	
	
	
	/**
	 * 인자 2개 sum
	 * @param a
	 * @param b
	 * @return a+b
	 */
	static int sum(int a, int b) {
		int result = 0;
		System.out.println("인자가 두개인 경우 호출");
		result = a + b;
		
		return result;
		
	}

}
