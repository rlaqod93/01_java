package ams;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AmsMain {

	public static void main(String[] args) {

		ImageIcon img = new ImageIcon("src/img/main.gif");
		// 절대 경로 : 내 위치가 어디든지 찾아갈 수 있는 경로
		// 상대 경로 : 내 위치에 따라서 변경되는 경로
		String[] menu = { "추가하기", "검색하기", "수정하기", "삭제하기", "목록보기" };
		int choice = 0;
		while (true) {
			choice = JOptionPane.showOptionDialog(null, "AMS 테스트", "AMS", 
													JOptionPane.DEFAULT_OPTION,
													JOptionPane.PLAIN_MESSAGE,
													img,menu,null);
			
			if (choice == -1)
				break;

			switch (choice) {
			//추가하기 영역
			case 0:
				
				break;
			//검색하기 영역
			case 1:
				
				break;
			//수정하기 영역
			case 2:
				
				break;
			//삭제하기 영역
			case 3:
				
				break;
			//목록보기 영역
			case 4:
				
				break;
			}
		}
	}
}
