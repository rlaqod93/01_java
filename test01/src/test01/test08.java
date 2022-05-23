package test01;

public class test08 {

	public static void main(String[] args) {
		int a = 10;
		byte b = (byte)a;
		
		System.out.println("byte강제타입변환"+b); //강제 타입 변환
		
		int c = 65;
		char d = (char)c;
		
		System.out.println("char강제타입변환"+d); //유니코드로 'A'가 출력
		
		double e = 3.14;
		int f = (int)e;
		
		System.out.println("int강제타입변환"+f); //int는 정수 부분인 3만 저장
	}

}
//byte강제타입변환10

//char강제타입변환A

//int강제타입변환3