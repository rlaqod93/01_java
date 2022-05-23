package test01;

public class test03 {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		
		System.out.println("x:"+x+", y:"+y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:"+x+", x:"+y);
	}
}
//x:3, y:5

//x:5, x:3