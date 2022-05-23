package test01;
public class test27 {

	public static void main(String[] args) {
//		continue문
		int total = 0;
		int num;
		//continue만나면 for에 증감식으로 간다.
		for(num=1;num<=100;num++) {
			if(num % 2 == 0) {//짝수
				continue;
			}
			System.out.println(num);
			total+=num;
		}
		System.out.println("1 ~ 100까지 홀수 합:"+total);
	}
}
//1+3+5+7+9+11+홀수만...
//1 ~ 100까지 홀수 합:2500