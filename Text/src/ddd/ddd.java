package ddd;
import java.util.*;
public class ddd {
	
	public static void main(String[] args) {
		String[] pattern = {"◆","♥","♠","♣"};
		String[] number = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		//String 배열에 변수명 선언 하고 그안에 값을 넣어줌
		String[] sum = new String[52];
	
		int num=0;
		
		for(int i=0;i<pattern.length;i++) {
			for(int j=0;j<number.length;j++) {
				String deck = pattern[i]+number[j];
				sum[num]=deck;
				num++;
//				System.out.println(deck);
			}
		}
		
		for(int i=0;i<=52;i++) {
			int ran = (int)(Math.random()*52);
			String tmp = sum[0];
			sum[0] = sum[ran];
			sum[ran] = tmp;
			System.out.print(" "+sum[0]);
		}
	}
}
// String배열의 배열명은 pattern  배열안에 4개의 값을 넣음
// String배열의 배열명은 number  배열안에 A2345678910JQK값을 넣음
// String배열의 배멸명은 sum 배열안에 52개의 공간을 만듬
// int타입 배열명은 num을 초기화해줌
// 반복문인 for문을 사용해 pattern길이를 값을 구하고
// 2번재 반복문인 for문에서 number길이의 값을 구함
// String 문자열에 변수명을 deck으로 주고 그안에 patten배열 + number배열을 넣어줌
// sum배열안에 num방을 만들어주고 deck을 대입해줌
// num에 값이 0이여서 num++로 1씩올려줌으로써 pattern배열과number배열을 더한 값에서 1씩올려서 출력됨
//
//for반복문을 사용해 카드 2장만뽑기
//int 변수명ran을 랜덤으로 초기화해줌
//String tmp만들어서 sum[i] sum[ran] 세개를 섞어줌
//출력