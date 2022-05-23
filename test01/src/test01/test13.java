package test01;

public class test13 {
	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
//      논리 곱(&&)은 두 항이 모두 true일 때만 결과가 true
		boolean flag = ((num1 = num1+10)<10) && ((i=i+2)<10);
		
		System.out.println("flag:"+flag);//false
		System.out.println("num1:"+num1);//20
		System.out.println("i:"+i);//2
		
//		논리 합(||)은 두항이 모두 false 일때만 fals
		flag = ((num1 = num1+10)>=10)||((i=i+2)<10);

		
		System.out.println("flag:"+flag);//true
		System.out.println("num1:"+num1);//30
		System.out.println("i:"+i);//2
		
		
		//논리 연산자(&&,||)
		int age01 = 11;
		int age02 = 13;
//						  true    &&   true    -> true
//						  false   &&   true    -> false
		boolean flag1 = (age01>0) && (age02>0);
		System.out.println(flag1);
		
//					true  ||  false  -> true
		flag1 = (age01>0) || (age02<0);
		System.out.println(flag1);
		
	}
}
