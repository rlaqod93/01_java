package ed01;

public class EX02_Swich01 {

	public static void main(String[] args) {
		int ranking = 3;
		char medalColor = ' ';
		
		switch(ranking) {
		case 1:
				medalColor = 'G';
				break;
		case 2:
				medalColor = 'S';
				break;
		case 3:
				medalColor = 'B';
				break;
		default:
				medalColor = ' ';
				break;
		}
		
		System.out.println("Ranking:"+ranking);
		System.out.println("MedalColor:"+medalColor);

	}

}
