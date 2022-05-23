package array;

public class EX01_Arrar {

	public static void main(String[] args) {
		//배열 초기화시 배열의 개수를 명시하지 않음 error
		//int [] studentId = new int[3] {101,102,103};
		
		int[] studentld = {101,102,103};
		
		System.out.println("studentld[0]"+studentld[0]);
		System.out.println("studentld[1]"+studentld[1]);
		
		int add = studentld[0] + studentld[1];
		System.out.println("add="+add);
		
		System.out.println("배열길이:"+studentld.length);
		
		//배열에 있는 모든 값 출력 하기
		//i<=0; 배열에는 =를 포함하면 밑에 있는 오류가뜸
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		//
		//for(int i=0;i<=3;i++) {}
		for(int i=0;i<3;i++) {
			System.out.println(studentld[i]);
		}
		System.out.println("===============================================");
		
		studentld[0] = studentld[0] + 100;
		studentld[1] = studentld[1] + 100;
		System.out.println("studentld[0]:" + studentld[0]);//studentld[0]:201
		System.out.println("studentld[1]:" + studentld[1]);//studentld[1]:202
	}

}
