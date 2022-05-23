package ddd;

import java.util.Arrays;

import javax.swing.text.AbstractDocument.BranchElement;

public class St {

	public static void main(String[] args) {
		String[] st = { "heart-", "spade-", "diamind-", "cluber-" };// 4개 배열 공간
		String[] str = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };// 13개 배열공간
		String[] asd = new String[52];// 52개의 배열공간

		String[] dr = new String[4];
		String[] ue = new String[4];

		int num = 0;// 모든배열의 저장공간
		int index = 0;

		for (int i = 0; i < str.length; i++) {// str 배열의 길이를 측정
			for (int j = 0; j < st.length; j++) {// st 배열의 길이를 측정
				String arr = st[j] + str[i];// st 배열 + str 배열 = arr
				asd[num] = arr;// num안에 arr을 넣음
				num++;// num을 +1씩

			}

		}
		for (int i = 0; i < 52; i++) {//52번 섞기
			int n = (int) (Math.random() * 52);

			String tmp = asd[i];// asd[i],asd[n],tmp 자리교환
			asd[i] = asd[n];
			asd[n] = tmp;
		}

//		두개의 배열에 첫번째 자리에 전체 카드중 랜덤으로 돌려 하나씩 넣는다
		dr[0] = asd[index];
		index++;
		
		ue[0] = asd[index];
		index++;

		dr[1] = asd[index];
		index++;
		
		ue[1] = asd[index];
		index++;

		String[] array = (asd[index].split(""));
		System.out.println(array[array.length - 1]);
		
		int num12 = 0;
		switch (array[array.length - 1]) {
		case "J":case "Q":case "K":case "0":
			num12 = 10;
			break;
		case "A":
			num12 = 1;
			break;
		case "2":
			num12 = 2;
			break;
		case "3":
			num12 = 3;
			break;
		case "4":
			num12 = 4;
			break;
		case "5":
			num12 = 5;
			break;
		case "6":
			num12 = 6;
			break;
		case "7":
			num12 = 7;
			break;
		case "8":
			num12 = 8;
			break;
		case "9":
			num12 = 9;
			break;
		default:
			break;
		}
		
		
		System.out.println(num12);
		
		for(int i=0; i<2;i++) {
			
		}
	}
}
