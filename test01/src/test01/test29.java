package test01;

public class test29 {
	public static void main(String[] args) {
		int num;//숫자(증가)
		int sum;//합계
		
		//초기화
		num = 1;
		sum = 0;
		
		while(num<=10) {
			sum+=num;//sum = sum+num;
			System.out.println(num);
			++num; // num = num+1
		}
		System.out.println("sum: "+sum);
	}
}
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
//sum: 55
//num이 1씩증가 1 ~ 10 까지 간다음에 10때 멈춤 총합이:55