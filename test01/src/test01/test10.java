package test01;

public class test10 {

	public static void main(String[] args) {
		int i = Integer.parseInt("10");
		double d = Double.parseDouble("3.14");
		boolean b = Boolean.parseBoolean("true");
		
		System.out.println("int:"+i);
		System.out.println("double:"+d);
		System.out.println("boolean:"+b);
		
		System.out.println("=====================");
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1:"+str1);
		System.out.println("str2:"+str2);
		System.out.println("str3:"+str3);
	}

}
//int:10
//double:3.14
//boolean:true
//=====================
//str1:10
//str2:3.14
//str3:true