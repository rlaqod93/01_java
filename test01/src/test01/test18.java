package test01;

public class test18 {

	public static void main(String[] args) {
		int age = 8; //나이
		int charge = 0;//요금
		
		if(age < 8) {
			charge = 1000;
		}else if(age < 14) {
			charge = 2000;
		}else if(age < 20) {
			charge = 4000;
		}else {
			charge = 6000;
		}
		System.out.println("나이는:"+age);
		System.out.println("요금은:"+charge);
	}

}
//나이는:8
//요금은:2000