package array01;

import java.util.Arrays;

public class Q05_LotSort {

	public static void main(String[] args) {
			int ball[] = new int[45];
			
			//1.숫자 1~45를 할당
			//2.shuffle 6개 추출
			
			//1.
			for(int i=0; i<ball.length;i++) {
				ball[i] = i+1;
			}
			System.out.println(Arrays.toString(ball));
			
			//2.
			for(int i=0; i<6;i++) {
				//0.0<=x<1.0
				//0.0<=x<45.0 * 45
				//0<=x<45 (int)
				int n = (int)(Math.random()*45);
				//System.out.println(n);
				
				int tem = ball[i];//ball[i],ball[n] 자리교환
				ball[i] = ball[n];
				ball[n] = tem;
			}
			//중복되지 않는 6개 숫자
			//System.out.println(Arrays.toString(ball));
			for(int i=0;i<6;i++) {
				System.out.print(ball[i]+",");
			}
			System.out.println();
			//--------------------------------------------
			//sort
			//--------------------------------------------
			//1.ball 배열0번지 부터 6개 copy
			int []sortBall=new int[6];//6개
			System.arraycopy(ball, 0, sortBall, 0, sortBall.length);
			System.out.println("before sortBall:"+Arrays.toString(sortBall));
			
			//2.sort
			for(int i=0;i<sortBall.length-1;i++) {
				for(int j=0;j<sortBall.length-1-i;j++) {
					
					if(sortBall[j]>sortBall[j+1]) {
						int tmp = sortBall[j];
						sortBall[j] = sortBall[j+1];
						sortBall[j+1] = tmp;
					}
				}
				
			}//for i
			
			System.out.println("Sort Lotto =>"+Arrays.toString(sortBall));
	}

}
