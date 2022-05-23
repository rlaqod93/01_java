package test01;

public class test22 {

	public static void main(String[] args) {
		int rank = 2;
		char medalColor = ' ';
		
		switch (rank) {
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
		System.out.println("당신의 랭크는:"+rank);
		System.out.println("당신의 메달은:"+medalColor);
	}

}
//당신의 랭크는:2
//당신의 메달은:S