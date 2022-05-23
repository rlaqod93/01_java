package array;

public class EX02_Arrar {
	
	public static	void main(String[] arge) {
		int score01[]= {1,2,3,4,5,6,7,8,9,10};
		int sum =0;//합계
		
		System.out.println("score01.length"+score01.length);
		
		for(int i = 0;i<score01.length;i++) {
			sum=sum+score01[i];//sum+=score01; 같은선언
			System.out.println(score01[i]);
		}
		System.out.println("sum:"+sum);
	}	
}

