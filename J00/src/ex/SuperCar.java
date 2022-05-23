package ex;

public class SuperCar extends Car{
	
	String mode;
	
	public SuperCar() {
		System.out.println("자식 클래스의 기본 생성자");
	}
	
	public SuperCar(String brand,String color , int price,String mode) {
		super(brand,color,price);
//		setPrice(price);
		this.mode = mode;
		
	}
	
}
