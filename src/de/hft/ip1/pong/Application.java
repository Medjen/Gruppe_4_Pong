package de.hft.ip1.pong;

import javax.swing.JFrame;

public class Application {
	protected static final JFrame ROOTFRAME = new JFrame("Pong");
	public static void main(String[] args) {
		
		ROOTFRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ROOTFRAME.setLocation(600, 300);
		ROOTFRAME.setResizable(false);
		ROOTFRAME.setLayout(null);
		ROOTFRAME.setVisible(true);
		ROOTFRAME.setFocusable(true);
		ROOTFRAME.setFocusTraversalKeysEnabled(false);

		new MainMenu();
	}

}
