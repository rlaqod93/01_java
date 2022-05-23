package test01;

public class FunctionMain {

	public static void main(String[] args) {
		int first = 11;
		int second = 13;
		
		int sum = add(first,second);
		System.out.println(first+"+"+second+"="+sum);
	}

	private static int add(int num1, int num2) {
		int result = 0;
		
		result = num1 + num2;
		
		return result;
	}
	
}
//11+13=24