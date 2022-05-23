package test01;

public class test24 {

	public static void main(String[] args) {
		String medal = "Bronze";
		
		
		switch (medal) {
		case "Gold":
			System.out.println("금메달 입니다.");
			break;
		case "Silver":
			System.out.println("은메달 입니다.");
		break;
		case "Bronze":
			System.out.println("동메달 입니다.");
		break;
		default:
			System.out.println("No메달 입니다.");
		break;
		}
		
		medal = medal.toUpperCase();//모두 대문자로 변환
		System.out.println("medal:"+medal);
	}

}
//동메달 입니다.
//medal:BRONZE