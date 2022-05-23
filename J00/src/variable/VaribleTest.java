package variable;

public class VaribleTest {
	//전역 변수
	//고정시키고 싶을때 static을 사용
	static int data = 0;
	void f() {
		System.out.println(++data);
	}
	
	void f2() {
		data = 20;
	}
}
