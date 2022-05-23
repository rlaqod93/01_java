package com.pcwk.oop02;

public class EX03_FunctionMain {

	public static void main(String[] args) {
		int flrst =11;
		int second = 13;
		
		int sum=add(flrst, second);
		System.out.println(flrst + "+" + second + "=" +sum);
		
		int substract =subtracy(flrst, second);
		System.out.println(flrst + "-" + second + "=" +substract);
		
		int multi = multiply(flrst, second);
		System.out.println(flrst + "*" + second + "=" +multi);
		
		double divide = divide(flrst, second);
		System.out.println(flrst + "/" + second + "=" +divide);
		
		

	}
	
	/**
	 * 나누기
	 * @param num1
	 * @param num2
	 * @return num1 / num2
	 */
	
	public static double divide(int num1,int num2) {
		return num1/(1.0*num2);
		//return num1/(float)num2;
	}
	
	
	
	/**
	 * 곱하기
	 * @param num1
	 * @param num2
	 * @return num1*num2
	 */
	
	public static int multiply(int num1, int num2) {
		return num1*num2;
	
	}
	
	
	
	/**
	 * 빼기!
	 * @param num1
	 * @param num2
	 * @return num1 - num2
	 */
	
	public static int subtracy(int num1,int num2) {
		return num1 -num2;
	}
	
	
	
	/**
	 * 더하기!
	 * @param num1
	 * @param num2
	 * @return
	 */
	
	public static int add(int num1 , int num2) {
		int	result = 0;
		
		result = num1 + num2;
		
		return result;
	}

}
