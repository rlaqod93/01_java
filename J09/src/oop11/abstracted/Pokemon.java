package oop11.abstracted;

/**
 * Pokemon 추상클래스
 * @author pc
 *
 */

public abstract class Pokemon {
	String name;
	
	abstract void attack();//공격 추상 메서드
	abstract void sound();//소리 추상 메서드
	
	public String getNmae() {
		return name;
	}
	
	
}
