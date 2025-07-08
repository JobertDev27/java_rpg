package myapp;

import javax.swing.*;

public class Frame {
	public Frame() {
		JFrame frame = new JFrame("Rock Paper Scissors");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
}
