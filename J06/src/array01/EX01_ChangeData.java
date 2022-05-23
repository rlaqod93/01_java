package array01;

public class EX01_ChangeData {

	public static void main(String[] args) {
		// x,y 값 교환(자리 바꾸기,shuffle)
		int x = 10;
		int y = 20;
		int tmp;
		
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
		tmp = x;//0-->10
		x = y;//10-->20
		y = tmp;//0 -->10
		//고유값이 없어지지 않게 tmp에 저장함
		System.out.println("=========================");
		
		System.out.println("x:"+x);
		System.out.println("y:"+y);

	}

}
