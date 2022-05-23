package com.pcwk.oop03;

public class InheritanceMain {

	public static void main(String[] args) {
		Student student = new Student();//학생 인스턴스생성
		student.breath();//person의 breath()메서드 호출
		student.learn();
		
		System.out.println("=======================");
		
		Teacher teacher =new Teacher();
		teacher.est();//person의 est()메서드 호출
		teacher.teach();
		
	}

}
