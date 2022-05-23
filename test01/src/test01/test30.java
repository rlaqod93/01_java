package test01;

public class test30 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			sum+=num;
			System.out.println("num: "+num);
			num++;
		}while(num<=10);
//		}while(num>10); 무조건 1회는 수행
		
		System.out.println("1~10까지 합:"+sum);
	}

}
//num: 1
//num: 2
//num: 3
//num: 4
//num: 5
//num: 6
//num: 7
//num: 8
//num: 9
//num: 10
//1~10까지 합:55