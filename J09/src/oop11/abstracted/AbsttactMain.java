package oop11.abstracted;

public class AbsttactMain {

	public static void main(String[] args) {
		Pikachu pikachu = new Pikachu();
		System.out.println("이 포켓몬은:"+pikachu.getNmae());
		pikachu.sound();
		pikachu.attack();
		
		System.out.println("==============================");
		Squirtle squirtle = new Squirtle();
		System.out.println("이 포켓몬은:"+squirtle.getNmae());
		squirtle.sound();
		squirtle.attack();

	}

}
