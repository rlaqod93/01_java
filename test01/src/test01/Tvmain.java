package test01;

import java.awt.font.TextAttribute;

public class Tvmain {

	public static void main(String[] args) {
		Tv t;//Tv 인스턴스를 참조하기 위한 변수
		t = new Tv();//Tv 인스턴스를 생성
		
		System.out.println("전원:"+t.power);//전원:false
		t.power();//전원 켜기
		System.out.println("전원:"+t.power);//전원:true
		
		t.channel = 3;//tvN
		t.volume = 11;
		
		System.out.println("현 채널:"+t.channel);//현 채널:3
		System.out.println("볼륨:"+t.volume);//볼륨:11
		
		//메서드 호출
		t.channelUP();
		System.out.println("현 채널:"+t.channel);//현 채널:4
		
		//전원off
		t.power();
		System.out.println("전원:"+t.power);//전원:false
	}

}
//전원:false
//전원:true
//현 채널:3
//볼륨:11
//현 채널:4
//전원:false