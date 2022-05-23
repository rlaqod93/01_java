package test01;

public class test31 {

	public static void main(String[] args) {
		//배열 초기화시 배열의 개수를 명시하지 않음 error
		//int[] studentld = new int[3] {101,102,103};
		
		int[] studentld = {101,102,103};
		
		System.out.println("studentld[0]:"+studentld[0]);//studentld[0]:101
		System.out.println("studentld[1]:"+studentld[1]);//studentld[1]:102
		
		int add = studentld[0] + studentld[1];
		System.out.println("add:"+add);//add:203
		
		System.out.println("배열의 길이:"+studentld.length);//배열의 길이:3

		for(int i=0;i<3;i++) {
			System.out.println(studentld[i]);
			//101,102,103
		}
		
		studentld[0] = studentld[0] + 100;
		studentld[1] = studentld[1] + 100;
		System.out.println("student[0]:"+studentld[0]);//student[0]:201
		System.out.println("student[1]:"+studentld[1]);//student[1]:202
	}

}