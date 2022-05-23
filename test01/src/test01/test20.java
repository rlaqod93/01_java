package test01;

public class test20 {

	public static void main(String[] args) {
		int a = 77;
		int b = 88;
		
		int max = 0;//최대값
		if(a>b) {
			max = a;
		}else {
			max = b;
		}
		System.out.println("max:"+max);
		//max:88
		
		max = (a>b)?a:b;
		System.out.println("max:"+max);
		//max:88
	}

}
