package test01;

public class TvmainM {

	public static void main(String[] args) {
		Tv t01=new Tv();
		Tv t02=new Tv();
		
		System.out.println("t01.channel:"+t01.channel);
		System.out.println("t02.channel:"+t02.channel);
		
		//채널 변경+3
		t01.channel = 3;
		System.out.println("t01 채널변경 3");
		
		System.out.println("t01.channel:"+t01.channel);
		System.out.println("t02.channel:"+t02.channel);
	}

}
//t01.channel:0
//t02.channel:0
//t01 채널변경 3
//t01.channel:3
//t02.channel:0