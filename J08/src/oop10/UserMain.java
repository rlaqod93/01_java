package oop10;

public class UserMain {

	public static void main(String[] args) {
		User user01 = new User("영희",7);
		User user02 = new User("철수", 9);
		
		System.out.println("user01:"+user01.name+","+user01.age);
		System.out.println("user02:"+user02.name+","+user02.age);
		
		User user03 = new User("성기훈", 45);
		user03.setAge(45);
		
		System.out.println("user03:" + user03.getName()+ "," + user03.getAge());
	}

}
