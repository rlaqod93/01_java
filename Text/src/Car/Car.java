package Car;

import java.util.Scanner;

public class Car {


	public final static double INTEREST_RATE = 2.0;

	public static void main(String[] args) {
		// 차량고르기 G70,G80
		// 차량 고르고 옵션 고르기
		// 총금액 나오고 선입금+할부개월 쓰면 월 할부 금액 나오기

		// 차량 고르기
		Scanner sc = new Scanner(System.in);
		String g70 = "G70";
		int money = 0;
		int total = 0;
		int choice = 0;
		int g70vehicle = 41_100_000;
		int g70engine = 5_600_000;
		int awd = 2_500_000;
		int color1 = 0;
		int color2 = 0;
		int Appearance = 700_000;
		int guts = 900_000;
		int pack= 3_800_000;
		
		boolean flag = true;
		while(flag) {
			System.out.println("차량 견적내기 GENESIS");
			System.out.println("1.차량을 골라 주세요.");
			System.out.println("1.G70 차량가격 41.100.000원");
			choice = sc.nextInt();
			if (choice == 1) {
				total += g70vehicle;
				System.out.println(g70 + "선택하셨습니다.");
				flag = false;
			} else {
				
				System.out.println("잘못누르셨습니다.");
				
			}
		}

//-----------------------------------------------------------------------------
		System.out.println();
		
//		엔진
		System.out.println("2. 엔진옵션을 골라주세요");
		System.out.println("1.가솔린 2.0 터보+0원 2.가솔린 3.3터보+5.600.000원");
		
		switch (choice) {
		case 1:
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("1.가솔린 2.0 터보를 선택하셨습니다.");
			} else if (choice == 2) {
				total += g70engine;
				System.out.println("2.가솔린 3.3 터보를 선택하셨습니다.");
			} else {
				System.out.println("잘못누르셨습니다.");
				return;
			}
			
//-----------------------------------------------------------------------------
		System.out.println();
		
		//구동타입
		case 2:
			System.out.println("3. 구동타입을 골라주세요.");
			System.out.println("1.2WD(후륜) + 0원 2.AMD(4륜) + 2.500.000원");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("1.2WD(후륜)을 선택하셨습니다.");
			} else if (choice == 2) {
				total += awd;
				System.out.println("2.AWD(4륜)을 선택하셨습니다.");
			} else {
				System.out.println("잘못누르셨습니다.");
				return;
			}
			
//-----------------------------------------------------------------------------
		System.out.println();	
		
		//차량 외장 컬러
		//외장1
		case 3:
			System.out.println("4. 외장 디자인을 골라주세요.");
			System.out.println("1.글로시(유광) + 0원 , 2.매트(무광) + 700.000원");
			choice = sc.nextInt();
			if (choice==1) {
				System.out.println("1.글로시(유광)을 선택하셨습니다.");
				System.out.println("1.우유니 화이트 , 2.세빌 실버 , 3.마칼루 그레이 , 4.바크 블랙");
			color1 = sc.nextInt();
			}if(choice == 2) {
				
			}else if (color1 == 1) {
				System.out.println("1.유우니 화이트를 선택하셨습니다.");
			} else if (color1 == 2) {
				System.out.println("2.세빌 실버를 선택하셨습니다.");
			} else if (color1 == 3) {
				System.out.println("3.마칼루 그레이를 선택하셨습니다.");
			} else if (color1 == 4) {
				System.out.println("4.바크 블랙를 선택하셨습니다.");
			
			}else {
				System.out.println("잘못누르셨습니다.");
		
			}
		
		//외장2
		
			if(choice == 2) {
				total+=Appearance;
				System.out.println("2.매트(무광)을 선택하셨습니다");
				System.out.println("1.베리비에 화이트 , 2.본드 실버 , 3.마칼루 그레이");
				color2 = sc.nextInt();
			}if(color2==1) {
				System.out.println("1.베리비에 화이트를 선택하셨습니다.");
			}else if(color2==2) {
				System.out.println("2.본드 실버를 선택하셨습니다.");
			}else if(color2==3) {
				System.out.println("3.마칼루 그레이를 선택하셨습니다.");
			}else {
				
			}
			
				
			
//-----------------------------------------------------------------------------
			
		System.out.println();
		//내장디자인
		//내장1
		case 4:
			System.out.println("5. 내장 디자인을 골라주세요.");
			System.out.println("1.스탠다드 디자인 +0원 , 2.천연가죽 패키지 + 900.000원");
			choice = sc.nextInt();
			if(choice==1) {
				System.out.println("1.스탠다드 디자인을 선택하셨습니다.");
				System.out.println("1.옵시디언 블랙 모노톤 , 2.옵시디언 블랙/샌드스톰 그레이 투톤");
			color1 = sc.nextInt();
			}if(choice ==2) {
				
			}else if(color1 ==1) {
				System.out.println("1.옵시디언 블랙 모노톤을 선택하셨습니다.");
			}else if(color1 ==2) {
				System.out.println("2.옵시디언 블랙/샌드스톰 그레이 투톤을 선택하셨습니다.");
			}else {
				System.out.println("잘못누르셨습니다.");
		
			}
			
			
		//내장2
			if(choice ==2) {
			total+=guts;
			System.out.println("2.천연가죽 패기지를 선택하셨습니다.");
			System.out.println("1.옵시디언 블랙 모노톤 , 2.옵시디언 블랙/샌드스톰 그레이 투톤 "
					+ ", 3.옵시디언 블랙/벨벳 버건디 투톤");
			color2 = sc.nextInt();
			}if(color2 ==1) {
				System.out.println("1.옵시디언 블랙 모노톤을 선택하셨습니다.");
			}else if(color2 == 2) {
				System.out.println("2.옵시디언 블랙/샌드스톰 그레이 투톤을 선택하셨습니다.");
			}else if(color2 == 3) {
				System.out.println("3.옵시디언 블랙/벨벳 버건디 투톤을 선택하셨습니다.");
			}
			
			
			
//-----------------------------------------------------------------------------
			
		System.out.println();	
		//패키지
		case 5:
			System.out.println("5. 패키지를 선택해주세요.");
			System.out.println("1.파퓰러 패키지 + 3.800.000원 , 2.파퓰러 패키지 선택취소.");
			choice = sc.nextInt();
			if(choice==1) {
				 total+=pack;
				 System.out.println("파퓰러 패키지를 선택하셨습니다.");
				 System.out.println("1. 파풀러 패키지 상세페이지 가기 2.파퓰러 패키지 상세페이지 취소");
				 color1 = sc.nextInt();
			}if(choice ==2 ) {
				System.out.println("파퓰러 패키지를 취소하셨습니다.");
			}else if(color1 == 1) {
				System.out.println("파퓰러 패키지 상세페이지\n"
										+ "*헤드업 디스 플레이\n"
										+ "*하이테크 패키지\n"
										+ "*컴포트 패키지\n"
										+ "*컨비니언스 패키지 들어있습니다.");
			}else if(color1 ==2){
				System.out.println("상세페이지 취소");
			}else {
				System.out.println("잘못누르셨습니다.");
				
			}
			
		default:
			
//-----------------------------------------------------------------------------
		//이자율 2.0%
		double rate = INTEREST_RATE;
		System.out.println();
		
		//견전완료
			System.out.println("기본견적");
			System.out.println("총금액"+total+"원");
			
			
		int month = 0;
		System.out.println();
		System.out.println("선입금 금액");
		money = sc.nextInt();
		System.out.println();
		System.out.println("할부개월");
		month = sc.nextInt();
		System.out.println();
		System.out.println("할부 원"+(total-=money)+"원");
		System.out.println("월 납입금"+(total/month)+"원");
		System.out.println("이자율 : "+INTEREST_RATE+"%");
		
		}	
		//문제점 
		//1. 번호를 잘 못 적으면 바로 멈춤
		//2. 2종류가 있는 경우 잘못처도 다음 옵션으로 넘어감
		//3. 이자율이 고정되어 있음 - if eles
		//4. 아직 차량 2개를 못함
		//5. 하드코딩이 심함
		//6. 실력의 벽을 만남
		
	}
}