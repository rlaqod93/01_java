package test01;

public class CardMain {

	public static void main(String[] args) {
		System.out.println("Card.width:"+Card.width);
		System.out.println("Card.width:"+Card.hegiht);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 2;
		
		System.out.println("c1:"+c1.kind+","+c1.number);
		System.out.println("c1:"+c1.width+","+c1.hegiht);
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 7;
		
		System.out.println("c2:"+c2.kind+","+c2.number);
		System.out.println("c2:"+c2.width+","+c2.hegiht);
		
		c1.width = 88;
		c2.hegiht = 99;
		System.out.println("=======================");
		System.out.println("c1:"+c1.width+","+c1.hegiht);
		System.out.println("c2:"+c1.width+","+c2.hegiht);
	}

}
//Card.width:100
//Card.width:250
//c1:Heart,2
//c1:100,250
//c2:Spade,7
//c2:100,250
//=======================
//c1:88,99
//c2:88,99