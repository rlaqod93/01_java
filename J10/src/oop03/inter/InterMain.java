package oop03.inter;

public class InterMain {

	public static void main(String[] args) {
		MyCellphone phone01 = new MyCellphone();
		
		//다형성
		Camera camera = new MyCellphone();
		Call call = new MyCellphone();
		Memo memo = new MyCellphone();
		Clock clock = new MyCellphone();
		
		PhoneUser phoneUser = new PhoneUser();
		phoneUser.call(phone01);
		
		phoneUser.call(call);

	}

}
//전화를 겁니다.
//calling() 호출
//전화를 겁니다.
//calling() 호출