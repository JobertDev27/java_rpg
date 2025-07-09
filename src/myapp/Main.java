package myapp;

import javax.swing.JFrame;

public class Main {
	public static void main(String args[]) {
		JFrame screen = new JFrame("Java RPG");
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen.setResizable(false);
		
		Panel gamePanel = new Panel();
		screen.add(gamePanel);
		
		screen.pack();
		
		screen.setVisible(true);
	}
}
