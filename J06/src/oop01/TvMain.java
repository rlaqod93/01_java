package oop01;

public class TvMain {

	public static void main(String[] args) {
		Tv t;//Tv 인스턴스를 참조하기 위한 변수 t
		t = new Tv();//Tv 인스턴스를 생성
		
		System.out.println("전원:"+t.power);
		t.power();//전원켜기
		System.out.println("전원:"+t.power);
		
		t.volume = 11;
		t.channel = 3;//tvN
		
		System.out.println("볼륨:"+t.volume);
		System.out.println("현재 채널:"+t.channel);
		
		//메서드 호출
		t.channelUp();
		System.out.println("현 채널:"+t.channel);
		
		//전원off
		t.power();
		System.out.println("전원"+t.power);
		

	}

}
