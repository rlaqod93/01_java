package test01;

public class test09 {

	public static void main(String[] args) {
		//숫자 연산
		int x = 10 + 2 +8;
		System.out.println("x:"+x);
		
		//문자열 결합 연산
		String str1 = 10 + 2 + "8";
		System.out.println("str1:"+str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2:"+str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3:"+str3);
		
		String str4 = "10" + (2 + 8);
		System.out.println("str4:"+str4);
		
		}

}
//x:20

//str1:128

//str2:1028

//str3:1028

//str4:1010