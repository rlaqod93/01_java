package oop06.anonymous;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonyInnerMain02 {

	public static void main(String[] args) {
		Button button = new Button();
		
		button.addActionListener(new ActionListener() {
			//무명 inner class
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

	}

}
