package oop01;

public class StudentMain {

	public static void main(String[] args) {
		Student student=new Student();
		student.name = "이상무";
		student.studentId = 2012345;
		student.grade = 4;
		student.address = "서울시 마포구 서강로 136 아이비타워 2층";
				
		student.showStudentInfo();

	}

}
