package com.pcwk.oop07Poly;

public class polyMain {

	public static void main(String[] args) {
		Lion lion = new Lion();//Lion인스턴스 생성
		ZooKeeper zooK = new ZooKeeper();
		
		zooK.feed(lion);
		
		zooK.feed(new Rabbit());
		
		zooK.feed(new Monkey());

	}

}
