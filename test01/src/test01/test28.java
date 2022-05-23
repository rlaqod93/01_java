package test01;

public class test28 {

	public static void main(String[] args) {
		int total = 0;//합계
		int i = 0;//증가
		
		for(i=0;true;i++) {
			total+=i;
			if(total>=100) {
				break;
			}
		}
		System.out.println("total: "+total);
		System.out.println("i: "+i);

	}

}
//total: 105
//i: 14