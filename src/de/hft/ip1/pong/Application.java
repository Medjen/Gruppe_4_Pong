package de.hft.ip1.pong;

import static de.hft.ip1.pong.Application.BASEFOLDER;

import java.io.File;
import java.io.IOException;

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

		File dir = new File(BASEFOLDER);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(BASEFOLDER + "/highscores.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		ROOTFRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ROOTFRAME.setLocation(600, 300);
		ROOTFRAME.setResizable(false);
		ROOTFRAME.setLayout(null);
		ROOTFRAME.setVisible(true);
		ROOTFRAME.setFocusable(true);
		ROOTFRAME.setFocusTraversalKeysEnabled(false);

		new MainMenu();
		new Musik("src/music/background2.wav");
	
	}

}
