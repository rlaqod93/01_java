package test01;

public class test14 {
	public static void main(String[] args) {
		//삼항 연산자
		//조건?항복1:항목2;
		int fatherAge = 23;
		int motherAge = 19;
		
		char ch = ' ';
		ch = (fatherAge>motherAge)?'T':'F';
		
		System.out.println("ch:"+ch);//ch:T

	}
}
