package com.pwck.array;

import java.util.Arrays;

public class EX05_Array {


	public static void main(String[] args) {
		//A~Z
		char[] alphabet=new char[26];//문자 배열
		//배열의 시작번지는 0 -> n-1
		char ch ='A';
		
		for(int i=0; i<alphabet.length;i++,ch++) {
			alphabet[i] = ch;
			System.out.println(i+","+ch);
		}
		System.out.println("======================");
		
		for(int i=0;i<alphabet.length;i++) {
			System.out.println((int)alphabet[i]+"="+alphabet[i]);
		}

	}

}
