package ed01;

public class EX05_Switch04 {

	public static void main(String[] args) {
		
		String medal = "GOLD";
		
		medal = medal.toUpperCase();//모두 대문자로 변환
		//단축키 ctrl + shift + x (소문자 -> 대문자)
		//     ctrl + shift + y (대문자 -> 소문자)
		System.out.println("medal:"+medal);
		switch (medal) {
		case "GOLD":
			System.out.println("금메달 입니다.");
			break;
			
		case "SILVER":
			System.out.println("은메달 입니다.");
			break;
		case "BRONZE":
			System.out.println("동메달 입니다.");
			break;
		default:
			System.out.println("No메달 입니다.");
			break;
		}
	}

}
