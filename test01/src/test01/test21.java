package test01;

import java.util.Scanner;

public class test21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요:");
		
		String id = sc.nextLine();
		
		if(id.equals("java")) {
			System.out.println("id일치");
			System.out.print("비밀번호를 입력하세요:");
			String pw = sc.nextLine();
			if(pw.equals("1234")) {
				System.out.println("비밀번호 일치");
			}else {
				System.out.println("비밀번호 불일치");
			}
		}else {
			System.out.println("id 불일치");
		}
	}

}
//아이디를 입력하세요:java
//id일치
//비밀번호를 입력하세요:1234
//비밀번호 일치