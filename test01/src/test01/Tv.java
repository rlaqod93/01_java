package test01;

public class Tv {
	//변수:인스턴스 변수
	boolean power; //전원상태
	int volume;//소리
	int channel;//채널
	
	//메서드
	void channelUP() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	void power() {
		power =! power;
	}
	void volumeUP() {
		volume++;
	}
	void volumeDown() {
		volume--;
	}
}