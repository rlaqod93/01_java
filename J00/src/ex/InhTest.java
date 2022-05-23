package ex;

class A{
	int data = 10;
	
	public A() {
		System.out.println("부모 클래스 생성자");
	}
	
	void show() {
		System.out.println("A 클래스");
	}
	
}

class B extends A{
	
	@Override
	void show() {
		System.out.println("B 클래스");
	}
	
	
	void check() {
		show();
	}
	
	
}


public class InhTest{
	public static void main(String[] args) {
		B i = new B();
		i.check();
	
	}
	
}
