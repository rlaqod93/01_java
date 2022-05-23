package test01;

public class test12 {

	public static void main(String[] args) {
		//등가 비교 연산자, == , !=
		//문자열의 비교 equals()
		
		double a = 3.14;
		double b = 5.14;
		
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		
		String c01 = "Hello JAVA";
		//문자열의 비교 : 대소문자 구분
		System.out.println(c01.equals("Hello JAVA"));//true
		System.out.println(c01.equals("Hello java"));//false

	}

}
