package test01;

public class test32 {

	public static void main(String[] args) {
		int score01[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;//합계
		
		System.out.println("score01.length:"+score01.length);//score01.length:10
		
		for(int i=0;i<score01.length;i++) {
			sum+=score01[i];//sum = sum+score01;
			System.out.println("score01[i]"+score01[i]);
//			score01[i]1
//			score01[i]2
//			score01[i]3
//			score01[i]4
//			score01[i]5
//			score01[i]6
//			score01[i]7
//			score01[i]8
//			score01[i]9
//			score01[i]10
		}
		System.out.println("sum:"+sum);
		//sum:55
	}
}