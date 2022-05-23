package ed01;

import java.util.Scanner;

public class EX01_NestedIf {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("아이디를 입력 하세요:");
		String userid = scanner.nextLine();
		//밑에 명령어를 빼도 시스템 상에는 문제가없음
		//System.out.println("userid:"+userid);
		
		//userid: java  , passwd:1234
		if(userid.equals("java")) {
			System.out.println("id일치");
			System.out.println("비밀번호를 입력하세요:");
			String passwd =scanner.nextLine();
			
			if(passwd.equals("1234")) {
				System.out.println("비밀번호 일치");
			}else {
				System.out.println("비밀번호를 확인 하세요.");
				
			}
			
			}else {
				System.out.println("아이디를 확인 하세요.");
			}
			
		}
					
	}


