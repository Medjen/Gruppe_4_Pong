package de.hft.ip1.pong;

import javax.swing.JFrame;

public class Application {
	/** Attributes */
	/**
	 * name of programs configuration files base folder<br />
	 * So if you want to write some files onto the disk, please do it all in a
	 * central place like this.
	 */
	protected static final String BASEFOLDER = System.getProperty("user.home") + "/.ip1ws1920/group_4";

	/**
	 * Root JFrame into which we put our JComponents we want to show.
	 */
	protected static final JFrame ROOTFRAME = new JFrame("Pong");

	/**
	 * Operation main
	 *
	 * @param args - CLI arguments
	 */
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
