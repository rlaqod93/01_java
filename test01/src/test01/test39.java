package test01;

public class test39 {

	public static void main(String[] args) {
		int[] score = {100,88,100,100,90};
		
		int sum = 0;//합계
		float avg = 0.0f;//평균
		
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		System.out.println("합계:"+sum);
		
		avg = sum/(float)score.length;
		
		System.out.println("평균:"+avg);
	}

}
//합계:478
//평균:95.6