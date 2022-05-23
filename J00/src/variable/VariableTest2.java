package variable;

public class VariableTest2 {
	
	public static void main(String[] args) {
		//전역변수
		VaribleTest vt = new VaribleTest();//new를 만나면 초기화가 됨
		vt.f();
		vt.f();
		vt.f();
		vt.f();
		vt.f();
		vt.f2();
		vt = new VaribleTest();
		vt.f();
		
		
	}
}
