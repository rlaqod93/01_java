package com.pcwk.ed01;

public class EX05_switch04 {

	public static void main(String[] args) {
		String madal = "Bronze";
		madal = madal.toUpperCase();//모두 대문자로 변환
		
		System.out.println("madal:"+madal);
		
		switch(madal){
		case"GOLD":
			System.out.println("금메달 입니다.");
			break;
			
		case"SILVER":
			System.out.println("은메달 입니다.");
			break;
			
		case"BRONZE":
			System.out.println("동메달 입니다.");
			break;
		default:
			System.out.println("No메달 입니다.");
			break;
		}

	}

}
