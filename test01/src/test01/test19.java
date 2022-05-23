package test01;

public class test19 {

	public static void main(String[] args) {
		int score = 76;//점수
		char grade = ' ';//학점
		
		if(score >= 90) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println("당신의 점수는:"+score);
		System.out.println("당신의 학점은:"+grade);
	}

}
//당신의 점수는:76
//당신의 학점은:C