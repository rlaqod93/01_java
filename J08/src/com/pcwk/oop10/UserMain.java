package com.pcwk.oop10;

public class UserMain {

	public static void main(String[] args) {
		User user01 = new User("영희", 7);
		User user02 = new User("철수", 9);

		System.out.println("user01:" + user01.getName() + "," + user01.getAge());
		System.out.println("user02:" + user02.getName() + "," + user02.getAge());

		User uesr03 = new User("성기훈", 45);
		uesr03.setAge(46);

		System.out.println("user03:" + uesr03.getName() + "," + uesr03.getAge());

	}

}
